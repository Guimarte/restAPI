package com.martins.springboot.controllers;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI ProductApi() {
        return new OpenAPI().components(new Components())
                .info(new Info().title("API Guilherme Martins")
                        .description("RestAPI criada para teste"));

    }

//    private ApiInfo metaData() {
//        return new ApiInfoBuilder().title("Spring Boot Rest Api - Guilherme Martins ").description("\"Desenvolvida por Guilherme Martins \"")
//                .version("1.0.0")
//                .license("Apache License Version 2.0 ")
//                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
//                .build();
//    }
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//    }

}
