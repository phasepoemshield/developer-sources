/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.SerializerVersion
 */
package com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.SerializerVersion;

public final class ComponentRewriter1_21_4
extends JsonNBTComponentRewriter<ClientboundPacket1_21_2> {
    public ComponentRewriter1_21_4(BackwardsProtocol<ClientboundPacket1_21_2, ?, ?, ?> protocol) {
        super(protocol, ComponentRewriterBase.ReadType.NBT);
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        this.removeDataComponents(componentsTag, new StructuredDataKey[]{StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, StructuredDataKey.TRIM1_21_4});
    }

    protected SerializerVersion inputSerializerVersion() {
        return SerializerVersion.V1_21_4;
    }

    protected SerializerVersion outputSerializerVersion() {
        return SerializerVersion.V1_20_5;
    }
}

