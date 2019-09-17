package zxl.com.springbootatomikosjtadruid2.entity;

import java.lang.String;
import java.lang.Integer;

public class Log {
    private Integer logId;
    private String logName;
    private Integer userId;
    private String logDesc;

    public Log(){
    }

    public Log(Integer logId, String logName, Integer userId, String logDesc){
        this.logId=logId;
        this.logName=logName;
        this.userId=userId;
        this.logDesc=logDesc;
    }

    public Integer getLogId(){
        return this.logId;
    }
    public void setLogId(Integer logId){
        this.logId = logId;
    }
    
    public String getLogName(){
        return this.logName;
    }
    public void setLogName(String logName){
        this.logName = logName;
    }
    
    public Integer getUserId(){
        return this.userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }
    
    public String getLogDesc(){
        return this.logDesc;
    }
    public void setLogDesc(String logDesc){
        this.logDesc = logDesc;
    }
    

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", logName=" + logName +
                ", userId=" + userId +
                ", logDesc=" + logDesc +
                '}';
    }

}
