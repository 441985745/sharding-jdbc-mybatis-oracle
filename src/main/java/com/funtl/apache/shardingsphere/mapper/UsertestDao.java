package com.funtl.apache.shardingsphere.mapper;

import com.funtl.apache.shardingsphere.domain.Usertest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsertestDao {
    void insert(Usertest usertest);

    List<Usertest> list();

    void delete();
}