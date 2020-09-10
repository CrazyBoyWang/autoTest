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

public class MyAccountPage extends BasePage {
    public MyAccountPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入我的课程
     * 根据坐标获取地址
     */
    public void clickMyCourse() {
        int x =175;
        int y = 823;
        MobileElement element = driver.findElementByXPath("//android.widget.ImageView[@text='我的课程']");
  //      MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的课程']");

        new TouchAction<>(driver).tap(PointOption.point(x,y)).perform();
    }

    //判断进入我的课程界面
    public boolean isMyCourse() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的课程']");
        return isPresent(element);
    }

    //切换到已开课
    public void clickClassStarted() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='已开课\n" +
                "第 1 个标签，共 2 个']");
        element.click();
    }

    //随机找到课程点击进入
    public void clickClasses() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='比邻外教']");
        element.click();
    }


    //判断进入课程详情
    public boolean isCourseDetails() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='课程详情']");
        return isPresent(element);

    }


    //点击课程进入
    //开课和未开课都这样
    public void clickCourseDetails() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='比邻外教\n" +
                "外教老师']/following-sibling::android.widget.ImageView[2]");
        element.click();

    }


    //切换到未开课
    public void clickClassNoStarted() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='未开课\n" +
                "第 2 个标签，共 2 个']");
        element.click();
    }


}
