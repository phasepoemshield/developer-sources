/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.NamedCompoundTagType;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.util.Map;

public class CompoundTagType
extends Type<CompoundTag> {
    private final int maxBytes;

    public CompoundTagType() {
        this(true);
    }

    public CompoundTagType(boolean limitMaxBytes) {
        super(CompoundTag.class);
        this.maxBytes = limitMaxBytes ? 0x200000 : Integer.MAX_VALUE;
    }

    public void write(Ops ops, CompoundTag value) {
        ops.writeMap(map -> {
            for (Map.Entry entry : value.entrySet()) {
                map.write((String)entry.getKey(), Types.TAG, (Object)((Tag)entry.getValue()));
            }
        });
    }

    public void write(ByteBuf buffer, CompoundTag object) {
        try {
            NamedCompoundTagType.write(buffer, (Tag)object, null);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public CompoundTag read(ByteBuf buffer) {
        try {
            return NamedCompoundTagType.read(buffer, this.maxBytes, false);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final class OptionalCompoundTagType
    extends OptionalType<CompoundTag> {
        private OptionalCompoundTagType(Type<CompoundTag> tagType) {
            super(tagType);
        }

        public static OptionalCompoundTagType type() {
            return new OptionalCompoundTagType((Type<CompoundTag>)Types.COMPOUND_TAG);
        }

        public static OptionalCompoundTagType trustedType() {
            return new OptionalCompoundTagType((Type<CompoundTag>)Types.TRUSTED_COMPOUND_TAG);
        }
    }
}

