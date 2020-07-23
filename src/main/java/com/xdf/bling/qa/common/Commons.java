package com.xdf.bling.qa.common;


public class Commons {

    /**
     * @version v1.0
     * @ProjectName: autoTest
     * @ClassName: excuteShell
     * @Description: TODO(一句话描述该类的功能)
     * @Author: 王雪松
     * @Date: 2020/7/23 15:03 下午
     */
    public static Process excuteShell(String s) {
        Process proc = null;
        Runtime runtime = Runtime.getRuntime();
        try {
            proc = runtime.exec(s);
        } catch (Exception e) {
            System.out.print("执行命令:" + s + "出错啦！");
            return null;
        }
        return proc;
    }
    //endregion

}
