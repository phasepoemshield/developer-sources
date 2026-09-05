/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.storage.CurrentContainer
 *  com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.storage.UnlockedEffects
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.minecraft.GameMode
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 */
package com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.rewriter;

import com.viaversion.viaaprilfools.api.minecraft.entities.EntityTypes25w14craftmine;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.Protocol25w14craftmineTo1_21_5;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.storage.CurrentContainer;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.storage.UnlockedEffects;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPacket25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPackets25w14craftmine;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.minecraft.GameMode;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import java.util.ArrayList;

public final class EntityPacketRewriter25w14craftmine
extends EntityRewriter<ClientboundPacket25w14craftmine, Protocol25w14craftmineTo1_21_5> {
    public static final EntityTypes25w14craftmine[] PET_ENTITIES = new EntityTypes25w14craftmine[]{EntityTypes25w14craftmine.PET_ARMADILLO, EntityTypes25w14craftmine.PET_AXOLOTL, EntityTypes25w14craftmine.PET_BEE, EntityTypes25w14craftmine.CAT, EntityTypes25w14craftmine.PET_FOX, EntityTypes25w14craftmine.PET_TURTLE, EntityTypes25w14craftmine.PET_POLAR_BEAR, EntityTypes25w14craftmine.PET_SLIME, EntityTypes25w14craftmine.PET_WOLF, EntityTypes25w14craftmine.PET_CREEPER, EntityTypes25w14craftmine.PET_CHICKEN, EntityTypes25w14craftmine.PET_FROG, EntityTypes25w14craftmine.PET_COW, EntityTypes25w14craftmine.PET_MOOSHROOM};

    public EntityPacketRewriter25w14craftmine(Protocol25w14craftmineTo1_21_5 protocol) {
        super(protocol, ((EntityDataTypes1_21_5)protocol.mappedTypes().entityDataTypes()).optionalComponentType, ((EntityDataTypes1_21_5)protocol.mappedTypes().entityDataTypes()).booleanType);
    }

    public void registerPackets() {
        this.registerTrackerWithData1_19(ClientboundPackets25w14craftmine.ADD_ENTITY);
        this.registerSetEntityData(ClientboundPackets25w14craftmine.SET_ENTITY_DATA);
        this.registerRemoveEntities(ClientboundPackets25w14craftmine.REMOVE_ENTITIES);
        this.registerPlayerAbilities(ClientboundPackets25w14craftmine.PLAYER_ABILITIES);
        this.registerGameEvent(ClientboundPackets25w14craftmine.GAME_EVENT);
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerClientbound(ClientboundPackets25w14craftmine.LOGIN, wrapper -> {
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
        });
        ((Protocol25w14craftmineTo1_21_5)this.protocol).registerClientbound(ClientboundPackets25w14craftmine.RESPAWN, wrapper -> {
            this.updatePlayerSpawnInfo(wrapper);
            ((CurrentContainer)wrapper.user().get(CurrentContainer.class)).close();
        });
    }

    private void updatePlayerSpawnInfo(PacketWrapper wrapper) {
        int dimensionHolderId = (Integer)wrapper.read((Type)Types.VAR_INT);
        if (dimensionHolderId != 0) {
            --dimensionHolderId;
        }
        wrapper.write((Type)Types.VAR_INT, (Object)dimensionHolderId);
        String world = (String)wrapper.passthrough(Types.STRING);
        wrapper.passthrough((Type)Types.LONG);
        byte gamemode = (Byte)wrapper.passthrough((Type)Types.BYTE);
        wrapper.passthrough((Type)Types.BYTE);
        wrapper.passthrough((Type)Types.BOOLEAN);
        wrapper.passthrough((Type)Types.BOOLEAN);
        wrapper.passthrough(Types.OPTIONAL_GLOBAL_POSITION);
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.read((Type)Types.BOOLEAN);
        int unlockedEffectsSize = (Integer)wrapper.read((Type)Types.VAR_INT);
        ArrayList<Integer> unlockedEffects = new ArrayList<Integer>();
        for (int i = 0; i < unlockedEffectsSize; ++i) {
            unlockedEffects.add((Integer)wrapper.read((Type)Types.VAR_INT));
        }
        wrapper.user().put((StorableObject)new UnlockedEffects(unlockedEffects));
        int activeEffectsSize = (Integer)wrapper.read((Type)Types.VAR_INT);
        for (int i = 0; i < activeEffectsSize; ++i) {
            wrapper.read((Type)Types.VAR_INT);
        }
        this.trackWorldDataByKey1_20_5(wrapper.user(), dimensionHolderId, world);
        this.tracker(wrapper.user()).setInstaBuild(gamemode == GameMode.CREATIVE.id());
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 mappedEntityDataTypes = (EntityDataTypes1_21_5)VersionedTypes.V1_21_5.entityDataTypes;
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_21_5)mappedEntityDataTypes).byId(arg_0));
        this.registerEntityDataTypeHandler1_20_3(mappedEntityDataTypes.itemType, mappedEntityDataTypes.blockStateType, mappedEntityDataTypes.optionalBlockStateType, mappedEntityDataTypes.particleType, mappedEntityDataTypes.particlesType, mappedEntityDataTypes.componentType, mappedEntityDataTypes.optionalComponentType);
        for (EntityTypes25w14craftmine entity : PET_ENTITIES) {
            this.filter().type((EntityType)entity).removeIndex(17);
            this.filter().type((EntityType)entity).removeIndex(18);
        }
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_ARMADILLO, EntityTypes25w14craftmine.ARMADILLO).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_AXOLOTL, EntityTypes25w14craftmine.AXOLOTL).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_BEE, EntityTypes25w14craftmine.BEE).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.CAT, EntityTypes25w14craftmine.PET_CAT).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_FOX, EntityTypes25w14craftmine.FOX).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_TURTLE, EntityTypes25w14craftmine.TURTLE).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_POLAR_BEAR, EntityTypes25w14craftmine.POLAR_BEAR).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_SLIME, EntityTypes25w14craftmine.SLIME).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_WOLF, EntityTypes25w14craftmine.WOLF).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_CREEPER, EntityTypes25w14craftmine.CREEPER).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_CHICKEN, EntityTypes25w14craftmine.CHICKEN).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_FROG, EntityTypes25w14craftmine.FROG).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_COW, EntityTypes25w14craftmine.COW).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.PET_MOOSHROOM, EntityTypes25w14craftmine.MOOSHROOM).tagName();
        this.mapEntityTypeWithData(EntityTypes25w14craftmine.ANGRY_GHAST, EntityTypes25w14craftmine.GHAST).tagName();
    }

    public EntityType typeFromId(int type) {
        return EntityTypes25w14craftmine.getTypeFromId(type);
    }
}

