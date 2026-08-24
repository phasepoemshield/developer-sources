/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.byref.ByReference;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.Cacheable
public class ByReferenceParameterConverter
implements ToNativeConverter<ByReference, Pointer> {
    private final int parameterFlags;
    private static final ToNativeConverter<ByReference, Pointer> OUT;
    private static final ToNativeConverter<ByReference, Pointer> INOUT;
    private static final ToNativeConverter<ByReference, Pointer> IN;

    static {
        IN = new ByReferenceParameterConverter(2);
        OUT = new Out(1);
        INOUT = new Out(3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Pointer toNative(ByReference value, ToNativeContext context) {
        void var3_3;
        if (value == null) {
            return null;
        }
        Pointer memory = Memory.allocate(context.getRuntime(), value.nativeSize(context.getRuntime()));
        if (ParameterFlags.isIn(this.parameterFlags)) {
            value.toNative(context.getRuntime(), memory, 0L);
        }
        return var3_3;
    }

    private ByReferenceParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    public static ToNativeConverter<ByReference, Pointer> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    @Override
    public Class<Pointer> nativeType() {
        return Pointer.class;
    }

    public static final class Out
    extends ByReferenceParameterConverter
    implements ToNativeConverter.PostInvocation<ByReference, Pointer> {
        @Override
        public void postInvoke(ByReference byReference, Pointer pointer, ToNativeContext context) {
            if (byReference != null) {
                if (pointer != null) {
                    byReference.fromNative(context.getRuntime(), pointer, 0L);
                }
            }
        }

        public Out(int parameterFlags) {
            super(parameterFlags);
        }
    }
}

