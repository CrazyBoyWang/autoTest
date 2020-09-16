package com.xdf.bling.qa.ios.page.mine;

import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LogisticsMsgPage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/7/22 16:14 下午
 */
public class LogisticsMsgPage extends BasePage {
    public LogisticsMsgPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 我的-物流信息
     */
    public void clickLogisticsMsg() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"物流信息\"]\n").click();

    }
}
