package com.revature.aop;

import com.revature.aop.AdvisedClass;
import com.revature.aop.AspectClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {

    @Bean
    public AdvisedClass advisedClass() {
        return new AdvisedClass();
    }

    @Bean
    public AspectClass aspectClass() {
        return new AspectClass();
    }
}
