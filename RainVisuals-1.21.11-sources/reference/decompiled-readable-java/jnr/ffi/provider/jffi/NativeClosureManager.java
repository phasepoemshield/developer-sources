/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.util.IdentityHashMap;
import java.util.Map;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.CachingTypeMapper;
import jnr.ffi.mapper.CompositeTypeMapper;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ClosureManager;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.ClosureFromNativeConverter;
import jnr.ffi.provider.jffi.ClosureTypeMapper;
import jnr.ffi.provider.jffi.NativeClosureFactory;

final class NativeClosureManager
implements ClosureManager {
    private final SignatureTypeMapper typeMapper;
    private volatile Map<Class<?>, NativeClosureFactory> factories = new IdentityHashMap();
    private volatile Map<ClassLoader, AsmClassLoader> asmClassLoaders = new IdentityHashMap<ClassLoader, AsmClassLoader>();
    private final Runtime runtime;

    @Override
    public final <T> Pointer getClosurePointer(Class<? extends T> closureClass, T instance) {
        return this.getClosureFactory(closureClass).getClosureReference(instance).getPointer();
    }

    <T> ToNativeConverter<T, Pointer> newClosureSite(Class<T> closureClass) {
        return new ClosureSite(this.getClosureFactory(closureClass));
    }

    /*
     * WARNING - void declaration
     */
    synchronized <T> NativeClosureFactory<T> initClosureFactory(Class<T> closureClass, AsmClassLoader classLoader) {
        void var3_3;
        NativeClosureFactory factory = this.factories.get(closureClass);
        if (factory != null) {
            return factory;
        }
        factory = NativeClosureFactory.newClosureFactory(this.runtime, closureClass, this.typeMapper, classLoader);
        IdentityHashMap factories = new IdentityHashMap();
        factories.putAll(this.factories);
        factories.put(closureClass, factory);
        this.factories = factories;
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    <T> NativeClosureFactory<T> getClosureFactory(Class<T> closureClass) {
        void var3_3;
        NativeClosureFactory factory = this.factories.get(closureClass);
        if (factory != null) {
            return factory;
        }
        AsmClassLoader asmCl = this.asmClassLoaders.get(closureClass.getClassLoader());
        if (asmCl == null) {
            asmCl = new AsmClassLoader(closureClass.getClassLoader());
            this.asmClassLoaders.put(closureClass.getClassLoader(), asmCl);
        }
        return this.initClosureFactory(closureClass, (AsmClassLoader)var3_3);
    }

    @Override
    public <T> T newClosure(Class<? extends T> closureClass, T instance) {
        NativeClosureFactory factory = this.factories.get(closureClass);
        if (factory != null) {
            // empty if block
        }
        return null;
    }

    NativeClosureManager(Runtime runtime, SignatureTypeMapper typeMapper) {
        this.runtime = runtime;
        SignatureTypeMapper[] signatureTypeMapperArray = new SignatureTypeMapper[2];
        signatureTypeMapperArray[0] = typeMapper;
        signatureTypeMapperArray[1] = new CachingTypeMapper(new ClosureTypeMapper());
        this.typeMapper = new CompositeTypeMapper(signatureTypeMapperArray);
    }

    @ToNativeConverter.NoContext
    public static final class ClosureSite<T>
    implements ToNativeConverter<T, Pointer> {
        private final NativeClosureFactory<T> factory;
        private NativeClosureFactory.ClosureReference closureReference = null;

        @Override
        public Class<Pointer> nativeType() {
            return Pointer.class;
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public Pointer toNative(T value, ToNativeContext context) {
            void var3_3;
            block8: {
                NativeClosureFactory.ClosureReference ref;
                block7: {
                    if (value == null) {
                        return null;
                    }
                    if (value instanceof ClosureFromNativeConverter.AbstractClosurePointer) {
                        return (ClosureFromNativeConverter.AbstractClosurePointer)value;
                    }
                    ref = this.closureReference;
                    if (ref != null) {
                        if (ref.getCallable() == value) {
                            return ref.getPointer();
                        }
                    }
                    ref = this.factory.getClosureReference(value);
                    if (this.closureReference == null) break block7;
                    if (this.closureReference.get() != null) break block8;
                }
                this.closureReference = ref;
            }
            return var3_3.getPointer();
        }

        private ClosureSite(NativeClosureFactory<T> factory) {
            this.factory = factory;
        }
    }
}

