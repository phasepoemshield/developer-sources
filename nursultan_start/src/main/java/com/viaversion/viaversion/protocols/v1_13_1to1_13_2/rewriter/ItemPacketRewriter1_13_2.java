/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_1to1_13_2.Protocol1_13_1To1_13_2
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_13_1to1_13_2.rewriter;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_1to1_13_2.Protocol1_13_1To1_13_2;
import com.viaversion.viaversion.util.Key;

public class ItemPacketRewriter1_13_2 {
    public static void register(Protocol1_13_1To1_13_2 protocol) {
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.CONTAINER_SET_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types.ITEM1_13, Types.ITEM1_13_2);
            }
        });
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.CONTAINER_SET_CONTENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.ITEM1_13_SHORT_ARRAY, Types.ITEM1_13_2_SHORT_ARRAY);
            }
        });
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handlerSoftFail(wrapper -> {
                    String channel = Key.namespaced((String)((String)wrapper.get(Types.STRING, 0)));
                    if (channel.equals("minecraft:trader_list")) {
                        wrapper.passthrough((Type)Types.INT);
                        int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
                        for (int i = 0; i < size; ++i) {
                            wrapper.write(Types.ITEM1_13_2, (Object)((Item)wrapper.read(Types.ITEM1_13)));
                            wrapper.write(Types.ITEM1_13_2, (Object)((Item)wrapper.read(Types.ITEM1_13)));
                            boolean secondItem = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
                            if (secondItem) {
                                wrapper.write(Types.ITEM1_13_2, (Object)((Item)wrapper.read(Types.ITEM1_13)));
                            }
                            wrapper.passthrough((Type)Types.BOOLEAN);
                            wrapper.passthrough((Type)Types.INT);
                            wrapper.passthrough((Type)Types.INT);
                        }
                    }
                });
            }
        });
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.SET_EQUIPPED_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.ITEM1_13, Types.ITEM1_13_2);
            }
        });
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.UPDATE_RECIPES, wrapper -> {
            int recipesNo = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < recipesNo; ++i) {
                int i1;
                int ingredientsNo;
                wrapper.passthrough(Types.STRING);
                String type = (String)wrapper.passthrough(Types.STRING);
                if (type.equals("crafting_shapeless")) {
                    wrapper.passthrough(Types.STRING);
                    ingredientsNo = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    for (i1 = 0; i1 < ingredientsNo; ++i1) {
                        wrapper.write(Types.ITEM1_13_2_ARRAY, (Object)((Item[])wrapper.read(Types.ITEM1_13_ARRAY)));
                    }
                    wrapper.write(Types.ITEM1_13_2, (Object)((Item)wrapper.read(Types.ITEM1_13)));
                    continue;
                }
                if (type.equals("crafting_shaped")) {
                    ingredientsNo = (Integer)wrapper.passthrough((Type)Types.VAR_INT) * (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough(Types.STRING);
                    for (i1 = 0; i1 < ingredientsNo; ++i1) {
                        wrapper.write(Types.ITEM1_13_2_ARRAY, (Object)((Item[])wrapper.read(Types.ITEM1_13_ARRAY)));
                    }
                    wrapper.write(Types.ITEM1_13_2, (Object)((Item)wrapper.read(Types.ITEM1_13)));
                    continue;
                }
                if (!type.equals("smelting")) continue;
                wrapper.passthrough(Types.STRING);
                wrapper.write(Types.ITEM1_13_2_ARRAY, (Object)((Item[])wrapper.read(Types.ITEM1_13_ARRAY)));
                wrapper.write(Types.ITEM1_13_2, (Object)((Item)wrapper.read(Types.ITEM1_13)));
                wrapper.passthrough((Type)Types.FLOAT);
                wrapper.passthrough((Type)Types.VAR_INT);
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets1_13.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.ITEM1_13_2, Types.ITEM1_13);
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets1_13.SET_CREATIVE_MODE_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.SHORT);
                this.map(Types.ITEM1_13_2, Types.ITEM1_13);
            }
        });
    }
}

