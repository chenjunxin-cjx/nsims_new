package com.olocat.controller;

import com.olocat.pojo.User;
import com.olocat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "";
    }

}
