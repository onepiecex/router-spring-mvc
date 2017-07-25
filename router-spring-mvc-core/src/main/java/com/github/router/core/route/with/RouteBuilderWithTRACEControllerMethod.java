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

package com.github.router.core.route.with;

import com.github.router.core.util.ControllerMethods.*;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiong on 2017-07-14.
 */
public interface RouteBuilderWithTRACEControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {
    default T TRACE(ControllerMethod0 controllerMethod) {

        return METHOD((ControllerMethod)controllerMethod, RequestMethod.TRACE);
    }

    default <A> T TRACE(ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B> T TRACE(ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C> T TRACE(ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D> T TRACE(ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E> T TRACE(ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F> T TRACE(ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F,G> T TRACE(ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F,G,H> T TRACE(ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F,G,H,I> T TRACE(ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F,G,H,I,J> T TRACE(ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }
    default T TRACE(boolean condition, ControllerMethod0 controllerMethod) {

        return METHOD(condition,(ControllerMethod)controllerMethod, RequestMethod.TRACE);
    }

    default <A> T TRACE(boolean condition, ControllerMethod1<A> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B> T TRACE(boolean condition, ControllerMethod2<A, B> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C> T TRACE(boolean condition, ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D> T TRACE(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E> T TRACE(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F> T TRACE(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F,G> T TRACE(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F,G,H> T TRACE(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F,G,H,I> T TRACE(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }

    default <A,B,C,D,E,F,G,H,I,J> T TRACE(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.TRACE);
    }
}
