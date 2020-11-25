package com.xdf.bling.qa.ios.page.learncenter.previewcapsule;


import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: PreviewCapsulePage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/8/10 17:05 下午
 */

public class PreviewCapsulePage extends BasePage {
    public PreviewCapsulePage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点掉课前预习弹窗
     */
    public void clickClassPrepare() {
        driver.findElementByXPath("//android.view.View[@content-desc='「课前预习」要在课前完成哦~']").click();
    }

    /**
     * 点掉监课弹窗
     */
    public void clickClassSupervise() {
        driver.findElementByXPath("//android.view.View[@content-desc='在这里可以「监课」也可以看 「课程回放」哦~']").click();
    }

    /**
     * 点掉课后作业弹窗
     */
    public void clickHomeWork() {
        driver.findElementByXPath("//android.view.View[@content-desc='「课后作业」，记得按时完成哦~']").click();
    }

    /**
     * 滑动到预习小胶囊
     */
    public void swipeCapsule() {
        //   MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='预习小锦囊']");
    //    MobileElement element = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]\n");
        ////XCUIElementTypeOther[@name="预习小锦囊"]
        swipe(Direction.RIGHT, null);
    }

    /**
     * 点击进入预习小胶囊
     */
    public void clickCapsule() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"预习小锦囊\"]\n").click();
    }


    /**
     * 点击赞过我
     */
    public void clickPraiseMe() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"赞过我\"]\n").click();
    }

    /**
     * 点击戳过我
     */
    public void clickStabbedMe() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"戳过我\"]\n").click();
    }

    /**
     * 词句轮轮看
     */
    public void clickLookAround() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"词句轮轮看\"]\n").click();
    }


    /**
     * 点击Word Fun
     */

    public void clickWordFun() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"Word Fun\"]\n").click();
    }
    //开启自动播放
    public void clickAuto(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();

    }
    //确认自动播放模式
    public void clickAutoStart(){
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"开始\"]\n").click();
    }
    //跳过自动播放结束按钮
    public void clickCrossAuto(){
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"跳过\"]\n").click();
    }

    /**
     * Word Fun点击下一步
     * <p>
     * 元素已经超出屏幕位置，需要想个办法修改下定位
     */
    public void clickWordFunNextOne() {

//        System.out.println("获取屏幕大小：" + driver.manage().window().getSize());
//        System.out.println("获得浏览器在屏幕的位置：" + driver.manage().window().getPosition());
//        System.out.println("当前屏幕为：" + driver.getOrientation().name());
//        Dimension targetSize = new Dimension(2208,1080);
//
//        driver.manage().window().setSize(targetSize);
//        System.out.println("当前屏幕为：" + driver.manage().window().getSize());

//        driver.rotate(ScreenOrientation.PORTRAIT);//设置竖屏
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[3]\n").click();
    }
    public void clickWordFunNextTwo(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[4]\n").click();
    }


    /**
     * 点击知识小预热
     */
    public void clickKnowledgePreheating() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"知识小预热\"]\n").click();
    }


    /**
     * 点击look and listen
     */
    public void clickLookAndListen() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"Look and Listen\"]\n").click();
    }

    //判断进入到look and listen
    public boolean isLookAndListen(){
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[contains(@name,\"Hello. Welcome\")]");
        return isPresent(element);
    }
    //自动开始look
    public void autoLookAndListen(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[5]\n").click();
    }

    /**
     * 切换look and listen 中英文
     */
    public void clickChangeCode() {
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[6]").click();
    }

    /**
     * 翻页
     */
    public void clickTurn() {
        //    MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]");
        //    int[] center = site(element);
        //   touchAction.tap(PointOption.point(center[0] / 3, center[1] / 3)).perform();
        new TouchAction<>(driver).longPress(PointOption.point(2000, 300)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(50))).moveTo(PointOption.point(300, 300)).release().perform();

    }

    /**
     * 判断视频播放完成
     */
    public boolean isFinshVideo() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"恭喜你完成本关卡~\"]\n");
        return isPresent(element);
    }


    /**
     * 点击全部完成后视频按钮
     */
    public void clickFinshVideo() {
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();

    }


    /**
     * 判断预习完成界面
     */
    public boolean isPrepareSucess() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"恭喜你完成预习 ！\"]\n");
        return isPresent(element);
    }

    /**
     * 点击进入预习排行榜
     */
    public void clickLearnRank() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"学习排行\"]\n").click();

    }

    /**
     * 判断文件列表出现
     */
    public boolean isLearnRank() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[contains(@name,'完成')]");
        return isPresent(element);
    }

    /**
     * 点击排行列表
     */
    public void clickRankClose() {
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();

    }
    /**
     *
     * 返回预习小课堂
     */
    public void clickBackClasses(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]\n").click();
    }


}