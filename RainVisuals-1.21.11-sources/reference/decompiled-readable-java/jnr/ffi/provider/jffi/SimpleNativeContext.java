/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.ToNativeContext;

public class SimpleNativeContext
implements ToNativeContext,
FromNativeContext {
    private final Collection<Annotation> annotations;
    private final Runtime runtime;

    @Override
    public Collection<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override
    public final Runtime getRuntime() {
        return this.runtime;
    }

    SimpleNativeContext(Runtime runtime, Collection<Annotation> annotations) {
        this.runtime = runtime;
        this.annotations = annotations;
    }
}

