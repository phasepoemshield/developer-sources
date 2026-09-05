/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.storage.GameTimeStorage
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent
 */
package com.viaversion.viaversion.protocols.v1_21_9to1_21_11.rewriter;

import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.Protocol1_21_9To1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.storage.GameTimeStorage;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent;

public final class EntityPacketRewriter1_21_11
extends EntityRewriter<ClientboundPacket1_21_9, Protocol1_21_9To1_21_11> {
    public EntityPacketRewriter1_21_11(Protocol1_21_9To1_21_11 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_11 entityDataTypes = (EntityDataTypes1_21_11)((Protocol1_21_9To1_21_11)this.protocol).mappedTypes().entityDataTypes();
        this.dataTypeMapper().added(entityDataTypes.zombieNautilusVariantType).register();
        this.registerEntityDataTypeHandler(entityDataTypes.itemType, entityDataTypes.blockStateType, entityDataTypes.optionalBlockStateType, entityDataTypes.particleType, entityDataTypes.particlesType, entityDataTypes.componentType, entityDataTypes.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_21_11.WOLF).index(21).handler(this::relativeToAbsoluteTicks);
        this.filter().type((EntityType)EntityTypes1_21_11.BEE).index(18).handler(this::relativeToAbsoluteTicks);
        this.filter().type((EntityType)EntityTypes1_21_11.AVATAR).index(15).handler((event, data) -> {
            byte arm = (Byte)data.value();
            data.setTypeAndValue(entityDataTypes.humanoidArmType, (Object)arm);
        });
    }

    public void registerPackets() {
        ((Protocol1_21_9To1_21_11)this.protocol).registerServerbound(ServerboundPackets1_21_6.PLAYER_ACTION, wrapper -> {
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action == 7) {
                wrapper.cancel();
            }
        });
        ((Protocol1_21_9To1_21_11)this.protocol).registerClientbound(ClientboundPackets1_21_9.HORSE_SCREEN_OPEN, ClientboundPackets1_21_11.MOUNT_SCREEN_OPEN);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_11.getTypeFromId((int)type);
    }

    private void relativeToAbsoluteTicks(EntityDataHandlerEvent event, EntityData data) {
        long currentGameTime = ((GameTimeStorage)event.user().get(GameTimeStorage.class)).gameTime();
        int remainingAngerTime = (Integer)data.value();
        data.setTypeAndValue(((EntityDataTypes1_21_11)((Protocol1_21_9To1_21_11)this.protocol).mappedTypes().entityDataTypes()).longType, (Object)(currentGameTime + (long)remainingAngerTime));
    }
}

