package qy.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qy.demo.DAO.UserDAO;
import qy.demo.dataobject.UserDo;
import qy.demo.model.Result;
import qy.demo.model.User;
import qy.demo.service.UserService;

@Controller
public class SignUpControl {
    @Autowired
    private UserService userService;

    @GetMapping("reg")
    public String register(){
        return "signup";
    }

    @PostMapping("/submit")
    @ResponseBody
    public Result<User> signUp(@RequestParam("userName")String userName,@RequestParam("password")String password){
        return userService.insert(userName,password);
    }
}
