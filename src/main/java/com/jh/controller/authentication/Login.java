package com.jh.controller.authentication;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jahangiralamdiu on 1/17/15.
 */
public class Login {


    @RequestMapping("/test")
    public String login()
    {
        String message = "Hi I am here";
        return "";
    }
}
