/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.util.Map;
import jnr.ffi.LibraryOption;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.CachingTypeMapper;
import jnr.ffi.mapper.CompositeTypeMapper;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.SignatureTypeMapperAdapter;
import jnr.ffi.mapper.TypeMapper;
import jnr.ffi.provider.NullTypeMapper;
import jnr.ffi.provider.jffi.AnnotationTypeMapper;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.InvokerTypeMapper;
import jnr.ffi.provider.jffi.NativeClosureManager;
import jnr.ffi.provider.jffi.NativeLibrary;
import jnr.ffi.provider.jffi.NativeLibraryLoader;

public abstract class LibraryLoader {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static SignatureTypeMapper getSignatureTypeMapper(Map<LibraryOption, ?> libraryOptions) {
        NullTypeMapper nullTypeMapper;
        SignatureTypeMapper typeMapper;
        if (!libraryOptions.containsKey((Object)LibraryOption.TypeMapper)) return new NullTypeMapper();
        Object tm = libraryOptions.get((Object)LibraryOption.TypeMapper);
        if (tm instanceof SignatureTypeMapper) {
            typeMapper = (SignatureTypeMapper)tm;
            return nullTypeMapper;
        } else {
            if (!(tm instanceof TypeMapper)) throw new IllegalArgumentException("TypeMapper option is not a valid TypeMapper instance");
            typeMapper = new SignatureTypeMapperAdapter((TypeMapper)tm);
        }
        return nullTypeMapper;
    }

    static CompositeTypeMapper newCompositeTypeMapper(Runtime runtime, AsmClassLoader classLoader, SignatureTypeMapper typeMapper, CompositeTypeMapper closureTypeMapper) {
        SignatureTypeMapper[] signatureTypeMapperArray = new SignatureTypeMapper[3];
        signatureTypeMapperArray[0] = typeMapper;
        signatureTypeMapperArray[1] = new CachingTypeMapper(new InvokerTypeMapper(new NativeClosureManager(runtime, closureTypeMapper), classLoader, NativeLibraryLoader.ASM_ENABLED));
        signatureTypeMapperArray[2] = new CachingTypeMapper(new AnnotationTypeMapper());
        return new CompositeTypeMapper(signatureTypeMapperArray);
    }

    abstract <T> T loadLibrary(NativeLibrary var1, Class<T> var2, Map<LibraryOption, ?> var3, boolean var4);

    static CompositeTypeMapper newClosureTypeMapper(AsmClassLoader classLoader, SignatureTypeMapper typeMapper) {
        SignatureTypeMapper[] signatureTypeMapperArray = new SignatureTypeMapper[3];
        signatureTypeMapperArray[0] = typeMapper;
        signatureTypeMapperArray[1] = new CachingTypeMapper(new InvokerTypeMapper(null, classLoader, NativeLibraryLoader.ASM_ENABLED));
        signatureTypeMapperArray[2] = new CachingTypeMapper(new AnnotationTypeMapper());
        return new CompositeTypeMapper(signatureTypeMapperArray);
    }
}

