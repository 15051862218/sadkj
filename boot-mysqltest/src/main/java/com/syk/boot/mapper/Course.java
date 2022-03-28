package com.syk.boot.mapper;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_course
 */
@Data
public class Course implements Serializable {
    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 课程名称
     */
    private String courseName;

    private static final long serialVersionUID = 1L;
}