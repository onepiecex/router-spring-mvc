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

import com.github.onepiecex.router.core.util.ControllerMethods.*;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiong on 2017-07-14.
 */
public interface RouteBuilderWithHEADControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {


    default T HEAD(ControllerMethod0 controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A> T HEAD( ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B> T HEAD( ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C> T HEAD( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D> T HEAD( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E> T HEAD( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F> T HEAD( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G> T HEAD( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H> T HEAD( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H,I> T HEAD( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H,I,J> T HEAD( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }
    default T HEAD(boolean condition,ControllerMethod0 controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A> T HEAD(boolean condition, ControllerMethod1<A> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B> T HEAD(boolean condition, ControllerMethod2<A, B> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C> T HEAD(boolean condition, ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D> T HEAD(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E> T HEAD(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F> T HEAD(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G> T HEAD(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H> T HEAD(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H,I> T HEAD(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H,I,J> T HEAD(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.HEAD);
    }
}
