package com.ingenuity.app;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
public class Component {

    @Getter
    @Setter
    private String name;

    @Getter
    private List components = new ArrayList();

    public void addComponent(Component component) {
        this.components.add(component);
    }
}