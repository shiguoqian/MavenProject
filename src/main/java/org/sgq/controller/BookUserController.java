package org.sgq.controller;

import org.sgq.bean.BookUser;
import org.sgq.service.IBookUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("bookUser")
public class BookUserController {
    @Autowired
    IBookUserService iBookUserService;

    @RequestMapping(value="login",method = RequestMethod.POST)
    public ModelAndView userLogin(@RequestParam String bookUserName,@RequestParam String bookUserPass, HttpServletResponse response){
        System.out.println("进入");
        ModelAndView modelAndView = null;
        System.out.println(bookUserName+"--"+bookUserPass);
        if (iBookUserService.bookUserLogin(new BookUser(bookUserName,bookUserPass))){//可以登录
            Cookie bookUserNameCookie = new Cookie("bookUserName",bookUserName);
            Cookie bookUserPassCookie = new Cookie("bookUserPass",bookUserPass);
            if(iBookUserService.getUserByName(bookUserName).getUsertype()==1){//图书管理员
                modelAndView = new ModelAndView("manageBooks");
                modelAndView.addObject("bookUserType","图书管理员");
            }
            else{
                modelAndView = new ModelAndView("showBooks");
                modelAndView.addObject("bookUserType","用户");
            }
            bookUserNameCookie.setPath("/");
            bookUserPassCookie.setPath("/");
            response.addCookie(bookUserNameCookie);
            response.addCookie(bookUserPassCookie);
        }else{
            modelAndView = new ModelAndView("index");
            modelAndView.addObject("error","用户名或者密码错误！");
        }
//        if (iBookUserService.bookUserLogin(bookUser)){//可以登录
//            modelAndView = new ModelAndView("showBooks");
//            Cookie bookUserNameCookie = new Cookie("bookUserName",bookUser.getName());
//            Cookie bookUserPassCookie = new Cookie("bookUserPass",bookUser.getPassword());
//            if(iBookUserService.getBookUserByName(bookUser.getName()).getUsertype()==1){//图书管理员
//                modelAndView.addObject("bookUserType","图书管理员欢迎您！");
//            }
//            else{
//                modelAndView.addObject("bookUserType","用户欢迎您！");
//            }
//            bookUserNameCookie.setPath("/");
//            bookUserPassCookie.setPath("/");
//            response.addCookie(bookUserNameCookie);
//            response.addCookie(bookUserPassCookie);
//        }else{
//            modelAndView = new ModelAndView("index");
//            modelAndView.addObject("error","用户名或者密码错误!");
//        }
        return modelAndView;
    }
}
