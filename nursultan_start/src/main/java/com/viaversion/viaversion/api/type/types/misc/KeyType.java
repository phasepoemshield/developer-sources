/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;

public class KeyType
extends Type<Key> {
    public KeyType() {
        super(Key.class);
    }

    public void write(Ops ops, Key value) {
        Types.STRING.write(ops, (Object)value.toString());
    }

    public void write(ByteBuf buffer, Key key) {
        Types.STRING.write(buffer, (Object)key.original());
    }

    public Key read(ByteBuf buffer) {
        String identifier = (String)Types.STRING.read(buffer);
        return Key.of((String)identifier);
    }

    public static final class OptionalKeyType
    extends OptionalType<Key> {
        public OptionalKeyType() {
            super(Types.IDENTIFIER);
        }
    }
}

