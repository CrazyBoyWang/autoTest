package com.xdf.bling.qa.service.mine;


import com.xdf.bling.qa.bean.Problem;
import com.xdf.bling.qa.page.mine.FeedBackPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: feedBackService
 * @Description: 我的-意见反馈
 * @Author: 王雪松
 * @Date: 2020/8/07 15:20 下午
 */


public class FeedBackService {
    private final FeedBackPage feedBackPage;

    public FeedBackService(FeedBackPage feedBackPage) {
        this.feedBackPage = feedBackPage;
    }


    public void feedBackService(Problem problem) {
        feedBackPage.clickMineTab();
        feedBackPage.clickFeedBackPage();
        Assert.assertTrue(feedBackPage.isFeedBackPage(), "//进入优惠券失败");
        feedBackPage.clickFeedBack();
        feedBackPage.clickFeedImage();
        feedBackPage.clickType();
        feedBackPage.clickEnterProblem(problem.getProblem());
        feedBackPage.clickEnter();
        if (feedBackPage.isEnterScuess()) {
            feedBackPage.clickSuccess();
        } else {
            Assert.fail("//提交内容失败");
            feedBackPage.clickSuccess();
        }
        feedBackPage.clickMyFeedBack();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            feedBackPage.clickBack();

        }
        // myOrderPage.clickAllOrderList();
    }
}
