package com.xdf.bling.qa.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class get_devices_info {
    //region 初始化

    /**
     * @version v1.0
     * @ProjectName: autoTest
     * @ClassName: get_all_devices
     * @Description: TODO(获取devices)
     * @Author: 王雪松
     * @Date: 2020/7/23 15:03 下午
     */
    public static String get_all_devices() throws Exception {
        ArrayList<String> list = null;
        Process process;
        BufferedReader reader;
        String line = null;
        String device_tpye;
        Commons commons = new Commons();
        try {
            list = new ArrayList<String>();
            //设置adb.exe存放路径，如果设置了环境变量，直接输入adb即可
            String adb_path = "adb";
            //执行adb device操作，查看pc当前连接手机或模拟器设备列表
            //注意：一定要先配置好sdk环境变量，否则无法直接执行adb命令
            process = commons.excuteShell(adb_path + " devices -l");
            if (process != null) {
                reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    if (line.length() > 1) {
                        list.add(line);
                    }
                }
                if (!list.contains("* daemon started successfully *")) {
                    if (list != null && list.size() > 1) {
                        if (!list.contains("device")) {
                            for (int i = 1; i < list.size(); i++) {
                                for (int j = 0; j < list.get(i).split(" ").length; j++) {
                                    //获取手机设备连接状态，目前状态有：device(正常)、offline、unauthorized
                                    device_tpye = list.get(i).split(" ")[j];
                                    //判断当前设备状态是否正常
                                    if (device_tpye.equals("device")) {
                                        //获取设备序列号
                                        String device_sn = list.get(i).split(" ")[0];
				/*							//获取设备产品名
											String device_product = list.get(i).split(" ")[8];
											//获取设备型号
											String device_model = list.get(i).split(" ")[9];
											//获取设备名称
											String device_name = list.get(i).split(" ")[10];*/
                                        System.out.println("当前设备名称为:" + device_sn);

                                        String shell = adb_path + " -s " + device_sn + " shell cat /system/build.prop /| grep 'ro.build.version.release'";
                                        process = commons.excuteShell(shell);
                                        if (process != null) {
                                            reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                                            line = null;
                                            while ((line = reader.readLine()) != null) {
                                                if (line.indexOf("ro.build.version.release") != -1) {
                                                    //获取设备版本号
                                                    String device_version = line.split("=")[1];
                                                    System.out.println("当前系统版本号为:" + device_version);
                                                }
                                            }
                                        }
                                        return device_sn;
                                    }
                                }
                            }
                        } else {
                            System.out.println("当前设备列表中，没有device类型连接设备，请检查！");
                        }
                    } else {
                        System.out.println("当前设备列表没有连接的设备，请检查！");
                    }
                } else {
                    get_all_devices();
                }
            } else {
                System.out.println("当前执行adb命令异常，请检查adb环境！");
            }
        } catch (IOException e) {
            System.err.println("IOException" + e.getMessage());
            return null;
        }
        return null;
    }
}
