/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.data.BlockList1_6
 *  net.raphimc.vialegacy.api.model.ChunkCoord
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.api.util.BlockFaceUtil
 *  net.raphimc.vialegacy.protocol.alpha.a1_0_15toa1_0_16_2.packet.ClientboundPacketsa1_0_15
 *  net.raphimc.vialegacy.protocol.alpha.a1_0_15toa1_0_16_2.packet.ServerboundPacketsa1_0_15
 *  net.raphimc.vialegacy.protocol.alpha.a1_0_16_2toa1_0_17_1_0_17_4.storage.TimeLockStorage
 *  net.raphimc.vialegacy.protocol.alpha.a1_0_17_1_0_17_4toa1_1_0_1_1_2_1.Protocola1_0_17_1_0_17_4Toa1_1_0_1_1_2_1
 *  net.raphimc.vialegacy.protocol.alpha.a1_1_0_1_1_2_1toa1_2_0_1_2_1_1.packet.ClientboundPacketsa1_1_0
 *  net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.AlphaInventoryProvider
 *  net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.storage.AlphaInventoryTracker
 *  net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.storage.BlockDigStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.data.ClassicBlocks
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.model.ClassicLevel
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicBlockRemapper
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicLevelStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicOpLevelStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicPositionTracker
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicProgressStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicServerTitleStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtBlockPermissionsStorage
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.Protocolr1_7_6_10Tor1_8
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.util.IdAndData;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.data.BlockList1_6;
import net.raphimc.vialegacy.api.model.ChunkCoord;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.api.util.BlockFaceUtil;
import net.raphimc.vialegacy.protocol.alpha.a1_0_15toa1_0_16_2.packet.ClientboundPacketsa1_0_15;
import net.raphimc.vialegacy.protocol.alpha.a1_0_15toa1_0_16_2.packet.ServerboundPacketsa1_0_15;
import net.raphimc.vialegacy.protocol.alpha.a1_0_16_2toa1_0_17_1_0_17_4.storage.TimeLockStorage;
import net.raphimc.vialegacy.protocol.alpha.a1_0_17_1_0_17_4toa1_1_0_1_1_2_1.Protocola1_0_17_1_0_17_4Toa1_1_0_1_1_2_1;
import net.raphimc.vialegacy.protocol.alpha.a1_1_0_1_1_2_1toa1_2_0_1_2_1_1.packet.ClientboundPacketsa1_1_0;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.AlphaInventoryProvider;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.storage.AlphaInventoryTracker;
import net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.storage.BlockDigStorage;
import net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.Protocolb1_5_0_2Tob1_6_0_6;
import net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.Protocolb1_7_0_3Tob1_8_0_1;
import net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.packet.ClientboundPacketsb1_7;
import net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.types.Typesb1_7_0_3;
import net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.packet.ClientboundPacketsb1_8;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.data.ClassicBlocks;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.model.ClassicLevel;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.packet.ClientboundPacketsc0_28;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.packet.ServerboundPacketsc0_28;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicCustomCommandProvider;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicMPPassProvider;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicBlockRemapper;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicLevelStorage;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicOpLevelStorage;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicPositionTracker;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicProgressStorage;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicServerTitleStorage;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.task.ClassicLevelStorageTickTask;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.types.Typesc0_30;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.Protocolc0_30cpeToc0_28_30;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtBlockPermissionsStorage;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.Protocolr1_7_6_10Tor1_8;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolc0_28_30Toa1_0_15
extends StatelessProtocol<ClientboundPacketsc0_28, ClientboundPacketsa1_0_15, ServerboundPacketsc0_28, ServerboundPacketsa1_0_15> {
    public Protocolc0_28_30Toa1_0_15() {
        super(ClientboundPacketsc0_28.class, ClientboundPacketsa1_0_15.class, ServerboundPacketsc0_28.class, ServerboundPacketsa1_0_15.class);
    }

    public void register(ViaProviders providers) {
        providers.register(ClassicWorldHeightProvider.class, (Provider)new ClassicWorldHeightProvider());
        providers.register(ClassicMPPassProvider.class, (Provider)new ClassicMPPassProvider());
        providers.register(ClassicCustomCommandProvider.class, (Provider)new ClassicCustomCommandProvider());
        Via.getPlatform().runRepeatingSync((Runnable)new ClassicLevelStorageTickTask(), 2L);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolc0_28_30Toa1_0_15.class, ClientboundPacketsc0_28::getPacket));
        userConnection.put((StorableObject)new ClassicPositionTracker());
        userConnection.put((StorableObject)new ClassicOpLevelStorage(userConnection, ViaLegacy.getConfig().enableClassicFly()));
        userConnection.put((StorableObject)new ClassicProgressStorage());
        userConnection.put((StorableObject)new ClassicBlockRemapper(i -> (IdAndData)ClassicBlocks.MAPPING.get(i), o -> {
            int block = ClassicBlocks.REVERSE_MAPPING.getInt(o);
            if (!userConnection.getProtocolInfo().getPipeline().contains(Protocolc0_30cpeToc0_28_30.class)) {
                if (block == 2) {
                    block = 3;
                } else if (block == 7) {
                    block = 1;
                } else if (block == 9) {
                    block = 29;
                } else if (block == 11) {
                    block = 22;
                }
            }
            return block;
        }));
        if (userConnection.has(AlphaInventoryTracker.class)) {
            ((AlphaInventoryTracker)userConnection.get(AlphaInventoryTracker.class)).setCreativeMode(true);
        }
        if (userConnection.has(TimeLockStorage.class)) {
            ((TimeLockStorage)userConnection.get(TimeLockStorage.class)).setTime(6000L);
        }
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPacketsc0_28.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read((Type)Types.BYTE);
                this.handler(wrapper -> {
                    String title = ((String)wrapper.read(Typesc0_30.STRING)).replace("&", "\u00a7");
                    String motd = ((String)wrapper.read(Typesc0_30.STRING)).replace("&", "\u00a7");
                    byte opLevel = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.user().put((StorableObject)new ClassicServerTitleStorage(wrapper.user(), title, motd));
                    ((ClassicOpLevelStorage)wrapper.user().get(ClassicOpLevelStorage.class)).setOpLevel(opLevel);
                    wrapper.write((Type)Types.INT, (Object)wrapper.user().getProtocolInfo().getUsername().hashCode());
                    wrapper.write(Typesb1_7_0_3.STRING, (Object)wrapper.user().getProtocolInfo().getUsername());
                    wrapper.write(Typesb1_7_0_3.STRING, (Object)"");
                    if (wrapper.user().has(ClassicLevelStorage.class)) {
                        wrapper.cancel();
                    }
                    if (wrapper.user().getProtocolInfo().getPipeline().contains(Protocolr1_7_6_10Tor1_8.class)) {
                        PacketWrapper tabList = PacketWrapper.create((PacketType)ClientboundPackets1_8.TAB_LIST, (UserConnection)wrapper.user());
                        tabList.write(Types.STRING, (Object)((String)Protocolr1_7_6_10Tor1_8.LEGACY_TO_JSON.transform(wrapper, (Object)("\u00a76" + title + "\n"))));
                        tabList.write(Types.STRING, (Object)((String)Protocolr1_7_6_10Tor1_8.LEGACY_TO_JSON.transform(wrapper, (Object)("\n\u00a7b" + motd))));
                        tabList.send(Protocolr1_7_6_10Tor1_8.class);
                    }
                    ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)wrapper.user().get(ClassicProgressStorage.class);
                    classicProgressStorage.progress = 1;
                    classicProgressStorage.upperBound = 2;
                    classicProgressStorage.status = "Waiting for server...";
                });
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.LEVEL_INIT, null, wrapper -> {
            wrapper.cancel();
            if (wrapper.user().has(ClassicLevelStorage.class) && wrapper.user().getProtocolInfo().getPipeline().contains(Protocolb1_5_0_2Tob1_6_0_6.class)) {
                PacketWrapper fakeRespawn = PacketWrapper.create((PacketType)ClientboundPacketsb1_7.RESPAWN, (UserConnection)wrapper.user());
                fakeRespawn.write((Type)Types.BYTE, (Object)-1);
                fakeRespawn.send(Protocolb1_5_0_2Tob1_6_0_6.class);
                PacketWrapper respawn = PacketWrapper.create((PacketType)ClientboundPacketsb1_7.RESPAWN, (UserConnection)wrapper.user());
                respawn.write((Type)Types.BYTE, (Object)0);
                respawn.send(Protocolb1_5_0_2Tob1_6_0_6.class);
                ((ClassicPositionTracker)wrapper.user().get(ClassicPositionTracker.class)).spawned = false;
            }
            if (wrapper.user().getProtocolInfo().getPipeline().contains(Protocolb1_7_0_3Tob1_8_0_1.class)) {
                PacketWrapper gameEvent = PacketWrapper.create((PacketType)ClientboundPacketsb1_8.GAME_EVENT, (UserConnection)wrapper.user());
                gameEvent.write((Type)Types.BYTE, (Object)3);
                gameEvent.write((Type)Types.BYTE, (Object)1);
                gameEvent.send(Protocolb1_7_0_3Tob1_8_0_1.class);
            }
            ((ClassicOpLevelStorage)wrapper.user().get(ClassicOpLevelStorage.class)).updateAbilities();
            wrapper.user().put((StorableObject)new ClassicLevelStorage(wrapper.user()));
            ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)wrapper.user().get(ClassicProgressStorage.class);
            classicProgressStorage.progress = 2;
            classicProgressStorage.upperBound = 2;
            classicProgressStorage.status = "Waiting for server...";
        });
        this.registerClientbound(ClientboundPacketsc0_28.LEVEL_DATA, null, wrapper -> {
            wrapper.cancel();
            short partSize = (Short)wrapper.read((Type)Types.SHORT);
            byte[] data = (byte[])wrapper.read(Typesc0_30.BYTE_ARRAY);
            byte progress = (Byte)wrapper.read((Type)Types.BYTE);
            ((ClassicLevelStorage)wrapper.user().get(ClassicLevelStorage.class)).addDataPart(data, (int)partSize);
            ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)wrapper.user().get(ClassicProgressStorage.class);
            classicProgressStorage.upperBound = 100;
            classicProgressStorage.progress = progress;
            classicProgressStorage.status = "Receiving level... \u00a77" + progress + "%";
        });
        this.registerClientbound(ClientboundPacketsc0_28.LEVEL_FINALIZE, null, wrapper -> {
            wrapper.cancel();
            short sizeX = (Short)wrapper.read((Type)Types.SHORT);
            short sizeY = (Short)wrapper.read((Type)Types.SHORT);
            short sizeZ = (Short)wrapper.read((Type)Types.SHORT);
            ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)wrapper.user().get(ClassicProgressStorage.class);
            ClassicLevelStorage levelStorage = (ClassicLevelStorage)wrapper.user().get(ClassicLevelStorage.class);
            short maxChunkSectionCount = ((ClassicWorldHeightProvider)Via.getManager().getProviders().get(ClassicWorldHeightProvider.class)).getMaxChunkSectionCount(wrapper.user());
            classicProgressStorage.upperBound = 2;
            classicProgressStorage.progress = 0;
            classicProgressStorage.status = "Finishing level... \u00a77Decompressing";
            levelStorage.finish((int)sizeX, (int)sizeY, (int)sizeZ);
            levelStorage.sendChunk(new ChunkCoord(0, 0));
            if (wrapper.user().getProtocolInfo().getPipeline().contains(Protocolr1_7_6_10Tor1_8.class)) {
                PacketWrapper setBorder = PacketWrapper.create((PacketType)ClientboundPackets1_8.SET_BORDER, (UserConnection)wrapper.user());
                setBorder.write((Type)Types.VAR_INT, (Object)3);
                setBorder.write((Type)Types.DOUBLE, (Object)((double)sizeX / 2.0));
                setBorder.write((Type)Types.DOUBLE, (Object)((double)sizeZ / 2.0));
                setBorder.write((Type)Types.DOUBLE, (Object)0.0);
                setBorder.write((Type)Types.DOUBLE, (Object)Math.max(sizeX, sizeZ));
                setBorder.write((Type)Types.VAR_LONG, (Object)0L);
                setBorder.write((Type)Types.VAR_INT, (Object)Math.max(sizeX, sizeZ));
                setBorder.write((Type)Types.VAR_INT, (Object)0);
                setBorder.write((Type)Types.VAR_INT, (Object)0);
                setBorder.send(Protocolr1_7_6_10Tor1_8.class);
            }
            this.sendChatMessage(wrapper.user(), "\u00a7aWorld dimensions: \u00a76" + sizeX + "\u00a7ax\u00a76" + sizeY + "\u00a7ax\u00a76" + sizeZ);
            if (sizeY > maxChunkSectionCount << 4) {
                this.sendChatMessage(wrapper.user(), "\u00a7cThis server has a world higher than " + (maxChunkSectionCount << 4) + " blocks! Expect world errors");
            }
            classicProgressStorage.progress = 1;
            classicProgressStorage.status = "Finishing level... \u00a77Waiting for server";
        });
        this.registerClientbound(ClientboundPacketsc0_28.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Typesc0_30.BLOCK_POSITION, Types1_7_6.BLOCK_POSITION_UBYTE);
                this.handler(wrapper -> {
                    ClassicLevelStorage levelStorage = (ClassicLevelStorage)wrapper.user().get(ClassicLevelStorage.class);
                    if (levelStorage == null || !levelStorage.hasReceivedLevel()) {
                        wrapper.cancel();
                        return;
                    }
                    ClassicBlockRemapper remapper = (ClassicBlockRemapper)wrapper.user().get(ClassicBlockRemapper.class);
                    BlockPosition pos = (BlockPosition)wrapper.get(Types1_7_6.BLOCK_POSITION_UBYTE, 0);
                    byte blockId = (Byte)wrapper.read((Type)Types.BYTE);
                    levelStorage.getClassicLevel().setBlock(pos, (int)blockId);
                    if (!levelStorage.isChunkLoaded(pos)) {
                        wrapper.cancel();
                        return;
                    }
                    IdAndData mappedBlock = (IdAndData)remapper.mapper().get((int)blockId);
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)mappedBlock.getId()));
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)mappedBlock.getData());
                });
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map(Typesc0_30.STRING, Typesb1_7_0_3.STRING, n -> n.replace("&", "\u00a7"));
                this.map((Type)Types.SHORT, (Type)Types.INT);
                this.map((Type)Types.SHORT, (Type)Types.INT);
                this.map((Type)Types.SHORT, (Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.BYTE, yaw -> (byte)(yaw + 128));
                this.map((Type)Types.BYTE);
                this.create((Type)Types.UNSIGNED_SHORT, 0);
                this.handler(wrapper -> {
                    if ((Integer)wrapper.get((Type)Types.INT, 0) < 0) {
                        wrapper.cancel();
                        int x = (Integer)wrapper.get((Type)Types.INT, 1);
                        int y = (Integer)wrapper.get((Type)Types.INT, 2);
                        int z = (Integer)wrapper.get((Type)Types.INT, 3);
                        byte yaw = (Byte)wrapper.get((Type)Types.BYTE, 0);
                        byte pitch = (Byte)wrapper.get((Type)Types.BYTE, 1);
                        ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)wrapper.user().get(ClassicProgressStorage.class);
                        classicProgressStorage.progress = 2;
                        classicProgressStorage.status = "Finishing level... \u00a77Loading spawn chunks";
                        ClassicPositionTracker classicPositionTracker = (ClassicPositionTracker)wrapper.user().get(ClassicPositionTracker.class);
                        classicPositionTracker.posX = (float)x / 32.0f;
                        classicPositionTracker.stance = (float)y / 32.0f + 0.714f;
                        classicPositionTracker.posZ = (float)z / 32.0f;
                        classicPositionTracker.yaw = (float)(yaw * 360) / 256.0f;
                        classicPositionTracker.pitch = (float)(pitch * 360) / 256.0f;
                        ((ClassicLevelStorage)wrapper.user().get(ClassicLevelStorage.class)).sendChunks(classicPositionTracker.getChunkPosition(), 1);
                        if (wrapper.user().getProtocolInfo().getPipeline().contains(Protocola1_0_17_1_0_17_4Toa1_1_0_1_1_2_1.class)) {
                            PacketWrapper spawnPosition = PacketWrapper.create((PacketType)ClientboundPacketsa1_1_0.SET_DEFAULT_SPAWN_POSITION, (UserConnection)wrapper.user());
                            spawnPosition.write(Types1_7_6.BLOCK_POSITION_INT, (Object)new BlockPosition((int)classicPositionTracker.posX, (int)classicPositionTracker.stance, (int)classicPositionTracker.posZ));
                            spawnPosition.send(Protocola1_0_17_1_0_17_4Toa1_1_0_1_1_2_1.class);
                        }
                        PacketWrapper playerPosition = PacketWrapper.create((PacketType)ClientboundPacketsa1_0_15.PLAYER_POSITION, (UserConnection)wrapper.user());
                        playerPosition.write((Type)Types.DOUBLE, (Object)classicPositionTracker.posX);
                        playerPosition.write((Type)Types.DOUBLE, (Object)classicPositionTracker.stance);
                        playerPosition.write((Type)Types.DOUBLE, (Object)(classicPositionTracker.stance - (double)1.62f));
                        playerPosition.write((Type)Types.DOUBLE, (Object)classicPositionTracker.posZ);
                        playerPosition.write((Type)Types.FLOAT, (Object)Float.valueOf(classicPositionTracker.yaw));
                        playerPosition.write((Type)Types.FLOAT, (Object)Float.valueOf(classicPositionTracker.pitch));
                        playerPosition.write((Type)Types.BOOLEAN, (Object)true);
                        playerPosition.send(Protocolc0_28_30Toa1_0_15.class);
                        classicPositionTracker.spawned = true;
                    } else {
                        wrapper.set((Type)Types.INT, 2, (Object)((Integer)wrapper.get((Type)Types.INT, 2) - Float.valueOf(51.84f).intValue()));
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.TELEPORT_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.SHORT, (Type)Types.INT);
                this.map((Type)Types.SHORT, (Type)Types.INT);
                this.map((Type)Types.SHORT, (Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.BYTE, yaw -> (byte)(yaw + 128));
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    if ((Integer)wrapper.get((Type)Types.INT, 0) < 0) {
                        wrapper.set((Type)Types.INT, 2, (Object)((Integer)wrapper.get((Type)Types.INT, 2) - 29));
                        wrapper.set((Type)Types.INT, 0, (Object)wrapper.user().getProtocolInfo().getUsername().hashCode());
                    } else {
                        wrapper.set((Type)Types.INT, 2, (Object)((Integer)wrapper.get((Type)Types.INT, 2) - Float.valueOf(51.84f).intValue()));
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.MOVE_ENTITY_POS_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE, (Type)Types.BYTE, yaw -> (byte)(yaw + 128));
                this.map((Type)Types.BYTE);
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.MOVE_ENTITY_POS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.MOVE_ENTITY_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.BYTE, yaw -> (byte)(yaw + 128));
                this.map((Type)Types.BYTE);
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.REMOVE_ENTITIES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.INT);
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(packetWrapper -> {
                    byte senderId = (Byte)packetWrapper.read((Type)Types.BYTE);
                    Object message = ((String)packetWrapper.read(Typesc0_30.STRING)).replace("&", "\u00a7");
                    if (senderId < 0) {
                        message = "\u00a7e" + (String)message;
                    }
                    packetWrapper.write(Typesb1_7_0_3.STRING, message);
                });
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.DISCONNECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Typesc0_30.STRING, Typesb1_7_0_3.STRING, s -> s.replace("&", "\u00a7"));
            }
        });
        this.registerClientbound(ClientboundPacketsc0_28.OP_LEVEL_UPDATE, null, wrapper -> {
            wrapper.cancel();
            ClassicOpLevelStorage opLevelStorage = (ClassicOpLevelStorage)wrapper.user().get(ClassicOpLevelStorage.class);
            byte opLevel = (Byte)wrapper.read((Type)Types.BYTE);
            opLevelStorage.setOpLevel(opLevel);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.BYTE);
                this.map(Typesb1_7_0_3.STRING, Typesc0_30.STRING);
                this.read(Typesb1_7_0_3.STRING);
                this.handler(wrapper -> {
                    wrapper.write(Typesc0_30.STRING, (Object)((ClassicMPPassProvider)Via.getManager().getProviders().get(ClassicMPPassProvider.class)).getMpPass(wrapper.user()));
                    wrapper.write((Type)Types.BYTE, (Object)0);
                    ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)wrapper.user().get(ClassicProgressStorage.class);
                    classicProgressStorage.upperBound = 2;
                    classicProgressStorage.status = "Logging in...";
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.CHAT, wrapper -> {
            String message = (String)wrapper.read(Typesb1_7_0_3.STRING);
            wrapper.write((Type)Types.BYTE, (Object)-1);
            wrapper.write(Typesc0_30.STRING, (Object)message);
            if (((ClassicCustomCommandProvider)Via.getManager().getProviders().get(ClassicCustomCommandProvider.class)).handleChatMessage(wrapper.user(), message)) {
                wrapper.cancel();
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.MOVE_PLAYER_STATUS_ONLY, ServerboundPacketsc0_28.MOVE_PLAYER_POS_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read((Type)Types.BOOLEAN);
                this.handler(wrapper -> ((ClassicPositionTracker)wrapper.user().get(ClassicPositionTracker.class)).writeToPacket(wrapper));
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.MOVE_PLAYER_POS, ServerboundPacketsc0_28.MOVE_PLAYER_POS_ROT, wrapper -> {
            ClassicPositionTracker positionTracker = (ClassicPositionTracker)wrapper.user().get(ClassicPositionTracker.class);
            positionTracker.posX = (Double)wrapper.read((Type)Types.DOUBLE);
            wrapper.read((Type)Types.DOUBLE);
            positionTracker.stance = (Double)wrapper.read((Type)Types.DOUBLE);
            positionTracker.posZ = (Double)wrapper.read((Type)Types.DOUBLE);
            wrapper.read((Type)Types.BOOLEAN);
            positionTracker.writeToPacket(wrapper);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.MOVE_PLAYER_ROT, ServerboundPacketsc0_28.MOVE_PLAYER_POS_ROT, wrapper -> {
            ClassicPositionTracker positionTracker = (ClassicPositionTracker)wrapper.user().get(ClassicPositionTracker.class);
            positionTracker.yaw = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            positionTracker.pitch = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            wrapper.read((Type)Types.BOOLEAN);
            positionTracker.writeToPacket(wrapper);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.MOVE_PLAYER_POS_ROT, wrapper -> {
            ClassicPositionTracker positionTracker = (ClassicPositionTracker)wrapper.user().get(ClassicPositionTracker.class);
            positionTracker.posX = (Double)wrapper.read((Type)Types.DOUBLE);
            wrapper.read((Type)Types.DOUBLE);
            positionTracker.stance = (Double)wrapper.read((Type)Types.DOUBLE);
            positionTracker.posZ = (Double)wrapper.read((Type)Types.DOUBLE);
            positionTracker.yaw = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            positionTracker.pitch = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            wrapper.read((Type)Types.BOOLEAN);
            positionTracker.writeToPacket(wrapper);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.PLAYER_ACTION, ServerboundPacketsc0_28.USE_ITEM_ON, wrapper -> {
            wrapper.user().getStoredObjects().remove(BlockDigStorage.class);
            ClassicLevel level = ((ClassicLevelStorage)wrapper.user().get(ClassicLevelStorage.class)).getClassicLevel();
            ClassicOpLevelStorage opTracker = (ClassicOpLevelStorage)wrapper.user().get(ClassicOpLevelStorage.class);
            boolean extendedVerification = wrapper.user().has(ExtBlockPermissionsStorage.class);
            short status = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
            BlockPosition pos = (BlockPosition)wrapper.read(Types1_7_6.BLOCK_POSITION_UBYTE);
            wrapper.read((Type)Types.UNSIGNED_BYTE);
            int blockId = level.getBlock(pos);
            boolean hasCreative = wrapper.user().getProtocolInfo().getPipeline().contains(Protocolb1_7_0_3Tob1_8_0_1.class);
            if (status == 0 && hasCreative || status == 2 && !hasCreative) {
                if (!extendedVerification && blockId == 7 && opTracker.getOpLevel() < 100) {
                    wrapper.cancel();
                    this.sendChatMessage(wrapper.user(), "\u00a7cOnly op players can break bedrock!");
                    this.sendBlockChange(wrapper.user(), pos, new IdAndData(BlockList1_6.bedrock.blockId(), 0));
                    return;
                }
                if (!extendedVerification) {
                    level.setBlock(pos, 0);
                    this.sendBlockChange(wrapper.user(), pos, new IdAndData(0, 0));
                }
                wrapper.write(Typesc0_30.BLOCK_POSITION, (Object)pos);
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                wrapper.write((Type)Types.BYTE, (Object)1);
            } else {
                wrapper.cancel();
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.USE_ITEM_ON, wrapper -> {
            ClassicLevel level = ((ClassicLevelStorage)wrapper.user().get(ClassicLevelStorage.class)).getClassicLevel();
            ClassicBlockRemapper remapper = (ClassicBlockRemapper)wrapper.user().get(ClassicBlockRemapper.class);
            boolean extendedVerification = wrapper.user().has(ExtBlockPermissionsStorage.class);
            wrapper.read((Type)Types.SHORT);
            BlockPosition pos = (BlockPosition)wrapper.read(Types1_7_6.BLOCK_POSITION_UBYTE);
            short direction = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
            Item item = ((AlphaInventoryProvider)Via.getManager().getProviders().get(AlphaInventoryProvider.class)).getHandItem(wrapper.user());
            if (item == null || direction == 255) {
                wrapper.cancel();
                return;
            }
            if ((pos = pos.getRelative(BlockFaceUtil.getFace((int)direction))).y() >= level.getSizeY()) {
                wrapper.cancel();
                this.sendChatMessage(wrapper.user(), "\u00a7cHeight limit for building is " + level.getSizeY() + " blocks");
                this.sendBlockChange(wrapper.user(), pos, new IdAndData(0, 0));
                return;
            }
            byte classicBlock = (byte)remapper.reverseMapper().getInt((Object)new IdAndData(item.identifier(), item.data() & 0xF));
            if (!extendedVerification) {
                level.setBlock(pos, (int)classicBlock);
                this.sendBlockChange(wrapper.user(), pos, (IdAndData)remapper.mapper().get((int)classicBlock));
            }
            wrapper.write(Typesc0_30.BLOCK_POSITION, (Object)pos);
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
            wrapper.write((Type)Types.BYTE, (Object)classicBlock);
        });
        this.cancelServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.KEEP_ALIVE);
        this.cancelServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.SET_CARRIED_ITEM);
        this.cancelServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.SWING);
        this.cancelServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.SPAWN_ITEM);
        this.cancelServerbound((ServerboundPacketType)ServerboundPacketsa1_0_15.DISCONNECT);
    }

    private void sendChatMessage(UserConnection user, String msg) {
        PacketWrapper message = PacketWrapper.create((PacketType)ClientboundPacketsa1_0_15.CHAT, (UserConnection)user);
        message.write(Typesb1_7_0_3.STRING, (Object)msg);
        message.send(Protocolc0_28_30Toa1_0_15.class);
    }

    private void sendBlockChange(UserConnection user, BlockPosition pos, IdAndData block) {
        PacketWrapper blockChange = PacketWrapper.create((PacketType)ClientboundPacketsa1_0_15.BLOCK_UPDATE, (UserConnection)user);
        blockChange.write(Types1_7_6.BLOCK_POSITION_UBYTE, (Object)pos);
        blockChange.write((Type)Types.UNSIGNED_BYTE, (Object)((short)block.getId()));
        blockChange.write((Type)Types.UNSIGNED_BYTE, (Object)block.getData());
        blockChange.send(Protocolc0_28_30Toa1_0_15.class);
    }
}

