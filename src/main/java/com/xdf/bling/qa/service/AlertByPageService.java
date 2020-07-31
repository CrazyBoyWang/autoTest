package com.xdf.bling.qa.service;

import com.xdf.bling.qa.page.AlertByPage;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: AlertByPageService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/7/27 5:13 下午
 */
public class AlertByPageService {

    private final AlertByPage alertByPage;

    public AlertByPageService(AlertByPage alertByPage) {
        this.alertByPage = alertByPage;
    }

    public void alertByPageService(String switchingCourses, String photoRights, String challengeProgress, String babyTest) {

        if (alertByPage.isAgreement()) {
            alertByPage.clickAgreement();
        } else if (alertByPage.isTimetableCourse()) {
            alertByPage.clickTimetableCourse();
        } else if (alertByPage.isChallengeProgress(challengeProgress)) {
            alertByPage.clickChallengeProgress();
        } else if (alertByPage.isHomePageTipsLr()) {
            alertByPage.clickHomePageTipsLr();
        } else if (alertByPage.isPhotoRights(photoRights)) {
            alertByPage.clickPhotoRights();
        } else if (alertByPage.isSwitchingCourses(switchingCourses)) {
            alertByPage.clickSwitchingCourses();
        } else if (alertByPage.isBabyGenome()) {
            alertByPage.clickBabyGenome();
        } else if (alertByPage.isBabyInformation()) {
            alertByPage.clickBabyInformation(babyTest);
            alertByPage.enterBabyInformation();
        }
    }
}
