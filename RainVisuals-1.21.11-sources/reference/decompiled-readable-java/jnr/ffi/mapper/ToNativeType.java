/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jnr.ffi.mapper.ToNativeConverter;

public interface ToNativeType {
    public ToNativeConverter getToNativeConverter();

    @Target(value={ElementType.TYPE})
    @Retention(value=RetentionPolicy.RUNTIME)
    public static @interface Cacheable {
    }
}

