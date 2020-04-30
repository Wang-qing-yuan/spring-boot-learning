package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.entity.Clazz;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ClazzMapperTest {

    @Resource
    private ClazzMapper clazzMapper;

    //查询全部
    @Test
    void testSelectAll(){
        List<Clazz> clazzes = clazzMapper.selectList(null);
        clazzes.forEach(System.out::println);
    }

    //根据id删除
    @Test
    void testDelete(){
        int followers = clazzMapper.deleteById(3);
    }
//根据id查询
    @Test
    void selectOne(){
        Clazz clazzs = clazzMapper.selectById(2);
        System.out.println(clazzs);
    }



}