package com.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * <p>
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2018年01月11日)
 * @version 1.0
 * @fileName BookInfos.java
 */
public class BookInfos implements Serializable{

    /**
     * count : 10
     * start : 0
     * total : 14
     * books : [{"rating":{"max":10,"numRaters":7,"average":"0.0","min":0},"subtitle":"Lightweight Client-Server Communications","author":["Andrew Lombardi"],"pubdate":"2015-9-26","tags":[{"count":8,"name":"WebSocket","title":"WebSocket"},{"count":8,"name":"JavaScript","title":"JavaScript"},{"count":5,"name":"HTML5","title":"HTML5"},{"count":3,"name":"前端","title":"前端"},{"count":2,"name":"前端开发","title":"前端开发"}],"origin_title":"WebSocket","image":"https://img3.doubanio.com/mpic/s28344064.jpg","binding":"Paperback","translator":[],"catalog":"","pages":"144","images":{"small":"https://img3.doubanio.com/spic/s28344064.jpg","large":"https://img3.doubanio.com/lpic/s28344064.jpg","medium":"https://img3.doubanio.com/mpic/s28344064.jpg"},"alt":"https://book.douban.com/subject/26261876/","id":"26261876","publisher":"O'Reilly Media","isbn10":"1449369278","isbn13":"9781449369279","title":"WebSocket","url":"https://api.douban.com/v2/book/26261876","alt_title":"WebSocket","author_intro":"For the last 5 years, Andrew Lombardi has bounced all over North America and Europe giving dozens of talks at conferences about topics ranging from backend Java development to HTML5 to building for mobile using only JavaScript and many more.","summary":"HTML5 WebSockets offer app developers a much smaller and more efficient way of communicating than classic HTTP for smoother, faster, and full-duplex communication with the server. With this practical book, you\u2019ll learn how to take advantage of WebSockets power, from the basics of getting started to the complexities of managing rich communications channels.\nYou\u2019ll work through several examples, each teaching an aspect of using and scaling WebSockets in production. This book focuses on the client side with JavaScript, but explains and demonstrates the server side (in Node.js) as well. You\u2019ll also touch on some of the compatibility frameworks like Socket.IO, which allows you to use WebSockets today, even if some of your target clients don't support it.\nMove from \"classic\" HTTP requests to smaller, more nimble WebSockets\nExplores how WebSockets affect scaling in larger applications\nLearn how to use WebSockets with browsers that don't support them natively\nDiscover how to keep WebSocket-based systems running even as tasks and environments change over time","price":"USD 24.99"},{"rating":{"max":10,"numRaters":20,"average":"7.4","min":0},"subtitle":"","author":["Vanessa Wang","Frank Salim","Peter Moskovits"],"pubdate":"2014-3","tags":[{"count":17,"name":"HTML5","title":"HTML5"},{"count":12,"name":"Websocket","title":"Websocket"},{"count":5,"name":"网络编程","title":"网络编程"},{"count":4,"name":"(WebSocket)","title":"(WebSocket)"},{"count":3,"name":"权威指南","title":"权威指南"},{"count":2,"name":"网路套接字","title":"网路套接字"},{"count":2,"name":"归档","title":"归档"},{"count":2,"name":"工具书","title":"工具书"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s27408422.jpg","binding":"平装","translator":["姚军"],"catalog":"《html5 websocket权威指南》\n译者序\n作者简介\n技术审校者简介\n序\n致谢\n第1章　html5 websocket简介 / 1\n1.1 html5是什么 / 2\n1.2 html5连接性 / 3\n1.3 旧的http架构概览 / 5\n1.3.1 http 101（即http/1.0和http/1.1） / 5\n1.3.2 绕道而行：http轮询、长轮询和流化 / 7\n1.4 websocket入门 / 9\n1.5 为什么需要websocket / 10\n1.5.1 websocket与性能相关 / 10\n1.5.2 websocket与简洁性相关 / 10\n1.5.3 websocket与标准相关 / 10\n1.5.4 websocket与html5相关 / 11\n1.5.5 你需要websocket / 11\n1.6 websocket和rfc 6455 / 11\n.1.7 websocket的世界 / 12\n1.8 websocket的选择 / 12\n1.8.1 非常活跃的websocket社区 / 12\n1.8.2 websocket应用程序 / 13\n1.9 相关技术 / 13\n1.9.1 服务器发送事件 / 14\n1.9.2 spdy / 14\n1.9.3 web实时通信 / 15\n1.10 小结 / 15\n第2章　websocket api / 16\n2.1 websocket api概览 / 17\n2.2 websocket api入门 / 18\n2.2.1 websocket 构造函数 / 18\n2.2.2 websocket事件 / 21\n2.2.3 websocket方法 / 25\n2.2.4 websocket对象特性 / 27\n2.3 全部组合起来 / 29\n2.4 检查websocket支持 / 32\n2.5 在websocket中使用html5媒体 / 33\n2.6 小结 / 37\n第3章　websocket协议 / 38\n3.1 websocket协议之前 / 39\n3.1.1 互联网简史 / 40\n3.1.2 web和http / 40\n3.2 websocket协议简介 / 42\n3.2.1 websocket：web应用程序的互联网能力 / 43\n3.2.2 检查websocket流量 / 45\n3.3 websocket协议 / 46\n3.3.1 websocket初始握手 / 47\n3.3.2 计算响应键值 / 48\n3.3.3 消息格式 / 49\n3.3.4 websocket关闭握手 / 52\n3.3.5 对其他协议的支持 / 54\n3.3.6 扩展 / 55\n3.4 用node.js编写javascript websocket服务器 / 56\n3.4.1 构建简单的websocket服务器 / 57\n3.4.2 测试简单的websocket服务器 / 61\n3.4.3 构建远程javascript控制台 / 62\n3.4.4 扩展建议 / 65\n3.5 小结 / 65\n第4章　用xmpp构建websocket上的即时消息和聊天 / 66\n4.1 分层协议 / 67\n4.2 xmpp：xml的流化 / 69\n4.2.1 标准化 / 70\n4.2.2 选择连接性策略 / 70\n4.2.3 联盟 / 73\n4.3 通过websocket构建聊天和即时消息应用程序 / 73\n4.3.1 使用能够处理websocket的xmpp服务器 / 73\n4.3.2 建立测试用户 / 74\n4.3.3 客户端程序库：strophe.js / 74\n4.3.4 连接并开始工作 / 75\n4.3.5 在线状态 / 77\n4.3.6 交换聊天消息 / 82\n4.3.7 ping和pong / 85\n4.3.8 完整的聊天应用程序 / 86\n4.4 建议的扩展 / 88\n4.4.1 构建用户界面 / 88\n4.4.2 使用xmpp扩展 / 89\n4.4.3 连接到google talk / 89\n4.5 小结 / 89\n第5章　用stomp通过websocket传递消息 / 90\n5.1 发布/订阅模式概览 / 92\n5.2 stomp简介 / 94\n5.3 web消息传递入门 / 95\n5.3.1 安装消息代理 / 96\n5.3.2 在实践中了解stomp概念 / 99\n5.4 构建stomp/ws应用程序 / 101\n5.4.1 游戏流程 / 101\n5.4.2 创建游戏 / 103\n5.4.3 监控apache activemq / 111\n5.5 建议的扩展 / 112\n5.6 web消息传递的未来 / 113\n5.7 小结 / 114\n第6章　用远程帧缓冲协议实现vnc / 115\n6.1 vnc概述 / 117\n6.1.1 远程帧缓冲协议概述 / 119\n6.1.2 面向二进制和面向文本的协议 / 120\n6.1.3 选择使用rfb over websocket / 120\n6.2 构建websocket上的vnc客户端 / 121\n6.2.1 建立代理服务器 / 122\n6.2.2 rfb客户端 / 124\n6.2.3 使用html5的[canvas]元素绘制帧缓冲 / 129\n6.2.4 处理客户端中的输入 / 131\n6.2.5 全部组合起来 / 136\n6.3 改进应用程序 / 136\n6.4 小结 / 137\n第7章　websocket安全性 / 138\n7.1 websocket安全性概述 / 139\n7.2 websocket安全特性 / 140\n7.2.1 origin首标 / 141\n7.2.2 具有\u201csec-\u201d前缀的首标 / 145\n7.2.3 websocket安全握手：接受键值 / 146\n7.2.4 http代理和屏蔽 / 147\n7.3 用tls加强websocket安全性 / 149\n7.4 验证 / 151\n7.5 应用级安全性 / 152\n7.5.1 应用程序验证 / 153\n7.5.2 应用程序授权 / 155\n7.6 小结 / 158\n第8章　部署的考虑 / 159\n8.1 websocket应用程序部署概述 / 160\n8.2 websocket模拟和备用手段 / 161\n8.2.1 插件 / 161\n8.2.2 填充 / 162\n8.2.3 不同的抽象层 / 162\n8.3 代理和其他网络中介 / 163\n8.3.1 反向代理和负载平衡 / 164\n8.3.2 用传输层安全（tls或ssl）穿越代理和防火墙 / 166\n8.3.3 部署tls / 168\n8.4 websocket ping和pong / 169\n8.5 websocket缓冲和流量控制 / 170\n8.6 监控 / 170\n8.7 容量规划 / 170\n8.8 套接字限制 / 171\n8.9 websocket应用程序部署检查列表 / 172\n8.10 小结 / 173\n附录a　检查websocket流量 / 175\n附录b　websocket资源 / 188","pages":"193","images":{"small":"https://img3.doubanio.com/spic/s27408422.jpg","large":"https://img3.doubanio.com/lpic/s27408422.jpg","medium":"https://img3.doubanio.com/mpic/s27408422.jpg"},"alt":"https://book.douban.com/subject/25845524/","id":"25845524","publisher":"机械工业出版社","isbn10":"7111456416","isbn13":"9787111456414","title":"HTML5 WebSocket权威指南","url":"https://api.douban.com/v2/book/25845524","alt_title":"","author_intro":"vanessa wang，html5领域的布道者和实践者，热衷于html5和websocket的研究，是旧金山html5用户组的联合组织者，负责组织html5和相关技术的社区活动．vanessa目前是kaazing公司的技术出版经理，15年来一直坚持撰写技术文章。kaazing是一家软件公司，旨在使用新的websocket标准改进企业和客户通过web通信的方式。写作之余，她喜欢打跆拳道、骑自行车和拉大提琴。\nfrank salim，google公司资深软件工程师，拥有pomona学院的计算机科学学位。曾经是kaazing公司最早的工程师之一，协助建立了websocket网关和客户端策略。2010年，frank与人合著了《pro html5 programming》(apress)一书。编程之余，他喜欢阅读、绘画和单排轮滑。\npeter moskovits，kaazing公司实时解决方案负责人。peter与架构师和开发人员社区紧密协作，构建和部署最好的web解决方案。在加入kaazing之前，peter担任过多种产品的管理工作，并曾经负责oracie的门户产品策略．peter经常在会议和业界活动上发表演讲，包括goto、yow!、javaone、oracle openworld、html5deconf、devcon5和各种用户组会议。他还是《oracle webcenter 11g handbook》的合著者。","summary":"《HTML5 WebSocket权威指南》是HTML5 WebSocket领域最权威的著作之一，它系统、全面地讲解了HTML5 WebSocket的各个方面，是Web开发人员和架构师学习WebSocket的最佳选择。书中讨论了基于WebSocket的架构师如何减少不必要的网络开销和延迟层，如何通过WebSocket对广泛使用的协议（如XMPP和STOMP）进行分层，如何保护WebSocket连接和在企业部署基于 WebSocket的应用程序。主要内容包括： WebSocket API和协议、WebSocket协议通信的例子、WebSocket的安全性和企业部署、内置即时通信和聊天应用程序的WebSocket与XMPP、通过WebSocket的STOMP实现发布/订阅消息传递协议，以及用远程帧缓冲协议实现VNC。\n","price":"49"},{"rating":{"max":10,"numRaters":4,"average":"0.0","min":0},"subtitle":"","author":["Wang, Vanessa; Salim, Frank; Jabali, Marcelo"],"pubdate":"","tags":[{"count":8,"name":"HTML5","title":"HTML5"},{"count":7,"name":"WebSocket","title":"WebSocket"},{"count":3,"name":"软件开发","title":"软件开发"},{"count":3,"name":"编程","title":"编程"},{"count":2,"name":"Programming","title":"Programming"},{"count":1,"name":"计算机科学","title":"计算机科学"},{"count":1,"name":"计算机","title":"计算机"},{"count":1,"name":"有电子版","title":"有电子版"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s22870470.jpg","binding":"","translator":[],"catalog":"","pages":"208","images":{"small":"https://img3.doubanio.com/spic/s22870470.jpg","large":"https://img3.doubanio.com/lpic/s22870470.jpg","medium":"https://img3.doubanio.com/mpic/s22870470.jpg"},"alt":"https://book.douban.com/subject/20109050/","id":"20109050","publisher":"","isbn10":"1430247401","isbn13":"9781430247401","title":"The Definitive Guide to Html5 Websocket","url":"https://api.douban.com/v2/book/20109050","alt_title":"","author_intro":"","summary":"","price":""},{"rating":{"max":10,"numRaters":4,"average":"0.0","min":0},"subtitle":"基于HTML5 WebSocket、PHP和jQuery","author":["Jason Lengstorf","Phil Leggetter"],"pubdate":"2013-10","tags":[{"count":6,"name":"实时应用","title":"实时应用"},{"count":6,"name":"web开发","title":"web开发"},{"count":3,"name":"长连接技术","title":"长连接技术"},{"count":3,"name":"php","title":"php"},{"count":3,"name":"html5","title":"html5"},{"count":3,"name":"[Web]","title":"[Web]"},{"count":2,"name":"编程","title":"编程"},{"count":2,"name":"建站","title":"建站"}],"origin_title":"","image":"https://img1.doubanio.com/mpic/s27262769.jpg","binding":"平装","translator":["肖智清"],"catalog":"","pages":"288","images":{"small":"https://img1.doubanio.com/spic/s27262769.jpg","large":"https://img1.doubanio.com/lpic/s27262769.jpg","medium":"https://img1.doubanio.com/mpic/s27262769.jpg"},"alt":"https://book.douban.com/subject/25733166/","id":"25733166","publisher":"机械工业出版社","isbn10":"711143983X","isbn13":"9787111439837","title":"构建实时Web应用：基于HTML5 WebSocket、PHP和jQuery","url":"https://api.douban.com/v2/book/25733166","alt_title":"","author_intro":"","summary":"实时web应用开发领域的经典著作，由实时web技术领域的布道者和资深web开发工程师撰写。不仅详细讲解了构建实时web应用所需的各项技术，还系统讲解了实时web应用规划与设计的的过程和方法，为构建实时web应用提供了翔实的指导。此外，《构建实时web应用：基于html5 websocket、php和jquery》包含大量代码和设计示例，实战性极强。\n全书一共10章：第1章介绍了什么是实时web技术及其原理；第2章详细讲解了构建实时web应用需要哪些技术和工具；第3章讲解了如何利用pusher构建实时web应用；第4章介绍了如何根据需要在web应用和原生应用之间做出选择；第5章讲解了如何规划应用程序的功能和结构；第6章讲解了实时web应用的设计，第7章讲解了如何为实时web应用创建html和css标记；第8章和第9章则非常详细地讲解了如何构建实时web应用的后端程序；第10章讲解了如何实现实时事件和jquery效果。","series":{"id":"31205","title":"Web开发技术丛书"},"price":"69"},{"rating":{"max":10,"numRaters":4,"average":"0.0","min":0},"subtitle":"Build Real-time Applications with HTML5","author":["Vanessa Wang","Frank Salim","Peter Moskovits"],"pubdate":"2013-3","tags":[{"count":9,"name":"WebSocket","title":"WebSocket"},{"count":7,"name":"html5","title":"html5"},{"count":1,"name":"apress","title":"apress"},{"count":1,"name":"Web","title":"Web"},{"count":1,"name":"Javascript","title":"Javascript"},{"count":1,"name":"HTML5","title":"HTML5"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s26263121.jpg","binding":"","translator":[],"catalog":"","pages":"208","images":{"small":"https://img3.doubanio.com/spic/s26263121.jpg","large":"https://img3.doubanio.com/lpic/s26263121.jpg","medium":"https://img3.doubanio.com/mpic/s26263121.jpg"},"alt":"https://book.douban.com/subject/23787945/","id":"23787945","publisher":"Apress","isbn10":"143024741X","isbn13":"9781430247418","title":"The Definitive Guide to HTML5 WebSocket","url":"https://api.douban.com/v2/book/23787945","alt_title":"","author_intro":"Vanessa Wang is an HTML5 and WebSocket enthusiast who has spent more than fifteen years writing about such diverse subjects as complex database application tools and cutting-edge web technologies. She is currently Manager of Technical Publications at Kaazing and co-organizer of the San Francisco HTML5 User Group. When she is not writing, she enjoys organizing community events for HTML5 and related technologies, kickboxing, riding her motorcycle, and playing her cello. Follow her on Twitter (@vjwang).\nFrank Salim is a software engineer at Google. Previously, he was one of the original engineers at Kaazing who helped craft the WebSocket gateway and client strategy. Frank is a San Diego native currently residing in San Francisco, California. He holds a degree in computer science from Pomona College. When he is not programming, Frank enjoys reading, painting, and inline skating. In 2010, Frank co-authored \"Pro HTML5 Programming\" (Apress).\nPeter Moskovits heads up real-time solutions development at Kaazing, a software company enhancing the way business and customers communicate across the Web using the new HTML5 WebSocket standard. Peter works closely with architects and the developer community to build and deploy the best possible web communication solutions. Before joining Kaazing, in various product management leadership roles Peter was responsible for Oracle's portal product strategy. Peter is a frequent speaker at conferences and industry events, such as GoTo, YOW!, JavaOne, Oracle OpenWorld, HTML5DeConf, DevCon5, and various user group meetings. He is also the co-author of the Oracle WebCenter 11g Handbook.","summary":"The browser is, hands down, the most popular and ubiquitous deployment platform available to us today: virtually every computer, smartphone, tablet, and just about every other form factor imaginable can now execute JavaScript, render a web page, and of course, talk HTTP. This, on its own, is a remarkable achievement, especially when you realize that it only took us a little over a decade to get to this stage. However, this is also just the beginning. The browser of yesterday looks nothing like what we now have access to thanks to all of the innovations of HTML5.\nIt is hard to overstate the importance of what HTML5 WebSocket enables: up until\nnow, the browser could only speak one language (HTTP), and that language was not\ndesigned for the requirements of the modern, real-time Web. Yes, we\u2019ve made progress\nwith interim solutions such as long-polling and Flash sockets, but the complexity and cost\nof these solutions has always limited the capabilities of what we could do. WebSockets\nchanges all of that: it is designed from the ground up to be data agnostic (binary and text),\nfull-duplex, and optimized for minimum overhead, both in bytes and in latency.\nWebSockets is TCP for the web-browser, except with a more robust and much easier\nto use API. Suddenly, our client is able to implement any network protocol directly in\nthe browser, which opens up an entire new world of possibilities. An XMPP chat client?\nEasy. Need to connect your client to a custom binary protocol deployed on your existing\nnetwork? No problem! Even better, you can script, style, and deploy these clients directly\nin the browser with all the web authoring tools you already know, love, and use.\nThe browser of yesterday talked to an HTTP server. With WebSockets, the browser\ncan talk to anyone and implement any protocol: complete the HTTP handshake,\nupgrade the connection, and you are off to the races. We are no longer talking about\nbuilding slightly better or more interactive pages. With WebSockets we can build entirely\nnew types of apps and experiences that can be delivered to your users today, directly in\ntheir browser.\nThis book provides a great from-the-ground-up discussion of what WebSockets are,\nwhat problems they are helping us to solve, as well as a number of practical examples\nthat will get you up and running in no time. You will be pleasantly surprised how easy\nit is to work with WebSocket and how much you can accomplish with very little code.\nWorking with WebSockets is a blast, and this book by Vanessa, Frank, and Peter is a\nfitting guide. Enjoy!","price":"USD 26.30"},{"rating":{"max":10,"numRaters":1,"average":"0.0","min":0},"subtitle":"Develop and deploy your first secure and scalable real-time web application","author":["Vangos Pterneas"],"pubdate":"2013-8-26","tags":[{"count":2,"name":"WebSocket","title":"WebSocket"},{"count":1,"name":"html5","title":"html5"},{"count":1,"name":"Kinect","title":"Kinect"},{"count":1,"name":"JavaScript","title":"JavaScript"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s27354706.jpg","binding":"","translator":[],"catalog":"","pages":"110","images":{"small":"https://img3.doubanio.com/spic/s27354706.jpg","large":"https://img3.doubanio.com/lpic/s27354706.jpg","medium":"https://img3.doubanio.com/mpic/s27354706.jpg"},"alt":"https://book.douban.com/subject/25941126/","id":"25941126","publisher":"Packt Publishing","isbn10":"1782166963","isbn13":"9781782166962","title":"Getting Started with HTML5 WebSocket Programming","url":"https://api.douban.com/v2/book/25941126","alt_title":"","author_intro":"","summary":"Overview\nStart real-time communication in your web applications\nCreate a feature-rich WebSocket chat application\nLearn the step-by-step configuration of the server and clients\nIn Detail\nWebSockets are capable of bi-directional, full-duplex communication over a persistent TCP connection They provide many benefits compared to the alternatives (for example, long-polling or Comet), such as lower overhead, persistent connections, and low latency. In short, it is the most technically challenging HTML5 feature to implement, but for truly interactive websites, it's a technology worth learning.\nGetting Started with HTML5 WebSocket Programming gives you the true power of bi-directional communication, implemented by using the brand new HTML5 WebSocket API. You\u2019ll learn how to configure the server and clients, how to transmit different types of data and how to secure the whole system.\nThis book will introduce you to the WebSocket world. We start by introducing the WebSocket API, and continue with practical, real-world examples until we can determine how to build multi-functional web apps for any type of device.\nYou will learn how to configure a web client and a web server that will help you send messages to others using easy-to-use mechanisms. We will also find out how different data types, such as images and videos, can be transferred with little effort. We present additional fallback techniques and solutions for older browsers too. Finally, we will secure our clients from malicious attacks and other threats.\nWhat you will learn from this book\nUnderstand the concepts of the WebSocket API and why it is superior to the existing techniques\nImplement a WebSocket client that will connect to a remote server and transmit messages to other clients\nConfigure a WebSocket server using your existing skills and knowledge\nImplement native WebSocket clients for mobile and tablet devices\nSupport older browsers that do not support HTML5 WebSockets\nApproach\nGetting Started with HTML5 Websocket Programming takes a tutorial-based approach.\nWho this book is written for\nThis book is for anyone who wants to build high-performance, true, real-time web applications. Being familiar with frontend web development (HTML / XHTML, JavaScript) would be ideal.","price":"USD 26.99"},{"rating":{"max":10,"numRaters":34,"average":"9.2","min":0},"subtitle":"涵盖WebSockets、Spring Framework、JPA Hibernate和Spring Security","author":["威廉斯 (Nicholas S.Williams)"],"pubdate":"2015-6-1","tags":[{"count":49,"name":"Java","title":"Java"},{"count":34,"name":"Web","title":"Web"},{"count":30,"name":"JavaWeb","title":"JavaWeb"},{"count":21,"name":"java编程","title":"java编程"},{"count":17,"name":"高级编程","title":"高级编程"},{"count":13,"name":"编程","title":"编程"},{"count":11,"name":"计算机","title":"计算机"},{"count":11,"name":"web开发","title":"web开发"}],"origin_title":"Professional Java for Web Applications","image":"https://img3.doubanio.com/mpic/s28314031.jpg","binding":"平装","translator":["王肖锋"],"catalog":"第Ⅰ部分 创建企业级应用程序\n第1章 介绍Java EE平台 3\n1.1 Java平台时间线 3\n1.1.1 起始 3\n1.1.2 企业级Java的诞生 4\n1.1.3 Java SE和Java EE共同发展 5\n1.1.4 了解最新的平台特性 7\n1.1.5 持续发展 11\n1.2 了解基本的Web应用程序结构 11\n1.2.1 Servlet、过滤器、监听器和JSP 11\n1.2.2 目录结构和WAR文件 12\n1.2.3 部署描述符 13\n1.2.4 类加载器架构 14\n1.2.5 企业级应用程序归档文件 14\n1.3 小结 15\n第2章 使用Web容器 17\n2.1 选择Web容器 17\n2.1.1 Apache Tomcat 18\n2.1.2 GlassFish 19\n2.1.3 JBoss和WildFly 19\n2.1.4 其他容器和应用服务器 20\n2.1.5 本书使用Tomcat的原因 20\n2.2 在个人计算机中安装Tomcat 21\n2.2.1 将Tomcat安装为Windows服务 21\n2.2.2 将Tomcat安装为命令行应用程序 21\n2.2.3 配置自定义的JSP编译器 23\n2.3 在Tomcat中部署和卸载应用程序 24\n2.3.1 手动部署和卸载 24\n2.3.2 使用Tomcat管理器 25\n2.4 通过IDE调试Tomcat 26\n2.4.1 使用IntelliJ IDEA 27\n2.4.2 使用Eclipse 30\n2.5 小结 34\n第3章 创建第一个Servlet 35\n3.1 创建Servlet类 36\n3.1.1 选择要继承的Servlet类 36\n3.1.2 使用初始化方法和销毁方法 38\n3.2 配置可部署的Servlet 39\n3.2.1 向描述符中添加Servlet 39\n3.2.2 将Servlet映射到URL 40\n3.2.3 运行和调试Servlet 42\n3.3 了解doGet、doPost和其他方法 44\n3.3.1 在service方法执行的过程中 44\n3.3.2 使用HttpServletRequest 44\n3.3.3 使用HttpServletResponse 47\n3.4 使用参数和接受表单提交 49\n3.5 使用初始化参数配置应用程序 53\n3.5.1 使用上下文初始化参数 53\n3.5.2 使用Servlet初始化参数 54\n3.6 通过表单上传文件 56\n3.6.1 介绍客户支持项目 56\n3.6.2 配置Servlet支持文件上传 56\n3.6.3 接受文件上传 59\n3.7 编写多线程安全的应用程序 60\n3.7.1 理解请求、线程和方法执行 60\n3.7.2 保护共享资源 61\n3.8 小结 62\n第4章 使用JSP显示页面内容 63\n4.1 使用\n替代output.println(\"\n\") 64\n4.1.1 使用JSP的原因 65\n4.1.2 JSP在运行时的处理 66\n4.2 创建第一个JSP 67\n4.2.1 了解文件结构 67\n4.2.2 指令、声明、脚本和表达式 69\n4.2.3 注释代码 70\n4.2.4 在JSP中导入类 71\n4.2.5 使用指令 72\n4.2.6 使用标签 75\n4.3 在JSP中使用Java(以及不鼓励使用Java的原因) 76\n4.3.1 使用JSP中隐式的变量 76\n4.3.2 不应该在JSP中使用Java的原因 82\n4.4 结合使用Servlet和JSP 82\n4.4.1 配置部署描述符中的JSP属性 82\n4.4.2 将Servlet中的请求转发给JSP 85\n4.5 关于JSP文档(JSPX)的注意事项 89\n4.6 小结 91\n第5章 使用会话维持状态 93\n5.1 需要会话的原因 93\n5.1.1 维持状态 94\n5.1.2 记住用户 94\n5.1.3 启动应用程序工作流 94\n5.2 使用会话cookie和URL重写 95\n5.2.1 了解会话cookie 96\n5.2.2 URL中的会话ID 98\n5.2.3 会话的漏洞 100\n5.3 在会话中存储数据 102\n5.3.1 在部署描述符中配置会话 103\n5.3.2 存储和获取数据 105\n5.3.3 删除数据 109\n5.3.4 在会话中存储更复杂的数据 111\n5.4 使用会话 114\n5.4.1 为客户支持应用程序添加登录功能 114\n5.4.2 使用监听器检测会话的变化 118\n5.4.3 维护活跃会话列表 120\n5.5 将使用会话的应用程序群集化 124\n5.5.1 在群集中使用会话ID 124\n5.5.2 了解会话复制和故障恢复 126\n5.6 小结 127\n第6章 在JSP中使用表达式语言 129\n6.1 了解表达式语言 129\n6.1.1 表达式语言的用途 130\n6.1.2 了解基本语法 130\n6.1.3 添加EL表达式 132\n6.2 使用EL语法 133\n6.2.1 保留关键字 133\n6.2.2 操作符优先级 134\n6.2.3 对象属性和方法 139\n6.2.4 EL函数 140\n6.2.5 静态字段和方法访问 141\n6.2.6 枚举 142\n6.2.7 lambda表达式 142\n6.2.8 集合 143\n6.3 在EL表达式中使用作用域变量 144\n6.3.1 使用隐式的EL作用域 145\n6.3.2 使用隐式的EL变量 148\n6.4 使用流API访问集合 151\n6.4.1 了解中间操作 151\n6.4.2 使用终结操作 153\n6.4.3 使用流API 154\n6.5 使用表达式语言替换Java代码 155\n6.6 小结 157\n第7章 使用Java标准标签库 159\n7.1 JSP标签和JSTL简介 159\n7.2 使用核心标签库(C命名空间) 163\n7.2.1 163\n7.2.2 164\n7.2.3 165\n7.2.4 、和 166\n7.2.5 167\n7.2.6 168\n7.2.7 168\n7.2.8 169\n7.2.9 和 170\n7.2.10 使用核心库标签 170\n7.3 使用国际化和格式化标签库(FMT命名空间) 173\n7.3.1 国际化和本地化组件 173\n7.3.2 175\n7.3.3 176\n7.3.4 和 176\n7.3.5 177\n7.3.6 和 177\n7.3.7 和 178\n7.3.8 和 179\n7.3.9 使用i18n和格式化库标签 180\n7.4 使用数据库访问标签库(SQL命名空间) 182\n7.5 使用XML处理标签库(X命名空间) 184\n7.6 使用JSP标签替换Java代码 184\n7.7 小结 186\n第8章 编写自定义标签和函数库 189\n8.1 了解TLD、标签文件和标签处理器 189\n8.1.1 读取Java标准标签库TLD 190\n8.1.2 比较JSP指令和标签文件指令 196\n8.2 创建标签文件用作HTML模板 198\n8.3 创建日期格式化标签处理器 199\n8.4 创建EL函数简写字符串 203\n8.5 使用自定义JSP标签替换Java代码 204\n8.6 小结 210\n第9章 使用过滤器改进应用程序 211\n9.1 了解过滤器的目的 211\n9.1.1 日志过滤器 212\n9.1.2 验证过滤器 212\n9.1.3 压缩和加密过滤器 212\n9.1.4 错误处理过滤器 212\n9.2 创建、声明和映射过滤器 213\n9.2.1 了解过滤器链 213\n9.2.2 映射到URL模式和Servlet名称 213\n9.2.3 映射到不同的请求派发器类型 214\n9.2.4 使用部署描述符 214\n9.2.5 使用注解 215\n9.2.6 使用编程式配置 215\n9.3 过滤器排序 216\n9.3.1 URL模式映射和Servlet名称映射 217\n9.3.2 演示过滤器顺序 218\n9.3.3 使用过滤器处理异步请求 220\n9.4 调查过滤器的实际用例 224\n9.4.1 添加简单的日志过滤器 225\n9.4.2 使用过滤器压缩响应内容 226\n9.5 使用过滤器简化认证 230\n9.6 小结 231\n第10章 在应用程序中使用WebSocket进行交互 233\n10.1 演变：从AJAX到WEBSOCKET 234\n10.1.1 问题：从服务器获得新数据到浏览器 234\n10.1.2 解决方案1：频繁轮询 235\n10.1.3 解决方案2：长轮询 236\n10.1.4 解决方案3：分块编码 237\n10.1.5 解决方案4：Applet和Adobe Flash 238\n10.1.6 WebSocket：一种无人知道但已经存在的解决方案 239\n10.2 了解WebSocket API 242\n10.2.1 HTML5(JavaScript)客户端API 243\n10.2.2 Java WebSocket API 245\n10.3 使用WebSocket创建多人游戏 247\n10.3.1 实现基本的三连棋游戏策略 247\n10.3.2 创建服务器终端 248\n10.3.3 编写JavaScript游戏控制台 252\n10.3.4 WebSocket三连棋游戏试玩 256\n10.4 在群集中使用WebSocket进行通信 257\n10.4.1 使用两个Servlet实例模拟简单的群集 257\n10.4.2 发送和接收二进制消息 259\n10.4.3 测试模拟群集应用程序 261\n10.5 在客户支持应用程序中添加\"支持与客户聊天\"功能 262\n10.5.1 使用编码器和解码器转换消息 262\n10.5.2 创建聊天服务器终端 264\n10.5.3 编写JavaScript聊天应用程序 267\n10.6 小结 269\n第11章 使用日志监控应用程序 271\n11.1 了解日志的概念 272\n11.1.1 记录日志的原因 272\n11.1.2 在日志中记录的内容 273\n11.1.3 日志的写入方式 274\n11.2 使用日志级别和分类 276\n11.2.1 使用不同日志级别的原因 276\n11.2.2 定义的日志级别 276\n11.2.3 日志分类的工作方式 277\n11.2.4 筛选的工作方式 277\n11.3 选择日志框架 277\n11.3.1 API和实现 278\n11.3.2 性能 278\n11.3.3 Apache Commons Logging和SLF4J 279\n11.3.4 Log4j 2简介 280\n11.4 在应用程序中集成日志 283\n11.4.1 创建Log4j 2配置文件 284\n11.4.2 在Web过滤器中使用鱼标签 287\n11.4.3 在Java代码中编写日志语句 288\n11.4.4 在JSP中使用日志标签库 290\n11.4.5 客户支持应用程序中的日志 290\n11.5 小结 291\n第Ⅱ部分 添加Spring Framework\n第12章 介绍Spring Framework 295\n12.1 Spring Framework简介 296\n12.1.1 反转控制和依赖注入 296\n12.1.2 面向切面编程 297\n12.1.3 数据访问和事务管理 297\n12.1.4 应用程序消息 297\n12.1.5 Web应用程序的模型-视图-控制器模式 298\n12.2 使用Spring Framework的原因 298\n12.2.1 逻辑代码分组 298\n12.2.2 使用同一代码库的多个用户界面 298\n12.3 了解应用上下文 299\n12.4 启动Spring Framework 300\n12.4.1 使用部署描述符启动Spring 301\n12.4.2 在初始化器中使用编程的方式启动Spring 303\n12.5 配置Spring Framework 306\n12.5.1 创建XML配置 308\n12.5.2 创建混合配置 310\n12.5.3 使用@Configuration配置Spring 314\n12.6 使用bean definition profile 318\n12.6.1 了解profile的工作原理 319\n12.6.2 考虑反模式和安全问题 321\n12.7 小结 322\n第13章 使用控制器替代Servlet 323\n13.1 了解@RequestMapping 323\n13.1.1 使用@RequestMapping特性\n缩小请求匹配的范围 324\n13.1.2 指定控制器方法参数 328\n13.1.3 为控制器方法选择有效的返回类型 335\n13.2 使用Spring Framework的模型和视图模式 337\n13.2.1 使用显式的视图和视图名称 338\n13.2.2 使用含有模型特性的隐式视图 340\n13.2.3 返回响应实体 341\n13.3 使用表单对象简化开发 346\n13.3.1 在模型中添加表单对象 347\n13.3.2 使用Spring Framework 标签 347\n13.3.3 获得被提交的表单数据 349\n13.4 更新客户支持应用程序 350\n13.4.1 启用Multipart支持 350\n13.4.2 将Servlet转换成Spring MVC控制器 351\n13.4.3 创建自定义下载视图 352\n13.5 小结 353\n第14章 使用服务和仓库支持控制器 355\n14.1 了解模型-视图-控制器模式与控制器-服务-仓库模式 355\n14.1.1 识别程序逻辑的不同类型 356\n14.1.2 使用仓库提供持久化逻辑 357\n14.1.3 使用服务提供业务逻辑 357\n14.1.4 使用控制器提供用户界面逻辑 358\n14.2 使用根应用上下文替代Web应用上下文 359\n14.2.1 在多用户界面中重用根应用上下文 359\n14.2.2 将业务逻辑从控制器移动到服务 360\n14.2.3 使用仓库存储数据 364\n14.3 使用异步和计划执行改进服务 368\n14.3.1 了解执行器和调度器 369\n14.3.2 配置调度器和异步支持 369\n14.3.3 创建和使用@Async方法 371\n14.3.4 创建和使用@Scheduled方法 372\n14.4 使用WebSocket实现逻辑层分离 373\n14.4.1 在Spring应用上下文中添加由容器管理的对象 373\n14.4.2 使用Spring WebSocket配置器 375\n14.4.3 记住：WebSocket只是业务逻辑的另一个界面 376\n14.5 小结 380\n第15章 使用Spring Framework i18n国际化应用程序 381\n15.1 使用Spring Framework i18n的原因 381\n15.1.1 使国际化变得更容易 382\n15.1.2 直接本地化错误消息 382\n15.2 使用基本的国际化和本地化API 382\n15.2.1 了解资源包和消息格式 383\n15.2.2 使用消息源进行挽救 385\n15.2.3 使用消息源国际化JSP 386\n15.3 在Spring Framework中配置国际化 387\n15.3.1 创建消息源 387\n15.3.2 了解区域设置解析器 388\n15.3.3 使用处理拦截器修改区域设置 390\n15.3.4 提供一个用户Profile区域设置 390\n15.3.5 包含时区支持 391\n15.3.6 了解主题如何改进国际化 392\n15.4 国际化代码 392\n15.4.1 使用标签 393\n15.4.2 以更干净的方式处理应用程序错误 395\n15.4.3 更新客户支持应用程序 398\n15.4.4 直接使用消息源 399\n15.5 小结 402\n第16章 使用JSR 349、Spring Framework和Hibernate Validator执行Bean验证 403\n16.1 Bean验证的概念 404\n16.1.1 使用Hibernate Validator的原因 405\n16.1.2 了解注解元数据模型 406\n16.1.3 使用Spring Framework实现Bean验证 406\n16.2 在Spring Framework容器中配置验证 406\n16.2.1 配置Spring验证Bean 407\n16.2.2 创建错误代码本地化 409\n16.2.3 使用方法验证Bean后处理器 410\n16.2.4 在Spring MVC中使用相同的验证Bean 411\n16.3 在Bean中添加约束验证注解 411\n16.3.1 了解内建的约束注解 411\n16.3.2 了解常见的约束特性 412\n16.3.3 使用约束 413\n16.3.4 使用@Valid实现递归验证 415\n16.3.5 使用验证组 416\n16.3.6 在编译时检查约束合法性 417\n16.4 为方法验证配置Spring Bean 418\n16.4.1 标注接口，而非实现 418\n16.4.2 在方法参数上使用限制和递归验证 419\n16.4.3 验证方法返回值 420\n16.4.4 表示一个类是否适用于方法验证 420\n16.4.5 在Spring MVC控制器中使用参数验证 421\n16.4.6 为用户显示验证错误 423\n16.5 编写自己的验证约束 425\n16.5.1 在自定义限制中继承其他限制 425\n16.5.2 创建限制验证器 426\n16.5.3 了解限制验证器的生命周期 428\n16.6 在客户支持应用程序中集成验证 429\n16.7 小结 431\n第17章 创建RESTful和SOAP Web服务 433\n17.1 了解Web服务 433\n17.1.1 最初的SOAP 434\n17.1.2 RESTful Web服务提供了一种更简单的方式 435\n17.2 在Spring MVC中配置RESTful Web服务 442\n17.2.1 使用原型注解分离控制器 442\n17.2.2 创建单独的Web和REST应用上下文 443\n17.2.3 处理RESTful Web服务中的错误条件 446\n17.2.4 将RESTful请求映射到控制器方法 449\n17.2.5 使用索引终端改进发现机制 453\n17.3 测试Web服务终端 454\n17.3.1 选择测试工具 454\n17.3.2 请求Web服务 455\n17.4 使用Spring Web Service创建SOAP Web服务 457\n17.4.1 编写契约优先的XSD和WSDL 458\n17.4.2 添加SOAP派发器Servlet配置 460\n17.4.3 创建SOAP终端 462\n17.5 小结 465\n第18章 使用消息传送和群集实现灵活性和可靠性 467\n18.1 识别需要消息传送和群集的时机 467\n18.1.1 应用程序消息传送的定义 468\n18.1.2 群集的定义 470\n18.1.3 消息传送和群集的协作方式 474\n18.2 为应用程序添加消息传送支持 477\n18.2.1 创建应用程序事件 477\n18.2.2 订阅应用程序事件 478\n18.2.3 发布应用程序事件 479\n18.3 在群集中分布消息传送 481\n18.3.1 更新事件以支持分布 482\n18.3.2 创建并配置一个自定义事件多播器 483\n18.3.3 使用WebSocket发送和接收事件 485\n18.3.4 通过多播数据包发现节点 487\n18.3.5 部署多个应用程序模拟群集 489\n18.4 使用AMQP分布事件 490\n18.4.1 配置AMQP代理 491\n18.4.2 创建AMQP多播器 492\n18.4.3 运行使用了AMQP的应用程序 494\n18.5 小结 495\n第Ⅲ部分 使用JPA和Hibernate ORM持久化数据\n第19章 介绍Java Persistence API和 Hibernate ORM 499\n19.1 数据持久化的定义 499\n19.1.1 平面文件实体存储 500\n19.1.2 结构化文件存储 500\n19.1.3 关系数据库系统 501\n19.1.4 面向对象数据库 501\n19.1.5 无模式数据库系统 502\n19.2 对象-关系映射的定义 502\n19.2.1 了解持久化实体的问题 503\n19.2.2 O/RM使实体持久化更简单 504\n19.2.3 JPA提供了一种标准O/RM API 505\n19.3 使用Hibernate ORM的原因 507\n19.4 Hibernate ORM简介 507\n19.4.1 使用Hibernate映射文件 507\n19.4.2 了解会话API 509\n19.4.3 从SessionFactory中获得会话 511\n19.4.4 使用Spring Framework创建SessionFactory 512\n19.5 准备关系数据库 513\n19.5.1 安装MySQL和\nMySQL Workbench 513\n19.5.2 安装MySQL JDBC驱动 515\n19.5.3 在Tomcat中创建连接资源 516\n19.5.4 注意Maven依赖 517\n19.6 小结 517\n第20章 使用JPA注解将实体映射到表 519\n20.1 使用简单实体 520\n20.1.1 创建实体并将它映射到表 521\n20.1.2 指示JPA使用实体字段的\n方式 523\n20.1.3 映射代理键 523\n20.1.4 使用基本数据类型 529\n20.1.5 指定列名和其他细节 532\n20.2 创建和使用持久化单元 534\n20.2.1 设计数据库表 534\n20.2.2 了解持久化单元作用域 536\n20.2.3 创建持久化配置 536\n20.2.4 使用持久化API 539\n20.3 映射复杂数据类型 543\n20.3.1 使用枚举作为实体属性 543\n20.3.2 了解JPA如何处理日期和时间 544\n20.3.3 将大属性映射为CLOB和BLOB 546\n20.4 小结 548\n第21章 在Spring Framework仓库中使用JPA 549\n21.1 使用Spring仓库和事务 550\n21.1.1 了解事务范围 550\n21.1.2 为事务和实体管理器使用线程 551\n21.1.3 使用异常转换 552\n21.2 在Spring Framework中配置持久化 553\n21.2.1 查找数据源 553\n21.2.2 在代码中创建持久化单元 554\n21.2.3 创建事务管理 557\n21.3 创建和使用JPA仓库 560\n21.3.1 注入持久化单元 560\n21.3.2 实现标准CRUD操作 561\n21.3.3 为所有的实体创建一个基础仓库 563\n21.3.4 在服务中标记事务范围 568\n21.3.5 使用事务服务方法 572\n21.4 在DTO和实体之间转换数据 573\n21.4.1 为客户支持应用程序创建实体 574\n21.4.2 使用BCrypt保护用户密码 578\n21.4.3 在服务中将数据传输到实体中 579\n21.5 小结 581\n第22章 使用Spring Data JPA消除公式化的仓库 583\n22.1 了解Spring Data的统一数据访问 584\n22.1.1 避免代码重复 584\n22.1.2 使用Stock仓库接口 587\n22.1.3 为搜索实体创建查询方法 588\n22.1.4 提供自定义方法实现 591\n22.2 配置和创建Spring Data JPA仓库 594\n22.2.1 启用仓库自动生成 595\n22.2.2 编写和使用Spring Data\nJPA接口 601\n22.3 重构客户支持应用程序 603\n22.3.1 转换现有仓库 603\n22.3.2 在支持票据中添加评论 605\n22.4 小结 609\n第23章 使用JPA和Hibernate Search搜索数据 611\n23.1 搜索介绍 612\n23.1.1 了解索引的重要性 612\n23.1.2 采取三种不同的方式 613\n23.2 使用高级条件定位对象 614\n23.2.1 创建复杂条件查询 614\n23.2.2 在查询中使用OR 621\n23.2.3 创建有用的索引改进性能 622\n23.3 使用JPA的全文索引 623\n23.3.1 在MySQL表中创建全文索引 624\n23.3.2 创建和使用可搜索的仓库 625\n23.3.3 使全文搜索可迁移 630\n23.4 使用Apache Lucene和Hibernate Search索引任意数据 630\n23.4.1 了解Lucene全文索引 631\n23.4.2 使用索引元数据标注实体 632\n23.4.3 结合使用Hibernate Search和JPA 634\n23.5 小结 637\n第24章 创建高级映射和自定义数据类型 639\n24.1 JPA的相关内容 639\n24.2 转换非标准数据类型 640\n24.2.1 了解特性转换器 641\n24.2.2 了解转换注解 642\n24.2.3 创建和使用特性转换器 643\n24.3 在实体中内嵌POJO 645\n24.3.1 表示嵌套的类型 645\n24.3.2 使属性成为可嵌入属性 645\n24.3.3 覆盖可内嵌列列名 647\n24.4 定义实体间的关系 648\n24.4.1 了解一对一关系 648\n24.4.2 使用一对多和多对一关系 650\n24.4.3 创建多对多关系 653\n24.5 处理其他常见的情况 654\n24.5.1 使用修订和时间戳版本化实体 654\n24.5.2 定义公共属性的抽象实体 655\n24.5.3 映射基本的和内嵌的集合 656\n24.5.4 持久化含有键值对的Map 659\n24.5.5 在多个表中存储实体 660\n24.6 创建编程式触发器 661\n24.6.1 在CRUD操作之前或之后执行 661\n24.6.2 使用实体监听器 663\n24.7 简化客户支持应用程序 664\n24.7.1 映射附件的集合 664\n24.7.2 使用加载时织入延迟加载简单属性 666\n24.8 小结 669\n第Ⅳ部分 使用Spring Security保护应用程序\n第25章 介绍Spring Security 673\n25.1 认证的概念 673\n25.1.1 集成认证 674\n25.1.2 了解授权 682\n25.2 选择Spring Security的原因 685\n25.2.1 了解Spring Security基础 686\n25.2.2 使用Spring Security的授权服务 686\n25.2.3 配置Spring Security 687\n25.3 小结 687\n第26章 使用Spring Security验证用户 689\n26.1 选择并配置认证提供者 690\n26.1.1 配置用户细节提供者 690\n26.1.2 使用LDAP和活动目录提供者 700\n26.1.3 使用OpenID进行认证 703\n26.1.4 remember-me认证 705\n26.1.5 学习其他认证提供者 706\n26.2 编写自己的认证提供者 707\n26.2.1 以正确的顺序启动 707\n26.2.2 创建和配置提供者 710\n26.2.3 缓解跨站请求伪装攻击 715\n26.3 小结 718\n第27章 使用授权标签和注解 719\n27.1 通过声明进行授权 719\n27.1.1 在方法代码中检查权限 720\n27.1.2 采用URL安全 722\n27.1.3 使用注解声明权限 725\n27.1.4 定义方法切点规则 732\n27.2 了解授权决策 733\n27.2.1 使用访问决策投票者 733\n27.2.2 使用访问决策管理器 734\n27.3 为对象安全创建访问控制列表 736\n27.3.1 了解Spring Security的\nACL 736\n27.3.2 配置访问控制列表 738\n27.3.3 为实体填充ACL 740\n27.4 在客户支持应用程序中添加授权 741\n27.4.1 切换到自定义用户细节 742\n27.4.2 保护服务方法 746\n27.4.3 使用Spring Security的标签库 750\n27.5 小结 751\n第28章 使用OAuth保护RESTful Web服务 753\n28.1 了解Web服务安全 754\n28.1.1 比较Web GUI和Web服务安全 754\n28.1.2 选择认证机制 754\n28.2 介绍OAuth 756\n28.2.1 了解关键参与者 756\n28.2.2 起始：OAuth 1.0 757\n28.2.3 标准：OAuth 1.0a 757\n28.2.4 演化：OAuth 2.0 762\n28.3 使用Spring Security OAuth 769\n28.3.1 创建OAuth 2.0提供者 769\n28.3.2 创建OAuth 2.0客户端 773\n28.4 完成客户端支持应用程序 775\n28.4.1 生成请求随机数和签名 776\n28.4.2 实现客户端服务 777\n28.4.3 实现随机数服务 780\n28.4.4 实现令牌服务 782\n28.4.5 自定义资源服务器过滤器 785\n28.4.6 重新配置Spring Security 787\n28.5 创建OAuth客户端应用程序 791\n28.5.1 自定义REST模板 792\n28.5.2 配置Spring Security OAuth客户端 793\n28.5.3 使用REST模板 795\n28.5.4 同时测试提供者和客户端 796\n28.6 小结 797","pages":"797","images":{"small":"https://img3.doubanio.com/spic/s28314031.jpg","large":"https://img3.doubanio.com/lpic/s28314031.jpg","medium":"https://img3.doubanio.com/mpic/s28314031.jpg"},"alt":"https://book.douban.com/subject/26581686/","id":"26581686","publisher":"清华大学出版社","isbn10":"7302400954","isbn13":"9787302400950","title":"Java Web高级编程","url":"https://api.douban.com/v2/book/26581686","alt_title":"Professional Java for Web Applications","author_intro":"Nicholas S. Williams是Java和相关技术领域的一位著名专家。在2010年，他被授予中部田纳西州年度软件工程师的称号。Nick大量参与了开源社区工作，为Apache Log4J、Apache Tomcat、Jackon Mapper、Spring Framework和Spring Security等项目贡献了bug修复、新特性和文档。","summary":"Java成为世界上编程语言之一是有其优势的。熟悉JavaSE的程序员可以轻松地进入到Java EE开发中，构建出安全、可靠和具有扩展性的企业级应用程序。编写《Java Web高级编程\u2014\u2014涵盖WebSockets、Spring Framework、JPA Hibernate和\nSpring Security》一书的目的正是如此。\n《Java Web高级编程：涵盖WebSockets、Spring Framework、JPA 》面向的读者是已经了解Java SE、SQL和基本的HTML，准备将他们的Java编码技能提升到更高水平的程序员。软件开发者可以按顺序阅读本书或者在遇到特定的编程问题时将某个章节用作参考。\n主要内容\n◆ 为企业级Web应用的Java编码提供了自我指导、自我学习的方法\n◆ 帮助Web应用架构师在开发团队的项目中或者开发过程中应用新的概念\n◆ 对Java EE平台7和其中的许多技术提供了详细的介绍\n◆ 讲解了Servlet、JSP、WebSockets、Spring Framework、AMQP、JPA和O/RM、Spring Data、全文搜索、Apache Lucene和Hibernate Search、Spring Security和OAuth\n◆ 重点介绍Java SE 8中新增加的常用功能，如lambda表达式和新的JSR 310 Java 8 Date and Time API等","price":"CNY 99.80"},{"rating":{"max":10,"numRaters":1,"average":"0.0","min":0},"subtitle":"开发、部署和保护动态Web应用","author":["科沃德 (Danny Coward)"],"pubdate":"2015-8-1","tags":[{"count":2,"name":"websocket","title":"websocket"},{"count":2,"name":"java","title":"java"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s28314035.jpg","binding":"平装","translator":[],"catalog":"","pages":"240","images":{"small":"https://img3.doubanio.com/spic/s28314035.jpg","large":"https://img3.doubanio.com/lpic/s28314035.jpg","medium":"https://img3.doubanio.com/mpic/s28314035.jpg"},"alt":"https://book.douban.com/subject/26638902/","id":"26638902","publisher":"清华大学出版社","isbn10":"7302408076","isbn13":"9787302408079","title":"Java WebSocket编程","url":"https://api.douban.com/v2/book/26638902","alt_title":"","author_intro":"","summary":"","price":"CNY 39.00"},{"rating":{"max":10,"numRaters":0,"average":"0.0","min":0},"subtitle":"Build your own real-time web applications using HTML5 WebSockets","author":["Varun Chopra"],"pubdate":"2015-4-30","tags":[{"count":1,"name":"WebSocket","title":"WebSocket"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s28307405.jpg","binding":"Paperback","translator":[],"catalog":"","pages":"111","images":{"small":"https://img3.doubanio.com/spic/s28307405.jpg","large":"https://img3.doubanio.com/lpic/s28307405.jpg","medium":"https://img3.doubanio.com/mpic/s28307405.jpg"},"alt":"https://book.douban.com/subject/26632687/","id":"26632687","publisher":"Packt Publishing","isbn10":"1784396753","isbn13":"9781784396756","title":"WebSocket Essentials: Building Apps with HTML5 WebSockets","url":"https://api.douban.com/v2/book/26632687","alt_title":"","author_intro":"About the Author\nVarun Chopra\nVarun Chopra has a lot of experience in the design and development of enterprise applications. He has worked as a consultant and has extensive experience in integrating different technologies. Besides his love of technology, he is also a singer and a guitarist and loves gadgets.","summary":"About This Book\nLearn to build your real-time collaborative application for mobiles and tablets using WebSocketsSet up your own WebSocket server and familiarize yourself with the combined power of WebSockets with HTML5A practical guide, accompanied by examples, which will help you to understand the working of the Node.js WebSocket server\nWho This Book Is For\nThis book is for web developers who want to learn and implement WebSocket to create interesting apps for modern browsers, leveraging the capabilities of HTML5 with WebSockets.\nWhat You Will Learn\nCreate a web app with the advanced features of the modern Web  Expand the level of application by using different frameworks and libraries  Improve HTML5 web application development with the help of up-to-date tools  Structure your application and speed up development with modern tools  Develop a WebSocket server using Node.js  Discover all the basics of using WebSockets on mobile and tablet platforms  Transmit real-time data between users by building a drawing application in HTML5  Understand the importance of using framework AngularJS along with Bootstrap\nIn Detail\nWebSocket facilitates complete duplex communication between the client and server. HTML5 made it possible to create enterprise-level applications considering the important parameters related to application maintainability. All these enhanced features help developers to remove the dependency on different plugins.\nStarting with the basics of HTML5, you will work your way through the process of implementing different applications using WebSockets and HTML5 using the Node.js server. You will explore how to use WebSockets on the mobile and tablet platforms and build a real-time drawing application in HTML5 utilizing WebSockets. You will also learn how to set up the Node.js server and develop an app for presentation sharing.\nBy the end of this book, you will be familiar with the technology and will have learned how to enhance your HTML5 web application development using modern tools.","price":"USD 29.99"},{"rating":{"max":10,"numRaters":0,"average":"0.0","min":0},"subtitle":"With HTML5 WebSocket, PHP, and jQuery","author":["Jason Lengstorf","Phil Leggetter"],"pubdate":"2013-4-16","tags":[],"origin_title":"","image":"https://img3.doubanio.com/mpic/s27262770.jpg","binding":"Paperback","translator":[],"catalog":"","pages":"312","images":{"small":"https://img3.doubanio.com/spic/s27262770.jpg","large":"https://img3.doubanio.com/lpic/s27262770.jpg","medium":"https://img3.doubanio.com/mpic/s27262770.jpg"},"alt":"https://book.douban.com/subject/20780513/","id":"20780513","publisher":"Apress","isbn10":"1430246200","isbn13":"9781430246206","title":"Realtime Web Apps","url":"https://api.douban.com/v2/book/20780513","alt_title":"","author_intro":"","summary":"","price":"USD 44.99"}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * rating : {"max":10,"numRaters":7,"average":"0.0","min":0}
         * subtitle : Lightweight Client-Server Communications
         * author : ["Andrew Lombardi"]
         * pubdate : 2015-9-26
         * tags : [{"count":8,"name":"WebSocket","title":"WebSocket"},{"count":8,"name":"JavaScript","title":"JavaScript"},{"count":5,"name":"HTML5","title":"HTML5"},{"count":3,"name":"前端","title":"前端"},{"count":2,"name":"前端开发","title":"前端开发"}]
         * origin_title : WebSocket
         * image : https://img3.doubanio.com/mpic/s28344064.jpg
         * binding : Paperback
         * translator : []
         * catalog :
         * pages : 144
         * images : {"small":"https://img3.doubanio.com/spic/s28344064.jpg","large":"https://img3.doubanio.com/lpic/s28344064.jpg","medium":"https://img3.doubanio.com/mpic/s28344064.jpg"}
         * alt : https://book.douban.com/subject/26261876/
         * id : 26261876
         * publisher : O'Reilly Media
         * isbn10 : 1449369278
         * isbn13 : 9781449369279
         * title : WebSocket
         * url : https://api.douban.com/v2/book/26261876
         * alt_title : WebSocket
         * author_intro : For the last 5 years, Andrew Lombardi has bounced all over North America and Europe giving dozens of talks at conferences about topics ranging from backend Java development to HTML5 to building for mobile using only JavaScript and many more.
         * summary : HTML5 WebSockets offer app developers a much smaller and more efficient way of communicating than classic HTTP for smoother, faster, and full-duplex communication with the server. With this practical book, you’ll learn how to take advantage of WebSockets power, from the basics of getting started to the complexities of managing rich communications channels.
         You’ll work through several examples, each teaching an aspect of using and scaling WebSockets in production. This book focuses on the client side with JavaScript, but explains and demonstrates the server side (in Node.js) as well. You’ll also touch on some of the compatibility frameworks like Socket.IO, which allows you to use WebSockets today, even if some of your target clients don't support it.
         Move from "classic" HTTP requests to smaller, more nimble WebSockets
         Explores how WebSockets affect scaling in larger applications
         Learn how to use WebSockets with browsers that don't support them natively
         Discover how to keep WebSocket-based systems running even as tasks and environments change over time
         * price : USD 24.99
         * series : {"id":"31205","title":"Web开发技术丛书"}
         */

        private RatingBean rating;
        private String subtitle;
        private String pubdate;
        private String origin_title;
        private String image;
        private String binding;
        private String catalog;
        private String pages;
        private ImagesBean images;
        private String alt;
        private String id;
        private String publisher;
        private String isbn10;
        private String isbn13;
        private String title;
        private String url;
        private String alt_title;
        private String author_intro;
        private String summary;
        private String price;
        private SeriesBean series;
        private List<String> author;
        private List<TagsBean> tags;
        private List<?> translator;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getOrigin_title() {
            return origin_title;
        }

        public void setOrigin_title(String origin_title) {
            this.origin_title = origin_title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBinding() {
            return binding;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getIsbn10() {
            return isbn10;
        }

        public void setIsbn10(String isbn10) {
            this.isbn10 = isbn10;
        }

        public String getIsbn13() {
            return isbn13;
        }

        public void setIsbn13(String isbn13) {
            this.isbn13 = isbn13;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlt_title() {
            return alt_title;
        }

        public void setAlt_title(String alt_title) {
            this.alt_title = alt_title;
        }

        public String getAuthor_intro() {
            return author_intro;
        }

        public void setAuthor_intro(String author_intro) {
            this.author_intro = author_intro;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public SeriesBean getSeries() {
            return series;
        }

        public void setSeries(SeriesBean series) {
            this.series = series;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<?> getTranslator() {
            return translator;
        }

        public void setTranslator(List<?> translator) {
            this.translator = translator;
        }

        public static class RatingBean {
            /**
             * max : 10
             * numRaters : 7
             * average : 0.0
             * min : 0
             */

            private int max;
            private int numRaters;
            private String average;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getNumRaters() {
                return numRaters;
            }

            public void setNumRaters(int numRaters) {
                this.numRaters = numRaters;
            }

            public String getAverage() {
                return average;
            }

            public void setAverage(String average) {
                this.average = average;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img3.doubanio.com/spic/s28344064.jpg
             * large : https://img3.doubanio.com/lpic/s28344064.jpg
             * medium : https://img3.doubanio.com/mpic/s28344064.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class SeriesBean {
            /**
             * id : 31205
             * title : Web开发技术丛书
             */

            private String id;
            private String title;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class TagsBean {
            /**
             * count : 8
             * name : WebSocket
             * title : WebSocket
             */

            private int count;
            private String name;
            private String title;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
