package com.funtl.apache.shardingsphere.controller;

import com.funtl.apache.shardingsphere.domain.Usertest;
import com.funtl.apache.shardingsphere.mapper.UsertestDao;
import com.funtl.apache.shardingsphere.service.api.UsertestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsertestController {
    @Autowired
    private UsertestService usertestService;
    @Autowired
    private UsertestDao usertestDao;

    @RequestMapping("/test")
    public String test(){
        List<Usertest> list = new ArrayList<>();
        Usertest u1 = new Usertest();
        u1.setId(1l);
        u1.setName("u1");
        u1.setUserId(1);
        Usertest u2 = new Usertest();
        u2.setId(2l);
        u2.setName("u2");
        u2.setUserId(2);
        Usertest u3 = new Usertest();
        u3.setId(3l);
        u3.setName("u3");
        u3.setUserId(3);
        Usertest u4 = new Usertest();
        u4.setId(4l);
        u4.setName("u4");
        u4.setUserId(4);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        usertestService.insert(list);
        return null;
    }
    @RequestMapping("/list")
    public List<Usertest> list(){
        return usertestService.list();
    }
}
