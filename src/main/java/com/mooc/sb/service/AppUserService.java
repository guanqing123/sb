package com.mooc.sb.service;

import com.mooc.sb.bean.AppUser;
import com.mooc.sb.mapper.AppUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AppUserService {

    @Autowired
    private AppUserMapper appUserMapper;

    public AppUser getAppUserById(String userid) {
        return Optional.ofNullable(appUserMapper.selectByPrimaryKey(userid)).orElse(null);
    }
}
