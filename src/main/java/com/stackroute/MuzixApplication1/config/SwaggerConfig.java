package com.stackroute.MuzixApplication1.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.service.Contact;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.service.ApiInfo;
@EnableSwagger2
@Configuration

public class SwaggerConfig
{
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.stackroute.MuzixApplication1"))
                .paths(regex("/api/v1.*")).build()
                .apiInfo(metaInfo());
    }
        private ApiInfo metaInfo() {



        return new ApiInfoBuilder().title("Spring Boot REST API")
                .description("\"Spring Boot REST API for Music\"")
                .version("1.0.0")
                .termsOfServiceUrl("Term of service")



                .license("Apache License Version 2.0")



                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")



                .contact(new Contact("jasleen", "https://github.com/jass2795", "jasleenkaur@gmail.com"))



                .build();



    }
    }


