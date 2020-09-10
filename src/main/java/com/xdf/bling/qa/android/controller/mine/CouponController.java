package com.xdf.bling.qa.android.controller.mine;


import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.android.page.mine.CouponPage;
import com.xdf.bling.qa.android.service.mine.CouponService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: CouponController
 * @Description: 我的-优惠券
 * @Author: 王雪松
 * @Date: 2020/8/05 17:26 下午
 */



public class CouponController extends BaseController {

    @Test(description = "测试我的账户-我的-优惠券",priority = 1)
    public void testCouponController () {
        CouponPage couponPage = new CouponPage((AndroidDriver<MobileElement>) driver);
        CouponService couponService = new CouponService(couponPage);
        couponService.couponService();



    }

}
