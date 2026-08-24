/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class Long32ArrayParameterConverter
implements ToNativeConverter<long[], int[]> {
    private final int parameterFlags;
    private static final Long32ArrayParameterConverter OUT;
    private static final Long32ArrayParameterConverter IN;
    private static final Long32ArrayParameterConverter INOUT;

    @Override
    public Class<int[]> nativeType() {
        return int[].class;
    }

    static {
        IN = new Long32ArrayParameterConverter(2);
        OUT = new Out(1);
        INOUT = new Out(3);
    }

    private Long32ArrayParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] toNative(long[] array, ToNativeContext context) {
        void var3_3;
        if (array == null) {
            return null;
        }
        int[] primitive = new int[array.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < array.length; ++i) {
                primitive[i] = (int)array[i];
            }
        }
        return var3_3;
    }

    public static ToNativeConverter<long[], int[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    public static final class Out
    extends Long32ArrayParameterConverter
    implements ToNativeConverter.PostInvocation<long[], int[]> {
        Out(int parameterFlags) {
            super(parameterFlags);
        }

        @Override
        public void postInvoke(long[] array, int[] primitive, ToNativeContext context) {
            if (array != null) {
                if (primitive != null) {
                    for (int i = 0; i < array.length; ++i) {
                        array[i] = primitive[i];
                    }
                }
            }
        }
    }
}

