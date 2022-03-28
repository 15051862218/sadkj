package com.syk.boot.dozer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: boot-learning-new
 * @description:
 * @author: ShenTF
 * @create: 2022-03-28 11:00:05
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestB {
    private String name;
    private Date cTime;
}
