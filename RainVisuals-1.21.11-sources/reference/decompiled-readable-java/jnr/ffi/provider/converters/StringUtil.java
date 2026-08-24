/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import jnr.ffi.annotations.Encoding;
import jnr.ffi.mapper.MethodParameterContext;
import jnr.ffi.mapper.ToNativeContext;

final class StringUtil {
    private static final Charset ISO8859_1;
    private static final Charset UTF16BE;
    private static final Charset UTF16;
    private static final Charset UTF8;
    private static final Charset USASCII;
    private static final Charset UTF16LE;

    static int terminatorWidth(Charset charset) {
        block7: {
            block6: {
                block5: {
                    block4: {
                        if (charset.equals(UTF8) || charset.equals(USASCII)) break block4;
                        if (!charset.equals(ISO8859_1)) break block5;
                    }
                    return 1;
                }
                if (charset.equals(UTF16) || charset.equals(UTF16LE)) break block6;
                if (!charset.equals(UTF16BE)) break block7;
            }
            return 2;
        }
        return 4;
    }

    /*
     * WARNING - void declaration
     */
    private static CharsetDecoder initDecoder(Charset charset, ThreadLocal<Reference<CharsetDecoder>> localDecoder) {
        void var2_2;
        CharsetDecoder decoder = charset.newDecoder();
        decoder.onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        localDecoder.set(new SoftReference<CharsetDecoder>(decoder));
        return var2_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static CharsetEncoder getEncoder(Charset charset, ThreadLocal<Reference<CharsetEncoder>> localEncoder) {
        void var1_1;
        CharsetEncoder charsetEncoder;
        Reference<CharsetEncoder> ref = localEncoder.get();
        if (ref != null) {
            CharsetEncoder encoder = ref.get();
            if (encoder != null) {
                if (encoder.charset() == charset) {
                    void var3_3;
                    charsetEncoder = var3_3;
                    return charsetEncoder;
                }
            }
        }
        charsetEncoder = StringUtil.initEncoder(charset, (ThreadLocal<Reference<CharsetEncoder>>)var1_1);
        return charsetEncoder;
    }

    static {
        UTF8 = Charset.forName("UTF-8");
        USASCII = Charset.forName("US-ASCII");
        ISO8859_1 = Charset.forName("ISO-8859-1");
        UTF16 = Charset.forName("UTF-16");
        UTF16LE = Charset.forName("UTF-16LE");
        UTF16BE = Charset.forName("UTF-16BE");
    }

    /*
     * WARNING - void declaration
     */
    private static CharsetEncoder initEncoder(Charset charset, ThreadLocal<Reference<CharsetEncoder>> localEncoder) {
        void var2_2;
        CharsetEncoder encoder = charset.newEncoder();
        encoder.onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        localEncoder.set(new SoftReference<CharsetEncoder>(encoder));
        return var2_2;
    }

    private static Charset getEncodingCharset(Collection<Annotation> annotations) {
        for (Annotation a2 : annotations) {
            if (!(a2 instanceof Encoding)) continue;
            return Charset.forName(((Encoding)a2).value());
        }
        return null;
    }

    private StringUtil() {
    }

    /*
     * WARNING - void declaration
     */
    static int stringLength(ByteBuffer in, int terminatorWidth) {
        if (in.hasArray()) {
            byte[] array = in.array();
            int end = in.arrayOffset() + in.limit();
            int tcount = 0;
            int idx = in.arrayOffset() + in.position();
            while (idx < end) {
                tcount = array[idx++] == 0 ? ++tcount : 0;
                if (tcount != terminatorWidth) continue;
                return idx - terminatorWidth;
            }
        } else {
            int begin = in.position();
            int end = in.limit();
            int tcount = 0;
            int idx = begin;
            while (idx < end) {
                void var1_1;
                void var5_9;
                tcount = in.get(idx++) == 0 ? ++tcount : 0;
                if (tcount != terminatorWidth) continue;
                return (int)(var5_9 - var1_1);
            }
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    static Charset getCharset(ToNativeContext toNativeContext) {
        void var1_1;
        Charset cs;
        Charset charset = Charset.defaultCharset();
        if (toNativeContext instanceof MethodParameterContext) {
            cs = StringUtil.getEncodingCharset(Arrays.asList(((MethodParameterContext)toNativeContext).getMethod().getDeclaringClass().getAnnotations()));
            if (cs != null) {
                charset = cs;
            }
            cs = StringUtil.getEncodingCharset(Arrays.asList(((MethodParameterContext)toNativeContext).getMethod().getAnnotations()));
            if (cs != null) {
                charset = cs;
            }
        }
        cs = StringUtil.getEncodingCharset(toNativeContext.getAnnotations());
        if (cs != null) {
            void var2_2;
            var1_1 = var2_2;
        }
        return var1_1;
    }

    static void throwException(CoderResult result) {
        try {
            result.throwException();
        }
        catch (RuntimeException re) {
            throw re;
        }
        catch (CharacterCodingException cce) {
            throw new RuntimeException(cce);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static CharsetDecoder getDecoder(Charset charset, ThreadLocal<Reference<CharsetDecoder>> localDecoder) {
        void var1_1;
        CharsetDecoder charsetDecoder;
        Reference<CharsetDecoder> ref = localDecoder.get();
        if (ref != null) {
            CharsetDecoder decoder = ref.get();
            if (decoder != null) {
                if (decoder.charset() == charset) {
                    void var3_3;
                    charsetDecoder = var3_3;
                    return charsetDecoder;
                }
            }
        }
        charsetDecoder = StringUtil.initDecoder(charset, (ThreadLocal<Reference<CharsetDecoder>>)var1_1);
        return charsetDecoder;
    }
}

