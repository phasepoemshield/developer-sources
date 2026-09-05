/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;

public class AsciiStringType
extends Type<String> {
    public AsciiStringType() {
        super(String.class);
    }

    public void write(ByteBuf buffer, String value) {
        buffer.writeIntLE(value.length());
        buffer.writeCharSequence((CharSequence)value, StandardCharsets.US_ASCII);
    }

    public String read(ByteBuf buffer) {
        return buffer.readString(buffer.readIntLE(), StandardCharsets.US_ASCII);
    }
}

