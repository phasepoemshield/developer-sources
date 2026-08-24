/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedBooleanArrayParameterConverter
implements ToNativeConverter<Boolean[], boolean[]> {
    private static final ToNativeConverter<Boolean[], boolean[]> OUT;
    private static final ToNativeConverter<Boolean[], boolean[]> INOUT;
    private static final ToNativeConverter<Boolean[], boolean[]> IN;
    private final int parameterFlags;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean[] toNative(Boolean[] array, ToNativeContext context) {
        void var3_3;
        if (array == null) {
            return null;
        }
        boolean[] primitive = new boolean[array.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < array.length; ++i) {
                primitive[i] = array[i] != null ? array[i] : false;
            }
        }
        return var3_3;
    }

    public static ToNativeConverter<Boolean[], boolean[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    static {
        IN = new BoxedBooleanArrayParameterConverter(2);
        OUT = new Out(1);
        INOUT = new Out(3);
    }

    @Override
    public Class<boolean[]> nativeType() {
        return boolean[].class;
    }

    public BoxedBooleanArrayParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    public static final class Out
    extends BoxedBooleanArrayParameterConverter
    implements ToNativeConverter.PostInvocation<Boolean[], boolean[]> {
        @Override
        public void postInvoke(Boolean[] array, boolean[] primitive, ToNativeContext context) {
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

