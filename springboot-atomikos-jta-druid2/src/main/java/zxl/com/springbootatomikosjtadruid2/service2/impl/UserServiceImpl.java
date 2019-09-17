package zxl.com.springbootatomikosjtadruid2.service2.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zxl.com.springbootatomikosjtadruid2.entity.User;
import zxl.com.springbootatomikosjtadruid2.mapper2.UserMapper;
import zxl.com.springbootatomikosjtadruid2.service2.IUserService;

import javax.transaction.Transactional;
import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public int insertLog(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> getUser() {
        return userMapper.selectAll();
    }
}
