package com.xdf.bling.qa.listener;

import com.xdf.bling.qa.BaseController;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;

public class TestngListener extends TestListenerAdapter {
    private DriverManager Screenshot;

    @Override
    public void onTestFailure(ITestResult tr) {
        AppiumDriver driver = BaseController.getDriver();
        File location = new File("screenshots");
        String screenShotName = location.getAbsolutePath() + File.separator + tr.getMethod().getMethodName() + ".png";
       System.out.println("图拍呢地址"+screenShotName);
        File screenShot = driver.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File(screenShotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            Allure.addAttachment("失败截图",new FileInputStream(screenShotName));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}