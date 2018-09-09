package org.sgq.controller;

import org.sgq.bean.Book;
import org.sgq.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    IBookService iBookService;

    @ResponseBody
    @RequestMapping("show")
    public List<Book> showBooks(){
        ModelAndView modelAndView = new ModelAndView("showBooks");
        System.out.println(iBookService.getBooks());
        return iBookService.getBooks();
    }

    @RequestMapping("add")
    public ModelAndView addBook(@RequestParam("bookName") String bookName, @RequestParam("bookAuthor") String bookAuthor, @RequestParam("publish") String publish, @RequestParam("publishdate") String publishdate,@RequestParam("page") int page,@RequestParam("price") int price,@RequestParam("content") String content){
        ModelAndView modelAndView = new ModelAndView("manageBooks");
        DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = fmt.parse(publishdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (iBookService.addBook(new Book(bookName,bookAuthor,publish,date,page,price,content))){
            modelAndView.addObject("prompt","添加成功");
        }else{
            modelAndView.addObject("prompt","添加失败");
        }
        return modelAndView;
    }
    @RequestMapping("modify")
    public ModelAndView modifyBook(@RequestParam("id") int id,@RequestParam("bookName") String bookName, @RequestParam("bookAuthor") String bookAuthor, @RequestParam("publish") String publish, @RequestParam("publishdate") String publishdate,@RequestParam("page") int page,@RequestParam("price") int price,@RequestParam("content") String content){
        System.out.println("修改controller");
        System.out.println(id+bookName+bookAuthor+publish+publishdate+page+price+content);
        ModelAndView modelAndView = new ModelAndView("manageBooks");
        DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = fmt.parse(publishdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (iBookService.modifyBook(new Book(id,bookName,bookAuthor,publish,date,page,price,content))){
            System.out.println("修改成功");
            modelAndView.addObject("prompt","修改成功");
        }else{
            modelAndView.addObject("prompt","修改失败");
        }
        return modelAndView;
    }
    @RequestMapping("delete")
    public ModelAndView modifyBook(@RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("manageBooks");
        if (iBookService.deleteBook(id)){
            modelAndView.addObject("prompt","删除成功");
        }else{
            modelAndView.addObject("prompt","删除失败");
        }
        return modelAndView;
    }
}
