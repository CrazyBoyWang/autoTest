package com.xdf.bling.qa.android.page.mine;

import com.xdf.bling.qa.android.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LogisticsMsgPage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/7/22 16:14 下午
 */
public class LogisticsMsgPage extends BasePage {
    public LogisticsMsgPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 我的-物流信息
     */
    public void clickLogisticsMsg() {
        MobileElement mobileElement = driver.findElementByXPath("//android.view.View[@text='物流信息']");
        mobileElement.click();
    }

    public boolean isPresentLogoutButton() {
        MobileElement mobileElement = driver.findElementByXPath("//android.view.View[@text='退出登录']");
        return isPresent(mobileElement);
    }


}
