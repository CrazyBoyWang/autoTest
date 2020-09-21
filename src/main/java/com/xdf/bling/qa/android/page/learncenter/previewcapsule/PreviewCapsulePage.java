package com.xdf.bling.qa.android.page.learncenter.previewcapsule;


import com.xdf.bling.qa.android.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
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
    public PreviewCapsulePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点掉课前预习弹窗
     */
    public void clickClassPrepare() {
        driver.findElementByXPath("//android.view.View[@text='「课前预习」要在课前完成哦~']").click();
    }

    /**
     * 点掉监课弹窗
     */
    public void clickClassSupervise() {
        driver.findElementByXPath("//android.view.View[@text='在这里可以「监课」也可以看 「课程回放」哦~']").click();
    }

    /**
     * 点掉课后作业弹窗
     */
    public void clickHomeWork() {
        driver.findElementByXPath("//android.view.View[@text='「课后作业」，记得按时完成哦~']").click();
    }

    /**
     * 滑动到预习小胶囊
     */
    public void swipeCapsule() {
        //   MobileElement element = driver.findElementByXPath("//android.view.View[@text='预习小锦囊']");
        swipe(Direction.RIGHT, null);
    }

    /**
     * 点击进入预习小胶囊
     */
    public void clickCapsule() {
        driver.findElementByXPath("//android.view.View[@text='预习小锦囊']").click();
    }


    /**
     * 点击赞过我
     */
    public void clickPraiseMe() {
        driver.findElementByXPath("//android.widget.ImageView[@text='赞过我']").click();
    }

    /**
     * 点击戳过我
     */
    public void clickStabbedMe() {
        driver.findElementByXPath("//android.widget.ImageView[@text='戳过我']").click();
    }

    /**
     * 词句轮轮看
     */
    public void clickLookAround() {
        driver.findElementByXPath("//android.widget.ImageView[@text='词句轮轮看']").click();
    }


    /**
     * 点击Word Fun
     */

    public void clickWordFun() {
        driver.findElementByXPath("//android.widget.ImageView[@text='Word Fun']").click();
    }

    /**
     * Word Fun点击下一步
     * <p>
     * 元素已经超出屏幕位置，需要想个办法修改下定位
     */
    public void clickWordFunNext() {

//        System.out.println("获取屏幕大小：" + driver.manage().window().getSize());
//        System.out.println("获得浏览器在屏幕的位置：" + driver.manage().window().getPosition());
//        System.out.println("当前屏幕为：" + driver.getOrientation().name());
//        Dimension targetSize = new Dimension(2208,1080);
//
//        driver.manage().window().setSize(targetSize);
//        System.out.println("当前屏幕为：" + driver.manage().window().getSize());

//        driver.rotate(ScreenOrientation.PORTRAIT);//设置竖屏
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]");
        new TouchAction<>(driver).press(PointOption.point(2130, 673)).release().perform();

    }


    /**
     * 点击知识小预热
     */
    public void clickKnowledgePreheating() {
        driver.findElementByXPath("//android.widget.ImageView[@text='知识小预热']").click();
    }


    /**
     * 点击look and listen
     */
    public void clickLookAndListen() {
        driver.findElementByXPath("//android.widget.ImageView[@text='Look and Listen']").click();
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
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='恭喜你完成本关卡~']");
        return isPresent(element);
    }


    /**
     * 点击全部完成后视频按钮
     */
    public void clickFinshVideo() {
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
        int[] center = site(element);
        new TouchAction<>(driver).tap(PointOption.point(center[0] - 50, center[1])).perform();
    }


    /**
     * 判断预习完成界面
     */
    public boolean isPrepareSucess() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='恭喜你完成预习 ！']");
        return isPresent(element);
    }

    /**
     * 点击进入预习排行榜
     */
    public void clickLearnRank() {
        driver.findElementByXPath("//android.view.View[@text='学习排行']").click();

    }

    /**
     * 判断文件列表出现
     */
    public boolean isLearnRank() {
        MobileElement element = driver.findElementByXPath("//android.view.View[contains(@text,'完成')]");
        return isPresent(element);
    }

    /**
     * 点击排行列表
     */
    public void clickRankClose() {
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
        int[] center = site(element);
        new TouchAction<>(driver).press(PointOption.point(center[0] - 20, center[1])).release().perform();

    }
    /**
     *
     * 返回预习小课堂
     */
    public void clickBackClasses(){
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
        int[] center = site(element);
        new TouchAction<>(driver).press(PointOption.point(center[0] - 20, center[1])).release().perform();
    }


}