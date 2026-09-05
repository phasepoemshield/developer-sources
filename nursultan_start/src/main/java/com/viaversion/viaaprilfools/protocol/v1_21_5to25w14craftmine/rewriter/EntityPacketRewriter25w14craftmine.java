/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.GameMode
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter;

import com.viaversion.viaaprilfools.api.minecraft.entities.EntityTypes25w14craftmine;
import com.viaversion.viaaprilfools.api.types.VAFTypes;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.Protocol1_21_5To_25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPackets25w14craftmine;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.GameMode;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public final class EntityPacketRewriter25w14craftmine
extends EntityRewriter<ClientboundPacket1_21_5, Protocol1_21_5To_25w14craftmine> {
    private static final int[] UNLOCKED_PLAYER_EFFECTS = new int[]{15, 20, 21, 22, 24, 79};

    public EntityPacketRewriter25w14craftmine(Protocol1_21_5To_25w14craftmine protocol) {
        super((Protocol)protocol);
    }

    public void registerPackets() {
        this.registerTrackerWithData1_19((ClientboundPacketType)ClientboundPackets1_21_5.ADD_ENTITY);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_21_5.SET_ENTITY_DATA);
        this.registerRemoveEntities((ClientboundPacketType)ClientboundPackets1_21_5.REMOVE_ENTITIES);
        this.registerPlayerAbilities((ClientboundPacketType)ClientboundPackets1_21_5.PLAYER_ABILITIES);
        this.registerGameEvent((ClientboundPacketType)ClientboundPackets1_21_5.GAME_EVENT);
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_5.LOGIN, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough(Types.STRING_ARRAY);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            this.updatePlayerSpawnInfo(wrapper);
            this.trackPlayer(wrapper.user(), entityId);
            wrapper.send(Protocol1_21_5To_25w14craftmine.class);
            wrapper.cancel();
            PacketWrapper updatePlayerUnlocks = PacketWrapper.create((PacketType)ClientboundPackets25w14craftmine.UPDATE_PLAYER_UNLOCKS, (UserConnection)wrapper.user());
            updatePlayerUnlocks.write((Type)Types.VAR_INT, (Object)entityId);
            updatePlayerUnlocks.write((Type)Types.BOOLEAN, (Object)true);
            updatePlayerUnlocks.write((Type)Types.VAR_INT, (Object)UNLOCKED_PLAYER_EFFECTS.length);
            for (int effect : UNLOCKED_PLAYER_EFFECTS) {
                updatePlayerUnlocks.write((Type)Types.VAR_INT, (Object)effect);
                updatePlayerUnlocks.write((Type)Types.BOOLEAN, (Object)true);
            }
            updatePlayerUnlocks.write((Type)Types.VAR_INT, (Object)UNLOCKED_PLAYER_EFFECTS.length);
            for (int effect : UNLOCKED_PLAYER_EFFECTS) {
                updatePlayerUnlocks.write((Type)Types.VAR_INT, (Object)effect);
                updatePlayerUnlocks.write((Type)Types.VAR_INT, (Object)0);
            }
            updatePlayerUnlocks.write((Type)Types.VAR_INT, (Object)UNLOCKED_PLAYER_EFFECTS.length);
            for (int effect : UNLOCKED_PLAYER_EFFECTS) {
                updatePlayerUnlocks.write((Type)Types.VAR_INT, (Object)effect);
                updatePlayerUnlocks.write((Type)Types.BOOLEAN, (Object)true);
            }
            updatePlayerUnlocks.send(Protocol1_21_5To_25w14craftmine.class);
        });
        ((Protocol1_21_5To_25w14craftmine)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_5.RESPAWN, this::updatePlayerSpawnInfo);
    }

    private void updatePlayerSpawnInfo(PacketWrapper wrapper) {
        int dimensionId = (Integer)wrapper.read((Type)Types.VAR_INT);
        wrapper.write((Type)Types.VAR_INT, (Object)(dimensionId + 1));
        String world = (String)wrapper.passthrough(Types.STRING);
        wrapper.passthrough((Type)Types.LONG);
        byte gamemode = (Byte)wrapper.passthrough((Type)Types.BYTE);
        wrapper.passthrough((Type)Types.BYTE);
        wrapper.passthrough((Type)Types.BOOLEAN);
        wrapper.passthrough((Type)Types.BOOLEAN);
        wrapper.passthrough(Types.OPTIONAL_GLOBAL_POSITION);
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.write((Type)Types.BOOLEAN, (Object)false);
        wrapper.write((Type)Types.VAR_INT, (Object)0);
        wrapper.write((Type)Types.VAR_INT, (Object)0);
        this.trackWorldDataByKey1_20_5(wrapper.user(), dimensionId, world);
        this.tracker(wrapper.user()).setInstaBuild(gamemode == GameMode.CREATIVE.id());
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 mappedEntityDataTypes = (EntityDataTypes1_21_5)VAFTypes.V25W14CRAFTMINE.entityDataTypes;
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_21_5)mappedEntityDataTypes).byId(arg_0));
        this.registerEntityDataTypeHandler(mappedEntityDataTypes.itemType, mappedEntityDataTypes.blockStateType, mappedEntityDataTypes.optionalBlockStateType, mappedEntityDataTypes.particleType, mappedEntityDataTypes.particlesType, mappedEntityDataTypes.componentType, mappedEntityDataTypes.optionalComponentType);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes25w14craftmine.getTypeFromId(type);
    }
}

