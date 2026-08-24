/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public final class BufferUtil {
    /*
     * WARNING - void declaration
     */
    public static int positionOf(ByteBuffer buf, byte value) {
        if (buf.hasArray()) {
            byte[] array = buf.array();
            int offset = buf.arrayOffset();
            int limit = buf.limit();
            for (int pos = buf.position(); pos < limit; ++pos) {
                if (array[offset + pos] != value) continue;
                return pos;
            }
        } else {
            int limit = buf.limit();
            int pos = buf.position();
            while (pos < limit) {
                void var3_5;
                if (buf.get(pos) == value) {
                    return pos;
                }
                ++var3_5;
            }
        }
        return -1;
    }

    private BufferUtil() {
    }

    public static String getString(ByteBuffer buf, Charset charset) {
        return BufferUtil.getCharSequence(buf, charset).toString();
    }

    /*
     * WARNING - void declaration
     */
    public static int indexOf(ByteBuffer buf, byte value) {
        if (buf.hasArray()) {
            byte[] array = buf.array();
            int begin = buf.arrayOffset() + buf.position();
            int end = buf.arrayOffset() + buf.limit();
            for (int offset = 0; offset < end; ++offset) {
                if (offset > -1) {
                    if (array[begin + offset] != value) continue;
                    return offset;
                }
                break;
            }
        } else {
            int begin = buf.position();
            int offset = 0;
            while (offset < buf.limit()) {
                void var3_5;
                if (buf.get(begin + offset) == value) {
                    return offset;
                }
                ++var3_5;
            }
        }
        return -1;
    }

    public static void putCharSequence(ByteBuffer buf, CharsetEncoder encoder, CharSequence value) {
        encoder.reset().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).encode(CharBuffer.wrap(value), buf, true);
        encoder.flush(buf);
        int nulSize = Math.round(encoder.maxBytesPerChar());
        if (nulSize == 4) {
            buf.putInt(0);
        } else if (nulSize == 2) {
            buf.putShort((short)0);
        } else if (nulSize == 1) {
            ByteBuffer byteBuffer;
            byteBuffer.put((byte)0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static CharSequence getCharSequence(ByteBuffer buf, Charset charset) {
        void var2_2;
        void var1_1;
        ByteBuffer buffer = buf.slice();
        int end = BufferUtil.indexOf(buffer, (byte)0);
        if (end < 0) {
            end = buffer.limit();
        }
        buffer.position(0).limit(end);
        return var1_1.decode((ByteBuffer)var2_2);
    }

    /*
     * WARNING - void declaration
     */
    public static int indexOf(ByteBuffer buf, int offset, byte value) {
        if (buf.hasArray()) {
            byte[] array = buf.array();
            int begin = buf.arrayOffset() + buf.position() + offset;
            int end = buf.arrayOffset() + buf.limit();
            for (int idx = 0; idx < end; ++idx) {
                if (idx > -1) {
                    if (array[begin + idx] != value) continue;
                    return idx;
                }
                break;
            }
        } else {
            int begin = buf.position();
            int idx = 0;
            while (idx < buf.limit()) {
                void var4_6;
                if (buf.get(begin + idx) == value) {
                    return idx;
                }
                ++var4_6;
            }
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    public static CharSequence getCharSequence(ByteBuffer buf, CharsetDecoder decoder) {
        ByteBuffer buffer = buf.slice();
        int end = BufferUtil.indexOf(buffer, (byte)0);
        if (end < 0) {
            end = buffer.limit();
        }
        buffer.position(0).limit(end);
        try {
            return decoder.reset().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer);
        }
        catch (CharacterCodingException ex) {
            void var4_4;
            throw new Error("Illegal character data in native string", (Throwable)var4_4);
        }
    }

    public static void putString(ByteBuffer buf, Charset charset, String value) {
        BufferUtil.putCharSequence(buf, charset, (CharSequence)value);
    }

    public static ByteBuffer slice(ByteBuffer buffer, int position) {
        ByteBuffer tmp = buffer.duplicate();
        tmp.position(position);
        return tmp.slice();
    }

    public static ByteBuffer slice(ByteBuffer buffer, int position, int size) {
        ByteBuffer tmp = buffer.duplicate();
        tmp.position(position).limit(position + size);
        return tmp.slice();
    }

    public static void putCharSequence(ByteBuffer buf, Charset charset, CharSequence value) {
        BufferUtil.putCharSequence(buf, charset.newEncoder(), value);
    }
}

