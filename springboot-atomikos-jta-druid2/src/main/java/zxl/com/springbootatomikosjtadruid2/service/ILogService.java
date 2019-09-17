package zxl.com.springbootatomikosjtadruid2.service;

import zxl.com.springbootatomikosjtadruid2.entity.Log;

import java.util.List;

public interface ILogService {
    int insertLog(Log log);
    List<Log> getList();
}
