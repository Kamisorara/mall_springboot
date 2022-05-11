package com.example.service.impl;

import com.example.entity.Classification;
import com.example.entity.resp.ResponseResult;
import com.example.mapper.ClassificationMapper;
import com.example.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationServiceImpl implements ClassificationService {
    @Autowired
    ClassificationMapper classificationMapper;

    @Override
    public ResponseResult selectAll() {
        List<Classification> result = classificationMapper.selectAll();
        return new ResponseResult(200, "获取成功", result);
    }
}
