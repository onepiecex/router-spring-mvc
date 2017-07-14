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
import com.github.onepiecex.router.core.util.LambdaRoute;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiong on 2017-07-14.
 */
public class RouteBuilderImpl implements RouteBuilder {
    private List<Route> routes=new ArrayList<>();
    private String[] paths;

    public RouteBuilderImpl(String path) {
        this.paths = path.split("||");
    }

    private Route route(ControllerMethods.ControllerMethod controllerMethod,RequestMethod... requestMethod){
        LambdaRoute lambdaRoute = LambdaRoute.resolve(controllerMethod);
        Method functionalMethod = lambdaRoute.getFunctionalMethod();

        Class<?> declaringClass = functionalMethod.getDeclaringClass();
        Route route = new Route(declaringClass, functionalMethod, "", paths, requestMethod, new String[0], new String[0], new String[0], new String[0]);
        routes.add(route);
        return route;
    }

    @Override
    public RouteBuilder GET(ControllerMethods.ControllerMethod controllerMethod) {
        Route route = this.route(controllerMethod, RequestMethod.GET);
        this.routes.add(route);
        return this;
    }

    @Override
    public RouteBuilder POST(ControllerMethods.ControllerMethod controllerMethod) {
        Route route = this.route(controllerMethod, RequestMethod.POST);
        this.routes.add(route);
        return this;
    }

    @Override
    public RouteBuilder PUT(ControllerMethods.ControllerMethod controllerMethod) {
        Route route = this.route(controllerMethod, RequestMethod.PUT);
        this.routes.add(route);
        return this;
    }

    @Override
    public RouteBuilder DELETE(ControllerMethods.ControllerMethod controllerMethod) {
        Route route = this.route(controllerMethod, RequestMethod.DELETE);
        this.routes.add(route);
        return this;
    }

    @Override
    public RouteBuilder OPTIONS(ControllerMethods.ControllerMethod controllerMethod) {
        Route route = this.route(controllerMethod, RequestMethod.OPTIONS);
        this.routes.add(route);
        return this;
    }

    @Override
    public RouteBuilder HEAD(ControllerMethods.ControllerMethod controllerMethod) {
        Route route = this.route(controllerMethod, RequestMethod.HEAD);
        this.routes.add(route);
        return this;
    }

    @Override
    public RouteBuilder METHOD(ControllerMethods.ControllerMethod controllerMethod, RequestMethod... requestMethod) {
        Route route = this.route(controllerMethod, requestMethod);
        this.routes.add(route);
        return this;
    }

    @Override
    public List<Route> getRoutes() {
        return routes;
    }
}
