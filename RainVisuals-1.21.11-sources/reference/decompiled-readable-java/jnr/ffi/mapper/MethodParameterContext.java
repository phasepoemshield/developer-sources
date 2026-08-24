/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.util.Annotations;

public final class MethodParameterContext
implements ToNativeContext {
    private Collection<Annotation> annotations;
    private Annotation[] annotationArray;
    private final int parameterIndex;
    private final Method method;
    private final Runtime runtime;

    private Collection<Annotation> buildAnnotationCollection() {
        if (this.annotationArray != null) {
            this.annotations = Annotations.sortedAnnotationCollection(this.annotationArray);
            return this.annotations;
        }
        this.annotationArray = this.method.getParameterAnnotations()[this.parameterIndex];
        this.annotations = Annotations.sortedAnnotationCollection(this.annotationArray);
        return this.annotations;
    }

    public MethodParameterContext(Runtime runtime, Method method, int parameterIndex, Annotation[] annotationArray) {
        this.runtime = runtime;
        this.method = method;
        this.parameterIndex = parameterIndex;
        this.annotationArray = (Annotation[])annotationArray.clone();
    }

    @Override
    public Collection<Annotation> getAnnotations() {
        return this.annotations != null ? this.annotations : this.buildAnnotationCollection();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) return false;
        if (this.getClass() != o.getClass()) {
            return false;
        }
        MethodParameterContext that = (MethodParameterContext)o;
        if (this.parameterIndex != that.parameterIndex) return false;
        if (!this.method.equals(that.method)) return false;
        if (!this.getAnnotations().equals(that.getAnnotations())) return false;
        return true;
    }

    public int getParameterIndex() {
        return this.parameterIndex;
    }

    @Override
    public Runtime getRuntime() {
        return this.runtime;
    }

    public MethodParameterContext(Runtime runtime, Method method, int parameterIndex, Collection<Annotation> annotations) {
        this.runtime = runtime;
        this.method = method;
        this.parameterIndex = parameterIndex;
        this.annotations = Annotations.sortedAnnotationCollection(annotations);
    }

    public int hashCode() {
        int result = this.method.hashCode();
        result = 31 * result + this.parameterIndex;
        result = 31 * result + this.getAnnotations().hashCode();
        return result;
    }

    public MethodParameterContext(Runtime runtime, Method method, int parameterIndex) {
        this.runtime = runtime;
        this.method = method;
        this.parameterIndex = parameterIndex;
    }

    public Method getMethod() {
        return this.method;
    }
}

