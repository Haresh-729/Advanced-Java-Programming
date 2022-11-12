package com.mycompany.employeebeans;
import java.io.*;

public class EmployeeBeans implements Serializable{
    
    private String fName;
    private String lName;
    private String post;
    
    public EmployeeBeans(){
        this.fName=null;
        this.lName=null;
        this.post=null;
    }
    public String getFname(){
        return fName;
    }
    public void setFname(String name){
        this.fName=name;
    }
    public void setLname(String last){
        this.lName=last;
    }
    public String getLname(){
        return lName;
    }
    public void setPost(String post){
        this.post=post;
    }
    public String getPost(){
        return post;
    }
}
