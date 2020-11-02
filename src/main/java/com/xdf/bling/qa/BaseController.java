package com.xdf.bling.qa;

import com.xdf.bling.qa.android.controller.AlertByPageController;
import com.xdf.bling.qa.common.Get_devices_info;
import com.xdf.bling.qa.listener.TestngListener;
import com.xdf.bling.qa.util.XmlParse;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.BufferedReader;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: BaseController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/7/15 7:19 下午
 */
@Listeners(TestngListener.class)

public class BaseController {
    BufferedReader reader;
    public static OS executionOS = OS.IOS;

    public static AppiumDriver getDriver() {
        return driver;
    }

    public enum OS {
        ANDROID,
        IOS,
        ANDROID_BROWSERSTACK,
        IOS_BROWSERSTACK
    }

    public static AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService appiumService;

    @Parameters(value = {"port"})
    //建议需要安装输入法
    @BeforeTest(description = "初始化appium服务")

    public void setUp(String port) throws Exception {
        Get_devices_info map = new Get_devices_info();
        String udid = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
    try {

        Map map1 = map.get_all_devices();

        for (Object key : map1.keySet()) {
            String value = (String) map1.get(key);
            System.out.println(key + "    " + value);
            if (value.equals("ANDROID")) {
                executionOS = OS.ANDROID;
            } else {
                executionOS = OS.IOS;
            }
            udid = (String) key;
        }
    }catch (Exception e){
        System.err.println("获取手机信息失败" + e.getMessage());
    }
        //       Sy


        switch (executionOS) {
            case ANDROID:
                //获取设备ID


                capabilities.setCapability("deviceName", "MI 9 SE");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("noReset", "true");//是否重头开始
                capabilities.setCapability("udid",udid);
                //设置是否跳过安装驱动包skipServerInstallation
                capabilities.setCapability("skipServerInstallation","true");
                capabilities.setCapability("appPackage", "com.blingabc.student");
                capabilities.setCapability("appActivity", "com.blingabc.student.MainActivity");
                capabilities.setCapability("automationName", "uiautomator2");
                capabilities.setCapability("unicodeKeyboard", "true");//使用unicode编码方式发送字符串
                capabilities.setCapability("resetKyboard", "true");//键盘隐藏起来
                appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(Integer.parseInt(port)));
                appiumService.start();
                driver = new AndroidDriver(appiumService, capabilities);
                AlertByPageController alertByPageController = new AlertByPageController();
                break;
            case IOS:
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 8");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.7.1");
                capabilities.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, "314158893@qq.com");
                capabilities.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID, "iPhone Developer");
                capabilities.setCapability(MobileCapabilityType.APP, "com.blingabc.student");
                capabilities.setCapability("appActivity", "com.blingabc.student.MainActivity");
                capabilities.setCapability("unicodeKeyboard", "true");//使用unicode编码方式发送字符串
                capabilities.setCapability("resetKyboard", "true");//键盘隐藏起来
                capabilities.setCapability(MobileCapabilityType.UDID, udid);

                appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(Integer.parseInt(port)));
                appiumService.start();
                driver = new IOSDriver(appiumService, capabilities);
                break;

        }
        //隐式等待
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //流畅等待

//        FluentWait<MobileDriver> fluentWait = new FluentWait<MobileDriver>((AndroidDriver<MobileElement>) driver)
//                .withTimeout(2, TimeUnit.SECONDS)
//                .pollingEvery(1,TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);
        //     fluentWait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//android.view.View[@text='密码登录']"))).click();


    }

    @AfterTest(alwaysRun = true, description = "关闭appium服务")
    public void tearDown() throws Exception {
        if (driver != null) {
            //     driver.quit();
        }
        if (appiumService != null) {
            appiumService.stop();
        }
// 生成报告命令
//        Process result = Commons.excuteShell("allure generate report/ -o report/html --clean");
//        assert result != null;
//        reader = new BufferedReader(new InputStreamReader(result.getInputStream()));
//        System.out.println("清理并生成测试报告：" + reader.readLine());
    }

    @DataProvider
    public Object[][] providerMethod(Method method) {
        Object[][] result = null;
        Map<String, String> data = XmlParse.getData(method.getName());
        result = new Object[][]{new Object[]{data}};
        return result;
    }

}