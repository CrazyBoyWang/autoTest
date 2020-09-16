package com.xdf.bling.qa.ios.service.mine;


import com.xdf.bling.qa.ios.page.mine.MyOrderPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyAccountService
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/7/31 17:00 下午
 */

//订单返回
public class MyOrderService {
    private final MyOrderPage myOrderPage;

    public MyOrderService(MyOrderPage myOrderPage) {
        this.myOrderPage = myOrderPage;
    }

    public void myOrderService() {
        myOrderPage.clickMineTab();
        myOrderPage.clickMyOrder();
        Assert.assertTrue(myOrderPage.isMyOrder(), "//进入订单失败");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myOrderPage.clickAllOrderList();

        myOrderPage.clickBack();

       // myOrderPage.clickAllOrderList();
    }
}
