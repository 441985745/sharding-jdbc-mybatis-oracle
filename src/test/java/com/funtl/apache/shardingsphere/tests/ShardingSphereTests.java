package com.funtl.apache.shardingsphere.tests;

import com.funtl.apache.shardingsphere.domain.Usertest;
import com.funtl.apache.shardingsphere.mapper.UsertestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingSphereTests {

    @Resource
    private UsertestDao usertestDao;

    @Resource
    private UsertestDao tbOrderItemMapper;

    @Test
    public void testInsertOrder() {
        Usertest tbOrder = new Usertest();
        tbOrder.setId(1);
        tbOrder.setName("1211");

    }

}
