/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.rewriter.EntityPacketRewriter1_19_3$PlayerProfileUpdate
 *  com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.storage.ChatTypeStorage1_19_3
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.ProfileKey
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3
 *  com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_3
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_19
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_3
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.Protocol1_19_3To1_19_1;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.rewriter.EntityPacketRewriter1_19_3;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.storage.ChatTypeStorage1_19_3;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.ProfileKey;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_3;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_19;
import com.viaversion.viaversion.api.type.types.version.Types1_19_3;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.util.TagUtil;
import java.util.BitSet;
import java.util.UUID;

public final class EntityPacketRewriter1_19_3
extends EntityRewriter<ClientboundPackets1_19_3, Protocol1_19_3To1_19_1> {
    private static final int[] PROFILE_ACTIONS = new int[]{2, 3, 4, 5};
    private static final int ADD_PLAYER = 0;
    private static final int INITIALIZE_CHAT = 1;
    private static final int UPDATE_GAMEMODE = 2;
    private static final int UPDATE_LISTED = 3;
    private static final int UPDATE_LATENCY = 4;
    private static final int UPDATE_DISPLAYNAME = 5;

    public EntityPacketRewriter1_19_3(Protocol1_19_3To1_19_1 protocol) {
        super((BackwardsProtocol)protocol, Types1_19.ENTITY_DATA_TYPES.optionalComponentType, Types1_19.ENTITY_DATA_TYPES.booleanType);
    }

    protected void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_19_3.SET_ENTITY_DATA, Types1_19_3.ENTITY_DATA_LIST, Types1_19.ENTITY_DATA_LIST);
        ((Protocol1_19_3To1_19_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_3.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_19_3.this.dimensionDataHandler());
                this.handler(EntityPacketRewriter1_19_3.this.biomeSizeTracker());
                this.handler(EntityPacketRewriter1_19_3.this.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> {
                    ChatTypeStorage1_19_3 chatTypeStorage = (ChatTypeStorage1_19_3)wrapper.user().get(ChatTypeStorage1_19_3.class);
                    chatTypeStorage.clear();
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    ListTag chatTypes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"chat_type", (ListTag)new ListTag(CompoundTag.class));
                    for (CompoundTag chatType : chatTypes) {
                        NumberTag idTag = chatType.getNumberTag("id");
                        chatTypeStorage.addChatType(idTag.asInt(), chatType);
                    }
                });
                this.handler(wrapper -> {
                    ChatSession1_19_3 chatSession = (ChatSession1_19_3)wrapper.user().get(ChatSession1_19_3.class);
                    if (chatSession != null) {
                        PacketWrapper chatSessionUpdate = wrapper.create((PacketType)ServerboundPackets1_19_3.CHAT_SESSION_UPDATE);
                        chatSessionUpdate.write(Types.UUID, (Object)chatSession.getSessionId());
                        chatSessionUpdate.write(Types.PROFILE_KEY, (Object)chatSession.getProfileKey());
                        chatSessionUpdate.sendToServer(Protocol1_19_3To1_19_1.class);
                    }
                });
            }
        });
        ((Protocol1_19_3To1_19_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_3.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.handler(EntityPacketRewriter1_19_3.this.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> {
                    byte keepDataMask = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.write((Type)Types.BOOLEAN, (Object)((keepDataMask & 1) != 0 ? 1 : 0));
                });
            }
        });
        ((Protocol1_19_3To1_19_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_3.PLAYER_INFO_UPDATE, (ClientboundPacketType)ClientboundPackets1_19_1.PLAYER_INFO, wrapper -> {
            wrapper.cancel();
            BitSet actions = (BitSet)wrapper.read((Type)Types.PROFILE_ACTIONS_ENUM1_19_3);
            int entries = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (actions.get(0)) {
                PacketWrapper playerInfoPacket = wrapper.create((PacketType)ClientboundPackets1_19_1.PLAYER_INFO);
                playerInfoPacket.write((Type)Types.VAR_INT, (Object)0);
                playerInfoPacket.write((Type)Types.VAR_INT, (Object)entries);
                for (int i = 0; i < entries; ++i) {
                    int gamemode;
                    ProfileKey profileKey;
                    playerInfoPacket.write(Types.UUID, (Object)((UUID)wrapper.read(Types.UUID)));
                    playerInfoPacket.write(Types.STRING, (Object)((String)wrapper.read(Types.STRING)));
                    playerInfoPacket.write(Types.PROFILE_PROPERTY_ARRAY, (Object)((GameProfile.Property[])wrapper.read(Types.PROFILE_PROPERTY_ARRAY)));
                    if (actions.get(1) && ((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        wrapper.read(Types.UUID);
                        profileKey = (ProfileKey)wrapper.read(Types.PROFILE_KEY);
                    } else {
                        profileKey = null;
                    }
                    int n = gamemode = actions.get(2) ? (Integer)wrapper.read((Type)Types.VAR_INT) : 0;
                    if (actions.get(3)) {
                        wrapper.read((Type)Types.BOOLEAN);
                    }
                    int latency = actions.get(4) ? (Integer)wrapper.read((Type)Types.VAR_INT) : 0;
                    JsonElement displayName = actions.get(5) ? (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT) : null;
                    playerInfoPacket.write((Type)Types.VAR_INT, (Object)gamemode);
                    playerInfoPacket.write((Type)Types.VAR_INT, (Object)latency);
                    playerInfoPacket.write(Types.OPTIONAL_COMPONENT, (Object)displayName);
                    playerInfoPacket.write(Types.OPTIONAL_PROFILE_KEY, (Object)profileKey);
                }
                playerInfoPacket.send(Protocol1_19_3To1_19_1.class);
                return;
            }
            PlayerProfileUpdate[] updates = new PlayerProfileUpdate[entries];
            for (int i = 0; i < entries; ++i) {
                UUID uuid = (UUID)wrapper.read(Types.UUID);
                int gamemode = 0;
                int latency = 0;
                JsonElement displayName = null;
                block8: for (int action : PROFILE_ACTIONS) {
                    if (!actions.get(action)) continue;
                    switch (action) {
                        case 2: {
                            gamemode = (Integer)wrapper.read((Type)Types.VAR_INT);
                            continue block8;
                        }
                        case 3: {
                            wrapper.read((Type)Types.BOOLEAN);
                            continue block8;
                        }
                        case 4: {
                            latency = (Integer)wrapper.read((Type)Types.VAR_INT);
                            continue block8;
                        }
                        case 5: {
                            displayName = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                        }
                    }
                }
                updates[i] = new PlayerProfileUpdate(uuid, gamemode, latency, displayName);
            }
            if (actions.get(2)) {
                this.sendPlayerProfileUpdate(wrapper.user(), 1, updates);
            } else if (actions.get(4)) {
                this.sendPlayerProfileUpdate(wrapper.user(), 2, updates);
            } else if (actions.get(5)) {
                this.sendPlayerProfileUpdate(wrapper.user(), 3, updates);
            }
        });
        ((Protocol1_19_3To1_19_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_3.PLAYER_INFO_REMOVE, (ClientboundPacketType)ClientboundPackets1_19_1.PLAYER_INFO, wrapper -> {
            UUID[] uuids = (UUID[])wrapper.read(Types.UUID_ARRAY);
            wrapper.write((Type)Types.VAR_INT, (Object)4);
            wrapper.write((Type)Types.VAR_INT, (Object)uuids.length);
            for (UUID uuid : uuids) {
                wrapper.write(Types.UUID, (Object)uuid);
            }
        });
    }

    private void sendPlayerProfileUpdate(UserConnection connection, int action, PlayerProfileUpdate[] updates) {
        PacketWrapper playerInfoPacket = PacketWrapper.create((PacketType)ClientboundPackets1_19_1.PLAYER_INFO, (UserConnection)connection);
        playerInfoPacket.write((Type)Types.VAR_INT, (Object)action);
        playerInfoPacket.write((Type)Types.VAR_INT, (Object)updates.length);
        for (PlayerProfileUpdate update : updates) {
            playerInfoPacket.write(Types.UUID, (Object)update.uuid());
            if (action == 1) {
                playerInfoPacket.write((Type)Types.VAR_INT, (Object)update.gamemode());
                continue;
            }
            if (action == 2) {
                playerInfoPacket.write((Type)Types.VAR_INT, (Object)update.latency());
                continue;
            }
            if (action == 3) {
                playerInfoPacket.write(Types.OPTIONAL_COMPONENT, (Object)update.displayName());
                continue;
            }
            throw new IllegalArgumentException("Invalid action: " + action);
        }
        playerInfoPacket.send(Protocol1_19_3To1_19_1.class);
    }

    public void registerRewrites() {
        this.filter().handler((event, data) -> {
            int id = data.dataType().typeId();
            if (id > 2) {
                data.setDataType(Types1_19.ENTITY_DATA_TYPES.byId(id - 1));
            } else if (id != 2) {
                data.setDataType(Types1_19.ENTITY_DATA_TYPES.byId(id));
            }
        });
        this.registerEntityDataTypeHandler(Types1_19.ENTITY_DATA_TYPES.itemType, null, Types1_19.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_19.ENTITY_DATA_TYPES.particleType, Types1_19.ENTITY_DATA_TYPES.componentType, Types1_19.ENTITY_DATA_TYPES.optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19_3.ABSTRACT_MINECART, 11);
        this.filter().dataType(Types1_19.ENTITY_DATA_TYPES.poseType).handler((event, data) -> {
            int pose = (Integer)data.value();
            if (pose == 10) {
                data.setValue((Object)0);
            } else if (pose > 10) {
                data.setValue((Object)(pose - 1));
            }
        });
        this.filter().type((EntityType)EntityTypes1_19_3.CAMEL).cancel(19);
        this.filter().type((EntityType)EntityTypes1_19_3.CAMEL).cancel(20);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_19_3.CAMEL, (EntityType)EntityTypes1_19_3.DONKEY).jsonName();
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_19_3.getTypeFromId((int)typeId);
    }
}

