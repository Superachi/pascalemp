package com.pascal.pascaldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class GreetingController {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    @RequestMapping(path = "/greeting", method = RequestMethod.GET)
    public String getGreeting() {
        logger.info("The logger is totally working!!");
        return "Hello I'm basic";
    }
}
