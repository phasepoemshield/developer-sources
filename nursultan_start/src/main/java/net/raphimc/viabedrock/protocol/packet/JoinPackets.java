/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vdurmont.semver4j.Semver
 *  com.vdurmont.semver4j.Semver$SemverType
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIntImmutablePair
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIntPair
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.v1_7.ClientboundBaseProtocol1_7
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity
 *  net.raphimc.viabedrock.api.model.entity.Entity
 *  net.raphimc.viabedrock.api.resourcepack.definition.ItemDefinitions
 *  net.raphimc.viabedrock.api.util.BitSets
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.api.util.StringUtil
 *  net.raphimc.viabedrock.api.util.TextUtil
 *  net.raphimc.viabedrock.protocol.data.enums.Dimension
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ChatRestrictionLevel
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandPermissionLevel
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Difficulty
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Editor_WorldType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GameType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GeneratorType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InteractPacket_Action
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemVersion
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayStatus
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ServerboundLoadingScreenPacketType
 *  net.raphimc.viabedrock.protocol.data.enums.java.GameEventType
 *  net.raphimc.viabedrock.protocol.data.enums.java.Relative
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerInfoUpdateAction
 *  net.raphimc.viabedrock.protocol.model.EntityAttribute
 *  net.raphimc.viabedrock.protocol.packet.JoinPackets$3
 *  net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter
 *  net.raphimc.viabedrock.protocol.rewriter.ItemRewriter
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker
 *  net.raphimc.viabedrock.protocol.storage.ClientSettingsStorage
 *  net.raphimc.viabedrock.protocol.storage.CommandsStorage
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameRulesStorage
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.storage.JoinGameStorage
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackLoadStateTracker
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.vdurmont.semver4j.Semver;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.IntIntImmutablePair;
import com.viaversion.viaversion.libs.fastutil.ints.IntIntPair;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.v1_7.ClientboundBaseProtocol1_7;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity;
import net.raphimc.viabedrock.api.model.entity.Entity;
import net.raphimc.viabedrock.api.resourcepack.definition.ItemDefinitions;
import net.raphimc.viabedrock.api.util.BitSets;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.api.util.StringUtil;
import net.raphimc.viabedrock.api.util.TextUtil;
import net.raphimc.viabedrock.platform.ViaBedrockConfig;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.DataValues;
import net.raphimc.viabedrock.protocol.data.enums.Dimension;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ChatRestrictionLevel;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandPermissionLevel;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Difficulty;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Editor_WorldType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GameType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.GeneratorType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InteractPacket_Action;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemVersion;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayStatus;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ServerboundLoadingScreenPacketType;
import net.raphimc.viabedrock.protocol.data.enums.java.GameEventType;
import net.raphimc.viabedrock.protocol.data.enums.java.Relative;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerInfoUpdateAction;
import net.raphimc.viabedrock.protocol.model.BlockProperties;
import net.raphimc.viabedrock.protocol.model.EntityAttribute;
import net.raphimc.viabedrock.protocol.model.Experiment;
import net.raphimc.viabedrock.protocol.model.GameRule;
import net.raphimc.viabedrock.protocol.model.ItemEntry;
import net.raphimc.viabedrock.protocol.model.PlayerAbilities;
import net.raphimc.viabedrock.protocol.model.Position2f;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.packet.JoinPackets;
import net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter;
import net.raphimc.viabedrock.protocol.rewriter.ItemRewriter;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;
import net.raphimc.viabedrock.protocol.storage.ClientSettingsStorage;
import net.raphimc.viabedrock.protocol.storage.CommandsStorage;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameRulesStorage;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.storage.JoinGameStorage;
import net.raphimc.viabedrock.protocol.storage.ResourcePackLoadStateTracker;
import net.raphimc.viabedrock.protocol.storage.ResourcePackStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class JoinPackets {
    private static final PacketHandler BIOME_DEFINITION_LIST_HANDLER = wrapper -> {
        if (wrapper.isCancelled()) {
            return;
        }
        ((GameSessionStorage)wrapper.user().get(GameSessionStorage.class)).setBedrockBiomeDefinitions((CompoundTag)wrapper.read(BedrockTypes.NETWORK_TAG));
    };
    private static final PacketHandler COMPRESSED_BIOME_DEFINITION_LIST_HANDLER = wrapper -> {
        if (wrapper.isCancelled()) {
            return;
        }
        BedrockProtocol.kickForIllegalState(wrapper.user(), "Compressed biome definitions are not supported.");
    };
    private static final PacketHandler REQUIRE_UNINITIALIZED_WORLD_HANDLER = wrapper -> {
        if (!((ChunkTracker)wrapper.user().get(ChunkTracker.class)).isEmpty()) {
            wrapper.cancel();
        } else if (!((EntityTracker)wrapper.user().get(EntityTracker.class)).isEmpty()) {
            wrapper.cancel();
        }
        if (wrapper.isCancelled()) {
            ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Tried to change world properties after the world was already loaded");
        }
    };
    private static final PacketHandler RECONFIGURE_HANDLER = wrapper -> {
        if (wrapper.isCancelled()) {
            return;
        }
        wrapper.cancel();
        wrapper.user().put((StorableObject)new ChunkTracker(wrapper.user(), ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).getDimension()));
        if (wrapper.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_2)) {
            PacketWrapper startConfiguration = PacketWrapper.create((PacketType)ClientboundPackets26_1.START_CONFIGURATION, (UserConnection)wrapper.user());
            startConfiguration.send(BedrockProtocol.class);
            wrapper.user().getProtocolInfo().setServerState(State.CONFIGURATION);
            JoinPackets.handleJavaClientGameJoin(wrapper.user());
        } else {
            ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Skipping reconfigure packet as it is not supported by the client. This may cause issues.");
        }
    };

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientboundTransition(ClientboundBedrockPackets.PLAY_STATUS, State.LOGIN, wrapper -> {
            int rawStatus = (Integer)wrapper.read((Type)Types.INT);
            PlayStatus status = PlayStatus.getByValue((int)rawStatus);
            if (status == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown PlayStatus: " + rawStatus);
                wrapper.cancel();
                return;
            }
            if (status == PlayStatus.LoginSuccess) {
                ProtocolInfo protocolInfo = wrapper.user().getProtocolInfo();
                wrapper.setPacketType((PacketType)ClientboundLoginPackets.LOGIN_FINISHED);
                wrapper.write(Types.UUID, (Object)protocolInfo.getUuid());
                wrapper.write(Types.STRING, (Object)protocolInfo.getUsername());
                wrapper.write(Types.PROFILE_PROPERTY_ARRAY, (Object)new GameProfile.Property[0]);
                ClientboundBaseProtocol1_7.onLoginSuccess((UserConnection)wrapper.user());
                JoinPackets.sendClientCacheStatus(wrapper.user());
            } else {
                wrapper.setPacketType((PacketType)ClientboundLoginPackets.LOGIN_DISCONNECT);
                JoinPackets.writePlayStatusKickMessage(wrapper, status);
            }
        }, State.PLAY, wrapper -> {
            int rawStatus = (Integer)wrapper.read((Type)Types.INT);
            PlayStatus status = PlayStatus.getByValue((int)rawStatus);
            if (status == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown PlayStatus: " + rawStatus);
                wrapper.cancel();
                return;
            }
            if (status == PlayStatus.LoginSuccess) {
                wrapper.cancel();
                JoinPackets.sendClientCacheStatus(wrapper.user());
            } else if (status == PlayStatus.PlayerSpawn) {
                wrapper.cancel();
                ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
                if (clientPlayer.isInitiallySpawned()) {
                    return;
                }
                PacketWrapper interact = PacketWrapper.create((PacketType)ServerboundBedrockPackets.INTERACT, (UserConnection)wrapper.user());
                interact.write((Type)Types.UNSIGNED_BYTE, (Object)((short)InteractPacket_Action.InteractUpdate.getValue()));
                interact.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)0L);
                interact.write(BedrockTypes.OPTIONAL_POSITION_3F, null);
                interact.sendToServer(BedrockProtocol.class);
                clientPlayer.setRotation(new Position3f(clientPlayer.rotation().x(), clientPlayer.rotation().y(), clientPlayer.rotation().y()));
                clientPlayer.setInitiallySpawned();
                PacketFactory.sendBedrockLoadingScreen((UserConnection)wrapper.user(), (ServerboundLoadingScreenPacketType)ServerboundLoadingScreenPacketType.EndLoadingScreen, null);
                PacketWrapper setLocalPlayerAsInitialized = PacketWrapper.create((PacketType)ServerboundBedrockPackets.SET_LOCAL_PLAYER_AS_INITIALIZED, (UserConnection)wrapper.user());
                setLocalPlayerAsInitialized.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)clientPlayer.runtimeId());
                setLocalPlayerAsInitialized.sendToServer(BedrockProtocol.class);
                PacketFactory.sendJavaGameEvent((UserConnection)wrapper.user(), (GameEventType)GameEventType.LEVEL_CHUNKS_LOAD_START, (float)0.0f);
            } else {
                wrapper.setPacketType((PacketType)ClientboundPackets26_1.DISCONNECT);
                JoinPackets.writePlayStatusKickMessage(wrapper, status);
            }
        }, State.CONFIGURATION, wrapper -> {
            int rawStatus = (Integer)wrapper.read((Type)Types.INT);
            PlayStatus status = PlayStatus.getByValue((int)rawStatus);
            if (status == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown PlayStatus: " + rawStatus);
                wrapper.cancel();
                return;
            }
            if (status == PlayStatus.LoginSuccess) {
                wrapper.cancel();
                JoinPackets.sendClientCacheStatus(wrapper.user());
            } else {
                wrapper.setPacketType((PacketType)ClientboundConfigurationPackets1_21_9.DISCONNECT);
                JoinPackets.writePlayStatusKickMessage(wrapper, status);
            }
        });
        protocol.registerClientboundTransition(ClientboundBedrockPackets.START_GAME, State.CONFIGURATION, wrapper -> {
            Semver version;
            wrapper.cancel();
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            ResourcePackStorage resourcePackStorage = (ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class);
            if (resourcePackStorage == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Skipping resource pack negotiation");
                wrapper.user().remove(ResourcePackLoadStateTracker.class);
                resourcePackStorage = new ResourcePackStorage(Collections.emptyList());
                wrapper.user().put((StorableObject)resourcePackStorage);
            }
            long entityUniqueId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
            long entityRuntimeId = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            GameType playerGameType = GameType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (GameType)GameType.Undefined);
            Position3f playerPosition = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            Position2f playerRotation = (Position2f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_2F)));
            wrapper.read((Type)BedrockTypes.LONG_LE);
            wrapper.read((Type)BedrockTypes.SHORT_LE);
            wrapper.read(BedrockTypes.STRING);
            Dimension dimension = Dimension.values()[(Integer)wrapper.read((Type)BedrockTypes.VAR_INT)];
            GeneratorType generatorType = GeneratorType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (GeneratorType)GeneratorType.Undefined);
            GameType levelGameType = GameType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (GameType)GameType.Undefined);
            boolean hardcore = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            Difficulty difficulty = Difficulty.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (Difficulty)Difficulty.Unknown);
            wrapper.read(BedrockTypes.BLOCK_POSITION);
            wrapper.read((Type)Types.BOOLEAN);
            Editor_WorldType editorWorldType = Editor_WorldType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)));
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            int currentTime = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            wrapper.read((Type)BedrockTypes.VAR_INT);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read(BedrockTypes.STRING);
            float rainLevel = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
            float lightningLevel = ((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)).floatValue();
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)BedrockTypes.VAR_INT);
            wrapper.read((Type)BedrockTypes.VAR_INT);
            boolean commandsEnabled = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            GameRule[] gameRules = (GameRule[])wrapper.read(BedrockTypes.VAR_INT_GAME_RULE_ARRAY);
            Experiment[] experiments = (Experiment[])wrapper.read(BedrockTypes.EXPERIMENT_ARRAY);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            int playerPermission = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            int chunkTickRange = (Integer)wrapper.read((Type)BedrockTypes.INT_LE);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            String vanillaVersion = (String)wrapper.read(BedrockTypes.STRING);
            wrapper.read((Type)BedrockTypes.INT_LE);
            wrapper.read((Type)BedrockTypes.INT_LE);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read(BedrockTypes.EDUCATION_URI_RESOURCE);
            wrapper.read((Type)Types.BOOLEAN);
            ChatRestrictionLevel chatRestrictionLevel = ChatRestrictionLevel.getByValue((int)((Byte)wrapper.read((Type)Types.BYTE)).byteValue(), (ChatRestrictionLevel)ChatRestrictionLevel.Disabled);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read(BedrockTypes.STRING);
            String levelName = (String)wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            wrapper.read((Type)Types.BOOLEAN);
            int rewindHistorySize = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            boolean blockBreakingServerAuthoritative = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            long levelTime = (Long)wrapper.read((Type)BedrockTypes.LONG_LE);
            wrapper.read((Type)BedrockTypes.VAR_INT);
            BlockProperties[] blockProperties = (BlockProperties[])wrapper.read(BedrockTypes.BLOCK_PROPERTIES_ARRAY);
            wrapper.read(BedrockTypes.STRING);
            boolean inventoryServerAuthoritative = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            String serverEngine = (String)wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.NETWORK_TAG);
            wrapper.read((Type)BedrockTypes.LONG_LE);
            wrapper.read(BedrockTypes.UUID);
            wrapper.read((Type)Types.BOOLEAN);
            boolean hashedRuntimeBlockIds = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.read(BedrockTypes.UUID);
                    wrapper.read(BedrockTypes.STRING);
                    wrapper.read(BedrockTypes.UUID);
                    wrapper.read(BedrockTypes.STRING);
                    wrapper.read(BedrockTypes.STRING);
                    wrapper.read(BedrockTypes.UUID);
                    wrapper.read(BedrockTypes.UUID);
                    wrapper.read(BedrockTypes.STRING);
                }
                if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.read(BedrockTypes.STRING);
                    wrapper.read(BedrockTypes.STRING);
                }
                if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.read(BedrockTypes.STRING);
                    wrapper.read(BedrockTypes.STRING);
                }
            }
            wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            if (editorWorldType == Editor_WorldType.EditorProject) {
                PacketWrapper disconnect = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.DISCONNECT, (UserConnection)wrapper.user());
                PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)resourcePackStorage.getTexts().get("disconnectionScreen.editor.mismatchEditorWorld"));
                disconnect.send(BedrockProtocol.class);
                return;
            }
            ViaBedrock.getPlatform().getLogger().log(Level.INFO, "Server feature version: " + vanillaVersion);
            try {
                version = vanillaVersion.equals("*") ? new Semver("99.99.99") : new Semver(vanillaVersion, Semver.SemverType.LOOSE);
            }
            catch (Throwable e) {
                ViaBedrock.getPlatform().getLogger().log(Level.SEVERE, "Invalid vanilla version: " + vanillaVersion);
                version = new Semver("99.99.99");
            }
            ArrayList<String> enabledFeatures = new ArrayList<String>();
            for (Experiment experiment : experiments) {
                if (!experiment.enabled()) continue;
                if (BedrockProtocol.MAPPINGS.getBedrockToJavaExperimentalFeatures().containsKey((Object)experiment.name())) {
                    enabledFeatures.add((String)BedrockProtocol.MAPPINGS.getBedrockToJavaExperimentalFeatures().get((Object)experiment.name()));
                    continue;
                }
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "This server uses an unsupported experimental feature: " + experiment.name());
            }
            if (!inventoryServerAuthoritative) {
                ViaBedrock.getPlatform().getLogger().log(Level.INFO, "This server uses client authoritative inventories. This is not supported yet.");
            }
            gameSession.setBedrockVanillaVersion(version);
            gameSession.setFlatGenerator(generatorType == GeneratorType.Flat);
            gameSession.setMovementRewindHistorySize(rewindHistorySize);
            gameSession.setLevelGameType(levelGameType);
            gameSession.setLevelTime(levelTime);
            gameSession.setHardcoreMode(hardcore);
            gameSession.setChatRestrictionLevel(chatRestrictionLevel);
            gameSession.setCommandsEnabled(commandsEnabled);
            gameSession.setInventoryServerAuthoritative(inventoryServerAuthoritative);
            gameSession.setBlockBreakingServerAuthoritative(blockBreakingServerAuthoritative);
            PlayerAbilities playerAbilities = new PlayerAbilities(entityUniqueId, (byte)playerPermission, (byte)CommandPermissionLevel.Any.getValue());
            ClientPlayerEntity clientPlayer = new ClientPlayerEntity(wrapper.user(), entityRuntimeId, wrapper.user().getProtocolInfo().getUuid(), playerAbilities);
            clientPlayer.setPosition(new Position3f(playerPosition.x(), playerPosition.y() + clientPlayer.eyeOffset(), playerPosition.z()));
            clientPlayer.setRotation(new Position3f(playerRotation.x(), playerRotation.y(), 0.0f));
            clientPlayer.setOnGround(false);
            clientPlayer.setGameType(playerGameType);
            clientPlayer.setName(wrapper.user().getProtocolInfo().getUsername());
            wrapper.user().put((StorableObject)new JoinGameStorage(levelName, difficulty, rainLevel, lightningLevel, currentTime, chunkTickRange));
            wrapper.user().put((StorableObject)new GameRulesStorage(wrapper.user(), gameRules));
            wrapper.user().put((StorableObject)new BlockStateRewriter(blockProperties, hashedRuntimeBlockIds));
            wrapper.user().put((StorableObject)new ItemRewriter(wrapper.user(), new ItemEntry[0]));
            wrapper.user().put((StorableObject)new ChunkTracker(wrapper.user(), dimension));
            EntityTracker entityTracker = new EntityTracker(wrapper.user());
            entityTracker.addEntity((Entity)clientPlayer, false);
            wrapper.user().put((StorableObject)entityTracker);
            PacketWrapper brandCustomPayload = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.CUSTOM_PAYLOAD, (UserConnection)wrapper.user());
            brandCustomPayload.write(Types.STRING, (Object)"minecraft:brand");
            brandCustomPayload.write(Types.STRING, (Object)("Bedrock" + (String)(!serverEngine.isEmpty() ? " @" + serverEngine : "") + " v: " + vanillaVersion));
            brandCustomPayload.send(BedrockProtocol.class);
            if (!enabledFeatures.isEmpty()) {
                enabledFeatures.add("minecraft:vanilla");
                PacketWrapper updateEnabledFeatures = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.UPDATE_ENABLED_FEATURES, (UserConnection)wrapper.user());
                updateEnabledFeatures.write(Types.STRING_ARRAY, (Object)enabledFeatures.toArray(new String[0]));
                updateEnabledFeatures.send(BedrockProtocol.class);
            }
            JoinPackets.handleJavaClientGameJoin(wrapper.user());
            PacketWrapper requestChunkRadius = PacketWrapper.create((PacketType)ServerboundBedrockPackets.REQUEST_CHUNK_RADIUS, (UserConnection)wrapper.user());
            requestChunkRadius.write((Type)BedrockTypes.VAR_INT, (Object)((ClientSettingsStorage)wrapper.user().get(ClientSettingsStorage.class)).viewDistance());
            requestChunkRadius.write((Type)Types.BYTE, (Object)28);
            requestChunkRadius.sendToServer(BedrockProtocol.class);
            PacketFactory.sendBedrockLoadingScreen((UserConnection)wrapper.user(), (ServerboundLoadingScreenPacketType)ServerboundLoadingScreenPacketType.StartLoadingScreen, null);
        }, State.PLAY, PacketWrapper::cancel);
        protocol.registerClientboundTransition(ClientboundBedrockPackets.BIOME_DEFINITION_LIST, State.CONFIGURATION, new PacketHandlers(){

            protected void register() {
                this.handler(PacketWrapper::cancel);
            }
        }, State.PLAY, new PacketHandlers(){

            protected void register() {
                this.handler(REQUIRE_UNINITIALIZED_WORLD_HANDLER);
                this.handler(PacketWrapper::cancel);
            }
        });
        protocol.registerClientboundTransition(ClientboundBedrockPackets.DIMENSION_DATA, State.CONFIGURATION, wrapper -> {
            wrapper.cancel();
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            int count = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            for (int i = 0; i < count; ++i) {
                String dimensionIdentifier = (String)wrapper.read(BedrockTypes.STRING);
                int maximumHeight = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                int minimumHeight = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                wrapper.read((Type)BedrockTypes.VAR_INT);
                if (!dimensionIdentifier.equals(Dimension.OVERWORLD.getKey())) continue;
                gameSession.putBedrockDimensionDefinition(dimensionIdentifier, (IntIntPair)new IntIntImmutablePair(minimumHeight, maximumHeight));
            }
        }, State.PLAY, PacketWrapper::cancel);
        protocol.registerClientbound(ClientboundBedrockPackets.ITEM_REGISTRY, null, wrapper -> {
            wrapper.cancel();
            if (wrapper.user().has(ItemRewriter.class) && !((ItemRewriter)wrapper.user().get(ItemRewriter.class)).getItems().isEmpty()) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received ITEM_REGISTRY after item rewriter was already initialized");
                return;
            }
            ItemEntry[] itemEntries = (ItemEntry[])wrapper.read(BedrockTypes.ITEM_ENTRY_ARRAY);
            ItemRewriter itemRewriter = new ItemRewriter(wrapper.user(), itemEntries);
            wrapper.user().put((StorableObject)itemRewriter);
            ItemDefinitions itemDefinitions = ((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getItems();
            for (String identifier : itemRewriter.getComponentItems()) {
                itemDefinitions.remove(identifier);
            }
            for (ItemEntry itemEntry : itemEntries) {
                if (itemEntry.componentData() == null || itemEntry.version() != ItemVersion.DataDriven || !itemRewriter.getComponentItems().contains(itemEntry.identifier())) continue;
                itemDefinitions.addFromNetworkTag(itemEntry.identifier(), itemEntry.componentData());
            }
        });
        protocol.registerClientboundTransition(ClientboundBedrockPackets.AVAILABLE_ENTITY_IDENTIFIERS, State.CONFIGURATION, PacketWrapper::cancel, State.PLAY, wrapper -> {
            wrapper.cancel();
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            CompoundTag entityIdentifiers = (CompoundTag)wrapper.read(BedrockTypes.NETWORK_TAG);
            for (CompoundTag entityIdentifier : entityIdentifiers.getListTag("idlist", CompoundTag.class)) {
                String identifier = entityIdentifier.getString("id");
                if (identifier == null) continue;
                gameSession.addEntityIdentifier(identifier);
            }
        });
    }

    private static void handleJavaClientGameJoin(UserConnection user) {
        JoinGameStorage joinGameStorage = (JoinGameStorage)user.get(JoinGameStorage.class);
        GameSessionStorage gameSession = (GameSessionStorage)user.get(GameSessionStorage.class);
        ClientSettingsStorage clientSettingsStorage = (ClientSettingsStorage)user.get(ClientSettingsStorage.class);
        GameRulesStorage gameRulesStorage = (GameRulesStorage)user.get(GameRulesStorage.class);
        ChunkTracker chunkTracker = (ChunkTracker)user.get(ChunkTracker.class);
        CommandsStorage commandsStorage = (CommandsStorage)user.get(CommandsStorage.class);
        ClientPlayerEntity clientPlayer = ((EntityTracker)user.get(EntityTracker.class)).getClientPlayer();
        for (Object registry : gameSession.getJavaRegistries().entrySet()) {
            CompoundTag registryTag = (CompoundTag)registry.getValue();
            PacketWrapper registryData = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.REGISTRY_DATA, (UserConnection)user);
            registryData.write(Types.STRING, (Object)((String)registry.getKey()));
            ArrayList<RegistryEntry> entries = new ArrayList<RegistryEntry>();
            for (Map.Entry entry : registryTag.entrySet()) {
                entries.add(new RegistryEntry((String)entry.getKey(), (Tag)entry.getValue()));
            }
            registryData.write(Types.REGISTRY_ENTRY_ARRAY, (Object)entries.toArray(new RegistryEntry[0]));
            registryData.send(BedrockProtocol.class);
        }
        PacketWrapper updateTags = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.UPDATE_TAGS, (UserConnection)user);
        updateTags.write((Type)Types.VAR_INT, (Object)BedrockProtocol.MAPPINGS.getJavaTags().size());
        for (Map.Entry registryEntry : BedrockProtocol.MAPPINGS.getJavaTags().entrySet()) {
            CompoundTag tag = (CompoundTag)registryEntry.getValue();
            updateTags.write(Types.STRING, (Object)((String)registryEntry.getKey()));
            updateTags.write((Type)Types.VAR_INT, (Object)tag.size());
            for (Map.Entry tagEntry : tag.entrySet()) {
                updateTags.write(Types.STRING, (Object)((String)tagEntry.getKey()));
                updateTags.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)((int[])((IntArrayTag)tagEntry.getValue()).getValue().clone()));
            }
        }
        updateTags.send(BedrockProtocol.class);
        PacketWrapper finishConfiguration = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21_9.FINISH_CONFIGURATION, (UserConnection)user);
        finishConfiguration.send(BedrockProtocol.class);
        user.getProtocolInfo().setServerState(State.PLAY);
        if (user.getProtocolInfo().protocolVersion().betweenInclusive(ProtocolVersion.v1_20_2, ProtocolVersion.v1_21_2)) {
            user.getProtocolInfo().setClientState(State.PLAY);
        }
        PacketWrapper joinGame = PacketWrapper.create((PacketType)ClientboundPackets26_1.LOGIN, (UserConnection)user);
        joinGame.write((Type)Types.INT, (Object)clientPlayer.javaId());
        joinGame.write((Type)Types.BOOLEAN, (Object)gameSession.isHardcoreMode());
        joinGame.write(Types.STRING_ARRAY, (Object)Dimension.getDimensionKeys());
        joinGame.write((Type)Types.VAR_INT, (Object)100);
        joinGame.write((Type)Types.VAR_INT, (Object)clientSettingsStorage.viewDistance());
        joinGame.write((Type)Types.VAR_INT, (Object)joinGameStorage.chunkTickRange());
        joinGame.write((Type)Types.BOOLEAN, (Object)(ViaBedrock.getConfig().shouldTranslateShowCoordinatesGameRule() && (Boolean)gameRulesStorage.getGameRule("showCoordinates") == false ? 1 : 0));
        joinGame.write((Type)Types.BOOLEAN, (Object)((Boolean)gameRulesStorage.getGameRule("doImmediateRespawn") == false ? 1 : 0));
        joinGame.write((Type)Types.BOOLEAN, (Object)((Boolean)gameRulesStorage.getGameRule("doLimitedCrafting")));
        joinGame.write((Type)Types.VAR_INT, (Object)chunkTracker.getDimension().ordinal());
        joinGame.write(Types.STRING, (Object)chunkTracker.getDimension().getKey());
        joinGame.write((Type)Types.LONG, (Object)0L);
        joinGame.write((Type)Types.BYTE, (Object)((byte)clientPlayer.javaGameMode().ordinal()));
        joinGame.write((Type)Types.BYTE, (Object)-1);
        joinGame.write((Type)Types.BOOLEAN, (Object)false);
        joinGame.write((Type)Types.BOOLEAN, (Object)gameSession.isFlatGenerator());
        joinGame.write(Types.OPTIONAL_GLOBAL_POSITION, null);
        joinGame.write((Type)Types.VAR_INT, (Object)0);
        joinGame.write((Type)Types.VAR_INT, (Object)64);
        joinGame.write((Type)Types.BOOLEAN, (Object)false);
        joinGame.send(BedrockProtocol.class);
        clientPlayer.createTeam();
        clientPlayer.sendInitialEntityData();
        clientPlayer.updateAttributes(clientPlayer.attributes().values().toArray(new EntityAttribute[0]));
        clientPlayer.setAbilities(clientPlayer.abilities());
        clientPlayer.sendPlayerPositionPacketToClient(Relative.NONE);
        if (commandsStorage != null) {
            commandsStorage.updateCommandTree();
        }
        PacketWrapper initializeBorder = PacketWrapper.create((PacketType)ClientboundPackets26_1.INITIALIZE_BORDER, (UserConnection)user);
        initializeBorder.write((Type)Types.DOUBLE, (Object)0.0);
        initializeBorder.write((Type)Types.DOUBLE, (Object)0.0);
        initializeBorder.write((Type)Types.DOUBLE, (Object)0.0);
        initializeBorder.write((Type)Types.DOUBLE, (Object)6.0E7);
        initializeBorder.write((Type)Types.VAR_LONG, (Object)0L);
        initializeBorder.write((Type)Types.VAR_INT, (Object)60000000);
        initializeBorder.write((Type)Types.VAR_INT, (Object)0);
        initializeBorder.write((Type)Types.VAR_INT, (Object)0);
        initializeBorder.send(BedrockProtocol.class);
        PacketWrapper updateAttributes = PacketWrapper.create((PacketType)ClientboundPackets26_1.UPDATE_ATTRIBUTES, (UserConnection)user);
        updateAttributes.write((Type)Types.VAR_INT, (Object)clientPlayer.javaId());
        updateAttributes.write((Type)Types.VAR_INT, (Object)1);
        updateAttributes.write((Type)Types.VAR_INT, (Object)((Integer)BedrockProtocol.MAPPINGS.getJavaEntityAttributes().get((Object)"minecraft:attack_speed")));
        updateAttributes.write((Type)Types.DOUBLE, (Object)20.0);
        updateAttributes.write((Type)Types.VAR_INT, (Object)0);
        updateAttributes.send(BedrockProtocol.class);
        PacketWrapper serverDifficulty = PacketWrapper.create((PacketType)ClientboundPackets26_1.CHANGE_DIFFICULTY, (UserConnection)user);
        serverDifficulty.write((Type)Types.VAR_INT, (Object)joinGameStorage.difficulty().getValue());
        serverDifficulty.write((Type)Types.BOOLEAN, (Object)false);
        serverDifficulty.send(BedrockProtocol.class);
        PacketWrapper tabList = PacketWrapper.create((PacketType)ClientboundPackets26_1.TAB_LIST, (UserConnection)user);
        tabList.write(Types.TAG, (Object)TextUtil.stringToNbt((String)(joinGameStorage.levelName() + "\n")));
        tabList.write(Types.TAG, (Object)TextUtil.stringToNbt((String)"\u00a7aViaBedrock \u00a73v0.0.27-SNAPSHOT\n\u00a77https://github.com/RaphiMC/ViaBedrock"));
        tabList.send(BedrockProtocol.class);
        PacketWrapper playerInfoUpdate = PacketWrapper.create((PacketType)ClientboundPackets26_1.PLAYER_INFO_UPDATE, (UserConnection)user);
        playerInfoUpdate.write((Type)Types.PROFILE_ACTIONS_ENUM1_21_4, (Object)BitSets.create((int)8, (Enum[])new Enum[]{PlayerInfoUpdateAction.ADD_PLAYER, PlayerInfoUpdateAction.UPDATE_GAME_MODE}));
        playerInfoUpdate.write((Type)Types.VAR_INT, (Object)1);
        playerInfoUpdate.write(Types.UUID, (Object)clientPlayer.javaUuid());
        playerInfoUpdate.write(Types.STRING, (Object)StringUtil.encodeUUID((UUID)clientPlayer.javaUuid()));
        playerInfoUpdate.write(Types.PROFILE_PROPERTY_ARRAY, (Object)new GameProfile.Property[0]);
        playerInfoUpdate.write((Type)Types.VAR_INT, (Object)clientPlayer.javaGameMode().ordinal());
        playerInfoUpdate.send(BedrockProtocol.class);
        if (joinGameStorage.rainLevel() > 0.0f || joinGameStorage.lightningLevel() > 0.0f) {
            PacketFactory.sendJavaGameEvent((UserConnection)user, (GameEventType)GameEventType.START_RAINING, (float)0.0f);
            if (joinGameStorage.rainLevel() > 0.0f) {
                PacketFactory.sendJavaGameEvent((UserConnection)user, (GameEventType)GameEventType.RAIN_LEVEL_CHANGE, (float)joinGameStorage.rainLevel());
            }
            if (joinGameStorage.lightningLevel() > 0.0f) {
                PacketFactory.sendJavaGameEvent((UserConnection)user, (GameEventType)GameEventType.THUNDER_LEVEL_CHANGE, (float)joinGameStorage.lightningLevel());
            }
        }
        PacketWrapper setTime = PacketWrapper.create((PacketType)ClientboundBedrockPackets.SET_TIME, (UserConnection)user);
        setTime.write((Type)BedrockTypes.VAR_INT, (Object)joinGameStorage.currentTime());
        setTime.send(BedrockProtocol.class, false);
    }

    private static void sendClientCacheStatus(UserConnection user) {
        PacketWrapper clientCacheStatus = PacketWrapper.create((PacketType)ServerboundBedrockPackets.CLIENT_CACHE_STATUS, (UserConnection)user);
        clientCacheStatus.write((Type)Types.BOOLEAN, (Object)(!ViaBedrock.getConfig().getBlobCacheMode().equals((Object)ViaBedrockConfig.BlobCacheMode.DISABLED) ? 1 : 0));
        clientCacheStatus.sendToServer(BedrockProtocol.class);
    }

    private static void writePlayStatusKickMessage(PacketWrapper wrapper, PlayStatus status) {
        Map<String, String> translations = BedrockProtocol.MAPPINGS.getBedrockResourcePacks().get((Object)DataValues.VANILLA_RESOURCE_PACK_KEY).content().getLang("texts/en_US.lang");
        switch (3.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$PlayStatus[status.ordinal()]) {
            case 1: {
                PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)translations.get("disconnectionScreen.outdatedClient"));
                break;
            }
            case 2: {
                PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)translations.get("disconnectionScreen.outdatedServer"));
                break;
            }
            case 3: {
                PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)translations.get("disconnectionScreen.invalidTenant"));
                break;
            }
            case 4: {
                PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)translations.get("disconnectionScreen.editionMismatchEduToVanilla"));
                break;
            }
            case 5: {
                PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)translations.get("disconnectionScreen.editionMismatchVanillaToEdu"));
                break;
            }
            case 6: 
            case 7: {
                PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)(translations.get("disconnectionScreen.serverFull") + "\n\n\n\n" + translations.get("disconnectionScreen.serverFull.title")));
                break;
            }
            case 8: {
                PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)translations.get("disconnectionScreen.editor.mismatchEditorToVanilla"));
                break;
            }
            case 9: 
            case 10: {
                wrapper.cancel();
                break;
            }
            default: {
                throw new IllegalStateException("Unhandled PlayStatus: " + String.valueOf(status));
            }
        }
    }
}

