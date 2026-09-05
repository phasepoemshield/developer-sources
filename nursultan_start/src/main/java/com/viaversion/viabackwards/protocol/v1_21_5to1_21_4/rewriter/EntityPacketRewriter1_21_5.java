/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.storage.HorseDataStorage
 *  com.viaversion.viaversion.api.data.entity.TrackedEntity
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 */
package com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.Protocol1_21_5To1_21_4;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.storage.HorseDataStorage;
import com.viaversion.viaversion.api.data.entity.TrackedEntity;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import java.util.UUID;

public final class EntityPacketRewriter1_21_5
extends EntityRewriter<ClientboundPacket1_21_5, Protocol1_21_5To1_21_4> {
    public EntityPacketRewriter1_21_5(Protocol1_21_5To1_21_4 protocol) {
        super((BackwardsProtocol)protocol, ((EntityDataTypes1_21_2)protocol.mappedTypes().entityDataTypes()).optionalComponentType, ((EntityDataTypes1_21_2)protocol.mappedTypes().entityDataTypes()).booleanType);
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 entityDataTypes = (EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes;
        EntityDataTypes1_21_2 mappedEntityDataTypes = (EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes;
        this.dataTypeMapper().removed(entityDataTypes.cowVariantType).removed(entityDataTypes.wolfSoundVariantType).removed(entityDataTypes.pigVariantType).removed(entityDataTypes.chickenVariantType).skip(entityDataTypes.wolfVariantType).register();
        this.filter().dataType(entityDataTypes.wolfVariantType).handler((event, data) -> {
            int type = (Integer)data.value();
            Holder variant = Holder.of((int)type);
            data.setTypeAndValue(mappedEntityDataTypes.wolfVariantType, (Object)variant);
        });
        this.registerEntityDataTypeHandler1_20_3(mappedEntityDataTypes.itemType, mappedEntityDataTypes.blockStateType, mappedEntityDataTypes.optionalBlockStateType, mappedEntityDataTypes.particleType, mappedEntityDataTypes.particlesType, mappedEntityDataTypes.componentType, mappedEntityDataTypes.optionalComponentType);
        this.filter().dataType(mappedEntityDataTypes.frogVariantType).handler((event, data) -> {
            int n;
            int value = (Integer)data.value();
            String variantKey = ((Protocol1_21_5To1_21_4)this.protocol).getRegistryDataRewriter().getMappings("frog_variant").idToKey(value);
            if (variantKey == null) {
                n = 0;
            } else {
                switch (variantKey) {
                    case "cold": {
                        n = 2;
                        break;
                    }
                    case "temperate": {
                        n = 0;
                        break;
                    }
                    case "warm": {
                        n = 1;
                        break;
                    }
                    default: {
                        n = 0;
                    }
                }
            }
            int newValue = n;
            data.setValue((Object)newValue);
        });
        this.filter().dataType(mappedEntityDataTypes.catVariantType).handler((event, data) -> {
            int n;
            int value = (Integer)data.value();
            String variantKey = ((Protocol1_21_5To1_21_4)this.protocol).getRegistryDataRewriter().getMappings("cat_variant").idToKey(value);
            if (variantKey == null) {
                n = 1;
            } else {
                switch (variantKey) {
                    case "all_black": {
                        n = 10;
                        break;
                    }
                    case "black": {
                        n = 1;
                        break;
                    }
                    case "british_shorthair": {
                        n = 4;
                        break;
                    }
                    case "calico": {
                        n = 5;
                        break;
                    }
                    case "jellie": {
                        n = 9;
                        break;
                    }
                    case "persian": {
                        n = 6;
                        break;
                    }
                    case "ragdoll": {
                        n = 7;
                        break;
                    }
                    case "red": {
                        n = 2;
                        break;
                    }
                    case "siamese": {
                        n = 3;
                        break;
                    }
                    case "tabby": {
                        n = 0;
                        break;
                    }
                    case "white": {
                        n = 8;
                        break;
                    }
                    default: {
                        n = 1;
                    }
                }
            }
            int newValue = n;
            data.setValue((Object)newValue);
        });
        this.filter().type((EntityType)EntityTypes1_21_5.ABSTRACT_MINECART).addIndex(13);
        this.filter().type((EntityType)EntityTypes1_21_5.ABSTRACT_MINECART).index(11).handler((event, data) -> {
            int state = (Integer)data.getValue();
            if (state == 0) {
                event.cancel();
                return;
            }
            int mappedBlockState = ((Protocol1_21_5To1_21_4)this.protocol).getMappingData().getNewBlockStateId(state);
            data.setTypeAndValue(entityDataTypes.varIntType, (Object)mappedBlockState);
            event.createExtraData(new EntityData(13, mappedEntityDataTypes.booleanType, (Object)true));
        });
        this.filter().type((EntityType)EntityTypes1_21_5.MOOSHROOM).index(17).handler((event, data) -> {
            int typeId = (Integer)data.value();
            String typeName = typeId == 0 ? "red" : "brown";
            data.setTypeAndValue(entityDataTypes.stringType, (Object)typeName);
        });
        this.filter().type((EntityType)EntityTypes1_21_5.ABSTRACT_HORSE).index(17).handler((event, data) -> {
            HorseDataStorage horseDataStorage;
            TrackedEntity entity = event.trackedEntity();
            byte horseData = (Byte)data.value();
            boolean saddled = false;
            if (entity.hasData() && (horseDataStorage = (HorseDataStorage)entity.data().get(HorseDataStorage.class)) != null && horseDataStorage.saddled()) {
                saddled = true;
                data.setValue((Object)((byte)(horseData | 4)));
            }
            entity.data().put((Object)new HorseDataStorage(horseData, saddled));
        });
        this.filter().type((EntityType)EntityTypes1_21_5.CHICKEN).cancel(17);
        this.filter().type((EntityType)EntityTypes1_21_5.COW).cancel(17);
        this.filter().type((EntityType)EntityTypes1_21_5.PIG).cancel(18);
        this.filter().type((EntityType)EntityTypes1_21_5.WOLF).cancel(23);
        this.filter().type((EntityType)EntityTypes1_21_5.EXPERIENCE_ORB).cancel(8);
        this.filter().type((EntityType)EntityTypes1_21_5.DOLPHIN).addIndex(17);
        this.filter().type((EntityType)EntityTypes1_21_5.TURTLE).addIndex(17);
        this.filter().type((EntityType)EntityTypes1_21_5.PIG).addIndex(17);
        this.filter().type((EntityType)EntityTypes1_21_5.STRIDER).addIndex(19);
    }

    public void registerPackets() {
        ((Protocol1_21_5To1_21_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_5.ADD_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            UUID uuid = (UUID)wrapper.read(Types.UUID);
            int entityType = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (entityType != EntityTypes1_21_5.EXPERIENCE_ORB.getId()) {
                wrapper.write(Types.UUID, (Object)uuid);
                wrapper.write((Type)Types.VAR_INT, (Object)entityType);
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.VAR_INT);
                this.getSpawnTrackerWithDataHandler1_19().handle(wrapper);
                return;
            }
            this.tracker(wrapper.user()).addEntity(entityId, (EntityType)EntityTypes1_21_5.EXPERIENCE_ORB);
            wrapper.setPacketType((PacketType)ClientboundPackets1_21_2.ADD_EXPERIENCE_ORB);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.read((Type)Types.BYTE);
            wrapper.read((Type)Types.BYTE);
            wrapper.read((Type)Types.BYTE);
            int data = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.SHORT, (Object)((short)data));
            short velocityX = (Short)wrapper.read((Type)Types.SHORT);
            short velocityY = (Short)wrapper.read((Type)Types.SHORT);
            short velocityZ = (Short)wrapper.read((Type)Types.SHORT);
            if (velocityX != 0 || velocityY != 0 || velocityZ != 0) {
                PacketWrapper motionPacket = wrapper.create((PacketType)ClientboundPackets1_21_2.SET_ENTITY_MOTION);
                motionPacket.write((Type)Types.VAR_INT, (Object)entityId);
                motionPacket.write((Type)Types.SHORT, (Object)velocityX);
                motionPacket.write((Type)Types.SHORT, (Object)velocityY);
                motionPacket.write((Type)Types.SHORT, (Object)velocityZ);
                wrapper.send(Protocol1_21_5To1_21_4.class);
                motionPacket.send(Protocol1_21_5To1_21_4.class);
                wrapper.cancel();
            }
        });
        ((Protocol1_21_5To1_21_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_5.SET_PLAYER_TEAM, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                ((Protocol1_21_5To1_21_4)this.protocol).getComponentRewriter().passthroughAndProcess(wrapper);
                wrapper.passthrough((Type)Types.BYTE);
                int nametagVisibility = (Integer)wrapper.read((Type)Types.VAR_INT);
                int collisionRule = (Integer)wrapper.read((Type)Types.VAR_INT);
                wrapper.write(Types.STRING, (Object)this.visibility(nametagVisibility));
                wrapper.write(Types.STRING, (Object)this.collision(collisionRule));
                wrapper.passthrough((Type)Types.VAR_INT);
                ((Protocol1_21_5To1_21_4)this.protocol).getComponentRewriter().passthroughAndProcess(wrapper);
                ((Protocol1_21_5To1_21_4)this.protocol).getComponentRewriter().passthroughAndProcess(wrapper);
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_5.getTypeFromId((int)type);
    }

    private String collision(int id) {
        return switch (id) {
            case 0 -> "always";
            case 1 -> "never";
            case 2 -> "pushOtherTeams";
            case 3 -> "pushOwnTeam";
            default -> "always";
        };
    }

    private String visibility(int id) {
        return switch (id) {
            case 0 -> "always";
            case 1 -> "never";
            case 2 -> "hideForOtherTeams";
            case 3 -> "hideForOwnTeam";
            default -> "always";
        };
    }
}

