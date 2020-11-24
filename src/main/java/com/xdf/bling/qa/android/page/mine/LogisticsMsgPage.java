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
        MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='物流信息']");
        element.click();
    }


    /**
     * 判断物流查询信息进入页面
     *
     * @return
     */
    public boolean isLogisticsMsg() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc=\"物流查询\"]\n");
        return isPresent(element);
    }

    //    //进入物流实体
//    public void clickLogisticsList(){
//        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.widget.ListView/android.view.View[1]\n").click();
//
//    }
    public void swipeUpList() {
        swipe(Direction.UP, null);
    }

    //返回界面
    public void clickBackLogistics() {
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]\n").click();
    }


    public boolean isPresentLogoutButton() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='退出登录']");
        return isPresent(element);
    }


}
