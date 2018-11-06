package org.monkey.ums.bean;

/**
 * @Author: Monkey
 * @Date: Create in 2018/10/24 22:38
 * @Description:
 */
public class User {
    /** user id */
    private Integer id;
    /** user name */
    private String userName;
    /** 真是姓名 */
    private String trueName;
    /** 密码 */
    private String password;
    /** 记录状态 */
    private char status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }


}
