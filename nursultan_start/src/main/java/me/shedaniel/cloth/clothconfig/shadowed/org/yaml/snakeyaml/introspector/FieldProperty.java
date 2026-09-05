/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayUtils
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.GenericProperty;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayUtils;

public class FieldProperty
extends GenericProperty {
    private final Field field;

    public FieldProperty(Field field) {
        super(field.getName(), field.getType(), field.getGenericType());
        this.field = field;
        field.setAccessible(true);
    }

    @Override
    public Object get(Object object) {
        try {
            return this.field.get(object);
        }
        catch (Exception exception) {
            throw new YAMLException("Unable to access field " + this.field.getName() + " on object " + object + " : " + exception);
        }
    }

    @Override
    public <A extends Annotation> A getAnnotation(Class<A> clazz) {
        return this.field.getAnnotation(clazz);
    }

    @Override
    public List<Annotation> getAnnotations() {
        return ArrayUtils.toUnmodifiableList((Object[])this.field.getAnnotations());
    }

    @Override
    public void set(Object object, Object object2) throws Exception {
        this.field.set(object, object2);
    }
}

