/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viabackwards.protocol.v1_11to1_10.rewriter;

import com.viaversion.viabackwards.protocol.v1_11to1_10.Protocol1_11To1_10;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.util.ComponentUtil;

public class PlayerPacketRewriter1_11 {
    private static final ValueTransformer<Short, Float> TO_NEW_FLOAT = new ValueTransformer<Short, Float>((Type)Types.FLOAT){

        public Float transform(PacketWrapper wrapper, Short inputValue) {
            return Float.valueOf((float)inputValue.shortValue() / 16.0f);
        }
    };

    public static void register(Protocol1_11To1_10 protocol) {
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.SET_TITLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (action == 2) {
                        JsonElement message = (JsonElement)wrapper.read(Types.COMPONENT);
                        wrapper.clearPacket();
                        wrapper.setPacketType((PacketType)ClientboundPackets1_9_3.CHAT);
                        String legacy = ComponentUtil.jsonToLegacy((JsonElement)message);
                        message = new JsonObject();
                        message.getAsJsonObject().addProperty("text", legacy);
                        wrapper.write(Types.COMPONENT, (Object)message);
                        wrapper.write((Type)Types.BYTE, (Object)2);
                    } else if (action > 2) {
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)(action - 1));
                    }
                });
            }
        });
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.TAKE_ITEM_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> wrapper.read((Type)Types.VAR_INT));
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets1_9_3.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.UNSIGNED_BYTE, TO_NEW_FLOAT);
                this.map((Type)Types.UNSIGNED_BYTE, TO_NEW_FLOAT);
                this.map((Type)Types.UNSIGNED_BYTE, TO_NEW_FLOAT);
            }
        });
    }
}

