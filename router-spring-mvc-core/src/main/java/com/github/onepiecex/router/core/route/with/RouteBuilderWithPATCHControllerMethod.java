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
public interface RouteBuilderWithPATCHControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {
    default T PATCH(ControllerMethod0 controllerMethod) {

        return METHOD((ControllerMethod)controllerMethod, RequestMethod.PATCH);
    }

    default <A> T PATCH(ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B> T PATCH(ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C> T PATCH(ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D> T PATCH(ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E> T PATCH(ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F> T PATCH(ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G> T PATCH(ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H> T PATCH(ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H,I> T PATCH(ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H,I,J> T PATCH(ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }
    default T PATCH(boolean condition, ControllerMethod0 controllerMethod) {

        return METHOD(true,(ControllerMethod)controllerMethod, RequestMethod.PATCH);
    }

    default <A> T PATCH(boolean condition, ControllerMethod1<A> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B> T PATCH(boolean condition, ControllerMethod2<A, B> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C> T PATCH(boolean condition, ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D> T PATCH(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E> T PATCH(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F> T PATCH(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G> T PATCH(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H> T PATCH(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H,I> T PATCH(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }

    default <A,B,C,D,E,F,G,H,I,J> T PATCH(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(true,(ControllerMethod)controllerMethod,RequestMethod.PATCH);
    }
}
