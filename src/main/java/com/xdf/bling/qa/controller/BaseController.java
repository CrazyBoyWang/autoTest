package com.xdf.bling.qa.controller;

import com.xdf.bling.qa.util.XmlParse;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import com.xdf.bling.qa.common.*;

import java.io.IOException;
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
public class BaseController {

    AppiumDriverLocalService appiumService;
    protected static AndroidDriver<MobileElement> driver;

    @Parameters(value = {"port"})
    //建议需要安装输入法
    @BeforeTest(description = "初始化appium服务")
    public void setUp(String port) throws Exception {
        //获取设备ID
        get_devices_info test = new get_devices_info();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "MI 9 SE");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", "true");//是否重头开始
        capabilities.setCapability("udid", test.get_all_devices());
        capabilities.setCapability("appPackage", "com.blingabc.student");
        capabilities.setCapability("appActivity", "com.blingabc.student.MainActivity");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("unicodeKeyboard", "true");
        capabilities.setCapability("resetKeyboard", "true");
        appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(Integer.parseInt(port)));
        appiumService.start();
        driver = new AndroidDriver<MobileElement>(appiumService, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest(alwaysRun = true, description = "关闭appium服务")
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
        if (appiumService != null) {
            appiumService.stop();
        }
    }

    @DataProvider
    public Object[][] providerMethod(Method method) {
        Object[][] result = null;
        Map<String, String> data = XmlParse.getData(method.getName());
        result = new Object[][]{new Object[]{data}};
        return result;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

}
