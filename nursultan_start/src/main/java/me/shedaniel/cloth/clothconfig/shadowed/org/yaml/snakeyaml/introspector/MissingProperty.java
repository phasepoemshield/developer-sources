/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.Property;

public class MissingProperty
extends Property {
    public MissingProperty(String string) {
        super(string, Object.class);
    }

    @Override
    public Object get(Object object) {
        return object;
    }

    @Override
    public <A extends Annotation> A getAnnotation(Class<A> clazz) {
        return null;
    }

    @Override
    public List<Annotation> getAnnotations() {
        return Collections.emptyList();
    }

    @Override
    public void set(Object object, Object object2) throws Exception {
    }

    @Override
    public Class<?>[] getActualTypeArguments() {
        return new Class[0];
    }
}

