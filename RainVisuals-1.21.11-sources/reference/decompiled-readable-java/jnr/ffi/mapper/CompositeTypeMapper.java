/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeType;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeType;

public final class CompositeTypeMapper
implements SignatureTypeMapper {
    private final Collection<SignatureTypeMapper> signatureTypeMappers;

    public CompositeTypeMapper(Collection<SignatureTypeMapper> signatureTypeMappers) {
        this.signatureTypeMappers = Collections.unmodifiableList(new ArrayList<SignatureTypeMapper>(signatureTypeMappers));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ToNativeType getToNativeType(SignatureType type, ToNativeContext context) {
        Iterator<SignatureTypeMapper> iterator2 = this.signatureTypeMappers.iterator();
        while (iterator2.hasNext()) {
            void var5_5;
            SignatureTypeMapper m = iterator2.next();
            ToNativeType toNativeType = m.getToNativeType(type, context);
            if (toNativeType == null) continue;
            return var5_5;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FromNativeType getFromNativeType(SignatureType type, FromNativeContext context) {
        Iterator<SignatureTypeMapper> iterator2 = this.signatureTypeMappers.iterator();
        while (iterator2.hasNext()) {
            void var5_5;
            SignatureTypeMapper m = iterator2.next();
            FromNativeType fromNativeType = m.getFromNativeType(type, context);
            if (fromNativeType == null) continue;
            return var5_5;
        }
        return null;
    }

    public CompositeTypeMapper(SignatureTypeMapper ... signatureTypeMappers) {
        this.signatureTypeMappers = Collections.unmodifiableList(Arrays.asList((SignatureTypeMapper[])signatureTypeMappers.clone()));
    }
}

