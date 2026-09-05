/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.TransformingType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Rewritable
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.TransformingType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Rewritable;

public record DebugStickState(CompoundTag tag) implements Rewritable,
Copyable
{
    public static final Type<DebugStickState> TYPE = TransformingType.of((Type)Types.COMPOUND_TAG, DebugStickState.class, DebugStickState::new, DebugStickState::tag);

    public DebugStickState rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        CompoundTag updatedTag = this.tag;
        if (clientbound && protocol.getMappingData() != null && protocol.getMappingData().changedBlocks() != null) {
            updatedTag = this.tag.copy();
            updatedTag.entrySet().removeIf(entry -> {
                int blockId = protocol.getMappingData().getFullBlockMappings().id((String)entry.getKey());
                return protocol.getMappingData().changedBlocks().contains(blockId);
            });
        }
        return new DebugStickState(updatedTag);
    }

    public DebugStickState copy() {
        return new DebugStickState(this.tag.copy());
    }
}

