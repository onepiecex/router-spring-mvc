package com.github.onepiecex.router.core;

import com.github.onepiecex.router.core.mapping.OnepiecexRequestMappingHandlerMapping;
import com.github.onepiecex.router.core.route.Router;
import com.github.onepiecex.router.core.route.RouterImpl;
import com.github.onepiecex.router.core.route.Routes;
import com.github.onepiecex.router.core.scan.ClassScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Set;

/**
 * Created by wangziqing on 17/7/4.
 */
@Configuration
public class RouterConfig extends WebMvcConfigurationSupport {
    @Autowired
    private ApplicationContext applicationContext;

    private static final Logger LOG = LoggerFactory.getLogger(RouterConfig.class);

    protected OnepiecexRequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new OnepiecexRequestMappingHandlerMapping();
    }
    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        OnepiecexRequestMappingHandlerMapping handlerMapping =(OnepiecexRequestMappingHandlerMapping) super.requestMappingHandlerMapping();


        Router router = getBaan(Router.class,RouterImpl.class);

        Set<Class<Routes>> routesSet = ClassScanner.scan(Routes.class);
        LOG.info("Routes has : "+routesSet.size()+" class");
        routesSet.forEach(routesClass -> {
            LOG.info("Routes class : "+routesClass.getName());
            Routes routes =getBaan(routesClass);
            routes.init(router);
        });


        router.getRoutes().forEach(route -> {
            handlerMapping.onepiecexRegisterHandlerMethod(applicationContext,route);
        });
        return handlerMapping;
    }
    private <T> T getBaan(Class<T> tClass){
        return getBaan(tClass,tClass);
    }
    private <T> T getBaan(Class<T> tClass,Class<? extends T> aClass){
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        try {
            return autowireCapableBeanFactory.getBean(tClass);
        } catch (BeansException e) {
            return autowireCapableBeanFactory.createBean(aClass);
        }
    }
}
