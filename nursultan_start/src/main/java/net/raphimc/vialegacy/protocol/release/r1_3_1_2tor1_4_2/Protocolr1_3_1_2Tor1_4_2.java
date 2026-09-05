/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.data.ItemList1_6
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.api.util.PacketUtil
 *  net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.rewriter.SoundRewriter
 *  net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.EntityDataTypes1_4_2
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.storage.EntityTracker
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2;

import com.google.common.collect.Lists;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import java.util.List;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.data.ItemList1_6;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.api.util.PacketUtil;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.packet.ClientboundPackets1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.packet.ServerboundPackets1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.rewriter.ItemRewriter;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.rewriter.SoundRewriter;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.packet.ClientboundPackets1_4_2;
import net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.EntityDataTypes1_4_2;
import net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.storage.EntityTracker;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_3_1_2Tor1_4_2
extends StatelessProtocol<ClientboundPackets1_3_1, ClientboundPackets1_4_2, ServerboundPackets1_3_1, ServerboundPackets1_5_2> {
    private final ItemRewriter itemRewriter = new ItemRewriter(this);

    public Protocolr1_3_1_2Tor1_4_2() {
        super(ClientboundPackets1_3_1.class, ClientboundPackets1_4_2.class, ServerboundPackets1_3_1.class, ServerboundPackets1_5_2.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolr1_3_1_2Tor1_4_2.class, ClientboundPackets1_3_1::getPacket));
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(ClientboundPackets1_3_1.DISCONNECT, wrapper -> {
            State currentState = wrapper.user().getProtocolInfo().getServerState();
            if (currentState == State.STATUS) {
                String reason = (String)wrapper.read(Types1_6_4.STRING);
                try {
                    ProtocolInfo info = wrapper.user().getProtocolInfo();
                    String[] pingParts = reason.split("\u00a7");
                    String out = "\u00a71\u0000" + info.serverProtocolVersion().getVersion() + "\u0000" + info.serverProtocolVersion().getName() + "\u0000" + pingParts[0] + "\u0000" + pingParts[1] + "\u0000" + pingParts[2];
                    wrapper.write(Types1_6_4.STRING, (Object)out);
                }
                catch (Throwable e) {
                    ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Could not parse 1.3.1 ping: " + reason, e);
                    wrapper.cancel();
                }
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    wrapper.send(Protocolr1_3_1_2Tor1_4_2.class);
                    wrapper.cancel();
                    PacketWrapper setEntityData = PacketWrapper.create((PacketType)ClientboundPackets1_4_2.SET_ENTITY_DATA, (UserConnection)wrapper.user());
                    setEntityData.write((Type)Types.INT, (Object)((Integer)wrapper.get((Type)Types.INT, 0)));
                    setEntityData.write(Types1_4_2.ENTITY_DATA_LIST, (Object)Lists.newArrayList((Object[])new EntityData[]{new EntityData(EntityDataIndex1_7_6.HUMAN_SKIN_FLAGS.getOldIndex(), (EntityDataType)EntityDataTypes1_4_2.BYTE, (Object)0)}));
                    setEntityData.send(Protocolr1_3_1_2Tor1_4_2.class);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.SET_TIME, wrapper -> {
            long time = (Long)wrapper.passthrough((Type)Types.LONG);
            wrapper.write((Type)Types.LONG, (Object)(time % 24000L));
        });
        this.registerClientbound(ClientboundPackets1_3_1.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types1_6_4.STRING);
                this.handler(wrapper -> {
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    Integer[] entityIds = (Integer[])entityTracker.getTrackedEntities().keySet().stream().filter(i -> i.intValue() != entityTracker.getPlayerID()).toArray(Integer[]::new);
                    int[] primitiveInts = new int[entityIds.length];
                    for (int i2 = 0; i2 < entityIds.length; ++i2) {
                        primitiveInts[i2] = entityIds[i2];
                    }
                    PacketWrapper destroyEntities = PacketWrapper.create((PacketType)ClientboundPackets1_4_2.REMOVE_ENTITIES, (UserConnection)wrapper.user());
                    destroyEntities.write(Types1_7_6.INT_ARRAY, (Object)primitiveInts);
                    destroyEntities.send(Protocolr1_3_1_2Tor1_4_2.class);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.UNSIGNED_SHORT);
                this.map(Types1_3_1.ENTITY_DATA_LIST, Types1_4_2.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types1_4_2.ENTITY_DATA_LIST, 0);
                    Protocolr1_3_1_2Tor1_4_2.this.rewriteEntityData(entityDataList);
                    entityDataList.removeIf(entityData -> entityData.dataType() == EntityDataTypes1_4_2.BYTE && entityData.id() == EntityDataIndex1_7_6.HUMAN_SKIN_FLAGS.getOldIndex());
                    entityDataList.add(new EntityData(EntityDataIndex1_7_6.HUMAN_SKIN_FLAGS.getOldIndex(), (EntityDataType)EntityDataTypes1_4_2.BYTE, (Object)0));
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.SPAWN_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_3_1.NBTLESS_ITEM, Types1_7_6.ITEM);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
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
                this.map(Types1_3_1.ENTITY_DATA_LIST, Types1_4_2.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    Protocolr1_3_1_2Tor1_4_2.this.rewriteEntityData((List)wrapper.get(Types1_4_2.ENTITY_DATA_LIST, 0));
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    short typeId = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (typeId == EntityTypes1_8.EntityType.SKELETON.getId()) {
                        Protocolr1_3_1_2Tor1_4_2.this.setMobHandItem(entityId, (Item)new DataItem(ItemList1_6.bow.itemId(), 1, 0, null), wrapper);
                    } else if (typeId == EntityTypes1_8.EntityType.ZOMBIE_PIGMEN.getId()) {
                        Protocolr1_3_1_2Tor1_4_2.this.setMobHandItem(entityId, (Item)new DataItem(ItemList1_6.swordGold.itemId(), 1, 0, null), wrapper);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.ADD_PAINTING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.STRING);
                this.map(Types1_7_6.BLOCK_POSITION_INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int direction = (Integer)wrapper.get((Type)Types.INT, 1);
                    direction = switch (direction) {
                        case 0 -> 2;
                        case 2 -> 0;
                        default -> direction;
                    };
                    wrapper.set((Type)Types.INT, 1, (Object)direction);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.SET_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_3_1.ENTITY_DATA_LIST, Types1_4_2.ENTITY_DATA_LIST);
                this.handler(wrapper -> Protocolr1_3_1_2Tor1_4_2.this.rewriteEntityData((List)wrapper.get(Types1_4_2.ENTITY_DATA_LIST, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.INT);
                this.create((Type)Types.BOOLEAN, false);
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String oldSound = (String)wrapper.read(Types1_6_4.STRING);
                    String newSound = SoundRewriter.map((String)oldSound);
                    if (oldSound.isEmpty()) {
                        newSound = "";
                    }
                    if (newSound == null) {
                        if (Via.getConfig().logOtherConversionWarnings()) {
                            ViaLegacy.getPlatform().getLogger().warning("Unable to map 1.3.2 sound '" + oldSound + "'");
                        }
                        newSound = "";
                    }
                    if (newSound.isEmpty()) {
                        wrapper.cancel();
                        return;
                    }
                    wrapper.write(Types1_6_4.STRING, (Object)newSound);
                });
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.UNSIGNED_BYTE);
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map(Types1_4_2.UNSIGNED_BYTE_BYTE_ARRAY);
                this.handler(wrapper -> {
                    byte[] data = (byte[])wrapper.get(Types1_4_2.UNSIGNED_BYTE_BYTE_ARRAY, 0);
                    if (data[0] == 1) {
                        for (int i = 0; i < (data.length - 1) / 3; ++i) {
                            byte icon = (byte)(data[i * 3 + 1] % 16);
                            byte centerX = data[i * 3 + 2];
                            byte centerZ = data[i * 3 + 3];
                            byte iconRotation = (byte)(data[i * 3 + 1] / 16);
                            data[i * 3 + 1] = (byte)(icon << 4 | iconRotation & 0xF);
                            data[i * 3 + 2] = centerX;
                            data[i * 3 + 3] = centerZ;
                        }
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_3_1.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String channel = (String)wrapper.read(Types1_6_4.STRING);
                    short length = (Short)wrapper.read((Type)Types.SHORT);
                    try {
                        if (channel.equals("MC|TrList")) {
                            wrapper.passthrough((Type)Types.INT);
                            int count = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
                            for (int i = 0; i < count; ++i) {
                                wrapper.passthrough(Types1_7_6.ITEM);
                                wrapper.passthrough(Types1_7_6.ITEM);
                                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                                    wrapper.passthrough(Types1_7_6.ITEM);
                                }
                                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                            }
                            length = (short)PacketUtil.calculateLength((PacketWrapper)wrapper);
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
                    wrapper.write(Types1_6_4.STRING, (Object)channel);
                    wrapper.write((Type)Types.SHORT, (Object)length);
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_5_2.SERVER_PING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(PacketWrapper::clearPacket);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_5_2.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.read((Type)Types.BOOLEAN);
            }
        });
    }

    public ItemRewriter getItemRewriter() {
        return this.itemRewriter;
    }

    private void rewriteEntityData(List<EntityData> entityDataList) {
        for (EntityData entityData : entityDataList) {
            entityData.setDataType((EntityDataType)EntityDataTypes1_4_2.byId((int)entityData.dataType().typeId()));
        }
    }

    private void setMobHandItem(int entityId, Item item, PacketWrapper wrapper) {
        PacketWrapper handItem = PacketWrapper.create((PacketType)ClientboundPackets1_4_2.SET_EQUIPPED_ITEM, (UserConnection)wrapper.user());
        handItem.write((Type)Types.INT, (Object)entityId);
        handItem.write((Type)Types.SHORT, (Object)0);
        handItem.write(Types1_7_6.ITEM, (Object)item);
        wrapper.send(Protocolr1_3_1_2Tor1_4_2.class);
        handItem.send(Protocolr1_3_1_2Tor1_4_2.class);
        wrapper.cancel();
    }
}

