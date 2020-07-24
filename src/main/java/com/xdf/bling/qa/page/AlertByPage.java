package com.xdf.bling.qa.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: BasePage
 * @Description: 所有弹窗信息
 * @Author: 王雪松
 * @Date: 2020/7/24 7:07 下午
 */
public class AlertByPage {
    protected AndroidDriver<MobileElement> driver;

    public AlertByPage (AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    /**
     * 切换课程类型提示
     */
    public void clickSwitchingCourses () {
       MobileElement element =  driver.findElementByXPath("//com.blingabc.student[@text='在这里切换「课程类型」和「等级」']");
       element.click();
    }

    public boolean isSwitchingCourses (String switchingCourses) {
        MobileElement element =  driver.findElementByXPath("//com.blingabc.student[@text='在这里切换「课程类型」和「等级」']");
        String text = element.getText();
        return switchingCourses.equals(text);
    }



}
