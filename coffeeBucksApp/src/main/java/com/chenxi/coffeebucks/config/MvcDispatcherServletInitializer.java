package com.chenxi.coffeebucks.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { CoffeeBucksAppConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
