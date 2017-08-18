package com.vows.web.test;

import org.springframework.stereotype.Controller;

/**
 * Created by jazzy-zhao on 2017/8/18.
 */
@Controller
public class WelcomeController {
    @RequestMapping(value="welcome")
    public String welcome(){
        return "welcome";
    }
}
