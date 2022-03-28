package com.syk.boot;


import com.syk.boot.mapper.Clazz;
import com.syk.boot.mapper.ClazzMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * @Author 沈永康
 * @Date 2022/3/28 21:30
 * @Version 1.0
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
public class ClazzMapperTest {
    @Resource
    private ClazzMapper clazzMapper;
    @Test
    void findOneByMany(){
        Clazz clazz =clazzMapper.findOneByMany(1);
        log.info(clazz.getClazzId()+","+clazz.getClazzName());
        clazz.getStudents().forEach(student -> log.info(String.valueOf(student)));
    }
    @Test
    void getClazz(){
        Clazz clazz = clazzMapper.getClazz(1);
        log.info(clazz.getClazzName()+","+clazz.getClazzId());
        log.info(clazz.getTeacher().getTeacherId()+","+clazz.getTeacher().getTeacherName());
        clazz.getStudents().forEach(student -> log.info(String.valueOf(student)));
    }
}
