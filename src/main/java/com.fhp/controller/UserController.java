package com.fhp.controller;


import com.fhp.model.User;
import com.fhp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/select")
    public ModelAndView selectUser(){
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        mv.addObject("user",user);
        mv.setViewName("user");
        return mv;
    }

}
