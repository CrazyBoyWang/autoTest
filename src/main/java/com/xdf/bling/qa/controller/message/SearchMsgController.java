package com.xdf.bling.qa.controller.message;


import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.message.SearchMsgPage;
import com.xdf.bling.qa.service.message.SearchMsgService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: SearchMsgController
 * @Description: 消息通知
 * @Author: 王雪松
 * @Date: 2020/8/10 10:39 上午
 */



public class SearchMsgController extends BaseController {

    @Test(description = "消息通知",priority = 1)
    public void testSearchMsgController () {
        SearchMsgPage searchMsgPage = new SearchMsgPage((AndroidDriver<MobileElement>) driver);
        SearchMsgService searchMsgService = new SearchMsgService(searchMsgPage);
        searchMsgService.searchMsgService();



    }

}
