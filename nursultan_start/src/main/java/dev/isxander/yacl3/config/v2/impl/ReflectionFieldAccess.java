/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.impl;

import dev.isxander.yacl3.config.v2.api.FieldAccess;
import dev.isxander.yacl3.config.v2.impl.autogen.YACLAutoGenException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Optional;

public record ReflectionFieldAccess<T>(Field field, Object instance) implements FieldAccess<T>
{
    @Override
    public String name() {
        return this.field.getName();
    }

    @Override
    public T get() {
        try {
            return (T)this.field.get(this.instance);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new YACLAutoGenException("Failed to access field '%s'".formatted(new Object[]{this.name()}), illegalAccessException);
        }
    }

    @Override
    public Type type() {
        return this.field.getGenericType();
    }

    @Override
    public <A extends Annotation> Optional<A> getAnnotation(Class<A> clazz) {
        return Optional.ofNullable(this.field.getAnnotation(clazz));
    }

    @Override
    public void set(T t) {
        try {
            this.field.set(this.instance, t);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new YACLAutoGenException("Failed to set field '%s'".formatted(new Object[]{this.name()}), illegalAccessException);
        }
    }

    @Override
    public Class<T> typeClass() {
        return this.field.getType();
    }
}

