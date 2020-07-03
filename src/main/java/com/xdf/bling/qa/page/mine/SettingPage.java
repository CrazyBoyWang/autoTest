package com.xdf.bling.qa.page.mine;

import com.xdf.bling.qa.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: HomePage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: liuzhanhui
 * @Date: 2020/6/16 4:06 下午
 */
public class SettingPage extends BasePage {
    public SettingPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    /**
     *
     * 我的-点击设置
     *
     * */
    public void clickSetUp(){
        MobileElement mobileElement = driver.findElementByXPath("//android.view.View[@text='设置']");
        mobileElement.click();
    }
    public boolean isPresentLogoutButton(){
        MobileElement mobileElement = driver.findElementByXPath("//android.view.View[@text='退出登录']");
        return isPresent(mobileElement);
    }

    /**
     * 清理缓存
     *
     *
     * */
    public void CleanCache(){
        MobileElement mobileElement = driver.findElementByXPath("//android.widget.ImageView[@text='清理缓存']");
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
        MobileElement mobileElement = driver.findElementByXPath("//android.widget.ImageView[@text='关于我们']");
        mobileElement.click();
    }
    public boolean isPresentAboutUs(){
        MobileElement mobileElement = driver.findElementByXPath("//android.view.View[@text='关于我们']");
        return isPresent(mobileElement);


    }












    /**
     * 检查更新
     *
     *
     * */
    public void CheckUpdate(){
        MobileElement mobileElement = driver.findElementByXPath("//android.widget.ImageView[@text='关于我们']/following-sibling::android.widget.ImageView[1]");
        mobileElement.click();
    }
    //判断版本号是否一致
    public boolean checkVersionText(String version){
        MobileElement mobileElement = driver.findElementByXPath("//android.widget.ImageView[@text='关于我们']/following-sibling::android.widget.ImageView[1]");
        String text = mobileElement.getText();
        String versionText = text.split("检查更新")[1].trim();
        return version.equals(versionText);
    }
    public boolean isShowToastCheckUpdate(){
        return isShowToast("已是最新版本~");
    }

}
