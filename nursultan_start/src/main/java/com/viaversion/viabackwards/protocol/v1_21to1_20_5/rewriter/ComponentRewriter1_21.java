/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.Protocol1_20_5To1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.data.AttributeModifierMappings1_21
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.TagUtil
 *  com.viaversion.viaversion.util.UUIDUtil
 */
package com.viaversion.viabackwards.protocol.v1_21to1_20_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_21to1_20_5.Protocol1_21To1_20_5;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.Protocol1_20_5To1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.data.AttributeModifierMappings1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.TagUtil;
import com.viaversion.viaversion.util.UUIDUtil;
import java.util.UUID;

public final class ComponentRewriter1_21
extends JsonNBTComponentRewriter<ClientboundPacket1_21> {
    public ComponentRewriter1_21(Protocol1_21To1_20_5 protocol) {
        super((BackwardsProtocol)protocol, ComponentRewriterBase.ReadType.NBT);
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag != null) {
            this.removeDataComponents(componentsTag, new StructuredDataKey[]{StructuredDataKey.JUKEBOX_PLAYABLE1_21});
            this.convertAttributeModifiersComponent(componentsTag);
        }
    }

    protected SerializerVersion inputSerializerVersion() {
        return SerializerVersion.V1_20_5;
    }

    protected SerializerVersion outputSerializerVersion() {
        return SerializerVersion.V1_20_5;
    }

    private void convertAttributeModifiersComponent(CompoundTag tag) {
        CompoundTag attributeModifiers = TagUtil.getNamespacedCompoundTag((CompoundTag)tag, (String)"attribute_modifiers");
        if (attributeModifiers == null) {
            return;
        }
        ListTag modifiers = attributeModifiers.getListTag("modifiers", CompoundTag.class);
        int size = modifiers.size();
        for (int i = 0; i < size; ++i) {
            CompoundTag modifier = (CompoundTag)modifiers.get(i);
            String type = Key.stripMinecraftNamespace((String)modifier.getString("type"));
            if (Attributes1_20_5.keyToId((String)type) == -1) {
                modifiers.remove(i--);
                --size;
                continue;
            }
            String id = modifier.getString("id");
            UUID uuid = Protocol1_20_5To1_21.mapAttributeId((String)id);
            String name = AttributeModifierMappings1_21.idToName((String)id);
            modifier.put("uuid", (Tag)new IntArrayTag(UUIDUtil.toIntArray((UUID)uuid)));
            modifier.putString("name", name != null ? name : id);
        }
    }
}

