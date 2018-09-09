package org.sgq.service;

import org.sgq.bean.BookUser;

public interface IBookUserService {
    /**
     * 判断用户是否能登录
     * @param bookUser
     * @return
     */
    public boolean bookUserLogin(BookUser bookUser);

    /**
     * 根据姓名获取用户
     * @param bookUserName
     * @return
     */
    public BookUser getUserByName(String bookUserName);
}
