package org.sgq.dao;

import org.sgq.bean.Book;

import java.util.List;

public interface IBookDao {
    /**
     * 获取全部图书
     * @return
     */
    public List<Book> getBooks();

    /**
     * 添加图书
     * @param book
     * @return
     */
    public int addBook(Book book);

    /**
     * 修改图书
     * @param book
     * @return
     */
    public int modifyBook(Book book);

    /**
     * 删除图书
     * @param id
     * @return
     */
    public int deleteBook(int id);
}
