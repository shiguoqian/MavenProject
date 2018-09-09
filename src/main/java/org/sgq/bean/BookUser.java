package org.sgq.bean;

public class BookUser {
    private int id;//用户id
    private String name;//用户名
    private String password;//用户密码
    private int age;//年龄
    private int sex;//性别
    private String nickname;//昵称
    private int usertype;//用户类型

    public BookUser() {
    }

    public BookUser(String name, String password, int age, int sex, String nickname, int usertype) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.nickname = nickname;
        this.usertype = usertype;
    }

    public BookUser(String name, String password) {
        this.name = name;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "BookUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", nickname='" + nickname + '\'' +
                ", usertype=" + usertype +
                '}';
    }
}
