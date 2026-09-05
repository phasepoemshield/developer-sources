/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  net.lenni0451.mcstructs_bedrock.text.components.RootBedrockComponent
 *  net.lenni0451.mcstructs_bedrock.text.components.TranslationBedrockComponent
 *  net.lenni0451.mcstructs_bedrock.text.serializer.BedrockComponentSerializer
 *  net.lenni0451.mcstructs_bedrock.text.utils.BedrockTranslator
 *  net.lenni0451.mcstructs_bedrock.text.utils.TranslatorOptions
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.api.util.TextUtil
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AbilitiesIndex
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ChatRestrictionLevel
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandOriginType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandOutputType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerPermissionLevel
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SoftEnumUpdateType
 *  net.raphimc.viabedrock.protocol.model.CommandData$EnumData
 *  net.raphimc.viabedrock.protocol.packet.ChatPackets$4
 *  net.raphimc.viabedrock.protocol.storage.AuthData
 *  net.raphimc.viabedrock.protocol.storage.CommandsStorage
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.google.common.collect.Sets;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.logging.Level;
import net.lenni0451.mcstructs_bedrock.text.components.RootBedrockComponent;
import net.lenni0451.mcstructs_bedrock.text.components.TranslationBedrockComponent;
import net.lenni0451.mcstructs_bedrock.text.serializer.BedrockComponentSerializer;
import net.lenni0451.mcstructs_bedrock.text.utils.BedrockTranslator;
import net.lenni0451.mcstructs_bedrock.text.utils.TranslatorOptions;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.api.util.TextUtil;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AbilitiesIndex;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ChatRestrictionLevel;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandOriginType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandOutputType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerPermissionLevel;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SoftEnumUpdateType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.TextPacketType;
import net.raphimc.viabedrock.protocol.model.CommandData;
import net.raphimc.viabedrock.protocol.model.CommandOriginData;
import net.raphimc.viabedrock.protocol.packet.ChatPackets;
import net.raphimc.viabedrock.protocol.storage.AuthData;
import net.raphimc.viabedrock.protocol.storage.CommandsStorage;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.storage.ResourcePackStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ChatPackets {
    private static final PacketHandler CHAT_COMMAND_HANDLER = new PacketHandlers(){

        protected void register() {
            this.map(Types.STRING, BedrockTypes.STRING, c -> "/" + c);
            this.handler(wrapper -> wrapper.write(BedrockTypes.COMMAND_ORIGIN_DATA, (Object)new CommandOriginData(CommandOriginType.Player, UUID.randomUUID(), "")));
            this.create((Type)Types.BOOLEAN, false);
            this.create(BedrockTypes.STRING, "latest");
            this.handler(PacketWrapper::clearInputBuffer);
            this.handler(wrapper -> {
                CommandsStorage commandsStorage = (CommandsStorage)wrapper.user().get(CommandsStorage.class);
                int execResult = 0;
                if (commandsStorage != null) {
                    execResult = commandsStorage.execute((String)wrapper.get(BedrockTypes.STRING, 0));
                }
                if (execResult == 1) {
                    wrapper.cancel();
                } else if (execResult != -1) {
                    GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
                    ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
                    if (!gameSession.areCommandsEnabled() || gameSession.getChatRestrictionLevel() == ChatRestrictionLevel.Disabled && clientPlayer.abilities().playerPermission() <= PlayerPermissionLevel.Member.getValue()) {
                        wrapper.cancel();
                        PacketFactory.sendJavaSystemChat((UserConnection)wrapper.user(), (Tag)TextUtil.stringToNbt((String)("\u00a7e" + ((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().get("commands.generic.disabled"))));
                    }
                }
            });
        }
    };

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.TEXT, (ClientboundPacketType)ClientboundPackets26_1.SYSTEM_CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    boolean localize = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    wrapper.read((Type)Types.UNSIGNED_BYTE);
                    short rawType = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
                    TextPacketType type = TextPacketType.getByValue(rawType);
                    if (type == null) {
                        ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown TextPacketType: " + rawType);
                        wrapper.cancel();
                        return;
                    }
                    Function translator = ((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().lookup();
                    String originalMessage = null;
                    try {
                        switch (4.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$TextPacketType[type.ordinal()]) {
                            case 1: 
                            case 2: 
                            case 3: {
                                String sourceName = (String)wrapper.read(BedrockTypes.STRING);
                                String message = originalMessage = (String)wrapper.read(BedrockTypes.STRING);
                                if (localize) {
                                    message = BedrockTranslator.translate((String)message, (Function)translator, (Object[])new Object[0], (TranslatorOptions[])new TranslatorOptions[0]);
                                }
                                if (type == TextPacketType.chat && !sourceName.isEmpty()) {
                                    message = BedrockTranslator.translate((String)"chat.type.text", (Function)translator, (Object[])new String[]{sourceName, message}, (TranslatorOptions[])new TranslatorOptions[]{TranslatorOptions.SKIP_ARGS_TRANSLATION});
                                } else if (type == TextPacketType.whisper) {
                                    message = BedrockTranslator.translate((String)"chat.type.text", (Function)translator, (Object[])new String[]{sourceName, BedrockTranslator.translate((String)"\u00a77\u00a7o%commands.message.display.incoming", (Function)translator, (Object[])new String[]{sourceName, message}, (TranslatorOptions[])new TranslatorOptions[0])}, (TranslatorOptions[])new TranslatorOptions[]{TranslatorOptions.SKIP_ARGS_TRANSLATION});
                                }
                                wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)message));
                                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                                break;
                            }
                            case 4: 
                            case 5: 
                            case 6: {
                                String message = originalMessage = (String)wrapper.read(BedrockTypes.STRING);
                                RootBedrockComponent rootComponent = BedrockComponentSerializer.deserialize((String)message);
                                rootComponent.forEach(c -> {
                                    if (c instanceof TranslationBedrockComponent) {
                                        ((TranslationBedrockComponent)c).setTranslator(translator);
                                    }
                                });
                                message = rootComponent.asString();
                                if (localize) {
                                    message = BedrockTranslator.translate((String)message, (Function)translator, (Object[])new Object[0], (TranslatorOptions[])new TranslatorOptions[0]);
                                }
                                wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)message));
                                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                                break;
                            }
                            case 7: 
                            case 8: 
                            case 9: {
                                String message = originalMessage = (String)wrapper.read(BedrockTypes.STRING);
                                if (localize) {
                                    message = BedrockTranslator.translate((String)message, (Function)translator, (Object[])new Object[0], (TranslatorOptions[])new TranslatorOptions[0]);
                                }
                                wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)message));
                                wrapper.write((Type)Types.BOOLEAN, (Object)(type == TextPacketType.tip ? 1 : 0));
                                break;
                            }
                            case 10: 
                            case 11: 
                            case 12: {
                                String message = originalMessage = (String)wrapper.read(BedrockTypes.STRING);
                                Object[] parameters = (String[])wrapper.read(BedrockTypes.STRING_ARRAY);
                                if (localize) {
                                    message = BedrockTranslator.translate((String)message, (Function)translator, (Object[])parameters, (TranslatorOptions[])new TranslatorOptions[0]);
                                }
                                wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)message));
                                wrapper.write((Type)Types.BOOLEAN, (Object)(type == TextPacketType.popup || type == TextPacketType.jukeboxPopup ? 1 : 0));
                                break;
                            }
                            default: {
                                throw new IllegalStateException("Unhandled TextPacketType: " + String.valueOf((Object)type));
                            }
                        }
                    }
                    catch (Throwable e) {
                        ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Error while translating '" + originalMessage + "'", e);
                        wrapper.cancel();
                    }
                });
                this.read(BedrockTypes.STRING);
                this.read(BedrockTypes.STRING);
                this.read(BedrockTypes.OPTIONAL_STRING);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.COMMAND_OUTPUT, (ClientboundPacketType)ClientboundPackets26_1.SYSTEM_CHAT, wrapper -> {
            CommandOriginData originData = (CommandOriginData)((Object)((Object)wrapper.read(BedrockTypes.COMMAND_ORIGIN_DATA)));
            String rawType = (String)wrapper.read(BedrockTypes.STRING);
            CommandOutputType type = CommandOutputType.getByName((String)rawType);
            if (type == null) {
                throw new IllegalStateException("Unknown CommandOutputType: " + rawType);
            }
            wrapper.read((Type)BedrockTypes.UNSIGNED_INT_LE);
            if (originData.type() != CommandOriginType.Player) {
                wrapper.cancel();
                return;
            }
            Function translator = ((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().lookup();
            StringBuilder message = new StringBuilder();
            int messageCount = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            for (int i = 0; i < messageCount; ++i) {
                String messageId = (String)wrapper.read(BedrockTypes.STRING);
                boolean successful = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                Object[] parameters = (String[])wrapper.read(BedrockTypes.STRING_ARRAY);
                message.append(successful ? "\u00a7r" : "\u00a7c");
                message.append(BedrockTranslator.translate((String)messageId, (Function)translator, (Object[])parameters, (TranslatorOptions[])new TranslatorOptions[0]));
                if (i == messageCount - 1) continue;
                message.append("\n");
            }
            wrapper.read(BedrockTypes.OPTIONAL_STRING);
            wrapper.write(Types.TAG, (Object)TextUtil.stringToNbt((String)message.toString()));
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
        });
        protocol.registerClientboundTransition(ClientboundBedrockPackets.AVAILABLE_COMMANDS, State.CONFIGURATION, wrapper -> {
            CommandData[] commands = (CommandData[])wrapper.read(BedrockTypes.COMMAND_DATA_ARRAY);
            wrapper.user().put((StorableObject)new CommandsStorage(wrapper.user(), commands));
            wrapper.cancel();
        }, ClientboundPackets26_1.COMMANDS, wrapper -> {
            CommandData[] commands = (CommandData[])wrapper.read(BedrockTypes.COMMAND_DATA_ARRAY);
            CommandsStorage commandsStorage = new CommandsStorage(wrapper.user(), commands);
            wrapper.user().put((StorableObject)commandsStorage);
            commandsStorage.writeCommandTree(wrapper);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.UPDATE_SOFT_ENUM, null, wrapper -> {
            wrapper.cancel();
            CommandsStorage commandsStorage = (CommandsStorage)wrapper.user().get(CommandsStorage.class);
            if (commandsStorage == null) {
                return;
            }
            String name = (String)wrapper.read(BedrockTypes.STRING);
            HashSet values = Sets.newHashSet((Object[])((String[])wrapper.read(BedrockTypes.STRING_ARRAY)));
            CommandData.EnumData softEnum = commandsStorage.getSoftEnum(name);
            if (softEnum == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received update for unknown soft enum: " + name);
                return;
            }
            byte rawAction = (Byte)wrapper.read((Type)Types.BYTE);
            SoftEnumUpdateType action = SoftEnumUpdateType.getByValue((int)rawAction);
            if (action == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown SoftEnumUpdateType: " + rawAction);
                return;
            }
            switch (4.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$SoftEnumUpdateType[action.ordinal()]) {
                case 1: {
                    softEnum.addValues((Set)values);
                    break;
                }
                case 2: {
                    softEnum.removeValues((Set)values);
                    break;
                }
                case 3: {
                    softEnum.values().clear();
                    softEnum.addValues((Set)values);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled SoftEnumUpdateType: " + String.valueOf(action));
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_COMMANDS_ENABLED, null, wrapper -> {
            wrapper.cancel();
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            boolean commandsEnabled = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (commandsEnabled != gameSession.areCommandsEnabled()) {
                gameSession.setCommandsEnabled(commandsEnabled);
                CommandsStorage commandsStorage = (CommandsStorage)wrapper.user().get(CommandsStorage.class);
                if (commandsStorage != null) {
                    commandsStorage.updateCommandTree();
                }
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CHAT, ServerboundBedrockPackets.TEXT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.create((Type)Types.BOOLEAN, false);
                this.create((Type)Types.UNSIGNED_BYTE, (short)1);
                this.create((Type)Types.UNSIGNED_BYTE, (short)TextPacketType.chat.getValue());
                this.handler(wrapper -> wrapper.write(BedrockTypes.STRING, (Object)((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer().name()));
                this.map(Types.STRING, BedrockTypes.STRING);
                this.handler(wrapper -> wrapper.write(BedrockTypes.STRING, (Object)((AuthData)wrapper.user().get(AuthData.class)).getXuid()));
                this.create(BedrockTypes.STRING, "");
                this.create(BedrockTypes.OPTIONAL_STRING, null);
                this.handler(PacketWrapper::clearInputBuffer);
                this.handler(wrapper -> {
                    GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
                    ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
                    if (gameSession.getChatRestrictionLevel() != ChatRestrictionLevel.None || clientPlayer.abilities().getBooleanValue(AbilitiesIndex.Muted)) {
                        wrapper.cancel();
                        PacketFactory.sendJavaSystemChat((UserConnection)wrapper.user(), (Tag)TextUtil.stringToNbt((String)("\u00a7e" + ((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().get("permissions.chatmute"))));
                    }
                });
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CHAT_COMMAND, ServerboundBedrockPackets.COMMAND_REQUEST, CHAT_COMMAND_HANDLER);
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CHAT_COMMAND_SIGNED, ServerboundBedrockPackets.COMMAND_REQUEST, CHAT_COMMAND_HANDLER);
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.COMMAND_SUGGESTION, null, wrapper -> {
            wrapper.cancel();
            CommandsStorage commandsStorage = (CommandsStorage)wrapper.user().get(CommandsStorage.class);
            if (commandsStorage == null) {
                return;
            }
            int id = (Integer)wrapper.read((Type)Types.VAR_INT);
            String command = (String)wrapper.read(Types.STRING);
            if (!command.startsWith("/")) {
                return;
            }
            Suggestions suggestions = commandsStorage.complete(command);
            PacketWrapper tabComplete = PacketWrapper.create((PacketType)ClientboundPackets26_1.COMMAND_SUGGESTIONS, (UserConnection)wrapper.user());
            tabComplete.write((Type)Types.VAR_INT, (Object)id);
            tabComplete.write((Type)Types.VAR_INT, (Object)suggestions.getRange().getStart());
            tabComplete.write((Type)Types.VAR_INT, (Object)suggestions.getRange().getLength());
            tabComplete.write((Type)Types.VAR_INT, (Object)suggestions.getList().size());
            for (Suggestion suggestion : suggestions.getList()) {
                tabComplete.write(Types.STRING, (Object)suggestion.getText());
                if (suggestion.getTooltip() != null) {
                    tabComplete.write(Types.OPTIONAL_TAG, (Object)TextUtil.stringToNbt((String)suggestion.getTooltip().getString()));
                    continue;
                }
                tabComplete.write(Types.OPTIONAL_TAG, null);
            }
            tabComplete.send(BedrockProtocol.class);
        });
    }
}

