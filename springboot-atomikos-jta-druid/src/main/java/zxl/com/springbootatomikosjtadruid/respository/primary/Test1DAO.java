package zxl.com.springbootatomikosjtadruid.respository.primary;

import org.springframework.stereotype.Repository;
import zxl.com.springbootatomikosjtadruid.entity.TUser;

@Repository
public interface Test1DAO {
    TUser getById(int id);

    int add(TUser t);
}
