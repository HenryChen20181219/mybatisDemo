package com.henry.study.mybatisdemo.dao;

import com.henry.study.mybatisdemo.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}
