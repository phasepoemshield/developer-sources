/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.Vector3d
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.util.Key
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity
 *  net.raphimc.viabedrock.api.model.entity.CustomEntity
 *  net.raphimc.viabedrock.api.model.entity.Entity
 *  net.raphimc.viabedrock.api.model.entity.LivingEntity
 *  net.raphimc.viabedrock.api.resourcepack.definition.EntityDefinitions$EntityDefinition
 *  net.raphimc.viabedrock.api.util.MathUtil
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.api.util.RegistryUtil
 *  net.raphimc.viabedrock.api.util.TextUtil
 *  net.raphimc.viabedrock.protocol.data.enums.Direction
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ActorEvent
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AnimatePacketPayload_Action
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AttributeModifierOperation
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AttributeOperands
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerID
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.MobEffectPacketPayload_Event
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerActionType
 *  net.raphimc.viabedrock.protocol.data.enums.java.AnimateAction
 *  net.raphimc.viabedrock.protocol.data.enums.java.Relative
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.EquipmentSlot
 *  net.raphimc.viabedrock.protocol.model.BedrockItem
 *  net.raphimc.viabedrock.protocol.model.EntityAttribute
 *  net.raphimc.viabedrock.protocol.model.EntityAttribute$Modifier
 *  net.raphimc.viabedrock.protocol.model.EntityEffect
 *  net.raphimc.viabedrock.protocol.packet.EntityPackets$1
 *  net.raphimc.viabedrock.protocol.rewriter.ItemRewriter
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.google.common.collect.Lists;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.Vector3d;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.util.Key;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity;
import net.raphimc.viabedrock.api.model.entity.CustomEntity;
import net.raphimc.viabedrock.api.model.entity.Entity;
import net.raphimc.viabedrock.api.model.entity.LivingEntity;
import net.raphimc.viabedrock.api.resourcepack.definition.EntityDefinitions;
import net.raphimc.viabedrock.api.util.MathUtil;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.api.util.RegistryUtil;
import net.raphimc.viabedrock.api.util.TextUtil;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.Direction;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ActorEvent;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AnimatePacketPayload_Action;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AttributeModifierOperation;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AttributeOperands;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerID;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.MobEffectPacketPayload_Event;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerActionType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SharedTypes_Legacy_ActorDamageCause;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SharedTypes_Legacy_LevelSoundEvent;
import net.raphimc.viabedrock.protocol.data.enums.java.AnimateAction;
import net.raphimc.viabedrock.protocol.data.enums.java.Relative;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.EquipmentSlot;
import net.raphimc.viabedrock.protocol.model.BedrockItem;
import net.raphimc.viabedrock.protocol.model.EntityAttribute;
import net.raphimc.viabedrock.protocol.model.EntityEffect;
import net.raphimc.viabedrock.protocol.model.EntityLink;
import net.raphimc.viabedrock.protocol.model.EntityProperties;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.packet.EntityPackets;
import net.raphimc.viabedrock.protocol.rewriter.ItemRewriter;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.storage.ResourcePackStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class EntityPackets {
    private static final float PAINTING_POS_OFFSET = -0.46875f;

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.ADD_ENTITY, (ClientboundPacketType)ClientboundPackets26_1.ADD_ENTITY, wrapper -> {
            Entity entity;
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            long entityUniqueId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            String type = Key.namespaced((String)((String)wrapper.read(BedrockTypes.STRING)));
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            Position3f motion = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            Position3f rotation = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            wrapper.read((Type)BedrockTypes.FLOAT_LE);
            EntityAttribute[] attributes = new EntityAttribute[((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT)).intValue()];
            for (int i = 0; i < attributes.length; ++i) {
                String name = (String)wrapper.read(BedrockTypes.STRING);
                float minValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                float currentValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                float maxValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                attributes[i] = new EntityAttribute(name, currentValue, minValue, maxValue);
            }
            EntityData[] entityData = (EntityData[])wrapper.read(BedrockTypes.ENTITY_DATA_ARRAY);
            EntityProperties entityProperties = (EntityProperties)((Object)((Object)wrapper.read(BedrockTypes.ENTITY_PROPERTIES)));
            EntityLink[] entityLinks = (EntityLink[])wrapper.read(BedrockTypes.ENTITY_LINK_ARRAY);
            EntityTypes1_21_11 javaEntityType = BedrockProtocol.MAPPINGS.getBedrockToJavaEntities().get(type);
            if (javaEntityType != null) {
                entity = entityTracker.addEntity(entityUniqueId, entityRuntimeId, type, javaEntityType);
            } else {
                if (!gameSession.getAvailableEntityIdentifiers().contains(type)) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown bedrock entity type: " + type);
                    wrapper.cancel();
                    return;
                }
                ResourcePackStorage resourcePackStorage = (ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class);
                EntityDefinitions.EntityDefinition entityDefinition = resourcePackStorage.getEntities().get(type);
                if (entityDefinition == null) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing bedrock entity type: " + type);
                    wrapper.cancel();
                    return;
                }
                if (resourcePackStorage.isLoadedOnJavaClient()) {
                    entity = new CustomEntity(wrapper.user(), entityUniqueId, entityRuntimeId, type, entityTracker.getNextJavaEntityId(), entityDefinition);
                    entityTracker.addEntity(entity);
                } else {
                    entity = entityTracker.addEntity(entityUniqueId, entityRuntimeId, type, EntityTypes1_21_11.PIG);
                }
            }
            entity.setPosition(position);
            entity.setRotation(rotation);
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write(Types.UUID, (Object)entity.javaUuid());
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaType().getId());
            wrapper.write((Type)Types.DOUBLE, (Object)position.x());
            wrapper.write((Type)Types.DOUBLE, (Object)position.y());
            wrapper.write((Type)Types.DOUBLE, (Object)position.z());
            wrapper.write(Types.LOW_PRECISION_VECTOR, (Object)new Vector3d((double)motion.x(), (double)motion.y(), (double)motion.z()));
            wrapper.write((Type)Types.BYTE, (Object)MathUtil.float2Byte((float)rotation.x()));
            wrapper.write((Type)Types.BYTE, (Object)MathUtil.float2Byte((float)rotation.y()));
            wrapper.write((Type)Types.BYTE, (Object)MathUtil.float2Byte((float)rotation.z()));
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.send(BedrockProtocol.class);
            wrapper.cancel();
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                livingEntity.updateAttributes(attributes);
            }
            entity.updateEntityData(entityData);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.ADD_ITEM_ENTITY, (ClientboundPacketType)ClientboundPackets26_1.ADD_ENTITY, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            ItemRewriter itemRewriter = (ItemRewriter)wrapper.user().get(ItemRewriter.class);
            long entityUniqueId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            BedrockItem item = (BedrockItem)wrapper.read(itemRewriter.itemType());
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            Position3f motion = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            EntityData[] entityData = (EntityData[])wrapper.read(BedrockTypes.ENTITY_DATA_ARRAY);
            wrapper.read((Type)Types.BOOLEAN);
            Entity entity = entityTracker.addEntity(entityUniqueId, entityRuntimeId, "minecraft:item", EntityTypes1_21_11.ITEM);
            entity.setPosition(position);
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write(Types.UUID, (Object)entity.javaUuid());
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaType().getId());
            wrapper.write((Type)Types.DOUBLE, (Object)position.x());
            wrapper.write((Type)Types.DOUBLE, (Object)position.y());
            wrapper.write((Type)Types.DOUBLE, (Object)position.z());
            wrapper.write(Types.LOW_PRECISION_VECTOR, (Object)new Vector3d((double)motion.x(), (double)motion.y(), (double)motion.z()));
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.send(BedrockProtocol.class);
            wrapper.cancel();
            ArrayList<EntityData> javaEntityData = new ArrayList<EntityData>();
            entity.updateEntityData(entityData, javaEntityData);
            javaEntityData.add(new EntityData(entity.getJavaEntityDataIndex("ITEM"), ((EntityDataTypes26_1)VersionedTypes.V26_1.entityDataTypes).itemType, (Object)itemRewriter.javaItem(item)));
            PacketWrapper setEntityData = PacketWrapper.create((PacketType)ClientboundPackets26_1.SET_ENTITY_DATA, (UserConnection)wrapper.user());
            setEntityData.write((Type)Types.VAR_INT, (Object)entity.javaId());
            setEntityData.write(VersionedTypes.V26_1.entityDataList, javaEntityData);
            setEntityData.send(BedrockProtocol.class);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.MOVE_ENTITY_ABSOLUTE, (ClientboundPacketType)ClientboundPackets26_1.ENTITY_POSITION_SYNC, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            short flags = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            float pitch = MathUtil.byte2Float((byte)((Byte)wrapper.read((Type)Types.BYTE)));
            float yaw = MathUtil.byte2Float((byte)((Byte)wrapper.read((Type)Types.BYTE)));
            float headYaw = MathUtil.byte2Float((byte)((Byte)wrapper.read((Type)Types.BYTE)));
            boolean onGround = (flags & 1) != 0;
            boolean teleported = (flags & 2) != 0;
            boolean forceMoveLocalEntity = (flags & 4) != 0;
            Entity entity = entityTracker.getEntityByRid(entityRuntimeId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            if (entity == entityTracker.getClientPlayer()) {
                if (!teleported && !forceMoveLocalEntity) {
                    wrapper.cancel();
                    return;
                }
                entity.setPosition(position);
                if (teleported) {
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.PLAYER_POSITION);
                    entityTracker.getClientPlayer().writePlayerPositionPacketToClient(wrapper, Relative.union((Set[])new Set[]{Relative.ROTATION, Relative.VELOCITY}), true);
                } else {
                    wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
                    wrapper.write((Type)Types.DOUBLE, (Object)entity.position().x());
                    wrapper.write((Type)Types.DOUBLE, (Object)((double)entity.position().y() - (double)entity.eyeOffset()));
                    wrapper.write((Type)Types.DOUBLE, (Object)entity.position().z());
                    wrapper.write((Type)Types.DOUBLE, (Object)0.0);
                    wrapper.write((Type)Types.DOUBLE, (Object)0.0);
                    wrapper.write((Type)Types.DOUBLE, (Object)0.0);
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(entity.rotation().y()));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(entity.rotation().x()));
                    wrapper.write((Type)Types.BOOLEAN, (Object)entity.isOnGround());
                }
                return;
            }
            entity.setPosition(position);
            entity.setRotation(new Position3f(pitch, yaw, headYaw));
            entity.setOnGround(onGround);
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write((Type)Types.DOUBLE, (Object)position.x());
            wrapper.write((Type)Types.DOUBLE, (Object)((double)position.y() - (double)entity.eyeOffset()));
            wrapper.write((Type)Types.DOUBLE, (Object)position.z());
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(yaw));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(pitch));
            wrapper.write((Type)Types.BOOLEAN, (Object)onGround);
            PacketFactory.sendJavaRotateHead((UserConnection)wrapper.user(), (Entity)entity);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.MOVE_ENTITY_DELTA, (ClientboundPacketType)ClientboundPackets26_1.ENTITY_POSITION_SYNC, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            int flags = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_SHORT_LE);
            boolean hasX = (flags & 1) != 0;
            boolean hasY = (flags & 2) != 0;
            boolean hasZ = (flags & 4) != 0;
            boolean hasPitch = (flags & 8) != 0;
            boolean hasYaw = (flags & 0x10) != 0;
            boolean hasHeadYaw = (flags & 0x20) != 0;
            boolean onGround = (flags & 0x40) != 0;
            boolean teleported = (flags & 0x80) != 0;
            boolean forceMoveLocalEntity = (flags & 0x100) != 0;
            Entity entity = entityTracker.getEntityByRid(entityRuntimeId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            if (entity == entityTracker.getClientPlayer()) {
                if (!teleported && !forceMoveLocalEntity) {
                    wrapper.cancel();
                    return;
                }
                float x = 0.0f;
                float y = 0.0f;
                float z = 0.0f;
                if (hasX) {
                    x = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                }
                if (hasY) {
                    y = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                }
                if (hasZ) {
                    z = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                }
                entity.setPosition(new Position3f(x, y, z));
                wrapper.clearPacket();
                if (teleported) {
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.PLAYER_POSITION);
                    entityTracker.getClientPlayer().writePlayerPositionPacketToClient(wrapper, Relative.union((Set[])new Set[]{Relative.ROTATION, Relative.VELOCITY}), true);
                } else {
                    wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
                    wrapper.write((Type)Types.DOUBLE, (Object)entity.position().x());
                    wrapper.write((Type)Types.DOUBLE, (Object)((double)entity.position().y() - (double)entity.eyeOffset()));
                    wrapper.write((Type)Types.DOUBLE, (Object)entity.position().z());
                    wrapper.write((Type)Types.DOUBLE, (Object)0.0);
                    wrapper.write((Type)Types.DOUBLE, (Object)0.0);
                    wrapper.write((Type)Types.DOUBLE, (Object)0.0);
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(entity.rotation().y()));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(entity.rotation().x()));
                    wrapper.write((Type)Types.BOOLEAN, (Object)entity.isOnGround());
                }
                return;
            }
            if (hasX) {
                entity.setPosition(new Position3f(((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue(), entity.position().y(), entity.position().z()));
            }
            if (hasY) {
                entity.setPosition(new Position3f(entity.position().x(), ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue(), entity.position().z()));
            }
            if (hasZ) {
                entity.setPosition(new Position3f(entity.position().x(), entity.position().y(), ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue()));
            }
            if (hasPitch) {
                entity.setRotation(new Position3f(MathUtil.byte2Float((byte)((Byte)wrapper.read((Type)Types.BYTE))), entity.rotation().y(), entity.rotation().z()));
            }
            if (hasYaw) {
                entity.setRotation(new Position3f(entity.rotation().x(), MathUtil.byte2Float((byte)((Byte)wrapper.read((Type)Types.BYTE))), entity.rotation().z()));
            }
            if (hasHeadYaw) {
                entity.setRotation(new Position3f(entity.rotation().x(), entity.rotation().y(), MathUtil.byte2Float((byte)((Byte)wrapper.read((Type)Types.BYTE)))));
                PacketFactory.sendJavaRotateHead((UserConnection)wrapper.user(), (Entity)entity);
            }
            entity.setOnGround(onGround);
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write((Type)Types.DOUBLE, (Object)entity.position().x());
            wrapper.write((Type)Types.DOUBLE, (Object)((double)entity.position().y() - (double)entity.eyeOffset()));
            wrapper.write((Type)Types.DOUBLE, (Object)entity.position().z());
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(entity.rotation().y()));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(entity.rotation().x()));
            wrapper.write((Type)Types.BOOLEAN, (Object)entity.isOnGround());
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_ENTITY_MOTION, (ClientboundPacketType)ClientboundPackets26_1.SET_ENTITY_MOTION, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Position3f motion = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Entity entity = entityTracker.getEntityByRid(entityRuntimeId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write(Types.LOW_PRECISION_VECTOR, (Object)new Vector3d((double)motion.x(), (double)motion.y(), (double)motion.z()));
        });
        protocol.registerClientbound(ClientboundBedrockPackets.REMOVE_ENTITY, (ClientboundPacketType)ClientboundPackets26_1.REMOVE_ENTITIES, wrapper -> {
            long entityUniqueId;
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            Entity entity = entityTracker.getEntityByUid(entityUniqueId = ((Long)wrapper.read((Type)BedrockTypes.VAR_LONG)).longValue());
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            entityTracker.removeEntity(entity);
            wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[]{entity.javaId()});
        });
        protocol.registerClientbound(ClientboundBedrockPackets.ADD_PAINTING, (ClientboundPacketType)ClientboundPackets26_1.ADD_ENTITY, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            CompoundTag paintingRegistry = gameSession.getJavaRegistries().getCompoundTag("minecraft:painting_variant");
            long entityUniqueId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            Direction direction = Direction.getFromHorizontalId((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (Direction)Direction.NORTH);
            String motive = (String)wrapper.read(BedrockTypes.STRING);
            String javaIdentifier = (String)BedrockProtocol.MAPPINGS.getBedrockToJavaPaintings().get((Object)motive);
            if (javaIdentifier == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown bedrock painting motive: " + motive);
                javaIdentifier = "minecraft:kebab";
            }
            CompoundTag paintingEntry = paintingRegistry.getCompoundTag(javaIdentifier);
            Holder paintingHolder = Holder.of((int)RegistryUtil.getRegistryIndex((CompoundTag)paintingRegistry, (CompoundTag)paintingEntry));
            int width = paintingEntry.getInt("width");
            int height = paintingEntry.getInt("height");
            float widthOffset = width % 2 == 0 ? 0.5f : 0.0f;
            float heightOffset = height % 2 == 0 ? 0.5f : 0.0f;
            Position3f positionOffset = new Position3f(-0.5f, -0.5f, -0.5f);
            positionOffset = switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$Direction[direction.ordinal()]) {
                case 1 -> positionOffset.subtract(-widthOffset, heightOffset, 0.46875f);
                case 2 -> positionOffset.subtract(-0.46875f, heightOffset, -widthOffset);
                case 3 -> positionOffset.subtract(widthOffset, heightOffset, -0.46875f);
                case 4 -> positionOffset.subtract(0.46875f, heightOffset, widthOffset);
                default -> positionOffset;
            };
            Entity entity = entityTracker.addEntity(entityUniqueId, entityRuntimeId, "minecraft:painting", EntityTypes1_21_11.PAINTING);
            entity.setPosition(position);
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write(Types.UUID, (Object)entity.javaUuid());
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaType().getId());
            wrapper.write((Type)Types.DOUBLE, (Object)((double)position.x() + (double)positionOffset.x()));
            wrapper.write((Type)Types.DOUBLE, (Object)((double)position.y() + (double)positionOffset.y()));
            wrapper.write((Type)Types.DOUBLE, (Object)((double)position.z() + (double)positionOffset.z()));
            wrapper.write(Types.LOW_PRECISION_VECTOR, (Object)Vector3d.ZERO);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.VAR_INT, (Object)direction.verticalId());
            wrapper.send(BedrockProtocol.class);
            wrapper.cancel();
            PacketWrapper setEntityData = PacketWrapper.create((PacketType)ClientboundPackets26_1.SET_ENTITY_DATA, (UserConnection)wrapper.user());
            setEntityData.write((Type)Types.VAR_INT, (Object)entity.javaId());
            setEntityData.write(VersionedTypes.V26_1.entityDataList, (Object)Lists.newArrayList((Object[])new EntityData[]{new EntityData(entity.getJavaEntityDataIndex("PAINTING_VARIANT"), ((EntityDataTypes26_1)VersionedTypes.V26_1.entityDataTypes).paintingVariantType, (Object)paintingHolder)}));
            setEntityData.send(BedrockProtocol.class);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.ENTITY_EVENT, (ClientboundPacketType)ClientboundPackets26_1.ENTITY_EVENT, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            byte rawEvent = (Byte)wrapper.read((Type)Types.BYTE);
            ActorEvent event = ActorEvent.getByValue((int)rawEvent);
            if (event == null) {
                wrapper.cancel();
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown ActorEvent: " + rawEvent);
                return;
            }
            int data = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            Entity entity = entityTracker.getEntityByRid(entityRuntimeId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$ActorEvent[event.ordinal()]) {
                case 1: {
                    CompoundTag damageTypeRegistry = gameSession.getJavaRegistries().getCompoundTag("minecraft:damage_type");
                    SharedTypes_Legacy_ActorDamageCause damageCause = SharedTypes_Legacy_ActorDamageCause.getByValue(data, SharedTypes_Legacy_ActorDamageCause.Override);
                    CompoundTag damageTypeEntry = damageTypeRegistry.getCompoundTag(BedrockProtocol.MAPPINGS.getBedrockToJavaDamageCauses().get((Object)damageCause));
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.DAMAGE_EVENT);
                    wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
                    wrapper.write((Type)Types.VAR_INT, (Object)RegistryUtil.getRegistryIndex((CompoundTag)damageTypeRegistry, (CompoundTag)damageTypeEntry));
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    if (entity == entityTracker.getClientPlayer()) break;
                    entity.playSound(SharedTypes_Legacy_LevelSoundEvent.Hurt);
                    break;
                }
                case 2: {
                    wrapper.cancel();
                    if (entity instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity;
                        livingEntity.setHealth(0.0f);
                        livingEntity.sendAttribute("minecraft:health");
                    }
                    if (entity == entityTracker.getClientPlayer() && entityTracker.getClientPlayer().isDead() && gameSession.getDeathMessage() != null) {
                        PacketWrapper playerCombatKill = PacketWrapper.create((PacketType)ClientboundPackets26_1.PLAYER_COMBAT_KILL, (UserConnection)wrapper.user());
                        playerCombatKill.write((Type)Types.VAR_INT, (Object)entityTracker.getClientPlayer().javaId());
                        playerCombatKill.write(Types.TAG, (Object)TextUtil.textComponentToNbt((TextComponent)gameSession.getDeathMessage()));
                        playerCombatKill.send(BedrockProtocol.class);
                    }
                    if (entity == entityTracker.getClientPlayer()) break;
                    entity.playSound(SharedTypes_Legacy_LevelSoundEvent.Death);
                    break;
                }
                default: {
                    wrapper.cancel();
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.UPDATE_ATTRIBUTES, (ClientboundPacketType)ClientboundPackets26_1.UPDATE_ATTRIBUTES, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            EntityAttribute[] attributes = new EntityAttribute[((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT)).intValue()];
            for (int i = 0; i < attributes.length; ++i) {
                float minValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                float maxValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                float currentValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                float defaultMinValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                float defaultMaxValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                float defaultValue = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                String name = (String)wrapper.read(BedrockTypes.STRING);
                EntityAttribute.Modifier[] modifiers = new EntityAttribute.Modifier[((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT)).intValue()];
                for (int j = 0; j < modifiers.length; ++j) {
                    String id = (String)wrapper.read(BedrockTypes.STRING);
                    String modifierName = (String)wrapper.read(BedrockTypes.STRING);
                    float amount = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
                    AttributeModifierOperation operation = AttributeModifierOperation.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.INT_LE)), (AttributeModifierOperation)AttributeModifierOperation.OPERATION_INVALID);
                    AttributeOperands operand = AttributeOperands.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.INT_LE)), (AttributeOperands)AttributeOperands.OPERAND_INVALID);
                    boolean isSerializable = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    modifiers[j] = new EntityAttribute.Modifier(id, modifierName, amount, operation, operand, isSerializable);
                }
                attributes[i] = new EntityAttribute(name, currentValue, minValue, maxValue, defaultValue, defaultMinValue, defaultMaxValue, modifiers);
            }
            wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Entity entity = entityTracker.getEntityByRid(entityRuntimeId);
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                livingEntity.updateAttributes(attributes, wrapper);
            } else {
                wrapper.cancel();
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_ENTITY_DATA, (ClientboundPacketType)ClientboundPackets26_1.SET_ENTITY_DATA, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            EntityData[] entityData = (EntityData[])wrapper.read(BedrockTypes.ENTITY_DATA_ARRAY);
            EntityProperties entityProperties = (EntityProperties)((Object)((Object)wrapper.read(BedrockTypes.ENTITY_PROPERTIES)));
            wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Entity entity = entityTracker.getEntityByRid(entityRuntimeId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            ArrayList javaEntityData = new ArrayList();
            entity.updateEntityData(entityData, javaEntityData);
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write(VersionedTypes.V26_1.entityDataList, javaEntityData);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.MOB_EFFECT, (ClientboundPacketType)ClientboundPackets26_1.UPDATE_MOB_EFFECT, wrapper -> {
            LivingEntity livingEntity;
            boolean ambient;
            int duration;
            boolean showParticles;
            int amplifier;
            int effectId;
            MobEffectPacketPayload_Event event;
            block10: {
                block9: {
                    long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
                    event = MobEffectPacketPayload_Event.getByValue((int)((Byte)wrapper.read((Type)Types.BYTE)).byteValue(), (MobEffectPacketPayload_Event)MobEffectPacketPayload_Event.Invalid);
                    effectId = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                    amplifier = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                    showParticles = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    duration = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                    wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
                    ambient = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    Entity entity = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getEntityByRid(entityRuntimeId);
                    if (!(entity instanceof LivingEntity)) break block9;
                    livingEntity = (LivingEntity)entity;
                    if (effectId != 0) break block10;
                }
                wrapper.cancel();
                return;
            }
            String bedrockIdentifier = (String)BedrockProtocol.MAPPINGS.getBedrockEffects().inverse().get((Object)effectId);
            if (bedrockIdentifier == null) {
                throw new IllegalStateException("Unknown bedrock effect: " + effectId);
            }
            EntityEffect effect = new EntityEffect(bedrockIdentifier, amplifier, duration, showParticles, ambient);
            switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$MobEffectPacketPayload_Event[event.ordinal()]) {
                case 1: {
                    wrapper.cancel();
                    break;
                }
                case 2: 
                case 3: {
                    livingEntity.updateEffect(effect, wrapper);
                    break;
                }
                case 4: {
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.REMOVE_MOB_EFFECT);
                    livingEntity.removeEffect(bedrockIdentifier, wrapper);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled MobEffectPacketPayload_Event: " + String.valueOf(event));
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.ANIMATE, (ClientboundPacketType)ClientboundPackets26_1.ANIMATE, wrapper -> {
            AnimatePacketPayload_Action action = AnimatePacketPayload_Action.getByValue((int)((Short)wrapper.read((Type)Types.UNSIGNED_BYTE)).shortValue(), (AnimatePacketPayload_Action)AnimatePacketPayload_Action.NoAction);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            wrapper.read((Type)BedrockTypes.FLOAT_LE);
            wrapper.read(BedrockTypes.OPTIONAL_STRING);
            Entity entity = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getEntityByRid(entityRuntimeId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)(switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$AnimatePacketPayload_Action[action.ordinal()]) {
                case 1 -> {
                    wrapper.cancel();
                    yield AnimateAction.SWING_MAIN_HAND;
                }
                case 2 -> AnimateAction.SWING_MAIN_HAND;
                case 3 -> {
                    if (entity instanceof ClientPlayerEntity) {
                        ClientPlayerEntity clientPlayer = (ClientPlayerEntity)entity;
                        clientPlayer.sendPlayerActionPacketToServer(PlayerActionType.StopSleeping);
                    }
                    yield AnimateAction.WAKE_UP;
                }
                case 4 -> AnimateAction.CRITICAL_HIT;
                case 5 -> AnimateAction.MAGIC_CRITICAL_HIT;
                default -> throw new IllegalStateException("Unhandled AnimatePacket_Action: " + String.valueOf(action));
            }).ordinal()));
        });
        protocol.registerClientbound(ClientboundBedrockPackets.MOB_ARMOR_EQUIPMENT, (ClientboundPacketType)ClientboundPackets26_1.SET_EQUIPMENT, wrapper -> {
            ItemRewriter itemRewriter = (ItemRewriter)wrapper.user().get(ItemRewriter.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            BedrockItem head = (BedrockItem)wrapper.read(itemRewriter.itemType());
            BedrockItem chest = (BedrockItem)wrapper.read(itemRewriter.itemType());
            BedrockItem legs = (BedrockItem)wrapper.read(itemRewriter.itemType());
            BedrockItem feet = (BedrockItem)wrapper.read(itemRewriter.itemType());
            BedrockItem body = (BedrockItem)wrapper.read(itemRewriter.itemType());
            Entity entity = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getEntityByRid(entityRuntimeId);
            if (entity == null || entity instanceof ClientPlayerEntity) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write((Type)Types.BYTE, (Object)((byte)(EquipmentSlot.FEET.ordinal() | 0xFFFFFF80)));
            wrapper.write(VersionedTypes.V26_1.item, (Object)itemRewriter.javaItem(feet));
            wrapper.write((Type)Types.BYTE, (Object)((byte)(EquipmentSlot.LEGS.ordinal() | 0xFFFFFF80)));
            wrapper.write(VersionedTypes.V26_1.item, (Object)itemRewriter.javaItem(legs));
            wrapper.write((Type)Types.BYTE, (Object)((byte)(EquipmentSlot.CHEST.ordinal() | 0xFFFFFF80)));
            wrapper.write(VersionedTypes.V26_1.item, (Object)itemRewriter.javaItem(chest));
            wrapper.write((Type)Types.BYTE, (Object)((byte)(EquipmentSlot.HEAD.ordinal() | 0xFFFFFF80)));
            wrapper.write(VersionedTypes.V26_1.item, (Object)itemRewriter.javaItem(head));
            wrapper.write((Type)Types.BYTE, (Object)((byte)EquipmentSlot.BODY.ordinal()));
            wrapper.write(VersionedTypes.V26_1.item, (Object)itemRewriter.javaItem(body));
        });
        protocol.registerClientbound(ClientboundBedrockPackets.MOB_EQUIPMENT, (ClientboundPacketType)ClientboundPackets26_1.SET_EQUIPMENT, wrapper -> {
            ItemRewriter itemRewriter = (ItemRewriter)wrapper.user().get(ItemRewriter.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            BedrockItem item = (BedrockItem)wrapper.read(itemRewriter.itemType());
            byte slot = (Byte)wrapper.read((Type)Types.BYTE);
            byte selectedSlot = (Byte)wrapper.read((Type)Types.BYTE);
            byte containerId = (Byte)wrapper.read((Type)Types.BYTE);
            Entity entity = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getEntityByRid(entityRuntimeId);
            if (entity == null || entity instanceof ClientPlayerEntity) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            if (containerId == ContainerID.CONTAINER_ID_INVENTORY.getValue() && slot >= 0 && slot < 9 && (slot == selectedSlot || selectedSlot < 0)) {
                wrapper.write((Type)Types.BYTE, (Object)((byte)EquipmentSlot.MAINHAND.ordinal()));
                wrapper.write(VersionedTypes.V26_1.item, (Object)itemRewriter.javaItem(item));
            } else if (containerId == ContainerID.CONTAINER_ID_OFFHAND.getValue()) {
                wrapper.write((Type)Types.BYTE, (Object)((byte)EquipmentSlot.OFFHAND.ordinal()));
                wrapper.write(VersionedTypes.V26_1.item, (Object)itemRewriter.javaItem(item));
            } else {
                wrapper.cancel();
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.TAKE_ITEM_ENTITY, (ClientboundPacketType)ClientboundPackets26_1.TAKE_ITEM_ENTITY, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            long itemEntityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            long collectorEntityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Entity itemEntity = entityTracker.getEntityByRid(itemEntityRuntimeId);
            Entity collectorEntity = entityTracker.getEntityByRid(collectorEntityRuntimeId);
            if (itemEntity == null || collectorEntity == null || itemEntity.javaType() != EntityTypes1_21_11.ITEM) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)itemEntity.javaId());
            wrapper.write((Type)Types.VAR_INT, (Object)collectorEntity.javaId());
            wrapper.write((Type)Types.VAR_INT, (Object)0);
        });
    }
}

