package com.henry.study.mybatisdemo.service;

import com.henry.study.mybatisdemo.dao.TestDao;
import com.henry.study.mybatisdemo.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}
