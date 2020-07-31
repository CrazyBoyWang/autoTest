package com.xdf.bling.qa.listener;

import com.xdf.bling.qa.controller.AlertByPageController;
import org.testng.IRetryAnalyzer;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: AlertPageListener
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/7/28 8:14 下午
 */

public class AlertPageListener implements IRetryAnalyzer, ITestNGListener {

    private static int retryCount = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {
        AlertByPageController alertByPageController = new AlertByPageController();
        //最大重试次数
        int maxRetryCount = 3;
        if(retryCount< maxRetryCount && iTestResult.getThrowable()instanceof java.net.ConnectException){

            alertByPageController.testAlertByPage();

            //判断用例执行中抛出的异常如果属于链接超时异常的子类，就重试三次；此处判断条件可根据自身需求来设定重试的条件

            retryCount++;
            return true;
        }
        return false;
    }
}