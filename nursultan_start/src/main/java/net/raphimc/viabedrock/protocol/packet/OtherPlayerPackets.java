/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.Vector3d
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity
 *  net.raphimc.viabedrock.api.model.entity.Entity
 *  net.raphimc.viabedrock.api.model.entity.PlayerEntity
 *  net.raphimc.viabedrock.api.util.BitSets
 *  net.raphimc.viabedrock.api.util.MathUtil
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.api.util.StringUtil
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GameType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerPositionModeComponent_PositionMode
 *  net.raphimc.viabedrock.protocol.data.enums.java.Relative
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.EquipmentSlot
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerInfoUpdateAction
 *  net.raphimc.viabedrock.protocol.model.BedrockItem
 *  net.raphimc.viabedrock.protocol.rewriter.GameTypeRewriter
 *  net.raphimc.viabedrock.protocol.rewriter.ItemRewriter
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.Vector3d;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import java.util.UUID;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity;
import net.raphimc.viabedrock.api.model.entity.Entity;
import net.raphimc.viabedrock.api.model.entity.PlayerEntity;
import net.raphimc.viabedrock.api.util.BitSets;
import net.raphimc.viabedrock.api.util.MathUtil;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.api.util.StringUtil;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GameType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerPositionModeComponent_PositionMode;
import net.raphimc.viabedrock.protocol.data.enums.java.Relative;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.EquipmentSlot;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerInfoUpdateAction;
import net.raphimc.viabedrock.protocol.model.BedrockItem;
import net.raphimc.viabedrock.protocol.model.EntityLink;
import net.raphimc.viabedrock.protocol.model.EntityProperties;
import net.raphimc.viabedrock.protocol.model.PlayerAbilities;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.model.SkinData;
import net.raphimc.viabedrock.protocol.provider.SkinProvider;
import net.raphimc.viabedrock.protocol.rewriter.GameTypeRewriter;
import net.raphimc.viabedrock.protocol.rewriter.ItemRewriter;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class OtherPlayerPackets {
    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.ADD_PLAYER, (ClientboundPacketType)ClientboundPackets26_1.ADD_ENTITY, wrapper -> {
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            ItemRewriter itemRewriter = (ItemRewriter)wrapper.user().get(ItemRewriter.class);
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            UUID uuid = (UUID)wrapper.read(BedrockTypes.UUID);
            String username = (String)wrapper.read(BedrockTypes.STRING);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            String platformOnlineId = (String)wrapper.read(BedrockTypes.STRING);
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            Position3f motion = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            Position3f rotation = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            BedrockItem item = (BedrockItem)wrapper.read(itemRewriter.itemType());
            GameType gameType = GameType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (GameType)GameType.Undefined);
            EntityData[] entityData = (EntityData[])wrapper.read(BedrockTypes.ENTITY_DATA_ARRAY);
            EntityProperties entityProperties = (EntityProperties)((Object)((Object)wrapper.read(BedrockTypes.ENTITY_PROPERTIES)));
            PlayerAbilities abilities = (PlayerAbilities)((Object)((Object)wrapper.read(BedrockTypes.PLAYER_ABILITIES)));
            EntityLink[] entityLinks = (EntityLink[])wrapper.read(BedrockTypes.ENTITY_LINK_ARRAY);
            PlayerEntity entity = (PlayerEntity)entityTracker.addEntity((Entity)new PlayerEntity(wrapper.user(), entityRuntimeId, entityTracker.getNextJavaEntityId(), uuid, abilities));
            entity.setPosition(position);
            entity.setRotation(rotation);
            entity.updateName(username);
            PacketWrapper playerInfoUpdate = PacketWrapper.create((PacketType)ClientboundPackets26_1.PLAYER_INFO_UPDATE, (UserConnection)wrapper.user());
            playerInfoUpdate.write((Type)Types.PROFILE_ACTIONS_ENUM1_21_4, (Object)BitSets.create((int)8, (Enum[])new Enum[]{PlayerInfoUpdateAction.ADD_PLAYER, PlayerInfoUpdateAction.UPDATE_GAME_MODE}));
            playerInfoUpdate.write((Type)Types.VAR_INT, (Object)1);
            playerInfoUpdate.write(Types.UUID, (Object)uuid);
            playerInfoUpdate.write(Types.STRING, (Object)StringUtil.encodeUUID((UUID)uuid));
            playerInfoUpdate.write(Types.PROFILE_PROPERTY_ARRAY, (Object)new GameProfile.Property[]{new GameProfile.Property("platform_online_id", platformOnlineId), new GameProfile.Property("device_id", (String)wrapper.read(BedrockTypes.STRING)), new GameProfile.Property("device_os", ((Integer)wrapper.read((Type)BedrockTypes.INT_LE)).toString())});
            playerInfoUpdate.write((Type)Types.VAR_INT, (Object)GameTypeRewriter.getEffectiveGameMode((GameType)gameType, (GameType)gameSession.getLevelGameType()).ordinal());
            playerInfoUpdate.send(BedrockProtocol.class);
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write(Types.UUID, (Object)uuid);
            wrapper.write((Type)Types.VAR_INT, (Object)EntityTypes1_21_11.PLAYER.getId());
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
            PacketWrapper setEquipment = PacketWrapper.create((PacketType)ClientboundPackets26_1.SET_EQUIPMENT, (UserConnection)wrapper.user());
            setEquipment.write((Type)Types.VAR_INT, (Object)entity.javaId());
            setEquipment.write((Type)Types.BYTE, (Object)((byte)EquipmentSlot.MAINHAND.ordinal()));
            setEquipment.write(VersionedTypes.V26_1.item, (Object)itemRewriter.javaItem(item));
            setEquipment.send(BedrockProtocol.class);
            entity.sendInitialEntityData();
            entity.updateEntityData(entityData);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.MOVE_PLAYER, (ClientboundPacketType)ClientboundPackets26_1.ENTITY_POSITION_SYNC, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            Position3f rotation = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            PlayerPositionModeComponent_PositionMode mode = PlayerPositionModeComponent_PositionMode.getByValue((int)((Byte)wrapper.read((Type)Types.BYTE)).byteValue(), (PlayerPositionModeComponent_PositionMode)PlayerPositionModeComponent_PositionMode.OnlyHeadRot);
            boolean onGround = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            if (mode == PlayerPositionModeComponent_PositionMode.Teleport) {
                wrapper.read((Type)BedrockTypes.INT_LE);
                wrapper.read((Type)BedrockTypes.INT_LE);
            }
            wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Entity entity = entityTracker.getEntityByRid(entityRuntimeId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            if (!entity.javaType().isOrHasParent((EntityType)EntityTypes1_21_11.PLAYER)) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received move player packet for non-player entity: " + String.valueOf(entity.javaType()));
                wrapper.cancel();
                return;
            }
            if (mode == PlayerPositionModeComponent_PositionMode.OnlyHeadRot) {
                entity.setRotation(new Position3f(rotation.x(), entity.rotation().y(), entity.rotation().z()));
                wrapper.setPacketType((PacketType)ClientboundPackets26_1.MOVE_ENTITY_ROT);
                wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
                wrapper.write((Type)Types.BYTE, (Object)MathUtil.float2Byte((float)entity.rotation().y()));
                wrapper.write((Type)Types.BYTE, (Object)MathUtil.float2Byte((float)rotation.x()));
                wrapper.write((Type)Types.BOOLEAN, (Object)entity.isOnGround());
                return;
            }
            entity.setPosition(position);
            entity.setRotation(rotation);
            entity.setOnGround(onGround);
            if ((mode == PlayerPositionModeComponent_PositionMode.Teleport || mode == PlayerPositionModeComponent_PositionMode.Respawn) && entity instanceof ClientPlayerEntity) {
                ClientPlayerEntity clientPlayer = (ClientPlayerEntity)entity;
                wrapper.setPacketType((PacketType)ClientboundPackets26_1.PLAYER_POSITION);
                clientPlayer.writePlayerPositionPacketToClient(wrapper, Relative.NONE, mode == PlayerPositionModeComponent_PositionMode.Respawn);
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)entity.javaId());
            wrapper.write((Type)Types.DOUBLE, (Object)position.x());
            wrapper.write((Type)Types.DOUBLE, (Object)((double)position.y() - (double)entity.eyeOffset()));
            wrapper.write((Type)Types.DOUBLE, (Object)position.z());
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.DOUBLE, (Object)0.0);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(rotation.y()));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(rotation.x()));
            wrapper.write((Type)Types.BOOLEAN, (Object)onGround);
            PacketFactory.sendJavaRotateHead((UserConnection)wrapper.user(), (Entity)entity);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.PLAYER_SKIN, null, wrapper -> {
            wrapper.cancel();
            UUID uuid = (UUID)wrapper.read(BedrockTypes.UUID);
            SkinData skin = (SkinData)((Object)((Object)wrapper.read(BedrockTypes.SKIN)));
            wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            wrapper.read((Type)Types.BOOLEAN);
            ((SkinProvider)Via.getManager().getProviders().get(SkinProvider.class)).setSkin(wrapper.user(), uuid, skin);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.UPDATE_ABILITIES, (ClientboundPacketType)ClientboundPackets26_1.PLAYER_ABILITIES, wrapper -> {
            PlayerAbilities abilities;
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            Entity entity = entityTracker.getEntityByUid((abilities = (PlayerAbilities)((Object)((Object)wrapper.read(BedrockTypes.PLAYER_ABILITIES)))).entityUniqueId());
            if (entity instanceof ClientPlayerEntity) {
                ClientPlayerEntity clientPlayer = (ClientPlayerEntity)entity;
                clientPlayer.setAbilities(abilities, wrapper);
            } else if (entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;
                player.setAbilities(abilities);
                wrapper.cancel();
            } else {
                wrapper.cancel();
            }
        });
    }
}

