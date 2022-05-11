package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Recommended;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecommendedMapper extends BaseMapper<Recommended> {
    List<Recommended> selectAll();
}
