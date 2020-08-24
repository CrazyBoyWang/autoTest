package com.xdf.bling.qa.page.mine;


import com.xdf.bling.qa.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: CouponPage
 * @Description: 我的-我的比邻商城
 * @Author: 王雪松
 * @Date: 2020/8/06 18:59 下午
 */

public class CouponPage extends BasePage {
    public CouponPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入优惠券
     * 根据坐标获取地址
     */
    public void clickCouponPage() {
//        int x = 434;
//        int y = 810;
        MobileElement element = driver.findElementByXPath("//android.widget.ImageView[@text='优惠券']");
        //       MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的课程']");
        int[] center = site(element);
       new  TouchAction<>(driver).tap(PointOption.point(center[0], center[1] + 30)).perform();
    }

    /**
     * 判断进入商城
     */
    public boolean isShopPage() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='优惠券']");
        return isPresent(element);
    }
}
