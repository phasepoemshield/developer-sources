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
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  net.raphimc.viabedrock.protocol.storage.BlobCache
 *  net.raphimc.viabedrock.protocol.storage.GameRulesStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.model.GameRule;
import net.raphimc.viabedrock.protocol.packet.MultiStatePackets;
import net.raphimc.viabedrock.protocol.storage.BlobCache;
import net.raphimc.viabedrock.protocol.storage.GameRulesStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class PlayPackets {
    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.SET_DIFFICULTY, (ClientboundPacketType)ClientboundPackets26_1.CHANGE_DIFFICULTY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)BedrockTypes.UNSIGNED_VAR_INT, (Type)Types.VAR_INT);
                this.create((Type)Types.BOOLEAN, false);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.CLIENT_CACHE_MISS_RESPONSE, null, wrapper -> {
            wrapper.cancel();
            BlobCache blobCache = (BlobCache)wrapper.user().get(BlobCache.class);
            int length = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            for (int i = 0; i < length; ++i) {
                long hash = (Long)wrapper.read((Type)BedrockTypes.LONG_LE);
                byte[] blob = (byte[])wrapper.read(BedrockTypes.BYTE_ARRAY);
                blobCache.addBlob(hash, blob);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.TRANSFER, (ClientboundPacketType)ClientboundPackets26_1.TRANSFER, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(BedrockTypes.STRING, Types.STRING);
                this.map((Type)BedrockTypes.UNSIGNED_SHORT_LE, (Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        wrapper.cancel();
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.GAME_RULES_CHANGED, null, wrapper -> {
            wrapper.cancel();
            ((GameRulesStorage)wrapper.user().get(GameRulesStorage.class)).updateGameRules((GameRule[])wrapper.read(BedrockTypes.GAME_RULE_ARRAY));
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CLIENT_INFORMATION, ServerboundBedrockPackets.REQUEST_CHUNK_RADIUS, MultiStatePackets.CLIENT_SETTINGS_HANDLER);
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CUSTOM_PAYLOAD, null, MultiStatePackets.CUSTOM_PAYLOAD_HANDLER);
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.PING_REQUEST, null, wrapper -> {
            wrapper.cancel();
            PacketWrapper pongResponse = wrapper.create((PacketType)ClientboundPackets26_1.PONG_RESPONSE);
            pongResponse.write((Type)Types.LONG, (Object)((Long)wrapper.read((Type)Types.LONG)));
            pongResponse.send(BedrockProtocol.class);
        });
    }
}

