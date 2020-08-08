package com.demo.bean;

import java.io.Serializable;

public class User implements Serializable {
    private int count;
    private int id;
    private String nodeFlag;
    private int nodeStatus;
    private int nodeLastTime;
    private float nodeLastAttr2;
    private String nodeIp;
    private String userBedno;
    private String userRealname;
    private String userAge;
    private String userGender;
    private String userExtdata;
    private Integer delflag;
    private boolean cmpIsOnline;

    public User(int count, int id, String nodeFlag, int nodeStatus, int nodeLastTime, float nodeLastAttr2, String nodeIp, String userBedno, String userRealname, String userAge, String userGender, String userExtdata, Integer delflag, boolean cmpIsOnline) {
        this.count = count;
        this.id = id;
        this.nodeFlag = nodeFlag;
        this.nodeStatus = nodeStatus;
        this.nodeLastTime = nodeLastTime;
        this.nodeLastAttr2 = nodeLastAttr2;
        this.nodeIp = nodeIp;
        this.userBedno = userBedno;
        this.userRealname = userRealname;
        this.userAge = userAge;
        this.userGender = userGender;
        this.userExtdata = userExtdata;
        this.delflag = delflag;
        this.cmpIsOnline = cmpIsOnline;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nodeFlag='" + nodeFlag + '\'' +
                ", nodeStatus=" + nodeStatus +
                ", nodeLastTime=" + nodeLastTime +
                ", nodeLastAttr2='" + nodeLastAttr2 + '\'' +
                ", nodeIp='" + nodeIp + '\'' +
                ", userBedno='" + userBedno + '\'' +
                ", userRealname='" + userRealname + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userExtdata='" + userExtdata + '\'' +
                ", delflag=" + delflag +
                ", cmpIsOnline=" + cmpIsOnline +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNodeFlag(String nodeFlag) {
        this.nodeFlag = nodeFlag;
    }

    public void setNodeStatus(int nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public void setNodeLastTime(int nodeLastTime) {
        this.nodeLastTime = nodeLastTime;
    }

    public void setNodeLastAttr2(float nodeLastAttr2) {
        this.nodeLastAttr2 = nodeLastAttr2;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public void setUserBedno(String userBedno) {
        this.userBedno = userBedno;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public void setUserExtdata(String userExtdata) {
        this.userExtdata = userExtdata;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    public void setCmpIsOnline(boolean cmpIsOnline) {
        this.cmpIsOnline = cmpIsOnline;
    }

    public int getId() {
        return id;
    }

    public String getNodeFlag() {
        return nodeFlag;
    }

    public int getNodeStatus() {
        return nodeStatus;
    }

    public int getNodeLastTime() {
        return nodeLastTime;
    }

    public float getNodeLastAttr2() {
        return nodeLastAttr2;
    }

    public String getNodeIp() {
        return nodeIp;
    }

    public String getUserBedno() {
        return userBedno;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public String getUserAge() {
        return userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserExtdata() {
        return userExtdata;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public boolean isCmpIsOnline() {
        return cmpIsOnline;
    }
}
