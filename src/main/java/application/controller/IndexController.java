package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/flyway")
public class IndexController {
    
    @GetMapping
    @ResponseBody
    public String get(){
        return "";
    }
    
}
