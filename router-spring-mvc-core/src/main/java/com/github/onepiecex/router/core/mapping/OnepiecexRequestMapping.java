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

package com.github.onepiecex.router.core.mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.Annotation;

/**
 * Created by xiong on 2017-07-14.
 */
public class OnepiecexRequestMapping implements RequestMapping {
    private String name;
    private String[] value;
    private String[] path;
    private RequestMethod[] method;
    private String[] params;
    private String[] headers;
    private String[] consumes;
    private String[] produces;


    public OnepiecexRequestMapping(String name, String[] value, String[] path, RequestMethod[] method, String[] params, String[] headers, String[] consumes, String[] produces) {
        this.name = name;
        this.value = value;
        this.path = path;
        this.method = method;
        this.params = params;
        this.headers = headers;
        this.consumes = consumes;
        this.produces = produces;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String[] value() {
        return value;
    }

    @Override
    public String[] path() {
        return path;
    }

    @Override
    public RequestMethod[] method() {
        return method;
    }

    @Override
    public String[] params() {
        return params;
    }

    @Override
    public String[] headers() {
        return headers;
    }

    @Override
    public String[] consumes() {
        return consumes;
    }

    @Override
    public String[] produces() {
        return produces;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return RequestMapping.class;
    }
}
