/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.entities.storage.EntityObjectData;
import com.viaversion.viabackwards.api.entities.storage.EntityReplacement;
import com.viaversion.viabackwards.api.entities.storage.WrappedEntityData;
import com.viaversion.viabackwards.api.rewriters.EntityRewriterBase;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.ObjectType;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class LegacyEntityRewriter<C extends ClientboundPacketType, T extends BackwardsProtocol<C, ?, ?, ?>>
extends EntityRewriterBase<C, T> {
    private final Map<ObjectType, EntityReplacement> objectTypes = new HashMap<ObjectType, EntityReplacement>();

    protected LegacyEntityRewriter(T protocol) {
        this(protocol, (EntityDataType)EntityDataTypes1_9.STRING, (EntityDataType)EntityDataTypes1_9.BOOLEAN);
    }

    protected LegacyEntityRewriter(T protocol, EntityDataType displayType, EntityDataType displayVisibilityType) {
        super(protocol, displayType, 2, displayVisibilityType, 3);
    }

    protected EntityObjectData mapObjectType(ObjectType oldObjectType, ObjectType replacement, int data) {
        EntityObjectData entData = new EntityObjectData((BackwardsProtocol)this.protocol, oldObjectType.getType().name(), oldObjectType.getId(), replacement.getId(), data);
        this.objectTypes.put(oldObjectType, entData);
        return entData;
    }

    protected PacketHandler getObjectRewriter(ObjectTypeGetter objectGetter) {
        return wrapper -> {
            int data;
            byte id = (Byte)wrapper.get((Type)Types.BYTE, 0);
            ObjectType type = objectGetter.get(id, data = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue());
            if (type == null) {
                return;
            }
            EntityReplacement replacement = this.getObjectData(type);
            if (replacement != null) {
                wrapper.set((Type)Types.BYTE, 0, (Object)((byte)replacement.replacementId()));
                if (replacement.objectData() != -1) {
                    wrapper.set((Type)Types.INT, 0, (Object)replacement.objectData());
                }
            }
        };
    }

    protected @Nullable EntityReplacement getObjectData(ObjectType type) {
        return this.objectTypes.get(type);
    }

    protected void registerJoinGame(C packetType, final EntityType playerType) {
        ((BackwardsProtocol)this.protocol).registerClientbound((ClientboundPacketType)packetType, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(((Object)((Object)((BackwardsProtocol)LegacyEntityRewriter.this.protocol))).getClass());
                    clientWorld.setEnvironment(((Integer)wrapper.get((Type)Types.INT, 1)).intValue());
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    LegacyEntityRewriter.this.tracker(wrapper.user()).addEntity(entityId, playerType);
                    LegacyEntityRewriter.this.tracker(wrapper.user()).setClientEntityId(entityId);
                });
            }
        });
    }

    protected void registerRespawn(C packetType) {
        ((BackwardsProtocol)this.protocol).registerClientbound((ClientboundPacketType)packetType, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(((Object)((Object)((BackwardsProtocol)LegacyEntityRewriter.this.protocol))).getClass());
                    if (clientWorld.setEnvironment(((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        LegacyEntityRewriter.this.tracker(wrapper.user()).clearEntities();
                    }
                });
            }
        });
    }

    public PacketHandler getMobSpawnRewriter1_11(Type<List<EntityData>> dataType) {
        return this.getMobSpawnRewriter(dataType, (wrapper, id) -> wrapper.set((Type)Types.VAR_INT, 1, (Object)id));
    }

    protected PacketHandler getObjectTrackerHandler() {
        return wrapper -> {
            int data;
            byte id = (Byte)wrapper.get((Type)Types.BYTE, 0);
            EntityType type = this.objectTypeFromId(id, data = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue());
            if (type == null) {
                return;
            }
            this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), type);
        };
    }

    public PacketHandler getMobSpawnRewriter(Type<List<EntityData>> dataType) {
        return this.getMobSpawnRewriter(dataType, (wrapper, id) -> wrapper.set((Type)Types.UNSIGNED_BYTE, 0, (Object)((short)id)));
    }

    protected PacketHandler getMobSpawnRewriter(Type<List<EntityData>> dataType, IdSetter idSetter) {
        return wrapper -> {
            int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
            EntityType type = this.tracker(wrapper.user()).entityType(entityId);
            if (type == null) {
                return;
            }
            List entityDataList = (List)wrapper.get(dataType, 0);
            this.handleEntityData(entityId, entityDataList, wrapper.user());
            EntityReplacement entityReplacement = this.entityDataForType(type);
            if (entityReplacement != null) {
                idSetter.setId(wrapper, entityReplacement.replacementId());
                if (entityReplacement.hasBaseData()) {
                    entityReplacement.defaultData().createData(new WrappedEntityData(entityDataList));
                }
            }
        };
    }

    protected PacketHandler getTrackerAndDataHandler(Type<List<EntityData>> dataType, EntityType entityType) {
        return wrapper -> {
            this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), entityType);
            List entityDataList = (List)wrapper.get(dataType, 0);
            this.handleEntityData((Integer)wrapper.get((Type)Types.VAR_INT, 0), entityDataList, wrapper.user());
        };
    }

    @FunctionalInterface
    protected static interface IdSetter {
        public void setId(PacketWrapper var1, int var2);
    }

    @FunctionalInterface
    protected static interface ObjectTypeGetter {
        public ObjectType get(int var1, int var2);
    }
}

