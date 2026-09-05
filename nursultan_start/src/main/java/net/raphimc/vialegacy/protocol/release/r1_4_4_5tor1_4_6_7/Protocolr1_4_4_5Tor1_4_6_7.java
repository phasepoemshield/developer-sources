/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.EntityDataTypes1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.release.r1_4_4_5tor1_4_6_7;

import com.google.common.collect.Lists;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.release.r1_4_4_5tor1_4_6_7.packet.ClientboundPackets1_4_4;
import net.raphimc.vialegacy.protocol.release.r1_4_4_5tor1_4_6_7.rewriter.ItemRewriter;
import net.raphimc.vialegacy.protocol.release.r1_4_4_5tor1_4_6_7.types.Types1_4_4;
import net.raphimc.vialegacy.protocol.release.r1_4_6_7tor1_5_0_1.packet.ClientboundPackets1_4_6;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.EntityDataTypes1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_4_4_5Tor1_4_6_7
extends StatelessProtocol<ClientboundPackets1_4_4, ClientboundPackets1_4_6, ServerboundPackets1_5_2, ServerboundPackets1_5_2> {
    private final ItemRewriter itemRewriter = new ItemRewriter(this);

    public Protocolr1_4_4_5Tor1_4_6_7() {
        super(ClientboundPackets1_4_4.class, ClientboundPackets1_4_6.class, ServerboundPackets1_5_2.class, ServerboundPackets1_5_2.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolr1_4_4_5Tor1_4_6_7.class, ClientboundPackets1_4_4::getPacket));
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(ClientboundPackets1_4_4.SPAWN_ITEM, ClientboundPackets1_4_6.ADD_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.read((Type)Types.INT);
            Item item = (Item)wrapper.read(Types1_7_6.ITEM);
            int x = (Integer)wrapper.read((Type)Types.INT);
            int y = (Integer)wrapper.read((Type)Types.INT);
            int z = (Integer)wrapper.read((Type)Types.INT);
            byte motionX = (Byte)wrapper.read((Type)Types.BYTE);
            byte motionY = (Byte)wrapper.read((Type)Types.BYTE);
            byte motionZ = (Byte)wrapper.read((Type)Types.BYTE);
            wrapper.write((Type)Types.INT, (Object)entityId);
            wrapper.write((Type)Types.BYTE, (Object)((byte)EntityTypes1_8.ObjectType.ITEM.getId()));
            wrapper.write((Type)Types.INT, (Object)x);
            wrapper.write((Type)Types.INT, (Object)y);
            wrapper.write((Type)Types.INT, (Object)z);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.INT, (Object)1);
            wrapper.write((Type)Types.SHORT, (Object)((short)((float)motionX / 128.0f * 8000.0f)));
            wrapper.write((Type)Types.SHORT, (Object)((short)((float)motionY / 128.0f * 8000.0f)));
            wrapper.write((Type)Types.SHORT, (Object)((short)((float)motionZ / 128.0f * 8000.0f)));
            PacketWrapper setEntityData = PacketWrapper.create((PacketType)ClientboundPackets1_4_6.SET_ENTITY_DATA, (UserConnection)wrapper.user());
            setEntityData.write((Type)Types.INT, (Object)entityId);
            setEntityData.write(Types1_6_4.ENTITY_DATA_LIST, (Object)Lists.newArrayList((Object[])new EntityData[]{new EntityData(EntityDataIndex1_7_6.ITEM_ITEM.getOldIndex(), (EntityDataType)EntityDataTypes1_6_4.ITEM, (Object)item)}));
            wrapper.send(Protocolr1_4_4_5Tor1_4_6_7.class);
            setEntityData.send(Protocolr1_4_4_5Tor1_4_6_7.class);
            wrapper.cancel();
        });
        this.registerClientbound(ClientboundPackets1_4_4.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.create((Type)Types.BYTE, (byte)0);
                this.create((Type)Types.BYTE, (byte)0);
                this.map((Type)Types.INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_4_4.MAP_BULK_CHUNK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_4_4.CHUNK_BULK, Types1_7_6.CHUNK_BULK);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_5_2.PLAYER_ACTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    short status = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (status == 3) {
                        wrapper.set((Type)Types.UNSIGNED_BYTE, 0, (Object)4);
                    }
                });
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
            }
        });
    }

    public ItemRewriter getItemRewriter() {
        return this.itemRewriter;
    }
}

