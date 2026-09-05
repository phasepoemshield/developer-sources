/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.Vector3d
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  com.viaversion.viaversion.util.Pair
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.model.container.Container
 *  net.raphimc.viabedrock.api.model.container.player.InventoryContainer
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity$AuthInputBlockAction
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity$BlockBreakingInfo
 *  net.raphimc.viabedrock.api.model.entity.Entity
 *  net.raphimc.viabedrock.api.util.BitSets
 *  net.raphimc.viabedrock.api.util.MathUtil
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.protocol.data.enums.Direction
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AbilitiesIndex
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ActorSwingSource
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AnimatePacketPayload_Action
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ClientPlayMode
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ComplexInventoryTransaction_Type
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GameType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InputMode
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemUseOnActorInventoryTransaction_ActionType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.NewInteractionModel
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerActionType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerAuthInputPacket_InputData
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerRespawnState
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.RewindType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ServerboundLoadingScreenPacketType
 *  net.raphimc.viabedrock.protocol.data.enums.java.AbilitiesFlag
 *  net.raphimc.viabedrock.protocol.data.enums.java.GameEventType
 *  net.raphimc.viabedrock.protocol.data.enums.java.InputFlag
 *  net.raphimc.viabedrock.protocol.data.enums.java.Relative
 *  net.raphimc.viabedrock.protocol.data.enums.java.RespawnKeepFlag
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.ClientCommandAction
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.GameMode
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.InteractionHand
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerActionAction
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerCommandAction
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerInfoUpdateAction
 *  net.raphimc.viabedrock.protocol.model.EntityAttribute
 *  net.raphimc.viabedrock.protocol.model.EntityEffect
 *  net.raphimc.viabedrock.protocol.packet.ClientPlayerPackets$5
 *  net.raphimc.viabedrock.protocol.rewriter.GameTypeRewriter
 *  net.raphimc.viabedrock.protocol.rewriter.ItemRewriter
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameRulesStorage
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.storage.InventoryTracker
 *  net.raphimc.viabedrock.protocol.storage.PlayerListStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.Vector3d;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import com.viaversion.viaversion.util.Pair;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.model.container.Container;
import net.raphimc.viabedrock.api.model.container.player.InventoryContainer;
import net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity;
import net.raphimc.viabedrock.api.model.entity.Entity;
import net.raphimc.viabedrock.api.util.BitSets;
import net.raphimc.viabedrock.api.util.EnumUtil;
import net.raphimc.viabedrock.api.util.MathUtil;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.Direction;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AbilitiesIndex;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ActorSwingSource;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AnimatePacketPayload_Action;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ClientPlayMode;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ComplexInventoryTransaction_Type;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GameType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InputMode;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemUseOnActorInventoryTransaction_ActionType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.NewInteractionModel;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerActionType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerAuthInputPacket_InputData;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerRespawnState;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.RewindType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ServerboundLoadingScreenPacketType;
import net.raphimc.viabedrock.protocol.data.enums.java.AbilitiesFlag;
import net.raphimc.viabedrock.protocol.data.enums.java.GameEventType;
import net.raphimc.viabedrock.protocol.data.enums.java.InputFlag;
import net.raphimc.viabedrock.protocol.data.enums.java.Relative;
import net.raphimc.viabedrock.protocol.data.enums.java.RespawnKeepFlag;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.ClientCommandAction;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.GameMode;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.InteractionHand;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerActionAction;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerCommandAction;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerInfoUpdateAction;
import net.raphimc.viabedrock.protocol.model.EntityAttribute;
import net.raphimc.viabedrock.protocol.model.EntityEffect;
import net.raphimc.viabedrock.protocol.model.Position2f;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.packet.ClientPlayerPackets;
import net.raphimc.viabedrock.protocol.rewriter.GameTypeRewriter;
import net.raphimc.viabedrock.protocol.rewriter.ItemRewriter;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameRulesStorage;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.storage.InventoryTracker;
import net.raphimc.viabedrock.protocol.storage.PlayerListStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ClientPlayerPackets {
    private static final PacketHandler CLIENT_PLAYER_GAME_MODE_INFO_UPDATE = wrapper -> {
        ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
        PacketWrapper playerInfoUpdate = PacketWrapper.create((PacketType)ClientboundPackets26_1.PLAYER_INFO_UPDATE, (UserConnection)wrapper.user());
        playerInfoUpdate.write((Type)Types.PROFILE_ACTIONS_ENUM1_21_4, (Object)BitSets.create((int)8, (Enum[])new Enum[]{PlayerInfoUpdateAction.UPDATE_GAME_MODE}));
        playerInfoUpdate.write((Type)Types.VAR_INT, (Object)1);
        playerInfoUpdate.write(Types.UUID, (Object)clientPlayer.javaUuid());
        playerInfoUpdate.write((Type)Types.VAR_INT, (Object)clientPlayer.javaGameMode().ordinal());
        playerInfoUpdate.send(BedrockProtocol.class);
    };
    private static final PacketHandler CLIENT_PLAYER_GAME_MODE_UPDATE = wrapper -> {
        ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
        PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.CHANGE_GAME_MODE, (float)clientPlayer.javaGameMode().ordinal());
    };

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.RESPAWN, (ClientboundPacketType)ClientboundPackets26_1.RESPAWN, wrapper -> {
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            byte rawState = (Byte)wrapper.read((Type)Types.BYTE);
            PlayerRespawnState state = PlayerRespawnState.getByValue((int)rawState);
            if (state == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown PlayerRespawnState: " + rawState);
                wrapper.cancel();
                return;
            }
            wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            switch (5.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$PlayerRespawnState[state.ordinal()]) {
                case 1: {
                    ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
                    clientPlayer.setPosition(position);
                    if (clientPlayer.isInitiallySpawned()) {
                        GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
                        GameRulesStorage gameRulesStorage = (GameRulesStorage)wrapper.user().get(GameRulesStorage.class);
                        ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
                        InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                        if (clientPlayer.isDead() && !((Boolean)gameRulesStorage.getGameRule("keepInventory")).booleanValue()) {
                            inventoryTracker.getInventoryContainer().clearItems();
                            inventoryTracker.getOffhandContainer().clearItems();
                            inventoryTracker.getArmorContainer().clearItems();
                            inventoryTracker.getHudContainer().clearItems();
                        }
                        clientPlayer.clearEffects();
                        clientPlayer.setHealth(((EntityAttribute)clientPlayer.attributes().get("minecraft:health")).maxValue());
                        clientPlayer.sendPlayerActionPacketToServer(PlayerActionType.Respawn, -1);
                        wrapper.write((Type)Types.VAR_INT, (Object)chunkTracker.getDimension().ordinal());
                        wrapper.write(Types.STRING, (Object)chunkTracker.getDimension().getKey());
                        wrapper.write((Type)Types.LONG, (Object)0L);
                        wrapper.write((Type)Types.BYTE, (Object)((byte)clientPlayer.javaGameMode().ordinal()));
                        wrapper.write((Type)Types.BYTE, (Object)-1);
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                        wrapper.write((Type)Types.BOOLEAN, (Object)gameSession.isFlatGenerator());
                        wrapper.write(Types.OPTIONAL_GLOBAL_POSITION, null);
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        wrapper.write((Type)Types.VAR_INT, (Object)64);
                        wrapper.write((Type)Types.BYTE, (Object)((byte)(RespawnKeepFlag.ATTRIBUTE_MODIFIERS.getBit() | RespawnKeepFlag.ENTITY_DATA.getBit())));
                        wrapper.send(BedrockProtocol.class);
                        clientPlayer.sendAttribute("minecraft:health");
                        clientPlayer.setAbilities(clientPlayer.abilities());
                        PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.LEVEL_CHUNKS_LOAD_START, (float)0.0f);
                        if (((Boolean)gameRulesStorage.getGameRule("keepInventory")).booleanValue()) {
                            PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)inventoryTracker.getInventoryContainer());
                        }
                        inventoryTracker.getInventoryContainer().sendSelectedHotbarSlotToClient();
                    }
                    wrapper.cancel();
                    clientPlayer.sendPlayerPositionPacketToClient(Relative.NONE);
                    break;
                }
                case 2: 
                case 3: {
                    wrapper.cancel();
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled PlayerRespawnState: " + String.valueOf(state));
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.PLAYER_ACTION, null, wrapper -> {
            ClientPlayerEntity clientPlayer;
            wrapper.cancel();
            wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            int rawAction = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            PlayerActionType action = PlayerActionType.getByValue((int)rawAction);
            if (action == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown PlayerActionType: " + rawAction);
                return;
            }
            wrapper.read(BedrockTypes.BLOCK_POSITION);
            wrapper.read(BedrockTypes.BLOCK_POSITION);
            wrapper.read((Type)BedrockTypes.VAR_INT);
            if (action == PlayerActionType.ChangeDimensionAck && (clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer()).dimensionChangeInfo() != null) {
                clientPlayer.sendPlayerActionPacketToServer(PlayerActionType.ChangeDimensionAck);
                PacketFactory.sendBedrockLoadingScreen((UserConnection)wrapper.user(), (ServerboundLoadingScreenPacketType)ServerboundLoadingScreenPacketType.EndLoadingScreen, (Long)clientPlayer.dimensionChangeInfo().loadingScreenId());
                clientPlayer.sendPlayerPositionPacketToClient(Relative.NONE);
                PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.LEVEL_CHUNKS_LOAD_START, (float)0.0f);
                clientPlayer.setDimensionChangeInfo(null);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.CORRECT_PLAYER_MOVE_PREDICTION, (ClientboundPacketType)ClientboundPackets26_1.PLAYER_POSITION, wrapper -> {
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            byte rawRewindType = (Byte)wrapper.read((Type)Types.BYTE);
            RewindType rewindType = RewindType.getByValue((int)rawRewindType);
            if (rewindType == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown RewindType: " + rawRewindType);
                return;
            }
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            wrapper.read(BedrockTypes.POSITION_3F);
            wrapper.read(BedrockTypes.POSITION_2F);
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.read((Type)BedrockTypes.FLOAT_LE);
            }
            switch (5.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$RewindType[rewindType.ordinal()]) {
                case 1: {
                    ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
                    boolean onGround = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    long tick = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
                    if (tick > (long)clientPlayer.age() || tick < (long)(clientPlayer.age() - gameSession.getMovementRewindHistorySize())) {
                        wrapper.cancel();
                        return;
                    }
                    clientPlayer.setPosition(position);
                    clientPlayer.setOnGround(onGround);
                    clientPlayer.writePlayerPositionPacketToClient(wrapper, Relative.union((Set[])new Set[]{Relative.ROTATION, Relative.VELOCITY}), true);
                    break;
                }
                case 2: {
                    wrapper.cancel();
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled RewindType: " + String.valueOf(rewindType));
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_PLAYER_GAME_TYPE, null, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.handler(wrapper -> {
                    wrapper.cancel();
                    ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer().setGameType(GameType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (GameType)GameType.Undefined));
                });
                this.handler(CLIENT_PLAYER_GAME_MODE_INFO_UPDATE);
                this.handler(CLIENT_PLAYER_GAME_MODE_UPDATE);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_DEFAULT_GAME_TYPE, null, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.handler(wrapper -> {
                    wrapper.cancel();
                    ((GameSessionStorage)wrapper.user().get(GameSessionStorage.class)).setLevelGameType(GameType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (GameType)GameType.Undefined));
                    ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer().updateJavaGameMode();
                });
                this.handler(CLIENT_PLAYER_GAME_MODE_INFO_UPDATE);
                this.handler(CLIENT_PLAYER_GAME_MODE_UPDATE);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.UPDATE_PLAYER_GAME_TYPE, (ClientboundPacketType)ClientboundPackets26_1.PLAYER_INFO_UPDATE, wrapper -> {
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            PlayerListStorage playerList = (PlayerListStorage)wrapper.user().get(PlayerListStorage.class);
            GameType gameType = GameType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (GameType)GameType.Undefined);
            long entityUniqueId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
            wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            Pair playerListEntry = playerList.getPlayer(entityUniqueId);
            if (playerListEntry == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.PROFILE_ACTIONS_ENUM1_21_4, (Object)BitSets.create((int)8, (Enum[])new Enum[]{PlayerInfoUpdateAction.UPDATE_GAME_MODE}));
            wrapper.write((Type)Types.VAR_INT, (Object)1);
            wrapper.write(Types.UUID, (Object)((UUID)playerListEntry.key()));
            wrapper.write((Type)Types.VAR_INT, (Object)GameTypeRewriter.getEffectiveGameMode((GameType)gameType, (GameType)gameSession.getLevelGameType()).ordinal());
            if (((UUID)playerListEntry.key()).equals(clientPlayer.javaUuid())) {
                clientPlayer.setGameType(gameType);
                CLIENT_PLAYER_GAME_MODE_UPDATE.handle(wrapper);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.UPDATE_ADVENTURE_SETTINGS, null, wrapper -> {
            wrapper.cancel();
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            ((GameSessionStorage)wrapper.user().get(GameSessionStorage.class)).setImmutableWorld(((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue());
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.OPEN_SIGN, (ClientboundPacketType)ClientboundPackets26_1.OPEN_SIGN_EDITOR, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(BedrockTypes.BLOCK_POSITION, Types.BLOCK_POSITION1_14);
                this.map((Type)Types.BOOLEAN);
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CLIENT_COMMAND, ServerboundBedrockPackets.RESPAWN, wrapper -> {
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            ClientCommandAction action = ClientCommandAction.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
            switch (5.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$java$generated$ClientCommandAction[action.ordinal()]) {
                case 1: {
                    wrapper.write(BedrockTypes.POSITION_3F, (Object)Position3f.ZERO);
                    wrapper.write((Type)Types.BYTE, (Object)((byte)PlayerRespawnState.ClientReadyToSpawn.getValue()));
                    wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)clientPlayer.runtimeId());
                    break;
                }
                case 2: 
                case 3: {
                    wrapper.cancel();
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled ClientCommandAction: " + String.valueOf(action));
                }
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.PLAYER_COMMAND, null, wrapper -> {
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            wrapper.read((Type)Types.VAR_INT);
            PlayerCommandAction action = PlayerCommandAction.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
            int data = (Integer)wrapper.read((Type)Types.VAR_INT);
            switch (5.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$java$generated$PlayerCommandAction[action.ordinal()]) {
                case 1: {
                    clientPlayer.setSprinting(true);
                    clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.StartSprinting);
                    break;
                }
                case 2: {
                    clientPlayer.setSprinting(false);
                    clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.StopSprinting);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled PlayerCommandAction: " + String.valueOf(action));
                }
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.PLAYER_ACTION, null, wrapper -> {
            boolean isMining;
            wrapper.cancel();
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            PlayerActionAction action = PlayerActionAction.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
            BlockPosition position = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_14);
            Direction direction = Direction.values()[(Short)wrapper.read((Type)Types.UNSIGNED_BYTE)];
            int sequence = (Integer)wrapper.read((Type)Types.VAR_INT);
            boolean bl = isMining = action == PlayerActionAction.START_DESTROY_BLOCK || action == PlayerActionAction.ABORT_DESTROY_BLOCK || action == PlayerActionAction.STOP_DESTROY_BLOCK;
            if (isMining && (gameSession.isImmutableWorld() || !clientPlayer.abilities().getBooleanValue(AbilitiesIndex.Mine))) {
                PacketFactory.sendJavaBlockUpdate((UserConnection)wrapper.user(), (BlockPosition)position, (int)chunkTracker.getJavaBlockState(position));
                PacketFactory.sendJavaBlockChangedAck((UserConnection)wrapper.user(), (int)sequence);
                return;
            }
            switch (5.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$java$generated$PlayerActionAction[action.ordinal()]) {
                case 1: {
                    clientPlayer.sendSwingPacketToServer();
                    clientPlayer.cancelNextSwingPacket();
                    clientPlayer.setBlockBreakingInfo(new ClientPlayerEntity.BlockBreakingInfo(position, direction));
                    clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.StartDestroyBlock, position, direction.ordinal()));
                    break;
                }
                case 2: {
                    clientPlayer.setBlockBreakingInfo(null);
                    clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.AbortDestroyBlock, position, 0));
                    break;
                }
                case 3: {
                    clientPlayer.cancelNextSwingPacket();
                    clientPlayer.setBlockBreakingInfo(null);
                    if (!gameSession.isBlockBreakingServerAuthoritative()) {
                        clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.StopDestroyBlock));
                        clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.CrackBlock, position, direction.ordinal()));
                        clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.AbortDestroyBlock, position, 0));
                    } else {
                        clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.ContinueDestroyBlock, position, direction.ordinal()));
                        clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.PredictDestroyBlock, position, direction.ordinal()));
                        clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.AbortDestroyBlock, position, 0));
                    }
                    chunkTracker.handleBlockChange(position, 0, chunkTracker.bedrockAirId());
                    PacketFactory.sendJavaBlockUpdate((UserConnection)wrapper.user(), (BlockPosition)position, (int)0);
                    break;
                }
                case 4: 
                case 5: {
                    PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)((InventoryTracker)wrapper.user().get(InventoryTracker.class)).getInventoryContainer());
                    break;
                }
                case 6: {
                    PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)((InventoryTracker)wrapper.user().get(InventoryTracker.class)).getInventoryContainer());
                    break;
                }
                case 7: 
                case 8: {
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled PlayerActionAction: " + String.valueOf(action));
                }
            }
            if (sequence > 0) {
                PacketFactory.sendJavaBlockChangedAck((UserConnection)wrapper.user(), (int)sequence);
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.ATTACK, ServerboundBedrockPackets.INVENTORY_TRANSACTION, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            InventoryContainer inventoryContainer = ((InventoryTracker)wrapper.user().get(InventoryTracker.class)).getInventoryContainer();
            int entityId = (Integer)wrapper.read((Type)Types.VAR_INT);
            Entity entity = entityTracker.getEntityByJid(entityId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)BedrockTypes.VAR_INT, (Object)0);
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)ComplexInventoryTransaction_Type.ItemUseOnEntityTransaction.getValue());
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)0);
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)entity.runtimeId());
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)ItemUseOnActorInventoryTransaction_ActionType.Attack.getValue());
            wrapper.write((Type)BedrockTypes.VAR_INT, (Object)inventoryContainer.getSelectedHotbarSlot());
            wrapper.write(((ItemRewriter)wrapper.user().get(ItemRewriter.class)).itemType(), (Object)inventoryContainer.getSelectedHotbarItem());
            wrapper.write(BedrockTypes.POSITION_3F, (Object)entityTracker.getClientPlayer().position());
            wrapper.write(BedrockTypes.POSITION_3F, (Object)Position3f.ZERO);
            entityTracker.getClientPlayer().sendSwingPacketToServer();
            entityTracker.getClientPlayer().cancelNextSwingPacket();
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.INTERACT, ServerboundBedrockPackets.INVENTORY_TRANSACTION, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            InventoryContainer inventoryContainer = ((InventoryTracker)wrapper.user().get(InventoryTracker.class)).getInventoryContainer();
            int entityId = (Integer)wrapper.read((Type)Types.VAR_INT);
            Entity entity = entityTracker.getEntityByJid(entityId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            InteractionHand hand = InteractionHand.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
            if (hand != InteractionHand.MAIN_HAND) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)BedrockTypes.VAR_INT, (Object)0);
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)ComplexInventoryTransaction_Type.ItemUseOnEntityTransaction.getValue());
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)0);
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)entity.runtimeId());
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)ItemUseOnActorInventoryTransaction_ActionType.Interact.getValue());
            wrapper.write((Type)BedrockTypes.VAR_INT, (Object)inventoryContainer.getSelectedHotbarSlot());
            wrapper.write(((ItemRewriter)wrapper.user().get(ItemRewriter.class)).itemType(), (Object)inventoryContainer.getSelectedHotbarItem());
            wrapper.write(BedrockTypes.POSITION_3F, (Object)entityTracker.getClientPlayer().position());
            Vector3d location = (Vector3d)wrapper.read(Types.LOW_PRECISION_VECTOR);
            wrapper.write(BedrockTypes.POSITION_3F, (Object)entity.position().add((float)location.x(), (float)location.y(), (float)location.z()));
            wrapper.read((Type)Types.BOOLEAN);
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.MOVE_PLAYER_STATUS_ONLY, null, wrapper -> {
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            clientPlayer.updatePlayerPosition(((Short)wrapper.read((Type)Types.UNSIGNED_BYTE)).shortValue());
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.MOVE_PLAYER_POS, null, wrapper -> {
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            clientPlayer.updatePlayerPosition(((Double)wrapper.read((Type)Types.DOUBLE)).doubleValue(), ((Double)wrapper.read((Type)Types.DOUBLE)).doubleValue(), ((Double)wrapper.read((Type)Types.DOUBLE)).doubleValue(), ((Short)wrapper.read((Type)Types.UNSIGNED_BYTE)).shortValue());
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.MOVE_PLAYER_POS_ROT, null, wrapper -> {
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            clientPlayer.updatePlayerPosition(((Double)wrapper.read((Type)Types.DOUBLE)).doubleValue(), ((Double)wrapper.read((Type)Types.DOUBLE)).doubleValue(), ((Double)wrapper.read((Type)Types.DOUBLE)).doubleValue(), MathUtil.wrapDegrees((float)((Float)wrapper.read((Type)Types.FLOAT)).floatValue()), ((Float)wrapper.read((Type)Types.FLOAT)).floatValue(), ((Short)wrapper.read((Type)Types.UNSIGNED_BYTE)).shortValue());
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.MOVE_PLAYER_ROT, null, wrapper -> {
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            clientPlayer.updatePlayerPosition(MathUtil.wrapDegrees((float)((Float)wrapper.read((Type)Types.FLOAT)).floatValue()), ((Float)wrapper.read((Type)Types.FLOAT)).floatValue(), ((Short)wrapper.read((Type)Types.UNSIGNED_BYTE)).shortValue());
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.ACCEPT_TELEPORTATION, null, wrapper -> {
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            clientPlayer.confirmTeleport(((Integer)wrapper.read((Type)Types.VAR_INT)).intValue());
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.PLAYER_INPUT, null, wrapper -> {
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            Set<InputFlag> inputFlags = EnumUtil.getEnumSetFromBitmask(InputFlag.class, ((Byte)wrapper.read((Type)Types.BYTE)).byteValue(), Enum::ordinal);
            clientPlayer.setInputFlags(inputFlags);
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CLIENT_TICK_END, ServerboundBedrockPackets.PLAYER_AUTH_INPUT, wrapper -> {
            Position3f velocity;
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            Position3f prevPosition = clientPlayer.prevPosition();
            boolean prevOnGround = clientPlayer.prevOnGround();
            Set prevInputFlags = clientPlayer.prevInputFlags();
            clientPlayer.tick();
            if (prevOnGround && clientPlayer.inputFlags().contains(InputFlag.JUMP)) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.StartJumping);
            }
            if (!clientPlayer.isInitiallySpawned() || clientPlayer.isDead()) {
                wrapper.cancel();
                return;
            }
            clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.BlockBreakingDelayEnabled);
            if (clientPlayer.isOnGround()) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.VerticalCollision);
            }
            if (clientPlayer.horizontalCollision()) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.HorizontalCollision);
            }
            if (clientPlayer.inputFlags().contains(InputFlag.FORWARD)) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.Up);
            }
            if (clientPlayer.inputFlags().contains(InputFlag.BACKWARD)) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.Down);
            }
            if (clientPlayer.inputFlags().contains(InputFlag.LEFT)) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.Left);
            }
            if (clientPlayer.inputFlags().contains(InputFlag.RIGHT)) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.Right);
            }
            if (clientPlayer.inputFlags().contains(InputFlag.JUMP)) {
                clientPlayer.addAuthInputData(new PlayerAuthInputPacket_InputData[]{PlayerAuthInputPacket_InputData.JumpDown, PlayerAuthInputPacket_InputData.Jumping, PlayerAuthInputPacket_InputData.WantUp, PlayerAuthInputPacket_InputData.JumpCurrentRaw});
            }
            if (clientPlayer.inputFlags().contains(InputFlag.SHIFT)) {
                clientPlayer.addAuthInputData(new PlayerAuthInputPacket_InputData[]{PlayerAuthInputPacket_InputData.SneakDown, PlayerAuthInputPacket_InputData.Sneaking, PlayerAuthInputPacket_InputData.WantDown, PlayerAuthInputPacket_InputData.SneakCurrentRaw});
            }
            if (clientPlayer.inputFlags().contains(InputFlag.SPRINT)) {
                clientPlayer.addAuthInputData(new PlayerAuthInputPacket_InputData[]{PlayerAuthInputPacket_InputData.SprintDown, PlayerAuthInputPacket_InputData.Sprinting});
            }
            if (clientPlayer.inputFlags().contains(InputFlag.JUMP) && !prevInputFlags.contains(InputFlag.JUMP)) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.JumpPressedRaw);
            }
            if (prevInputFlags.contains(InputFlag.JUMP) && !clientPlayer.inputFlags().contains(InputFlag.JUMP)) {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.JumpReleasedRaw);
            }
            if (clientPlayer.inputFlags().contains(InputFlag.SHIFT) && !prevInputFlags.contains(InputFlag.SHIFT)) {
                clientPlayer.setSneaking(true);
                clientPlayer.addAuthInputData(new PlayerAuthInputPacket_InputData[]{PlayerAuthInputPacket_InputData.SneakPressedRaw, PlayerAuthInputPacket_InputData.StartSneaking});
            }
            if (prevInputFlags.contains(InputFlag.SHIFT) && !clientPlayer.inputFlags().contains(InputFlag.SHIFT)) {
                clientPlayer.setSneaking(false);
                clientPlayer.addAuthInputData(new PlayerAuthInputPacket_InputData[]{PlayerAuthInputPacket_InputData.SneakReleasedRaw, PlayerAuthInputPacket_InputData.StopSneaking});
            }
            Position3f positionDelta = clientPlayer.position().subtract(prevPosition);
            if (!clientPlayer.isInitiallySpawned() || clientPlayer.dimensionChangeInfo() != null || clientPlayer.abilities().getBooleanValue(AbilitiesIndex.Flying)) {
                velocity = positionDelta;
            } else {
                float dx = positionDelta.x() * 0.98f;
                float dy = positionDelta.y();
                float dz = positionDelta.z() * 0.98f;
                float friction = clientPlayer.isOnGround() ? 0.6f : 1.0f;
                dy = clientPlayer.effects().containsKey("minecraft:levitation") ? (dy += 0.05f * (float)(((EntityEffect)clientPlayer.effects().get("minecraft:levitation")).amplifier() + 1) * 0.2f) : (dy -= 0.08f);
                velocity = new Position3f((dx *= friction) * 0.91f, dy * 0.98f, (dz *= friction) * 0.91f);
            }
            wrapper.write((Type)BedrockTypes.FLOAT_LE, (Object)Float.valueOf(clientPlayer.rotation().x()));
            wrapper.write((Type)BedrockTypes.FLOAT_LE, (Object)Float.valueOf(clientPlayer.rotation().y()));
            wrapper.write(BedrockTypes.POSITION_3F, (Object)clientPlayer.position());
            wrapper.write(BedrockTypes.POSITION_2F, (Object)MathUtil.calculateMovementDirections((Set)clientPlayer.authInputData(), (boolean)clientPlayer.isSneaking()));
            wrapper.write((Type)BedrockTypes.FLOAT_LE, (Object)Float.valueOf(clientPlayer.rotation().z()));
            wrapper.write(BedrockTypes.UNSIGNED_VAR_BIG_INTEGER, (Object)EnumUtil.getBigBitmaskFromEnumSet(clientPlayer.authInputData(), PlayerAuthInputPacket_InputData::getValue));
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)InputMode.Mouse.getValue());
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)ClientPlayMode.Screen.getValue());
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)NewInteractionModel.Touch.getValue());
            wrapper.write((Type)BedrockTypes.FLOAT_LE, (Object)Float.valueOf(clientPlayer.rotation().x()));
            wrapper.write((Type)BedrockTypes.FLOAT_LE, (Object)Float.valueOf(clientPlayer.rotation().y()));
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)clientPlayer.age());
            wrapper.write(BedrockTypes.POSITION_3F, (Object)velocity);
            if (clientPlayer.authInputData().contains(PlayerAuthInputPacket_InputData.PerformBlockActions)) {
                wrapper.write((Type)BedrockTypes.VAR_INT, (Object)clientPlayer.authInputBlockActions().size());
                for (ClientPlayerEntity.AuthInputBlockAction blockAction : clientPlayer.authInputBlockActions()) {
                    wrapper.write((Type)BedrockTypes.VAR_INT, (Object)blockAction.action().getValue());
                    switch (5.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$PlayerActionType[blockAction.action().ordinal()]) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: {
                            wrapper.write(BedrockTypes.BLOCK_POSITION, (Object)blockAction.position());
                            wrapper.write((Type)BedrockTypes.VAR_INT, (Object)blockAction.direction());
                        }
                    }
                }
            }
            wrapper.write(BedrockTypes.POSITION_2F, (Object)new Position2f(0.0f, 0.0f));
            wrapper.write(BedrockTypes.POSITION_3F, (Object)MathUtil.calculateCameraOrientation((float)clientPlayer.rotation().y(), (float)clientPlayer.rotation().x()));
            wrapper.write(BedrockTypes.POSITION_2F, (Object)MathUtil.calculateMovementDirections((Set)clientPlayer.authInputData(), (boolean)false));
            clientPlayer.authInputData().clear();
            clientPlayer.authInputBlockActions().clear();
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.PLAYER_ABILITIES, null, wrapper -> {
            boolean flying;
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            byte flags = (Byte)wrapper.read((Type)Types.BYTE);
            boolean bl = flying = (flags & AbilitiesFlag.FLYING.getBit()) != 0;
            if (flying != clientPlayer.abilities().getBooleanValue(AbilitiesIndex.Flying)) {
                clientPlayer.abilities().getOrCreateCacheLayer().setAbility(AbilitiesIndex.Flying, flying);
                clientPlayer.addAuthInputData(flying ? PlayerAuthInputPacket_InputData.StartFlying : PlayerAuthInputPacket_InputData.StopFlying);
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CHANGE_GAME_MODE, ServerboundBedrockPackets.SET_PLAYER_GAME_TYPE, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.handler(wrapper -> {
                    GameMode gameMode = GameMode.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
                    GameType gameType = switch (5.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$java$generated$GameMode[gameMode.ordinal()]) {
                        case 1 -> GameType.Survival;
                        case 2 -> GameType.Creative;
                        case 3 -> GameType.Adventure;
                        case 4 -> GameType.Spectator;
                        default -> throw new IllegalStateException("Unhandled GameMode: " + String.valueOf(gameMode));
                    };
                    wrapper.write((Type)BedrockTypes.VAR_INT, (Object)gameType.getValue());
                    ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer().setGameType(gameType);
                });
                this.handler(CLIENT_PLAYER_GAME_MODE_INFO_UPDATE);
                this.handler(CLIENT_PLAYER_GAME_MODE_UPDATE);
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.SWING, ServerboundBedrockPackets.ANIMATE, wrapper -> {
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            InteractionHand hand = InteractionHand.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
            if (hand != InteractionHand.MAIN_HAND || clientPlayer.checkCancelSwingPacket()) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)AnimatePacketPayload_Action.Swing.getValue()));
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)clientPlayer.runtimeId());
            wrapper.write((Type)BedrockTypes.FLOAT_LE, (Object)Float.valueOf(0.0f));
            wrapper.write(BedrockTypes.OPTIONAL_STRING, (Object)ActorSwingSource.Attack.name().toLowerCase(Locale.ROOT));
            if (clientPlayer.blockBreakingInfo() != null) {
                if (!gameSession.isBlockBreakingServerAuthoritative()) {
                    ClientPlayerEntity.BlockBreakingInfo blockBreakingInfo = clientPlayer.blockBreakingInfo();
                    clientPlayer.addAuthInputBlockAction(new ClientPlayerEntity.AuthInputBlockAction(PlayerActionType.CrackBlock, blockBreakingInfo.position(), blockBreakingInfo.direction().ordinal()));
                }
            } else {
                clientPlayer.addAuthInputData(PlayerAuthInputPacket_InputData.MissedSwing);
            }
        });
    }
}

