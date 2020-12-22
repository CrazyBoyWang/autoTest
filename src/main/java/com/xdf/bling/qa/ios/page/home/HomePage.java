package com.xdf.bling.qa.ios.page.home;

import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

import java.util.Random;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: HomePage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: liuzhanhui
 * @Date: 2020/6/16 4:06 下午
 */
public class HomePage extends BasePage {

    public HomePage(IOSDriver<MobileElement> driver) {
        super(driver);
    }


    /**
     * 点击banner
     */
    public void clickBanner() {
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeImage\n").click();
    }
    /**
     *
     * 点击头像
     */

    public void clickHeader(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();
    }
    /**
     * 进入我的老师
     */
    public void clickMyTeacher() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"我的老师\"]\n").click();
    }

    //判读进入我的老师界面
    public boolean isMyTeacher() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"我的老师\"]\n");
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
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage\n").click();
    }

    /**
     * 比邻公开课
     */

    public boolean isBlingOpenClass() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"比邻公开课\"]\n");

        return isPresent(element);
//        String country = "比邻公开课";
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollDescriptionIntoView(text(\"" +country +"\"))").click();

        //     String country = "比邻公开课";

        //这种方法用于静态页面好使
        //    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollTextIntoView(\"比邻公开课\")");
        //


    }




    /**
     *
     * 点击课程体系
     */
    public void clickCurricula(){
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"课程体系\"]\n").click();

    }


    public void clickBackCurricula(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"新东方比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();

    }


    //点击进入公开课更多
    public void clickOpenMoreClass() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"更多\"][1]\n").click();

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
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"比邻绘本\"]\n");

        return isPresent(element);

    }


    //点击分级阅读
    public void clickPictureBook(){
        driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"分级阅读\")]").click();
    }

    //滑动分级阅读
    public void swipePictureBook(){
        swipe(Direction.LEFT, null);
    }

    //绘本退出
    public void pictureBookBack(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeButton\n").click();
    }

    /**
     *
     * 课表相关
     */
    //判断课表
    public boolean isDateList()  {
        for (int i = 0; i < 3; i++) {
            swipe(Direction.DOWN, null);
        }
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeImage[@name=\"课表\"]\n");
      return isPresent(element);
    }
    //进入课表
    public void clickClassList(){
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"课表\"]\n").click();
    }
    //下拉日期列表
    public void clickDateList(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[3]\n  ").click();
    }
    //随机选择日期
    public void clickDate(){
        int date = new Random().nextInt(26)+1;
        driver.findElementByXPath("//XCUIElementTypeOther[@name="+date+"]").click();
    }


}
