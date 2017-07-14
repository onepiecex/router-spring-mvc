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

package com.github.onepiecex.router.core.event;

import com.github.onepiecex.router.core.mapping.OnepiecexRequestMappingHandlerMapping;
import com.github.onepiecex.router.core.route.Router;
import com.github.onepiecex.router.core.route.RouterImpl;
import com.github.onepiecex.router.core.route.Routes;
import com.github.onepiecex.router.core.scan.ClassScanner;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by xiong on 2017-07-14.
 */
public class ReadyEvent implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        AutowireCapableBeanFactory autowireCapableBeanFactory = contextRefreshedEvent.getApplicationContext().getAutowireCapableBeanFactory();

        OnepiecexRequestMappingHandlerMapping mappingHandlerMapping = autowireCapableBeanFactory.getBean(OnepiecexRequestMappingHandlerMapping.class);
        Router router = autowireCapableBeanFactory.getBean(Router.class);
        if(router==null){
            router= autowireCapableBeanFactory.createBean(RouterImpl.class);
        }
        Router finalRouter = router;
        ClassScanner.scan(Routes.class).forEach(routesClass -> {
            Routes routes = autowireCapableBeanFactory.getBean(routesClass);
            if(routes==null){
                routes= autowireCapableBeanFactory.createBean(routesClass);
            }
            routes.init(finalRouter);
        });


        router.getRoutes().forEach(route -> {
            mappingHandlerMapping.onepiecexRegisterHandlerMethod(route);
        });
    }
}