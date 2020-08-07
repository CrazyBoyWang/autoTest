package com.xdf.bling.qa.service.mine;


import com.xdf.bling.qa.page.mine.DeliveryAddressPage;
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
public class DeliveryAddressService {
    private final DeliveryAddressPage deliveryAddressPage;

    public DeliveryAddressService(DeliveryAddressPage deliveryAddressPage) {
        this.deliveryAddressPage = deliveryAddressPage;
    }


    public void deliveryAddressService() {
        deliveryAddressPage.clickMineTab();
        deliveryAddressPage.clickShipPage();
        deliveryAddressPage.isShipPage();
        Assert.assertTrue(deliveryAddressPage.isShipPage(), "//进入优惠券失败");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        deliveryAddressPage.clickBack();

        // myOrderPage.clickAllOrderList();
    }
}
