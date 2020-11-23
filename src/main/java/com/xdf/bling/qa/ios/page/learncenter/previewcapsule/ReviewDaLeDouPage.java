package com.xdf.bling.qa.ios.page.learncenter.previewcapsule;

import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

/**
 * @author: wangxuesong
 * @description:TODO
 * @date: 2020/8/18 10:45 上午
 */
public class ReviewDaLeDouPage extends BasePage {
    public ReviewDaLeDouPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入复习大乐斗
     */
    public void clickReviewDaLeDou() throws InterruptedException {
        swipe(Direction.LEFT, null);
        Thread.sleep(3000);
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"复习大乐斗\"]").click();
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
     * 点击Language Review
     */
    public void clickLanguageReview() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"Language Review\"]").click();
    }
    //自动播放Review
    public void autoReview(){
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();
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
     * Pronunciation Fun
     */
    public void clickPronunciationFun() {
        driver.findElementByXPath("//XCUIElementTypeImage[@name=\"Pronunciation Fun\"]\n").click();

    }


    /**
     * 点击录制自己的声音
     */
    public void clickSelfVoice() {
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]").click();
    }

    /**
     * 点击完成录制
     */
    public void clickMyVoice() {
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]").click();
    }


    public void test() {
        System.out.println(driver.getPageSource());
    }

    /**
     * 录音下一步
     *
     *
     */
    public void clickVoiceAhead() {
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[5]").click();
    }

    public boolean isScore() {
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[5][contains(@content-desc,'分')]");
        return isPresent(element);
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
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();

    }


    /**
     * Small Talk Quiz
     */
    public void swipSmallTalkQuiz() {
        swipe(Direction.LEFT, null);
    }

    public void clickSmallTalkQuiz() {

        MobileElement element = driver.findElementByXPath("//XCUIElementTypeImage[@name=\"Small Talk Quiz\"]\n");
        element.click();
    }

    /**
     * Choose the correct answer
     */
    public boolean isCorrectAnswer() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"Choose the correct answer\"]\n");
        return isPresent(element);
    }

    /**
     * What's the title of their new song?相关答案
     */
    public void clickOurHobbies() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"Our hobbies.\"]\n").click();
    }

    //Our favourite subject.正确答案
    public void clickFavouriteSubject() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"Our favourite subject.\"]\n").click();
    }

    /**
     * ▁▁▁the snake cute? No, It▁▁▁. It's scary.相关答案
     */
    public boolean isSnakeCute() {
        MobileElement element = driver.findElementByXPath("//XCUIElementTypeOther[contains(@content-desc,'snake cute')]");
        return isPresent(element);
    }

    //Is; aren't
    public void clickIsArent() {
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"Is; aren't\"]\n").click();
    }
    //Is; isn't
    public void clickIsIsnt(){
        driver.findElementByXPath("//XCUIElementTypeOther[@name=\"Is; isn't\"]\n").click();
    }

    /**
     *
     *
     */


}
