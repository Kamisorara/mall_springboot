package com.example.service.impl;

import com.example.entity.resp.ResponseResult;
import com.example.entity.shop.NoticeBoard;
import com.example.mapper.NoticeBoardMapper;
import com.example.service.NoticeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeBoardServiceImpl implements NoticeBoardService {
    @Autowired
    NoticeBoardMapper noticeBoardMapper;

    @Override
    public ResponseResult getAllNotice() {
        List<NoticeBoard> allNotice = noticeBoardMapper.getAllNotice();
        return new ResponseResult(200, "获取成功", allNotice);
    }
}
