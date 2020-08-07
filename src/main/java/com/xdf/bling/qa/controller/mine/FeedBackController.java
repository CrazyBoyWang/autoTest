package com.xdf.bling.qa.controller.mine;


import com.xdf.bling.qa.bean.Problem;
import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.mine.FeedBackPage;
import com.xdf.bling.qa.service.mine.FeedBackService;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: CouponController
 * @Description: 我的-优惠券
 * @Author: 王雪松
 * @Date: 2020/8/05 17:26 下午
 */


public class FeedBackController extends BaseController {

    @Test(description = "测试我的账户-我的-意见反馈", dataProvider = "providerMethod", priority = 1)
    public void testFeedBackController(Map<String, String> param) {
        Problem problem = new Problem();
        FeedBackPage feedBackPage = new FeedBackPage(driver);
        FeedBackService feedBackService = new FeedBackService(feedBackPage);
        problem.setProblem(param.get("problem"));
        feedBackService.feedBackService(problem);

    }

}
