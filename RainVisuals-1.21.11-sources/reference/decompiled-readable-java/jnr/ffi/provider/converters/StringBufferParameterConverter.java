/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;
import jnr.ffi.util.BufferUtil;

@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class StringBufferParameterConverter
implements ToNativeConverter<StringBuffer, ByteBuffer>,
ToNativeConverter.PostInvocation<StringBuffer, ByteBuffer> {
    private final Charset charset;
    private final int parameterFlags;

    @Override
    public Class<ByteBuffer> nativeType() {
        return ByteBuffer.class;
    }

    public static StringBufferParameterConverter getInstance(int parameterFlags, ToNativeContext toNativeContext) {
        return new StringBufferParameterConverter(Charset.defaultCharset(), parameterFlags);
    }

    public static StringBufferParameterConverter getInstance(Charset charset, int parameterFlags, ToNativeContext toNativeContext) {
        return new StringBufferParameterConverter(charset, parameterFlags);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuffer toNative(StringBuffer parameter, ToNativeContext context) {
        void var3_3;
        block6: {
            void var4_4;
            ByteBuffer buf;
            block5: {
                block4: {
                    if (parameter == null) {
                        return null;
                    }
                    ByteBuffer byteBuffer = buf = ParameterFlags.isIn(this.parameterFlags) ? this.charset.encode(CharBuffer.wrap(parameter)) : ByteBuffer.allocate(parameter.capacity() + 1);
                    if (!ParameterFlags.isOut(this.parameterFlags)) break block4;
                    if (buf.capacity() < parameter.capacity() + 1) break block5;
                }
                if (buf.hasArray()) break block6;
            }
            byte[] array = new byte[parameter.capacity() + 1];
            buf.get(array, 0, buf.remaining());
            return ByteBuffer.wrap((byte[])var4_4);
        }
        return var3_3;
    }

    private StringBufferParameterConverter(Charset charset, int parameterFlags) {
        this.charset = charset;
        this.parameterFlags = parameterFlags;
    }

    @Override
    public void postInvoke(StringBuffer stringBuffer, ByteBuffer buf, ToNativeContext context) {
        if (ParameterFlags.isOut(this.parameterFlags) && stringBuffer != null) {
            if (buf != null) {
                buf.limit(buf.capacity());
                stringBuffer.delete(0, stringBuffer.length()).append(BufferUtil.getCharSequence(buf, this.charset));
            }
        }
    }
}

