package com.ingenuity.app.config.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author <a href="mailto:dnguyen@ingenuity.com">Danny Nguyen</a>
 * @version $Id: $
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
    }
}
