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

import com.github.router.core.util.ControllerMethods;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiong on 2017-07-14.
 */
public interface RouteBuilderWithPATCHControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {
    default T PATCH(ControllerMethods.ControllerMethod0 controllerMethod) {

        return METHOD((ControllerMethods.ControllerMethod)controllerMethod, RequestMethod.PATCH);
    }

    default <A> T PATCH(ControllerMethods.ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B> T PATCH(ControllerMethods.ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C> T PATCH(ControllerMethods.ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D> T PATCH(ControllerMethods.ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E> T PATCH(ControllerMethods.ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F> T PATCH(ControllerMethods.ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G> T PATCH(ControllerMethods.ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H> T PATCH(ControllerMethods.ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H,I> T PATCH(ControllerMethods.ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H,I,J> T PATCH(ControllerMethods.ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }
    default T PATCH(boolean condition, ControllerMethods.ControllerMethod0 controllerMethod) {

        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod, RequestMethod.PATCH);
    }

    default <A> T PATCH(boolean condition, ControllerMethods.ControllerMethod1<A> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B> T PATCH(boolean condition, ControllerMethods.ControllerMethod2<A, B> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C> T PATCH(boolean condition, ControllerMethods.ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D> T PATCH(boolean condition, ControllerMethods.ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E> T PATCH(boolean condition, ControllerMethods.ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F> T PATCH(boolean condition, ControllerMethods.ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G> T PATCH(boolean condition, ControllerMethods.ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H> T PATCH(boolean condition, ControllerMethods.ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H,I> T PATCH(boolean condition, ControllerMethods.ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H,I,J> T PATCH(boolean condition, ControllerMethods.ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(condition,(ControllerMethods.ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }
}
