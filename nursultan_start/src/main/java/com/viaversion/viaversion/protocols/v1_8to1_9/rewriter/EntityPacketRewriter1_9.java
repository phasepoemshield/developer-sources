/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.EulerAngle
 *  com.viaversion.viaversion.api.minecraft.Vector
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_8
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.data.EntityDataIndex1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.rewriter.EntityPacketRewriter1_9$14
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Pair
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.Triple
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_8to1_9.rewriter;

import com.google.common.collect.ImmutableList;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.EulerAngle;
import com.viaversion.viaversion.api.minecraft.Vector;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_8;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.data.EntityDataIndex1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.rewriter.EntityPacketRewriter1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.rewriter.SpawnPacketRewriter1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.EntityTracker1_9;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Pair;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.Triple;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class EntityPacketRewriter1_9
extends EntityRewriter<ClientboundPackets1_8, Protocol1_8To1_9> {
    public static final ValueTransformer<Byte, Short> toNewShort = new ValueTransformer<Byte, Short>((Type)Types.SHORT){

        public Short transform(PacketWrapper wrapper, Byte inputValue) {
            return (short)(inputValue * 128);
        }
    };

    static /* synthetic */ Protocol access$000(EntityPacketRewriter1_9 entityPacketRewriter1_9) {
        return entityPacketRewriter1_9.protocol;
    }

    public EntityPacketRewriter1_9(Protocol1_8To1_9 protocol1_8To1_9) {
        super(protocol1_8To1_9);
    }

    private void handleEntityData(EntityDataHandlerEvent entityDataHandlerEvent, EntityData entityData) {
        EntityType entityType = entityDataHandlerEvent.entityType();
        EntityDataIndex1_9 entityDataIndex1_9 = EntityDataIndex1_9.searchIndex((EntityType)entityType, (int)entityData.id());
        if (entityDataIndex1_9 == null) {
            entityDataHandlerEvent.cancel();
            return;
        }
        if (entityDataIndex1_9.getNewType() == null) {
            entityDataHandlerEvent.cancel();
            return;
        }
        entityData.setId(entityDataIndex1_9.getNewIndex());
        entityData.setDataTypeUnsafe((EntityDataType)entityDataIndex1_9.getNewType());
        Object object = entityData.getValue();
        switch (14.$SwitchMap$com$viaversion$viaversion$api$minecraft$entitydata$types$EntityDataTypes1_9[entityDataIndex1_9.getNewType().ordinal()]) {
            case 1: {
                if (entityDataIndex1_9.getOldType() == EntityDataTypes1_8.BYTE) {
                    entityData.setValue(object);
                }
                if (entityDataIndex1_9.getOldType() == EntityDataTypes1_8.INT) {
                    entityData.setValue((Object)((Integer)object).byteValue());
                }
                if (entityDataIndex1_9 != EntityDataIndex1_9.ENTITY_STATUS) break;
                CallbackInfo callbackInfo = new CallbackInfo("", true);
                this.handler$dhg000$viafabricplus$preventMetadataForClientPlayer(entityDataHandlerEvent, entityData, callbackInfo);
                if (callbackInfo.isCancelled()) {
                    return;
                }
                if (entityType != EntityTypes1_9.EntityType.PLAYER) break;
                byte by = 0;
                if (((Byte)object & 0x10) == 16) {
                    by = 1;
                }
                int n = EntityDataIndex1_9.PLAYER_HAND.getNewIndex();
                EntityDataTypes1_9 entityDataTypes1_9 = EntityDataIndex1_9.PLAYER_HAND.getNewType();
                entityDataHandlerEvent.createExtraData(new EntityData(n, (EntityDataType)entityDataTypes1_9, (Object)by));
                break;
            }
            case 2: {
                String string = (String)object;
                UUID uUID = null;
                if (!string.isEmpty()) {
                    try {
                        uUID = UUID.fromString(string);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                entityData.setValue(uUID);
                break;
            }
            case 3: {
                if (entityDataIndex1_9.getOldType() == EntityDataTypes1_8.BYTE) {
                    entityData.setValue((Object)((Byte)object).intValue());
                }
                if (entityDataIndex1_9.getOldType() == EntityDataTypes1_8.SHORT) {
                    entityData.setValue((Object)((Short)object).intValue());
                }
                if (entityDataIndex1_9.getOldType() != EntityDataTypes1_8.INT) break;
                entityData.setValue(object);
                break;
            }
            case 4: 
            case 5: {
                entityData.setValue(object);
                break;
            }
            case 6: {
                if (entityDataIndex1_9 == EntityDataIndex1_9.ABSTRACT_AGEABLE_AGE) {
                    entityData.setValue((Object)((Byte)object < 0 ? 1 : 0));
                    break;
                }
                entityData.setValue((Object)((Byte)object != 0 ? 1 : 0));
                break;
            }
            case 7: {
                entityData.setValue(object);
                ((Protocol1_8To1_9)this.protocol).getItemRewriter().handleItemToClient(entityDataHandlerEvent.user(), (Item)entityData.getValue());
                break;
            }
            case 8: {
                Vector vector = (Vector)object;
                entityData.setValue((Object)vector);
                break;
            }
            case 9: {
                EulerAngle eulerAngle = (EulerAngle)object;
                entityData.setValue((Object)eulerAngle);
                break;
            }
            case 10: {
                String string = (String)object;
                entityData.setValue((Object)ComponentUtil.convertJsonOrEmpty((String)string, (SerializerVersion)SerializerVersion.V1_8, (SerializerVersion)SerializerVersion.V1_9));
                break;
            }
            case 11: {
                entityData.setValue((Object)((Number)object).intValue());
                break;
            }
            default: {
                throw new RuntimeException("Unhandled EntityDataType: " + String.valueOf(entityDataIndex1_9.getNewType()));
            }
        }
    }

    public EntityType objectTypeFromId(int n, int n2) {
        return EntityTypes1_9.ObjectType.getEntityType((int)n, (int)n2);
    }

    protected void registerRewrites() {
        this.filter().handler(this::handleEntityData);
    }

    protected void registerPackets() {
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.SET_ENTITY_LINK, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    short leashState = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    if (leashState == 0) {
                        int passenger = (Integer)wrapper.get((Type)Types.INT, 0);
                        int vehicle = (Integer)wrapper.get((Type)Types.INT, 1);
                        wrapper.cancel();
                        PacketWrapper passengerPacket = wrapper.create((PacketType)ClientboundPackets1_9.SET_PASSENGERS);
                        if (vehicle == -1) {
                            if (!tracker.getVehicleMap().containsKey(passenger)) {
                                return;
                            }
                            passengerPacket.write((Type)Types.VAR_INT, (Object)tracker.getVehicleMap().remove(passenger));
                            passengerPacket.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[0]);
                        } else {
                            passengerPacket.write((Type)Types.VAR_INT, (Object)vehicle);
                            passengerPacket.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[]{passenger});
                            tracker.getVehicleMap().put(passenger, vehicle);
                        }
                        passengerPacket.send(Protocol1_8To1_9.class);
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.TELEPORT_ENTITY, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT, SpawnPacketRewriter1_9.toNewDouble);
                this.map((Type)Types.INT, SpawnPacketRewriter1_9.toNewDouble);
                this.map((Type)Types.INT, SpawnPacketRewriter1_9.toNewDouble);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    EntityTracker1_9 tracker;
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (Via.getConfig().isHologramPatch() && (tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class)).getKnownHolograms().contains(entityID)) {
                        Double newValue = (Double)wrapper.get((Type)Types.DOUBLE, 1);
                        newValue = newValue + Via.getConfig().getHologramYOffset();
                        wrapper.set((Type)Types.DOUBLE, 1, (Object)newValue);
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.MOVE_ENTITY_POS_ROT, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE, toNewShort);
                this.map((Type)Types.BYTE, toNewShort);
                this.map((Type)Types.BYTE, toNewShort);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.MOVE_ENTITY_POS, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE, toNewShort);
                this.map((Type)Types.BYTE, toNewShort);
                this.map((Type)Types.BYTE, toNewShort);
                this.map((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.SET_EQUIPPED_ITEM, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.SHORT, (ValueTransformer)new ValueTransformer<Short, Integer>(this, (Type)Types.VAR_INT){
                    final /* synthetic */ 6 this$1;
                    {
                        this.this$1 = this$1;
                        super(arg0);
                    }

                    public Integer transform(PacketWrapper wrapper, Short slot) {
                        int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                        int receiverId = wrapper.user().getEntityTracker(Protocol1_8To1_9.class).clientEntityId();
                        if (slot < 0 || slot > 4 || entityId == receiverId && slot > 3) {
                            wrapper.cancel();
                            return 0;
                        }
                        if (entityId == receiverId) {
                            return slot.intValue() + 2;
                        }
                        return slot > 0 ? slot.intValue() + 1 : slot.intValue();
                    }
                });
                this.map(Types.ITEM1_8);
                this.handler(wrapper -> {
                    Item stack = (Item)wrapper.get(Types.ITEM1_8, 0);
                    ((Protocol1_8To1_9)EntityPacketRewriter1_9.access$000(this.this$0)).getItemRewriter().handleItemToClient(wrapper.user(), stack);
                });
                this.handler(wrapper -> {
                    EntityTracker1_9 entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    Item stack = (Item)wrapper.get(Types.ITEM1_8, 0);
                    if (stack != null && Protocol1_8To1_9.isSword(stack.identifier())) {
                        entityTracker.getValidBlocking().add(entityID);
                        return;
                    }
                    entityTracker.getValidBlocking().remove(entityID);
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.SET_ENTITY_DATA, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.ENTITY_DATA_LIST1_8, Types.ENTITY_DATA_LIST1_9);
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    if (tracker.hasEntity(entityId)) {
                        this.this$0.handleEntityData(entityId, entityDataList, wrapper.user());
                    } else {
                        wrapper.cancel();
                    }
                });
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    int entityID = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.handleEntityData(entityID, entityDataList);
                });
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    if (entityDataList.isEmpty()) {
                        wrapper.cancel();
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.UPDATE_MOB_EFFECT, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    boolean showParticles = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    boolean newEffect = Via.getConfig().isNewEffectIndicator();
                    wrapper.write((Type)Types.BYTE, (Object)((byte)(showParticles ? (newEffect ? 2 : 1) : 0)));
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).cancelClientbound(ClientboundPackets1_8.UPDATE_ENTITY_NBT);
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.PLAYER_COMBAT, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    if ((Integer)wrapper.get((Type)Types.VAR_INT, 0) == 2) {
                        wrapper.passthrough((Type)Types.VAR_INT);
                        wrapper.passthrough((Type)Types.INT);
                        Protocol1_8To1_9.STRING_TO_JSON.write(wrapper, (Object)((String)wrapper.read(Types.STRING)));
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.UPDATE_ATTRIBUTES, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    if (((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue() != tracker.getProvidedEntityId()) {
                        return;
                    }
                    int propertiesToRead = (Integer)wrapper.read((Type)Types.INT);
                    HashMap<String, Pair> properties = new HashMap<String, Pair>(propertiesToRead);
                    for (int i = 0; i < propertiesToRead; ++i) {
                        String key = (String)wrapper.read(Types.STRING);
                        Double value = (Double)wrapper.read((Type)Types.DOUBLE);
                        int modifiersToRead = (Integer)wrapper.read((Type)Types.VAR_INT);
                        ArrayList<Triple> modifiers = new ArrayList<Triple>(modifiersToRead);
                        for (int j = 0; j < modifiersToRead; ++j) {
                            modifiers.add(new Triple((Object)((UUID)wrapper.read(Types.UUID)), (Object)((Double)wrapper.read((Type)Types.DOUBLE)), (Object)((Byte)wrapper.read((Type)Types.BYTE))));
                        }
                        properties.put(key, new Pair((Object)value, modifiers));
                    }
                    properties.put("generic.attackSpeed", new Pair((Object)20.0, (Object)ImmutableList.of((Object)new Triple((Object)UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), (Object)0.0, (Object)0), (Object)new Triple((Object)UUID.fromString("AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3"), (Object)0.0, (Object)2), (Object)new Triple((Object)UUID.fromString("55FCED67-E92A-486E-9800-B47F202C4386"), (Object)0.0, (Object)2))));
                    wrapper.write((Type)Types.INT, (Object)properties.size());
                    for (Map.Entry<K, V> entry : properties.entrySet()) {
                        wrapper.write(Types.STRING, (Object)((String)entry.getKey()));
                        wrapper.write((Type)Types.DOUBLE, (Object)((Double)((Pair)entry.getValue()).key()));
                        wrapper.write((Type)Types.VAR_INT, (Object)((List)((Pair)entry.getValue()).value()).size());
                        for (Triple modifier : (List)((Pair)entry.getValue()).value()) {
                            wrapper.write(Types.UUID, (Object)((UUID)modifier.first()));
                            wrapper.write((Type)Types.DOUBLE, (Object)((Double)modifier.second()));
                            wrapper.write((Type)Types.BYTE, (Object)((Byte)modifier.third()));
                        }
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerClientbound(ClientboundPackets1_8.ANIMATE, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    if ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0) == 3) {
                        wrapper.cancel();
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerServerbound(ServerboundPackets1_9.PLAYER_COMMAND, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (action == 6 || action == 8) {
                        wrapper.cancel();
                    }
                    if (action == 7) {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)6);
                    }
                });
            }
        });
        ((Protocol1_8To1_9)this.protocol).registerServerbound(ServerboundPackets1_9.INTERACT, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_9 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int hand;
                    int type = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (type == 2) {
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.FLOAT);
                    }
                    if ((type == 0 || type == 2) && (hand = ((Integer)wrapper.read((Type)Types.VAR_INT)).intValue()) == 1) {
                        wrapper.cancel();
                    }
                });
            }
        });
    }

    public EntityType typeFromId(int n) {
        return EntityTypes1_9.EntityType.findById((int)n);
    }

    private void handler$dhg000$viafabricplus$preventMetadataForClientPlayer(EntityDataHandlerEvent entityDataHandlerEvent, EntityData entityData, CallbackInfo callbackInfo) {
        if (entityDataHandlerEvent.user().getEntityTracker(Protocol1_8To1_9.class).clientEntityId() == entityDataHandlerEvent.entityId()) {
            callbackInfo.cancel();
        }
    }
}

