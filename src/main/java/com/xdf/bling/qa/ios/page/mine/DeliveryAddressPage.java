package com.xdf.bling.qa.ios.page.mine;


import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: DeliveryAddressPage
 * @Description: 我的-收货地址
 * @Author: 王雪松
 * @Date: 2020/8/06 19:28 下午
 */

public class DeliveryAddressPage extends BasePage {
    public DeliveryAddressPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }


    /**
     * 点击进入收货地址
     * 根据坐标获取地址
     */
    public void clickShipPage() {
//        int x = 434;
//        int y = 810;
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"收货地址\"]\n");
        element.click();
        //       MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的课程']");

    }

    /**
     * 判断进入收货地址
     */
    public boolean isShipPage() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[contains(@name,'收货地址')]");
        return isPresent(element);
    }



}
