/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.ComponentRewriter1_20_5
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.SerializerVersion
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.SerializerVersion;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class ComponentRewriter1_20_5
extends JsonNBTComponentRewriter<ClientboundPacket1_20_5> {
    private final com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.ComponentRewriter1_20_5<ClientboundPacket1_20_5> vvRewriter;

    public ComponentRewriter1_20_5(BackwardsProtocol<ClientboundPacket1_20_5, ?, ?, ?> protocol) {
        super(protocol, ComponentRewriterBase.ReadType.NBT);
        this.vvRewriter = new com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.ComponentRewriter1_20_5(protocol, VersionedTypes.V1_20_5.structuredData());
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, @Nullable CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        StringTag idTag = itemTag.getStringTag("id");
        if (idTag == null) {
            return;
        }
        List data = this.vvRewriter.toData(connection, componentsTag);
        if (data.isEmpty()) {
            return;
        }
        int identifier = this.protocol.getMappingData().getFullItemMappings().id(idTag.getValue());
        StructuredItem structuredItem = new StructuredItem(identifier, 1, new StructuredDataContainer((StructuredData[])data.toArray(StructuredData[]::new)));
        Item dataItem = this.protocol.getItemRewriter().handleItemToClient(connection, (Item)structuredItem);
        if (dataItem.tag() == null) {
            return;
        }
        itemTag.remove("components");
        StringTag tag = new StringTag(this.outputSerializerVersion().toSNBT((Tag)dataItem.tag()));
        itemTag.put("tag", ComponentUtil.trimStrings((Tag)tag));
    }

    protected SerializerVersion inputSerializerVersion() {
        return SerializerVersion.V1_20_5;
    }

    protected SerializerVersion outputSerializerVersion() {
        return SerializerVersion.V1_20_3;
    }
}

