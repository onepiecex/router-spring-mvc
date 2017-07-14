package com.github.onepiecex.router.core.route.with;

/**
 * Created by wangziqing on 17/6/2.
 */

import com.github.onepiecex.router.core.route.RouteMapping;
import com.github.onepiecex.router.core.util.ControllerMethods.ControllerMethod;
import org.springframework.web.bind.annotation.RequestMethod;

public interface RouteBuilderWithControllerMethod<T> {

    /**
     * @param controllerMethod   see ControllerMethods.of(CLASS::METHOD)
     *   注 ：
     *       name,params, headers,consumes, produces
     *     这些参数可以在    Controller 或    Controller.Method
     *     加注解 下面注解
     * @see RouteMapping
     * @return
     */
    T METHOD(boolean condition,ControllerMethod controllerMethod, RequestMethod[] requestMethod,
        String name,
        String[] params,
        String[] headers,
        String[] consumes,
        String[] produces);

    default T METHOD(ControllerMethod controllerMethod, RequestMethod[] requestMethod,
             String name,
             String[] params,
             String[] headers,
             String[] consumes,
             String[] produces){
        return METHOD(true,(ControllerMethod)controllerMethod,requestMethod,name,params,headers,consumes,produces);
    }

    default T METHOD(boolean condition,ControllerMethod controllerMethod, RequestMethod... requestMethod){
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod,null,null,null,null,null);
    }
    default T METHOD(ControllerMethod controllerMethod, RequestMethod... requestMethod){
        return METHOD(true,(ControllerMethod)controllerMethod,requestMethod);
    }







}
