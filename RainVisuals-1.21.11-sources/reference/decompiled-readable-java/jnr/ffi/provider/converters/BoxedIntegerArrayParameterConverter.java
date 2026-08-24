/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class BoxedIntegerArrayParameterConverter
implements ToNativeConverter<Integer[], int[]> {
    private static final ToNativeConverter<Integer[], int[]> INOUT;
    private final int parameterFlags;
    private static final ToNativeConverter<Integer[], int[]> IN;
    private static final ToNativeConverter<Integer[], int[]> OUT;

    @Override
    public Class<int[]> nativeType() {
        return int[].class;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] toNative(Integer[] array, ToNativeContext context) {
        void var3_3;
        if (array == null) {
            return null;
        }
        int[] primitive = new int[array.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < array.length; ++i) {
                primitive[i] = array[i] != null ? array[i] : 0;
            }
        }
        return var3_3;
    }

    public static ToNativeConverter<Integer[], int[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    static {
        IN = new BoxedIntegerArrayParameterConverter(2);
        OUT = new Out(1);
        INOUT = new Out(3);
    }

    public BoxedIntegerArrayParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    public static final class Out
    extends BoxedIntegerArrayParameterConverter
    implements ToNativeConverter.PostInvocation<Integer[], int[]> {
        @Override
        public void postInvoke(Integer[] array, int[] primitive, ToNativeContext context) {
            if (array != null) {
                if (primitive != null) {
                    for (int i = 0; i < array.length; ++i) {
                        array[i] = primitive[i];
                    }
                }
            }
        }

        Out(int parameterFlags) {
            super(parameterFlags);
        }
    }
}

