/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.Vector3d
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandler
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.Vector3d;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.Protocol1_21_7To1_21_9;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandler;
import com.viaversion.viaversion.util.Key;

public final class EntityPacketRewriter1_21_9
extends EntityRewriter<ClientboundPacket1_21_6, Protocol1_21_7To1_21_9> {
    public EntityPacketRewriter1_21_9(Protocol1_21_7To1_21_9 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 unmappedEntityDataTypes = (EntityDataTypes1_21_5)((Protocol1_21_7To1_21_9)this.protocol).types().entityDataTypes();
        EntityDataTypes1_21_9 entityDataTypes = (EntityDataTypes1_21_9)((Protocol1_21_7To1_21_9)this.protocol).mappedTypes().entityDataTypes();
        this.dataTypeMapper().added(entityDataTypes.copperGolemState).added(entityDataTypes.weatheringCopperState).removed(unmappedEntityDataTypes.compoundTagType).register();
        this.registerEntityDataTypeHandler(entityDataTypes.itemType, entityDataTypes.blockStateType, entityDataTypes.optionalBlockStateType, entityDataTypes.particleType, entityDataTypes.particlesType, entityDataTypes.componentType, entityDataTypes.optionalComponentType);
        EntityDataHandler shoulderDataHandler = (event, data) -> {
            CompoundTag value = (CompoundTag)data.value();
            if (value == null) {
                data.setTypeAndValue(((EntityDataTypes1_21_9)((Protocol1_21_7To1_21_9)this.protocol).mappedTypes().entityDataTypes).optionalVarIntType, null);
                return;
            }
            int variant = value.getInt("Variant", -1);
            if (variant != -1) {
                data.setTypeAndValue(((EntityDataTypes1_21_9)((Protocol1_21_7To1_21_9)this.protocol).mappedTypes().entityDataTypes).optionalVarIntType, (Object)variant);
            } else {
                data.setTypeAndValue(((EntityDataTypes1_21_9)((Protocol1_21_7To1_21_9)this.protocol).mappedTypes().entityDataTypes).optionalVarIntType, null);
            }
        };
        this.filter().type((EntityType)EntityTypes1_21_9.PLAYER).index(19).handler(shoulderDataHandler);
        this.filter().type((EntityType)EntityTypes1_21_9.PLAYER).index(20).handler(shoulderDataHandler);
        this.filter().type((EntityType)EntityTypes1_21_9.PLAYER).handler((event, data) -> {
            if (event.index() == 17) {
                event.setIndex(16);
            } else if (event.index() == 18) {
                event.setIndex(15);
            } else if (event.index() == 15 || event.index() == 16) {
                event.setIndex(event.index() + 2);
            }
        });
    }

    public void registerPackets() {
        ((Protocol1_21_7To1_21_9)this.protocol).replaceClientbound(ClientboundPackets1_21_6.ADD_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            int entityTypeId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write(Types.LOW_PRECISION_VECTOR, (Object)Vector3d.ZERO);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            int data = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            EntityType entityType = this.trackAndRewrite(wrapper, entityTypeId, entityId);
            if (((Protocol1_21_7To1_21_9)this.protocol).getMappingData() != null && entityType == EntityTypes1_21_9.FALLING_BLOCK) {
                int mappedBlockStateId = ((Protocol1_21_7To1_21_9)this.protocol).getMappingData().getNewBlockStateId(data);
                wrapper.set((Type)Types.VAR_INT, 2, (Object)mappedBlockStateId);
            }
            wrapper.set(Types.LOW_PRECISION_VECTOR, 0, (Object)this.readRelativeMovement(wrapper));
        });
        ((Protocol1_21_7To1_21_9)this.protocol).registerClientbound(ClientboundPackets1_21_6.SET_ENTITY_MOTION, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write(Types.LOW_PRECISION_VECTOR, (Object)this.readRelativeMovement(wrapper));
        });
        ((Protocol1_21_7To1_21_9)this.protocol).registerClientbound(ClientboundPackets1_21_6.PLAYER_ROTATION, wrapper -> {
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
        });
        ((Protocol1_21_7To1_21_9)this.protocol).registerClientbound(ClientboundPackets1_21_6.SET_DEFAULT_SPAWN_POSITION, wrapper -> {
            BlockPosition pos = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_14);
            String dimension = this.tracker(wrapper.user()).currentWorld();
            wrapper.write(Types.GLOBAL_POSITION, (Object)new GlobalBlockPosition(dimension, pos.x(), pos.y(), pos.z()));
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
        });
        ((Protocol1_21_7To1_21_9)this.protocol).getRegistryDataRewriter().addHandler("dimension_type", (key, dimension) -> {
            if (Key.equals((String)key, (String)"minecraft:the_end")) {
                dimension.putFloat("ambient_light", 0.25f);
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_9.getTypeFromId((int)type);
    }

    private Vector3d readRelativeMovement(PacketWrapper wrapper) {
        double movementX = (double)((Short)wrapper.read((Type)Types.SHORT)).shortValue() / 8000.0;
        double movementY = (double)((Short)wrapper.read((Type)Types.SHORT)).shortValue() / 8000.0;
        double movementZ = (double)((Short)wrapper.read((Type)Types.SHORT)).shortValue() / 8000.0;
        return new Vector3d(movementX, movementY, movementZ);
    }
}

