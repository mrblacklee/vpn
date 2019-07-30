package com.jorchi.elevator;

public class Test{
    public Test(String s,String s2){
        this.setName(s);
        this.setPwd(s2);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String pwd;
}