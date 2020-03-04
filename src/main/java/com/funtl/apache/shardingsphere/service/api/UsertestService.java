package com.funtl.apache.shardingsphere.service.api;

import com.funtl.apache.shardingsphere.domain.Usertest;

import java.util.List;

public interface UsertestService {

    public void insert(List<Usertest> list);

    List<Usertest> list();

    void delete();
}
