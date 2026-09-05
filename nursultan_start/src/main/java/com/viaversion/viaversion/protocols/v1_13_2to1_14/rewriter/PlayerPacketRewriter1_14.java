/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 */
package com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.Protocol1_13_2To1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;

public class PlayerPacketRewriter1_14 {
    public static void register(Protocol1_13_2To1_14 protocol) {
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.OPEN_SIGN_EDITOR, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8, Types.BLOCK_POSITION1_14);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_14.BLOCK_ENTITY_TAG_QUERY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_14.EDIT_BOOK, wrapper -> {
            Item item = (Item)wrapper.passthrough(Types.ITEM1_13_2);
            protocol.getItemRewriter().handleItemToServer(wrapper.user(), item);
            if (item == null) {
                return;
            }
            CompoundTag tag = item.tag();
            if (tag == null) {
                return;
            }
            ListTag pages = tag.getListTag("pages", StringTag.class);
            if (pages == null) {
                pages = new ListTag(StringTag.class);
                pages.add((Tag)new StringTag());
                tag.put("pages", (Tag)pages);
                return;
            }
            if (Via.getConfig().isTruncate1_14Books() && pages.size() > 50) {
                pages.setValue(pages.getValue().subList(0, 50));
            }
        });
        protocol.registerServerbound(ServerboundPackets1_14.PLAYER_ACTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_14.RECIPE_BOOK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int type = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (type == 0) {
                        wrapper.passthrough(Types.STRING);
                    } else if (type == 1) {
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.read((Type)Types.BOOLEAN);
                        wrapper.read((Type)Types.BOOLEAN);
                        wrapper.read((Type)Types.BOOLEAN);
                        wrapper.read((Type)Types.BOOLEAN);
                    }
                });
            }
        });
        protocol.registerServerbound(ServerboundPackets1_14.SET_COMMAND_BLOCK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_14.SET_STRUCTURE_BLOCK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_14.SIGN_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_14.USE_ITEM_ON, wrapper -> {
            int hand = (Integer)wrapper.read((Type)Types.VAR_INT);
            BlockPosition position = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_14);
            int face = (Integer)wrapper.read((Type)Types.VAR_INT);
            float x = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float y = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float z = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.write(Types.BLOCK_POSITION1_8, (Object)position);
            wrapper.write((Type)Types.VAR_INT, (Object)face);
            wrapper.write((Type)Types.VAR_INT, (Object)hand);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(x));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(y));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(z));
        });
    }
}

