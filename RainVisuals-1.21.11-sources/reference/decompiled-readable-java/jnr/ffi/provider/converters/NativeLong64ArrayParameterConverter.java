/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import jnr.ffi.NativeLong;
import jnr.ffi.annotations.LongLong;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class NativeLong64ArrayParameterConverter
implements ToNativeConverter<NativeLong[], long[]> {
    private static final ToNativeConverter<NativeLong[], long[]> IN = new NativeLong64ArrayParameterConverter(2);
    private static final ToNativeConverter<NativeLong[], long[]> OUT = new Out(1);
    private static final ToNativeConverter<NativeLong[], long[]> INOUT = new Out(3);
    private final int parameterFlags;

    private NativeLong64ArrayParameterConverter(int parameterFlags) {
        this.parameterFlags = parameterFlags;
    }

    @Override
    @LongLong
    public Class<long[]> nativeType() {
        return long[].class;
    }

    public static ToNativeConverter<NativeLong[], long[]> getInstance(ToNativeContext toNativeContext) {
        int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
        return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public long[] toNative(NativeLong[] array, ToNativeContext context) {
        void var3_3;
        if (array == null) {
            return null;
        }
        long[] primitive = new long[array.length];
        if (ParameterFlags.isIn(this.parameterFlags)) {
            for (int i = 0; i < array.length; ++i) {
                primitive[i] = array[i] != null ? (long)array[i].intValue() : 0L;
            }
        }
        return var3_3;
    }

    public static final class Out
    extends NativeLong64ArrayParameterConverter
    implements ToNativeConverter.PostInvocation<NativeLong[], long[]> {
        @Override
        public void postInvoke(NativeLong[] array, long[] primitive, ToNativeContext context) {
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

