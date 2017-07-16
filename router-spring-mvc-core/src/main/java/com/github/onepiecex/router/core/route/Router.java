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

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by xiong on 2017-07-14.
 */
public interface Router {
    /**
     *
     * @param condition 当condition 为true时才加入路由 为开发 测试变换路由使用
     * @param path 地址  多个地址用||分割
     * @return
     */
    RouteBuilder route(boolean condition,String path);
    /**
     *
     * @param path 地址  多个地址用||分割
     * @return
     */
    default RouteBuilder route(String path){
        return route(true,path);
    }
    default Router when(boolean condition,Consumer<Router> consumer){
        if(condition) {
            consumer.accept(this);
        }
        return this;
    }
    List<Route> getRoutes();
}
