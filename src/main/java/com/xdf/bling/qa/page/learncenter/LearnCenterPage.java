package com.xdf.bling.qa.page.learncenter;


import com.xdf.bling.qa.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LearnCenterPage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/8/10 11:40 上午
 */

public class LearnCenterPage extends BasePage {
    public LearnCenterPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入学习中心
     */
    public void clickLearnCenter() {
        driver.findElementByXPath("//android.widget.ImageView[@text='学习中心 Learning Center']").click();
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
     * @return
     */
    public boolean isCenterToast() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='在这里切换「课程类型」和「等级」']");
        return isPresent(element);

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
}
