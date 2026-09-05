/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class OptionalVarIntType
extends Type<Integer> {
    public OptionalVarIntType() {
        super(Integer.class);
    }

    public void write(ByteBuf buffer, Integer object) {
        if (object == null) {
            Types.VAR_INT.writePrimitive(buffer, 0);
        } else {
            Types.VAR_INT.writePrimitive(buffer, object + 1);
        }
    }

    public Integer read(ByteBuf buffer) {
        int value = Types.VAR_INT.readPrimitive(buffer);
        return value == 0 ? null : Integer.valueOf(value - 1);
    }
}

