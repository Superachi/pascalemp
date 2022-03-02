package com.pascal.pascaldemo.controller;

import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class GreetingController {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    // Using Postman, user can post a string, which could contain a variable interpolation
    // which Log4J will try to resolve
    // https://commons.apache.org/proper/commons-configuration//userguide/howto_basicfeatures.html#Variable_Interpolation
    // Try this input for the POST-request https://log4shell.tools/
    @RequestMapping(method = RequestMethod.POST, value="/bad_endpoint")
    public String getGreeting(@RequestBody String query) {
        logger.warn("The definitely trustworthy output is: {}", query);
        return "Success";
    }
}