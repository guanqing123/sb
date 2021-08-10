package com.mooc.sb.controller;

import com.example.weather.WeatherService;
import com.mooc.sb.access.AccessLimit;
import com.mooc.sb.bean.AppUser;
import com.mooc.sb.service.AppUserService;
import com.mooc.sb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/appUser")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private TestService testService;

    @RequestMapping("/detail/{userid}")
    @ResponseBody
    public String detail(@PathVariable("userid") String userid) {
        return Optional.ofNullable(appUserService.getAppUserById(userid)).map(AppUser::toString).orElse("empty String");
    }

    @AccessLimit(seconds = 5, maxCount = 5, needLogin = true)
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return testService.test();
    }

    @RequestMapping("/weather")
    @ResponseBody
    public String weather(){
        return weatherService.getType() + "\t" + weatherService.getRate();
    }
}
