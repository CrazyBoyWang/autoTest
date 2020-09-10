package com.xdf.bling.qa.android.page.mine;


import com.xdf.bling.qa.android.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: FeedBackPage
 * @Description: 我的-意见反馈
 * @Author: 王雪松
 * @Date: 2020/8/07 10:28 上午
 */

public class FeedBackPage extends BasePage {
    public FeedBackPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }


    /**
     * 点击进入意见反馈
     */
    public void clickFeedBackPage() {
//        int x = 434;
//        int y = 810;
        driver.findElementByXPath("//android.view.View[@text='意见反馈']").click();

        //       MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的课程']");

    }

    /**
     * 判断进入收货地址
     */
    public boolean isFeedBackPage() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='问题与反馈']");
        return isPresent(element);
    }

    /**
     * 点击意见反馈
     */

    public void clickFeedBack() {
        driver.findElementByXPath("//android.view.View[@text='意见反馈']").click();

    }

    /**
     *
     * 选择问题类型
     */

    public void clickType(){
        driver.findElementByXPath("//android.view.View[@text='学习问题']").click();
    }


    /**
     * 点击反馈图片
     */
    public void clickFeedImage() {
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.ImageView").click();
        driver.findElementByXPath("//*[@resource-id='com.android.documentsui:id/dir_list']/android.widget.LinearLayout[1]").click();
    }
    /**
     *
     * 输入问题内容
     *
     * @param problem
     */
    public void clickEnterProblem(String problem){
        MobileElement element = driver.findElementByXPath("//android.widget.EditText[@text='您的反馈将会是我们最大的动力']");
        actionSendkeys(element, problem, false, false);
    }

    /**
     *
     * 点击提交
     */

    public void clickEnter(){
        driver.findElementByXPath("//android.widget.Button[@text='提交']").click();

    }

    /**
     *
     *
     * 判断提交成功信息
     */
    public boolean isEnterScuess(){
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='反馈提交成功！感谢您的反馈！']");
        return isPresent(element);
    }

    /**
     * 提交成功点击确定
     *
     */
    public void clickSuccess(){
        driver.findElementByXPath("//android.widget.Button[@text='确定']").click();
    }

    /**
     *
     * 点击我的反馈
     *
     */
    public void clickMyFeedBack(){
        driver.findElementByXPath("//android.view.View[@text='我的反馈']").click();
    }



}
