/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Vector3d
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.storage.PlayerSneaking
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter;

import com.viaversion.viaversion.api.minecraft.Vector3d;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.Protocol1_21_11To26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.storage.PlayerSneaking;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public final class EntityPacketRewriter26_1
extends EntityRewriter<ClientboundPacket1_21_11, Protocol1_21_11To26_1> {
    public EntityPacketRewriter26_1(Protocol1_21_11To26_1 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        EntityDataTypes26_1 entityDataTypes = (EntityDataTypes26_1)((Protocol1_21_11To26_1)this.protocol).mappedTypes().entityDataTypes();
        this.dataTypeMapper().added(entityDataTypes.catSoundVariant).added(entityDataTypes.cowSoundVariant).added(entityDataTypes.pigSoundVariant).added(entityDataTypes.chickenSoundVariant).register();
        this.registerEntityDataTypeHandler(entityDataTypes.itemType, entityDataTypes.blockStateType, entityDataTypes.optionalBlockStateType, entityDataTypes.particleType, entityDataTypes.particlesType, entityDataTypes.componentType, entityDataTypes.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_21_11.VILLAGER).addIndex(19);
        this.filter().type((EntityType)EntityTypes1_21_11.ZOMBIE_VILLAGER).addIndex(21);
        this.filter().type((EntityType)EntityTypes1_21_11.ABSTRACT_AGEABLE).addIndex(17);
    }

    public void registerPackets() {
        ((Protocol1_21_11To26_1)this.protocol).appendClientbound(ClientboundPackets1_21_11.RESPAWN, wrapper -> ((PlayerSneaking)wrapper.user().get(PlayerSneaking.class)).setSneaking(false));
        ((Protocol1_21_11To26_1)this.protocol).registerServerbound(ServerboundPackets26_1.PLAYER_INPUT, wrapper -> {
            byte flags = (Byte)wrapper.passthrough((Type)Types.BYTE);
            boolean pressingShift = (flags & 0x20) != 0;
            ((PlayerSneaking)wrapper.user().get(PlayerSneaking.class)).setSneaking(pressingShift);
        });
        ((Protocol1_21_11To26_1)this.protocol).registerServerbound(ServerboundPackets26_1.INTERACT, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            int hand = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            Vector3d location = (Vector3d)wrapper.read(Types.LOW_PRECISION_VECTOR);
            boolean secondaryAction = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
            ((PlayerSneaking)wrapper.user().get(PlayerSneaking.class)).setSneaking(secondaryAction);
            PacketWrapper interactAtPacket = wrapper.create((PacketType)ServerboundPackets1_21_6.INTERACT);
            interactAtPacket.write((Type)Types.VAR_INT, (Object)entityId);
            interactAtPacket.write((Type)Types.VAR_INT, (Object)2);
            interactAtPacket.write((Type)Types.FLOAT, (Object)Float.valueOf((float)location.x()));
            interactAtPacket.write((Type)Types.FLOAT, (Object)Float.valueOf((float)location.y()));
            interactAtPacket.write((Type)Types.FLOAT, (Object)Float.valueOf((float)location.z()));
            interactAtPacket.write((Type)Types.VAR_INT, (Object)hand);
            interactAtPacket.write((Type)Types.BOOLEAN, (Object)secondaryAction);
            interactAtPacket.sendToServer(Protocol1_21_11To26_1.class);
        });
        ((Protocol1_21_11To26_1)this.protocol).registerServerbound(ServerboundPackets26_1.ATTACK, ServerboundPackets1_21_6.INTERACT, this::writeInteract);
        ((Protocol1_21_11To26_1)this.protocol).registerServerbound(ServerboundPackets26_1.SPECTATE_ENTITY, ServerboundPackets1_21_6.INTERACT, this::writeInteract);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_11.getTypeFromId((int)type);
    }

    private void writeInteract(PacketWrapper wrapper) {
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.write((Type)Types.VAR_INT, (Object)1);
        wrapper.write((Type)Types.BOOLEAN, (Object)((PlayerSneaking)wrapper.user().get(PlayerSneaking.class)).sneaking());
    }
}

