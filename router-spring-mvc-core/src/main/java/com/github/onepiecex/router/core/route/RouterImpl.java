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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiong on 2017-07-14.
 */
public class RouterImpl implements Router {
    private List<RouteBuilder> routeBuilders=new ArrayList<>();
    private String startPath="";

    @Override
    public RouteBuilder route(boolean condition,String path) {
        RouteBuilder routeBuilder=new RouteBuilderImpl(startPath+path);
        if(condition) {
            routeBuilders.add(routeBuilder);
        }
        return routeBuilder;
    }


    @Override
    public List<Route> getRoutes() {
        List<Route> routes=new ArrayList<>();
        for (RouteBuilder routeBuilder : routeBuilders) {
            routes.addAll(routeBuilder.getRoutes());
        }
        return routes;
    }

}
