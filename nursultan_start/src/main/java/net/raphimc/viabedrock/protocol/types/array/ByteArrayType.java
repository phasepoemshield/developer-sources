/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.array;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ByteArrayType
extends Type<byte[]> {
    private final int length;

    public ByteArrayType(int length) {
        super(byte[].class);
        this.length = length;
    }

    public ByteArrayType() {
        super(byte[].class);
        this.length = -1;
    }

    public void write(ByteBuf buffer, byte[] value) {
        if (this.length != -1) {
            Preconditions.checkArgument((this.length == value.length ? 1 : 0) != 0, (Object)"Length does not match expected length");
        } else {
            BedrockTypes.UNSIGNED_VAR_INT.writePrimitive(buffer, value.length);
        }
        buffer.writeBytes(value);
    }

    public byte[] read(ByteBuf buffer) {
        int length = this.length == -1 ? BedrockTypes.UNSIGNED_VAR_INT.readPrimitive(buffer) : this.length;
        Preconditions.checkArgument((boolean)buffer.isReadable(length), (Object)("Length is larger than readable bytes: " + length + " > " + buffer.readableBytes()));
        byte[] array = new byte[length];
        buffer.readBytes(array);
        return array;
    }
}

