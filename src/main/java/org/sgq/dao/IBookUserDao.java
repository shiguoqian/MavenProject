package org.sgq.dao;

import org.sgq.bean.BookUser;

public interface IBookUserDao {
    /**
     * 根据姓名获取用户
     * @param bookUserName
     * @return
     */
    public BookUser getBookUserByName(String bookUserName);
}
