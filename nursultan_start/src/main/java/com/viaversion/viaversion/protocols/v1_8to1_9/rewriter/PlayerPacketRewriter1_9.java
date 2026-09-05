/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.GameMode
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$EntityType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.ClientWorld1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.MovementTracker
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viaversion.protocols.v1_8to1_9.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.GameMode;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.CommandBlockProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.MainHandProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.ClientWorld1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.EntityTracker1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.MovementTracker;
import com.viaversion.viaversion.util.ComponentUtil;

public class PlayerPacketRewriter1_9 {
    public static void register(final Protocol1_8To1_9 protocol) {
        protocol.registerClientbound(ClientboundPackets1_8.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING, Protocol1_8To1_9.STRING_TO_JSON);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    JsonObject obj = (JsonObject)wrapper.get(Types.COMPONENT, 0);
                    if (obj.get("translate") != null && obj.get("translate").getAsString().equals("gameMode.changed")) {
                        EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                        String gameMode = tracker.getGameMode().text();
                        JsonObject gameModeObject = new JsonObject();
                        gameModeObject.addProperty("text", gameMode);
                        gameModeObject.addProperty("color", "gray");
                        gameModeObject.addProperty("italic", Boolean.valueOf(true));
                        JsonArray array = new JsonArray();
                        array.add((JsonElement)gameModeObject);
                        obj.add("with", (JsonElement)array);
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.TAB_LIST, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING, Protocol1_8To1_9.STRING_TO_JSON);
                this.map(Types.STRING, Protocol1_8To1_9.STRING_TO_JSON);
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.DISCONNECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING, Protocol1_8To1_9.STRING_TO_JSON);
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.SET_TITLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (action == 0 || action == 1) {
                        Protocol1_8To1_9.STRING_TO_JSON.write(wrapper, (Object)((String)wrapper.read(Types.STRING)));
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.PLAYER_POSITION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BYTE);
                this.create((Type)Types.VAR_INT, 0);
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.SET_PLAYER_TEAM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    byte mode = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (mode == 0 || mode == 2) {
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough((Type)Types.BYTE);
                        wrapper.passthrough(Types.STRING);
                        wrapper.write(Types.STRING, (Object)(Via.getConfig().isPreventCollision() ? "never" : ""));
                        wrapper.passthrough((Type)Types.BYTE);
                    }
                    if (mode == 0 || mode == 3 || mode == 4) {
                        String[] players = (String[])wrapper.passthrough(Types.STRING_ARRAY);
                        EntityTracker1_9 entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                        String myName = wrapper.user().getProtocolInfo().getUsername();
                        String teamName = (String)wrapper.get(Types.STRING, 0);
                        for (String player : players) {
                            if (!entityTracker.isAutoTeam() || !player.equalsIgnoreCase(myName)) continue;
                            if (mode == 4) {
                                wrapper.send(Protocol1_8To1_9.class);
                                wrapper.cancel();
                                entityTracker.sendTeamPacket(true, true);
                                entityTracker.setCurrentTeam("viaversion");
                                continue;
                            }
                            entityTracker.sendTeamPacket(false, true);
                            entityTracker.setCurrentTeam(teamName);
                        }
                    }
                    if (mode == 1) {
                        EntityTracker1_9 entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                        String teamName = (String)wrapper.get(Types.STRING, 0);
                        if (entityTracker.isAutoTeam() && teamName.equals(entityTracker.getCurrentTeam())) {
                            wrapper.send(Protocol1_8To1_9.class);
                            wrapper.cancel();
                            entityTracker.sendTeamPacket(true, true);
                            entityTracker.setCurrentTeam("viaversion");
                        }
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.addEntity(entityId, (EntityType)EntityTypes1_9.EntityType.PLAYER);
                    tracker.setClientEntityId(entityId);
                });
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    short gamemodeId = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    gamemodeId = (short)(gamemodeId & 0xFFFFFFF7);
                    tracker.setGameMode(GameMode.getById((int)gamemodeId));
                });
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_8To1_9.class);
                    byte dimensionId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    clientWorld.setEnvironment((int)dimensionId);
                });
                this.handler(wrapper -> {
                    CommandBlockProvider provider = (CommandBlockProvider)Via.getManager().getProviders().get(CommandBlockProvider.class);
                    provider.sendPermission(wrapper.user());
                });
                this.handler(wrapper -> {
                    EntityTracker1_9 entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    if (Via.getConfig().isAutoTeam()) {
                        entityTracker.setAutoTeam(true);
                        wrapper.send(Protocol1_8To1_9.class);
                        wrapper.cancel();
                        entityTracker.sendTeamPacket(true, true);
                        entityTracker.setCurrentTeam("viaversion");
                    } else {
                        entityTracker.setAutoTeam(false);
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.PLAYER_INFO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    int count = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    for (int i = 0; i < count; ++i) {
                        String displayName;
                        wrapper.passthrough(Types.UUID);
                        if (action == 0) {
                            wrapper.passthrough(Types.STRING);
                            wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                            wrapper.passthrough((Type)Types.VAR_INT);
                            wrapper.passthrough((Type)Types.VAR_INT);
                            displayName = (String)wrapper.read(Types.OPTIONAL_STRING);
                            wrapper.write(Types.OPTIONAL_COMPONENT, displayName != null ? (JsonElement)Protocol1_8To1_9.STRING_TO_JSON.transform(wrapper, (Object)displayName) : null);
                            continue;
                        }
                        if (action == 1 || action == 2) {
                            wrapper.passthrough((Type)Types.VAR_INT);
                            continue;
                        }
                        if (action != 3) continue;
                        displayName = (String)wrapper.read(Types.OPTIONAL_STRING);
                        wrapper.write(Types.OPTIONAL_COMPONENT, displayName != null ? (JsonElement)Protocol1_8To1_9.STRING_TO_JSON.transform(wrapper, (Object)displayName) : null);
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handlerSoftFail(wrapper -> {
                    String name = (String)wrapper.get(Types.STRING, 0);
                    if (name.equals("MC|BOpen")) {
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                    } else if (name.equals("MC|TrList")) {
                        protocol.getItemRewriter().handleTradeList(wrapper);
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    CommandBlockProvider provider = (CommandBlockProvider)Via.getManager().getProviders().get(CommandBlockProvider.class);
                    provider.sendPermission(wrapper.user());
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    short gamemode = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    tracker.setGameMode(GameMode.getById((int)gamemode));
                    ClientWorld1_9 clientWorld = (ClientWorld1_9)wrapper.user().getClientWorld(Protocol1_8To1_9.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (clientWorld.setEnvironment(dimensionId)) {
                        tracker.clearEntities();
                        clientWorld.getLoadedChunks().clear();
                        provider.unloadChunks(wrapper.user());
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.GAME_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> {
                    short reason = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (reason == 3) {
                        int gamemode = ((Float)wrapper.get((Type)Types.FLOAT, 0)).intValue();
                        EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                        tracker.setGameMode(GameMode.getById((int)gamemode));
                    } else if (reason == 4) {
                        wrapper.set((Type)Types.FLOAT, 0, (Object)Float.valueOf(1.0f));
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.SET_COMPRESSION, null, wrapper -> {
            wrapper.cancel();
            int threshold = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.user().getProtocolInfo().setCompressionEnabled(threshold >= 0);
            CompressionProvider provider = (CompressionProvider)Via.getManager().getProviders().get(CompressionProvider.class);
            provider.handlePlayCompression(wrapper.user(), threshold);
        });
        protocol.registerServerbound(ServerboundPackets1_9.COMMAND_SUGGESTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.read((Type)Types.BOOLEAN);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT, (Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    int hand = (Integer)wrapper.read((Type)Types.VAR_INT);
                    if (Via.getConfig().isLeftHandedHandling() && hand == 0) {
                        wrapper.set((Type)Types.UNSIGNED_BYTE, 0, (Object)((short)(((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0)).intValue() | 0x80)));
                    }
                    wrapper.sendToServer(Protocol1_8To1_9.class);
                    wrapper.cancel();
                    ((MainHandProvider)Via.getManager().getProviders().get(MainHandProvider.class)).setMainHand(wrapper.user(), hand);
                });
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.SWING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read((Type)Types.VAR_INT);
            }
        });
        protocol.cancelServerbound(ServerboundPackets1_9.ACCEPT_TELEPORTATION);
        protocol.cancelServerbound(ServerboundPackets1_9.MOVE_VEHICLE);
        protocol.cancelServerbound(ServerboundPackets1_9.PADDLE_BOAT);
        protocol.registerServerbound(ServerboundPackets1_9.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    Item item;
                    String name = (String)wrapper.get(Types.STRING, 0);
                    if (name.equals("MC|BSign") && (item = (Item)wrapper.passthrough(Types.ITEM1_8)) != null) {
                        item.setIdentifier(387);
                        CompoundTag tag = item.tag();
                        ListTag pages = tag.getListTag("pages", StringTag.class);
                        if (pages == null) {
                            return;
                        }
                        for (int i = 0; i < pages.size(); ++i) {
                            StringTag pageTag = (StringTag)pages.get(i);
                            String value = pageTag.getValue();
                            pageTag.setValue(ComponentUtil.plainToJson((String)value).toString());
                        }
                    }
                    if (name.equals("MC|AutoCmd")) {
                        wrapper.set(Types.STRING, 0, (Object)"MC|AdvCdm");
                        wrapper.write((Type)Types.BYTE, (Object)0);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.clearInputBuffer();
                    }
                    if (name.equals("MC|AdvCmd")) {
                        wrapper.set(Types.STRING, 0, (Object)"MC|AdvCdm");
                    }
                });
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.CLIENT_COMMAND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    EntityTracker1_9 tracker;
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (action == 2 && (tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class)).isBlocking()) {
                        if (!Via.getConfig().isShowShieldWhenSwordInHand()) {
                            tracker.setSecondHand(null);
                        }
                        tracker.setBlocking(false);
                    }
                });
            }
        });
        final PacketHandler onGroundHandler = wrapper -> {
            MovementTracker tracker = (MovementTracker)wrapper.user().get(MovementTracker.class);
            tracker.incrementIdlePacket();
            tracker.setGround(((Boolean)wrapper.get((Type)Types.BOOLEAN, 0)).booleanValue());
        };
        protocol.registerServerbound(ServerboundPackets1_9.MOVE_PLAYER_POS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BOOLEAN);
                this.handler(onGroundHandler);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.MOVE_PLAYER_POS_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
                this.handler(onGroundHandler);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.MOVE_PLAYER_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
                this.handler(onGroundHandler);
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.MOVE_PLAYER_STATUS_ONLY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BOOLEAN);
                this.handler(onGroundHandler);
            }
        });
    }
}

