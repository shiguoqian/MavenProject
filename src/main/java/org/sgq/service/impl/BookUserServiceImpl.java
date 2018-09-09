package org.sgq.service.impl;

import org.sgq.bean.BookUser;
import org.sgq.dao.IBookUserDao;
import org.sgq.service.IBookUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iBookUserService")
public class BookUserServiceImpl implements IBookUserService {
    @Autowired
    IBookUserDao iBookUserDao;


    @Override
    public boolean bookUserLogin(BookUser bookUser) {
        BookUser bookUser1 = iBookUserDao.getBookUserByName(bookUser.getName());
        System.out.println(bookUser+"--"+bookUser1);
        if (bookUser1!=null){
            System.out.println(bookUser+"--"+bookUser1);
            if (bookUser1.getPassword().equals(bookUser.getPassword())){//密码相同
                return true;//能登录
            }
        }
        return false;
    }

    @Override
    public BookUser getUserByName(String bookUserName) {
        return iBookUserDao.getBookUserByName(bookUserName);
    }
}
