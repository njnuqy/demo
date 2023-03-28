package qy.demo.DAO;

import org.apache.ibatis.annotations.Mapper;
import qy.demo.dataobject.UserDo;

@Mapper
public interface UserDAO {

    int insert(UserDo userDo);

}
