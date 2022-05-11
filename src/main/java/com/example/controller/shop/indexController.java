package com.example.controller.shop;

import com.example.entity.resp.ResponseResult;
import com.example.service.ClassificationService;
import com.example.service.NoticeBoardService;
import com.example.service.RecommendedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商城首页接口
 */
@RestController
@RequestMapping("/shop/index")
public class indexController {
    @Autowired
    RecommendedService recommendedService;
    @Autowired
    ClassificationService classificationService;

    @Autowired
    NoticeBoardService noticeBoardService;

    @RequestMapping(value = "/default-recommended", method = RequestMethod.GET)
    public ResponseResult getRecommended() {
        return recommendedService.selectAll();
    }


    @RequestMapping(value = "/classification", method = RequestMethod.GET)
    public ResponseResult getClassification() {
        return classificationService.selectAll();
    }

    @RequestMapping(value = "/notice-board", method = RequestMethod.GET)
    public ResponseResult getNoticeBoard() {
        return noticeBoardService.getAllNotice();
    }
}
