/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.data.entity.TrackedEntity
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.api.rewriters;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.entities.storage.EntityReplacement;
import com.viaversion.viabackwards.api.entities.storage.WrappedEntityData;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.data.entity.TrackedEntity;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandlerEvent;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class EntityRewriterBase<C extends ClientboundPacketType, T extends BackwardsProtocol<C, ?, ?, ?>>
extends EntityRewriter<C, T> {
    private final Int2ObjectMap<EntityReplacement> entityDataMappings = new Int2ObjectOpenHashMap();
    private final EntityDataType displayNameDataType;
    private final EntityDataType displayVisibilityDataType;
    private final int displayNameIndex;
    private final int displayVisibilityIndex;

    EntityRewriterBase(T protocol, EntityDataType displayNameDataType, int displayNameIndex, EntityDataType displayVisibilityDataType, int displayVisibilityIndex) {
        super(protocol, false);
        this.displayNameDataType = displayNameDataType;
        this.displayNameIndex = displayNameIndex;
        this.displayVisibilityDataType = displayVisibilityDataType;
        this.displayVisibilityIndex = displayVisibilityIndex;
    }

    protected @Nullable EntityData getData(int dataIndex, List<EntityData> entityDataList) {
        for (EntityData entityData : entityDataList) {
            if (entityData.id() != dataIndex) continue;
            return entityData;
        }
        return null;
    }

    public void handleEntityData(int entityId, List<EntityData> entityDataList, UserConnection connection) {
        Object displayNameObject;
        TrackedEntity entity = this.tracker(connection).entity(entityId);
        boolean initialEntityData = entity == null || !entity.hasSentEntityData();
        super.handleEntityData(entityId, entityDataList, connection);
        if (entity == null) {
            return;
        }
        EntityReplacement entityMapping = this.entityDataForType(entity.entityType());
        if (entityMapping != null && (displayNameObject = entityMapping.entityName()) != null) {
            EntityData displayName = this.getData(this.displayNameIndex, entityDataList);
            if (initialEntityData) {
                if (displayName == null) {
                    entityDataList.add(new EntityData(this.displayNameIndex, this.displayNameDataType, displayNameObject));
                    this.addDisplayVisibilityData(entityDataList);
                } else if (displayName.getValue() == null || displayName.getValue().toString().isEmpty()) {
                    displayName.setValue(displayNameObject);
                    this.addDisplayVisibilityData(entityDataList);
                }
            } else if (displayName != null && (displayName.getValue() == null || displayName.getValue().toString().isEmpty())) {
                displayName.setValue(displayNameObject);
                this.addDisplayVisibilityData(entityDataList);
            }
        }
        if (entityMapping != null && entityMapping.hasBaseData() && initialEntityData) {
            entityMapping.defaultData().createData(new WrappedEntityData(entityDataList));
        }
    }

    protected void removeData(int dataIndex, List<EntityData> entityDataList) {
        entityDataList.removeIf(data -> data.id() == dataIndex);
    }

    protected boolean alwaysShowOriginalMobName() {
        return ViaBackwards.getConfig().alwaysShowOriginalMobName();
    }

    protected @Nullable StoredEntityData storedEntityData(EntityDataHandlerEvent event) {
        return this.tracker(event.user()).entityData(event.entityId());
    }

    protected PacketHandler getTrackerHandler() {
        return this.getTrackerHandler((Type<Number>)Types.VAR_INT, 1);
    }

    protected PacketHandler getTrackerHandler(Type<? extends Number> intType, int typeIndex) {
        return wrapper -> {
            Number id = (Number)wrapper.get(intType, typeIndex);
            EntityType entityType = this.typeFromId(id.intValue());
            if (entityType != null) {
                this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), entityType);
            }
        };
    }

    protected PacketHandler getTrackerHandler(EntityType entityType) {
        return wrapper -> this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), entityType);
    }

    protected @Nullable EntityReplacement entityDataForType(EntityType type) {
        return (EntityReplacement)this.entityDataMappings.get(type.getId());
    }

    protected boolean hasData(EntityType type) {
        return this.entityDataMappings.containsKey(type.getId());
    }

    protected Object getDisplayVisibilityDataValue() {
        return true;
    }

    public void registerEntityDataTypeHandler(@Nullable EntityDataType itemType, @Nullable EntityDataType blockStateType, @Nullable EntityDataType optionalBlockStateType, @Nullable EntityDataType particleType, @Nullable EntityDataType componentType, @Nullable EntityDataType optionalComponentType) {
        this.filter().handler((event, data) -> {
            EntityDataType type = data.dataType();
            if (type == itemType) {
                data.setValue((Object)((BackwardsProtocol)this.protocol).getItemRewriter().handleItemToClient(event.user(), (Item)data.value()));
            } else if (type == blockStateType) {
                int value = (Integer)data.value();
                data.setValue((Object)((BackwardsProtocol)this.protocol).getMappingData().getNewBlockStateId(value));
            } else if (type == optionalBlockStateType) {
                int value = (Integer)data.value();
                if (value != 0) {
                    data.setValue((Object)((BackwardsProtocol)this.protocol).getMappingData().getNewBlockStateId(value));
                }
            } else if (type == particleType) {
                ((BackwardsProtocol)this.protocol).getParticleRewriter().rewriteParticle(event.user(), (Particle)data.value());
            } else if (type == optionalComponentType || type == componentType) {
                JsonElement text = (JsonElement)data.value();
                ((BackwardsProtocol)this.protocol).getComponentRewriter().processText(event.user(), text);
            }
        });
    }

    private void addDisplayVisibilityData(List<EntityData> entityDataList) {
        if (this.alwaysShowOriginalMobName()) {
            this.removeData(this.displayVisibilityIndex, entityDataList);
            entityDataList.add(new EntityData(this.displayVisibilityIndex, this.displayVisibilityDataType, this.getDisplayVisibilityDataValue()));
        }
    }

    protected PacketHandler getPlayerTrackerHandler() {
        return wrapper -> {
            int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
            EntityTracker tracker = this.tracker(wrapper.user());
            this.tracker(wrapper.user()).setClientEntityId(entityId);
            tracker.addEntity(entityId, tracker.playerType());
        };
    }

    protected PacketHandler getDimensionHandler(int index) {
        return wrapper -> {
            int dimensionId;
            ClientWorld clientWorld = wrapper.user().getClientWorld(((Object)((Object)((BackwardsProtocol)this.protocol))).getClass());
            if (clientWorld.setEnvironment(dimensionId = ((Integer)wrapper.get((Type)Types.INT, index)).intValue())) {
                this.tracker(wrapper.user()).clearEntities();
            }
        };
    }

    protected EntityReplacement mapEntityTypeWithData(EntityType type, EntityType mappedType) {
        Preconditions.checkArgument((type.getClass() == mappedType.getClass() ? 1 : 0) != 0, (Object)"Both entity types need to be of the same class");
        int mappedReplacementId = this.newEntityId(mappedType.getId());
        EntityReplacement data = new EntityReplacement((BackwardsProtocol)this.protocol, type, mappedReplacementId);
        this.mapEntityType(type.getId(), mappedReplacementId);
        this.entityDataMappings.put(type.getId(), (Object)data);
        return data;
    }

    public void registerEntityDataTypeHandler1_20_3(@Nullable EntityDataType itemType, @Nullable EntityDataType blockStateType, @Nullable EntityDataType optionalBlockStateType, @Nullable EntityDataType particleType, @Nullable EntityDataType particlesType, @Nullable EntityDataType componentType, @Nullable EntityDataType optionalComponentType) {
        this.filter().handler((event, data) -> {
            EntityDataType type = data.dataType();
            if (type == itemType) {
                data.setValue((Object)((BackwardsProtocol)this.protocol).getItemRewriter().handleItemToClient(event.user(), (Item)data.value()));
            } else if (type == blockStateType) {
                int value = (Integer)data.value();
                data.setValue((Object)((BackwardsProtocol)this.protocol).getMappingData().getNewBlockStateId(value));
            } else if (type == optionalBlockStateType) {
                int value = (Integer)data.value();
                if (value != 0) {
                    data.setValue((Object)((BackwardsProtocol)this.protocol).getMappingData().getNewBlockStateId(value));
                }
            } else if (type == particleType) {
                ((BackwardsProtocol)this.protocol).getParticleRewriter().rewriteParticle(event.user(), (Particle)data.value());
            } else if (type == particlesType) {
                Particle[] particles;
                for (Particle particle : particles = (Particle[])data.value()) {
                    ((BackwardsProtocol)this.protocol).getParticleRewriter().rewriteParticle(event.user(), particle);
                }
            } else if (type == optionalComponentType || type == componentType) {
                ((BackwardsProtocol)this.protocol).getComponentRewriter().processTag(event.user(), (Tag)data.value());
            }
        });
    }
}

