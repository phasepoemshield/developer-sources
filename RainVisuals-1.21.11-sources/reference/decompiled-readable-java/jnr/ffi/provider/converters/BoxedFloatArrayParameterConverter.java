/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedFloatArrayParameterConverter
implements ToNativeConverter<Float[], float[]> {
    private static final ToNativeConverter<Float[], float[]> INOUT;
    private static final ToNativeConverter<Float[], float[]> OUT;
    private final int parameterFlags;
    private static final ToNativeConverter<Float[], float[]> IN;

    BoxedFloatArrayParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public float[] toNative(Float[] array, ToNativeContext context) {
        void var3_3;
        if (array == null) {
            return null;
        }
        float[] primitive = new float[array.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < array.length; ++i) {
                primitive[i] = array[i] != null ? array[i].floatValue() : 0.0f;
            }
        }
        return var3_3;
    }

    @Override
    public Class<float[]> nativeType() {
        return float[].class;
    }

    static {
        IN = new BoxedFloatArrayParameterConverter(2);
        OUT = new Out(1);
        INOUT = new Out(3);
    }

    public static ToNativeConverter<Float[], float[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    public static final class Out
    extends BoxedFloatArrayParameterConverter
    implements ToNativeConverter.PostInvocation<Float[], float[]> {
        @Override
        public void postInvoke(Float[] array, float[] primitive, ToNativeContext context) {
            if (array != null) {
                if (primitive != null) {
                    for (int i = 0; i < array.length; ++i) {
                        array[i] = Float.valueOf(primitive[i]);
                    }
                }
            }
        }

        Out(int parameterFlags) {
            super(parameterFlags);
        }
    }
}

