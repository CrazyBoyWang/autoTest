package com.xdf.bling.qa.ios.page.learncenter;


import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LearnCenterPage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/8/10 11:40 上午
 */

public class LearnCenterPage extends BasePage {
    public LearnCenterPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入学习中心
     */
    public void clickLearnCenter() {
        driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,'学习中心')]").click();
    }


    /**
     * 在这里切换「课程类型」和「等级」
     */
    public void clickCenterToast() {
        driver.findElementByXPath("//android.view.View[@text='在这里切换「课程类型」和「等级」']").click();
    }

    /**
     * 判断弹出课程提示信息出现
     *
     *
     */
    public boolean isCenterToast() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='在这里切换「课程类型」和「等级」']");
        return isPresent(element);
    }
    /**
     *
     * 点击切换课程
     */
    public void clickChangeClass(){
        driver.findElementByAccessibilityId("切换课程").click();
    }

    /**
     * 点击小班课专属
     * 根据图片获取
     */
    public void clickPop(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[4]\n").click();
    }

    /**
     *
     * 选择课程学习
     * 随机选择课程进行学习
     *
     */
    public void clickPlayBack(){
    //    driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ImageView[1]/android.widget.Button").click();
        driver.findElementByXPath("//*[contains(@text,'查看回放')]").click();
    }

    /**
     * 滑动页面到指定课程
     */
    public void swipeAimClass(){
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeImage[@name=\"课前课后测试\"]\n");
        new TouchAction<>(driver).longPress(PointOption.point(259, 170)).moveTo(PointOption.point(159, 55)).release().perform();
    }
    /**
     * 点击进入滑动到课程
     */
    public void clikAimClass(){
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"课前课后测试\"]\n").click();

    }

    /**
     *
     * 选择关卡1进入
     */
    public void clickCheckPoint(){
        driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,'关卡1')]").click();
    }
    /**
     *
     * 判断进入到课前课后关卡1
     */
    public boolean isAimClass(){
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"课前课后关卡1\"]\n");
        return isPresent(element);
    }
}