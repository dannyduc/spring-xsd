package com.ingenuity.app.config.spring;

import com.ingenuity.app.Component;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

import java.util.List;

public class ComponentFactoryBean implements FactoryBean {

    @Setter
    private Component parent;

    @Setter
    private List children;

    @Override
    public Object getObject() throws Exception {
        if (this.children != null & this.children.size() > 0) {
            for (Object child : children) {
                Component childComponent = (Component) child;
                this.parent.addComponent(childComponent);
            }
        }
        return this.parent;
    }

    @Override
    public Class<?> getObjectType() {
        return Component.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
