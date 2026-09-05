/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 */
package com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.Protocol1_21_4To1_21_2;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;

public final class EntityPacketRewriter1_21_4
extends EntityRewriter<ClientboundPacket1_21_2, Protocol1_21_4To1_21_2> {
    public EntityPacketRewriter1_21_4(Protocol1_21_4To1_21_2 protocol) {
        super((BackwardsProtocol)protocol, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).optionalComponentType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).booleanType);
    }

    protected void registerRewrites() {
        this.dataTypeMapper().register();
        this.registerEntityDataTypeHandler1_20_3(((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).itemType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).blockStateType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).optionalBlockStateType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).particleType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).particlesType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).componentType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_2.entityDataTypes).optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_21_4.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_21_4.CREAKING).removeIndex(19);
        this.filter().type((EntityType)EntityTypes1_21_4.CREAKING).removeIndex(18);
        this.filter().type((EntityType)EntityTypes1_21_4.SALMON).index(17).handler((event, data) -> {
            int typeId = (Integer)data.value();
            String type = switch (typeId) {
                case 0 -> "small";
                case 2 -> "large";
                default -> "medium";
            };
            data.setTypeAndValue(((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).stringType, (Object)type);
        });
    }

    public void registerPackets() {
        ((Protocol1_21_4To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.LOGIN, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough(Types.STRING_ARRAY);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            int dimensionId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            String world = (String)wrapper.passthrough(Types.STRING);
            this.trackWorldDataByKey1_20_5(wrapper.user(), dimensionId, world);
            this.trackPlayer(wrapper.user(), entityId);
            PacketWrapper playerLoadedPacket = wrapper.create((PacketType)ServerboundPackets1_21_4.PLAYER_LOADED);
            playerLoadedPacket.scheduleSendToServer(Protocol1_21_4To1_21_2.class);
        });
        ((Protocol1_21_4To1_21_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_2.RESPAWN, wrapper -> {
            int dimensionId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            String world = (String)wrapper.passthrough(Types.STRING);
            this.trackWorldDataByKey1_20_5(wrapper.user(), dimensionId, world);
            PacketWrapper playerLoadedPacket = wrapper.create((PacketType)ServerboundPackets1_21_4.PLAYER_LOADED);
            playerLoadedPacket.scheduleSendToServer(Protocol1_21_4To1_21_2.class);
        });
        ((Protocol1_21_4To1_21_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_2.MOVE_VEHICLE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_4.getTypeFromId((int)type);
    }
}

