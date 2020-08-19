package com.xdf.bling.qa.controller.learncenter.previewcapsule;

import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.learncenter.previewcapsule.ReviewDaLeDouPage;
import com.xdf.bling.qa.service.learncenter.previewcapsule.ReviewDaLeDouService;
import org.testng.annotations.Test;

/**
 * @author: wangxuesong
 * @description:TODO
 * @date: 2020/8/18 10:57 上午
 */
public class ReviewDaLeDouController extends BaseController {
    @Test(description="学习中心-复习大乐斗",priority = 1)
    public void testReviewDaLeDouController() throws InterruptedException {
        ReviewDaLeDouPage reviewDaLeDouPage = new ReviewDaLeDouPage(driver);
        ReviewDaLeDouService reviewDaLeDouService = new ReviewDaLeDouService(reviewDaLeDouPage);
       reviewDaLeDouService.reviewDaLeDouService();
        //Language Review相关操作
        reviewDaLeDouService.languageReviewService();
        //Pronunciation Fun
    //    reviewDaLeDouService.pronunciationFunService();
        //学霸养成记
        reviewDaLeDouService.learnToBeBullyService();
        //Small Talk Quiz
        reviewDaLeDouService.smallTalkQuizService();

    }
}
