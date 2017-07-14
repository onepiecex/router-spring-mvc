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
public interface RouteBuilderWithDELETEControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {
    default T DELETE(ControllerMethod0 controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A> T DELETE( ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B> T DELETE( ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C> T DELETE( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D> T DELETE( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E> T DELETE( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F> T DELETE( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G> T DELETE( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H> T DELETE( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H,I> T DELETE( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H,I,J> T DELETE( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }
    default T DELETE(boolean condition,ControllerMethod0 controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A> T DELETE(boolean condition, ControllerMethod1<A> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B> T DELETE(boolean condition, ControllerMethod2<A, B> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C> T DELETE(boolean condition, ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D> T DELETE(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E> T DELETE(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F> T DELETE(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G> T DELETE(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H> T DELETE(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H,I> T DELETE(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H,I,J> T DELETE(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.DELETE);
    }


}
