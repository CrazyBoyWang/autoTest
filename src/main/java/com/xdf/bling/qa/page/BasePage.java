package com.xdf.bling.qa.page;

import com.xdf.bling.qa.util.TypewritingUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: BasePage
 * @Description: 页面基本操作
 * @Author: liuzhanhui
 * @Date: 2020/6/15 7:07 下午
 */
public class BasePage {

    protected AndroidDriver<MobileElement> driver;

    public BasePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }
    TouchAction touchAction = new TouchAction(driver);

    /**
     * 模拟输入
     *
     * @param element
     * @param keys
     */
    protected void actionSendkeys(MobileElement element, String keys, boolean isClear, boolean isChinese) {
        element.click();
        if (isClear) {
            String text = element.getText();
            for (int i = 0; i < text.length() - 1; i++) {
                driver.pressKey(new KeyEvent(AndroidKey.DEL));
            }
        }
        if (isChinese) {
            TypewritingUtil.chineseSendKeys(keys);
            return;
        }
        Actions action = new Actions(driver);
        action.sendKeys(keys).perform();
    }

    /**
     * 判断元素出现
     *
     * @param element
     * @return
     */
    protected boolean isPresent(MobileElement element) {
        try {
            MobileElement ele = element;
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //后退按钮
    public void clickBack() {
        MobileElement element = driver.findElementByXPath("//android.widget.Button[1]");
        element.click();
    }

    /**
     * 点击首页tab
     */
    public void clickHomePageTab() {
        MobileElement homePageElement = driver.findElementByXPath("//android.widget.ImageView[@text='首页\n" +
                "第 1 个标签，共 3 个']");
    }

    /**
     * 点击消息tab
     */
    public void clickMessageTab() {
        MobileElement mobileElement = driver.findElementByXPath("//android.widget.ImageView[@text='消息\n" +
                "第 2 个标签，共 3 个']");
        mobileElement.click();
    }

    /**
     * 点击我的tab
     */
    public void clickMineTab() {
        driver.findElementByXPath("//android.widget.ImageView[@text='我的\n" +
                "第 3 个标签，共 3 个']").click();
    }

    /**
     *
     * 退回课堂
     */
    public void clickBackClass(){
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        //       MobileElement element = driver.findElementByXPath("//android.view.View[@text='我的课程']");
        int[] center = site(element);
        touchAction.tap(PointOption.point(center[0]-20, center[1]-20)).perform();
    }

    /**
     * 根据元素获取坐标位置
     *
     * @return
     */
    public int[] site(MobileElement element) {
        //获取元素开始标点
        Point site = element.getLocation();
        //获取元素标差
        Dimension q = element.getSize();
        //计算中间点坐标
        int[] center = new int[2];
        center[0] = q.getWidth() / 2 + site.getX();
        center[1] = q.getHeight() / 2 + site.getY();
        return center;

    }

    /**
     * 判断toast出现
     *
     * @param toast
     * @return
     */
    protected boolean isShowToast(String toast) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            WebElement target = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + toast + "')]")));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * 滑动
     *
     * @param direction
     * @param element
     */
    protected void swipe(Direction direction, MobileElement element) {

        if (element == null) {
            int width = driver.manage().window().getSize().width;
            int height = driver.manage().window().getSize().height;
            int y1 = height * 3 / 4;
            int y2 = height / 4;
            int x1 = width * 3 / 4;
            int x2 = width / 4;
            switch (direction) {
                case UP:
                    touchAction.longPress(PointOption.point(width / 2, y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200))).moveTo(PointOption.point(width / 2, y2)).release().perform();
                    break;
                case DOWN:
                    touchAction.longPress(PointOption.point(width / 2, y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200))).moveTo(PointOption.point(width / 2, y1)).release().perform();
                    break;
                case LEFT:
                    touchAction.longPress(PointOption.point(x1, height / 2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200))).moveTo(PointOption.point(x2, height / 2)).release().perform();
                    break;
                case RIGHT:
                    touchAction.longPress(PointOption.point(x2, height / 2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200))).moveTo(PointOption.point(x1, height / 2)).release().perform();
                    break;
            }
            return;
        }

        int pointX = element.getSize().getWidth();
        int pointY = element.getSize().getHeight();
        System.out.println("控件X；" + pointX + "控件Y：" + pointY);
        switch (direction) {
            case LEFT:
                touchAction.longPress(PointOption.point(pointX * 3 / 4, pointY / 2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200))).moveTo(PointOption.point(pointX / 4, pointY / 2)).release().perform();
                break;
            case RIGHT:
                touchAction.longPress(PointOption.point(pointX / 4, pointY / 2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200))).moveTo(PointOption.point(pointX * 3 / 4, pointY / 2)).release().perform();
                break;
            case DOWN:
                touchAction.longPress(PointOption.point(pointX / 2, pointY / 4)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200))).moveTo(PointOption.point(pointX / 2, pointY * 3 / 4)).release().perform();
                break;
            case UP:
                touchAction.longPress(PointOption.point(pointX / 2, pointY * 3 / 4)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(pointX / 2, pointY / 4)).release().perform();
                break;
        }
    }



    protected enum Direction {
        UP, DOWN, LEFT, RIGHT
    }
}
