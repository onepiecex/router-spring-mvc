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
        router.route("/hello").GET(HelloController::hello);
        router.route("/hello2").GET(HelloController::hello);
    }
}
