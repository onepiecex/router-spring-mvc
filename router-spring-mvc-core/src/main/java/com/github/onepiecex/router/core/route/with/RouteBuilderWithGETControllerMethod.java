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

package com.github.onepiecex.router.core.route.with;

import org.springframework.web.bind.annotation.RequestMethod;
import com.github.onepiecex.router.core.util.ControllerMethods.*;

/**
 * Created by xiong on 2017-07-14.
 */
public interface RouteBuilderWithGETControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {
    default T GET(ControllerMethod0 controllerMethod) {

        return METHOD((ControllerMethod)controllerMethod, RequestMethod.GET);
    }

    default <A> T GET( ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B> T GET( ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C> T GET( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D> T GET( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E> T GET( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F> T GET( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G> T GET( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H> T GET( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H,I> T GET( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H,I,J> T GET( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.GET);
    }
    default T GET(boolean condition,ControllerMethod0 controllerMethod) {

        return METHOD(true,(ControllerMethod)controllerMethod, RequestMethod.GET);
    }

    default <A> T GET(boolean condition, ControllerMethod1<A> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B> T GET(boolean condition, ControllerMethod2<A, B> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C> T GET(boolean condition, ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D> T GET(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E> T GET(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F> T GET(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G> T GET(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H> T GET(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H,I> T GET(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H,I,J> T GET(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.GET);
    }
}
