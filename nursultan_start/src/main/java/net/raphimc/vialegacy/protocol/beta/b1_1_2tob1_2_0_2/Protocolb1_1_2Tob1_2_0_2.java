/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.packet.ClientboundPacketsb1_1
 *  net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.packet.ServerboundPacketsb1_1
 *  net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.rewriter.BlockDataRewriter
 *  net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.storage.EntityFlagStorage
 *  net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.types.Typesb1_1
 *  net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.packet.ClientboundPacketsb1_2
 *  net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.packet.ServerboundPacketsb1_2
 *  net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.types.EntityDataTypesb1_2
 *  net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.types.Typesb1_2
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.types.Types1_1
 *  net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1
 *  net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2;

import com.google.common.collect.Lists;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.IdAndData;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.packet.ClientboundPacketsb1_1;
import net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.packet.ServerboundPacketsb1_1;
import net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.rewriter.BlockDataRewriter;
import net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.storage.EntityFlagStorage;
import net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.types.Typesb1_1;
import net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.packet.ClientboundPacketsb1_2;
import net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.packet.ServerboundPacketsb1_2;
import net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.types.EntityDataTypesb1_2;
import net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.types.Typesb1_2;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.types.Types1_1;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolb1_1_2Tob1_2_0_2
extends StatelessProtocol<ClientboundPacketsb1_1, ClientboundPacketsb1_2, ServerboundPacketsb1_1, ServerboundPacketsb1_2> {
    private final BlockDataRewriter BLOCK_DATA_REWRITER = new BlockDataRewriter();

    public Protocolb1_1_2Tob1_2_0_2() {
        super(ClientboundPacketsb1_1.class, ClientboundPacketsb1_2.class, ServerboundPacketsb1_1.class, ServerboundPacketsb1_2.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolb1_1_2Tob1_2_0_2.class, ClientboundPacketsb1_1::getPacket));
        userConnection.put((StorableObject)new EntityFlagStorage());
    }

    protected void registerPackets() {
        this.registerClientbound((ClientboundPacketType)ClientboundPacketsb1_1.SET_EQUIPPED_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.create((Type)Types.SHORT, (short)0);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPacketsb1_1.ANIMATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    byte animationId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (animationId <= 2) {
                        return;
                    }
                    wrapper.cancel();
                    EntityFlagStorage entityFlagStorage = (EntityFlagStorage)wrapper.user().get(EntityFlagStorage.class);
                    int oldMask = entityFlagStorage.getFlagMask(entityId);
                    switch (animationId) {
                        case 100: {
                            entityFlagStorage.setFlag(entityId, 2, true);
                            break;
                        }
                        case 101: {
                            entityFlagStorage.setFlag(entityId, 2, false);
                            break;
                        }
                        case 102: {
                            entityFlagStorage.setFlag(entityId, 0, true);
                            break;
                        }
                        case 103: {
                            entityFlagStorage.setFlag(entityId, 0, false);
                            break;
                        }
                        case 104: {
                            entityFlagStorage.setFlag(entityId, 1, true);
                            break;
                        }
                        case 105: {
                            entityFlagStorage.setFlag(entityId, 1, false);
                        }
                    }
                    if (oldMask != entityFlagStorage.getFlagMask(entityId)) {
                        PacketWrapper setEntityData = PacketWrapper.create((PacketType)ClientboundPacketsb1_2.SET_ENTITY_DATA, (UserConnection)wrapper.user());
                        setEntityData.write((Type)Types.INT, (Object)((Integer)wrapper.get((Type)Types.INT, 0)));
                        setEntityData.write(Typesb1_2.ENTITY_DATA_LIST, (Object)Lists.newArrayList((Object[])new EntityData[]{new EntityData(0, (EntityDataType)EntityDataTypesb1_2.BYTE, (Object)((byte)entityFlagStorage.getFlagMask(entityId)))}));
                        setEntityData.send(Protocolb1_1_2Tob1_2_0_2.class);
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPacketsb1_1.SPAWN_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    short itemId = (Short)wrapper.read((Type)Types.SHORT);
                    byte itemCount = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.write(Types1_3_1.NBTLESS_ITEM, (Object)new DataItem((int)itemId, itemCount, 0, null));
                });
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPacketsb1_1.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> wrapper.write(Typesb1_2.ENTITY_DATA_LIST, (Object)Lists.newArrayList((Object[])new EntityData[]{new EntityData(0, (EntityDataType)EntityDataTypesb1_2.BYTE, (Object)0)})));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPacketsb1_1.LEVEL_CHUNK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> Protocolb1_1_2Tob1_2_0_2.this.BLOCK_DATA_REWRITER.remapChunk((Chunk)wrapper.passthrough(Types1_1.CHUNK)));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPacketsb1_1.CHUNK_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map(Types1_1.BLOCK_CHANGE_RECORD_ARRAY);
                this.handler(wrapper -> Protocolb1_1_2Tob1_2_0_2.this.BLOCK_DATA_REWRITER.remapBlockChangeRecords((BlockChangeRecord[])wrapper.get(Types1_1.BLOCK_CHANGE_RECORD_ARRAY, 0)));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPacketsb1_1.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    IdAndData block = new IdAndData((int)((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0)).shortValue(), (int)((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 1)).shortValue());
                    Protocolb1_1_2Tob1_2_0_2.this.BLOCK_DATA_REWRITER.remapBlock(block);
                    wrapper.set((Type)Types.UNSIGNED_BYTE, 0, (Object)((short)block.getId()));
                    wrapper.set((Type)Types.UNSIGNED_BYTE, 1, (Object)block.getData());
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPacketsb1_1.CONTAINER_SET_SLOT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Typesb1_1.NBTLESS_ITEM, Types1_4_2.NBTLESS_ITEM);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_2.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_4_2.NBTLESS_ITEM, Typesb1_1.NBTLESS_ITEM);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_2.PLAYER_COMMAND, (ServerboundPacketType)ServerboundPacketsb1_1.SWING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.UNSIGNED_BYTE, i -> (short)(i + 103));
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_2.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types1_4_2.NBTLESS_ITEM, Typesb1_1.NBTLESS_ITEM);
            }
        });
    }
}

