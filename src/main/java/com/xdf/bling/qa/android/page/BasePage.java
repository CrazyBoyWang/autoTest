package com.xdf.bling.qa.android.page;

import com.xdf.bling.qa.util.TypewritingUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
     */
    protected boolean isPresent(MobileElement element) {
        try {
            MobileElement ele = element;
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //系统退出按钮
    public void clickSystemBack() {
        driver.navigate().back();

    }

    //后退按钮
    public void clickBack() {
        MobileElement element = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView\n");
        element.click();
    }

    /**
     * 点击首页tab
     */
    public void clickHomePageTab() {
        MobileElement homePageElement = driver.findElementByXPath("//android.widget.ImageView[@content-desc='首页\n" +
                "第 1 个标签，共 3 个']");
    }

    /**
     * 点击消息tab
     */
    public void clickMessageTab() {
        MobileElement mobileElement = driver.findElementByXPath("//android.widget.ImageView[@content-desc='学习\n" +
                "第 2 个标签，共 3 个']");
        mobileElement.click();
    }

    /**
     * 点击我的tab
     */
    public void clickMineTab() {
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='我的\n" +
                "第 3 个标签，共 3 个']").click();
    }

    /**
     * 退回课堂
     */
    public void clickBackClass() {
        MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        //       MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='我的课程']");
        int[] center = site(element);
        new TouchAction<>(driver).tap(PointOption.point(center[0] - 20, center[1] - 20)).perform();
    }

    /**
     * 小课堂内返回按钮
     */
    public void clickBackInClass() {
    //    MobileElement element = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]");
   //     int[] center = site(element);
        //      new TouchAction<>(driver).tap(PointOption.point(center[0]/2, center[1]/2)).perform();
        new TouchAction<>(driver).tap(PointOption.point(134, 121)).perform();
    }

    /**
     * 课程学习完成点击下一步
     */

    public void clickNextLevel() {
        driver.findElementByXPath("//android.view.View[@content-desc='下一关']").click();
    }

    /**
     * 根据元素获取坐标位置
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
     * 轮轮看/知识小预热/复习，点击向前/
     */

    public void clickAhead() {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[6]\n").click();
    }

    /**
     * 轮轮看/知识小预热复习，点击向后
     */
    public void clickBackWard() {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]\n").click();

    }


    /**
     * 判断学习完成
     */
    public boolean isAroundFinish() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@content-desc='恭喜你，完成了本关卡']");

        return isPresent(element);

    }


    /**
     * 判断toast出现
     *
     * @param toast
     */
    protected boolean isShowToast(String toast) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            WebElement target = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@content-desc,'" + toast + "')]")));
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
        TouchAction touchAction = new TouchAction(driver);
        if (element == null) {
            int width = driver.manage().window().getSize().width;
            int height = driver.manage().window().getSize().height;
            int y1 = height * 3 / 4;
            int y2 = height / 4;
            int x1 = width * 3 / 4;
            int x2 = width / 4;
            switch (direction) {
                case UP:
                    touchAction.longPress(PointOption.point(width / 2, y1)).moveTo(PointOption.point(width / 2, y2)).release().perform();
                    break;
                case DOWN:
                    touchAction.longPress(PointOption.point(width / 2, y2)).moveTo(PointOption.point(width / 2, y1)).release().perform();
                    break;
                case LEFT:
                    touchAction.longPress(PointOption.point(x1, height / 2)).moveTo(PointOption.point(x2, height / 2)).release().perform();
                    break;
                case RIGHT:
                    touchAction.longPress(PointOption.point(x2, height / 2)).moveTo(PointOption.point(x1, height / 2)).release().perform();
                    break;
            }
            return;
        }

        int pointX = element.getSize().getWidth();
        int pointY = element.getSize().getHeight();
        System.out.println("控件X；" + pointX + "控件Y：" + pointY);
        switch (direction) {
            case LEFT:
                touchAction.longPress(PointOption.point(pointX * 3 / 4, pointY / 2)).moveTo(PointOption.point(pointX / 4, pointY / 2)).release().perform();
                break;
            case RIGHT:
                touchAction.longPress(PointOption.point(pointX / 4, pointY / 2)).moveTo(PointOption.point(pointX * 3 / 4, pointY / 2)).release().perform();
                break;
            case DOWN:
                touchAction.longPress(PointOption.point(pointX / 2, pointY / 4)).moveTo(PointOption.point(pointX / 2, pointY * 3 / 4)).release().perform();
                break;
            case UP:
                touchAction.longPress(PointOption.point(pointX / 2, pointY * 3 / 4)).moveTo(PointOption.point(pointX / 2, pointY / 4)).release().perform();
                break;
        }
    }


    protected enum Direction {
        UP, DOWN, LEFT, RIGHT
    }
}
