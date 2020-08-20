package com.xdf.bling.qa.page.home;

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
public class HomePage extends BasePage {

    public HomePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }


    /**
     *
     * 点击banner
     */
    public void clickBanner () {
        driver.findElementByXPath("//android.widget.ImageView[@text='我的老师']/following-sibling::android.view.View[1]").click();
    }

    /**
     *
     * 进入我的老师
     */
    public void clickMyTeacher(){
        driver.findElementByXPath("//android.widget.ImageView[@text='我的老师']").click();
    }
    //判读进入我的老师界面
    public boolean isMyTeacher(){
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的老师']");
        return isPresent(element);
    }
    //左右滑动界面查看老师
    public void swipeMyTeacher() throws InterruptedException {
        swipe(Direction.LEFT,null);
        Thread.sleep(1000);
        swipe(Direction.RIGHT,null);
    }
    //向下查看
    public void swipeDownTeacher() throws InterruptedException {
        Thread.sleep(1000);
        swipe(Direction.UP,null);
    }






    public void swipeHomePage () {
    //    driver.getContext()
        //WebElement webElement = driver.findElementByXPath("//android.widget.ScrollView[1]");
        swipe(Direction.UP, null);
    }
}
