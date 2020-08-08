package com.demo.bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

public class Message implements Serializable {
    private int count;
    private float voltage;
    private int id;
    private String nodeFlag;
    private int nodeStatus;
    private String nodeLastTime;//时间
    private float nodeLastAttr2;
    private String nodeIp;
    private String nserBedno;
    private String userRealname;
    private String userAge;
    private String userGender;
    private String userExtdata;
    private int delflag;
    private boolean cmpIsOnline;

    public Message(int count, float voltage, int id, String nodeFlag, int nodeStatus, String nodeLastTime, float nodeLastAttr2, String nodeIp, String nserBedno, String userRealname, String userAge, String userGender, String userExtdata, int delflag, boolean cmpIsOnline) {
        this.count = count;
        this.voltage = voltage;
        this.id = id;
        this.nodeFlag = nodeFlag;
        this.nodeStatus = nodeStatus;
        this.nodeLastTime = nodeLastTime;
        this.nodeLastAttr2 = nodeLastAttr2;
        this.nodeIp = nodeIp;
        this.nserBedno = nserBedno;
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

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public int getCount() {
        return count;
    }

    public float getVoltage() {
        return voltage;
    }

    @Override
    public String toString() {
        return "Message{" +
                "count=" + count +
                ", id=" + id +
                ", nodeFlag='" + nodeFlag + '\'' +
                ", nodeStatus=" + nodeStatus +
                ", nodeLastTime='" + nodeLastTime + '\'' +
                ", nodeLastAttr2=" + nodeLastAttr2 +
                ", nodeIp='" + nodeIp + '\'' +
                ", nserBedno='" + nserBedno + '\'' +
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

    public void setNodeLastTime(String nodeLastTime) {
        this.nodeLastTime = nodeLastTime;
    }

    public void setNodeLastAttr2(float nodeLastAttr2) {
        this.nodeLastAttr2 = nodeLastAttr2;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public void setNserBedno(String nserBedno) {
        this.nserBedno = nserBedno;
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

    public void setDelflag(int delflag) {
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

    public String getNodeLastTime() {
        return nodeLastTime;
    }

    public float getNodeLastAttr2() {
        return nodeLastAttr2;
    }

    public String getNodeIp() {
        return nodeIp;
    }

    public String getNserBedno() {
        return nserBedno;
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

    public int getDelflag() {
        return delflag;
    }

    public boolean isCmpIsOnline() {
        return cmpIsOnline;
    }
}
