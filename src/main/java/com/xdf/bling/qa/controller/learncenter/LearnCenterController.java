package com.xdf.bling.qa.controller.learncenter;


import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.learncenter.LearnCenterPage;
import com.xdf.bling.qa.service.learncenter.LearnCenterService;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LearnCenterController
 * @Description: 学习中心
 * @Author: 王雪松
 * @Date: 2020/8/10 14:39 下午
 */



public class LearnCenterController extends BaseController {

    @Test(description = "学习中心--学习课程",priority = 1)
    public void testLearnCenterController () {
        LearnCenterPage learnCenterPage = new LearnCenterPage(driver);
        LearnCenterService learnCenterService = new LearnCenterService(learnCenterPage);
        learnCenterService.learnCenterService();



    }

}
