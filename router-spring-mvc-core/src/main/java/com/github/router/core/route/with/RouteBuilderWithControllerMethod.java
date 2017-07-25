package com.github.router.core.route.with;

/**
 * Created by wangziqing on 17/6/2.
 */

import com.github.router.core.route.RouteMapping;
import com.github.router.core.util.ControllerMethods.ControllerMethod;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface RouteBuilderWithControllerMethod<T> {
    default RequestMethod[] allRequestMethod(){
        return RequestMethod.values();
    }
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
    default T METHOD(ControllerMethod controllerMethod, RequestMethod requestMethod,
             String name,
             String[] params,
             String[] headers,
             String[] consumes,
             String[] produces){
        return METHOD(true,(ControllerMethod)controllerMethod,new RequestMethod[]{requestMethod},name,params,headers,consumes,produces);
    }
    default T METHOD(boolean condition,ControllerMethod controllerMethod,RequestMethod[] requestMethods){

        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethods,null,null,null,null,null);
    }

    default T METHOD(boolean condition,ControllerMethod controllerMethod,RequestMethod  requestMethod,RequestMethod... requestMethods){
        List<RequestMethod> requestMethodList=new ArrayList<>();
        requestMethodList.add(requestMethod);
        if(requestMethods!=null) {
            requestMethodList.addAll(Arrays.asList(requestMethods));
        }

        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethodList.toArray( new RequestMethod[requestMethodList.size()]));
    }

    default T METHOD(ControllerMethod controllerMethod,RequestMethod  requestMethod, RequestMethod... requestMethods){
        return METHOD(true,(ControllerMethod)controllerMethod,requestMethod,requestMethods);
    }
    default T METHOD(ControllerMethod controllerMethod, RequestMethod[] requestMethods){
        return METHOD(true,(ControllerMethod)controllerMethod,requestMethods);
    }







}
