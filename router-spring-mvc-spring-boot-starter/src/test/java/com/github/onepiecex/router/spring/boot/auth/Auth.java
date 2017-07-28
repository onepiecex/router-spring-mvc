package com.github.onepiecex.router.spring.boot.auth;

import java.lang.annotation.*;

/**
 * 用于Auth相关参数和签名验证
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Documented
public @interface Auth {
    boolean authenticated() default true;
}
