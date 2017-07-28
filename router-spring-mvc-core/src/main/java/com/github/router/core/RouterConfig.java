package com.github.router.core;

import com.github.router.core.mapping.OnepiecexRequestMappingHandlerMapping;
import com.github.router.core.route.ApplicationRoutes;
import com.github.router.core.route.Router;
import com.github.router.core.route.RouterImpl;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Set;

/**
 * Created by wangziqing on 17/7/4.
 */
@Configuration
public class RouterConfig extends DelegatingWebMvcConfiguration {
    @Autowired
    private ApplicationContext applicationContext;

    private static String ROUTES_PACKAGE="route.packages";

    private static final Logger LOG = LoggerFactory.getLogger(RouterConfig.class);

    protected OnepiecexRequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new OnepiecexRequestMappingHandlerMapping();
    }
    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        OnepiecexRequestMappingHandlerMapping handlerMapping =(OnepiecexRequestMappingHandlerMapping) super.requestMappingHandlerMapping();
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        Environment environment = autowireCapableBeanFactory.getBean(Environment.class);

        String routesPackage = environment.getProperty(ROUTES_PACKAGE);
        if(StringUtils.isEmpty(routesPackage)){
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append("Error is as follows").append("\n")
                    .append("route.packages not configured , Please configure it in the application.yaml file (route.packages没有配置，请在 application.yaml 配置，配置如下)").append("\n")
                    .append("for example :").append("\n")
                    .append("route:").append("\n")
                    .append("packages: package1,package2");



            LOG.error("route.packages not configured , Please configure it in the application.yaml file (route.packages没有配置，请在 application.yaml 配置，配置如下)");
            LOG.error("for example :");
            LOG.error("route:");
            LOG.error("  packages: package1,package2");

            throw new RuntimeException(stringBuilder.toString());
           // return handlerMapping;
        }

        Router router = getBaan(Router.class,RouterImpl.class);

        Reflections reflections = new Reflections(routesPackage.split(","));

        Set<Class<? extends ApplicationRoutes>> routesSet = reflections.getSubTypesOf(ApplicationRoutes.class);
        LOG.info("ApplicationRoutes has : "+routesSet.size()+" class");
        routesSet.forEach(routesClass -> {
            LOG.info("ApplicationRoutes class : "+routesClass.getName());
            ApplicationRoutes routes =getBaan(routesClass);
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
