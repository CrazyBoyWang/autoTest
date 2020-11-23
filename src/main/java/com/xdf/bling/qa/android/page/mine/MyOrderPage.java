package com.xdf.bling.qa.android.page.mine;


import com.xdf.bling.qa.android.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyAccountPage
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/7/31 15:06 下午
 */

public class MyOrderPage extends BasePage {
    public MyOrderPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入我的订单
     * 根据坐标获取地址
     */
    public void clickMyOrder() {
//        int x = 434;
//        int y = 810;
        MobileElement element = driver.findElementByXPath("//android.widget.ImageView[@content-desc='我的订单']");
        //       MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='我的课程']");
        int[] center = site(element);
        new TouchAction<>(driver).tap(PointOption.point(center[0], center[1] + 30)).perform();
    }

    /**
     * 判断进入我的订单
     */
    public boolean isMyOrder() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='全部订单']");
        return isPresent(element);
    }

    /**
     * 点击全部订单
     * 暂时找不到方法
     */
    public void clickAllOrderList() {
   //     MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='全部订单']");
        MobileElement element = driver.findElementByClassName("全部订单");
        int[] center = site(element);
        System.out.println("+++++++++++++++++++++++++"+center[0]);
        System.out.println("+++++++++++++++++++++++++"+center[1]);
        new TouchAction<>(driver).tap(PointOption.point(center[0], center[1])).perform();
        clickBack();

    }


}
