/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class StringType
extends Type<String> {
    public StringType() {
        super(String.class);
    }

    public void write(ByteBuf buffer, String value) {
        BedrockTypes.BYTE_ARRAY.write(buffer, (Object)value.getBytes(StandardCharsets.UTF_8));
    }

    public String read(ByteBuf buffer) {
        return new String((byte[])BedrockTypes.BYTE_ARRAY.read(buffer), StandardCharsets.UTF_8);
    }

    public static final class OptionalStringType
    extends OptionalType<String> {
        public OptionalStringType() {
            super(BedrockTypes.STRING);
        }
    }
}

