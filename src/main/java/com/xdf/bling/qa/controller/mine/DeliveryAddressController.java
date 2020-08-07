package com.xdf.bling.qa.controller.mine;


import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.mine.DeliveryAddressPage;
import com.xdf.bling.qa.service.mine.DeliveryAddressService;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: CouponController
 * @Description: 我的-优惠券
 * @Author: 王雪松
 * @Date: 2020/8/05 17:26 下午
 */


public class DeliveryAddressController extends BaseController {

    @Test(description = "测试我的账户-我的-收货地址", priority = 1)
    public void testDeliveryAddressController() {
        DeliveryAddressPage deliveryAddressPage = new DeliveryAddressPage(driver);
        DeliveryAddressService deliveryAddressService = new DeliveryAddressService(deliveryAddressPage);
        deliveryAddressService.deliveryAddressService();


    }

}
