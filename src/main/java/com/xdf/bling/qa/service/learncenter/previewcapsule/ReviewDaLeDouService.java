package com.xdf.bling.qa.service.learncenter.previewcapsule;

import com.xdf.bling.qa.page.learncenter.previewcapsule.ReviewDaLeDouPage;
import org.testng.Assert;

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
        Thread.sleep(2000);
        reviewDaLeDouPage.clickReviewDaLeDou();
        reviewDaLeDouPage.clickPraiseMe();
        reviewDaLeDouPage.clickBack();
        reviewDaLeDouPage.clickStabbedMe();
        reviewDaLeDouPage.clickBack();
    }

    /**
     * Language Review相关操作
     */
    public void languageReviewService() throws InterruptedException {
        reviewDaLeDouPage.clickLanguageReview();
        for (int i = 0; i < 18; i++) {
            Thread.sleep(4000);
            reviewDaLeDouPage.clickAhead();
        }
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
        Thread.sleep(1000);
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
        Thread.sleep(3000);
        reviewDaLeDouPage.swipSmallTalkQuiz();
        reviewDaLeDouPage.clickSmallTalkQuiz();
        Assert.assertTrue(reviewDaLeDouPage.isCorrectAnswer(), "进入Small成功");
        reviewDaLeDouPage.clickOurHobbies();
        Thread.sleep(1000);
        reviewDaLeDouPage.clickFavouriteSubject();
        Assert.assertTrue(reviewDaLeDouPage.isSnakeCute(), "进入snake cute失败");
        reviewDaLeDouPage.clickIsArent();
        reviewDaLeDouPage.clickIsIsnt();
        Thread.sleep(1000);


    }


}
