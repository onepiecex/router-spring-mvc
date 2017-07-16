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
        router.route(isDev,"/hello3").PUT(HelloController::hello);
        router.route(isDev,"/hello3").DELETE(HelloController::hello);

        //示例四
        boolean isTest=false; //hello4 url 将不会加载
        router.route(isTest,"/hello4").GET(HelloController::hello).POST(HelloController::hello).PUT(HelloController::hello).DELETE(HelloController::hello);

        //示例五
        boolean isTest2=false; //hello5 url 将不会加载   此实例用来写 开发url 最好
        router.when(isTest2,router1 ->
                router1.route("/hello5").GET(HelloController::hello).POST(HelloController::hello).PUT(HelloController::hello).DELETE(HelloController::hello)
        );
        //等同于
        if(isTest2){
            router.route("/hello5").GET(HelloController::hello).POST(HelloController::hello).PUT(HelloController::hello).DELETE(HelloController::hello);
        }

        //示例六
        boolean isProd=false; // put和delete将不会加载
        router.route("/hello6").GET(HelloController::hello).POST(HelloController::hello).PUT(isProd,HelloController::hello).DELETE(isProd,HelloController::hello);

        //示例七
        boolean isProd2=false; // put和delete将不会加载
        router.route("/hello7").GET(HelloController::hello).POST(HelloController::hello)
                .when(isProd2,routeBuilder ->
                        routeBuilder.PUT(HelloController::hello).DELETE(HelloController::hello)
                );


        //示例八 将生成 /hello8/c1    /hello8/c2
        router.route("/hello8",router1 -> {
            router1.route("/c1").GET(HelloController::hello);
            router1.route("/c2").GET(HelloController::hello);
        });



        /*router.route("/s",router1 -> {
            router1.route("/s2").POST(HelloController::hello);
            router1.route("/s3",router2 -> {
                router2.route("/s4").POST(HelloController::hello);
            });
            router1.route("/s5").POST(HelloController::hello);
        });*/
    }
}
