/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.ByteBufOutputStream
 */
package net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.types;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import java.io.IOException;

public class StringType
extends Type<String> {
    public StringType() {
        super(String.class);
    }

    public void write(ByteBuf buffer, String s) {
        ByteBufOutputStream dos = new ByteBufOutputStream(buffer);
        try {
            dos.writeUTF(s);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String read(ByteBuf buffer) {
        ByteBufInputStream dis = new ByteBufInputStream(buffer);
        try {
            return dis.readUTF();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

