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

package com.github.onepiecex.router.spring.boot.controllers;

import com.github.onepiecex.router.spring.boot.auth.Auth;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiong on 2017-07-14.
 */
@RestController
public class HelloController {
    @Auth
    public String hello() {
        return "hello";
    }
    public String hello2() {
        return "hello";
    }
}
