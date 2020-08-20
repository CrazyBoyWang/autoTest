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
     * 点击banner
     */
    public void clickBanner() {
        driver.findElementByXPath("//android.widget.ImageView[@text='我的老师']/following-sibling::android.view.View[1]").click();
    }

    /**
     * 进入我的老师
     */
    public void clickMyTeacher() {
        driver.findElementByXPath("//android.widget.ImageView[@text='我的老师']").click();
    }

    //判读进入我的老师界面
    public boolean isMyTeacher() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的老师']");
        return isPresent(element);
    }

    //左右滑动界面查看老师
    public void swipeMyTeacher() throws InterruptedException {
        swipe(Direction.LEFT, null);
        Thread.sleep(1000);
        swipe(Direction.RIGHT, null);
    }

    //向下查看
    public void swipeDownTeacher() throws InterruptedException {
        Thread.sleep(1000);
        swipe(Direction.UP, null);
    }

    //返回到首页
    public void clickBacks() {
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView").click();
    }

    /**
     * 比邻公开课
     */

    public boolean isBlingOpenClass() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='比邻公开课']");

        return isPresent(element);
//        String country = "比邻公开课";
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollDescriptionIntoView(text(\"" +country +"\"))").click();

        //     String country = "比邻公开课";

        //这种方法用于静态页面好使
        //    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollTextIntoView(\"比邻公开课\")");
        //


    }

    //点击进入公开课更多
    public void clickOpenMoreClass() {
        driver.findElementByXPath("//android.widget.ImageView[@text='更多']").click();

    }


    /**
     * 比邻绘本
     */
    public void swipeHomePage() {
        //    driver.getContext()
        //WebElement webElement = driver.findElementByXPath("//android.widget.ScrollView[1]");
        swipe(Direction.UP, null);
    }

    //判断比邻绘本
    public boolean isPictureBook(){
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='比邻绘本']");

        return isPresent(element);

    }



    //点击分级阅读
    public void clickPictureBook(){
        driver.findElementByXPath("//android.widget.ImageView[@text='分级阅读']").click();
    }

    //滑动分级阅读
    public void swipePictureBook(){
        swipe(Direction.LEFT, null);
    }
}
