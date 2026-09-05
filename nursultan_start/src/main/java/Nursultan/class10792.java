/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11952
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufUtil
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 */
package Nursultan;

import Nursultan.class11952;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.nio.charset.StandardCharsets;

public class class10792 {
    private class10792() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static String N(ByteBuf byteBuf, int n) {
        int n2 = ByteBufUtil.utf8MaxBytes((int)n);
        int n3 = class11952.N((ByteBuf)byteBuf);
        if (n3 > n2) {
            throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + n3 + " > " + n2 + ")");
        }
        if (n3 < 0) {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
        }
        int n4 = byteBuf.readableBytes();
        if (n3 > n4) {
            throw new DecoderException("Not enough bytes in buffer, expected " + n3 + ", but got " + n4);
        }
        String string = byteBuf.toString(byteBuf.readerIndex(), n3, StandardCharsets.UTF_8);
        byteBuf.skipBytes(n3);
        if (string.length() > n) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + string.length() + " > " + n + ")");
        }
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void N(ByteBuf byteBuf, CharSequence charSequence, int n) {
        int n2 = charSequence.length();
        if (n2 > n) {
            throw new EncoderException("String too big (was " + n2 + " characters, max " + n + ")");
        }
        int n3 = ByteBufUtil.utf8MaxBytes((CharSequence)charSequence);
        ByteBuf byteBuf2 = byteBuf.alloc().buffer(n3);
        try {
            int n4 = ByteBufUtil.writeUtf8((ByteBuf)byteBuf2, (CharSequence)charSequence);
            int n5 = ByteBufUtil.utf8MaxBytes((int)n);
            if (n4 > n5) {
                throw new EncoderException("String too big (was " + n4 + " bytes encoded, max " + n5 + ")");
            }
            class11952.N((ByteBuf)byteBuf, (int)n4);
            byteBuf.writeBytes(byteBuf2);
        }
        finally {
            byteBuf2.release();
        }
    }
}

