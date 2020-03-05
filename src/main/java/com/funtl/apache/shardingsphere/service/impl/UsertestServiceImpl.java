package com.funtl.apache.shardingsphere.service.impl;

import com.funtl.apache.shardingsphere.domain.Usertest;
import com.funtl.apache.shardingsphere.mapper.UsertestDao;
import com.funtl.apache.shardingsphere.service.api.UsertestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsertestServiceImpl implements UsertestService {

    @Autowired
    private UsertestDao usertestDao;


    @Override
    public void insert(List<Usertest> list) {
        for (Usertest usertest:list){
            usertestDao.insert(usertest);
        }
    }

    @Override
    public List<Usertest> list() {
        return usertestDao.list();
    }

    @Override
    public void delete() {
        usertestDao.delete();
    }

    @Override
    public void insertTuser(List<Usertest> list) {
        usertestDao.insertTuser(list);
    }
}
