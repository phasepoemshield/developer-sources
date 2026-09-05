/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9
 */
package com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;

public final class ComponentRewriter1_21_9
extends NBTComponentRewriter<ClientboundPacket1_21_9> {
    public ComponentRewriter1_21_9(BackwardsProtocol<ClientboundPacket1_21_9, ?, ?, ?> protocol) {
        super(protocol);
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        this.removeDataComponents(componentsTag, new StructuredDataKey[]{StructuredDataKey.ENTITY_DATA1_21_9, StructuredDataKey.BLOCK_ENTITY_DATA1_21_9});
    }

    protected void processCompoundTag(UserConnection connection, CompoundTag tag) {
        super.processCompoundTag(connection, tag);
        String type = tag.getString("type");
        Tag fallback = tag.get("fallback");
        if (fallback == null) {
            fallback = new StringTag("");
        }
        if ("object".equals(type)) {
            tag.put("text", fallback);
            tag.remove("type");
        }
        if (tag.remove("sprite") != null) {
            tag.put("text", fallback);
        }
        if (tag.remove("player") != null) {
            tag.put("text", fallback);
        }
        tag.remove("atlas");
    }
}

