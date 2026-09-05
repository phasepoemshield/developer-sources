/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.SerializerVersion
 */
package com.viaversion.viaversion.protocols.v1_21_2to1_21_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.Protocol1_21_2To1_21_4;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.SerializerVersion;

public final class ComponentRewriter1_21_4
extends JsonNBTComponentRewriter<ClientboundPacket1_21_2> {
    public ComponentRewriter1_21_4(Protocol1_21_2To1_21_4 protocol) {
        super((Protocol)protocol, ComponentRewriterBase.ReadType.NBT);
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        this.removeDataComponents(componentsTag, new StructuredDataKey[]{StructuredDataKey.CUSTOM_MODEL_DATA1_20_5});
    }

    protected SerializerVersion inputSerializerVersion() {
        return SerializerVersion.V1_20_5;
    }
}

