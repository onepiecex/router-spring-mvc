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
public interface RouteBuilderWithMETHODControllerMethod<T> extends RouteBuilderWithControllerMethod<T> {


    default T METHOD(ControllerMethod0 controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A> T METHOD( ControllerMethod1<A> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B> T METHOD( ControllerMethod2<A, B> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C> T METHOD( ControllerMethod3<A, B, C> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D> T METHOD( ControllerMethod4<A, B, C, D> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E> T METHOD( ControllerMethod5<A, B, C, D, E> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F> T METHOD( ControllerMethod6<A, B, C, D, E, F> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G> T METHOD( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H> T METHOD( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H,I> T METHOD( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H,I,J> T METHOD( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod,RequestMethod... requestMethod) {
        return METHOD((ControllerMethod)controllerMethod,requestMethod);
    }
    default T METHOD(boolean condition,ControllerMethod0 controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A> T METHOD(boolean condition, ControllerMethod1<A> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B> T METHOD(boolean condition, ControllerMethod2<A, B> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C> T METHOD(boolean condition, ControllerMethod3<A, B, C> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D> T METHOD(boolean condition, ControllerMethod4<A, B, C, D> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E> T METHOD(boolean condition, ControllerMethod5<A, B, C, D, E> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F> T METHOD(boolean condition, ControllerMethod6<A, B, C, D, E, F> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G> T METHOD(boolean condition, ControllerMethod7<A, B, C, D, E, F, G> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H> T METHOD(boolean condition, ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H,I> T METHOD(boolean condition, ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H,I,J> T METHOD(boolean condition, ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(condition,(ControllerMethod)controllerMethod,requestMethod);
    }
}
