/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.StringType
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 */
package com.viaversion.viaversion.protocols.v1_17to1_17_1;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.StringType;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.rewriter.ItemPacketRewriter1_17_1;

public final class Protocol1_17To1_17_1
extends AbstractProtocol<ClientboundPackets1_17, ClientboundPackets1_17_1, ServerboundPackets1_17, ServerboundPackets1_17> {
    private static final StringType PAGE_STRING_TYPE = new StringType(8192);
    private static final StringType TITLE_STRING_TYPE = new StringType(128);
    private final ItemPacketRewriter1_17_1 itemRewriter = new ItemPacketRewriter1_17_1(this);

    public Protocol1_17To1_17_1() {
        super(ClientboundPackets1_17.class, ClientboundPackets1_17_1.class, ServerboundPackets1_17.class, ServerboundPackets1_17.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17.REMOVE_ENTITY, ClientboundPackets1_17_1.REMOVE_ENTITIES, wrapper -> {
            int entityId = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[]{entityId});
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_17.EDIT_BOOK, wrapper -> {
            CompoundTag tag = new CompoundTag();
            DataItem item = new DataItem(942, 1, tag);
            wrapper.write(Types.ITEM1_13_2, (Object)item);
            int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
            int pages = (Integer)wrapper.read((Type)Types.VAR_INT);
            ListTag pagesTag = new ListTag(StringTag.class);
            for (int i = 0; i < pages; ++i) {
                String page = (String)wrapper.read((Type)PAGE_STRING_TYPE);
                if (i >= 200) continue;
                pagesTag.add((Tag)new StringTag(page));
            }
            if (pagesTag.isEmpty()) {
                pagesTag.add((Tag)new StringTag(""));
            }
            tag.put("pages", (Tag)pagesTag);
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                String title = (String)wrapper.read((Type)TITLE_STRING_TYPE);
                tag.put("title", (Tag)new StringTag(title));
                tag.put("author", (Tag)new StringTag(wrapper.user().getProtocolInfo().getUsername()));
                wrapper.write((Type)Types.BOOLEAN, (Object)true);
            } else {
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
            }
            wrapper.write((Type)Types.VAR_INT, (Object)slot);
        });
    }

    public ItemPacketRewriter1_17_1 getItemRewriter() {
        return this.itemRewriter;
    }
}

