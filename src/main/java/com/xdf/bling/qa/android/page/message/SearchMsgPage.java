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
        driver.findElementByXPath("//android.widget.ImageView[contains(@text,'通知')]").click();

    }

    /**
     * 判断进入通知消息
     *
     * @return
     */

    public boolean isNotice() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='通知']");
        return isPresent(element);
    }

    /**
     * 进入通讯录
     */
    public void clickList() {
        driver.findElementByXPath("//android.view.View[@text='消息']/following-sibling::android.widget.ImageView[1]").click();
    }

}
