/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.Runtime;

public interface FromNativeContext {
    public Collection<Annotation> getAnnotations();

    public Runtime getRuntime();
}

