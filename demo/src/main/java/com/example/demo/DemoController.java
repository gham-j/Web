package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;


//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @GetMapping("/")
//    @ResponseBody
    public String main() {
        return "index";
    }

//    @RequestMapping("/")
//    public String main(){
//        return "index";
//    }

}