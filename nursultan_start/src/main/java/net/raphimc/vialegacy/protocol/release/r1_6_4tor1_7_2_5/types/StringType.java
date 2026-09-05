/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;

public class StringType
extends Type<String> {
    public StringType() {
        super(String.class);
    }

    public void write(ByteBuf buffer, String s) {
        buffer.writeShort(s.length());
        for (char c : s.toCharArray()) {
            buffer.writeChar((int)c);
        }
    }

    public String read(ByteBuf buffer) {
        int length = buffer.readShort();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            builder.append(buffer.readChar());
        }
        return builder.toString();
    }
}

