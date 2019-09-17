package zxl.com.springbootatomikosjtadruid2.entity;

import java.lang.String;
import java.lang.Integer;

public class User {
    private Integer userId;
    private String userName;
    private String userWork;
    private String userTel;
    private Integer userAge;
    private String userSex;
    private String userEmail;
    private String userDesc;

    public User(){
    }

    public User(Integer userId, String userName, String userWork, String userTel, Integer userAge, String userSex, String userEmail, String userDesc){
        this.userId=userId;
        this.userName=userName;
        this.userWork=userWork;
        this.userTel=userTel;
        this.userAge=userAge;
        this.userSex=userSex;
        this.userEmail=userEmail;
        this.userDesc=userDesc;
    }

    public Integer getUserId(){
        return this.userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }
    
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getUserWork(){
        return this.userWork;
    }
    public void setUserWork(String userWork){
        this.userWork = userWork;
    }
    
    public String getUserTel(){
        return this.userTel;
    }
    public void setUserTel(String userTel){
        this.userTel = userTel;
    }
    
    public Integer getUserAge(){
        return this.userAge;
    }
    public void setUserAge(Integer userAge){
        this.userAge = userAge;
    }
    
    public String getUserSex(){
        return this.userSex;
    }
    public void setUserSex(String userSex){
        this.userSex = userSex;
    }
    
    public String getUserEmail(){
        return this.userEmail;
    }
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
    
    public String getUserDesc(){
        return this.userDesc;
    }
    public void setUserDesc(String userDesc){
        this.userDesc = userDesc;
    }
    

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", userWork=" + userWork +
                ", userTel=" + userTel +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                ", userEmail=" + userEmail +
                ", userDesc=" + userDesc +
                '}';
    }

}
