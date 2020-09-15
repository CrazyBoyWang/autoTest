package com.xdf.bling.qa.ios.page.mine;


import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: FeedBackPage
 * @Description: 我的-意见反馈
 * @Author: 王雪松
 * @Date: 2020/8/07 10:28 上午
 */

public class FeedBackPage extends BasePage {
    public FeedBackPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }


    /**
     * 点击进入意见反馈
     */
    public void clickFeedBackPage() {
//        int x = 434;
//        int y = 810;
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"意见反馈\"]\n").click();

        //       MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的课程']");

    }

    /**
     * 判断进入收货地址
     */
    public boolean isFeedBackPage() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"问题与反馈\"]\n");
        return isPresent(element);
    }

    /**
     * 点击意见反馈
     */

    public void clickFeedBack() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"意见反馈\"]\n").click();

    }

    /**
     * 选择问题类型
     */

    public void clickType() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"学习问题\"]\n").click();
    }


    /**
     * 点击反馈图片
     */
    public void clickFeedImage() throws InterruptedException {
        int x = 203;
        int y = 251;
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeImage\n").click();
        driver.findElementByXPath("//XCUIElementTypeCell[@name=\"所有照片\"]\n").click();
        Thread.sleep(3000);
        new TouchAction<>(driver).tap(PointOption.point(x, y)).perform();
    }

    /**
     * 输入问题内容
     *
     * @param problem
     */
    public void clickEnterProblem(String problem) {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"您的反馈将会是我们最大的动力\"]\n");
        actionSendkeys(element, problem, false, false);
    }

    /**
     * 点击提交
     */

    public void clickEnter() {
        driver.findElementByXPath("//XCUIElementTypeButton[@name='提交']\n").click();

    }

    /**
     * 判断提交成功信息
     */
    public boolean isEnterScuess() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name='反馈提交成功！感谢您的反馈！']\n");
        return isPresent(element);
    }

    /**
     * 提交成功点击确定
     */
    public void clickSuccess() {
        driver.findElementByXPath("//XCUIElementTypeButton[@name='确定']\n").click();
    }

    /**
     * 点击我的反馈
     */
    public void clickMyFeedBack() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name='我的反馈']\n").click();
    }


}
