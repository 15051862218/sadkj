package com.syk.boot.mapper;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 
 * @TableName t_clazz
 */
@Data
@Alias("Clazz")
public class Clazz implements Serializable {
    /**
     * 班级id
     */
    private Integer clazzId;

    /**
     * 班级名称
     */
    private String clazzName;

    /**
     * 班级管理老师的id
     */
    private Integer teacherId;

    private Teacher teacher;
    private List<Student> students;
     @Serial
    private static final long serialVersionUID = 1L;
}