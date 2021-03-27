# 团队第二次作业github编程实战 
## 1. 基本功能描述
* 会议网站展示会议议程和分论坛信息，包括分论坛议题、主席和召开时间等；
* 普通参会者注册时需选择参加的分论坛，可以选择参加一个或多个分论坛；
* 会议主席、分论坛主席登录系统后，能了解会议、分论坛的参会人数；秘书可以获取全部参会者信息；分论坛主席、秘书负责发布分论坛相关消息通知；
* 普通参会者注册通过后，登录系统后，将收到所选择参加分论坛的信息推送。
* （附加）加入多语言支持。
## 2. 开发环境
> 后端采用springboot框架 JDK1.8
> 
> 前端采用采用webstorm环境 技术栈：vue
## 3. 使用方法
通过阿里云网页提供远程连接服务器
## 4. 项目代码结构
```
├─frontend_meetingsystem
│  ├─public
│  └─src
│      ├─assets
│      │  ├─css
│      │  ├─icon
│      │  └─lang
│      ├─components
│      │  ├─chart
│      │  ├─index
│      │  └─secretary
│      ├─router
│      ├─store
│      └─views
│          └─index
└─worktwo
    ├─.settings
    ├─src
    │  ├─main
    │  │  ├─java
    │  │  │  └─team
    │  │  │      └─worktwo
    │  │  │          ├─Controller
    │  │  │          ├─dao
    │  │  │          └─pojo
    │  │  └─resources
    │  └─test
    │      └─java
    │          └─team
    │              └─worktwo
    └─target
        ├─classes
        │  ├─META-INF
        │  │  └─maven
        │  │      └─team
        │  │          └─worktwo
        │  └─team
        │      └─worktwo
        │          ├─Controller
        │          ├─dao
        │          └─pojo
        └─test-classes
            └─team
                └─worktwo
```
## 5. 常见问题说明
服务器中断运行项目