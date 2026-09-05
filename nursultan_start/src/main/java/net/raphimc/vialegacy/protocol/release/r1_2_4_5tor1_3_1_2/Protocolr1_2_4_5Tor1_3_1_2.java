/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.BaseChunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.util.ChunkUtil
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.data.BlockList1_6
 *  net.raphimc.vialegacy.api.model.Location
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.Protocolr1_2_4_5Tor1_3_1_2$25
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.data.EntityList1_2_4
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.data.sound.Sound
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.data.sound.SoundType
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.model.AbstractTrackedEntity
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.model.TrackedEntity
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.model.TrackedLivingEntity
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.storage.ChestStateTracker
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.storage.EntityTracker
 *  net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.EntityDataTypes1_3_1
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.data.EntityDataIndex1_5_2
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ProtocolMetadataStorage
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2;

import com.google.common.collect.Lists;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.BaseChunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.util.ChunkUtil;
import com.viaversion.viaversion.util.IdAndData;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.data.BlockList1_6;
import net.raphimc.vialegacy.api.model.Location;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.Protocolr1_2_4_5Tor1_3_1_2;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.data.EntityList1_2_4;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.data.sound.Sound;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.data.sound.SoundType;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.model.AbstractTrackedEntity;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.model.TrackedEntity;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.model.TrackedLivingEntity;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.packet.ClientboundPackets1_2_4;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.packet.ServerboundPackets1_2_4;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.provider.OldAuthProvider;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.rewriter.ItemRewriter;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.storage.ChestStateTracker;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.storage.EntityTracker;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.task.EntityTrackerTickTask;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.types.Types1_2_4;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.packet.ClientboundPackets1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.packet.ServerboundPackets1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.EntityDataTypes1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.data.EntityDataIndex1_5_2;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ProtocolMetadataStorage;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_2_4_5Tor1_3_1_2
extends StatelessProtocol<ClientboundPackets1_2_4, ClientboundPackets1_3_1, ServerboundPackets1_2_4, ServerboundPackets1_3_1> {
    private final ItemRewriter itemRewriter = new ItemRewriter(this);

    public Protocolr1_2_4_5Tor1_3_1_2() {
        super(ClientboundPackets1_2_4.class, ClientboundPackets1_3_1.class, ServerboundPackets1_2_4.class, ServerboundPackets1_3_1.class);
    }

    public void register(ViaProviders providers) {
        providers.register(OldAuthProvider.class, (Provider)new OldAuthProvider());
        if (ViaLegacy.getConfig().isSoundEmulation()) {
            Via.getPlatform().runRepeatingSync((Runnable)new EntityTrackerTickTask(), 1L);
        }
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolr1_2_4_5Tor1_3_1_2.class, ClientboundPackets1_2_4::getPacket));
        userConnection.addClientWorld(Protocolr1_2_4_5Tor1_3_1_2.class, new ClientWorld());
        userConnection.put((StorableObject)new ChestStateTracker());
        userConnection.put((StorableObject)new EntityTracker(userConnection));
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(ClientboundPackets1_2_4.HANDSHAKE, ClientboundPackets1_3_1.SHARED_KEY, wrapper -> {
            String serverHash = (String)wrapper.read(Types1_6_4.STRING);
            if (!serverHash.trim().isEmpty() && !serverHash.equalsIgnoreCase("-")) {
                try {
                    ((OldAuthProvider)Via.getManager().getProviders().get(OldAuthProvider.class)).sendAuthRequest(wrapper.user(), serverHash);
                }
                catch (Throwable e) {
                    ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Could not authenticate with mojang for joinserver request!", e);
                    wrapper.cancel();
                    PacketWrapper kick = PacketWrapper.create((PacketType)ClientboundPackets1_3_1.DISCONNECT, (UserConnection)wrapper.user());
                    kick.write(Types1_6_4.STRING, (Object)"Failed to log in: Invalid session (Try restarting your game and the launcher)");
                    kick.send(Protocolr1_2_4_5Tor1_3_1_2.class);
                    return;
                }
            }
            ProtocolInfo info = wrapper.user().getProtocolInfo();
            PacketWrapper login = PacketWrapper.create((PacketType)ServerboundPackets1_2_4.LOGIN, (UserConnection)wrapper.user());
            login.write((Type)Types.INT, (Object)info.serverProtocolVersion().getVersion());
            login.write(Types1_6_4.STRING, (Object)info.getUsername());
            login.write(Types1_6_4.STRING, (Object)"");
            login.write((Type)Types.INT, (Object)0);
            login.write((Type)Types.INT, (Object)0);
            login.write((Type)Types.BYTE, (Object)0);
            login.write((Type)Types.BYTE, (Object)0);
            login.write((Type)Types.BYTE, (Object)0);
            login.sendToServer(Protocolr1_2_4_5Tor1_3_1_2.class);
            State currentState = wrapper.user().getProtocolInfo().getServerState();
            if (currentState != State.LOGIN) {
                wrapper.cancel();
            } else {
                wrapper.write(Types.SHORT_BYTE_ARRAY, (Object)new byte[0]);
                wrapper.write(Types.SHORT_BYTE_ARRAY, (Object)new byte[0]);
                ((ProtocolMetadataStorage)wrapper.user().get(ProtocolMetadataStorage.class)).skipEncryption = true;
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.read(Types1_6_4.STRING);
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.INT, (Type)Types.BYTE);
                this.map((Type)Types.INT, (Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    wrapper.user().getClientWorld(Protocolr1_2_4_5Tor1_3_1_2.class).setEnvironment((int)((Byte)wrapper.get((Type)Types.BYTE, 1)).byteValue());
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    entityTracker.setPlayerID(((Integer)wrapper.get((Type)Types.INT, 0)).intValue());
                    entityTracker.getTrackedEntities().put(entityTracker.getPlayerID(), new TrackedLivingEntity(entityTracker.getPlayerID(), new Location(8.0, 64.0, 8.0), EntityTypes1_8.EntityType.PLAYER));
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.SET_EQUIPPED_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    short itemId = (Short)wrapper.read((Type)Types.SHORT);
                    short itemDamage = (Short)wrapper.read((Type)Types.SHORT);
                    wrapper.write(Types1_7_6.ITEM, (Object)(itemId < 0 ? null : new DataItem((int)itemId, 1, itemDamage, null)));
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types1_6_4.STRING);
                this.handler(wrapper -> {
                    if (wrapper.user().getClientWorld(Protocolr1_2_4_5Tor1_3_1_2.class).setEnvironment(((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        ((ChestStateTracker)wrapper.user().get(ChestStateTracker.class)).clear();
                        EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                        entityTracker.getTrackedEntities().clear();
                        entityTracker.getTrackedEntities().put(entityTracker.getPlayerID(), new TrackedLivingEntity(entityTracker.getPlayerID(), new Location(8.0, 64.0, 8.0), EntityTypes1_8.EntityType.PLAYER));
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.UNSIGNED_SHORT);
                this.handler(wrapper -> wrapper.write(Types1_3_1.ENTITY_DATA_LIST, (Object)Lists.newArrayList((Object[])new EntityData[]{new EntityData(0, (EntityDataType)EntityDataTypes1_3_1.BYTE, (Object)0)})));
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    double x = (double)((Integer)wrapper.get((Type)Types.INT, 1)).intValue() / 32.0;
                    double y = (double)((Integer)wrapper.get((Type)Types.INT, 2)).intValue() / 32.0;
                    double z = (double)((Integer)wrapper.get((Type)Types.INT, 3)).intValue() / 32.0;
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    tracker.getTrackedEntities().put(entityId, new TrackedLivingEntity(entityId, new Location(x, y, z), EntityTypes1_8.EntityType.PLAYER));
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.SPAWN_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_3_1.NBTLESS_ITEM);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    double x = (double)((Integer)wrapper.get((Type)Types.INT, 1)).intValue() / 32.0;
                    double y = (double)((Integer)wrapper.get((Type)Types.INT, 2)).intValue() / 32.0;
                    double z = (double)((Integer)wrapper.get((Type)Types.INT, 3)).intValue() / 32.0;
                    tracker.getTrackedEntities().put(entityId, new TrackedEntity(entityId, new Location(x, y, z), EntityTypes1_8.ObjectType.ITEM.getType()));
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.TAKE_ITEM_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> ((EntityTracker)wrapper.user().get(EntityTracker.class)).getTrackedEntities().remove(wrapper.get((Type)Types.INT, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    EntityTypes1_8.EntityType type;
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    byte typeId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 4);
                    if (typeId == 70 || typeId == 71 || typeId == 74) {
                        type = EntityTypes1_8.ObjectType.FALLING_BLOCK.getType();
                        wrapper.set((Type)Types.BYTE, 0, (Object)((byte)EntityTypes1_8.ObjectType.FALLING_BLOCK.getId()));
                    } else {
                        type = typeId == 10 || typeId == 11 || typeId == 12 ? EntityTypes1_8.ObjectType.MINECART.getType() : EntityTypes1_8.ObjectType.getEntityType((int)typeId, (int)data);
                    }
                    double x = (double)((Integer)wrapper.get((Type)Types.INT, 1)).intValue() / 32.0;
                    double y = (double)((Integer)wrapper.get((Type)Types.INT, 2)).intValue() / 32.0;
                    double z = (double)((Integer)wrapper.get((Type)Types.INT, 3)).intValue() / 32.0;
                    Location location = new Location(x, y, z);
                    short speedX = 0;
                    short speedY = 0;
                    short speedZ = 0;
                    if (data > 0) {
                        speedX = (Short)wrapper.read((Type)Types.SHORT);
                        speedY = (Short)wrapper.read((Type)Types.SHORT);
                        speedZ = (Short)wrapper.read((Type)Types.SHORT);
                    }
                    if (typeId == 70) {
                        data = 12;
                    }
                    if (typeId == 71) {
                        data = 13;
                    }
                    if (typeId == 74) {
                        data = 122;
                    }
                    if (typeId == EntityTypes1_8.ObjectType.FISHIHNG_HOOK.getId()) {
                        Optional nearestEntity = entityTracker.getNearestEntity(location, 2.0, e -> e.getEntityType().isOrHasParent((EntityType)EntityTypes1_8.EntityType.PLAYER));
                        data = nearestEntity.map(AbstractTrackedEntity::getEntityId).orElseGet(() -> ((EntityTracker)entityTracker).getPlayerID());
                    }
                    wrapper.set((Type)Types.INT, 4, (Object)data);
                    if (data > 0) {
                        wrapper.write((Type)Types.SHORT, (Object)speedX);
                        wrapper.write((Type)Types.SHORT, (Object)speedY);
                        wrapper.write((Type)Types.SHORT, (Object)speedZ);
                    }
                    if (type == null) {
                        return;
                    }
                    entityTracker.getTrackedEntities().put(entityId, new TrackedEntity(entityId, location, type));
                    switch (25.$SwitchMap$com$viaversion$viaversion$api$minecraft$entities$EntityTypes1_8$EntityType[type.ordinal()]) {
                        case 1: {
                            entityTracker.playSoundAt(location, Sound.RANDOM_FUSE, 1.0f, 1.0f);
                            break;
                        }
                        case 2: {
                            float pitch = 1.0f / (entityTracker.RND.nextFloat() * 0.4f + 1.2f) + 0.5f;
                            entityTracker.playSoundAt(location, Sound.RANDOM_BOW, 1.0f, pitch);
                            break;
                        }
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: {
                            float pitch = 0.4f / (entityTracker.RND.nextFloat() * 0.4f + 0.8f);
                            entityTracker.playSoundAt(location, Sound.RANDOM_BOW, 0.5f, pitch);
                        }
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.create((Type)Types.SHORT, (short)0);
                this.create((Type)Types.SHORT, (short)0);
                this.create((Type)Types.SHORT, (short)0);
                this.map(Types1_3_1.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    short type = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    double x = (double)((Integer)wrapper.get((Type)Types.INT, 1)).intValue() / 32.0;
                    double y = (double)((Integer)wrapper.get((Type)Types.INT, 2)).intValue() / 32.0;
                    double z = (double)((Integer)wrapper.get((Type)Types.INT, 3)).intValue() / 32.0;
                    List entityDataList = (List)wrapper.get(Types1_3_1.ENTITY_DATA_LIST, 0);
                    EntityTypes1_8.EntityType entityType = EntityTypes1_8.EntityType.findById((int)type);
                    if (entityType == null) {
                        wrapper.cancel();
                        return;
                    }
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    tracker.getTrackedEntities().put(entityId, new TrackedLivingEntity(entityId, new Location(x, y, z), entityType));
                    tracker.updateEntityDataList(entityId, entityDataList);
                    Protocolr1_2_4_5Tor1_3_1_2.this.handleEntityDataList(entityId, entityDataList, wrapper);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.REMOVE_ENTITIES, (PacketHandler)new PacketHandlers(){

            /*
             * Exception decompiling
             */
            public void register() {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * java.lang.UnsupportedOperationException
                 *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.NewAnonymousArray.getDimSize(NewAnonymousArray.java:142)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.isNewArrayLambda(LambdaRewriter.java:455)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:409)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:167)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:105)
                 *     at org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
                 *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.applyExpressionRewriterToArgs(AbstractMemberFunctionInvokation.java:101)
                 *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.applyExpressionRewriter(AbstractMemberFunctionInvokation.java:88)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:103)
                 *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredExpressionStatement.rewriteExpressions(StructuredExpressionStatement.java:70)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }

            private static /* synthetic */ void lambda$register$1(PacketWrapper wrapper) throws InformativeException {
                EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                for (int entityId : (int[])wrapper.get(Types1_7_6.INT_ARRAY, 0)) {
                    tracker.getTrackedEntities().remove(entityId);
                }
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.MOVE_ENTITY_POS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    byte x = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    byte y = (Byte)wrapper.get((Type)Types.BYTE, 1);
                    byte z = (Byte)wrapper.get((Type)Types.BYTE, 2);
                    tracker.updateEntityLocation(entityId, (int)x, (int)y, (int)z, true);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.MOVE_ENTITY_POS_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    byte x = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    byte y = (Byte)wrapper.get((Type)Types.BYTE, 1);
                    byte z = (Byte)wrapper.get((Type)Types.BYTE, 2);
                    tracker.updateEntityLocation(entityId, (int)x, (int)y, (int)z, true);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.TELEPORT_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    int x = (Integer)wrapper.get((Type)Types.INT, 1);
                    int y = (Integer)wrapper.get((Type)Types.INT, 2);
                    int z = (Integer)wrapper.get((Type)Types.INT, 3);
                    tracker.updateEntityLocation(entityId, x, y, z, false);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.ENTITY_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    byte status = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (status == 2) {
                        entityTracker.playSound(entityId, SoundType.HURT);
                    } else if (status == 3) {
                        entityTracker.playSound(entityId, SoundType.DEATH);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.SET_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_3_1.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    List entityDataList = (List)wrapper.get(Types1_3_1.ENTITY_DATA_LIST, 0);
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    if (entityTracker.getTrackedEntities().containsKey(entityId)) {
                        entityTracker.updateEntityDataList(entityId, entityDataList);
                        Protocolr1_2_4_5Tor1_3_1_2.this.handleEntityDataList(entityId, entityDataList, wrapper);
                    } else {
                        wrapper.cancel();
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.PRE_CHUNK, ClientboundPackets1_3_1.LEVEL_CHUNK, wrapper -> {
            int chunkX = (Integer)wrapper.read((Type)Types.INT);
            int chunkZ = (Integer)wrapper.read((Type)Types.INT);
            boolean load = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            ((ChestStateTracker)wrapper.user().get(ChestStateTracker.class)).unload(chunkX, chunkZ);
            Object chunk = load ? ChunkUtil.createEmptyChunk((int)chunkX, (int)chunkZ) : new BaseChunk(chunkX, chunkZ, true, false, 0, new ChunkSection[16], null, new ArrayList());
            wrapper.write(Types1_7_6.getChunk((Environment)wrapper.user().getClientWorld(Protocolr1_2_4_5Tor1_3_1_2.class).getEnvironment()), chunk);
        });
        this.registerClientbound(ClientboundPackets1_2_4.LEVEL_CHUNK, wrapper -> {
            Environment dimension = wrapper.user().getClientWorld(Protocolr1_2_4_5Tor1_3_1_2.class).getEnvironment();
            Chunk chunk = (Chunk)wrapper.read(Types1_2_4.CHUNK);
            ((ChestStateTracker)wrapper.user().get(ChestStateTracker.class)).unload(chunk.getX(), chunk.getZ());
            if (chunk.isFullChunk() && chunk.getBitmask() == 0) {
                if (Via.getConfig().logOtherConversionWarnings()) {
                    ViaLegacy.getPlatform().getLogger().warning("Received empty 1.2.5 chunk packet");
                }
                chunk = ChunkUtil.createEmptyChunk((int)chunk.getX(), (int)chunk.getZ());
                if (dimension == Environment.NORMAL) {
                    ChunkUtil.setDummySkylight((Chunk)chunk, (boolean)true);
                }
            }
            if (dimension != Environment.NORMAL) {
                for (ChunkSection section : chunk.getSections()) {
                    if (section == null) continue;
                    section.getLight().setSkyLight(null);
                }
            }
            wrapper.write(Types1_7_6.getChunk((Environment)dimension), (Object)chunk);
        });
        this.registerClientbound(ClientboundPackets1_2_4.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE, (Type)Types.UNSIGNED_SHORT);
                this.map((Type)Types.UNSIGNED_BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.BLOCK_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    IdAndData block = ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).getBlockNotNull((BlockPosition)wrapper.get(Types1_7_6.BLOCK_POSITION_SHORT, 0));
                    wrapper.write((Type)Types.SHORT, (Object)((short)block.getId()));
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    BlockPosition pos = (BlockPosition)wrapper.get(Types1_7_6.BLOCK_POSITION_SHORT, 0);
                    byte type = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    short data = ((Byte)wrapper.get((Type)Types.BYTE, 1)).byteValue();
                    short blockId = (Short)wrapper.get((Type)Types.SHORT, 0);
                    if (blockId <= 0) {
                        return;
                    }
                    float volume = 1.0f;
                    float pitch = 1.0f;
                    Sound sound = null;
                    if (block.getId() == BlockList1_6.music.blockId()) {
                        sound = switch (type) {
                            default -> Sound.NOTE_HARP;
                            case 1 -> Sound.NOTE_CLICK;
                            case 2 -> Sound.NOTE_SNARE;
                            case 3 -> Sound.NOTE_HAT;
                            case 4 -> Sound.NOTE_BASS_ATTACK;
                        };
                        volume = 3.0f;
                        pitch = (float)Math.pow(2.0, (double)(data - 12) / 12.0);
                    } else if (block.getId() == BlockList1_6.chest.blockId()) {
                        if (type == 1) {
                            ChestStateTracker chestStateTracker = (ChestStateTracker)wrapper.user().get(ChestStateTracker.class);
                            if (chestStateTracker.isChestOpen(pos) && data <= 0) {
                                sound = Sound.CHEST_CLOSE;
                                chestStateTracker.closeChest(pos);
                            } else if (!chestStateTracker.isChestOpen(pos) && data > 0) {
                                sound = Sound.CHEST_OPEN;
                                chestStateTracker.openChest(pos);
                            }
                            volume = 0.5f;
                            pitch = entityTracker.RND.nextFloat() * 0.1f + 0.9f;
                        }
                    } else if (block.getId() == BlockList1_6.pistonBase.blockId() || block.getId() == BlockList1_6.pistonStickyBase.blockId()) {
                        if (type == 0) {
                            sound = Sound.PISTON_OUT;
                            volume = 0.5f;
                            pitch = entityTracker.RND.nextFloat() * 0.25f + 0.6f;
                        } else if (type == 1) {
                            sound = Sound.PISTON_IN;
                            volume = 0.5f;
                            pitch = entityTracker.RND.nextFloat() * 0.15f + 0.6f;
                        }
                    }
                    if (sound != null) {
                        entityTracker.playSoundAt(new Location(pos), sound, volume, pitch);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int count = (Integer)wrapper.get((Type)Types.INT, 0);
                    for (int i = 0; i < count * 3; ++i) {
                        wrapper.passthrough((Type)Types.BYTE);
                    }
                });
                this.create((Type)Types.FLOAT, Float.valueOf(0.0f));
                this.create((Type)Types.FLOAT, Float.valueOf(0.0f));
                this.create((Type)Types.FLOAT, Float.valueOf(0.0f));
                this.handler(wrapper -> {
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    Location loc = new Location(((Double)wrapper.get((Type)Types.DOUBLE, 0)).doubleValue(), ((Double)wrapper.get((Type)Types.DOUBLE, 1)).doubleValue(), ((Double)wrapper.get((Type)Types.DOUBLE, 2)).doubleValue());
                    entityTracker.playSoundAt(loc, Sound.RANDOM_EXPLODE, 4.0f, (1.0f + (entityTracker.RND.nextFloat() - entityTracker.RND.nextFloat()) * 0.2f) * 0.7f);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.CONTAINER_SET_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types1_2_4.NBT_ITEM, Types1_7_6.ITEM);
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.CONTAINER_SET_CONTENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map(Types1_2_4.NBT_ITEM_ARRAY, Types1_7_6.ITEM_ARRAY);
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.read((Type)Types.INT);
                    wrapper.read((Type)Types.INT);
                    wrapper.read((Type)Types.INT);
                    if ((Byte)wrapper.get((Type)Types.BYTE, 0) != 1) {
                        wrapper.cancel();
                        return;
                    }
                    BlockPosition pos = (BlockPosition)wrapper.get(Types1_7_6.BLOCK_POSITION_SHORT, 0);
                    CompoundTag tag = new CompoundTag();
                    tag.putString("EntityId", EntityList1_2_4.getEntityName((int)entityId));
                    tag.putShort("Delay", (short)20);
                    tag.putInt("x", pos.x());
                    tag.putInt("y", pos.y());
                    tag.putInt("z", pos.z());
                    wrapper.write(Types1_7_6.NBT, (Object)tag);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_2_4.PLAYER_ABILITIES, wrapper -> {
            boolean disableDamage = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            boolean flying = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            boolean allowFlying = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            boolean creativeMode = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            byte mask = 0;
            if (disableDamage) {
                mask = (byte)(mask | 1);
            }
            if (flying) {
                mask = (byte)(mask | 2);
            }
            if (allowFlying) {
                mask = (byte)(mask | 4);
            }
            if (creativeMode) {
                mask = (byte)(mask | 8);
            }
            wrapper.write((Type)Types.BYTE, (Object)mask);
            wrapper.write((Type)Types.BYTE, (Object)12);
            wrapper.write((Type)Types.BYTE, (Object)25);
        });
        this.registerServerbound(ServerboundPackets1_3_1.CLIENT_PROTOCOL, ServerboundPackets1_2_4.HANDSHAKE, wrapper -> {
            wrapper.read((Type)Types.UNSIGNED_BYTE);
            String userName = (String)wrapper.read(Types1_6_4.STRING);
            String hostname = (String)wrapper.read(Types1_6_4.STRING);
            int port = (Integer)wrapper.read((Type)Types.INT);
            wrapper.write(Types1_6_4.STRING, (Object)(userName + ";" + hostname + ":" + port));
        });
        this.cancelServerbound(ServerboundPackets1_3_1.SHARED_KEY);
        this.registerServerbound(ServerboundPackets1_3_1.MOVE_PLAYER_POS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    AbstractTrackedEntity player = (AbstractTrackedEntity)entityTracker.getTrackedEntities().get(entityTracker.getPlayerID());
                    if ((Double)wrapper.get((Type)Types.DOUBLE, 1) == -999.0 && (Double)wrapper.get((Type)Types.DOUBLE, 2) == -999.0) {
                        player.setRiding(true);
                    } else {
                        player.setRiding(false);
                        player.getLocation().setX(((Double)wrapper.get((Type)Types.DOUBLE, 0)).doubleValue());
                        player.getLocation().setY(((Double)wrapper.get((Type)Types.DOUBLE, 1)).doubleValue());
                        player.getLocation().setZ(((Double)wrapper.get((Type)Types.DOUBLE, 3)).doubleValue());
                    }
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_3_1.MOVE_PLAYER_POS_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    AbstractTrackedEntity player = (AbstractTrackedEntity)entityTracker.getTrackedEntities().get(entityTracker.getPlayerID());
                    if ((Double)wrapper.get((Type)Types.DOUBLE, 1) == -999.0 && (Double)wrapper.get((Type)Types.DOUBLE, 2) == -999.0) {
                        player.setRiding(true);
                    } else {
                        player.setRiding(false);
                        player.getLocation().setX(((Double)wrapper.get((Type)Types.DOUBLE, 0)).doubleValue());
                        player.getLocation().setY(((Double)wrapper.get((Type)Types.DOUBLE, 1)).doubleValue());
                        player.getLocation().setZ(((Double)wrapper.get((Type)Types.DOUBLE, 3)).doubleValue());
                    }
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_3_1.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_7_6.ITEM, Types1_2_4.NBT_ITEM);
                this.read((Type)Types.UNSIGNED_BYTE);
                this.read((Type)Types.UNSIGNED_BYTE);
                this.read((Type)Types.UNSIGNED_BYTE);
            }
        });
        this.registerServerbound(ServerboundPackets1_3_1.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map(Types1_7_6.ITEM, Types1_2_4.NBT_ITEM);
            }
        });
        this.registerServerbound(ServerboundPackets1_3_1.PLAYER_ABILITIES, wrapper -> {
            byte mask = (Byte)wrapper.read((Type)Types.BYTE);
            wrapper.read((Type)Types.BYTE);
            wrapper.read((Type)Types.BYTE);
            boolean disableDamage = (mask & 1) > 0;
            boolean flying = (mask & 2) > 0;
            boolean allowFlying = (mask & 4) > 0;
            boolean creativeMode = (mask & 8) > 0;
            wrapper.write((Type)Types.BOOLEAN, (Object)disableDamage);
            wrapper.write((Type)Types.BOOLEAN, (Object)flying);
            wrapper.write((Type)Types.BOOLEAN, (Object)allowFlying);
            wrapper.write((Type)Types.BOOLEAN, (Object)creativeMode);
        });
        this.registerServerbound(ServerboundPackets1_3_1.CLIENT_COMMAND, ServerboundPackets1_2_4.RESPAWN, wrapper -> {
            byte action = (Byte)wrapper.read((Type)Types.BYTE);
            if (action != 1) {
                wrapper.cancel();
            }
            wrapper.write((Type)Types.INT, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
            wrapper.write(Types1_6_4.STRING, (Object)"");
        });
        this.cancelServerbound(ServerboundPackets1_3_1.COMMAND_SUGGESTION);
        this.cancelServerbound(ServerboundPackets1_3_1.CLIENT_INFORMATION);
    }

    public ItemRewriter getItemRewriter() {
        return this.itemRewriter;
    }

    private void handleEntityDataList(int entityId, List<EntityData> entityDataList, PacketWrapper wrapper) {
        EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
        if (entityId == tracker.getPlayerID()) {
            return;
        }
        AbstractTrackedEntity entity = (AbstractTrackedEntity)tracker.getTrackedEntities().get(entityId);
        for (EntityData entityData : entityDataList) {
            if (EntityDataIndex1_5_2.searchIndex((EntityTypes1_8.EntityType)entity.getEntityType(), (int)entityData.id()) != null) continue;
            EntityDataIndex1_7_6 index = EntityDataIndex1_7_6.searchIndex((EntityTypes1_8.EntityType)entity.getEntityType(), (int)entityData.id());
            if (index == EntityDataIndex1_7_6.ENTITY_FLAGS) {
                if (((Byte)entityData.value() & 4) != 0) {
                    Optional oNearbyEntity = tracker.getNearestEntity(entity.getLocation(), 1.0, e -> e.getEntityType().isOrHasParent((EntityType)EntityTypes1_8.EntityType.MINECART) || e.getEntityType().isOrHasParent((EntityType)EntityTypes1_8.EntityType.PIG) || e.getEntityType().isOrHasParent((EntityType)EntityTypes1_8.EntityType.BOAT));
                    if (!oNearbyEntity.isPresent()) break;
                    entity.setRiding(true);
                    AbstractTrackedEntity nearbyEntity = (AbstractTrackedEntity)oNearbyEntity.get();
                    PacketWrapper attachEntity = PacketWrapper.create((PacketType)ClientboundPackets1_3_1.SET_ENTITY_LINK, (UserConnection)wrapper.user());
                    attachEntity.write((Type)Types.INT, (Object)entityId);
                    attachEntity.write((Type)Types.INT, (Object)nearbyEntity.getEntityId());
                    wrapper.send(Protocolr1_2_4_5Tor1_3_1_2.class);
                    attachEntity.send(Protocolr1_2_4_5Tor1_3_1_2.class);
                    wrapper.cancel();
                    break;
                }
                if (((Byte)entityData.value() & 4) != 0 || !entity.isRiding()) break;
                entity.setRiding(false);
                PacketWrapper detachEntity = PacketWrapper.create((PacketType)ClientboundPackets1_3_1.SET_ENTITY_LINK, (UserConnection)wrapper.user());
                detachEntity.write((Type)Types.INT, (Object)entityId);
                detachEntity.write((Type)Types.INT, (Object)-1);
                detachEntity.send(Protocolr1_2_4_5Tor1_3_1_2.class);
                wrapper.send(Protocolr1_2_4_5Tor1_3_1_2.class);
                wrapper.cancel();
                break;
            }
            if (index != EntityDataIndex1_7_6.CREEPER_STATE || (Byte)entityData.value() <= 0) continue;
            tracker.playSoundAt(entity.getLocation(), Sound.RANDOM_FUSE, 1.0f, 0.5f);
        }
    }
}

