package qy.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexApi {

    @GetMapping("/index")
    public String index(){
        return "index.html";
    }

}
