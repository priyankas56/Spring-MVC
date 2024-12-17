package com.xworkz.parrot.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;

public interface SpringWebInitInterface {
    void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer);
}
