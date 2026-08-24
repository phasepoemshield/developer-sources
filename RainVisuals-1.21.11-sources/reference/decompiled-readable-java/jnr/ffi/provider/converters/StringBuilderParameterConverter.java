/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;
import jnr.ffi.provider.converters.StringUtil;

@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class StringBuilderParameterConverter
implements ToNativeConverter<StringBuilder, ByteBuffer>,
ToNativeConverter.PostInvocation<StringBuilder, ByteBuffer> {
    private final ThreadLocal<Reference<CharsetDecoder>> localDecoder;
    private final int parameterFlags;
    private final ThreadLocal<Reference<CharsetEncoder>> localEncoder = new ThreadLocal();
    private final int terminatorWidth;
    private final Charset charset;

    private StringBuilderParameterConverter(Charset charset, int parameterFlags) {
        this.localDecoder = new ThreadLocal();
        this.charset = charset;
        this.parameterFlags = parameterFlags;
        this.terminatorWidth = StringUtil.terminatorWidth(charset);
    }

    @Override
    public Class<ByteBuffer> nativeType() {
        return ByteBuffer.class;
    }

    public static StringBuilderParameterConverter getInstance(Charset charset, int parameterFlags, ToNativeContext toNativeContext) {
        return new StringBuilderParameterConverter(charset, parameterFlags);
    }

    public static StringBuilderParameterConverter getInstance(int parameterFlags, ToNativeContext toNativeContext) {
        return new StringBuilderParameterConverter(StringUtil.getCharset(toNativeContext), parameterFlags);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuffer toNative(StringBuilder parameter, ToNativeContext context) {
        void var4_4;
        if (parameter == null) {
            return null;
        }
        CharsetEncoder encoder = StringUtil.getEncoder(this.charset, this.localEncoder);
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[parameter.capacity() * (int)Math.ceil(encoder.maxBytesPerChar()) + 4]);
        if (ParameterFlags.isIn(this.parameterFlags)) {
            byteBuffer.mark();
            encoder.reset();
            CoderResult result = encoder.encode(CharBuffer.wrap(parameter), byteBuffer, true);
            if (result.isUnderflow()) {
                result = encoder.flush(byteBuffer);
            }
            if (result.isError()) {
                StringUtil.throwException(result);
            }
            byteBuffer.reset();
        }
        return var4_4;
    }

    @Override
    public void postInvoke(StringBuilder stringBuilder, ByteBuffer buf, ToNativeContext context) {
        if (ParameterFlags.isOut(this.parameterFlags) && stringBuilder != null) {
            if (buf != null) {
                buf.limit(StringUtil.stringLength(buf, this.terminatorWidth));
                try {
                    stringBuilder.delete(0, stringBuilder.length()).append(StringUtil.getDecoder(this.charset, this.localDecoder).reset().decode(buf));
                }
                catch (CharacterCodingException cce) {
                    throw new RuntimeException(cce);
                }
            }
        }
    }
}

