package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@EnableAutoConfiguration
public class TestController {
	
    @ResponseBody
	@RequestMapping(value="/")
    public String sampleHome() {
        
        return "Hello World!";
    }
}
