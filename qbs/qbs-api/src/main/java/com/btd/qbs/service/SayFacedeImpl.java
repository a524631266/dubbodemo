package com.btd.qbs.service;

import com.btd.qbs.facade.SayFacade;
import org.apache.dubbo.config.annotation.Service;


@Service
public class SayFacedeImpl implements SayFacade {
    @Override
    public String say(String context) {
        return "小肥羊对你说："+context;
    }
}
