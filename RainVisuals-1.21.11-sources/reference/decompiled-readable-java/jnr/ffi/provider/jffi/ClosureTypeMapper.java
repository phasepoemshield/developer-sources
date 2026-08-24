/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FromNativeType;
import jnr.ffi.mapper.FromNativeTypes;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.mapper.ToNativeType;
import jnr.ffi.mapper.ToNativeTypes;
import jnr.ffi.provider.converters.EnumConverter;
import jnr.ffi.provider.converters.StringResultConverter;
import jnr.ffi.provider.converters.StructByReferenceToNativeConverter;

final class ClosureTypeMapper
implements SignatureTypeMapper {
    private ToNativeConverter getToNativeConverter(SignatureType type, ToNativeContext context) {
        if (Enum.class.isAssignableFrom(type.getDeclaredType())) {
            return EnumConverter.getInstance(type.getDeclaredType().asSubclass(Enum.class));
        }
        if (Struct.class.isAssignableFrom(type.getDeclaredType())) {
            return StructByReferenceToNativeConverter.getInstance(context);
        }
        return null;
    }

    private FromNativeConverter getFromNativeConverter(SignatureType type, FromNativeContext context) {
        if (Enum.class.isAssignableFrom(type.getDeclaredType())) {
            return EnumConverter.getInstance(type.getDeclaredType().asSubclass(Enum.class));
        }
        if (CharSequence.class.isAssignableFrom(type.getDeclaredType())) {
            return StringResultConverter.getInstance(context);
        }
        return null;
    }

    ClosureTypeMapper() {
    }

    @Override
    public FromNativeType getFromNativeType(SignatureType type, FromNativeContext context) {
        return FromNativeTypes.create(this.getFromNativeConverter(type, context));
    }

    @Override
    public ToNativeType getToNativeType(SignatureType type, ToNativeContext context) {
        return ToNativeTypes.create(this.getToNativeConverter(type, context));
    }
}

