package com.xdf.bling.qa.page.learncenter.previewcapsule;


import com.xdf.bling.qa.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;


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
     *
     * 点掉课前预习弹窗
     *
     */
    public void clickClassPrepare(){
        driver.findElementByXPath("//android.view.View[@text='「课前预习」要在课前完成哦~']").click();
    }
    /**
     *
     * 点掉监课弹窗
     */
    public void clickClassSupervise(){
        driver.findElementByXPath("//android.view.View[@text='在这里可以「监课」也可以看 「课程回放」哦~']").click();
    }

    /**
     *
     * 点掉课后作业弹窗
     */
    public void clickHomeWork(){
        driver.findElementByXPath("//android.view.View[@text='「课后作业」，记得按时完成哦~']").click();
    }
    /**
     *
     * 滑动到预习小胶囊
     */
    public void swipeCapsule(){
     //   MobileElement element = driver.findElementByXPath("//android.view.View[@text='预习小锦囊']");
      MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]");
        swipe(Direction.RIGHT,element);
    }
    /**
     *
     * 点击进入预习小胶囊
     */
    public void clickCapsule(){
        driver.findElementByXPath("//android.view.View[@text='预习小锦囊']").click();
    }


    /**
     *
     * 点击赞过我
     *
     */
    public void clickPraiseMe(){
        driver.findElementByXPath("//android.widget.ImageView[@text='赞过我']").click();
    }

    /**
     *
     *点击戳过我
     *
     */
    public void clickStabbedMe(){
        driver.findElementByXPath("//android.widget.ImageView[@text='戳过我']").click();
    }

    /**
     *
     * 词句轮轮看
     */
    public void clickLookAround(){
        driver.findElementByXPath("//android.widget.ImageView[@text='词句轮轮看']").click();
    }


    /**
     *
     * 轮轮看点击向前
     *
     */

    public void clickAhead(){
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[6]").click();
    }

    /**
     *
     * 轮轮看点击向后
     */
    public void clickBackWard(){
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]").click();

    }

    /**
     *
     * 判断学习完成
     */
    public boolean isAroundFinish(){
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='恭喜你，完成了本关卡']");
        return isPresent(element);

    }
    /**
     *
     * 点击Word Fun
     *
     */

    public void clickWordFun(){
        driver.findElementByXPath("//android.widget.ImageView[@text='Word Fun']").click();
    }

    /**
     *
     * Word Fun点击下一步
     *
     *元素已经超出屏幕位置，需要想个办法修改下定位
     */
    public void  clickWordFunNext(){
        TouchAction touchAction = new TouchAction(driver);
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]");

        int[] center = site(element);
        touchAction.tap(PointOption.point(center[0], center[1])).perform();
    }





















}