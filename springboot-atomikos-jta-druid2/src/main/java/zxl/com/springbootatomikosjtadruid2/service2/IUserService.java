package zxl.com.springbootatomikosjtadruid2.service2;

import zxl.com.springbootatomikosjtadruid2.entity.User;

import java.util.List;

public interface IUserService {
    int insertLog(User user);
    List<User> getUser();
}
