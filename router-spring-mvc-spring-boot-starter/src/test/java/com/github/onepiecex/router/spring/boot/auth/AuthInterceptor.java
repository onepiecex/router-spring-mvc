package com.github.onepiecex.router.spring.boot.auth;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by wangziqing on 17/7/25.
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod hm = (HandlerMethod) handler;
            Class<?> clazz = hm.getBeanType();
            Method m = hm.getMethod();
            if (clazz != null && m != null) {
                Auth mAuth = m.getAnnotation(Auth.class);
                if (null != mAuth) {
                    return auth(mAuth, request, response, handler);
                } else {
                    Auth cAuth = clazz.getAnnotation(Auth.class);
                    if (null != cAuth) {
                        return auth(cAuth, request, response, handler);
                    }
                }
            }
        }
        return true;
    }

    private static final String RAW_DATA = "rawData";
    private static final String SIGNATURE = "signature";
    private static final String USER_AGENT = "User-Agent";
    private static final String ACCESS_TOKEN = "accessToken";

    private boolean auth(Auth auth, HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println(1);
        return true;
    }
}
