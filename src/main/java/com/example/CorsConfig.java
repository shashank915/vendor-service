package com.example;

import lombok.val;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * cors config
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        val cors = registry.addMapping("/**");
        cors.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
        cors.allowedOrigins("*");
        cors.allowedHeaders("*");
        //cors.allowCredentials(true);
        cors.exposedHeaders("ResponseType");
    }
}
