package com.xdf.bling.qa.ios.page.message;


import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: SearchMsgPage
 * @Description: 消息--消息，通知
 * @Author: 王雪松
 * @Date: 2020/9/10 10:19 上午
 */

public class SearchMsgPage extends BasePage {
    public SearchMsgPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击消息页签
     */
    public void clickNotice() {
        driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,'通知')]").click();

    }

    /**
     * 判断进入通知消息
     *
     *
     */

    public boolean isNotice() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[contains(@name,\"消息\")]\n");
        return isPresent(element);
    }

    /**
     * 进入通讯录
     */
    public void clickList() {
//        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage\n").click();
  //      driver.findElementByXPath("//XCUIElementTypeOther[@name=\"消息\"]/following-sibling::/XCUIElementTypeImage").click();
        driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,'测评')]").click();
    }
    //去看看

    public void clickLookMsg(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();
    }

    //滑动观看
    public void swipeMsg(){
        swipe(Direction.UP,null);
    }

    public void clickBackMsg(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]\n").click();
    }


    //进入通讯录
    public void clickPhoneList(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();
    }






    /**
     *
     * 通讯录退出
     */
    public void clickListOut(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton\n").click();
    }

}
