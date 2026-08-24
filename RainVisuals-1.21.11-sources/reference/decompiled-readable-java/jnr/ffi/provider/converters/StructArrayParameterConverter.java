/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.DelegatingMemoryIO;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class StructArrayParameterConverter
implements ToNativeConverter<Struct[], Pointer> {
    protected final Runtime runtime;
    protected final int parameterFlags;

    private static int align(int offset, int align) {
        return offset + align - 1 & ~(align + -1);
    }

    public static ToNativeConverter<Struct[], Pointer> getInstance(ToNativeContext toNativeContext, Class structClass) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return !ParameterFlags.isOut(parameterFlags) ? new StructArrayParameterConverter(toNativeContext.getRuntime(), parameterFlags) : new Out(toNativeContext.getRuntime(), structClass.asSubclass(Struct.class), parameterFlags);
    }

    @Override
    public Class<Pointer> nativeType() {
        return Pointer.class;
    }

    StructArrayParameterConverter(Runtime runtime, int parameterFlags) {
        this.runtime = runtime;
        this.parameterFlags = parameterFlags;
    }

    @Override
    public Pointer toNative(Struct[] structs, ToNativeContext context) {
        if (structs == null) {
            return null;
        }
        Pointer memory = Struct.getMemory(structs[0], this.parameterFlags);
        if (!(memory instanceof DelegatingMemoryIO)) {
            throw new RuntimeException("Struct array must be backed by contiguous array");
        }
        return ((DelegatingMemoryIO)((Object)memory)).getDelegatedMemoryIO();
    }

    public static final class Out
    extends StructArrayParameterConverter
    implements ToNativeConverter.PostInvocation<Struct[], Pointer> {
        private final Constructor<? extends Struct> constructor;

        /*
         * WARNING - void declaration
         */
        @Override
        public void postInvoke(Struct[] structs, Pointer primitive, ToNativeContext context) {
            if (structs != null) {
                if (primitive != null) {
                    try {
                        int off = 0;
                        int i = 0;
                        while (i < structs.length) {
                            void var5_8;
                            void var6_9;
                            Object[] objectArray = new Object[1];
                            objectArray[0] = this.runtime;
                            structs[i] = this.constructor.newInstance(objectArray);
                            int structSize = StructArrayParameterConverter.align(Struct.size(structs[i]), Struct.alignment(structs[i]));
                            off = StructArrayParameterConverter.align(off, Struct.alignment(structs[i]));
                            structs[i].useMemory(primitive.slice(off, structSize));
                            off += var6_9;
                            ++var5_8;
                        }
                    }
                    catch (InstantiationException ie) {
                        void iae;
                        throw new RuntimeException((Throwable)iae);
                    }
                    catch (IllegalAccessException iae) {
                        void ite;
                        throw new RuntimeException((Throwable)ite);
                    }
                    catch (InvocationTargetException ite) {
                        void var4_7;
                        throw new RuntimeException((Throwable)var4_7);
                    }
                }
            }
        }

        Out(Runtime runtime, Class<? extends Struct> structClass, int parameterFlags) {
            super(runtime, parameterFlags);
            Constructor<? extends Struct> cons;
            try {
                Class[] classArray = new Class[1];
                classArray[0] = Runtime.class;
                cons = structClass.getConstructor(classArray);
            }
            catch (NoSuchMethodException nsme) {
                throw new RuntimeException(structClass.getName() + " has no constructor that accepts jnr.ffi.Runtime");
            }
            catch (Throwable t) {
                throw new RuntimeException(t);
            }
            this.constructor = cons;
        }
    }
}

