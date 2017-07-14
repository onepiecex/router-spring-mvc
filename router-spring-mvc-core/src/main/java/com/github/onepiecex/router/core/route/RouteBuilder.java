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

package com.github.onepiecex.router.core.route;

import com.github.onepiecex.router.core.util.ControllerMethods;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by xiong on 2017-07-14.
 */
public interface RouteBuilder {
    RouteBuilder GET(ControllerMethods.ControllerMethod controllerMethod);


    RouteBuilder POST(ControllerMethods.ControllerMethod controllerMethod);

    RouteBuilder PUT(ControllerMethods.ControllerMethod controllerMethod);

    RouteBuilder DELETE(ControllerMethods.ControllerMethod controllerMethod);

    RouteBuilder OPTIONS(ControllerMethods.ControllerMethod controllerMethod);

    RouteBuilder HEAD(ControllerMethods.ControllerMethod controllerMethod);

    /**
     * To match any http method. E.g. METHOD("PROPFIND") would route PROPFIND methods.
     * @param controllerMethod The http method like "GET" or "PROPFIND"
     * @return the routeBuilder for chaining.
     */

    RouteBuilder METHOD(ControllerMethods.ControllerMethod controllerMethod,RequestMethod... requestMethod);

    List<Route> getRoutes();
}
