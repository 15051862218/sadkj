package com.syk.boot.dozer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: boot-learning-new
 * @description:
 * @author: ShenTF
 * @create: 2022-03-28 10:58:01
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestA {
    private String name;
    private String createTime;
}
