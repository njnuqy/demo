package qy.demo.api;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexApi {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
