package zxl.com.springbootatomikosjtadruid.respository.secondary;

import org.springframework.stereotype.Repository;
import zxl.com.springbootatomikosjtadruid.entity.TUser;

@Repository
public interface Test2DAO {
    TUser getById(int id);
    int add(TUser t);
}
