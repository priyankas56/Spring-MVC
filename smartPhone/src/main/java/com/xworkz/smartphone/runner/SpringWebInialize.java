package com.xworkz.smartphone.runner;

import com.xworkz.smartphone.configur.StringConfigurBuilder;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInialize extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public SpringWebInialize() {
        System.out.println("creating SpringWebInialize");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println(("getServletConfigurarion"));
        return new Class[] {StringConfigurBuilder.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("Enable static resource handling by server itself...");
        configurer.enable();
    }




}
