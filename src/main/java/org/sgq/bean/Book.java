package org.sgq.bean;

import java.util.Date;

public class Book {
    private int id;//图书id
    private String name;//图书名
    private String author;//图书作者
    private String publish;//出版社
    private Date publishdate;//出版日期
    private int page;//页数
    private int price;//价格
    private String content;//内容摘要

    public Book() {
    }

    public Book(int id, String name, String author, String publish, Date publishdate, int page, int price, String content) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.publishdate = publishdate;
        this.page = page;
        this.price = price;
        this.content = content;
    }

    public Book(String name, String author, String publish, Date publishdate, int page, int price, String content) {
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.publishdate = publishdate;
        this.page = page;
        this.price = price;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", publishdate=" + publishdate +
                ", page=" + page +
                ", price=" + price +
                ", content='" + content + '\'' +
                '}';
    }
}
