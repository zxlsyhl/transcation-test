package zxl.com.springbootatomikosjtadruid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zxl.com.springbootatomikosjtadruid.respository.primary.Test1DAO;

@Service
@Transactional
public class Test1Service {
    @Autowired
    private Test1DAO test1DAO;

}
