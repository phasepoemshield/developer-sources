/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntOpenHashMap
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ClientboundStatusPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundHandshakePackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundStatusPackets
 *  com.viaversion.viaversion.protocols.base.v1_7.ClientboundBaseProtocol1_7
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8
 *  com.viaversion.viaversion.util.IdAndData
 *  io.netty.channel.ChannelHandler
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.protocol.StatelessTransitionProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.api.util.GameProfileUtil
 *  net.raphimc.vialegacy.api.util.PacketUtil
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.rewriter.SoundRewriter
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.rewriter.StatisticRewriter
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.HandshakeStorage
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ProtocolMetadataStorage
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.StatisticsStorage
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.EntityDataTypes1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.Protocolr1_7_6_10Tor1_8
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.EntityDataTypes1_7_6
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntOpenHashMap;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ClientboundStatusPackets;
import com.viaversion.viaversion.protocols.base.ServerboundHandshakePackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundStatusPackets;
import com.viaversion.viaversion.protocols.base.v1_7.ClientboundBaseProtocol1_7;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.util.IdAndData;
import io.netty.channel.ChannelHandler;
import java.util.List;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.protocol.StatelessTransitionProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.api.util.GameProfileUtil;
import net.raphimc.vialegacy.api.util.PacketUtil;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.packet.ClientboundPackets1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.packet.ServerboundPackets1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.provider.EncryptionProvider;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.rewriter.ItemRewriter;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.rewriter.SoundRewriter;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.rewriter.StatisticRewriter;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.rewriter.TextRewriter;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.HandshakeStorage;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ProtocolMetadataStorage;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.StatisticsStorage;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.EntityDataTypes1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.packet.ClientboundPackets1_7_2;
import net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.packet.ServerboundPackets1_7_2;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.Protocolr1_7_6_10Tor1_8;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.EntityDataTypes1_7_6;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_6_4Tor1_7_2_5
extends StatelessTransitionProtocol<ClientboundPackets1_6_4, ClientboundPackets1_7_2, ServerboundPackets1_6_4, ServerboundPackets1_7_2> {
    private final ItemRewriter itemRewriter = new ItemRewriter(this);

    public Protocolr1_6_4Tor1_7_2_5() {
        super(ClientboundPackets1_6_4.class, ClientboundPackets1_7_2.class, ServerboundPackets1_6_4.class, ServerboundPackets1_7_2.class);
    }

    public void register(ViaProviders providers) {
        providers.require(EncryptionProvider.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolr1_6_4Tor1_7_2_5.class, ClientboundPackets1_6_4::getPacket));
        userConnection.addClientWorld(Protocolr1_6_4Tor1_7_2_5.class, new ClientWorld());
        userConnection.put((StorableObject)new ProtocolMetadataStorage());
        userConnection.put((StorableObject)new PlayerInfoStorage());
        userConnection.put((StorableObject)new StatisticsStorage());
        userConnection.put((StorableObject)new ChunkTracker(userConnection));
        if (userConnection.getChannel() != null) {
            userConnection.getChannel().pipeline().addFirst(new ChannelHandler[]{new /* Unavailable Anonymous Inner Class!! */});
        }
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientboundTransition(ClientboundPackets1_6_4.LOGIN, new Object[]{ClientboundPackets1_7_2.LOGIN, new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ((PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class)).entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    String terrainType = (String)wrapper.read(Types1_6_4.STRING);
                    short gameType = ((Byte)wrapper.read((Type)Types.BYTE)).byteValue();
                    byte dimension = (Byte)wrapper.read((Type)Types.BYTE);
                    short difficulty = ((Byte)wrapper.read((Type)Types.BYTE)).byteValue();
                    wrapper.read((Type)Types.BYTE);
                    short maxPlayers = ((Byte)wrapper.read((Type)Types.BYTE)).byteValue();
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)gameType);
                    wrapper.write((Type)Types.BYTE, (Object)dimension);
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)difficulty);
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)maxPlayers);
                    wrapper.write(Types.STRING, (Object)terrainType);
                });
                this.handler(wrapper -> {
                    byte dimensionId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    wrapper.user().getClientWorld(Protocolr1_6_4Tor1_7_2_5.class).setEnvironment((int)dimensionId);
                    wrapper.user().put((StorableObject)new ChunkTracker(wrapper.user()));
                });
            }
        }, State.LOGIN, wrapper -> {
            ViaLegacy.getPlatform().getLogger().warning("Server skipped LOGIN state");
            PacketWrapper sharedKey = PacketWrapper.create((PacketType)ClientboundPackets1_6_4.SHARED_KEY, (UserConnection)wrapper.user());
            sharedKey.write(Types.SHORT_BYTE_ARRAY, (Object)new byte[0]);
            sharedKey.write(Types.SHORT_BYTE_ARRAY, (Object)new byte[0]);
            ((ProtocolMetadataStorage)wrapper.user().get(ProtocolMetadataStorage.class)).skipEncryption = true;
            sharedKey.send(Protocolr1_6_4Tor1_7_2_5.class, false);
            ((ProtocolMetadataStorage)wrapper.user().get(ProtocolMetadataStorage.class)).skipEncryption = false;
            wrapper.setPacketType((PacketType)ClientboundPackets1_6_4.LOGIN);
            wrapper.send(Protocolr1_6_4Tor1_7_2_5.class, false);
            wrapper.cancel();
        }});
        this.registerClientbound(ClientboundPackets1_6_4.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types.STRING, TextRewriter::toClient);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.SET_EQUIPPED_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.SHORT);
                this.map(Types1_7_6.ITEM);
                this.handler(wrapper -> Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.get(Types1_7_6.ITEM, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE);
                this.read((Type)Types.SHORT);
                this.map(Types1_6_4.STRING, Types.STRING);
                this.handler(wrapper -> {
                    if (wrapper.user().getClientWorld(Protocolr1_6_4Tor1_7_2_5.class).setEnvironment(((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).clear();
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.MOVE_PLAYER_STATUS_ONLY, ClientboundPackets1_7_2.PLAYER_POSITION, wrapper -> {
            PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class);
            boolean supportsFlags = wrapper.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_8);
            wrapper.write((Type)Types.DOUBLE, (Object)(supportsFlags ? 0.0 : playerInfoStorage.posX));
            wrapper.write((Type)Types.DOUBLE, (Object)(supportsFlags ? 0.0 : playerInfoStorage.posY + (double)1.62f));
            wrapper.write((Type)Types.DOUBLE, (Object)(supportsFlags ? 0.0 : playerInfoStorage.posZ));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(supportsFlags ? 0.0f : playerInfoStorage.yaw));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(supportsFlags ? 0.0f : playerInfoStorage.pitch));
            if (supportsFlags) {
                wrapper.read((Type)Types.BOOLEAN);
                wrapper.write((Type)Types.BYTE, (Object)31);
                wrapper.setPacketType((PacketType)ClientboundPackets1_8.PLAYER_POSITION);
                wrapper.send(Protocolr1_7_6_10Tor1_8.class);
                wrapper.cancel();
            } else {
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
            PacketWrapper setVelocityToZero = PacketWrapper.create((PacketType)ClientboundPackets1_7_2.SET_ENTITY_MOTION, (UserConnection)wrapper.user());
            setVelocityToZero.write((Type)Types.INT, (Object)playerInfoStorage.entityId);
            setVelocityToZero.write((Type)Types.SHORT, (Object)0);
            setVelocityToZero.write((Type)Types.SHORT, (Object)0);
            setVelocityToZero.write((Type)Types.SHORT, (Object)0);
            if (!wrapper.isCancelled()) {
                wrapper.send(Protocolr1_6_4Tor1_7_2_5.class);
            }
            setVelocityToZero.send(Protocolr1_6_4Tor1_7_2_5.class);
            wrapper.cancel();
        });
        this.registerClientbound(ClientboundPackets1_6_4.MOVE_PLAYER_POS, ClientboundPackets1_7_2.PLAYER_POSITION, wrapper -> {
            PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class);
            boolean supportsFlags = wrapper.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_8);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.read((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(supportsFlags ? 0.0f : playerInfoStorage.yaw));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(supportsFlags ? 0.0f : playerInfoStorage.pitch));
            if (supportsFlags) {
                wrapper.read((Type)Types.BOOLEAN);
                wrapper.write((Type)Types.BYTE, (Object)24);
                wrapper.setPacketType((PacketType)ClientboundPackets1_8.PLAYER_POSITION);
                wrapper.send(Protocolr1_7_6_10Tor1_8.class);
                wrapper.cancel();
            } else {
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.MOVE_PLAYER_ROT, ClientboundPackets1_7_2.PLAYER_POSITION, wrapper -> {
            PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class);
            boolean supportsFlags = wrapper.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_8);
            wrapper.write((Type)Types.DOUBLE, (Object)(supportsFlags ? 0.0 : playerInfoStorage.posX));
            wrapper.write((Type)Types.DOUBLE, (Object)(supportsFlags ? 0.0 : playerInfoStorage.posY + (double)1.62f));
            wrapper.write((Type)Types.DOUBLE, (Object)(supportsFlags ? 0.0 : playerInfoStorage.posZ));
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            if (supportsFlags) {
                wrapper.read((Type)Types.BOOLEAN);
                wrapper.write((Type)Types.BYTE, (Object)7);
                wrapper.setPacketType((PacketType)ClientboundPackets1_8.PLAYER_POSITION);
                wrapper.send(Protocolr1_7_6_10Tor1_8.class);
                wrapper.cancel();
            } else {
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
            PacketWrapper setVelocityToZero = PacketWrapper.create((PacketType)ClientboundPackets1_7_2.SET_ENTITY_MOTION, (UserConnection)wrapper.user());
            setVelocityToZero.write((Type)Types.INT, (Object)playerInfoStorage.entityId);
            setVelocityToZero.write((Type)Types.SHORT, (Object)0);
            setVelocityToZero.write((Type)Types.SHORT, (Object)0);
            setVelocityToZero.write((Type)Types.SHORT, (Object)0);
            if (!wrapper.isCancelled()) {
                wrapper.send(Protocolr1_6_4Tor1_7_2_5.class);
            }
            setVelocityToZero.send(Protocolr1_6_4Tor1_7_2_5.class);
            wrapper.cancel();
        });
        this.registerClientbound(ClientboundPackets1_6_4.PLAYER_POSITION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.read((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.SET_CARRIED_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.SHORT, (Type)Types.BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.PLAYER_SLEEP, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    if ((Byte)wrapper.read((Type)Types.BYTE) != 0) {
                        wrapper.cancel();
                    }
                });
                this.map(Types1_7_6.BLOCK_POSITION_BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.ANIMATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    short animate = ((Byte)wrapper.read((Type)Types.BYTE)).byteValue();
                    if (animate == 0 || animate == 4) {
                        wrapper.cancel();
                    }
                    animate = animate >= 1 && animate <= 3 ? (short)(animate - 1) : (short)(animate - 2);
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)animate);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    String name = (String)wrapper.read(Types1_6_4.STRING);
                    wrapper.write(Types.STRING, (Object)(ViaLegacy.getConfig().isLegacySkinLoading() ? ((GameProfileFetcher)Via.getManager().getProviders().get(GameProfileFetcher.class)).getMojangUuid(name) : GameProfileUtil.getOfflinePlayerUuid((String)name)).toString().replace("-", ""));
                    wrapper.write(Types.STRING, (Object)name);
                });
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    DataItem currentItem = new DataItem(((Integer)wrapper.read((Type)Types.UNSIGNED_SHORT)).intValue(), 1, 0, null);
                    Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToClient(wrapper.user(), (Item)currentItem);
                    wrapper.write((Type)Types.SHORT, (Object)((short)currentItem.identifier()));
                });
                this.map(Types1_6_4.ENTITY_DATA_LIST, Types1_7_6.ENTITY_DATA_LIST);
                this.handler(wrapper -> Protocolr1_6_4Tor1_7_2_5.this.rewriteEntityData(wrapper.user(), (List)wrapper.get(Types1_7_6.ENTITY_DATA_LIST, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    byte typeID = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 3);
                    if (typeID == EntityTypes1_8.ObjectType.FALLING_BLOCK.getId()) {
                        int id = data & 0xFFFF;
                        int metadata = data >> 16;
                        IdAndData block = new IdAndData(id, metadata);
                        ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).remapBlockParticle(block);
                        data = block.getId() & 0xFFFF | block.getData() << 16;
                    }
                    wrapper.set((Type)Types.INT, 3, (Object)data);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map(Types1_6_4.ENTITY_DATA_LIST, Types1_7_6.ENTITY_DATA_LIST);
                this.handler(wrapper -> Protocolr1_6_4Tor1_7_2_5.this.rewriteEntityData(wrapper.user(), (List)wrapper.get(Types1_7_6.ENTITY_DATA_LIST, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.ADD_PAINTING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map(Types1_7_6.BLOCK_POSITION_INT);
                this.map((Type)Types.INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.ADD_EXPERIENCE_ORB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.SHORT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.SET_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.ENTITY_DATA_LIST, Types1_7_6.ENTITY_DATA_LIST);
                this.handler(wrapper -> Protocolr1_6_4Tor1_7_2_5.this.rewriteEntityData(wrapper.user(), (List)wrapper.get(Types1_7_6.ENTITY_DATA_LIST, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.UPDATE_ATTRIBUTES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int amount = (Integer)wrapper.passthrough((Type)Types.INT);
                    for (int i = 0; i < amount; ++i) {
                        wrapper.write(Types.STRING, (Object)((String)wrapper.read(Types1_6_4.STRING)));
                        wrapper.passthrough((Type)Types.DOUBLE);
                        int modifierCount = ((Short)wrapper.passthrough((Type)Types.SHORT)).shortValue();
                        for (int x = 0; x < modifierCount; ++x) {
                            wrapper.passthrough(Types.UUID);
                            wrapper.passthrough((Type)Types.DOUBLE);
                            wrapper.passthrough((Type)Types.BYTE);
                        }
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.LEVEL_CHUNK, wrapper -> {
            Chunk chunk = (Chunk)wrapper.passthrough(Types1_7_6.getChunk((Environment)wrapper.user().getClientWorld(Protocolr1_6_4Tor1_7_2_5.class).getEnvironment()));
            ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).trackAndRemap(chunk);
        });
        this.registerClientbound(ClientboundPackets1_6_4.CHUNK_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map(Types1_7_6.BLOCK_CHANGE_RECORD_ARRAY);
                this.handler(wrapper -> {
                    BlockChangeRecord[] blockChangeRecords;
                    int chunkX = (Integer)wrapper.get((Type)Types.INT, 0);
                    int chunkZ = (Integer)wrapper.get((Type)Types.INT, 1);
                    for (BlockChangeRecord record : blockChangeRecords = (BlockChangeRecord[])wrapper.get(Types1_7_6.BLOCK_CHANGE_RECORD_ARRAY, 0)) {
                        int targetX = record.getSectionX() + (chunkX << 4);
                        short targetY = record.getY(-1);
                        int targetZ = record.getSectionZ() + (chunkZ << 4);
                        IdAndData block = IdAndData.fromRawData((int)record.getBlockId());
                        BlockPosition pos = new BlockPosition(targetX, (int)targetY, targetZ);
                        ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).trackAndRemap(pos, block);
                        record.setBlockId(block.toRawData());
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_SHORT, (Type)Types.VAR_INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    BlockPosition pos = (BlockPosition)wrapper.get(Types1_7_6.BLOCK_POSITION_UBYTE, 0);
                    int blockId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    short data = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    IdAndData block = new IdAndData(blockId, (int)data);
                    ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).trackAndRemap(pos, block);
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)block.getId());
                    wrapper.set((Type)Types.UNSIGNED_BYTE, 0, (Object)block.getData());
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.BLOCK_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT);
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.SHORT, (Type)Types.VAR_INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.BLOCK_DESTRUCTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.map(Types1_7_6.BLOCK_POSITION_INT);
                this.map((Type)Types.BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.MAP_BULK_CHUNK, wrapper -> {
            Chunk[] chunks;
            for (Chunk chunk : chunks = (Chunk[])wrapper.passthrough(Types1_7_6.CHUNK_BULK)) {
                ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).trackAndRemap(chunk);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int x = ((Float)wrapper.get((Type)Types.FLOAT, 0)).intValue();
                    int y = ((Float)wrapper.get((Type)Types.FLOAT, 1)).intValue();
                    int z = ((Float)wrapper.get((Type)Types.FLOAT, 2)).intValue();
                    int recordCount = (Integer)wrapper.get((Type)Types.INT, 0);
                    ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
                    for (int i = 0; i < recordCount; ++i) {
                        BlockPosition pos = new BlockPosition(x + (Byte)wrapper.passthrough((Type)Types.BYTE), y + (Byte)wrapper.passthrough((Type)Types.BYTE), z + (Byte)wrapper.passthrough((Type)Types.BYTE));
                        chunkTracker.trackAndRemap(pos, new IdAndData(0, 0));
                    }
                });
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String oldSound = (String)wrapper.read(Types1_6_4.STRING);
                    String newSound = SoundRewriter.map((String)oldSound);
                    if (oldSound.isEmpty()) {
                        newSound = "";
                    }
                    if (newSound == null) {
                        if (Via.getConfig().logOtherConversionWarnings()) {
                            ViaLegacy.getPlatform().getLogger().warning("Unable to map 1.6.4 sound '" + oldSound + "'");
                        }
                        newSound = "";
                    }
                    if (newSound.isEmpty()) {
                        wrapper.cancel();
                        return;
                    }
                    wrapper.write(Types.STRING, (Object)newSound);
                });
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.UNSIGNED_BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int effectId = (Integer)wrapper.get((Type)Types.INT, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 1);
                    boolean disableRelativeVolume = (Boolean)wrapper.get((Type)Types.BOOLEAN, 0);
                    if (!disableRelativeVolume && effectId == 2001) {
                        ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
                        int blockID = data & 0xFFF;
                        int blockData = data >> 12 & 0xFF;
                        IdAndData block = new IdAndData(blockID, blockData);
                        chunkTracker.remapBlockParticle(block);
                        data = block.getId() & 0xFFF | block.getData() << 12;
                        wrapper.set((Type)Types.INT, 1, (Object)data);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    CharSequence[] parts = ((String)wrapper.get(Types.STRING, 0)).split("_", 3);
                    if (parts[0].equals("tilecrack")) {
                        parts[0] = "blockcrack";
                    }
                    if (parts[0].equals("blockcrack") || parts[0].equals("blockdust")) {
                        int id = Integer.parseInt(parts[1]);
                        int metadata = Integer.parseInt(parts[2]);
                        IdAndData block = new IdAndData(id, metadata);
                        ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).remapBlockParticle(block);
                        parts[1] = String.valueOf(block.getId());
                        parts[2] = String.valueOf(block.getData());
                    }
                    wrapper.set(Types.STRING, 0, (Object)String.join((CharSequence)"_", parts));
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.GAME_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE, (Type)Types.FLOAT);
                this.handler(wrapper -> {
                    short gameState = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (gameState == 1) {
                        PacketWrapper startRain = PacketWrapper.create((PacketType)ClientboundPackets1_7_2.GAME_EVENT, (UserConnection)wrapper.user());
                        startRain.write((Type)Types.UNSIGNED_BYTE, (Object)7);
                        startRain.write((Type)Types.FLOAT, (Object)Float.valueOf(1.0f));
                        wrapper.send(Protocolr1_6_4Tor1_7_2_5.class);
                        startRain.send(Protocolr1_6_4Tor1_7_2_5.class);
                        wrapper.cancel();
                    } else if (gameState == 2) {
                        PacketWrapper stopRain = PacketWrapper.create((PacketType)ClientboundPackets1_7_2.GAME_EVENT, (UserConnection)wrapper.user());
                        stopRain.write((Type)Types.UNSIGNED_BYTE, (Object)7);
                        stopRain.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                        wrapper.send(Protocolr1_6_4Tor1_7_2_5.class);
                        stopRain.send(Protocolr1_6_4Tor1_7_2_5.class);
                        wrapper.cancel();
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.ADD_GLOBAL_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BOOLEAN);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.CONTAINER_CLOSE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.CONTAINER_SET_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types1_7_6.ITEM);
                this.handler(wrapper -> Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.get(Types1_7_6.ITEM, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.CONTAINER_SET_CONTENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    Item[] items;
                    for (Item item : items = (Item[])wrapper.passthrough(Types1_7_6.ITEM_ARRAY)) {
                        Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToClient(wrapper.user(), item);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.UPDATE_SIGN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT);
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map(Types1_6_4.STRING, Types.STRING);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read((Type)Types.SHORT);
                this.map((Type)Types.SHORT, (Type)Types.VAR_INT);
                this.map(Types.SHORT_BYTE_ARRAY);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT);
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE);
                this.map(Types1_7_6.NBT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.OPEN_SIGN_EDITOR, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read((Type)Types.BYTE);
                this.map(Types1_7_6.BLOCK_POSITION_INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.AWARD_STATS, wrapper -> {
            wrapper.cancel();
            StatisticsStorage statisticsStorage = (StatisticsStorage)wrapper.user().get(StatisticsStorage.class);
            int statId = (Integer)wrapper.read((Type)Types.INT);
            int increment = (Integer)wrapper.read((Type)Types.INT);
            statisticsStorage.values.put(statId, statisticsStorage.values.get(statId) + increment);
        });
        this.registerClientbound(ClientboundPackets1_6_4.PLAYER_INFO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.SHORT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.COMMAND_SUGGESTIONS, wrapper -> {
            String completions = (String)wrapper.read(Types1_6_4.STRING);
            String[] completionsArray = completions.split("\u0000");
            wrapper.write((Type)Types.VAR_INT, (Object)completionsArray.length);
            for (String s : completionsArray) {
                wrapper.write(Types.STRING, (Object)s);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.SET_OBJECTIVE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map((Type)Types.BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.SET_SCORE, wrapper -> {
            wrapper.write(Types.STRING, (Object)((String)wrapper.read(Types1_6_4.STRING)));
            byte mode = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (mode == 0) {
                wrapper.write(Types.STRING, (Object)((String)wrapper.read(Types1_6_4.STRING)));
                wrapper.passthrough((Type)Types.INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.SET_DISPLAY_OBJECTIVE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map(Types1_6_4.STRING, Types.STRING);
            }
        });
        this.registerClientbound(ClientboundPackets1_6_4.SET_PLAYER_TEAM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types.STRING);
                this.handler(wrapper -> {
                    byte mode = (Byte)wrapper.passthrough((Type)Types.BYTE);
                    if (mode == 0 || mode == 2) {
                        wrapper.write(Types.STRING, (Object)((String)wrapper.read(Types1_6_4.STRING)));
                        wrapper.write(Types.STRING, (Object)((String)wrapper.read(Types1_6_4.STRING)));
                        wrapper.write(Types.STRING, (Object)((String)wrapper.read(Types1_6_4.STRING)));
                        wrapper.passthrough((Type)Types.BYTE);
                    }
                    if (mode == 0 || mode == 3 || mode == 4) {
                        int count = ((Short)wrapper.passthrough((Type)Types.SHORT)).shortValue();
                        for (int i = 0; i < count; ++i) {
                            wrapper.write(Types.STRING, (Object)((String)wrapper.read(Types1_6_4.STRING)));
                        }
                    }
                });
            }
        });
        this.registerClientboundTransition(ClientboundPackets1_6_4.CUSTOM_PAYLOAD, new Object[]{ClientboundPackets1_7_2.CUSTOM_PAYLOAD, new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String channel = (String)wrapper.read(Types1_6_4.STRING);
                    int length = ((Short)wrapper.read((Type)Types.SHORT)).shortValue();
                    if (length < 0) {
                        wrapper.write(Types.STRING, (Object)channel);
                        wrapper.write((Type)Types.UNSIGNED_SHORT, (Object)0);
                        return;
                    }
                    try {
                        if (channel.equals("MC|TrList")) {
                            wrapper.passthrough((Type)Types.INT);
                            int count = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
                            for (int i = 0; i < count; ++i) {
                                Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types1_7_6.ITEM));
                                Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types1_7_6.ITEM));
                                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                                    Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types1_7_6.ITEM));
                                }
                                wrapper.passthrough((Type)Types.BOOLEAN);
                            }
                            length = PacketUtil.calculateLength((PacketWrapper)wrapper);
                        }
                    }
                    catch (Exception e) {
                        if (Via.getConfig().logOtherConversionWarnings()) {
                            Via.getPlatform().getLogger().log(Level.WARNING, "Failed to handle packet", e);
                        }
                        wrapper.cancel();
                        return;
                    }
                    wrapper.resetReader();
                    wrapper.write(Types.STRING, (Object)channel);
                    wrapper.write((Type)Types.UNSIGNED_SHORT, (Object)length);
                });
            }
        }, State.LOGIN, PacketWrapper::cancel});
        this.registerClientboundTransition(ClientboundPackets1_6_4.SHARED_KEY, new Object[]{ClientboundLoginPackets.LOGIN_FINISHED, wrapper -> {
            ProtocolInfo info = wrapper.user().getProtocolInfo();
            ProtocolMetadataStorage protocolMetadata = (ProtocolMetadataStorage)wrapper.user().get(ProtocolMetadataStorage.class);
            wrapper.read(Types.SHORT_BYTE_ARRAY);
            wrapper.read(Types.SHORT_BYTE_ARRAY);
            wrapper.write(Types.STRING, (Object)info.getUuid().toString().replace("-", ""));
            wrapper.write(Types.STRING, (Object)info.getUsername());
            if (!protocolMetadata.skipEncryption) {
                ((EncryptionProvider)Via.getManager().getProviders().get(EncryptionProvider.class)).enableDecryption(wrapper.user());
            }
            ClientboundBaseProtocol1_7.onLoginSuccess((UserConnection)wrapper.user());
            PacketWrapper respawn = PacketWrapper.create((PacketType)ServerboundPackets1_6_4.CLIENT_COMMAND, (UserConnection)wrapper.user());
            respawn.write((Type)Types.BYTE, (Object)0);
            respawn.sendToServer(Protocolr1_6_4Tor1_7_2_5.class);
        }});
        this.registerClientboundTransition(ClientboundPackets1_6_4.SERVER_AUTH_DATA, new Object[]{ClientboundLoginPackets.HELLO, new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types.STRING);
                this.map(Types.SHORT_BYTE_ARRAY);
                this.map(Types.SHORT_BYTE_ARRAY);
                this.handler(wrapper -> {
                    ProtocolMetadataStorage protocolMetadata = (ProtocolMetadataStorage)wrapper.user().get(ProtocolMetadataStorage.class);
                    String serverHash = (String)wrapper.get(Types.STRING, 0);
                    protocolMetadata.authenticate = !serverHash.equals("-");
                });
            }
        }});
        this.registerClientboundTransition(ClientboundPackets1_6_4.DISCONNECT, new Object[]{ClientboundStatusPackets.STATUS_RESPONSE, wrapper -> {
            String reason = (String)wrapper.read(Types1_6_4.STRING);
            try {
                String[] motdParts = reason.split("\u0000");
                JsonObject rootObject = new JsonObject();
                JsonObject descriptionObject = new JsonObject();
                JsonObject playersObject = new JsonObject();
                JsonObject versionObject = new JsonObject();
                descriptionObject.addProperty("text", motdParts[3]);
                playersObject.addProperty("max", (Number)Integer.parseInt(motdParts[5]));
                playersObject.addProperty("online", (Number)Integer.parseInt(motdParts[4]));
                versionObject.addProperty("name", motdParts[2]);
                versionObject.addProperty("protocol", (Number)Integer.parseInt(motdParts[1]));
                rootObject.add("description", (JsonElement)descriptionObject);
                rootObject.add("players", (JsonElement)playersObject);
                rootObject.add("version", (JsonElement)versionObject);
                wrapper.write(Types.STRING, (Object)rootObject.toString());
            }
            catch (Throwable e) {
                ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Could not parse 1.6.4 ping: " + reason, e);
                wrapper.cancel();
            }
        }, ClientboundLoginPackets.LOGIN_DISCONNECT, new PacketHandlers(){

            protected void register() {
                this.map(Types1_6_4.STRING, Types.STRING, TextRewriter::toClientDisconnect);
            }
        }, ClientboundPackets1_7_2.DISCONNECT, new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types.STRING, TextRewriter::toClientDisconnect);
            }
        }});
        this.cancelClientbound(ClientboundPackets1_6_4.SET_CREATIVE_MODE_SLOT);
        this.registerServerboundTransition((ServerboundPacketType)ServerboundHandshakePackets.CLIENT_INTENTION, null, wrapper -> {
            wrapper.cancel();
            wrapper.read((Type)Types.VAR_INT);
            String hostname = (String)wrapper.read(Types.STRING);
            int port = (Integer)wrapper.read((Type)Types.UNSIGNED_SHORT);
            wrapper.user().put((StorableObject)new HandshakeStorage(hostname, port));
        });
        this.registerServerboundTransition((ServerboundPacketType)ServerboundStatusPackets.STATUS_REQUEST, ServerboundPackets1_6_4.SERVER_PING, wrapper -> {
            HandshakeStorage handshakeStorage = (HandshakeStorage)wrapper.user().get(HandshakeStorage.class);
            String ip = handshakeStorage.getHostname();
            int port = handshakeStorage.getPort();
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)1);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)ServerboundPackets1_6_4.CUSTOM_PAYLOAD.getId()));
            wrapper.write(Types1_6_4.STRING, (Object)"MC|PingHost");
            wrapper.write((Type)Types.SHORT, (Object)((short)(3 + 2 * ip.length() + 4)));
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)wrapper.user().getProtocolInfo().serverProtocolVersion().getVersion()));
            wrapper.write(Types1_6_4.STRING, (Object)ip);
            wrapper.write((Type)Types.INT, (Object)port);
        });
        this.registerServerboundTransition((ServerboundPacketType)ServerboundStatusPackets.PING_REQUEST, null, wrapper -> {
            wrapper.cancel();
            PacketWrapper pong = PacketWrapper.create((PacketType)ClientboundStatusPackets.PONG_RESPONSE, (UserConnection)wrapper.user());
            pong.write((Type)Types.LONG, (Object)((Long)wrapper.read((Type)Types.LONG)));
            pong.send(Protocolr1_6_4Tor1_7_2_5.class);
        });
        this.registerServerboundTransition((ServerboundPacketType)ServerboundLoginPackets.HELLO, ServerboundPackets1_6_4.CLIENT_PROTOCOL, wrapper -> {
            HandshakeStorage handshakeStorage = (HandshakeStorage)wrapper.user().get(HandshakeStorage.class);
            String name = (String)wrapper.read(Types.STRING);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)wrapper.user().getProtocolInfo().serverProtocolVersion().getVersion()));
            wrapper.write(Types1_6_4.STRING, (Object)name);
            wrapper.write(Types1_6_4.STRING, (Object)handshakeStorage.getHostname());
            wrapper.write((Type)Types.INT, (Object)handshakeStorage.getPort());
            ProtocolInfo info = wrapper.user().getProtocolInfo();
            if (info.getUsername() == null) {
                info.setUsername(name);
            }
            if (info.getUuid() == null) {
                info.setUuid(ViaLegacy.getConfig().isLegacySkinLoading() ? ((GameProfileFetcher)Via.getManager().getProviders().get(GameProfileFetcher.class)).getMojangUuid(name) : GameProfileUtil.getOfflinePlayerUuid((String)name));
            }
        });
        this.registerServerboundTransition((ServerboundPacketType)ServerboundLoginPackets.ENCRYPTION_KEY, ServerboundPackets1_6_4.SHARED_KEY, null);
        this.registerServerbound(ServerboundPackets1_7_2.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING, Types1_6_4.STRING);
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.INTERACT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> wrapper.write((Type)Types.INT, (Object)((PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class)).entityId));
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.MOVE_PLAYER_STATUS_ONLY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    ((PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class)).onGround = (Boolean)wrapper.get((Type)Types.BOOLEAN, 0);
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.MOVE_PLAYER_POS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class);
                    playerInfoStorage.posX = (Double)wrapper.get((Type)Types.DOUBLE, 0);
                    playerInfoStorage.posY = (Double)wrapper.get((Type)Types.DOUBLE, 1);
                    playerInfoStorage.posZ = (Double)wrapper.get((Type)Types.DOUBLE, 3);
                    playerInfoStorage.onGround = (Boolean)wrapper.get((Type)Types.BOOLEAN, 0);
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.MOVE_PLAYER_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class);
                    playerInfoStorage.yaw = ((Float)wrapper.get((Type)Types.FLOAT, 0)).floatValue();
                    playerInfoStorage.pitch = ((Float)wrapper.get((Type)Types.FLOAT, 1)).floatValue();
                    playerInfoStorage.onGround = (Boolean)wrapper.get((Type)Types.BOOLEAN, 0);
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.MOVE_PLAYER_POS_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class);
                    playerInfoStorage.posX = (Double)wrapper.get((Type)Types.DOUBLE, 0);
                    playerInfoStorage.posY = (Double)wrapper.get((Type)Types.DOUBLE, 1);
                    playerInfoStorage.posZ = (Double)wrapper.get((Type)Types.DOUBLE, 3);
                    playerInfoStorage.yaw = ((Float)wrapper.get((Type)Types.FLOAT, 0)).floatValue();
                    playerInfoStorage.pitch = ((Float)wrapper.get((Type)Types.FLOAT, 1)).floatValue();
                    playerInfoStorage.onGround = (Boolean)wrapper.get((Type)Types.BOOLEAN, 0);
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_7_6.ITEM);
                this.handler(wrapper -> Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToServer(wrapper.user(), (Item)wrapper.get(Types1_7_6.ITEM, 0)));
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map(Types1_7_6.ITEM);
                this.handler(wrapper -> Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToServer(wrapper.user(), (Item)wrapper.get(Types1_7_6.ITEM, 0)));
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.SIGN_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT);
                this.map(Types.STRING, Types1_6_4.STRING);
                this.map(Types.STRING, Types1_6_4.STRING);
                this.map(Types.STRING, Types1_6_4.STRING);
                this.map(Types.STRING, Types1_6_4.STRING);
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.COMMAND_SUGGESTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING, Types1_6_4.STRING);
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING, Types1_6_4.STRING);
                this.handler(wrapper -> {
                    byte renderDistance = (Byte)wrapper.read((Type)Types.BYTE);
                    renderDistance = renderDistance <= 2 ? (byte)3 : (renderDistance <= 4 ? (byte)2 : (renderDistance <= 8 ? (byte)1 : (byte)0));
                    wrapper.write((Type)Types.BYTE, (Object)renderDistance);
                    byte chatVisibility = (Byte)wrapper.read((Type)Types.BYTE);
                    boolean enableColors = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    byte mask = (byte)(chatVisibility | (enableColors ? 1 : 0) << 3);
                    wrapper.write((Type)Types.BYTE, (Object)mask);
                });
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
            }
        });
        this.registerServerbound(ServerboundPackets1_7_2.CLIENT_COMMAND, wrapper -> {
            int action = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (action == 1) {
                Object2IntOpenHashMap loadedStatistics = new Object2IntOpenHashMap();
                for (Int2IntMap.Entry entry : ((StatisticsStorage)wrapper.user().get(StatisticsStorage.class)).values.int2IntEntrySet()) {
                    String key = StatisticRewriter.map((int)entry.getIntKey());
                    if (key == null) continue;
                    loadedStatistics.put((Object)key, entry.getIntValue());
                }
                PacketWrapper statistics = PacketWrapper.create((PacketType)ClientboundPackets1_8.AWARD_STATS, (UserConnection)wrapper.user());
                statistics.write((Type)Types.VAR_INT, (Object)loadedStatistics.size());
                for (Object2IntMap.Entry entry : loadedStatistics.object2IntEntrySet()) {
                    statistics.write(Types.STRING, (Object)((String)entry.getKey()));
                    statistics.write((Type)Types.VAR_INT, (Object)entry.getIntValue());
                }
                statistics.send(Protocolr1_6_4Tor1_7_2_5.class);
            }
            if (action != 0) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.BYTE, (Object)1);
        });
        this.registerServerbound(ServerboundPackets1_7_2.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String channel = (String)wrapper.read(Types.STRING);
                    short length = (Short)wrapper.read((Type)Types.SHORT);
                    switch (channel) {
                        case "MC|BEdit": 
                        case "MC|BSign": {
                            Protocolr1_6_4Tor1_7_2_5.this.itemRewriter.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types1_7_6.ITEM));
                            length = (short)PacketUtil.calculateLength((PacketWrapper)wrapper);
                            break;
                        }
                        case "MC|AdvCdm": {
                            byte type = (Byte)wrapper.read((Type)Types.BYTE);
                            if (type != 0) {
                                wrapper.cancel();
                                return;
                            }
                            wrapper.passthrough((Type)Types.INT);
                            wrapper.passthrough((Type)Types.INT);
                            wrapper.passthrough((Type)Types.INT);
                            wrapper.passthrough(Types.STRING);
                            length = (short)PacketUtil.calculateLength((PacketWrapper)wrapper);
                        }
                    }
                    wrapper.resetReader();
                    wrapper.write(Types1_6_4.STRING, (Object)channel);
                    wrapper.write((Type)Types.SHORT, (Object)length);
                });
            }
        });
    }

    public ItemRewriter getItemRewriter() {
        return this.itemRewriter;
    }

    private void rewriteEntityData(UserConnection user, List<EntityData> entityDataList) {
        for (EntityData entityData : entityDataList) {
            if (entityData.dataType().equals(EntityDataTypes1_6_4.ITEM)) {
                this.itemRewriter.handleItemToClient(user, (Item)entityData.value());
            }
            entityData.setDataType((EntityDataType)EntityDataTypes1_7_6.byId((int)entityData.dataType().typeId()));
        }
    }
}

