/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.api.util.PacketUtil
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.rewriter.EntityDataRewriter
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.rewriter.SoundRewriter
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.storage.AttachTracker
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.storage.EntityTracker
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.api.util.PacketUtil;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ClientboundPackets1_5_2;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.rewriter.EntityDataRewriter;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.rewriter.ItemRewriter;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.rewriter.SoundRewriter;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.storage.AttachTracker;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.storage.EntityTracker;
import net.raphimc.vialegacy.protocol.release.r1_6_1tor1_6_2.packet.ClientboundPackets1_6_1;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.packet.ServerboundPackets1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_5_2Tor1_6_1
extends StatelessProtocol<ClientboundPackets1_5_2, ClientboundPackets1_6_1, ServerboundPackets1_5_2, ServerboundPackets1_6_4> {
    private final ItemRewriter itemRewriter = new ItemRewriter(this);

    public Protocolr1_5_2Tor1_6_1() {
        super(ClientboundPackets1_5_2.class, ClientboundPackets1_6_1.class, ServerboundPackets1_5_2.class, ServerboundPackets1_6_4.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolr1_5_2Tor1_6_1.class, ClientboundPackets1_5_2::getPacket));
        userConnection.put((StorableObject)new EntityTracker());
        userConnection.put((StorableObject)new AttachTracker());
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(ClientboundPackets1_5_2.LOGIN, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound(ClientboundPackets1_5_2.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types1_6_4.STRING, msg -> TextComponentSerializer.V1_6.serialize((TextComponent)new StringComponent(msg)));
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.SET_HEALTH, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.SHORT, (Type)Types.FLOAT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.FLOAT);
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.UNSIGNED_SHORT);
                this.map(Types1_6_4.ENTITY_DATA_LIST);
                this.handler(wrapper -> EntityDataRewriter.transform((EntityTypes1_8.EntityType)EntityTypes1_8.EntityType.PLAYER, (List)((List)wrapper.get(Types1_6_4.ENTITY_DATA_LIST, 0))));
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    ((EntityTracker)wrapper.user().get(EntityTracker.class)).getTrackedEntities().put(entityId, EntityTypes1_8.EntityType.PLAYER);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.TAKE_ITEM_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> ((EntityTracker)wrapper.user().get(EntityTracker.class)).getTrackedEntities().remove(wrapper.get((Type)Types.INT, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int data;
                    int entityID = (Integer)wrapper.get((Type)Types.INT, 0);
                    byte typeID = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    EntityTypes1_8.EntityType entityType = EntityTypes1_8.ObjectType.getEntityType((int)typeID, (int)(data = ((Integer)wrapper.get((Type)Types.INT, 4)).intValue()));
                    if (entityType != null) {
                        ((EntityTracker)wrapper.user().get(EntityTracker.class)).getTrackedEntities().put(entityID, entityType);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types1_6_4.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.INT, 0);
                    short typeID = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    EntityTypes1_8.EntityType entityType = EntityTypes1_8.EntityType.findById((int)typeID);
                    if (entityType == null) {
                        wrapper.cancel();
                        return;
                    }
                    List entityDataList = (List)wrapper.get(Types1_6_4.ENTITY_DATA_LIST, 0);
                    ((EntityTracker)wrapper.user().get(EntityTracker.class)).getTrackedEntities().put(entityID, entityType);
                    EntityDataRewriter.transform((EntityTypes1_8.EntityType)entityType, (List)entityDataList);
                    if (entityType.isOrHasParent((EntityType)EntityTypes1_8.EntityType.WOLF)) {
                        Protocolr1_5_2Tor1_6_1.this.handleWolfEntityData(entityID, entityDataList, wrapper);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.ADD_PAINTING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.STRING);
                this.map(Types1_7_6.BLOCK_POSITION_INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.INT, 0);
                    ((EntityTracker)wrapper.user().get(EntityTracker.class)).getTrackedEntities().put(entityID, EntityTypes1_8.EntityType.PAINTING);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.ADD_EXPERIENCE_ORB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    int entityID = (Integer)wrapper.get((Type)Types.INT, 0);
                    ((EntityTracker)wrapper.user().get(EntityTracker.class)).getTrackedEntities().put(entityID, EntityTypes1_8.EntityType.EXPERIENCE_ORB);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.REMOVE_ENTITIES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.INT_ARRAY);
                this.handler(wrapper -> {
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    for (int entityId : (int[])wrapper.get(Types1_7_6.INT_ARRAY, 0)) {
                        tracker.getTrackedEntities().remove(entityId);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.SET_ENTITY_LINK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    AttachTracker attachTracker = (AttachTracker)wrapper.user().get(AttachTracker.class);
                    EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    int ridingId = (Integer)wrapper.get((Type)Types.INT, 0);
                    int vehicleId = (Integer)wrapper.get((Type)Types.INT, 1);
                    if (entityTracker.getPlayerID() == ridingId) {
                        attachTracker.vehicleEntityId = vehicleId;
                    }
                });
                this.create((Type)Types.UNSIGNED_BYTE, (short)0);
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.SET_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.ENTITY_DATA_LIST);
                this.handler(wrapper -> {
                    EntityTracker tracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
                    List entityDataList = (List)wrapper.get(Types1_6_4.ENTITY_DATA_LIST, 0);
                    int entityID = (Integer)wrapper.get((Type)Types.INT, 0);
                    EntityTypes1_8.EntityType entityType = (EntityTypes1_8.EntityType)tracker.getTrackedEntities().get(entityID);
                    if (tracker.getTrackedEntities().containsKey(entityID)) {
                        EntityDataRewriter.transform((EntityTypes1_8.EntityType)entityType, (List)entityDataList);
                        if (entityDataList.isEmpty()) {
                            wrapper.cancel();
                        }
                        if (entityType.isOrHasParent((EntityType)EntityTypes1_8.EntityType.WOLF)) {
                            Protocolr1_5_2Tor1_6_1.this.handleWolfEntityData(entityID, entityDataList, wrapper);
                        }
                    } else {
                        wrapper.cancel();
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String oldSound = (String)wrapper.read(Types1_6_4.STRING);
                    String newSound = SoundRewriter.map((String)oldSound);
                    if (oldSound.isEmpty()) {
                        newSound = "";
                    }
                    if (newSound == null) {
                        if (Via.getConfig().logOtherConversionWarnings()) {
                            ViaLegacy.getPlatform().getLogger().warning("Unable to map 1.5.2 sound '" + oldSound + "'");
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
        this.registerClientbound(ClientboundPackets1_5_2.AWARD_STATS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.PLAYER_ABILITIES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    float flySpeed = (float)((Byte)wrapper.read((Type)Types.BYTE)).byteValue() / 255.0f;
                    float walkSpeed = (float)((Byte)wrapper.read((Type)Types.BYTE)).byteValue() / 255.0f;
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(flySpeed));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(walkSpeed));
                    PacketWrapper entityProperties = PacketWrapper.create((PacketType)ClientboundPackets1_6_1.UPDATE_ATTRIBUTES, (UserConnection)wrapper.user());
                    entityProperties.write((Type)Types.INT, (Object)((EntityTracker)wrapper.user().get(EntityTracker.class)).getPlayerID());
                    entityProperties.write((Type)Types.INT, (Object)1);
                    entityProperties.write(Types1_6_4.STRING, (Object)"generic.movementSpeed");
                    entityProperties.write((Type)Types.DOUBLE, (Object)walkSpeed);
                    wrapper.send(Protocolr1_5_2Tor1_6_1.class);
                    entityProperties.send(Protocolr1_5_2Tor1_6_1.class);
                    wrapper.cancel();
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_5_2.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    String channel = (String)wrapper.read(Types1_6_4.STRING);
                    short length = (Short)wrapper.read((Type)Types.SHORT);
                    try {
                        if (channel.equals("MC|TPack")) {
                            channel = "MC|RPack";
                            String[] data = new String((byte[])wrapper.read(Types.REMAINING_BYTES), StandardCharsets.UTF_8).split("\u0000");
                            String url = data[0];
                            String resolution = data[1];
                            if (!resolution.equals("16")) {
                                wrapper.cancel();
                                return;
                            }
                            wrapper.write(Types.REMAINING_BYTES, (Object)url.getBytes(StandardCharsets.UTF_8));
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
        this.registerServerbound(ServerboundPackets1_6_4.SERVER_PING, wrapper -> {
            wrapper.clearPacket();
            wrapper.write((Type)Types.BYTE, (Object)1);
        });
        this.registerServerbound(ServerboundPackets1_6_4.PLAYER_COMMAND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.read((Type)Types.INT);
                this.handler(wrapper -> {
                    if ((Byte)wrapper.get((Type)Types.BYTE, 0) > 5) {
                        wrapper.cancel();
                    }
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_6_4.PLAYER_INPUT, ServerboundPackets1_5_2.INTERACT, wrapper -> {
            AttachTracker attachTracker = (AttachTracker)wrapper.user().get(AttachTracker.class);
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            wrapper.read((Type)Types.FLOAT);
            wrapper.read((Type)Types.FLOAT);
            wrapper.read((Type)Types.BOOLEAN);
            boolean sneaking = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (attachTracker.lastSneakState != sneaking) {
                attachTracker.lastSneakState = sneaking;
                if (sneaking) {
                    wrapper.write((Type)Types.INT, (Object)entityTracker.getPlayerID());
                    wrapper.write((Type)Types.INT, (Object)attachTracker.vehicleEntityId);
                    wrapper.write((Type)Types.BYTE, (Object)0);
                    return;
                }
            }
            wrapper.cancel();
        });
        this.registerServerbound(ServerboundPackets1_6_4.PLAYER_ABILITIES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.FLOAT, (Type)Types.BYTE, f -> (byte)(f.floatValue() * 255.0f));
                this.map((Type)Types.FLOAT, (Type)Types.BYTE, f -> (byte)(f.floatValue() * 255.0f));
            }
        });
    }

    public ItemRewriter getItemRewriter() {
        return this.itemRewriter;
    }

    private void handleWolfEntityData(int entityId, List<EntityData> entityDataList, PacketWrapper wrapper) {
        for (EntityData entityData : entityDataList) {
            EntityDataIndex1_7_6 index = EntityDataIndex1_7_6.searchIndex((EntityTypes1_8.EntityType)EntityTypes1_8.EntityType.WOLF, (int)entityData.id());
            if (index != EntityDataIndex1_7_6.TAMEABLE_FLAGS) continue;
            if (((Byte)entityData.value() & 4) == 0) break;
            PacketWrapper attributes = PacketWrapper.create((PacketType)ClientboundPackets1_6_1.UPDATE_ATTRIBUTES, (UserConnection)wrapper.user());
            attributes.write((Type)Types.INT, (Object)entityId);
            attributes.write((Type)Types.INT, (Object)1);
            attributes.write(Types1_6_4.STRING, (Object)"generic.maxHealth");
            attributes.write((Type)Types.DOUBLE, (Object)20.0);
            wrapper.send(Protocolr1_5_2Tor1_6_1.class);
            attributes.send(Protocolr1_5_2Tor1_6_1.class);
            wrapper.cancel();
            break;
        }
    }
}

