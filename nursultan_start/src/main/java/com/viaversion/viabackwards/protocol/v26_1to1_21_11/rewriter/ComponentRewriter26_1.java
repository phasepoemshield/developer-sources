/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1
 */
package com.viaversion.viabackwards.protocol.v26_1to1_21_11.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.NBTComponentRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1;

public final class ComponentRewriter26_1
extends NBTComponentRewriter<ClientboundPacket26_1> {
    public ComponentRewriter26_1(BackwardsProtocol<ClientboundPacket26_1, ?, ?, ?> protocol) {
        super(protocol);
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        this.removeDataComponents(componentsTag, new StructuredDataKey[]{StructuredDataKey.ADDITIONAL_TRADE_COST, StructuredDataKey.DAMAGE_RESISTANT26_1, StructuredDataKey.BLOCKS_ATTACKS26_1, StructuredDataKey.PROVIDES_BANNER_PATTERNS26_1, StructuredDataKey.DYE, StructuredDataKey.CAT_SOUND_VARIANT, StructuredDataKey.CHICKEN_SOUND_VARIANT, StructuredDataKey.COW_SOUND_VARIANT, StructuredDataKey.PIG_SOUND_VARIANT});
    }
}

