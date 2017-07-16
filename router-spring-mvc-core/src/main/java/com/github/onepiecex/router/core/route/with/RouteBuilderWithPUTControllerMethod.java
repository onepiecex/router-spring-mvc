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
public interface RouteBuilderWithPUTControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {


    default T PUT(ControllerMethod0 controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A> T PUT( ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B> T PUT( ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C> T PUT( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D> T PUT( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E> T PUT( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F> T PUT( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G> T PUT( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H> T PUT( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H,I> T PUT( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H,I,J> T PUT( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PUT);
    }
    default T PUT(boolean condition,ControllerMethod0 controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A> T PUT(boolean condition, ControllerMethod1<A> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B> T PUT(boolean condition, ControllerMethod2<A, B> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C> T PUT(boolean condition, ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D> T PUT(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E> T PUT(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F> T PUT(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G> T PUT(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H> T PUT(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H,I> T PUT(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H,I,J> T PUT(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.PUT);
    }

}
