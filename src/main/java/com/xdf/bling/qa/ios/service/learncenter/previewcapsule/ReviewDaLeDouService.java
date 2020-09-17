package com.xdf.bling.qa.ios.service.learncenter.previewcapsule;

import com.xdf.bling.qa.ios.page.learncenter.previewcapsule.ReviewDaLeDouPage;
import org.testng.Assert;

import static java.lang.Thread.sleep;

/**
 * @author: wangxuesong
 * @description:TODO
 * @date: 2020/8/18 10:54 上午
 */
public class ReviewDaLeDouService {
    private final ReviewDaLeDouPage reviewDaLeDouPage;

    public ReviewDaLeDouService(ReviewDaLeDouPage reviewDaLeDouPage) {
        this.reviewDaLeDouPage = reviewDaLeDouPage;
    }

    /**
     * 赞过我戳过我
     *
     * @throws InterruptedException
     */
    public void reviewDaLeDouService() throws InterruptedException {
        sleep(2000);
        reviewDaLeDouPage.clickReviewDaLeDou();
        reviewDaLeDouPage.clickPraiseMe();
        reviewDaLeDouPage.goBack();
        reviewDaLeDouPage.clickStabbedMe();
        reviewDaLeDouPage.goBack();
    }

    /**
     * Language Review相关操作
     */
    public void languageReviewService() throws InterruptedException {
        sleep(5000);
        reviewDaLeDouPage.clickLanguageReview();
        sleep(5000);
        reviewDaLeDouPage.autoReview();
//        reviewDaLeDouPage.clickLanguageReview();
//        for (int i = 0; i < 18; i++) {
//            sleep(4000);
//            reviewDaLeDouPage.clickAhead();
//        }

        reviewDaLeDouPage.clickAutoStart();
        reviewDaLeDouPage.clickCrossAuto();
        Assert.assertTrue(reviewDaLeDouPage.isAroundFinish(), "获取闯关完成失败");
        reviewDaLeDouPage.clickNextLevel();
    }

    /**
     * Pronunciation Fun
     */
//    public void pronunciationFunService() throws InterruptedException {
//        for (int i = 0; i < 7; i++) {
//            reviewDaLeDouPage.clickSelfVoice();
//            Thread.sleep(4000);
//            reviewDaLeDouPage.clickMyVoice();
//     //       Assert.assertTrue(reviewDaLeDouPage.isScore(), "判断打分失败");
//            Thread.sleep(10000);
//            reviewDaLeDouPage.test();
//            reviewDaLeDouPage.clickAhead();
//
//
//        }
//    }

    /**
     * 学霸养成记
     */
    public void learnToBeBullyService() throws InterruptedException {
        reviewDaLeDouPage.clickNextLevel();
        sleep(1000);
        Assert.assertTrue(reviewDaLeDouPage.isFinshVideo(), "视频未读取完成或读取失败");
        reviewDaLeDouPage.clickFinshVideo();
        Assert.assertTrue(reviewDaLeDouPage.isAroundFinish());
       // reviewDaLeDouPage.clickNextLevel();
        reviewDaLeDouPage.clickBackInClass();
    }

    /**
     * Small Talk Quiz
     */
    public void smallTalkQuizService() throws InterruptedException {
        sleep(3000);
        reviewDaLeDouPage.swipSmallTalkQuiz();
        sleep(5000);
        reviewDaLeDouPage.clickSmallTalkQuiz();
        Assert.assertTrue(reviewDaLeDouPage.isCorrectAnswer(), "进入Small成功");
        reviewDaLeDouPage.clickOurHobbies();
        sleep(5000);
        reviewDaLeDouPage.clickFavouriteSubject();
        sleep(5000);
        reviewDaLeDouPage.clickIsArent();
        sleep(3000);
        reviewDaLeDouPage.clickIsIsnt();
        sleep(1000);


    }


}
