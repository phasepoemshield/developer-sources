/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import io.netty.buffer.ByteBuf;

public final class CompoundTagHolderType
extends HolderType<CompoundTag> {
    @Override
    public CompoundTag readDirect(ByteBuf buffer) {
        return (CompoundTag)Types.TRUSTED_COMPOUND_TAG.read(buffer);
    }

    @Override
    public void writeDirect(ByteBuf buffer, CompoundTag value) {
        Types.TRUSTED_COMPOUND_TAG.write(buffer, (Object)value);
    }
}

