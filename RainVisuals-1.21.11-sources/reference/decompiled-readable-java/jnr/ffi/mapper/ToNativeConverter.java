/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jnr.ffi.mapper.ToNativeContext;

public interface ToNativeConverter<J, N> {
    public N toNative(J var1, ToNativeContext var2);

    public Class<N> nativeType();

    @Target(value={ElementType.TYPE})
    @Retention(value=RetentionPolicy.RUNTIME)
    public static @interface Cacheable {
    }

    public static interface PostInvocation<J, N>
    extends ToNativeConverter<J, N> {
        public void postInvoke(J var1, N var2, ToNativeContext var3);
    }

    @Retention(value=RetentionPolicy.RUNTIME)
    @Target(value={ElementType.TYPE, ElementType.METHOD})
    public static @interface NoContext {
    }

    @Retention(value=RetentionPolicy.RUNTIME)
    @Target(value={ElementType.METHOD})
    public static @interface ToNative {
        public Class nativeType();
    }
}

