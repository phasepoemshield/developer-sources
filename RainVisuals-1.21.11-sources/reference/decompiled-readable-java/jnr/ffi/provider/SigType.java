/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import jnr.ffi.NativeType;
import jnr.ffi.mapper.SignatureType;

public abstract class SigType
implements SignatureType {
    private final NativeType nativeType;
    private final Class convertedType;
    private final Collection<Annotation> annotations;
    private final Class javaType;

    @Override
    public Type getGenericType() {
        return this.getDeclaredType();
    }

    public SigType(Class javaType, NativeType nativeType, Collection<Annotation> annotations, Class convertedType) {
        this.javaType = javaType;
        this.annotations = annotations;
        this.convertedType = convertedType;
        this.nativeType = nativeType;
    }

    @Override
    public final Class getDeclaredType() {
        return this.javaType;
    }

    public final String toString() {
        Object[] objectArray = new Object[3];
        objectArray[0] = this.getDeclaredType();
        objectArray[1] = this.effectiveJavaType();
        objectArray[2] = this.getNativeType();
        return String.format("declared: %s, effective: %s, native: %s", objectArray);
    }

    @Override
    public final Collection<Annotation> getAnnotations() {
        return this.annotations;
    }

    public final Class effectiveJavaType() {
        return this.convertedType;
    }

    public NativeType getNativeType() {
        return this.nativeType;
    }

    public final Collection<Annotation> annotations() {
        return this.annotations;
    }
}

