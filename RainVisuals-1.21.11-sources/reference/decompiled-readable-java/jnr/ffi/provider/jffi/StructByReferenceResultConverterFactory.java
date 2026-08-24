/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.provider.converters.StructByReferenceFromNativeConverter;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.AsmStructByReferenceFromNativeConverter;

final class StructByReferenceResultConverterFactory {
    private final boolean asmEnabled;
    private final Map<Class<? extends Struct>, FromNativeConverter<? extends Struct, Pointer>> converters = new ConcurrentHashMap<Class<? extends Struct>, FromNativeConverter<? extends Struct, Pointer>>();
    private final AsmClassLoader classLoader;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public final FromNativeConverter<? extends Struct, Pointer> get(Class<? extends Struct> structClass, FromNativeContext fromNativeContext) {
        void var3_3;
        FromNativeConverter<? extends Struct, Pointer> converter = this.converters.get(structClass);
        if (converter == null) {
            Map<Class<? extends Struct>, FromNativeConverter<? extends Struct, Pointer>> map = this.converters;
            synchronized (map) {
                converter = this.converters.get(structClass);
                if (converter == null) {
                    converter = this.createConverter(fromNativeContext.getRuntime(), structClass, fromNativeContext);
                    this.converters.put(structClass, converter);
                }
            }
        }
        return var3_3;
    }

    public StructByReferenceResultConverterFactory(AsmClassLoader classLoader, boolean asmEnabled) {
        this.classLoader = classLoader;
        this.asmEnabled = asmEnabled;
    }

    private FromNativeConverter<? extends Struct, Pointer> createConverter(Runtime runtime, Class<? extends Struct> structClass, FromNativeContext fromNativeContext) {
        return this.asmEnabled ? AsmStructByReferenceFromNativeConverter.newStructByReferenceConverter(runtime, structClass, 0, this.classLoader) : StructByReferenceFromNativeConverter.getInstance(structClass, fromNativeContext);
    }
}

