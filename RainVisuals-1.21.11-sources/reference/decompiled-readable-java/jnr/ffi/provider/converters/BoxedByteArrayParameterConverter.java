/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedByteArrayParameterConverter
implements ToNativeConverter<Byte[], byte[]> {
    private static final ToNativeConverter<Byte[], byte[]> OUT;
    private static final ToNativeConverter<Byte[], byte[]> INOUT;
    private static final ToNativeConverter<Byte[], byte[]> IN;
    private final int parameterFlags;

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] toNative(Byte[] array, ToNativeContext context) {
        void var3_3;
        if (array == null) {
            return null;
        }
        byte[] primitive = new byte[array.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < array.length; ++i) {
                primitive[i] = array[i] != null ? array[i] : (byte)0;
            }
        }
        return var3_3;
    }

    public static ToNativeConverter<Byte[], byte[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    BoxedByteArrayParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    @Override
    public Class<byte[]> nativeType() {
        return byte[].class;
    }

    static {
        IN = new BoxedByteArrayParameterConverter(2);
        OUT = new Out(1);
        INOUT = new Out(3);
    }

    public static final class Out
    extends BoxedByteArrayParameterConverter
    implements ToNativeConverter.PostInvocation<Byte[], byte[]> {
        @Override
        public void postInvoke(Byte[] array, byte[] primitive, ToNativeContext context) {
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

