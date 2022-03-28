package com.syk.boot.mapper;

/**
* @author sunshine
* @description 针对表【t_clazz】的数据库操作Mapper
* @createDate 2022-03-28 19:54:04
* @Entity com.stf.bootmysqltest.mapper.Clazz
*/
public interface ClazzMapper {
            Clazz findOneByMany(int clazzId);

            Clazz getClazz(int clazzId);
}




