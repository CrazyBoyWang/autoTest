package com.xdf.bling.qa.android.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: BasePage
 * @Description: 所有弹窗信息
 * @Author: 王雪松
 * @Date: 2020/7/24 7:07 下午
 */
public class AlertByPage extends BasePage {
    public AlertByPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

//    public AlertByPage (AndroidDriver<MobileElement> driver) {
//        this.driver = driver;
//    }



    /**
     * 切换课程类型提示
     */
    public void clickSwitchingCourses() {
        MobileElement element = driver.findElementByXPath("//com.blingabc.student[@text='在这里切换「课程类型」和「等级」']");

        element.click();
    }

    public boolean isSwitchingCourses(String switchingCourses) {
        MobileElement element = driver.findElementByXPath("//com.blingabc.student[@text='在这里切换「课程类型」和「等级」']");
        String text = element.getText();
        return switchingCourses.equals(text);
    }


    /**
     * 华为app系统权限申请
     */
    public void clickPhotoRights() {
        MobileElement element = driver.findElementByXPath("//com.lbe.security.miui[@text='允许']");
        element.click();
    }

    //判断循环3个
    public boolean isPhotoRights(String photoRights) {
        MobileElement element = driver.findElementByXPath("//com.lbe.security.miui[@text='要允许 比邻外教 访问以下权限吗？']");
        String text = element.getText();
        return photoRights.equals(text);
    }
    /**
     * oppo系统权限申请
     *
     * 后续根据手机型号来判断
     */


    /**
     * 判断协议配置存在
     *
     * @return
     */
//    public boolean isAgreement(String agreement){
//            MobileElement element = driver.findElementByXPath("android.view.View[@text='隐私政策以及用户协议']");
//            String text = element.getText();
//            return agreement.equals(text);
//        }
    public boolean isAgreement() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='隐私政策以及用户协议']");
        return isPresent(element);
    }

    /**
     * 登录隐私政策以及用户协议
     */
    public void clickAgreement() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='同意并继续']");
        element.click();
    }

    /**
     * 首页首次登录操作教程--学习中心
     */

    public void clickHomePageTipsLr() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='预习，复习，监课，回放，\n" +
                "都在[学习中心]哦']");
        element.click();
    }

    public boolean isHomePageTipsLr() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='预习，复习，监课，回放，\n" +
                "都在[学习中心]哦']");
        return isPresent(element);

    }


    //首页课表操作教程

    public void clickTimetableCourse() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='哪天有课程？来[课表]查看~']");
        element.click();
    }

    public boolean isTimetableCourse() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='哪天有课程？来[课表]查看~']");
        return isPresent(element);
    }


    /**
     * XXX挑战了你的进度弹窗
     */
    public void clickChallengeProgress() {
        MobileElement element = driver.findElementByXPath("//com.blingabc.student[contains(@text,'挑战了你的进度')]");
        element.click();
    }

    public boolean isChallengeProgress(String challengeProgress) {
        MobileElement element = driver.findElementByXPath("//com.blingabc.student[contains(@text,'挑战了你的进度')]");
        String text = element.getText().split("了")[1].trim();
        return challengeProgress.equals(text);
    }



    /**
     * 请选择宝贝
     *
     *
     *
     */

    public boolean isBabyGenome() {
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='请选择要登陆的学员']");
        return isPresent(element);

    }

    public void clickBabyGenome() {
        //默认选择第一个
        MobileElement element = driver.findElementByXPath("//android.view.View[@text='请选择要登陆的学员']/following-sibling::android.view.View[1]/android.view.View/android.view.View");
        element.click();

        MobileElement elementEnter = driver.findElementByXPath("//android.view.View[@texgt='确定']");
        elementEnter.click();

    }


    /**
     *
     * 完善宝贝信息
     */
    public boolean isBabyInformation(){
        MobileElement element  = driver.findElementByXPath("//android.view.View[@text='完善宝贝信息']");
       return isPresent(element);
    }

    public void clickBabyInformation(String babytest){
        MobileElement element  = driver.findElementByXPath("//android.view.View[@text='完善宝贝信息']");
        actionSendkeys(element, babytest, false, false);

    }
    public void enterBabyInformation(){
        MobileElement enterInformation = driver.findElementByXPath("//android.view.View[@text='确定']");
        enterInformation.click();

    }








}
