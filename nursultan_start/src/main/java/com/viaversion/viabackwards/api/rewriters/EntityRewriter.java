/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriterBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_14;

public abstract class EntityRewriter<C extends ClientboundPacketType, T extends BackwardsProtocol<C, ?, ?, ?>>
extends EntityRewriterBase<C, T> {
    protected EntityRewriter(T protocol) {
        this(protocol, Types1_14.ENTITY_DATA_TYPES.optionalComponentType, Types1_14.ENTITY_DATA_TYPES.booleanType);
    }

    protected EntityRewriter(T protocol, EntityDataType displayType, EntityDataType displayVisibilityType) {
        super(protocol, displayType, 2, displayVisibilityType, 3);
    }

    public void registerTrackerWithData(C packetType) {
        ((BackwardsProtocol)this.protocol).registerClientbound((ClientboundPacketType)packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.INT);
            this.getSpawnTrackerWithDataHandler().handle(wrapper);
        });
    }

    public void registerTracker(C packetType) {
        ((BackwardsProtocol)this.protocol).registerClientbound((ClientboundPacketType)packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.VAR_INT);
            this.trackAndMapEntity(wrapper);
        });
    }

    protected EntityType trackAndMapEntity(PacketWrapper wrapper) {
        int typeId = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
        EntityType entityType = this.typeFromId(typeId);
        if (entityType == null) {
            return null;
        }
        this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), entityType);
        int mappedTypeId = this.newEntityId(entityType.getId());
        if (typeId != mappedTypeId) {
            wrapper.set((Type)Types.VAR_INT, 1, (Object)mappedTypeId);
        }
        return entityType;
    }

    public PacketHandler worldTrackerHandlerByKey() {
        return wrapper -> {
            EntityTracker tracker = this.tracker(wrapper.user());
            String world = (String)wrapper.get(Types.STRING, 1);
            if (tracker.currentWorld() != null && !tracker.currentWorld().equals(world)) {
                tracker.clearEntities();
            }
            tracker.setCurrentWorld(world);
        };
    }

    public void registerTrackerWithData1_19(C packetType) {
        ((BackwardsProtocol)this.protocol).registerClientbound((ClientboundPacketType)packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            this.getSpawnTrackerWithDataHandler1_19().handle(wrapper);
        });
    }

    public PacketHandler getSpawnTrackerWithDataHandler() {
        return wrapper -> {
            EntityType entityType = this.trackAndMapEntity(wrapper);
            if (entityType == this.typeFromId("falling_block")) {
                int blockState = (Integer)wrapper.get((Type)Types.INT, 0);
                wrapper.set((Type)Types.INT, 0, (Object)((BackwardsProtocol)this.protocol).getMappingData().getNewBlockStateId(blockState));
            }
        };
    }

    public PacketHandler getSpawnTrackerWithDataHandler1_19() {
        return wrapper -> {
            if (((BackwardsProtocol)this.protocol).getMappingData() == null) {
                return;
            }
            EntityType entityType = this.trackAndMapEntity(wrapper);
            if (entityType == this.typeFromId("falling_block")) {
                int blockState = (Integer)wrapper.get((Type)Types.VAR_INT, 2);
                wrapper.set((Type)Types.VAR_INT, 2, (Object)((BackwardsProtocol)this.protocol).getMappingData().getNewBlockStateId(blockState));
            }
        };
    }
}

