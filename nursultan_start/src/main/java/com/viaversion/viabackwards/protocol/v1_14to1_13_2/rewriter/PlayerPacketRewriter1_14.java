/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.DifficultyStorage
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 */
package com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter;

import com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.DifficultyStorage;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;

public class PlayerPacketRewriter1_14
extends RewriterBase<Protocol1_14To1_13_2> {
    public PlayerPacketRewriter1_14(Protocol1_14To1_13_2 protocol) {
        super((Protocol)protocol);
    }

    protected void registerPackets() {
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.CHANGE_DIFFICULTY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.read((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    byte difficulty = ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0)).byteValue();
                    ((DifficultyStorage)wrapper.user().get(DifficultyStorage.class)).setDifficulty(difficulty);
                });
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.OPEN_SIGN_EDITOR, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14, Types.BLOCK_POSITION1_8);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.BLOCK_ENTITY_TAG_QUERY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_8, Types.BLOCK_POSITION1_14);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.PLAYER_ACTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_8, Types.BLOCK_POSITION1_14);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.RECIPE_BOOK_UPDATE, (PacketHandler)new PacketHandlers(){

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
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    }
                });
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.SET_COMMAND_BLOCK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8, Types.BLOCK_POSITION1_14);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.SET_STRUCTURE_BLOCK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8, Types.BLOCK_POSITION1_14);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.SIGN_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8, Types.BLOCK_POSITION1_14);
            }
        });
        ((Protocol1_14To1_13_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_13.USE_ITEM_ON, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_8);
            int face = (Integer)wrapper.read((Type)Types.VAR_INT);
            int hand = (Integer)wrapper.read((Type)Types.VAR_INT);
            float x = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float y = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float z = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            wrapper.write((Type)Types.VAR_INT, (Object)hand);
            wrapper.write(Types.BLOCK_POSITION1_14, (Object)position);
            wrapper.write((Type)Types.VAR_INT, (Object)face);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(x));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(y));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(z));
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
        });
    }
}

