/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Collection;
import jnr.ffi.annotations.Encoding;
import jnr.ffi.annotations.In;
import jnr.ffi.annotations.NulTerminate;
import jnr.ffi.mapper.MethodParameterContext;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.converters.StringUtil;

@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class CharSequenceParameterConverter
implements ToNativeConverter<CharSequence, ByteBuffer> {
    private final ThreadLocal<Reference<CharsetEncoder>> localEncoder = new ThreadLocal();
    private final Charset charset;
    private static final ToNativeConverter<CharSequence, ByteBuffer> DEFAULT = new CharSequenceParameterConverter(Charset.defaultCharset());

    public static ToNativeConverter<CharSequence, ByteBuffer> getInstance(ToNativeContext toNativeContext) {
        ToNativeContext toNativeContext2;
        Charset charset;
        Charset cs;
        Charset charset2 = Charset.defaultCharset();
        if (toNativeContext instanceof MethodParameterContext) {
            cs = CharSequenceParameterConverter.getEncodingCharset(Arrays.asList(((MethodParameterContext)toNativeContext).getMethod().getDeclaringClass().getAnnotations()));
            if (cs != null) {
                charset2 = cs;
            }
            cs = CharSequenceParameterConverter.getEncodingCharset(Arrays.asList(((MethodParameterContext)toNativeContext).getMethod().getAnnotations()));
            if (cs != null) {
                charset2 = cs;
            }
        }
        cs = CharSequenceParameterConverter.getEncodingCharset(toNativeContext.getAnnotations());
        if (cs != null) {
            charset = cs;
        }
        return CharSequenceParameterConverter.getInstance(charset, toNativeContext2);
    }

    private CharSequenceParameterConverter(Charset charset) {
        this.charset = charset;
    }

    @Override
    @NulTerminate
    @In
    public Class<ByteBuffer> nativeType() {
        return ByteBuffer.class;
    }

    private static Charset getEncodingCharset(Collection<Annotation> annotations) {
        for (Annotation a2 : annotations) {
            if (!(a2 instanceof Encoding)) continue;
            return Charset.forName(((Encoding)a2).value());
        }
        return null;
    }

    public static ToNativeConverter<CharSequence, ByteBuffer> getInstance(Charset charset, ToNativeContext toNativeContext) {
        return Charset.defaultCharset().equals(charset) ? DEFAULT : new CharSequenceParameterConverter(charset);
    }

    /*
     * WARNING - void declaration
     */
    private static ByteBuffer grow(ByteBuffer oldBuffer) {
        void var1_1;
        ByteBuffer buf = ByteBuffer.wrap(new byte[oldBuffer.capacity() * 2]);
        oldBuffer.flip();
        buf.put(oldBuffer);
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuffer toNative(CharSequence string, ToNativeContext context) {
        void var4_4;
        if (string == null) {
            return null;
        }
        CharsetEncoder encoder = StringUtil.getEncoder(this.charset, this.localEncoder);
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[(int)((float)string.length() * encoder.averageBytesPerChar()) + 4]);
        CharBuffer charBuffer = CharBuffer.wrap(string);
        encoder.reset();
        while (charBuffer.hasRemaining()) {
            void var6_6;
            CoderResult result = encoder.encode(charBuffer, byteBuffer, true);
            if (result.isUnderflow()) {
                result = encoder.flush(byteBuffer);
                if (result.isUnderflow()) break;
            }
            if (result.isOverflow()) {
                byteBuffer = CharSequenceParameterConverter.grow(byteBuffer);
                continue;
            }
            StringUtil.throwException((CoderResult)var6_6);
        }
        if (byteBuffer.remaining() <= 4) {
            byteBuffer = CharSequenceParameterConverter.grow(byteBuffer);
        }
        byteBuffer.position(byteBuffer.position() + 4);
        var4_4.flip();
        return var4_4;
    }
}

