/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;

public class class04169 {
    public static final int N = 250;
    public static final String y = "MC|PingHost";
    public static final int L = 254;
    public static final int u = 1;
    public static final int i = 255;
    public static final int R = 127;

    public static void N(ByteBuf byteBuf, String string) {
        byteBuf.writeShort(string.length());
        byteBuf.writeCharSequence((CharSequence)string, StandardCharsets.UTF_16BE);
    }

    public static String N(ByteBuf byteBuf) {
        int n = byteBuf.readShort() * 2;
        String string = byteBuf.toString(byteBuf.readerIndex(), n, StandardCharsets.UTF_16BE);
        byteBuf.skipBytes(n);
        return string;
    }
}

