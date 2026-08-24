/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jnr.ffi.mapper.FromNativeContext;

public interface FromNativeConverter<J, N> {
    public J fromNative(N var1, FromNativeContext var2);

    public Class<N> nativeType();

    @Target(value={ElementType.TYPE})
    @Retention(value=RetentionPolicy.RUNTIME)
    public static @interface Cacheable {
    }

    @Retention(value=RetentionPolicy.RUNTIME)
    @Target(value={ElementType.TYPE, ElementType.METHOD})
    public static @interface NoContext {
    }

    @Target(value={ElementType.METHOD})
    @Retention(value=RetentionPolicy.RUNTIME)
    public static @interface FromNative {
        public Class nativeType();
    }
}

