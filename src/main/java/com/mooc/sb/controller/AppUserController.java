package com.mooc.sb.controller;

import com.mooc.sb.bean.AppUser;
import com.mooc.sb.service.AppUserService;
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

    @RequestMapping("/detail/{userid}")
    @ResponseBody
    public String detail(@PathVariable("userid") String userid) {
        return Optional.ofNullable(appUserService.getAppUserById(userid)).map(AppUser::toString).orElse("empty String");
    }
}
