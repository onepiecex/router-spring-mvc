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
public interface RouteBuilderWithPOSTControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {

    default T POST(ControllerMethod0 controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A> T POST( ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B> T POST( ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C> T POST( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D> T POST( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E> T POST( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F> T POST( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G> T POST( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H> T POST( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H,I> T POST( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H,I,J> T POST( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.POST);
    }
    default T POST(boolean condition,ControllerMethod0 controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A> T POST(boolean condition, ControllerMethod1<A> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B> T POST(boolean condition, ControllerMethod2<A, B> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C> T POST(boolean condition, ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D> T POST(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E> T POST(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F> T POST(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G> T POST(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H> T POST(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H,I> T POST(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H,I,J> T POST(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.POST);
    }
}
