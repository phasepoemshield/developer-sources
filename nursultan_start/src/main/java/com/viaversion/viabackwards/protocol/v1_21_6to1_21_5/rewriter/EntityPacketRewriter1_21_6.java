/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.Protocol1_21_6To1_21_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.Protocol1_21_6To1_21_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;

public final class EntityPacketRewriter1_21_6
extends EntityRewriter<ClientboundPacket1_21_6, Protocol1_21_6To1_21_5> {
    public EntityPacketRewriter1_21_6(Protocol1_21_6To1_21_5 protocol) {
        super((BackwardsProtocol)protocol, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_6.entityDataTypes).optionalComponentType, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_6.entityDataTypes).booleanType);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_6.HAPPY_GHAST, (EntityType)EntityTypes1_21_6.GHAST).tagName();
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 entityDataTypes = (EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes;
        this.dataTypeMapper().register();
        this.registerEntityDataTypeHandler1_20_3(entityDataTypes.itemType, entityDataTypes.blockStateType, entityDataTypes.optionalBlockStateType, entityDataTypes.particleType, entityDataTypes.particlesType, entityDataTypes.componentType, entityDataTypes.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_21_6.HANGING_ENTITY).removeIndex(8);
        this.filter().type((EntityType)EntityTypes1_21_6.HAPPY_GHAST).cancel(17);
        this.filter().type((EntityType)EntityTypes1_21_6.HAPPY_GHAST).cancel(18);
    }

    public void registerPackets() {
        ((Protocol1_21_6To1_21_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_6.ADD_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            int entityType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            short velocityX = (Short)wrapper.passthrough((Type)Types.SHORT);
            short velocityY = (Short)wrapper.passthrough((Type)Types.SHORT);
            short velocityZ = (Short)wrapper.passthrough((Type)Types.SHORT);
            this.getSpawnTrackerWithDataHandler1_19().handle(wrapper);
            if (!(velocityX == 0 && velocityY == 0 && velocityZ == 0 || this.typeFromId(entityType).isOrHasParent((EntityType)EntityTypes1_21_6.LIVING_ENTITY))) {
                PacketWrapper motionPacket = wrapper.create((PacketType)ClientboundPackets1_21_5.SET_ENTITY_MOTION);
                motionPacket.write((Type)Types.VAR_INT, (Object)entityId);
                motionPacket.write((Type)Types.SHORT, (Object)velocityX);
                motionPacket.write((Type)Types.SHORT, (Object)velocityY);
                motionPacket.write((Type)Types.SHORT, (Object)velocityZ);
                wrapper.send(Protocol1_21_6To1_21_5.class);
                motionPacket.send(Protocol1_21_6To1_21_5.class);
                wrapper.cancel();
            }
        });
        ((Protocol1_21_6To1_21_5)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_5.PLAYER_COMMAND, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int action = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (action < 2) {
                wrapper.cancel();
            }
            wrapper.write((Type)Types.VAR_INT, (Object)(action - 2));
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_6.getTypeFromId((int)type);
    }
}

