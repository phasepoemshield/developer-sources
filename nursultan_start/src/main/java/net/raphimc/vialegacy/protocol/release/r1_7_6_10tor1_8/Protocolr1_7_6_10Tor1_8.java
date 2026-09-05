/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.GameProfile
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$ObjectType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.BulkChunkType1_8
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_8
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_8
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.data.ItemList1_6
 *  net.raphimc.vialegacy.api.util.GameProfileUtil
 *  net.raphimc.vialegacy.api.util.PacketUtil
 *  net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.packet.ClientboundPackets1_7_2
 *  net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.packet.ServerboundPackets1_7_2
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.Particle1_7_6
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.model.MapData
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.model.MapIcon
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.model.TabListEntry
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.ChunkTracker
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.EntityTracker
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.MapStorage
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.TablistStorage
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.WindowTracker
 */
package net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8;

import com.google.common.base.Joiner;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.BulkChunkType1_8;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_8;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_8;
import com.viaversion.viaversion.util.IdAndData;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.data.ItemList1_6;
import net.raphimc.vialegacy.api.util.GameProfileUtil;
import net.raphimc.vialegacy.api.util.PacketUtil;
import net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.packet.ClientboundPackets1_7_2;
import net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.packet.ServerboundPackets1_7_2;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.Particle1_7_6;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.model.MapData;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.model.MapIcon;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.model.TabListEntry;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.rewriter.EntityDataRewriter;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.rewriter.ItemRewriter;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.rewriter.TextRewriter;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.ChunkTracker;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.EntityTracker;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.MapStorage;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.TablistStorage;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.WindowTracker;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_7_6_10Tor1_8
extends AbstractProtocol<ClientboundPackets1_7_2, ClientboundPackets1_8, ServerboundPackets1_7_2, ServerboundPackets1_8> {
    private final ItemRewriter itemRewriter = new ItemRewriter(this);
    private final TextRewriter chatComponentRewriter = new TextRewriter((Protocol<?, ?, ?, ?>)this);
    private final EntityDataRewriter entityDataRewriter = new EntityDataRewriter(this);
    public static final ValueTransformer<String, String> LEGACY_TO_JSON = new /* Unavailable Anonymous Inner Class!! */;
    public static final ValueTransformer<String, String> LEGACY_TO_JSON_TRANSLATE = new /* Unavailable Anonymous Inner Class!! */;

    public Protocolr1_7_6_10Tor1_8() {
        super(ClientboundPackets1_7_2.class, ClientboundPackets1_8.class, ServerboundPackets1_7_2.class, ServerboundPackets1_8.class);
    }

    public void register(ViaProviders providers) {
        providers.require(GameProfileFetcher.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.addClientWorld(Protocolr1_7_6_10Tor1_8.class, new ClientWorld());
        userConnection.put((StorableObject)new TablistStorage(userConnection));
        userConnection.put((StorableObject)new WindowTracker());
        userConnection.put((StorableObject)new EntityTracker(userConnection));
        userConnection.put((StorableObject)new MapStorage());
        userConnection.put((StorableObject)new ChunkTracker());
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read(Types.STRING);
                this.read(Types.STRING);
                this.handler(wrapper -> {
                    ProtocolInfo protocolInfo = wrapper.user().getProtocolInfo();
                    wrapper.write(Types.STRING, (Object)protocolInfo.getUuid().toString());
                    wrapper.write(Types.STRING, (Object)protocolInfo.getUsername());
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.KEEP_ALIVE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.create((Type)Types.BOOLEAN, false);
                this.handler(wrapper -> {
                    ProtocolInfo protocolInfo = wrapper.user().getProtocolInfo();
                    TablistStorage tablistStorage = (TablistStorage)wrapper.user().get(TablistStorage.class);
                    tablistStorage.sendTempEntry(new TabListEntry(protocolInfo.getUsername(), protocolInfo.getUuid()));
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    byte dimensionId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    tracker.trackEntity(entityId, EntityTypes1_8.EntityType.PLAYER);
                    tracker.setPlayerID(entityId);
                    wrapper.user().getClientWorld(Protocolr1_7_6_10Tor1_8.class).setEnvironment((int)dimensionId);
                    wrapper.send(Protocolr1_7_6_10Tor1_8.class);
                    wrapper.cancel();
                    PacketWrapper setBorder = PacketWrapper.create((PacketType)ClientboundPackets1_8.SET_BORDER, (UserConnection)wrapper.user());
                    setBorder.write((Type)Types.VAR_INT, (Object)3);
                    setBorder.write((Type)Types.DOUBLE, (Object)0.0);
                    setBorder.write((Type)Types.DOUBLE, (Object)0.0);
                    setBorder.write((Type)Types.DOUBLE, (Object)0.0);
                    setBorder.write((Type)Types.DOUBLE, (Object)6.0E7);
                    setBorder.write((Type)Types.VAR_LONG, (Object)0L);
                    setBorder.write((Type)Types.VAR_INT, (Object)60000000);
                    setBorder.write((Type)Types.VAR_INT, (Object)0);
                    setBorder.write((Type)Types.VAR_INT, (Object)0);
                    setBorder.send(Protocolr1_7_6_10Tor1_8.class);
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> wrapper.write(Types.STRING, (Object)Protocolr1_7_6_10Tor1_8.this.chatComponentRewriter.toClient(wrapper.user(), (String)wrapper.read(Types.STRING))));
                this.create((Type)Types.BYTE, (byte)0);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_EQUIPPED_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.map((Type)Types.SHORT);
                this.map(Types1_7_6.ITEM, Types.ITEM1_8);
                this.handler(wrapper -> Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.get(Types.ITEM1_8, 0)));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_DEFAULT_SPAWN_POSITION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_INT, Types.BLOCK_POSITION1_8);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_HEALTH, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.RESPAWN, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.PLAYER_POSITION, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.PLAYER_SLEEP, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.ADD_PLAYER, wrapper -> {
            int entityID = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            UUID uuid = UUID.fromString((String)wrapper.read(Types.STRING));
            wrapper.write(Types.UUID, (Object)uuid);
            String name = (String)wrapper.read(Types.STRING);
            GameProfile.Property[] properties = new GameProfile.Property[((Integer)wrapper.read((Type)Types.VAR_INT)).intValue()];
            for (int i = 0; i < properties.length; ++i) {
                String key = (String)wrapper.read(Types.STRING);
                String value = (String)wrapper.read(Types.STRING);
                String signature = (String)wrapper.read(Types.STRING);
                properties[i] = new GameProfile.Property(key, value, signature);
            }
            wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            short itemId = (Short)wrapper.read((Type)Types.SHORT);
            DataItem currentItem = new DataItem((int)itemId, 1, 0, null);
            this.itemRewriter.handleItemToClient(wrapper.user(), (Item)currentItem);
            wrapper.write((Type)Types.SHORT, (Object)((short)currentItem.identifier()));
            List entityDataList = (List)wrapper.read(Types1_7_6.ENTITY_DATA_LIST);
            this.entityDataRewriter.transform(wrapper.user(), EntityTypes1_8.EntityType.PLAYER, entityDataList);
            wrapper.write(Types.ENTITY_DATA_LIST1_8, (Object)entityDataList);
            ((TablistStorage)wrapper.user().get(TablistStorage.class)).sendTempEntry(new TabListEntry(new GameProfile(name, uuid, properties)));
            ((EntityTracker)wrapper.user().get(EntityTracker.class)).trackEntity(entityID, EntityTypes1_8.EntityType.PLAYER);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.TAKE_ITEM_ENTITY, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.ADD_ENTITY, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.ADD_MOB, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.ADD_PAINTING, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.ADD_EXPERIENCE_ORB, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_ENTITY_MOTION, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.REMOVE_ENTITIES, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.MOVE_ENTITY, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.MOVE_ENTITY_POS, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.MOVE_ENTITY_ROT, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.MOVE_ENTITY_POS_ROT, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.TELEPORT_ENTITY, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.ROTATE_HEAD, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_ENTITY_LINK, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_ENTITY_DATA, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.UPDATE_MOB_EFFECT, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.REMOVE_MOB_EFFECT, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_EXPERIENCE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.SHORT, (Type)Types.VAR_INT);
                this.map((Type)Types.SHORT, (Type)Types.VAR_INT);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.UPDATE_ATTRIBUTES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int amount = (Integer)wrapper.passthrough((Type)Types.INT);
                    for (int i = 0; i < amount; ++i) {
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough((Type)Types.DOUBLE);
                        int modifierlength = ((Short)wrapper.read((Type)Types.SHORT)).shortValue();
                        wrapper.write((Type)Types.VAR_INT, (Object)modifierlength);
                        for (int j = 0; j < modifierlength; ++j) {
                            wrapper.passthrough(Types.UUID);
                            wrapper.passthrough((Type)Types.DOUBLE);
                            wrapper.passthrough((Type)Types.BYTE);
                        }
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.LEVEL_CHUNK, wrapper -> {
            Environment dimension = wrapper.user().getClientWorld(Protocolr1_7_6_10Tor1_8.class).getEnvironment();
            Chunk chunk = (Chunk)wrapper.read(Types1_7_6.getChunk(dimension));
            ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).trackAndRemap(chunk);
            wrapper.write((Type)ChunkType1_8.forEnvironment((Environment)dimension), (Object)chunk);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.CHUNK_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map(Types1_7_6.BLOCK_CHANGE_RECORD_ARRAY, Types.BLOCK_CHANGE_ARRAY);
                this.handler(wrapper -> {
                    BlockChangeRecord[] blockChangeRecords;
                    int chunkX = (Integer)wrapper.get((Type)Types.INT, 0);
                    int chunkZ = (Integer)wrapper.get((Type)Types.INT, 1);
                    for (BlockChangeRecord record : blockChangeRecords = (BlockChangeRecord[])wrapper.get(Types.BLOCK_CHANGE_ARRAY, 0)) {
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
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE, Types.BLOCK_POSITION1_8);
                this.handler(wrapper -> {
                    int blockId = (Integer)wrapper.read((Type)Types.VAR_INT);
                    short data = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
                    BlockPosition pos = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                    IdAndData block = new IdAndData(blockId, (int)data);
                    ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).trackAndRemap(pos, block);
                    wrapper.write((Type)Types.VAR_INT, (Object)block.toRawData());
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.BLOCK_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT, Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.BLOCK_DESTRUCTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types1_7_6.BLOCK_POSITION_INT, Types.BLOCK_POSITION1_8);
                this.map((Type)Types.BYTE);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.MAP_BULK_CHUNK, wrapper -> {
            Chunk[] chunks;
            for (Chunk chunk : chunks = (Chunk[])wrapper.read(Types1_7_6.CHUNK_BULK)) {
                ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).trackAndRemap(chunk);
            }
            wrapper.write(BulkChunkType1_8.TYPE, (Object)chunks);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
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
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.LEVEL_EVENT, wrapper -> {
            int effectId = (Integer)wrapper.read((Type)Types.INT);
            BlockPosition pos = (BlockPosition)wrapper.read(Types1_7_6.BLOCK_POSITION_UBYTE);
            int data = (Integer)wrapper.read((Type)Types.INT);
            boolean disableRelativeVolume = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (!disableRelativeVolume && effectId == 2006) {
                wrapper.setPacketType((PacketType)ClientboundPackets1_8.LEVEL_PARTICLES);
                Random rnd = new Random();
                ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
                IdAndData block = chunkTracker.getBlockNotNull(pos);
                if (block.getId() != 0) {
                    double var21 = Math.min(0.2f + (float)data / 15.0f, 10.0f);
                    if (var21 > 2.5) {
                        var21 = 2.5;
                    }
                    float var25 = this.randomFloatClamp(rnd, 0.0f, (float)Math.PI * 2);
                    double var26 = this.randomFloatClamp(rnd, 0.75f, 1.0f);
                    float offsetY = (float)((double)0.2f + var21 / 100.0);
                    float offsetX = (float)(Math.cos(var25) * (double)0.2f * var26 * var26 * (var21 + 0.2));
                    float offsetZ = (float)(Math.sin(var25) * (double)0.2f * var26 * var26 * (var21 + 0.2));
                    int amount = (int)(150.0 * var21);
                    wrapper.write((Type)Types.INT, (Object)Particle1_7_6.BLOCK_DUST.ordinal());
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)pos.x() + 0.5f));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)pos.y() + 1.0f));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)pos.z() + 0.5f));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(offsetX));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(offsetY));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(offsetZ));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.15f));
                    wrapper.write((Type)Types.INT, (Object)amount);
                    wrapper.write((Type)Types.VAR_INT, (Object)(block.getId() | block.getData() << 12));
                } else {
                    wrapper.cancel();
                }
            } else {
                if (!disableRelativeVolume && effectId == 1003) {
                    if (Math.random() > 0.5) {
                        effectId = 1006;
                    }
                } else if (!disableRelativeVolume && effectId == 2001) {
                    ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
                    int blockID = data & 0xFFF;
                    int blockData = data >> 12 & 0xFF;
                    IdAndData block = new IdAndData(blockID, blockData);
                    chunkTracker.remapBlockParticle(block);
                    data = block.getId() | block.getData() << 12;
                }
                wrapper.write((Type)Types.INT, (Object)effectId);
                wrapper.write(Types.BLOCK_POSITION1_8, (Object)pos);
                wrapper.write((Type)Types.INT, (Object)data);
                wrapper.write((Type)Types.BOOLEAN, (Object)disableRelativeVolume);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.LEVEL_PARTICLES, wrapper -> {
            Object[] parts = ((String)wrapper.read(Types.STRING)).split("_", 3);
            Particle1_7_6 particle = Particle1_7_6.find((String)parts[0]);
            if (particle == null) {
                particle = Particle1_7_6.BARRIER;
                if (Via.getConfig().logOtherConversionWarnings()) {
                    ViaLegacy.getPlatform().getLogger().warning("Could not find 1.8 particle for " + Arrays.toString(parts));
                }
            }
            wrapper.write((Type)Types.INT, (Object)particle.ordinal());
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.INT);
            if (particle == Particle1_7_6.ICON_CRACK) {
                int id = Integer.parseInt((String)parts[1]);
                int damage = 0;
                if (parts.length > 2) {
                    damage = Integer.parseInt((String)parts[2]);
                }
                DataItem item = new DataItem(id, 1, (short)damage, null);
                this.itemRewriter.handleItemToClient(wrapper.user(), (Item)item);
                wrapper.write((Type)Types.VAR_INT, (Object)item.identifier());
                if (item.data() != 0) {
                    wrapper.write((Type)Types.VAR_INT, (Object)item.data());
                }
            } else if (particle == Particle1_7_6.BLOCK_CRACK || particle == Particle1_7_6.BLOCK_DUST) {
                int id = Integer.parseInt((String)parts[1]);
                int metadata = Integer.parseInt((String)parts[2]);
                IdAndData block = new IdAndData(id, metadata);
                ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).remapBlockParticle(block);
                wrapper.write((Type)Types.VAR_INT, (Object)(block.getId() | block.getData() << 12));
            } else if (particle.extra > 0) {
                throw new IllegalStateException("Tried to write particle which requires extra data, but no handler was found");
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.GAME_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> {
                    if ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0) == 3) {
                        PacketWrapper chatMessage = PacketWrapper.create((PacketType)ClientboundPackets1_8.CHAT, (UserConnection)wrapper.user());
                        chatMessage.write(Types.STRING, (Object)((String)LEGACY_TO_JSON.transform(chatMessage, (Object)"Your game mode has been updated")));
                        chatMessage.write((Type)Types.BYTE, (Object)0);
                        chatMessage.send(Protocolr1_7_6_10Tor1_8.class);
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.OPEN_SCREEN, wrapper -> {
            String inventoryName;
            short windowId = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            short windowType = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
            String title = (String)wrapper.read(Types.STRING);
            short slots = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
            boolean useProvidedWindowTitle = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            ((WindowTracker)wrapper.user().get(WindowTracker.class)).types.put(windowId, windowType);
            switch (windowType) {
                case 0: {
                    inventoryName = "minecraft:chest";
                    break;
                }
                case 1: {
                    inventoryName = "minecraft:crafting_table";
                    title = "container.crafting";
                    useProvidedWindowTitle = false;
                    break;
                }
                case 2: {
                    inventoryName = "minecraft:furnace";
                    if (useProvidedWindowTitle) break;
                    title = "container.furnace";
                    break;
                }
                case 3: {
                    inventoryName = "minecraft:dispenser";
                    if (useProvidedWindowTitle) break;
                    title = "container.dispenser";
                    break;
                }
                case 4: {
                    inventoryName = "minecraft:enchanting_table";
                    if (useProvidedWindowTitle) break;
                    title = "container.enchant";
                    break;
                }
                case 5: {
                    inventoryName = "minecraft:brewing_stand";
                    if (useProvidedWindowTitle) break;
                    title = "container.brewing";
                    break;
                }
                case 6: {
                    inventoryName = "minecraft:villager";
                    if (useProvidedWindowTitle && !title.isEmpty()) break;
                    title = "entity.Villager.name";
                    useProvidedWindowTitle = false;
                    break;
                }
                case 7: {
                    inventoryName = "minecraft:beacon";
                    if (useProvidedWindowTitle) break;
                    title = "container.beacon";
                    break;
                }
                case 8: {
                    inventoryName = "minecraft:anvil";
                    title = "container.repair";
                    useProvidedWindowTitle = false;
                    break;
                }
                case 9: {
                    inventoryName = "minecraft:hopper";
                    if (useProvidedWindowTitle) break;
                    title = "container.hopper";
                    break;
                }
                case 10: {
                    inventoryName = "minecraft:dropper";
                    if (useProvidedWindowTitle) break;
                    title = "container.dropper";
                    break;
                }
                case 11: {
                    inventoryName = "EntityHorse";
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown window type: " + windowType);
                }
            }
            if (windowType == 1 || windowType == 4 || windowType == 8) {
                slots = 0;
            }
            title = useProvidedWindowTitle ? (String)LEGACY_TO_JSON.transform(wrapper, (Object)title) : (String)LEGACY_TO_JSON_TRANSLATE.transform(wrapper, (Object)title);
            wrapper.write(Types.STRING, (Object)inventoryName);
            wrapper.write(Types.STRING, (Object)title);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)slots);
            if (windowType == 11) {
                wrapper.passthrough((Type)Types.INT);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.CONTAINER_SET_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    byte windowId = (Byte)wrapper.passthrough((Type)Types.BYTE);
                    short slot = (Short)wrapper.read((Type)Types.SHORT);
                    short windowType = ((WindowTracker)wrapper.user().get(WindowTracker.class)).get((short)windowId);
                    if (windowType == 4 && slot >= 1) {
                        slot = (short)(slot + 1);
                    }
                    wrapper.write((Type)Types.SHORT, (Object)slot);
                });
                this.map(Types1_7_6.ITEM, Types.ITEM1_8);
                this.handler(wrapper -> Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.get(Types.ITEM1_8, 0)));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.CONTAINER_SET_CONTENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    short windowId = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
                    short windowType = ((WindowTracker)wrapper.user().get(WindowTracker.class)).get(windowId);
                    Item[] items = (Item[])wrapper.read(Types1_7_6.ITEM_ARRAY);
                    if (windowType == 4) {
                        Item[] old = items;
                        items = new Item[old.length + 1];
                        items[0] = old[0];
                        System.arraycopy(old, 1, items, 2, old.length - 1);
                        items[1] = new DataItem(351, 3, 4, null);
                    }
                    for (Item item : items) {
                        Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToClient(wrapper.user(), item);
                    }
                    wrapper.write(Types.ITEM1_8_SHORT_ARRAY, (Object)items);
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.CONTAINER_SET_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    short windowId = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    short progressBar = (Short)wrapper.get((Type)Types.SHORT, 0);
                    short windowType = ((WindowTracker)wrapper.user().get(WindowTracker.class)).get(windowId);
                    if (windowType == 2) {
                        switch (progressBar) {
                            case 0: {
                                progressBar = 2;
                                PacketWrapper windowProperty = PacketWrapper.create((PacketType)ClientboundPackets1_8.CONTAINER_SET_DATA, (UserConnection)wrapper.user());
                                windowProperty.write((Type)Types.UNSIGNED_BYTE, (Object)windowId);
                                windowProperty.write((Type)Types.SHORT, (Object)3);
                                windowProperty.write((Type)Types.SHORT, (Object)200);
                                windowProperty.send(Protocolr1_7_6_10Tor1_8.class);
                                break;
                            }
                            case 1: {
                                progressBar = 0;
                                break;
                            }
                            case 2: {
                                progressBar = 1;
                            }
                        }
                        wrapper.set((Type)Types.SHORT, 0, (Object)progressBar);
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.UPDATE_SIGN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT, Types.BLOCK_POSITION1_8);
                this.map(LEGACY_TO_JSON);
                this.map(LEGACY_TO_JSON);
                this.map(LEGACY_TO_JSON);
                this.map(LEGACY_TO_JSON);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.MAP_ITEM_DATA, wrapper -> {
            int id = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            byte[] data = (byte[])wrapper.read(Types.SHORT_BYTE_ARRAY);
            MapStorage mapStorage = (MapStorage)wrapper.user().get(MapStorage.class);
            MapData mapData = mapStorage.getMapData(id);
            if (mapData == null) {
                mapData = new MapData();
                mapStorage.putMapData(id, mapData);
            }
            if (data[0] == 1) {
                int count = (data.length - 1) / 3;
                mapData.mapIcons = new MapIcon[count];
                for (int i = 0; i < count; ++i) {
                    mapData.mapIcons[i] = new MapIcon((byte)(data[i * 3 + 1] >> 4), (byte)(data[i * 3 + 1] & 0xF), data[i * 3 + 2], data[i * 3 + 3]);
                }
            } else if (data[0] == 2) {
                mapData.scale = data[1];
            }
            wrapper.write((Type)Types.BYTE, (Object)mapData.scale);
            wrapper.write((Type)Types.VAR_INT, (Object)mapData.mapIcons.length);
            for (MapIcon mapIcon : mapData.mapIcons) {
                wrapper.write((Type)Types.BYTE, (Object)((byte)(mapIcon.direction << 4 | mapIcon.type & 0xF)));
                wrapper.write((Type)Types.BYTE, (Object)mapIcon.x);
                wrapper.write((Type)Types.BYTE, (Object)mapIcon.z);
            }
            if (data[0] == 0) {
                byte x = data[1];
                byte z = data[2];
                int rows = data.length - 3;
                byte[] newData = new byte[rows];
                System.arraycopy(data, 3, newData, 0, rows);
                wrapper.write((Type)Types.BYTE, (Object)1);
                wrapper.write((Type)Types.BYTE, (Object)((byte)rows));
                wrapper.write((Type)Types.BYTE, (Object)x);
                wrapper.write((Type)Types.BYTE, (Object)z);
                wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)newData);
            } else {
                wrapper.write((Type)Types.BYTE, (Object)0);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT, Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_7_6.NBT, Types.NAMED_COMPOUND_TAG);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.OPEN_SIGN_EDITOR, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_INT, Types.BLOCK_POSITION1_8);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.PLAYER_INFO, wrapper -> {
            String name = (String)wrapper.read(Types.STRING);
            boolean online = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            short ping = (Short)wrapper.read((Type)Types.SHORT);
            TablistStorage tablistStorage = (TablistStorage)wrapper.user().get(TablistStorage.class);
            TabListEntry entry = (TabListEntry)tablistStorage.tablist.get(name);
            if (entry == null && online) {
                entry = new TabListEntry(name, ping);
                tablistStorage.tablist.put(name, entry);
                wrapper.write((Type)Types.VAR_INT, (Object)0);
                wrapper.write((Type)Types.VAR_INT, (Object)1);
                wrapper.write(Types.UUID, (Object)entry.gameProfile.id());
                wrapper.write(Types.STRING, (Object)entry.gameProfile.name());
                wrapper.write(Types.PROFILE_PROPERTY_ARRAY, (Object)entry.gameProfile.properties());
                wrapper.write((Type)Types.VAR_INT, (Object)0);
                wrapper.write((Type)Types.VAR_INT, (Object)entry.ping);
                wrapper.write(Types.OPTIONAL_STRING, null);
            } else if (entry != null && !online) {
                tablistStorage.tablist.remove(name);
                wrapper.write((Type)Types.VAR_INT, (Object)4);
                wrapper.write((Type)Types.VAR_INT, (Object)1);
                wrapper.write(Types.UUID, (Object)entry.gameProfile.id());
            } else if (entry != null) {
                entry.ping = ping;
                wrapper.write((Type)Types.VAR_INT, (Object)2);
                wrapper.write((Type)Types.VAR_INT, (Object)1);
                wrapper.write(Types.UUID, (Object)entry.gameProfile.id());
                wrapper.write((Type)Types.VAR_INT, (Object)entry.ping);
            } else {
                wrapper.cancel();
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_OBJECTIVE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    String value = (String)wrapper.read(Types.STRING);
                    byte mode = (Byte)wrapper.passthrough((Type)Types.BYTE);
                    if (mode == 0 || mode == 2) {
                        wrapper.write(Types.STRING, (Object)value);
                        wrapper.write(Types.STRING, (Object)"integer");
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_SCORE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE, (Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int mode = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (mode == 0) {
                        wrapper.passthrough(Types.STRING);
                        wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.INT)));
                    } else {
                        wrapper.write(Types.STRING, (Object)"");
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.SET_PLAYER_TEAM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    byte mode = (Byte)wrapper.passthrough((Type)Types.BYTE);
                    if (mode == 0 || mode == 2) {
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough((Type)Types.BYTE);
                        wrapper.write(Types.STRING, (Object)"always");
                        wrapper.write((Type)Types.BYTE, (Object)0);
                    }
                    if (mode == 0 || mode == 3 || mode == 4) {
                        int count = ((Short)wrapper.read((Type)Types.SHORT)).shortValue();
                        String[] playerNames = new String[count];
                        for (int i = 0; i < count; ++i) {
                            playerNames[i] = (String)wrapper.read(Types.STRING);
                        }
                        wrapper.write(Types.STRING_ARRAY, (Object)playerNames);
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_7_2.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.read((Type)Types.UNSIGNED_SHORT);
                this.handlerSoftFail(wrapper -> {
                    String channel;
                    switch (channel = (String)wrapper.get(Types.STRING, 0)) {
                        case "MC|Brand": {
                            wrapper.write(Types.STRING, (Object)new String((byte[])wrapper.read(Types.REMAINING_BYTES), StandardCharsets.UTF_8));
                            break;
                        }
                        case "MC|TrList": {
                            wrapper.passthrough((Type)Types.INT);
                            int count = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
                            for (int i = 0; i < count; ++i) {
                                Item item = (Item)wrapper.read(Types1_7_6.ITEM);
                                Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToClient(wrapper.user(), item);
                                wrapper.write(Types.ITEM1_8, (Object)item);
                                item = (Item)wrapper.read(Types1_7_6.ITEM);
                                Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToClient(wrapper.user(), item);
                                wrapper.write(Types.ITEM1_8, (Object)item);
                                boolean has3Items = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
                                if (has3Items) {
                                    item = (Item)wrapper.read(Types1_7_6.ITEM);
                                    Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToClient(wrapper.user(), item);
                                    wrapper.write(Types.ITEM1_8, (Object)item);
                                }
                                wrapper.passthrough((Type)Types.BOOLEAN);
                                wrapper.write((Type)Types.INT, (Object)0);
                                wrapper.write((Type)Types.INT, (Object)Integer.MAX_VALUE);
                            }
                            break;
                        }
                        case "MC|RPack": {
                            String url = new String((byte[])wrapper.read(Types.REMAINING_BYTES), StandardCharsets.UTF_8);
                            wrapper.clearPacket();
                            wrapper.setPacketType((PacketType)ClientboundPackets1_8.RESOURCE_PACK);
                            wrapper.write(Types.STRING, (Object)url);
                            wrapper.write(Types.STRING, (Object)"legacy");
                        }
                    }
                });
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String name = (String)wrapper.passthrough(Types.STRING);
                    ProtocolInfo info = wrapper.user().getProtocolInfo();
                    if (info.getUsername() == null) {
                        info.setUsername(name);
                    }
                    if (info.getUuid() == null) {
                        info.setUuid(ViaLegacy.getConfig().isLegacySkinLoading() ? ((GameProfileFetcher)Via.getManager().getProviders().get(GameProfileFetcher.class)).getMojangUuid(name) : GameProfileUtil.getOfflinePlayerUuid((String)name));
                    }
                });
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.ENCRYPTION_KEY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BYTE_ARRAY_PRIMITIVE, Types.SHORT_BYTE_ARRAY);
                this.map(Types.BYTE_ARRAY_PRIMITIVE, Types.SHORT_BYTE_ARRAY);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.KEEP_ALIVE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.INTERACT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
                this.handler(wrapper -> {
                    int mode = (Integer)wrapper.read((Type)Types.VAR_INT);
                    if (mode == 2) {
                        wrapper.write((Type)Types.BYTE, (Object)0);
                        wrapper.read((Type)Types.FLOAT);
                        wrapper.read((Type)Types.FLOAT);
                        wrapper.read((Type)Types.FLOAT);
                        EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                        EntityTypes1_8.EntityType entityType = (EntityTypes1_8.EntityType)entityTracker.getTrackedEntities().get(wrapper.get((Type)Types.INT, 0));
                        if (entityType == null || !entityType.isOrHasParent((EntityType)EntityTypes1_8.EntityType.ARMOR_STAND)) {
                            wrapper.cancel();
                        }
                    } else {
                        wrapper.write((Type)Types.BYTE, (Object)((byte)mode));
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.MOVE_PLAYER_POS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.handler(wrapper -> wrapper.write((Type)Types.DOUBLE, (Object)((Double)wrapper.get((Type)Types.DOUBLE, 1) + 1.62)));
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BOOLEAN);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.MOVE_PLAYER_POS_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.handler(wrapper -> wrapper.write((Type)Types.DOUBLE, (Object)((Double)wrapper.get((Type)Types.DOUBLE, 1) + 1.62)));
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.PLAYER_ACTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT, (Type)Types.UNSIGNED_BYTE);
                this.map(Types.BLOCK_POSITION1_8, Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    short status = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (status == 1 || status == 5) {
                        wrapper.set((Type)Types.UNSIGNED_BYTE, 1, (Object)255);
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8, Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.ITEM1_8, Types1_7_6.ITEM);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    short direction = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    Item item = (Item)wrapper.get(Types1_7_6.ITEM, 0);
                    Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToServer(wrapper.user(), item);
                    if (item != null && item.identifier() == ItemList1_6.writtenBook.itemId() && direction == 255) {
                        PacketWrapper openBook = PacketWrapper.create((PacketType)ClientboundPackets1_8.CUSTOM_PAYLOAD, (UserConnection)wrapper.user());
                        openBook.write(Types.STRING, (Object)"MC|BOpen");
                        openBook.send(Protocolr1_7_6_10Tor1_8.class);
                        wrapper.cancel();
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.SWING, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            wrapper.write((Type)Types.INT, (Object)entityTracker.getPlayerID());
            wrapper.write((Type)Types.BYTE, (Object)1);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.PLAYER_COMMAND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
                this.map((Type)Types.VAR_INT, (Type)Types.BYTE, action -> (byte)(action + 1));
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.PLAYER_INPUT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> {
                    byte flags = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.write((Type)Types.BOOLEAN, (Object)((flags & 1) > 0 ? 1 : 0));
                    wrapper.write((Type)Types.BOOLEAN, (Object)((flags & 2) > 0 ? 1 : 0));
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    byte windowId = (Byte)wrapper.passthrough((Type)Types.BYTE);
                    short slot = (Short)wrapper.passthrough((Type)Types.SHORT);
                    short windowType = ((WindowTracker)wrapper.user().get(WindowTracker.class)).get((short)windowId);
                    if (windowType == 4) {
                        if (slot == 1) {
                            PacketWrapper resetHandItem = PacketWrapper.create((PacketType)ClientboundPackets1_8.CONTAINER_SET_SLOT, (UserConnection)wrapper.user());
                            resetHandItem.write((Type)Types.BYTE, (Object)-1);
                            resetHandItem.write((Type)Types.SHORT, (Object)0);
                            resetHandItem.write(Types.ITEM1_8, null);
                            resetHandItem.send(Protocolr1_7_6_10Tor1_8.class);
                            PacketWrapper setLapisSlot = PacketWrapper.create((PacketType)ClientboundPackets1_8.CONTAINER_SET_SLOT, (UserConnection)wrapper.user());
                            setLapisSlot.write((Type)Types.BYTE, (Object)windowId);
                            setLapisSlot.write((Type)Types.SHORT, (Object)slot);
                            setLapisSlot.write(Types.ITEM1_8, (Object)new DataItem(351, 3, 4, null));
                            setLapisSlot.send(Protocolr1_7_6_10Tor1_8.class);
                            wrapper.cancel();
                        } else if (slot > 1) {
                            wrapper.set((Type)Types.SHORT, 0, (Object)((short)(slot - 1)));
                        }
                    }
                });
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map(Types.ITEM1_8, Types1_7_6.ITEM);
                this.handler(wrapper -> Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToServer(wrapper.user(), (Item)wrapper.get(Types1_7_6.ITEM, 0)));
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.SET_CREATIVE_MODE_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.SHORT);
                this.map(Types.ITEM1_8, Types1_7_6.ITEM);
                this.handler(wrapper -> Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToServer(wrapper.user(), (Item)wrapper.get(Types1_7_6.ITEM, 0)));
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.SIGN_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8, Types1_7_6.BLOCK_POSITION_SHORT);
                this.handler(wrapper -> {
                    for (int i = 0; i < 4; ++i) {
                        JsonElement component = (JsonElement)wrapper.read(Types.COMPONENT);
                        String text = TextComponentSerializer.V1_8.deserialize(component).asUnformattedString();
                        if (text.length() > 15) {
                            text = text.substring(0, 15);
                        }
                        wrapper.write(Types.STRING, (Object)text);
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.COMMAND_SUGGESTION, wrapper -> {
            String text = (String)wrapper.read(Types.STRING);
            wrapper.clearPacket();
            wrapper.write(Types.STRING, (Object)text);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.create((Type)Types.BYTE, (byte)2);
                this.map((Type)Types.UNSIGNED_BYTE, (Type)Types.BOOLEAN, flags -> (flags & 1) == 1);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_8.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String channel = (String)wrapper.read(Types.STRING);
                    if (ViaLegacy.getConfig().isIgnoreLong1_8ChannelNames() && channel.length() > 16) {
                        if (Via.getConfig().logOtherConversionWarnings()) {
                            ViaLegacy.getPlatform().getLogger().warning("Ignoring serverbound plugin channel, as it is longer than 16 characters: '" + channel + "'");
                        }
                        wrapper.cancel();
                        return;
                    }
                    switch (channel) {
                        case "MC|BEdit": 
                        case "MC|BSign": {
                            Item item = (Item)wrapper.read(Types.ITEM1_8);
                            Protocolr1_7_6_10Tor1_8.this.itemRewriter.handleItemToServer(wrapper.user(), item);
                            wrapper.write(Types1_7_6.ITEM, (Object)item);
                            break;
                        }
                        case "MC|Brand": 
                        case "MC|ItemName": {
                            String content = (String)wrapper.read(Types.STRING);
                            wrapper.write(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA, (Object)content.getBytes(StandardCharsets.UTF_8));
                            break;
                        }
                        case "MC|AdvCdm": {
                            byte type = (Byte)wrapper.passthrough((Type)Types.BYTE);
                            if (type == 0) {
                                wrapper.passthrough((Type)Types.INT);
                                wrapper.passthrough((Type)Types.INT);
                                wrapper.passthrough((Type)Types.INT);
                            } else if (type == 1) {
                                wrapper.passthrough((Type)Types.INT);
                            } else {
                                if (Via.getConfig().logOtherConversionWarnings()) {
                                    ViaLegacy.getPlatform().getLogger().warning("Unknown 1.8 command block type: " + type);
                                }
                                wrapper.cancel();
                                return;
                            }
                            wrapper.passthrough(Types.STRING);
                            wrapper.read((Type)Types.BOOLEAN);
                            break;
                        }
                        case "REGISTER": 
                        case "UNREGISTER": {
                            byte[] channels = (byte[])wrapper.read(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA);
                            if (ViaLegacy.getConfig().isIgnoreLong1_8ChannelNames()) {
                                String[] registeredChannels = new String(channels, StandardCharsets.UTF_8).split("\u0000");
                                ArrayList<String> validChannels = new ArrayList<String>(registeredChannels.length);
                                for (String registeredChannel : registeredChannels) {
                                    if (registeredChannel.length() > 16) {
                                        if (!Via.getConfig().logOtherConversionWarnings()) continue;
                                        ViaLegacy.getPlatform().getLogger().warning("Ignoring serverbound plugin channel register of '" + registeredChannel + "', as it is longer than 16 characters");
                                        continue;
                                    }
                                    validChannels.add(registeredChannel);
                                }
                                if (validChannels.isEmpty()) {
                                    wrapper.cancel();
                                    return;
                                }
                                channels = Joiner.on((char)'\u0000').join(validChannels).getBytes(StandardCharsets.UTF_8);
                            }
                            wrapper.write(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA, (Object)channels);
                        }
                    }
                    short length = (short)PacketUtil.calculateLength((PacketWrapper)wrapper);
                    wrapper.resetReader();
                    wrapper.write(Types.STRING, (Object)channel);
                    wrapper.write((Type)Types.SHORT, (Object)length);
                });
            }
        });
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_8.TELEPORT_TO_ENTITY);
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_8.RESOURCE_PACK);
    }

    public ItemRewriter getItemRewriter() {
        return this.itemRewriter;
    }

    private int realignEntityY(EntityTypes1_8.EntityType type, int y) {
        float yPos = (float)y / 32.0f;
        float yOffset = 0.0f;
        if (type.isOrHasParent((EntityType)EntityTypes1_8.ObjectType.FALLING_BLOCK.getType())) {
            yOffset = 0.49f;
        }
        if (type.isOrHasParent((EntityType)EntityTypes1_8.ObjectType.TNT_PRIMED.getType())) {
            yOffset = 0.49f;
        }
        if (type.isOrHasParent((EntityType)EntityTypes1_8.ObjectType.ENDER_CRYSTAL.getType())) {
            yOffset = 1.0f;
        } else if (type.isOrHasParent((EntityType)EntityTypes1_8.ObjectType.MINECART.getType())) {
            yOffset = 0.35f;
        } else if (type.isOrHasParent((EntityType)EntityTypes1_8.ObjectType.BOAT.getType())) {
            yOffset = 0.3f;
        } else if (type.isOrHasParent((EntityType)EntityTypes1_8.ObjectType.ITEM.getType())) {
            yOffset = 0.12f;
        } else if (type.isOrHasParent((EntityType)EntityTypes1_8.ObjectType.LEASH.getType())) {
            yOffset = 0.5f;
        } else if (type.isOrHasParent((EntityType)EntityTypes1_8.EntityType.EXPERIENCE_ORB)) {
            yOffset = 0.25f;
        }
        return (int)Math.floor((yPos - yOffset) * 32.0f);
    }

    private float randomFloatClamp(Random rnd, float min, float max) {
        return min >= max ? min : rnd.nextFloat() * (max - min) + min;
    }

    public EntityDataRewriter getEntityDataRewriter() {
        return this.entityDataRewriter;
    }
}

