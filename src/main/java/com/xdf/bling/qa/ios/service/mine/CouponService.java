package com.xdf.bling.qa.ios.service.mine;


import com.google.gson.internal.$Gson$Preconditions;
import com.xdf.bling.qa.ios.page.mine.CouponPage;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: CouponService
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/8/06 19:00 下午
 */

public class CouponService {
    private final CouponPage couponPage;

    public CouponService(CouponPage couponPage) {
        this.couponPage = couponPage;
    }


    public void couponService() throws InterruptedException {
        couponPage.clickMineTab();
        Thread.sleep(2000);
        couponPage.clickCouponPage();
        if (couponPage.isCouponPage().equals("兑换")) {
            Thread.sleep(3000);
            couponPage.goBack();
        }
//        Assert.assertTrue(couponPage.isShopPage(), "//进入优惠券失败");
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        // myOrderPage.clickAllOrderList();
    }
}
