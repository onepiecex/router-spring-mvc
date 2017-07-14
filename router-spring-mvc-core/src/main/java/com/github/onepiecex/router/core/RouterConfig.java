package com.github.onepiecex.router.core;

import com.github.onepiecex.router.core.mapping.OnepiecexRequestMappingHandlerMapping;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by wangziqing on 17/7/4.
 */
@Configuration
public class RouterConfig extends WebMvcConfigurationSupport {

    protected OnepiecexRequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new OnepiecexRequestMappingHandlerMapping();
    }

}
