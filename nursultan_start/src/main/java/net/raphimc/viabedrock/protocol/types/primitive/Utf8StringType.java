/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.api.io.LittleEndianByteBufInputStream
 *  net.raphimc.viabedrock.api.io.LittleEndianByteBufOutputStream
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.io.UncheckedIOException;
import net.raphimc.viabedrock.api.io.LittleEndianByteBufInputStream;
import net.raphimc.viabedrock.api.io.LittleEndianByteBufOutputStream;

public class Utf8StringType
extends Type<String> {
    public Utf8StringType() {
        super(String.class);
    }

    public void write(ByteBuf buffer, String value) {
        try {
            new LittleEndianByteBufOutputStream(buffer).writeUTF(value);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String read(ByteBuf buffer) {
        try {
            return new LittleEndianByteBufInputStream(buffer).readUTF();
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

