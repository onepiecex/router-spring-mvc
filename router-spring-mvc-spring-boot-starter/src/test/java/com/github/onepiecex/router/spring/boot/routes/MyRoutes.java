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

import com.github.onepiecex.router.core.route.Router;
import com.github.onepiecex.router.core.route.Routes;
import com.github.onepiecex.router.spring.boot.controllers.HelloController;

/**
 * Created by xiong on 2017-07-14.
 */
public class MyRoutes implements Routes {
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
        router.route("/hello6").GET(HelloController::hello).POST(HelloController::hello).PUT(isProd,HelloController::hello).DELETE(isProd,HelloController::hello);


    }
}
