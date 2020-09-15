package com.xdf.bling.qa.ios.controller.mine;


import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.bean.Problem;
import com.xdf.bling.qa.ios.page.mine.FeedBackPage;
import com.xdf.bling.qa.ios.service.mine.FeedBackService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: FeedBackController
 * @Description: 我的-意见反馈
 * @Author: 王雪松
 * @Date: 2020/8/05 17:26 下午
 */


public class FeedBackController extends BaseController {

    @Test(description = "测试我的账户-我的-意见反馈", dataProvider = "providerMethod", priority = 1)
    public void testFeedBackController(Map<String, String> param) throws InterruptedException {
        Problem problem = new Problem();
        FeedBackPage feedBackPage = new FeedBackPage((IOSDriver<MobileElement>) driver);
        FeedBackService feedBackService = new FeedBackService(feedBackPage);
        problem.setProblem(param.get("problem"));
        feedBackService.feedBackService(problem);

    }

}
