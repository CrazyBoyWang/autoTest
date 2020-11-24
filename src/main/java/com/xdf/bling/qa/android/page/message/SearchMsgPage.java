package com.xdf.bling.qa.android.page.message;


import com.xdf.bling.qa.android.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: SearchMsgPage
 * @Description: 消息--消息，通知
 * @Author: 王雪松
 * @Date: 2020/8/10 10:19 上午
 */

public class SearchMsgPage extends BasePage {
    public SearchMsgPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击消息页签
     */
    public void clickNotice() {
        driver.findElementByXPath("//android.widget.ImageView[contains(@content-desc,'通知')]").click();

    }

    /**
     *
     *
     * 弹出消息提示信息
     */
    public boolean isToastMessage(){
        MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc=\"提示\"]\n");
        return isPresent(element);

    }
    //点击取消提示信息
    public void clickToast() {
        driver.findElementByXPath("//android.widget.Button[@content-desc=\"取消\"]\n").click();
    }


    public void clickMessage(){
        driver.findElementByXPath("//android.widget.ImageView[contains(@content-desc,'提醒')]\n").click();
    }


    /**
     * 判断进入通知消息
     *
     *
     */

    public boolean isNotice() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='消息']");
        return isPresent(element);
    }

    /**
     * 进入通讯录
     */
    public void clickList() {
        driver.findElementByXPath("//android.view.View[@content-desc='消息']/following-sibling::android.widget.ImageView[1]").click();
    }
    /**
     *
     * 从通讯录中退出
     */

    public void clickBackList(){
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView").click();
    }

}
