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

package com.github.router.core.route;

import com.github.router.core.util.ControllerMethods;
import com.github.router.core.util.LambdaRoute;
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
        if(path!=null && path.length()>0) {
            this.paths = path.split("\\|\\|");
        }
    }

    @Override
    public List<Route> getRoutes() {
        return routes;
    }


    @Override
    public RouteBuilder METHOD(boolean condition,ControllerMethods.ControllerMethod controllerMethod, RequestMethod[] requestMethod, String name, String[] params, String[] headers, String[] consumes, String[] produces) {
        if(!condition){
            return this;
        }
        LambdaRoute lambdaRoute = LambdaRoute.resolve(controllerMethod);
        Method functionalMethod = lambdaRoute.getFunctionalMethod();
        Class<?> declaringClass = functionalMethod.getDeclaringClass();

        RouteMapping annotation = functionalMethod.getAnnotation(RouteMapping.class);
        if (annotation == null) {
            annotation=declaringClass.getAnnotation(RouteMapping.class);
        }

        if(annotation!=null){
            name=annotation.name();
            params=annotation.params();
            headers=annotation.headers();
            consumes=annotation.consumes();
            produces=annotation.produces();
        }

        Route route = new Route(declaringClass, functionalMethod, name, paths, requestMethod, params, headers, consumes, produces);
        routes.add(route);
        return this;
    }

}
