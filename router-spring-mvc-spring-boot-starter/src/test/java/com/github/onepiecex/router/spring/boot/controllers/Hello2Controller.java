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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiong on 2017-07-14.
 */
@RestController("/hello2")
public class Hello2Controller {
    @GetMapping
    public String hello() {
        return "hello";
    }
    @GetMapping("/hello")
    public String hello2() {
        return "hello";
    }
}
