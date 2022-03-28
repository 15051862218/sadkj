package com.syk.boot.mapper;

import org.apache.ibatis.annotations.Param;

import javax.management.remote.SubjectDelegationPermission;
import java.util.List;

/**
* @author sunshine
* @description 针对表【t_student】的数据库操作Mapper
* @createDate 2022-03-28 19:54:04
* @Entity com.stf.bootmysqltest.mapper.Student
*/
public interface StudentMapper {
    Student findManyByOne(int studentId);
    Student getStudent(int studentId);

    int batchInsert(@Param("students")List<Student> students);

    int batchDelete(@Param("ids") List<Integer> ids);

    int batchUpadte(@Param("students") List<Student> students);
    List<Student> findStudentBy(@Param("student") Student student);
}




