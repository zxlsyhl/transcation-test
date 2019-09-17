package zxl.com.springbootatomikosjtadruid.entity;

public class TUser {
  private int userId;
  private String userName;//`user_name` varchar(30) COLLATE utf8mb4_bin NOT NULL,
  private String userWork;//`user_work` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  private String userTel;//`user_tel` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  private int userAge;//`user_age` int(11) DEFAULT NULL,
  private String userSex;//`user_sex` varchar(10) COLLATE utf8mb4_bin DEFAULT NULL,
  private String userEmail;//`user_email` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  private String userDesc;//`user_desc` varchar(2000) COLLATE utf8mb4_bin DEFAULT NULL,

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserWork() {
        return userWork;
    }

    public void setUserWork(String userWork) {
        this.userWork = userWork;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}
