package com.xdf.bling.qa.service.mine;


import com.xdf.bling.qa.page.mine.CouponPage;
import org.testng.Assert;

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


    public void couponService() {
        couponPage.clickMineTab();
        couponPage.clickCouponPage();
        Assert.assertTrue(couponPage.isShopPage(), "//进入优惠券失败");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        couponPage.clickBack();

       // myOrderPage.clickAllOrderList();
    }
}
