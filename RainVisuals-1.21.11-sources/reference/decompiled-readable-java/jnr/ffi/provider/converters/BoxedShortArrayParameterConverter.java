/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedShortArrayParameterConverter
implements ToNativeConverter<Short[], short[]> {
    private static final ToNativeConverter<Short[], short[]> IN = new BoxedShortArrayParameterConverter(2);
    private static final ToNativeConverter<Short[], short[]> INOUT;
    private final int parameterFlags;
    private static final ToNativeConverter<Short[], short[]> OUT;

    static {
        OUT = new Out(1);
        INOUT = new Out(3);
    }

    public BoxedShortArrayParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    @Override
    public Class<short[]> nativeType() {
        return short[].class;
    }

    public static ToNativeConverter<Short[], short[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public short[] toNative(Short[] array, ToNativeContext context) {
        void var3_3;
        if (array == null) {
            return null;
        }
        short[] primitive = new short[array.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < array.length; ++i) {
                primitive[i] = array[i] != null ? array[i] : (short)0;
            }
        }
        return var3_3;
    }

    public static final class Out
    extends BoxedShortArrayParameterConverter
    implements ToNativeConverter.PostInvocation<Short[], short[]> {
        @Override
        public void postInvoke(Short[] array, short[] primitive, ToNativeContext context) {
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

