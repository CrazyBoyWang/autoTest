package com.xdf.bling.qa.page.learncenter.previewcapsule;

import com.xdf.bling.qa.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

/**
 * @author: wangxuesong
 * @description:TODO
 * @date: 2020/8/18 10:45 上午
 */
public class ReviewDaLeDouPage extends BasePage {
    public ReviewDaLeDouPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击进入复习大乐斗
     */
    public void clickReviewDaLeDou() {
        swipe(Direction.LEFT, null);
        driver.findElementByXPath("//android.view.View[@text='复习大乐斗']").click();
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
     * 点击Language Review
     */
    public void clickLanguageReview() {
        driver.findElementByXPath("//android.widget.ImageView[@text='Language Review']").click();
    }

    /**
     * Pronunciation Fun
     */
    public void clickPronunciationFun() {
        driver.findElementByXPath("//android.widget.ImageView[@text='Pronunciation Fun']").click();

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
     * @return
     */
    public void clickVoiceAhead() {
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[5]").click();
    }

    public boolean isScore() {
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[5][contains(@text,'分')]");
        return isPresent(element);
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
     * Small Talk Quiz
     */
    public void swipSmallTalkQuiz() {

        new TouchAction<>(driver).longPress(PointOption.point(1800, 180)).moveTo(PointOption.point(300, 300)).release().perform();

    }

    public void clickSmallTalkQuiz() {

        MobileElement element = driver.findElementByXPath("//android.widget.ImageView[@text='Small Talk Quiz']");
        element.click();
    }

    /**
     * Choose the correct answer
     */
    public boolean isCorrectAnswer() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='Choose the correct answer']");
        return isPresent(element);
    }

    /**
     * What's the title of their new song?相关答案
     */
    public void clickOurHobbies() {
        driver.findElementByXPath("//android.view.View[@text='Our hobbies.']").click();
    }

    //Our favourite subject.正确答案
    public void clickFavouriteSubject() {
        driver.findElementByXPath("//android.view.View[@text='Our favourite subject.']").click();
    }

    /**
     * ▁▁▁the snake cute? No, It▁▁▁. It's scary.相关答案
     */
    public boolean isSnakeCute() {
        MobileElement element = driver.findElementByXPath("//android.view.View[contains(@text,'snake cute')]");
        return isPresent(element);
    }

    //Is; aren't
    public void clickIsArent() {
        driver.findElementByXPath("//android.view.View[contains(@text,'Is; aren')]").click();
    }
    //Is; isn't
    public void clickIsIsnt(){
        driver.findElementByXPath("//android.view.View[contains(@text,'Is; isn')]").click();
    }

    /**
     *
     *
     */


}
