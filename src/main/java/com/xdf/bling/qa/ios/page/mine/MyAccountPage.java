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

public class MyAccountPage extends BasePage {
    public MyAccountPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入我的课程
     * 根据坐标获取地址
     */
    public void clickMyCourse() {

        //     MobileElement element = driver.findElementByXPath("//android.widget.ImageView[@content-desc='我的课程']");
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeImage[@name=\"我的课程\"]\n");
        int[] center = site(element);
        new TouchAction<>(driver).tap(PointOption.point(center[0], center[1] - 20)).perform();
    }

    //判断进入我的课程界面
    public boolean isMyCourse() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"我的课程\"]\n");
        return isPresent(element);
    }

    //切换到已开课
    public void clickClassStarted() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"已开课\n第 1 个标签，共 2 个\"]\n");
        element.click();
    }

    //随机找到课程点击进入
    public void clickClasses() {
        MobileElement element = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"外教老师\"])[1]");
        element.click();
    }


    //判断进入课程详情
    public boolean isCourseDetails() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"课程详情\"]\n");
        return isPresent(element);

    }

    //切换到未开课
    public void clickClassNoStarted() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"未开课\n第 2 个标签，共 2 个\"]\n");
        element.click();
    }


}
