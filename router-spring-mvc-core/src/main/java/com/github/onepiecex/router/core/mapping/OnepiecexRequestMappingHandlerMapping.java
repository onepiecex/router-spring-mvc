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

import com.github.onepiecex.router.core.route.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * Created by xiong on 2017-07-14.
 */
public class OnepiecexRequestMappingHandlerMapping extends RequestMappingHandlerMapping {
    private static final Logger LOG = LoggerFactory.getLogger(OnepiecexRequestMappingHandlerMapping.class);

    public void onepiecexRegisterHandlerMethod(Object handler, Method method, RequestMappingInfo mapping) {
       super.registerHandlerMethod(handler,method,mapping);
    }
    public void onepiecexRegisterHandlerMethod(final Object handler,
                                        Method method,
                                        String[] path,
                                        RequestMethod[] requestMethods
                                       ) {


        this.onepiecexRegisterHandlerMethod(handler, method,"",  path,requestMethods,new String[0],new String[0],new String[0],new String[0]);
    }
    public void onepiecexRegisterHandlerMethod(final Object handler,
                                        Method method,
                                        String mappingName,
                                        String[] path,
                                        RequestMethod[] requestMethods,
                                        String[] params,
                                        String[] headers,
                                        String[] consumes,
                                        String[] produces) {
        if(handler==null || handler instanceof Class ||method==null|| path==null ||path.length==0 ||requestMethods==null ||requestMethods.length==0){
            StringBuilder err=new StringBuilder();
            err.append("route can not install  mag:");
            if(handler == null){
                err.append(" no obj");
            }
            if(handler instanceof Class){
                err.append(" handler is class");
            }
            if(method==null){
                err.append(" no method");
            }
            if(path==null ||path.length==0){
                err.append(" no path");
            }
            if(requestMethods==null ||requestMethods.length==0){
                err.append(" no requestMethods");
            }

            LOG.error(err.toString());
            return;
        }

        RequestMapping requestMapping=new OnepiecexRequestMapping(mappingName,path,path,requestMethods,params,headers,consumes,produces);
        RequestMappingInfo build = super.createRequestMappingInfo(requestMapping, null);
        final Class<?> userType = ClassUtils.getUserClass(handler);
        Method invocableMethod = AopUtils.selectInvocableMethod(method, userType);
        this.onepiecexRegisterHandlerMethod(handler, invocableMethod,  build);
    }
    public void onepiecexRegisterHandlerMethod(ApplicationContext applicationContext,Route route) {
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        Object bean =null;
        try {
            bean =autowireCapableBeanFactory.getBean(route.getHandler());
        } catch (BeansException e) {
            bean = autowireCapableBeanFactory.createBean(route.getHandler());
        }
        this.onepiecexRegisterHandlerMethod(bean,route.getMethod(),route.getPath(),route.getRequestMethods());

    }


}
