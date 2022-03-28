package com.syk.boot.mapper;

/**
* @author sunshine
* @description 针对表【t_teacher】的数据库操作Mapper
* @createDate 2022-03-28 19:54:04
* @Entity com.stf.bootmysqltest.mapper.Teacher
*/
public interface TeacherMapper {
   Teacher findOneByOne(int teacherId);
}




