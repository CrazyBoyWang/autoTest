package com.xdf.bling.qa.controller.mine;


import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.mine.BlingShopPage;
import com.xdf.bling.qa.service.mine.BlingShopService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyOrderController
 * @Description: 我的-我的订单
 * @Author: 王雪松
 * @Date: 2020/8/05 17:26 下午
 */



public class BlingShopController extends BaseController {

    @Test(description = "测试我的账户-比邻商城",priority = 1)
    public void testMyOrderController () {
        BlingShopPage blingShopPage = new BlingShopPage((AndroidDriver<MobileElement>) driver);
        BlingShopService blingShopService = new BlingShopService(blingShopPage);
        blingShopService.blingShopService();



    }

}
