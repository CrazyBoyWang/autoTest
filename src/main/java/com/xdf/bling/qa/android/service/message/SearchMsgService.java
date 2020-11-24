package com.xdf.bling.qa.android.service.message;


import com.xdf.bling.qa.android.page.message.SearchMsgPage;
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
        Thread.sleep(1000);
        searchMsgPage.clickNotice();
        Thread.sleep(2000);
        Assert.assertTrue(searchMsgPage.isToastMessage(),"没有提示信息");
        searchMsgPage.clickToast();
        Assert.assertTrue(searchMsgPage.isNotice(), "进入通知失败");
        searchMsgPage.clickMessage();
        searchMsgPage.clickBack();
        searchMsgPage.clickList();
        Thread.sleep(1000);
        searchMsgPage.clickBackList();
        // myOrderPage.clickAllOrderList();
    }
}
