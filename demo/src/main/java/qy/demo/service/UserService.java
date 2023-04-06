package qy.demo.service;

import qy.demo.model.Result;
import qy.demo.model.User;

public interface UserService {
    public Result<User> insert(String userName, String password);
}
