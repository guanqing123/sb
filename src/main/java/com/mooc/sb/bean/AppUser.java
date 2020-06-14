package com.mooc.sb.bean;

import java.util.Date;

public class AppUser {
    private String userid;

    private String username;

    private String password;

    private String phone;

    private String email;

    private String nickname;

    private String avatarurl;

    private String gender;

    private Date createdate;

    private Date updatedate;

    private Integer loginsource;

    private String wechat;

    private String tecent;

    private Date lastlogintime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Integer getLoginsource() {
        return loginsource;
    }

    public void setLoginsource(Integer loginsource) {
        this.loginsource = loginsource;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getTecent() {
        return tecent;
    }

    public void setTecent(String tecent) {
        this.tecent = tecent == null ? null : tecent.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatarurl='" + avatarurl + '\'' +
                ", gender='" + gender + '\'' +
                ", createdate=" + createdate +
                ", updatedate=" + updatedate +
                ", loginsource=" + loginsource +
                ", wechat='" + wechat + '\'' +
                ", tecent='" + tecent + '\'' +
                ", lastlogintime=" + lastlogintime +
                '}';
    }
}