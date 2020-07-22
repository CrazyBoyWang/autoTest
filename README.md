├── README.md
├── allure-results
├── autoTest.iml
├── pom.xml
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── xdf
│       │           └── bling
│       │               └── qa
│       │                   ├── MainTest.java   -->主函数
│       │                   ├── bean    -->工具类
│       │                   │   └── Login.java  -->登录配置
│       │                   ├── controller  -->控制器
│       │                   │   ├── BaseController.java --> 初始化appium
│       │                   │   ├── ConsumerTest.java   --> 账户信息配置
│       │                   │   ├── login               -->登录模块
│       │                   │   │   └── LoginCrontroller.java   
│       │                   │   └── mine                 -->我的模块
                                    ├──LogisticsMsgController.java  -->我的，物流信息
│       │                   │       ├── MineController.java     -->我的，头像信息页面
│       │                   │       └── SettingController.java  -->我的，设置页面
│       │                   ├── listener
│       │                   │   └── TestngListener.java     -->日志监听工具
│       │                   ├── page                    -->实际操作
│       │                   │   ├── BasePage.java       -->通用操作功能
│       │                   │   ├── home
│       │                   │   │   └── HomePage.java   -->首页、消息、我的、配置信息
│       │                   │   ├── login
│       │                   │   │   └── LoginPage.java  -->登录操作
│       │                   │   └── mine
                                    ├──LogisticsMsgPage.java  -->我的，物流信息
│       │                   │       ├── MinePage.java   -->我的账户信息操作
│       │                   │       └── SettingPage.java    -->我的设置操作
│       │                   ├── service                 -->构建执行服务
│       │                   │   ├── home
│       │                   │   │   └── HomeService.java 
│       │                   │   ├── login
│       │                   │   │   └── LoginService.java
│       │                   │   └── mine
                                    ├──LogisticsMsgService.java  -->我的，物流信息
│       │                   │       ├── MineService.java
│       │                   │       └── SettingService.java
│       │                   └── util                    -->配置包相关
│       │                       ├── PathUtil.java       -->打包工具
│       │                       ├── TypewritingUtil.java    -->输入法工具
│       │                       └── XmlParse.java       -->参数获取工具
│       └── resources
│           ├── data.xml
│           ├── testng
│           │   ├── login.xml
│           │   └── mine
│           │       ├── mine.xml
│           │       └── setting.xml
│           ├── testnode1.json
│           └── testnode2.json