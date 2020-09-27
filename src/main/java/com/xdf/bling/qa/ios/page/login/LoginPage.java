package com.xdf.bling.qa.ios.page.login;

import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LoginPage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: wangxuesong
 * @Date: 2020/11/09 6:51 下午
 */
public class LoginPage extends BasePage {

    public LoginPage (IOSDriver<MobileElement> driver) {
        super(driver);
    }


    /**
     * 点击密码去登录tab
     */
    public void clickPasswordToLoginTab () {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"密码登录\"]\n").click();
    }

    /**
     * 输入手机号
     * @param phone
     */
    public void setLoginMobileNumber (String phone) {
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"请输入报名手机号\"]");
        actionSendkeys(mobileElement, phone, false, false);
    }

    /**
     * 输入密码
     * @param password
     */
    public void setLoginPassword (String password) {
        MobileElement loginPasswordInput = driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"请输入密码\"]\n");
        actionSendkeys(loginPasswordInput, password, false, false);
    }

    /**
     * 点击登录
     */
    public void clickLoginButton () {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"登录\"]").click();
    }

    /**
     * 判断首页tab出现
     *
     */
    public boolean homePageTabIsExist () {
        MobileElement homePageElement = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"首页\")]");

        return isPresent(homePageElement);
    }
}
