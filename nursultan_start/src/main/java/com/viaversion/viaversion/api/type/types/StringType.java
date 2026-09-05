/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;

public class StringType
extends Type<String> {
    private static final int MAX_CHAR_UTF_8_LENGTH = Character.toString('\uffff').getBytes(StandardCharsets.UTF_8).length;
    private final int maxLength;

    public StringType() {
        this(Short.MAX_VALUE);
    }

    public StringType(int maxLength) {
        super(String.class);
        this.maxLength = maxLength;
    }

    public void write(Ops ops, String value) {
        ops.writeString((CharSequence)value);
    }

    public void write(ByteBuf buffer, String object) {
        if (object.length() > this.maxLength) {
            throw new IllegalArgumentException("Cannot send string longer than " + this.maxLength + " characters (got " + object.length() + " characters)");
        }
        byte[] b = object.getBytes(StandardCharsets.UTF_8);
        Types.VAR_INT.writePrimitive(buffer, b.length);
        buffer.writeBytes(b);
    }

    public String read(ByteBuf buffer) {
        int len = Types.VAR_INT.readPrimitive(buffer);
        Preconditions.checkArgument((len <= this.maxLength * MAX_CHAR_UTF_8_LENGTH ? 1 : 0) != 0, (String)("Cannot receive string longer than " + this.maxLength + " * " + MAX_CHAR_UTF_8_LENGTH + " bytes (got %s bytes)"), (Object[])new Object[]{len});
        String string = buffer.toString(buffer.readerIndex(), len, StandardCharsets.UTF_8);
        buffer.skipBytes(len);
        Preconditions.checkArgument((string.length() <= this.maxLength ? 1 : 0) != 0, (String)("Cannot receive string longer than " + this.maxLength + " characters (got %s bytes)"), (Object[])new Object[]{string.length()});
        return string;
    }

    public static final class OptionalStringType
    extends OptionalType<String> {
        public OptionalStringType() {
            super(Types.STRING);
        }
    }
}

