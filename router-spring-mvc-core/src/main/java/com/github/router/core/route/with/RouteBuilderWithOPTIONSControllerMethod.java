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
public interface RouteBuilderWithOPTIONSControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {


    default T OPTIONS(ControllerMethod0 controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A> T OPTIONS( ControllerMethod1<A> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B> T OPTIONS( ControllerMethod2<A, B> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C> T OPTIONS( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D> T OPTIONS( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E> T OPTIONS( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F> T OPTIONS( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G> T OPTIONS( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H> T OPTIONS( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H,I> T OPTIONS( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H,I,J> T OPTIONS( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD((ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }
    default T OPTIONS(boolean condition,ControllerMethod0 controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A> T OPTIONS(boolean condition, ControllerMethod1<A> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B> T OPTIONS(boolean condition, ControllerMethod2<A, B> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C> T OPTIONS(boolean condition, ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D> T OPTIONS(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E> T OPTIONS(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F> T OPTIONS(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G> T OPTIONS(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H> T OPTIONS(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H,I> T OPTIONS(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H,I,J> T OPTIONS(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,RequestMethod.OPTIONS);
    }
}
