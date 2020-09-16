package com.xdf.bling.qa.ios.page.mine;

import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: HomePage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: liuzhanhui
 * @Date: 2020/6/16 4:06 下午
 */
public class SettingPage extends BasePage {
    public SettingPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }
    /**
     *
     * 我的-点击设置
     *
     * */
    public void clickSetUp(){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"设置\"]\n");
        mobileElement.click();
    }
    public boolean isPresentLogoutButton(){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeButton[@name=\"退出登录\"]\n");
        return isPresent(mobileElement);
    }
    /**
     *
     * 账户安全
     *
     *
     * */
    public void accountSecurity(){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeImage[@name=\"账户安全\"]\n");
        mobileElement.click();
    }

    public boolean isShowToastAccount(String phone){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeOther[contains(@name,\"绑定手机\")]");
        return phone.equals(mobileElement.getText().split("绑定手机")[1].trim());


    }

    /**
     * 清理缓存
     *
     *
     * */
    public void CleanCache(){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeImage[@name=\"清理缓存\"]\n");
        mobileElement.click();
    }
    public boolean isShowToastCleanCache(){
        return isShowToast("清理完成");
    }

    /**
     *
     *
     * 关于我们
     *
     * */
    public void aboutUs(){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeImage[@name=\"关于我们\"]\n");
        mobileElement.click();
    }
    public boolean isPresentAboutUs(){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"关于我们\"]\n");
        return isPresent(mobileElement);
    }

    /**
     * 检查更新
     *
     *
     * */
    public void CheckUpdate(){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,'检查更新')]");
        mobileElement.click();
    }
    //判断版本号是否一致
    public boolean checkVersionText(String version){
        MobileElement mobileElement = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,'检查更新')]");
        String text = mobileElement.getText();
        String versionText = text.split("检查更新")[1].trim();
        return version.equals(versionText);
    }
    public boolean isShowToastCheckUpdate(){
        return isShowToast("已是最新版本~");
    }

}
