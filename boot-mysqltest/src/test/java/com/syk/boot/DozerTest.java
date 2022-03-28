package com.syk.boot;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.syk.boot.dozer.TestA;
import com.syk.boot.dozer.TestB;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @program: boot-learning-new
 * @description:
 * @author: ShenTF
 * @create: 2022-03-28 11:04:47
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
public class DozerTest {
    @Test
    void  BeanUtilsTest(){
        TestA testA = new TestA("Syk","2022-08-08 11:23:12");
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        TestB testB = mapper.map(testA,TestB.class);
        log.info(String.valueOf(testB));
    }
    @Test
    void dozerTest3() {
        Mapper mapper = DozerBeanMapperBuilder.create().withMappingFiles("dozer/dozer-mapping.xml").build();
        TestA testA = new TestA("Syk","2022-03-28 11:06:15");
        log.info(String.valueOf(mapper.map(testA, TestB.class)));
    }
}
