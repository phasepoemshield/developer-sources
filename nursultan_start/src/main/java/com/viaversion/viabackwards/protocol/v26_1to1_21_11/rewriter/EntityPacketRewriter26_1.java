/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v26_1to1_21_11.storage.GameModeStorage
 *  com.viaversion.viaversion.api.minecraft.GameMode
 *  com.viaversion.viaversion.api.minecraft.Vector3d
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 */
package com.viaversion.viabackwards.protocol.v26_1to1_21_11.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v26_1to1_21_11.Protocol26_1To1_21_11;
import com.viaversion.viabackwards.protocol.v26_1to1_21_11.storage.GameModeStorage;
import com.viaversion.viaversion.api.minecraft.GameMode;
import com.viaversion.viaversion.api.minecraft.Vector3d;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;

public final class EntityPacketRewriter26_1
extends EntityRewriter<ClientboundPacket26_1, Protocol26_1To1_21_11> {
    private static final int INTERACT_ACTION = 0;
    private static final int ATTACK_ACTION = 1;
    private static final int INTERACT_AT_ACTION = 2;

    public EntityPacketRewriter26_1(Protocol26_1To1_21_11 protocol) {
        super((BackwardsProtocol)protocol, ((EntityDataTypes1_21_11)VersionedTypes.V1_21_11.entityDataTypes).optionalComponentType, ((EntityDataTypes1_21_11)VersionedTypes.V1_21_11.entityDataTypes).booleanType);
    }

    protected void registerRewrites() {
        EntityDataTypes26_1 entityDataTypes = (EntityDataTypes26_1)VersionedTypes.V26_1.entityDataTypes;
        EntityDataTypes1_21_11 mappedEntityDataTypes = (EntityDataTypes1_21_11)VersionedTypes.V1_21_11.entityDataTypes;
        this.dataTypeMapper().removed(entityDataTypes.catSoundVariant).removed(entityDataTypes.cowSoundVariant).removed(entityDataTypes.pigSoundVariant).removed(entityDataTypes.chickenSoundVariant).register();
        this.registerEntityDataTypeHandler1_20_3(mappedEntityDataTypes.itemType, mappedEntityDataTypes.blockStateType, mappedEntityDataTypes.optionalBlockStateType, mappedEntityDataTypes.particleType, mappedEntityDataTypes.particlesType, mappedEntityDataTypes.componentType, mappedEntityDataTypes.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_21_11.ZOMBIE_VILLAGER).removeIndex(21);
        this.filter().type((EntityType)EntityTypes1_21_11.VILLAGER).removeIndex(20);
        this.filter().type((EntityType)EntityTypes1_21_11.CAT).removeIndex(24);
        this.filter().type((EntityType)EntityTypes1_21_11.CHICKEN).removeIndex(19);
        this.filter().type((EntityType)EntityTypes1_21_11.PIG).removeIndex(20);
        this.filter().type((EntityType)EntityTypes1_21_11.COW).removeIndex(19);
        this.filter().type((EntityType)EntityTypes1_21_11.TADPOLE).removeIndex(17);
        this.filter().type((EntityType)EntityTypes1_21_11.ABSTRACT_AGEABLE).removeIndex(17);
    }

    public void registerPackets() {
        ((Protocol26_1To1_21_11)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets26_1.RESPAWN, wrapper -> {
            byte gamemode = (Byte)wrapper.get((Type)Types.BYTE, 0);
            ((GameModeStorage)wrapper.user().get(GameModeStorage.class)).setGameMode((int)gamemode);
        });
        ((Protocol26_1To1_21_11)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets26_1.LOGIN, wrapper -> {
            byte gamemode = (Byte)wrapper.get((Type)Types.BYTE, 0);
            ((GameModeStorage)wrapper.user().get(GameModeStorage.class)).setGameMode((int)gamemode);
        });
        ((Protocol26_1To1_21_11)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_21_6.INTERACT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int action = (Integer)wrapper.read((Type)Types.VAR_INT);
            switch (action) {
                case 0: {
                    wrapper.cancel();
                    break;
                }
                case 1: {
                    boolean spectator = ((GameModeStorage)wrapper.user().get(GameModeStorage.class)).gameMode() == GameMode.SPECTATOR.id();
                    wrapper.setPacketType((PacketType)(spectator ? ServerboundPackets26_1.SPECTATE_ENTITY : ServerboundPackets26_1.ATTACK));
                    wrapper.read((Type)Types.BOOLEAN);
                    break;
                }
                case 2: {
                    float x = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
                    float y = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
                    float z = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.write(Types.LOW_PRECISION_VECTOR, (Object)new Vector3d((double)x, (double)y, (double)z));
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid interact action");
                }
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_11.getTypeFromId((int)type);
    }
}

