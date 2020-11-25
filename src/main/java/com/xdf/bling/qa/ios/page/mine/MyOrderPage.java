package com.xdf.bling.qa.ios.page.mine;


import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyAccountPage
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/9/16 15:06 下午
 */

public class MyOrderPage extends BasePage {
    public MyOrderPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入我的订单
     * 根据坐标获取地址
     */
    public void clickMyOrder() {
//        int x = 434;
//        int y = 810;
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeImage[@name=\"我的订单\"]\n");
        //       MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='我的课程']");
        int[] center = site(element);
        new TouchAction<>(driver).tap(PointOption.point(center[0], center[1] - 20)).perform();
    }

    /**
     * 判断进入我的订单
     */
    public boolean isMyOrder() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"全部订单\"]\n");
        return isPresent(element);
    }

    /**
     * 点击全部订单
     * 暂时找不到方法
     */
    public void clickAllOrderList() {
        //     MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='全部订单']");
        int x = 360;
        int y =70;
        MobileElement element = driver.findElementByClassName("//XCUIElementTypeOther[@name=\"全部订单\"]\n");
        int[] center = site(element);
        new TouchAction<>(driver).tap(PointOption.point(x, y)).perform();
//        clickBack();
    }

    public void  clickBackOrderList(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]\n").click();
    }

}
