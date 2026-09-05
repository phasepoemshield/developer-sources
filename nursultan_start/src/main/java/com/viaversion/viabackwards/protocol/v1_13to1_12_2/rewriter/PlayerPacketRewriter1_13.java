/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.ParticleIdMappings1_12_2
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.ParticleIdMappings1_12_2$ParticleData
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.TabCompleteStorage
 *  com.viaversion.viabackwards.utils.ChatUtil
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter.ItemPacketRewriter1_13
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.protocol.v1_13to1_12_2.rewriter;

import com.google.common.base.Joiner;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.Protocol1_13To1_12_2;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.ParticleIdMappings1_12_2;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.TabCompleteStorage;
import com.viaversion.viabackwards.utils.ChatUtil;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter.ItemPacketRewriter1_13;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1;
import com.viaversion.viaversion.rewriter.CommandRewriter;
import com.viaversion.viaversion.util.Key;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class PlayerPacketRewriter1_13
extends RewriterBase<Protocol1_13To1_12_2> {
    private final CommandRewriter<ClientboundPackets1_13> commandRewriter;

    public PlayerPacketRewriter1_13(Protocol1_13To1_12_2 protocol) {
        super((Protocol)protocol);
        this.commandRewriter = new CommandRewriter(this.protocol);
    }

    private static boolean startsWithIgnoreCase(String string, String prefix) {
        if (string.length() < prefix.length()) {
            return false;
        }
        return string.regionMatches(true, 0, prefix, 0, prefix.length());
    }

    protected void registerPackets() {
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound(State.LOGIN, ClientboundLoginPackets.CUSTOM_QUERY.getId(), -1, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(packetWrapper -> {
                    packetWrapper.cancel();
                    packetWrapper.create(ServerboundLoginPackets.CUSTOM_QUERY_ANSWER.getId(), wrapper -> {
                        wrapper.write((Type)Types.VAR_INT, (Object)((Integer)packetWrapper.read((Type)Types.VAR_INT)));
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    }).sendToServer(Protocol1_13To1_12_2.class);
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.CUSTOM_PAYLOAD, wrapper -> {
            String channel = (String)wrapper.read(Types.STRING);
            if (channel.equals("minecraft:trader_list")) {
                wrapper.write(Types.STRING, (Object)"MC|TrList");
                ((Protocol1_13To1_12_2)this.protocol).getItemRewriter().handleTradeList(wrapper);
            } else {
                String oldChannel = ItemPacketRewriter1_13.getOldPluginChannelId((String)channel);
                if (oldChannel == null) {
                    if (Via.getConfig().logOtherConversionWarnings()) {
                        ((Protocol1_13To1_12_2)this.protocol).getLogger().warning("Ignoring clientbound plugin message with channel: " + channel);
                    }
                    wrapper.cancel();
                    return;
                }
                wrapper.write(Types.STRING, (Object)oldChannel);
                if (oldChannel.equals("REGISTER") || oldChannel.equals("UNREGISTER")) {
                    String[] channels = new String((byte[])wrapper.read(Types.REMAINING_BYTES), StandardCharsets.UTF_8).split("\u0000");
                    ArrayList<String> rewrittenChannels = new ArrayList<String>();
                    for (String s : channels) {
                        String rewritten = ItemPacketRewriter1_13.getOldPluginChannelId((String)s);
                        if (rewritten != null) {
                            rewrittenChannels.add(rewritten);
                            continue;
                        }
                        if (!Via.getConfig().logOtherConversionWarnings()) continue;
                        ((Protocol1_13To1_12_2)this.protocol).getLogger().warning("Ignoring plugin channel in clientbound " + oldChannel + ": " + s);
                    }
                    wrapper.write(Types.REMAINING_BYTES, (Object)Joiner.on((char)'\u0000').join(rewrittenChannels).getBytes(StandardCharsets.UTF_8));
                }
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ParticleIdMappings1_12_2.ParticleData old = ParticleIdMappings1_12_2.getMapping((int)((Integer)wrapper.get((Type)Types.INT, 0)));
                    wrapper.set((Type)Types.INT, 0, (Object)old.getHistoryId());
                    int[] data = old.rewriteData((Protocol1_13To1_12_2)PlayerPacketRewriter1_13.this.protocol, wrapper);
                    if (data != null) {
                        if (old.getHandler().isBlockHandler() && data[0] == 0) {
                            wrapper.cancel();
                            return;
                        }
                        for (int i : data) {
                            wrapper.write((Type)Types.VAR_INT, (Object)i);
                        }
                    }
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.PLAYER_INFO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(packetWrapper -> {
                    TabCompleteStorage storage = (TabCompleteStorage)packetWrapper.user().get(TabCompleteStorage.class);
                    int action = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
                    int nPlayers = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
                    for (int i = 0; i < nPlayers; ++i) {
                        UUID uuid = (UUID)packetWrapper.passthrough(Types.UUID);
                        if (action == 0) {
                            String name = (String)packetWrapper.passthrough(Types.STRING);
                            storage.usernames().put(uuid, name);
                            packetWrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                            packetWrapper.passthrough((Type)Types.VAR_INT);
                            packetWrapper.passthrough((Type)Types.VAR_INT);
                            packetWrapper.passthrough(Types.OPTIONAL_COMPONENT);
                            continue;
                        }
                        if (action == 1) {
                            packetWrapper.passthrough((Type)Types.VAR_INT);
                            continue;
                        }
                        if (action == 2) {
                            packetWrapper.passthrough((Type)Types.VAR_INT);
                            continue;
                        }
                        if (action == 3) {
                            packetWrapper.passthrough(Types.OPTIONAL_COMPONENT);
                            continue;
                        }
                        if (action != 4) continue;
                        storage.usernames().remove(uuid);
                    }
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.SET_OBJECTIVE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    byte mode = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (mode == 0 || mode == 2) {
                        JsonElement value = (JsonElement)wrapper.read(Types.COMPONENT);
                        String legacyValue = ((Protocol1_13To1_12_2)PlayerPacketRewriter1_13.this.protocol).jsonToLegacy(wrapper.user(), value);
                        wrapper.write(Types.STRING, (Object)ChatUtil.fromLegacy((String)legacyValue, (char)'f', (int)32));
                        int type = (Integer)wrapper.read((Type)Types.VAR_INT);
                        wrapper.write(Types.STRING, (Object)(type == 1 ? "hearts" : "integer"));
                    }
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.SET_PLAYER_TEAM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    byte action = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (action == 0 || action == 2) {
                        JsonElement displayName = (JsonElement)wrapper.read(Types.COMPONENT);
                        String legacyTextDisplayName = ((Protocol1_13To1_12_2)PlayerPacketRewriter1_13.this.protocol).jsonToLegacy(wrapper.user(), displayName);
                        wrapper.write(Types.STRING, (Object)ChatUtil.fromLegacy((String)legacyTextDisplayName, (char)'f', (int)32));
                        byte flags = (Byte)wrapper.read((Type)Types.BYTE);
                        String nameTagVisibility = (String)wrapper.read(Types.STRING);
                        String collisionRule = (String)wrapper.read(Types.STRING);
                        int colour = (Integer)wrapper.read((Type)Types.VAR_INT);
                        if (colour == 21) {
                            colour = -1;
                        }
                        JsonElement prefixComponent = (JsonElement)wrapper.read(Types.COMPONENT);
                        JsonElement suffixComponent = (JsonElement)wrapper.read(Types.COMPONENT);
                        Object prefix = ((Protocol1_13To1_12_2)PlayerPacketRewriter1_13.this.protocol).jsonToLegacy(wrapper.user(), prefixComponent);
                        if (ViaBackwards.getConfig().addTeamColorTo1_13Prefix()) {
                            prefix = (String)prefix + "\u00a7" + (colour > -1 && colour <= 15 ? Integer.toHexString(colour) : "r");
                        }
                        String suffix = ((Protocol1_13To1_12_2)PlayerPacketRewriter1_13.this.protocol).jsonToLegacy(wrapper.user(), suffixComponent);
                        wrapper.write(Types.STRING, (Object)ChatUtil.fromLegacyPrefix((String)prefix, (char)'f', (int)16));
                        wrapper.write(Types.STRING, (Object)ChatUtil.fromLegacy((String)suffix, (char)'\u0000', (int)16));
                        wrapper.write((Type)Types.BYTE, (Object)flags);
                        wrapper.write(Types.STRING, (Object)nameTagVisibility);
                        wrapper.write(Types.STRING, (Object)collisionRule);
                        wrapper.write((Type)Types.BYTE, (Object)((byte)colour));
                    }
                    if (action == 0 || action == 3 || action == 4) {
                        wrapper.passthrough(Types.STRING_ARRAY);
                    }
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.COMMANDS, null, wrapper -> {
            wrapper.cancel();
            TabCompleteStorage storage = (TabCompleteStorage)wrapper.user().get(TabCompleteStorage.class);
            if (!storage.commands().isEmpty()) {
                storage.commands().clear();
            }
            int size = (Integer)wrapper.read((Type)Types.VAR_INT);
            boolean initialNodes = true;
            for (int i = 0; i < size; ++i) {
                byte flags = (Byte)wrapper.read((Type)Types.BYTE);
                wrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
                if ((flags & 8) != 0) {
                    wrapper.read((Type)Types.VAR_INT);
                }
                byte nodeType = (byte)(flags & 3);
                if (initialNodes && nodeType == 2) {
                    initialNodes = false;
                }
                if (nodeType == 1 || nodeType == 2) {
                    String name = (String)wrapper.read(Types.STRING);
                    if (nodeType == 1 && initialNodes) {
                        storage.commands().add("/" + name);
                    }
                }
                if (nodeType == 2) {
                    this.commandRewriter.handleArgument(wrapper, (String)wrapper.read(Types.STRING));
                }
                if ((flags & 0x10) == 0) continue;
                wrapper.read(Types.STRING);
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.COMMAND_SUGGESTIONS, wrapper -> {
            TabCompleteStorage storage = (TabCompleteStorage)wrapper.user().get(TabCompleteStorage.class);
            if (storage.lastRequest() == null) {
                wrapper.cancel();
                return;
            }
            if (storage.lastId() != ((Integer)wrapper.read((Type)Types.VAR_INT)).intValue()) {
                wrapper.cancel();
            }
            int start = (Integer)wrapper.read((Type)Types.VAR_INT);
            int length = (Integer)wrapper.read((Type)Types.VAR_INT);
            int lastRequestPartIndex = storage.lastRequest().lastIndexOf(32) + 1;
            if (lastRequestPartIndex != start) {
                wrapper.cancel();
            }
            if (length != storage.lastRequest().length() - lastRequestPartIndex) {
                wrapper.cancel();
            }
            int count = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < count; ++i) {
                String match = (String)wrapper.read(Types.STRING);
                wrapper.write(Types.STRING, (Object)((start == 0 && !storage.isLastAssumeCommand() ? "/" : "") + match));
                wrapper.read(Types.OPTIONAL_COMPONENT);
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_12_1.COMMAND_SUGGESTION, wrapper -> {
            TabCompleteStorage storage = (TabCompleteStorage)wrapper.user().get(TabCompleteStorage.class);
            ArrayList<String> suggestions = new ArrayList<String>();
            String command = (String)wrapper.read(Types.STRING);
            boolean assumeCommand = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.read(Types.OPTIONAL_POSITION1_8);
            if (!assumeCommand && !command.startsWith("/")) {
                String buffer = command.substring(command.lastIndexOf(32) + 1);
                for (String value : storage.usernames().values()) {
                    if (!PlayerPacketRewriter1_13.startsWithIgnoreCase(value, buffer)) continue;
                    suggestions.add(value);
                }
            } else if (!storage.commands().isEmpty() && !command.contains(" ")) {
                for (String value : storage.commands()) {
                    if (!PlayerPacketRewriter1_13.startsWithIgnoreCase(value, command)) continue;
                    suggestions.add(value);
                }
            }
            if (!suggestions.isEmpty()) {
                wrapper.cancel();
                PacketWrapper response = wrapper.create((PacketType)ClientboundPackets1_12_1.COMMAND_SUGGESTIONS);
                response.write((Type)Types.VAR_INT, (Object)suggestions.size());
                for (String value : suggestions) {
                    response.write(Types.STRING, (Object)value);
                }
                response.scheduleSend(Protocol1_13To1_12_2.class);
                storage.setLastRequest(null);
                return;
            }
            if (!assumeCommand && command.startsWith("/")) {
                command = command.substring(1);
            }
            int id = ThreadLocalRandom.current().nextInt();
            wrapper.write((Type)Types.VAR_INT, (Object)id);
            wrapper.write(Types.STRING, (Object)command);
            storage.setLastId(id);
            storage.setLastAssumeCommand(assumeCommand);
            storage.setLastRequest(command);
        });
        ((Protocol1_13To1_12_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_12_1.CUSTOM_PAYLOAD, wrapper -> {
            String channel;
            switch (channel = (String)wrapper.read(Types.STRING)) {
                case "MC|BSign": 
                case "MC|BEdit": {
                    wrapper.setPacketType((PacketType)ServerboundPackets1_13.EDIT_BOOK);
                    Item book = (Item)wrapper.read(Types.ITEM1_8);
                    wrapper.write(Types.ITEM1_13, (Object)((Protocol1_13To1_12_2)this.protocol).getItemRewriter().handleItemToServer(wrapper.user(), book));
                    boolean signing = channel.equals("MC|BSign");
                    wrapper.write((Type)Types.BOOLEAN, (Object)signing);
                    break;
                }
                case "MC|ItemName": {
                    wrapper.setPacketType((PacketType)ServerboundPackets1_13.RENAME_ITEM);
                    break;
                }
                case "MC|AdvCmd": {
                    byte type = (Byte)wrapper.read((Type)Types.BYTE);
                    if (type == 0) {
                        wrapper.setPacketType((PacketType)ServerboundPackets1_13.SET_COMMAND_BLOCK);
                        wrapper.cancel();
                        if (!Via.getConfig().logOtherConversionWarnings()) break;
                        ((Protocol1_13To1_12_2)this.protocol).getLogger().warning("Client send MC|AdvCmd custom payload to update command block, weird!");
                        break;
                    }
                    if (type == 1) {
                        wrapper.setPacketType((PacketType)ServerboundPackets1_13.SET_COMMAND_MINECART);
                        wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.INT)));
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        break;
                    }
                    wrapper.cancel();
                    break;
                }
                case "MC|AutoCmd": {
                    String mode;
                    wrapper.setPacketType((PacketType)ServerboundPackets1_13.SET_COMMAND_BLOCK);
                    int x = (Integer)wrapper.read((Type)Types.INT);
                    int y = (Integer)wrapper.read((Type)Types.INT);
                    int z = (Integer)wrapper.read((Type)Types.INT);
                    wrapper.write(Types.BLOCK_POSITION1_8, (Object)new BlockPosition(x, (int)((short)y), z));
                    wrapper.passthrough(Types.STRING);
                    byte flags = 0;
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        flags = (byte)(flags | 1);
                    }
                    int modeId = (mode = (String)wrapper.read(Types.STRING)).equals("SEQUENCE") ? 0 : (mode.equals("AUTO") ? 1 : 2);
                    wrapper.write((Type)Types.VAR_INT, (Object)modeId);
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        flags = (byte)(flags | 2);
                    }
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        flags = (byte)(flags | 4);
                    }
                    wrapper.write((Type)Types.BYTE, (Object)flags);
                    break;
                }
                case "MC|Struct": {
                    wrapper.setPacketType((PacketType)ServerboundPackets1_13.SET_STRUCTURE_BLOCK);
                    int x = (Integer)wrapper.read((Type)Types.INT);
                    int y = (Integer)wrapper.read((Type)Types.INT);
                    int z = (Integer)wrapper.read((Type)Types.INT);
                    wrapper.write(Types.BLOCK_POSITION1_8, (Object)new BlockPosition(x, (int)((short)y), z));
                    wrapper.write((Type)Types.VAR_INT, (Object)((Byte)wrapper.read((Type)Types.BYTE) - 1));
                    String mode = (String)wrapper.read(Types.STRING);
                    int modeId = mode.equals("SAVE") ? 0 : (mode.equals("LOAD") ? 1 : (mode.equals("CORNER") ? 2 : 3));
                    wrapper.write((Type)Types.VAR_INT, (Object)modeId);
                    wrapper.passthrough(Types.STRING);
                    wrapper.write((Type)Types.BYTE, (Object)((Integer)wrapper.read((Type)Types.INT)).byteValue());
                    wrapper.write((Type)Types.BYTE, (Object)((Integer)wrapper.read((Type)Types.INT)).byteValue());
                    wrapper.write((Type)Types.BYTE, (Object)((Integer)wrapper.read((Type)Types.INT)).byteValue());
                    wrapper.write((Type)Types.BYTE, (Object)((Integer)wrapper.read((Type)Types.INT)).byteValue());
                    wrapper.write((Type)Types.BYTE, (Object)((Integer)wrapper.read((Type)Types.INT)).byteValue());
                    wrapper.write((Type)Types.BYTE, (Object)((Integer)wrapper.read((Type)Types.INT)).byteValue());
                    String mirror = (String)wrapper.read(Types.STRING);
                    int mirrorId = mode.equals("NONE") ? 0 : (mode.equals("LEFT_RIGHT") ? 1 : 2);
                    String rotation = (String)wrapper.read(Types.STRING);
                    int rotationId = mode.equals("NONE") ? 0 : (mode.equals("CLOCKWISE_90") ? 1 : (mode.equals("CLOCKWISE_180") ? 2 : 3));
                    wrapper.passthrough(Types.STRING);
                    byte flags = 0;
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        flags = (byte)(flags | 1);
                    }
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        flags = (byte)(flags | 2);
                    }
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        flags = (byte)(flags | 4);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.VAR_LONG);
                    wrapper.write((Type)Types.BYTE, (Object)flags);
                    break;
                }
                case "MC|Beacon": {
                    wrapper.setPacketType((PacketType)ServerboundPackets1_13.SET_BEACON);
                    wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.INT)));
                    wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.INT)));
                    break;
                }
                case "MC|TrSel": {
                    wrapper.setPacketType((PacketType)ServerboundPackets1_13.SELECT_TRADE);
                    wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.INT)));
                    break;
                }
                case "MC|PickItem": {
                    wrapper.setPacketType((PacketType)ServerboundPackets1_13.PICK_ITEM);
                    break;
                }
                default: {
                    String newChannel = ItemPacketRewriter1_13.getNewPluginChannelId((String)channel);
                    if (newChannel == null) {
                        if (Via.getConfig().logOtherConversionWarnings()) {
                            ((Protocol1_13To1_12_2)this.protocol).getLogger().warning("Ignoring serverbound plugin message with channel: " + channel);
                        }
                        wrapper.cancel();
                        return;
                    }
                    wrapper.write(Types.STRING, (Object)newChannel);
                    if (!newChannel.equals("minecraft:register") && !newChannel.equals("minecraft:unregister")) break;
                    String[] channels = new String((byte[])wrapper.read(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA), StandardCharsets.UTF_8).split("\u0000");
                    ArrayList<String> rewrittenChannels = new ArrayList<String>();
                    for (String s : channels) {
                        String rewritten = ItemPacketRewriter1_13.getNewPluginChannelId((String)s);
                        if (rewritten != null) {
                            rewrittenChannels.add(rewritten);
                            continue;
                        }
                        if (!Via.getConfig().logOtherConversionWarnings()) continue;
                        ((Protocol1_13To1_12_2)this.protocol).getLogger().warning("Ignoring plugin channel in serverbound " + Key.stripMinecraftNamespace((String)newChannel).toUpperCase(Locale.ROOT) + ": " + s);
                    }
                    if (!rewrittenChannels.isEmpty()) {
                        wrapper.write(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA, (Object)Joiner.on((char)'\u0000').join(rewrittenChannels).getBytes(StandardCharsets.UTF_8));
                        break;
                    }
                    wrapper.cancel();
                }
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_13.AWARD_STATS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int size;
                    int newSize = size = ((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue();
                    block4: for (int i = 0; i < size; ++i) {
                        int categoryId = (Integer)wrapper.read((Type)Types.VAR_INT);
                        int statisticId = (Integer)wrapper.read((Type)Types.VAR_INT);
                        String name = "";
                        switch (categoryId) {
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: {
                                wrapper.read((Type)Types.VAR_INT);
                                --newSize;
                                continue block4;
                            }
                            case 8: {
                                name = (String)((Protocol1_13To1_12_2)PlayerPacketRewriter1_13.this.protocol).getMappingData().getStatisticMappings().get(statisticId);
                                if (name == null) {
                                    wrapper.read((Type)Types.VAR_INT);
                                    --newSize;
                                    continue block4;
                                }
                            }
                            default: {
                                wrapper.write(Types.STRING, (Object)name);
                                wrapper.passthrough((Type)Types.VAR_INT);
                            }
                        }
                    }
                    if (newSize != size) {
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)newSize);
                    }
                });
            }
        });
    }
}

