/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Optional;

public interface ReadOnlyFieldAccess<T> {
    public String name();

    public T get();

    public Type type();

    public <A extends Annotation> Optional<A> getAnnotation(Class<A> var1);

    public Class<T> typeClass();
}

