/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.TagUtil
 *  com.viaversion.viaversion.util.UUIDUtil
 */
package com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.Protocol1_20_5To1_21;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.TagUtil;
import com.viaversion.viaversion.util.UUIDUtil;
import java.util.UUID;

public final class ComponentRewriter1_21
extends JsonNBTComponentRewriter<ClientboundPacket1_20_5> {
    public ComponentRewriter1_21(Protocol1_20_5To1_21 protocol) {
        super((Protocol)protocol, ComponentRewriterBase.ReadType.NBT);
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        String identifier = Key.stripMinecraftNamespace((String)itemTag.getString("id"));
        if (identifier.equals("trident") || identifier.equals("piglin_banner_pattern")) {
            if (componentsTag == null) {
                componentsTag = new CompoundTag();
                itemTag.put("components", (Tag)componentsTag);
            }
            if (!TagUtil.containsNamespaced((CompoundTag)componentsTag, (String)"rarity")) {
                componentsTag.put("minecraft:rarity", (Tag)new StringTag("common"));
            }
        }
        if (componentsTag == null) {
            return;
        }
        CompoundTag attributeModifiers = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)"attribute_modifiers");
        if (attributeModifiers == null) {
            return;
        }
        ListTag modifiers = attributeModifiers.getListTag("modifiers", CompoundTag.class);
        for (CompoundTag modifier : modifiers) {
            String name = modifier.getString("name");
            UUID uuid = UUIDUtil.fromIntArray((int[])modifier.getIntArrayTag("uuid").getValue());
            String id = Protocol1_20_5To1_21.mapAttributeUUID(uuid, name);
            modifier.putString("id", id);
        }
    }

    protected SerializerVersion inputSerializerVersion() {
        return SerializerVersion.V1_20_5;
    }
}

