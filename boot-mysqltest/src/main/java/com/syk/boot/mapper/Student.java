package com.syk.boot.mapper;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 
 * @TableName t_student
 */
@Data
@Alias("Student")
public class Student implements Serializable {
    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学生所属班级的id
     */
    private Integer clazzId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生籍贯
     */
    private String hometown;

    /**
     * 出生日期
     */
    private Date birthday;
    private Clazz clazz;
    private List<Course> courses;
    @Serial
    private static final long serialVersionUID = 1L;
}