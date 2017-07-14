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

/**
 * Created by xiong on 2017-07-14.
 */
public interface Router {
    /**
     *
     * @param path 地址  多个地址用||分割
     * @return
     */
    RouteBuilder route(String path);
    List<Route> getRoutes();
}
