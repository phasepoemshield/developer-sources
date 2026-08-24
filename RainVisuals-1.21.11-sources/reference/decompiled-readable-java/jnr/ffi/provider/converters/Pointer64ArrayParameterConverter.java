/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.LongLong;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.MemoryManager;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class Pointer64ArrayParameterConverter
implements ToNativeConverter<Pointer[], long[]> {
    protected final Runtime runtime;
    protected final int parameterFlags;

    public static ToNativeConverter<Pointer[], long[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return !ParameterFlags.isOut(parameterFlags) ? new Pointer64ArrayParameterConverter(toNativeContext.getRuntime(), parameterFlags) : new Out(toNativeContext.getRuntime(), parameterFlags);
    }

    Pointer64ArrayParameterConverter(Runtime runtime, int parameterFlags) {
        this.runtime = runtime;
        this.parameterFlags = parameterFlags;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public long[] toNative(Pointer[] pointers, ToNativeContext context) {
        void var3_3;
        if (pointers == null) {
            return null;
        }
        long[] primitive = new long[pointers.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < pointers.length; ++i) {
                if (pointers[i] != null && !pointers[i].isDirect()) {
                    throw new IllegalArgumentException("invalid pointer in array at index " + i);
                }
                primitive[i] = pointers[i] != null ? pointers[i].address() : 0L;
            }
        }
        return var3_3;
    }

    @Override
    @LongLong
    public Class<long[]> nativeType() {
        return long[].class;
    }

    public static final class Out
    extends Pointer64ArrayParameterConverter
    implements ToNativeConverter.PostInvocation<Pointer[], long[]> {
        @Override
        public void postInvoke(Pointer[] pointers, long[] primitive, ToNativeContext context) {
            if (pointers != null) {
                if (primitive != null) {
                    MemoryManager mm = this.runtime.getMemoryManager();
                    for (int i = 0; i < pointers.length; ++i) {
                        pointers[i] = mm.newPointer(primitive[i]);
                    }
                }
            }
        }

        Out(Runtime runtime, int parameterFlags) {
            super(runtime, parameterFlags);
        }
    }
}

