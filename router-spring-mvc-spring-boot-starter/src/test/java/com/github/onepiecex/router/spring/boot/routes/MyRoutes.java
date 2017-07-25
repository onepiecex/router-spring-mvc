/*
 *  Copyright (c) 2015.  meicanyun.com Corporation Limited.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of
 *  meicanyun Company. ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with meicanyun.com.
 */

package com.github.onepiecex.router.spring.boot.routes;

import com.github.router.core.route.Router;
import com.github.router.core.route.ApplicationRoutes;
import com.github.router.core.util.ControllerMethods;
import com.github.onepiecex.router.spring.boot.controllers.HelloController;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiong on 2017-07-14.
 */
public class MyRoutes implements ApplicationRoutes {
    @Override
    public void init(Router router) {

        //示例一
        router.route("/hello").GET(HelloController::hello);
        router.route("/hello").POST(HelloController::hello);
        router.route("/hello").PUT(HelloController::hello);
        router.route("/hello").DELETE(HelloController::hello);


        //示例二
        router.route("/hello2").GET(HelloController::hello).POST(HelloController::hello).PUT(HelloController::hello).DELETE(HelloController::hello);

        //示例三
        boolean isDev=false; //hello3 url 将不会加载
        router.route(isDev,"/hello3").GET(HelloController::hello);
        router.route(isDev,"/hello3").POST(HelloController::hello);

        //示例四
        boolean isTest=false; //hello4 url 将不会加载
        router.route(isTest,"/hello4").GET(HelloController::hello).POST(HelloController::hello);


        //示例五
        boolean isProd=false; // put和delete将不会加载
        router.route("/hello5").GET(HelloController::hello).POST(HelloController::hello).PUT(isProd,HelloController::hello).DELETE(isProd,HelloController::hello);


        //示例六 指定 /hello6 为get请求  更多指定 @see RequestMethod
        router.route("/hello6").METHOD(HelloController::hello, RequestMethod.GET);


        //示例七 所有请求到 /hello7
        router.route("/hello7").METHOD(HelloController::hello, RequestMethod.values());


        //示例八  指定请求的 mappingName params headers consumes produces
        //也可以在Controller 的类或方法 上增加 @RouteMapping   如果加了注解传入参数无效 全部以注解为主
        //@see
        String mappingName="";
        String[] params=new String[0];
        String[] headers=new String[0];
        String[] consumes=new String[0];
        String[] produces=new String[0];
        router.route("/hello8").METHOD(ControllerMethods.of(HelloController::hello2), RequestMethod.GET,mappingName,params,headers,consumes,produces);
        router.route("/hello9").METHOD(ControllerMethods.of(HelloController::hello), new RequestMethod[]{RequestMethod.GET,RequestMethod.POST},mappingName,params,headers,consumes,produces);


    }
}
