package com.xdf.bling.qa.ios.service.learncenter;

import com.xdf.bling.qa.ios.page.learncenter.LearnCenterPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LearnCenterService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/8/10 14:33 下午
 */
public class LearnCenterService {

    private final LearnCenterPage learnCenterPage;

    public LearnCenterService(LearnCenterPage learnCenterPage) {
        this.learnCenterPage = learnCenterPage;
    }

    public void learnCenterService() throws InterruptedException {
        learnCenterPage.clickLearnCenter();
//        Assert.assertTrue(learnCenterPage.isCenterToast(),"没有弹出「课程类型」和「等级");
 //       learnCenterPage.clickCenterToast();
        Thread.sleep(4000);
        learnCenterPage.clickChangeClass();
        learnCenterPage.clickPop();
        Thread.sleep(2000);
        learnCenterPage.swipeAimClass();
        Thread.sleep(1000);
        learnCenterPage.clikAimClass();
        //如果不延迟
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        learnCenterPage.clickCheckPoint();
        Assert.assertTrue(learnCenterPage.isAimClass(),"进入课程页面失败");
    }

}
