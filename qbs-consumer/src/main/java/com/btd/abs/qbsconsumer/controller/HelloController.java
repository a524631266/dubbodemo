package com.btd.abs.qbsconsumer.controller;



import com.btd.qbs.facade.SayFacade;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Reference
    SayFacade sayFacade;

    @GetMapping("/say")
    @ResponseBody
    public String remoteCallHello(String context) {
        return sayFacade.say(context);
    }
}
