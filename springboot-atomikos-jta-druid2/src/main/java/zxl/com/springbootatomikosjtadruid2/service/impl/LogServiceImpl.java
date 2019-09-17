package zxl.com.springbootatomikosjtadruid2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zxl.com.springbootatomikosjtadruid2.entity.Log;
import zxl.com.springbootatomikosjtadruid2.mapper.LogMapper;
import zxl.com.springbootatomikosjtadruid2.service.ILogService;

import javax.transaction.Transactional;
import java.util.List;

@Service("logServiceImpl")
public class LogServiceImpl implements ILogService {
    @Autowired
    private LogMapper logMapper;

    @Transactional
    @Override
    public int insertLog(Log log) {
        return logMapper.insert(log);
    }

    @Override
    public List<Log> getList() {
        return logMapper.selectAll();
    }
}
