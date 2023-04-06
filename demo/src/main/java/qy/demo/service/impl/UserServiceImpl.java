package qy.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qy.demo.DAO.UserDAO;
import qy.demo.dataobject.UserDo;
import qy.demo.model.Result;
import qy.demo.model.User;
import qy.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;


    @Override
    public Result<User> insert(String userName, String password) {
        Result<User> result = new Result<>();
        UserDo userDo = new UserDo();
        userDo.setUserName(userName);
        userDo.setPassword(password);
        userDAO.insert(userDo);
        result.setSuccess(true);
        result.setData(userDo.toModel());
        return result;
    }
}
