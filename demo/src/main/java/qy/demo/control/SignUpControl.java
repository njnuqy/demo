package qy.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import qy.demo.service.UserService;

@Controller
public class SignUpControl {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register")
    public String signUp(String userName,String password){
        return "signup.html";
    }
}
