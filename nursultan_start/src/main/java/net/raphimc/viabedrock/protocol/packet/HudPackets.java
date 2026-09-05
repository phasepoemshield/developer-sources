/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.util.Pair
 *  net.lenni0451.mcstructs_bedrock.text.components.RootBedrockComponent
 *  net.lenni0451.mcstructs_bedrock.text.components.TranslationBedrockComponent
 *  net.lenni0451.mcstructs_bedrock.text.serializer.BedrockComponentSerializer
 *  net.lenni0451.mcstructs_bedrock.text.utils.BedrockTranslator
 *  net.lenni0451.mcstructs_bedrock.text.utils.TranslatorOptions
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.model.entity.Entity
 *  net.raphimc.viabedrock.api.model.scoreboard.ScoreboardEntry
 *  net.raphimc.viabedrock.api.model.scoreboard.ScoreboardObjective
 *  net.raphimc.viabedrock.api.util.BitSets
 *  net.raphimc.viabedrock.api.util.MathUtil
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.api.util.StringUtil
 *  net.raphimc.viabedrock.api.util.TextUtil
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.BossEventUpdateType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.IdentityDefinition_Type
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ObjectiveSortOrder
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerListPacketType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ScorePacketType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ScoreboardIdentityPacketType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SetTitlePacketPayload_TitleType
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.BossEventOperationType
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.CustomChatCompletionsAction
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.ObjectiveCriteriaRenderType
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerInfoUpdateAction
 *  net.raphimc.viabedrock.protocol.packet.HudPackets$2
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.storage.PlayerListStorage
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackStorage
 *  net.raphimc.viabedrock.protocol.storage.ScoreboardTracker
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.util.Pair;
import java.util.ArrayList;
import java.util.UUID;
import java.util.function.Function;
import java.util.logging.Level;
import net.lenni0451.mcstructs_bedrock.text.components.RootBedrockComponent;
import net.lenni0451.mcstructs_bedrock.text.components.TranslationBedrockComponent;
import net.lenni0451.mcstructs_bedrock.text.serializer.BedrockComponentSerializer;
import net.lenni0451.mcstructs_bedrock.text.utils.BedrockTranslator;
import net.lenni0451.mcstructs_bedrock.text.utils.TranslatorOptions;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.model.entity.Entity;
import net.raphimc.viabedrock.api.model.scoreboard.ScoreboardEntry;
import net.raphimc.viabedrock.api.model.scoreboard.ScoreboardObjective;
import net.raphimc.viabedrock.api.util.BitSets;
import net.raphimc.viabedrock.api.util.MathUtil;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.api.util.StringUtil;
import net.raphimc.viabedrock.api.util.TextUtil;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.BossEventUpdateType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.IdentityDefinition_Type;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ObjectiveSortOrder;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerListPacketType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ScorePacketType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ScoreboardIdentityPacketType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SetTitlePacketPayload_TitleType;
import net.raphimc.viabedrock.protocol.data.enums.java.ObjectiveAction;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.BossEventOperationType;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.CustomChatCompletionsAction;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.ObjectiveCriteriaRenderType;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerInfoUpdateAction;
import net.raphimc.viabedrock.protocol.model.SkinData;
import net.raphimc.viabedrock.protocol.packet.HudPackets;
import net.raphimc.viabedrock.protocol.provider.SkinProvider;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.storage.PlayerListStorage;
import net.raphimc.viabedrock.protocol.storage.ResourcePackStorage;
import net.raphimc.viabedrock.protocol.storage.ScoreboardTracker;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class HudPackets {
    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.PLAYER_LIST, (ClientboundPacketType)ClientboundPackets26_1.PLAYER_INFO_UPDATE, wrapper -> {
            PlayerListStorage playerListStorage = (PlayerListStorage)wrapper.user().get(PlayerListStorage.class);
            ScoreboardTracker scoreboardTracker = (ScoreboardTracker)wrapper.user().get(ScoreboardTracker.class);
            byte rawAction = (Byte)wrapper.read((Type)Types.BYTE);
            PlayerListPacketType action = PlayerListPacketType.getByValue((int)rawAction);
            if (action == null) {
                throw new IllegalStateException("Unknown PlayerListPacketType: " + rawAction);
            }
            switch (2.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$PlayerListPacketType[action.ordinal()]) {
                case 1: {
                    int i;
                    int length = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                    UUID[] uuids = new UUID[length];
                    long[] entityUniqueIds = new long[length];
                    String[] names = new String[length];
                    wrapper.write((Type)Types.PROFILE_ACTIONS_ENUM1_21_4, (Object)BitSets.create((int)8, (Enum[])new Enum[]{PlayerInfoUpdateAction.ADD_PLAYER, PlayerInfoUpdateAction.UPDATE_LISTED, PlayerInfoUpdateAction.UPDATE_DISPLAY_NAME}));
                    wrapper.write((Type)Types.VAR_INT, (Object)length);
                    for (i = 0; i < length; ++i) {
                        uuids[i] = (UUID)wrapper.read(BedrockTypes.UUID);
                        wrapper.write(Types.UUID, (Object)uuids[i]);
                        wrapper.write(Types.STRING, (Object)StringUtil.encodeUUID((UUID)uuids[i]));
                        entityUniqueIds[i] = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
                        names[i] = (String)wrapper.read(BedrockTypes.STRING);
                        String xuid = (String)wrapper.read(BedrockTypes.STRING);
                        String platformOnlineId = (String)wrapper.read(BedrockTypes.STRING);
                        int deviceOs = (Integer)wrapper.read((Type)BedrockTypes.INT_LE);
                        SkinData skin = (SkinData)((Object)((Object)wrapper.read(BedrockTypes.SKIN)));
                        boolean isTeacher = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                        boolean isHost = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                        boolean isSubClient = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                        wrapper.read((Type)BedrockTypes.INT_LE);
                        wrapper.write(Types.PROFILE_PROPERTY_ARRAY, (Object)new GameProfile.Property[]{new GameProfile.Property("xuid", xuid), new GameProfile.Property("platform_online_id", platformOnlineId), new GameProfile.Property("device_os", String.valueOf(deviceOs)), new GameProfile.Property("is_teacher", String.valueOf(isTeacher)), new GameProfile.Property("is_host", String.valueOf(isHost)), new GameProfile.Property("is_subclient", String.valueOf(isSubClient))});
                        wrapper.write((Type)Types.BOOLEAN, (Object)true);
                        wrapper.write(Types.OPTIONAL_TAG, (Object)TextUtil.stringToNbt((String)names[i]));
                        ((SkinProvider)Via.getManager().getProviders().get(SkinProvider.class)).setSkin(wrapper.user(), uuids[i], skin);
                    }
                    try {
                        for (i = 0; i < length; ++i) {
                            wrapper.read((Type)Types.BOOLEAN);
                        }
                    }
                    catch (InformativeException i2) {
                        // empty catch block
                    }
                    ArrayList<UUID> toRemoveUUIDs = new ArrayList<UUID>();
                    ArrayList<String> toRemoveNames = new ArrayList<String>();
                    for (int i3 = 0; i3 < uuids.length; ++i3) {
                        Pair scoreboardEntry;
                        Pair entry = playerListStorage.addPlayer(uuids[i3], entityUniqueIds[i3], names[i3]);
                        if (entry != null) {
                            toRemoveUUIDs.add(uuids[i3]);
                            toRemoveNames.add((String)entry.value());
                        }
                        if ((scoreboardEntry = scoreboardTracker.getEntryForPlayer(entityUniqueIds[i3])) == null) continue;
                        ((ScoreboardObjective)scoreboardEntry.key()).updateEntry(wrapper.user(), (ScoreboardEntry)scoreboardEntry.value());
                    }
                    if (!toRemoveUUIDs.isEmpty()) {
                        PacketWrapper playerInfoRemove = PacketWrapper.create((PacketType)ClientboundPackets26_1.PLAYER_INFO_REMOVE, (UserConnection)wrapper.user());
                        playerInfoRemove.write(Types.UUID_ARRAY, (Object)toRemoveUUIDs.toArray(new UUID[0]));
                        playerInfoRemove.send(BedrockProtocol.class);
                        PacketFactory.sendJavaCustomChatCompletions((UserConnection)wrapper.user(), (CustomChatCompletionsAction)CustomChatCompletionsAction.REMOVE, (String[])toRemoveNames.toArray(new String[0]));
                    }
                    PacketFactory.sendJavaCustomChatCompletions((UserConnection)wrapper.user(), (CustomChatCompletionsAction)CustomChatCompletionsAction.ADD, (String[])names);
                    break;
                }
                case 2: {
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.PLAYER_INFO_REMOVE);
                    UUID[] uuids = (UUID[])wrapper.read(BedrockTypes.UUID_ARRAY);
                    wrapper.write(Types.UUID_ARRAY, (Object)uuids);
                    ArrayList<String> names = new ArrayList<String>();
                    for (UUID uuid : uuids) {
                        Pair entry = playerListStorage.removePlayer(uuid);
                        if (entry == null) continue;
                        names.add((String)entry.value());
                        Pair scoreboardEntry = scoreboardTracker.getEntryForPlayer(((Long)entry.key()).longValue());
                        if (scoreboardEntry == null) continue;
                        ((ScoreboardObjective)scoreboardEntry.key()).updateEntry(wrapper.user(), (ScoreboardEntry)scoreboardEntry.value());
                    }
                    PacketFactory.sendJavaCustomChatCompletions((UserConnection)wrapper.user(), (CustomChatCompletionsAction)CustomChatCompletionsAction.REMOVE, (String[])names.toArray(new String[0]));
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled PlayerListPacketType: " + String.valueOf(action));
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_TITLE, null, wrapper -> {
            int rawType = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            SetTitlePacketPayload_TitleType type = SetTitlePacketPayload_TitleType.getByValue((int)rawType);
            if (type == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown SetTitlePacketPayload_TitleType: " + rawType);
                wrapper.cancel();
                return;
            }
            String text = (String)wrapper.read(BedrockTypes.STRING);
            int fadeInTicks = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            int stayTicks = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            int fadeOutTicks = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            Function translator = ((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().lookup();
            String originalText = text;
            try {
                if (type.getValue() >= SetTitlePacketPayload_TitleType.TitleTextObject.getValue() && type.getValue() <= SetTitlePacketPayload_TitleType.ActionbarTextObject.getValue()) {
                    RootBedrockComponent rootComponent = BedrockComponentSerializer.deserialize((String)text);
                    rootComponent.forEach(c -> {
                        if (c instanceof TranslationBedrockComponent) {
                            ((TranslationBedrockComponent)c).setTranslator(translator);
                        }
                    });
                    text = rootComponent.asString();
                }
                switch (2.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$SetTitlePacketPayload_TitleType[type.ordinal()]) {
                    case 1: 
                    case 2: {
                        wrapper.setPacketType((PacketType)ClientboundPackets26_1.CLEAR_TITLES);
                        wrapper.write((Type)Types.BOOLEAN, (Object)(type == SetTitlePacketPayload_TitleType.Reset ? 1 : 0));
                        break;
                    }
                    case 3: 
                    case 4: {
                        wrapper.setPacketType((PacketType)ClientboundPackets26_1.SET_TITLE_TEXT);
                        wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)text));
                        break;
                    }
                    case 5: 
                    case 6: {
                        wrapper.setPacketType((PacketType)ClientboundPackets26_1.SET_SUBTITLE_TEXT);
                        wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)text));
                        break;
                    }
                    case 7: 
                    case 8: {
                        wrapper.setPacketType((PacketType)ClientboundPackets26_1.SET_ACTION_BAR_TEXT);
                        wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)text));
                        break;
                    }
                    case 9: {
                        wrapper.setPacketType((PacketType)ClientboundPackets26_1.SET_TITLES_ANIMATION);
                        wrapper.write((Type)Types.INT, (Object)fadeInTicks);
                        wrapper.write((Type)Types.INT, (Object)stayTicks);
                        wrapper.write((Type)Types.INT, (Object)fadeOutTicks);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unhandled SetTitlePacketPayload_TitleType: " + String.valueOf(type));
                    }
                }
            }
            catch (Throwable e) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Error while translating '" + originalText + "'", e);
                wrapper.cancel();
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_DISPLAY_OBJECTIVE, (ClientboundPacketType)ClientboundPackets26_1.SET_DISPLAY_OBJECTIVE, wrapper -> {
            ScoreboardTracker scoreboardTracker = (ScoreboardTracker)wrapper.user().get(ScoreboardTracker.class);
            String displaySlot = (String)wrapper.read(BedrockTypes.STRING);
            String objectiveName = (String)wrapper.read(BedrockTypes.STRING);
            String displayName = (String)wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            ObjectiveSortOrder sortOrder = ObjectiveSortOrder.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (ObjectiveSortOrder)ObjectiveSortOrder.Descending);
            switch (displaySlot) {
                case "sidebar": {
                    wrapper.write((Type)Types.VAR_INT, (Object)1);
                    break;
                }
                case "belowname": {
                    wrapper.write((Type)Types.VAR_INT, (Object)2);
                    break;
                }
                case "list": {
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    break;
                }
                default: {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown bedrock scoreboard display slot: " + displaySlot);
                    wrapper.cancel();
                    return;
                }
            }
            wrapper.write(Types.STRING, (Object)objectiveName);
            if (objectiveName.isEmpty()) {
                return;
            }
            if (!scoreboardTracker.hasObjective(objectiveName)) {
                scoreboardTracker.addObjective(objectiveName, new ScoreboardObjective(objectiveName, sortOrder));
                PacketWrapper scoreboardObjective = PacketWrapper.create((PacketType)ClientboundPackets26_1.SET_OBJECTIVE, (UserConnection)wrapper.user());
                scoreboardObjective.write(Types.STRING, (Object)objectiveName);
                scoreboardObjective.write((Type)Types.BYTE, (Object)((byte)ObjectiveAction.ADD.ordinal()));
                scoreboardObjective.write(Types.TAG, (Object)TextUtil.stringToNbt((String)((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().translate(displayName, new Object[0])));
                scoreboardObjective.write((Type)Types.VAR_INT, (Object)ObjectiveCriteriaRenderType.INTEGER.ordinal());
                scoreboardObjective.write((Type)Types.BOOLEAN, (Object)false);
                scoreboardObjective.send(BedrockProtocol.class);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_SCORE, null, wrapper -> {
            wrapper.cancel();
            ScoreboardTracker scoreboardTracker = (ScoreboardTracker)wrapper.user().get(ScoreboardTracker.class);
            byte rawAction = (Byte)wrapper.read((Type)Types.BYTE);
            ScorePacketType action = ScorePacketType.getByValue((int)rawAction);
            if (action == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown ScorePacketType: " + rawAction);
                return;
            }
            int count = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            for (int i = 0; i < count; ++i) {
                long scoreboardId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
                String objectiveName = (String)wrapper.read(BedrockTypes.STRING);
                int score = (Integer)wrapper.read((Type)BedrockTypes.INT_LE);
                ScoreboardEntry entry = switch (2.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$ScorePacketType[action.ordinal()]) {
                    case 1 -> {
                        byte rawType = (Byte)wrapper.read((Type)Types.BYTE);
                        IdentityDefinition_Type type = IdentityDefinition_Type.getByValue((int)rawType, (IdentityDefinition_Type)IdentityDefinition_Type.Invalid);
                        Long entityUniqueId = null;
                        String fakePlayerName = null;
                        switch (2.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$IdentityDefinition_Type[type.ordinal()]) {
                            case 1: 
                            case 2: {
                                entityUniqueId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
                                break;
                            }
                            case 3: {
                                fakePlayerName = (String)wrapper.read(BedrockTypes.STRING);
                                break;
                            }
                            case 4: {
                                throw new IllegalStateException("Invalid IdentityDefinition_Type: " + rawType);
                            }
                            default: {
                                throw new IllegalStateException("Unhandled IdentityDefinition_Type: " + rawType);
                            }
                        }
                        yield new ScoreboardEntry(score, type, entityUniqueId, fakePlayerName);
                    }
                    case 2 -> null;
                    default -> throw new IllegalStateException("Unhandled ScorePacketType: " + String.valueOf(action));
                };
                ScoreboardObjective objective = scoreboardTracker.getObjective(objectiveName);
                Pair existingEntry = scoreboardTracker.getEntry(scoreboardId);
                if (existingEntry != null) {
                    ((ScoreboardObjective)existingEntry.key()).removeEntry(wrapper.user(), scoreboardId);
                    if (entry == null || objective == null) continue;
                    ((ScoreboardEntry)existingEntry.value()).setScore(entry.score());
                    objective.addEntry(wrapper.user(), scoreboardId, (ScoreboardEntry)existingEntry.value());
                    continue;
                }
                if (entry == null || objective == null) continue;
                ScoreboardEntry sameTargetEntry = objective.getEntryWithSameTarget(entry);
                if (sameTargetEntry != null) {
                    sameTargetEntry.setScore(entry.score());
                    objective.updateEntryInPlace(wrapper.user(), sameTargetEntry);
                    continue;
                }
                if (!entry.isValid()) continue;
                objective.addEntry(wrapper.user(), scoreboardId, entry);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_SCOREBOARD_IDENTITY, null, wrapper -> {
            wrapper.cancel();
            ScoreboardTracker scoreboardTracker = (ScoreboardTracker)wrapper.user().get(ScoreboardTracker.class);
            byte rawAction = (Byte)wrapper.read((Type)Types.BYTE);
            ScoreboardIdentityPacketType action = ScoreboardIdentityPacketType.getByValue((int)rawAction);
            if (action == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown ScoreboardIdentityPacketType: " + rawAction);
                return;
            }
            int count = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            block4: for (int i = 0; i < count; ++i) {
                long scoreboardId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
                Pair entry = scoreboardTracker.getEntry(scoreboardId);
                switch (2.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$ScoreboardIdentityPacketType[action.ordinal()]) {
                    case 1: {
                        ScoreboardEntry scoreboardEntry;
                        long entityUniqueId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
                        if (entry == null || (scoreboardEntry = (ScoreboardEntry)entry.value()).entityUniqueId() != null) continue block4;
                        scoreboardEntry.updateTarget(IdentityDefinition_Type.Player, Long.valueOf(entityUniqueId), scoreboardEntry.fakePlayerName());
                        ((ScoreboardObjective)entry.key()).updateEntry(wrapper.user(), scoreboardEntry);
                        continue block4;
                    }
                    case 2: {
                        ScoreboardEntry scoreboardEntry;
                        if (entry == null || (scoreboardEntry = (ScoreboardEntry)entry.value()).fakePlayerName() == null) continue block4;
                        scoreboardEntry.updateTarget(IdentityDefinition_Type.FakePlayer, null, scoreboardEntry.fakePlayerName());
                        ((ScoreboardObjective)entry.key()).updateEntry(wrapper.user(), scoreboardEntry);
                        continue block4;
                    }
                    default: {
                        throw new IllegalStateException("Unhandled ScoreboardIdentityPacketType: " + String.valueOf(action));
                    }
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.REMOVE_OBJECTIVE, (ClientboundPacketType)ClientboundPackets26_1.SET_OBJECTIVE, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(BedrockTypes.STRING, Types.STRING);
                this.create((Type)Types.BYTE, (byte)ObjectiveAction.REMOVE.ordinal());
                this.handler(wrapper -> ((ScoreboardTracker)wrapper.user().get(ScoreboardTracker.class)).removeObjective((String)wrapper.get(Types.STRING, 0)));
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.BOSS_EVENT, (ClientboundPacketType)ClientboundPackets26_1.BOSS_EVENT, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            long bossEntityUniqueId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
            int rawUpdateType = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            BossEventUpdateType updateType = BossEventUpdateType.getByValue((int)rawUpdateType);
            if (updateType == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown BossEventUpdateType: " + rawUpdateType);
                wrapper.cancel();
                return;
            }
            Entity entity = entityTracker.getEntityByUid(bossEntityUniqueId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write(Types.UUID, (Object)entity.javaUuid());
            switch (2.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$BossEventUpdateType[updateType.ordinal()]) {
                case 1: {
                    if (!entity.hasBossBar()) {
                        entity.setHasBossBar(true);
                        wrapper.write((Type)Types.VAR_INT, (Object)BossEventOperationType.ADD.ordinal());
                        wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().translate((String)wrapper.read(BedrockTypes.STRING), new Object[0])));
                        wrapper.read(BedrockTypes.STRING);
                        wrapper.write((Type)Types.FLOAT, (Object)((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)));
                        wrapper.read((Type)BedrockTypes.UNSIGNED_SHORT_LE);
                        wrapper.write((Type)Types.VAR_INT, (Object)MathUtil.getOrFallback((int)((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT)), (int)0, (int)5, (int)0));
                        wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)0);
                        break;
                    }
                    wrapper.cancel();
                    break;
                }
                case 2: {
                    entity.setHasBossBar(false);
                    wrapper.write((Type)Types.VAR_INT, (Object)BossEventOperationType.REMOVE.ordinal());
                    break;
                }
                case 3: {
                    wrapper.write((Type)Types.VAR_INT, (Object)BossEventOperationType.UPDATE_PROGRESS.ordinal());
                    wrapper.write((Type)Types.FLOAT, (Object)((Float)wrapper.read((Type)BedrockTypes.FLOAT_LE)));
                    break;
                }
                case 4: {
                    wrapper.write((Type)Types.VAR_INT, (Object)BossEventOperationType.UPDATE_NAME.ordinal());
                    wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().translate((String)wrapper.read(BedrockTypes.STRING), new Object[0])));
                    wrapper.read(BedrockTypes.STRING);
                    break;
                }
                case 5: {
                    wrapper.write((Type)Types.VAR_INT, (Object)BossEventOperationType.UPDATE_STYLE.ordinal());
                    wrapper.read((Type)BedrockTypes.UNSIGNED_SHORT_LE);
                    wrapper.write((Type)Types.VAR_INT, (Object)MathUtil.getOrFallback((int)((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT)), (int)0, (int)5, (int)0));
                    wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    break;
                }
                case 6: {
                    wrapper.write((Type)Types.VAR_INT, (Object)BossEventOperationType.UPDATE_STYLE.ordinal());
                    wrapper.write((Type)Types.VAR_INT, (Object)MathUtil.getOrFallback((int)((Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT)), (int)0, (int)5, (int)0));
                    wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    break;
                }
                case 7: 
                case 8: 
                case 9: {
                    wrapper.cancel();
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled BossEventUpdateType: " + String.valueOf(updateType));
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.DEATH_INFO, null, wrapper -> {
            wrapper.cancel();
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            String message = (String)wrapper.read(BedrockTypes.STRING);
            Object[] parameters = (String[])wrapper.read(BedrockTypes.STRING_ARRAY);
            Function translator = ((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().lookup();
            gameSession.setDeathMessage(TextUtil.stringToTextComponent((String)BedrockTranslator.translate((String)message, (Function)translator, (Object[])parameters, (TranslatorOptions[])new TranslatorOptions[0])));
            if (entityTracker.getClientPlayer().isDead()) {
                PacketWrapper playerCombatKill = PacketWrapper.create((PacketType)ClientboundPackets26_1.PLAYER_COMBAT_KILL, (UserConnection)wrapper.user());
                playerCombatKill.write((Type)Types.VAR_INT, (Object)entityTracker.getClientPlayer().javaId());
                playerCombatKill.write(Types.TAG, (Object)TextUtil.textComponentToNbt((TextComponent)gameSession.getDeathMessage()));
                playerCombatKill.send(BedrockProtocol.class);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.GUI_DATA_PICK_ITEM, (ClientboundPacketType)ClientboundPackets26_1.SYSTEM_CHAT, wrapper -> {
            String itemName = (String)wrapper.read(BedrockTypes.STRING);
            String itemEffects = (String)wrapper.read(BedrockTypes.STRING);
            wrapper.read((Type)BedrockTypes.INT_LE);
            if (!itemEffects.isEmpty()) {
                wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)(itemName + "\n" + itemEffects)));
            } else {
                wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)itemName));
            }
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
        });
    }
}

