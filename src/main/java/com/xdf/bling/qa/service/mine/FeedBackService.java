package com.xdf.bling.qa.service.mine;


import com.xdf.bling.qa.bean.Problem;
import com.xdf.bling.qa.page.mine.FeedBackPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: DeliveryAddressService
 * @Description: 我的-收货地址
 * @Author: 王雪松
 * @Date: 2020/8/06 19:40 下午
 */

//比邻商城
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
