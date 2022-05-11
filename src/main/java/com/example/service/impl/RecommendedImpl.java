package com.example.service.impl;

import com.example.entity.shop.Recommended;
import com.example.entity.resp.ResponseResult;
import com.example.mapper.RecommendedMapper;
import com.example.service.RecommendedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendedImpl implements RecommendedService {

    @Autowired
    RecommendedMapper recommendedMapper;

    @Override
    public ResponseResult selectAll() {
        List<Recommended> recommended = recommendedMapper.selectAll();
        return new ResponseResult(200, "获取成功", recommended);
    }
}
