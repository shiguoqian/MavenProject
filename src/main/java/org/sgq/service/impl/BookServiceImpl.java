package org.sgq.service.impl;

import org.sgq.bean.Book;
import org.sgq.dao.IBookDao;
import org.sgq.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iBookService")
public class BookServiceImpl implements IBookService {
    @Autowired
    IBookDao iBookDao;

    @Override
    public List<Book> getBooks() {
        return iBookDao.getBooks();
    }

    @Override
    public boolean addBook(Book book) {
        if (iBookDao.addBook(book)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyBook(Book book) {
        if (iBookDao.modifyBook(book)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(int id){
        if (iBookDao.deleteBook(id)>0)
            return true;
        return false;
    }
}
