package com.chandlerpuckett.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @GetMapping("/")                            // in js: app.get("/)
    public String showHome () {
        return "index";                          // filename for thymeleaf file for render --> ejs
    }




}
