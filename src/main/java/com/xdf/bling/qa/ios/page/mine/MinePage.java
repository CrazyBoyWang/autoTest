package com.xdf.bling.qa.ios.page.mine;

import com.xdf.bling.qa.ios.page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: HomePage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: liuzhanhui
 * @Date: 2020/6/16 4:06 下午
 */
public class MinePage extends BasePage {

    public MinePage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * 点击我的页面头像
     */
    public void clickMinePageHeaderImage () {
        driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n").click();
    }

    /**
     * 判断我的页面头像显示
     * @return
     */
    public boolean isShowMinePageHeaderImage () {
        MobileElement minePageHeaderImg = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]\n");
        return isPresent(minePageHeaderImg);
    }

    /**
     * 判断我的页面用户名显示
     * @return
     */
    public boolean isShowMinePageUserName () {
        MobileElement minePageHeaderUserName = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"账户信息\"]\n");
        return isPresent(minePageHeaderUserName);
    }


    /**
     * 判断宝贝页面头像显示
     * @return
     */
    public boolean isShowBabyPageHeaderImage () {
        MobileElement babyPageHeaderImage = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"头像\"]\n");
        return isPresent(babyPageHeaderImage);
    }

    /**
     * 点击baby页面头像
     */
    public void clickBabyPageHeaderImage () {
        MobileElement babyPageHeaderImage = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"头像\"]\n");
        babyPageHeaderImage.click();
    }

    /**
     * 点击从手机相册选
     */
    public void clickChooseHeaderFormMobileAlbum () throws InterruptedException {
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"从手机相册选择\"]\n").click();
        int x = 203;
        int y = 251;
        driver.findElementByXPath("//XCUIElementTypeCell[@name=\"所有照片\"]\n").click();
        Thread.sleep(3000);
        new TouchAction<>(driver).tap(PointOption.point(x, y)).perform();
    }

    /**
     * 判断更换头像成功toast出现
     * @return
     */
    public boolean changeHeaderImageSuccessToast () {
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"确定\"]\n").click();
        return isShowToast("头像更新成功");
    }


    /**
     * 判断宝贝页面生日显示
     * @return
     */
    public boolean isShowBabyPageBirthday () {
        MobileElement babyPageBirthday = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"出生日期\")]\n");
        return isPresent(babyPageBirthday);
    }

    /**
     * 判断宝贝页面英文名称显示
     * @return
     */
    public boolean isShowBabyPageEnglishName () {
        MobileElement babyPageEnglishName = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"英文名字\")]\n");
        return isPresent(babyPageEnglishName);
    }

    /**
     * 点击英文名称
     */
    public void clickBabyPageEnglishName () {
        MobileElement babyPageEnglishName = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"英文名字\")]\n");
        babyPageEnglishName.click();
    }

    /**
     * 获取英文名称
     */
    public String getBabyPageEnglishName () {
        MobileElement babyPageEnglishName = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"英文名字\")]\n");
        return babyPageEnglishName.getText().split("英文名字")[1].trim();

    }
    /**
     *
     * 删除文本内容
     */

    public void deleteTextField(){

    }

    /**
     * 判断宝贝页面中文名称显示
     * @return
     */
    public boolean isShowBabyPageChineseName () {
        MobileElement babyPageChineseName = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"中文名字\")]\n");
        return isPresent(babyPageChineseName);
    }

    /**
     * 点击中文名称
     */
    public void clickBabyPageChineseName () {
        MobileElement babyPageChineseName = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"中文名字\")]\n");
        babyPageChineseName.click();
    }

    /**
     * 点击输入框保存按钮
     */
    public void clickBabyPageTextInputSaveButton () {
    //    MobileElement babyPageTextEditorSaveButton = driver.findElementByXPath("//android.widget.Button[@text='保存']");
        MobileElement babyPageTextEditorSaveButton = driver.findElementByXPath("//XCUIElementTypeButton[@name=\"保存\"]\n");
        babyPageTextEditorSaveButton.click();
    }

    /**
     * 获取中文名称
     */
    public String getBabyPageChineseName () {
        MobileElement babyPageChineseName = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"中文名字\")]\n");
        return babyPageChineseName.getText().split("中文名字")[1].trim();
    }

    /**
     * 修改名称输入框
     */
    public void setBabyPageTextInput (String value, boolean isChinese) {

        MobileElement babyPageTextEditorInput = driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"请输入英文名\"]\n");
        babyPageTextEditorInput.clear();
        actionSendkeys(babyPageTextEditorInput, value, true, isChinese);
    }
    public void setBabyPageTextInputCN (String value, boolean isChinese) {

        MobileElement babyPageTextEditorInput = driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"请输入中文名\"]\n");
        babyPageTextEditorInput.clear();
        actionSendkeys(babyPageTextEditorInput, value, true, isChinese);
    }

    /**
     * 判断宝贝页面性别显示
     * @return
     */
    public boolean isShowBabyPageGender () {
        MobileElement babyPageGender = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"选择孩子的性别\")]\n");
        return isPresent(babyPageGender);
    }

    /**
     * 获取展示的性别
     * @return
     */
    public String getShowBabyPageGender () {
        MobileElement babyPageGender = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"选择孩子的性别\")]\n");
        return babyPageGender.getText().split("选择孩子的性别")[1].trim();
    }

    /**
     * 点击性别
     */
    public void clickBabyPageGender () {
        MobileElement babyPageGender = driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"选择孩子的性别\")]\n");
        babyPageGender.click();
    }

    /**
     * 点击选则男
     */
    public void clickGenderOfMale () {
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"男\"]\n").click();
    }

    /**
     * 点击选择女
     */
    public void clickGenderOfFemale () {
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"女\"]\n").click();
    }

    /**
     * 更新性别toast
     * @return
     */
    public boolean isShowBabyGenderupdateSuccessToast () {
        return isShowToast("宝贝信息更新成功");
    }

    /**
     * 点击我的信息tab
     */


    public void clickBabyInfoTab () {
       driver.findElementByXPath("//XCUIElementTypeOther[contains(@name,\"宝贝信息\")]\n").click();

    }


    public void clickMineInfoTab () {
        driver.findElementByXPath("//XCUIElementTypeOther[contains(@name,\"我的信息\")]\n").click();
    }

    /**
     * 是否存在用户姓名
     * @return
     */
    public boolean isExistUserName () {
        MobileElement mobileElement =  driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"用户姓名\")]\n");
        return mobileElement.getText().contains("用户姓名");
    }

    /**
     * 获取用户姓名
     * @return
     */
    public String getUserName () {
        MobileElement mobileElement =  driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"用户姓名\")]\n");
        return mobileElement.getText().split("用户姓名")[1].trim();
    }

    /**
     * 点击用户姓名
     * @return
     */
    public void clickUserName () {
        MobileElement mobileElement =  driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"用户姓名\")]\n");
        mobileElement.click();
    }

    /**
     * 判断更新成功的toast
     * @return
     */
    public boolean isShowUpdateSuccessToast () {
        return isShowToast("更新成功~");
    }

    /**
     * 获取手机号
     * @return
     */
    public String getPhone () {
        MobileElement mobileElement =  driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"手机号码\")]\n");
        return mobileElement.getText().split("手机号码")[1].trim();
    }

    /**
     * 获取所在地
     * @return
     */
    public String getLocation () {
        MobileElement mobileElement =  driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"所在地区\")]\n");
        return mobileElement.getText().split("所在地区")[1].trim();
    }

    /**
     * 点击所在地
     */
    public void clickLocation () {
        MobileElement mobileElement =  driver.findElementByXPath("//XCUIElementTypeImage[contains(@name,\"所在地区\")]\n");
        mobileElement.click();
    }

    public String getCityName () {
        MobileElement mobileElement =  driver.findElementByXPath("//android.widget.Button[@text='确定']/following-sibling::android.widget.SeekBar[1]");
        return mobileElement.getText().split("所在地区")[1].trim();
    }

    public void swipeCity () {
        MobileElement mobileElement =  driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"比邻外教\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]\n");
        System.out.println(mobileElement.getText());
        swipe(Direction.UP, mobileElement);
    }

    public void clickCity(){
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"确定\"]\n").click();
    }
}
