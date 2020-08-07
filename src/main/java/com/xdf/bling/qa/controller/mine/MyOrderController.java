package com.xdf.bling.qa.controller.mine;


import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.mine.MyOrderPage;
import com.xdf.bling.qa.service.mine.MyOrderService;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyOrderController
 * @Description: 我的-我的订单
 * @Author: 王雪松
 * @Date: 2020/8/05 17:26 下午
 */



public class MyOrderController extends BaseController {

    @Test(description = "测试我的账户-我的订单",priority = 1)
    public void testMyOrderController () {
        MyOrderPage myOrderPage = new MyOrderPage(driver);
        MyOrderService myOrderService = new MyOrderService(myOrderPage);
        myOrderService.myOrderService();


    }

}
