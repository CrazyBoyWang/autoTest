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


    public void searchMsgService() {
        searchMsgPage.clickMessageTab();
        searchMsgPage.clickNotice();
        Assert.assertTrue(searchMsgPage.isNotice(), "进入通知失败");
        searchMsgPage.goBack();
        searchMsgPage.clickList();
        searchMsgPage.clickListOut();
        // myOrderPage.clickAllOrderList();
    }
}
