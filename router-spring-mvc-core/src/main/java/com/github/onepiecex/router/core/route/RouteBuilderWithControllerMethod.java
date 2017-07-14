package com.github.onepiecex.router.core.route;

/**
 * Created by wangziqing on 17/6/2.
 */

import com.github.onepiecex.router.core.util.ControllerMethods.*;
import org.springframework.web.bind.annotation.RequestMethod;

public interface RouteBuilderWithControllerMethod<T> {
    /**
     * @param controllerMethod   see ControllerMethods.of(CLASS::METHOD)
     * @return
     */
    T METHOD(ControllerMethod controllerMethod, RequestMethod[] requestMethod,
        String name,
        String[] params,
        String[] headers,
        String[] consumes,
        String[] produces);

    default T METHOD(ControllerMethod controllerMethod, RequestMethod... requestMethod){
        return METHOD(controllerMethod,requestMethod,null,null,null,null,null);
    }

    default T GET(ControllerMethod0 controllerMethod) {
        
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A> T GET( ControllerMethod1<A> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B> T GET( ControllerMethod2<A, B> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B,C> T GET( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D> T GET( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E> T GET( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F> T GET( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G> T GET( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H> T GET( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H,I> T GET( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default <A,B,C,D,E,F,G,H,I,J> T GET( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.GET);
    }

    default T POST(ControllerMethod0 controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A> T POST( ControllerMethod1<A> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B> T POST( ControllerMethod2<A, B> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B,C> T POST( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D> T POST( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E> T POST( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F> T POST( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G> T POST( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H> T POST( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H,I> T POST( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default <A,B,C,D,E,F,G,H,I,J> T POST( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.POST);
    }

    default T PUT(ControllerMethod0 controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A> T PUT( ControllerMethod1<A> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B> T PUT( ControllerMethod2<A, B> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C> T PUT( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D> T PUT( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E> T PUT( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F> T PUT( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G> T PUT( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H> T PUT( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H,I> T PUT( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }

    default <A,B,C,D,E,F,G,H,I,J> T PUT( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.PUT);
    }


    default T DELETE(ControllerMethod0 controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A> T DELETE( ControllerMethod1<A> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B> T DELETE( ControllerMethod2<A, B> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C> T DELETE( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D> T DELETE( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E> T DELETE( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F> T DELETE( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G> T DELETE( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H> T DELETE( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H,I> T DELETE( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }

    default <A,B,C,D,E,F,G,H,I,J> T DELETE( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.DELETE);
    }
    default T OPTIONS(ControllerMethod0 controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A> T OPTIONS( ControllerMethod1<A> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B> T OPTIONS( ControllerMethod2<A, B> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C> T OPTIONS( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D> T OPTIONS( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E> T OPTIONS( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F> T OPTIONS( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G> T OPTIONS( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H> T OPTIONS( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H,I> T OPTIONS( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }

    default <A,B,C,D,E,F,G,H,I,J> T OPTIONS( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.OPTIONS);
    }


    default T HEAD(ControllerMethod0 controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A> T HEAD( ControllerMethod1<A> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B> T HEAD( ControllerMethod2<A, B> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C> T HEAD( ControllerMethod3<A, B, C> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D> T HEAD( ControllerMethod4<A, B, C, D> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E> T HEAD( ControllerMethod5<A, B, C, D, E> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F> T HEAD( ControllerMethod6<A, B, C, D, E, F> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G> T HEAD( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H> T HEAD( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H,I> T HEAD( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default <A,B,C,D,E,F,G,H,I,J> T HEAD( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod) {
        return METHOD(controllerMethod,RequestMethod.HEAD);
    }

    default T METHOD(ControllerMethod0 controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A> T METHOD( ControllerMethod1<A> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B> T METHOD( ControllerMethod2<A, B> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B,C> T METHOD( ControllerMethod3<A, B, C> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B,C,D> T METHOD( ControllerMethod4<A, B, C, D> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B,C,D,E> T METHOD( ControllerMethod5<A, B, C, D, E> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F> T METHOD( ControllerMethod6<A, B, C, D, E, F> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G> T METHOD( ControllerMethod7<A, B, C, D, E, F, G> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H> T METHOD( ControllerMethod8<A, B, C, D, E, F, G, H> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H,I> T METHOD( ControllerMethod9<A, B, C, D, E, F, G, H, I> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

    default <A,B,C,D,E,F,G,H,I,J> T METHOD( ControllerMethod10<A, B, C, D, E, F, G, H, I, J> controllerMethod,RequestMethod... requestMethod) {
        return METHOD(controllerMethod,requestMethod);
    }

}
