package com.xdf.bling.qa.page.mine;


import com.xdf.bling.qa.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: DeliveryAddressPage
 * @Description: 我的-收货地址
 * @Author: 王雪松
 * @Date: 2020/8/06 19:28 下午
 */

public class DeliveryAddressPage extends BasePage {
    public DeliveryAddressPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    TouchAction touchAction = new TouchAction(driver);

    /**
     * 点击进入收货地址
     * 根据坐标获取地址
     */
    public void clickShipPage() {
//        int x = 434;
//        int y = 810;
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='收货地址']");
        element.click();
        //       MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的课程']");

    }

    /**
     * 判断进入收货地址
     */
    public boolean isShipPage() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='收货地址']");
        return isPresent(element);
    }



}
