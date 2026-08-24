/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.NativeLong;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class NativeLong32ArrayParameterConverter
implements ToNativeConverter<NativeLong[], int[]> {
    private static final ToNativeConverter<NativeLong[], int[]> IN = new NativeLong32ArrayParameterConverter(2);
    private static final ToNativeConverter<NativeLong[], int[]> INOUT;
    private final int parameterFlags;
    private static final ToNativeConverter<NativeLong[], int[]> OUT;

    @Override
    public Class<int[]> nativeType() {
        return int[].class;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] toNative(NativeLong[] array, ToNativeContext context) {
        void var3_3;
        if (array == null) {
            return null;
        }
        int[] primitive = new int[array.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < array.length; ++i) {
                primitive[i] = array[i] != null ? array[i].intValue() : 0;
            }
        }
        return var3_3;
    }

    NativeLong32ArrayParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    static {
        OUT = new Out(1);
        INOUT = new Out(3);
    }

    public static ToNativeConverter<NativeLong[], int[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    public static final class Out
    extends NativeLong32ArrayParameterConverter
    implements ToNativeConverter.PostInvocation<NativeLong[], int[]> {
        @Override
        public void postInvoke(NativeLong[] array, int[] primitive, ToNativeContext context) {
            if (array != null) {
                if (primitive != null) {
                    for (int i = 0; i < array.length; ++i) {
                        array[i] = NativeLong.valueOf(primitive[i]);
                    }
                }
            }
        }

        Out(int parameterFlags) {
            super(parameterFlags);
        }
    }
}

