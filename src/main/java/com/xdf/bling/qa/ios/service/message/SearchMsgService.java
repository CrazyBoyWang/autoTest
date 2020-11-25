package com.xdf.bling.qa.ios.service.message;


import com.xdf.bling.qa.ios.page.message.SearchMsgPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: SearchMsgService
 * @Description: 消息通知
 * @Author: 王雪松
 * @Date: 2020/8/10 10:40 上午
 */

public class SearchMsgService {
    private final SearchMsgPage searchMsgPage;

    public SearchMsgService(SearchMsgPage searchMsgPage) {
        this.searchMsgPage = searchMsgPage;
    }


    public void searchMsgService() throws InterruptedException {
        searchMsgPage.clickMessageTab();
        searchMsgPage.clickNotice();
        Assert.assertTrue(searchMsgPage.isNotice(), "进入通知失败");
        searchMsgPage.clickList();
        Thread.sleep(1000);
        searchMsgPage.clickLookMsg();
        Thread.sleep(1000);
        searchMsgPage.swipeMsg();
        Thread.sleep(2000);
        searchMsgPage.clickBackMsg();
        searchMsgPage.goBack();
        searchMsgPage.clickPhoneList();
        searchMsgPage.clickBackMsg();


    //    Thread.sleep(2000);
        //ios消息信息获取失败
//        searchMsgPage.clickList();
//        searchMsgPage.clickListOut();
        // myOrderPage.clickAllOrderList();
    }
}
