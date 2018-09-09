package org.sgq.service;

import org.sgq.bean.Book;

import java.util.List;

public interface IBookService {
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
    public boolean addBook(Book book);

    /**
     * 修改图书
     * @param book
     * @return
     */
    public boolean modifyBook(Book book);

    /**
     * 删除图书
     * @param id
     * @return
     */
    public boolean deleteBook(int id);
}
