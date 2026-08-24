/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.NativeLong;
import jnr.ffi.mapper.AbstractDataConverter;
import jnr.ffi.mapper.DataConverter;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;

@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
@FromNativeConverter.Cacheable
@FromNativeConverter.NoContext
public final class NativeLongConverter
extends AbstractDataConverter<NativeLong, Long> {
    private static final DataConverter INSTANCE = new NativeLongConverter();

    public static DataConverter<NativeLong, Long> getInstance() {
        return INSTANCE;
    }

    @Override
    public NativeLong fromNative(Long value, FromNativeContext fromNativeContext) {
        return NativeLong.valueOf(value);
    }

    @Override
    public Long toNative(NativeLong value, ToNativeContext toNativeContext) {
        return value.longValue();
    }

    @Override
    public Class<Long> nativeType() {
        return Long.class;
    }
}

