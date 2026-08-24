/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;

public interface SignatureType {
    public Collection<Annotation> getAnnotations();

    public Class getDeclaredType();

    public Type getGenericType();
}

