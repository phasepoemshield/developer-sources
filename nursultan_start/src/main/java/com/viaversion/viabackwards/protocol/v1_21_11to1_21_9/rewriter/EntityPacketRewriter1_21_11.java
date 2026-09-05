/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.storage.GameTimeStorage
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent
 *  com.viaversion.viaversion.util.MathUtil
 */
package com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.Protocol1_21_11To1_21_9;
import com.viaversion.viabackwards.protocol.v1_21_11to1_21_9.storage.GameTimeStorage;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent;
import com.viaversion.viaversion.util.MathUtil;

public final class EntityPacketRewriter1_21_11
extends EntityRewriter<ClientboundPacket1_21_11, Protocol1_21_11To1_21_9> {
    public EntityPacketRewriter1_21_11(Protocol1_21_11To1_21_9 protocol) {
        super((BackwardsProtocol)protocol, ((EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes).optionalComponentType, ((EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes).booleanType);
    }

    private void absoluteToRelativeTicks(EntityDataHandlerEvent event, EntityData data) {
        long currentGameTime = ((GameTimeStorage)event.user().get(GameTimeStorage.class)).gameTime();
        long angerEndTime = (Long)data.value();
        int angerEndIn = (int)MathUtil.clamp((long)(angerEndTime - currentGameTime), (long)Integer.MIN_VALUE, (long)Integer.MAX_VALUE);
        data.setTypeAndValue(((EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes).varIntType, (Object)Math.max(angerEndIn, 0));
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_11.NAUTILUS, (EntityType)EntityTypes1_21_11.SQUID).tagName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_11.ZOMBIE_NAUTILUS, (EntityType)EntityTypes1_21_11.GLOW_SQUID).tagName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_11.CAMEL_HUSK, (EntityType)EntityTypes1_21_11.CAMEL).tagName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_21_11.PARCHED, (EntityType)EntityTypes1_21_11.SKELETON).tagName();
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_11 unmappedDataTypes = (EntityDataTypes1_21_11)VersionedTypes.V1_21_11.entityDataTypes;
        EntityDataTypes1_21_9 entityDataTypes = (EntityDataTypes1_21_9)VersionedTypes.V1_21_9.entityDataTypes;
        this.dataTypeMapper().removed(unmappedDataTypes.zombieNautilusVariantType).skip(unmappedDataTypes.humanoidArmType).register();
        this.filter().dataType(unmappedDataTypes.humanoidArmType).handler((event, data) -> {
            int arm = (Integer)data.value();
            data.setTypeAndValue(entityDataTypes.byteType, (Object)((byte)arm));
        });
        this.registerEntityDataTypeHandler1_20_3(entityDataTypes.itemType, entityDataTypes.blockStateType, entityDataTypes.optionalBlockStateType, entityDataTypes.particleType, entityDataTypes.particlesType, entityDataTypes.componentType, entityDataTypes.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_21_11.WOLF).index(21).handler(this::absoluteToRelativeTicks);
        this.filter().type((EntityType)EntityTypes1_21_11.BEE).index(18).handler(this::absoluteToRelativeTicks);
        this.filter().type((EntityType)EntityTypes1_21_11.ABSTRACT_NAUTILUS).cancel(17);
        this.filter().type((EntityType)EntityTypes1_21_11.ABSTRACT_NAUTILUS).cancel(18);
        this.filter().type((EntityType)EntityTypes1_21_11.ABSTRACT_NAUTILUS).cancel(19);
        this.filter().type((EntityType)EntityTypes1_21_11.ZOMBIE_NAUTILUS).cancel(20);
    }

    public void registerPackets() {
        ((Protocol1_21_11To1_21_9)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_11.MOUNT_SCREEN_OPEN, (ClientboundPacketType)ClientboundPackets1_21_9.HORSE_SCREEN_OPEN);
        ((Protocol1_21_11To1_21_9)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_11.UPDATE_MOB_EFFECT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int effectId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (effectId == 39) {
                wrapper.cancel();
            }
        });
        ((Protocol1_21_11To1_21_9)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_11.REMOVE_MOB_EFFECT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int effectId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (effectId == 39) {
                wrapper.cancel();
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_11.getTypeFromId((int)type);
    }
}

