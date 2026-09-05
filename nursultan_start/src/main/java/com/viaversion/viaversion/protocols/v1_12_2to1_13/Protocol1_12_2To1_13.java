/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.primitives.Ints
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Readers
 *  com.viaversion.viaversion.api.type.types.version.Types1_13
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonParseException
 *  com.viaversion.viaversion.protocols.base.ClientboundStatusPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.StatisticData
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockStorage
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.TabCompleteTracker
 *  com.viaversion.viaversion.util.ChatColorUtil
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.GsonUtil
 *  com.viaversion.viaversion.util.IdAndData
 *  com.viaversion.viaversion.util.ProtocolLogger
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13;

import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_13;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonParseException;
import com.viaversion.viaversion.protocols.base.ClientboundStatusPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.ConnectionData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.providers.BlockConnectionProvider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.providers.PacketBlockConnectionProvider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.BlockIdData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.MappingData1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.RecipeData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.StatisticData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.StatisticMappings1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.BlockEntityProvider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.PaintingProvider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.PlayerLookTargetProvider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter.ComponentRewriter1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter.EntityPacketRewriter1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter.ItemPacketRewriter1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter.WorldPacketRewriter1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockConnectionStorage;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockStorage;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.TabCompleteTracker;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1;
import com.viaversion.viaversion.util.ChatColorUtil;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.GsonUtil;
import com.viaversion.viaversion.util.IdAndData;
import com.viaversion.viaversion.util.ProtocolLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

public class Protocol1_12_2To1_13
extends AbstractProtocol<ClientboundPackets1_12_1, ClientboundPackets1_13, ServerboundPackets1_12_1, ServerboundPackets1_13> {
    public static final MappingData1_13 MAPPINGS = new MappingData1_13();
    public static final ProtocolLogger LOGGER = new ProtocolLogger(Protocol1_12_2To1_13.class);
    private static final Map<Character, Character> SCOREBOARD_TEAM_NAME_REWRITE = new HashMap<Character, Character>();
    private static final Set<Character> FORMATTING_CODES = Sets.newHashSet((Object[])new Character[]{Character.valueOf('k'), Character.valueOf('l'), Character.valueOf('m'), Character.valueOf('n'), Character.valueOf('o'), Character.valueOf('r')});
    private final EntityPacketRewriter1_13 entityRewriter = new EntityPacketRewriter1_13(this);
    private final ItemPacketRewriter1_13 itemRewriter = new ItemPacketRewriter1_13(this);
    private final ComponentRewriter1_13<ClientboundPackets1_12_1> componentRewriter = new ComponentRewriter1_13(this);
    public static final PacketHandler POS_TO_3_INT;
    public static final PacketHandler SEND_DECLARE_COMMANDS_AND_TAGS;

    public Protocol1_12_2To1_13() {
        super(ClientboundPackets1_12_1.class, ClientboundPackets1_13.class, ServerboundPackets1_12_1.class, ServerboundPackets1_13.class);
    }

    public void register(ViaProviders providers) {
        providers.register(BlockEntityProvider.class, (Provider)new BlockEntityProvider());
        providers.register(PaintingProvider.class, (Provider)new PaintingProvider());
        providers.register(PlayerLookTargetProvider.class, (Provider)new PlayerLookTargetProvider());
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_13.EntityType.PLAYER));
        userConnection.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
        userConnection.put((StorableObject)new TabCompleteTracker());
        userConnection.put((StorableObject)new BlockStorage());
        if (Via.getConfig().isServersideBlockConnections() && Via.getManager().getProviders().get(BlockConnectionProvider.class) instanceof PacketBlockConnectionProvider) {
            userConnection.put((StorableObject)new BlockConnectionStorage());
        }
    }

    public ProtocolLogger getLogger() {
        return LOGGER;
    }

    public ComponentRewriter1_13 getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        ConnectionData.init();
        RecipeData.init();
        BlockIdData.init();
        Types1_13.PARTICLE.rawFiller().reader(3, ParticleType.Readers.BLOCK).reader(20, ParticleType.Readers.DUST).reader(11, ParticleType.Readers.DUST).reader(27, ParticleType.Readers.ITEM1_13);
        if (Via.getConfig().isServersideBlockConnections() && Via.getManager().getProviders().get(BlockConnectionProvider.class) instanceof PacketBlockConnectionProvider) {
            BlockConnectionStorage.init();
        }
        super.onMappingDataLoaded();
    }

    protected void registerPackets() {
        super.registerPackets();
        WorldPacketRewriter1_13.register(this);
        this.registerClientbound(State.STATUS, (ClientboundPacketType)ClientboundStatusPackets.STATUS_RESPONSE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    String response = (String)wrapper.get(Types.STRING, 0);
                    try {
                        JsonObject json = (JsonObject)GsonUtil.getGson().fromJson(response, JsonObject.class);
                        if (json.has("favicon")) {
                            json.addProperty("favicon", json.get("favicon").getAsString().replace("\n", ""));
                        }
                        wrapper.set(Types.STRING, 0, (Object)GsonUtil.getGson().toJson((JsonElement)json));
                    }
                    catch (JsonParseException e) {
                        LOGGER.log(Level.SEVERE, "Error transforming status response", (Throwable)e);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.AWARD_STATS, wrapper -> {
            int size = (Integer)wrapper.read((Type)Types.VAR_INT);
            ArrayList<StatisticData> remappedStats = new ArrayList<StatisticData>();
            for (int i = 0; i < size; ++i) {
                String name = (String)wrapper.read(Types.STRING);
                String[] split = name.split("\\.");
                int categoryId = 0;
                int newId = -1;
                int value = (Integer)wrapper.read((Type)Types.VAR_INT);
                if (split.length == 2) {
                    categoryId = 8;
                    Integer newIdRaw = StatisticMappings1_13.CUSTOM_STATS.get(name);
                    if (newIdRaw != null) {
                        newId = newIdRaw;
                    } else {
                        LOGGER.warning("Could not find statistic mapping for " + name);
                    }
                } else if (split.length > 2) {
                    String category;
                    switch (category = split[1]) {
                        case "mineBlock": {
                            int n = 0;
                            break;
                        }
                        case "craftItem": {
                            int n = 1;
                            break;
                        }
                        case "useItem": {
                            int n = 2;
                            break;
                        }
                        case "breakItem": {
                            int n = 3;
                            break;
                        }
                        case "pickup": {
                            int n = 4;
                            break;
                        }
                        case "drop": {
                            int n = 5;
                            break;
                        }
                        case "killEntity": {
                            int n = 6;
                            break;
                        }
                        case "entityKilledBy": {
                            int n = 7;
                            break;
                        }
                        default: {
                            int n = categoryId = categoryId;
                        }
                    }
                }
                if (newId == -1) continue;
                remappedStats.add(new StatisticData(categoryId, newId, value));
            }
            wrapper.write((Type)Types.VAR_INT, (Object)remappedStats.size());
            for (StatisticData stat : remappedStats) {
                wrapper.write((Type)Types.VAR_INT, (Object)stat.categoryId());
                wrapper.write((Type)Types.VAR_INT, (Object)stat.newId());
                wrapper.write((Type)Types.VAR_INT, (Object)stat.value());
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.COMMAND_SUGGESTIONS, wrapper -> {
            int length;
            int index;
            wrapper.write((Type)Types.VAR_INT, (Object)((TabCompleteTracker)wrapper.user().get(TabCompleteTracker.class)).getTransactionId());
            String input = ((TabCompleteTracker)wrapper.user().get(TabCompleteTracker.class)).getInput();
            if (input.endsWith(" ") || input.isEmpty()) {
                index = input.length();
                length = 0;
            } else {
                int lastSpace;
                index = lastSpace = input.lastIndexOf(32) + 1;
                length = input.length() - lastSpace;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)index);
            wrapper.write((Type)Types.VAR_INT, (Object)length);
            int count = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < count; ++i) {
                String suggestion = (String)wrapper.read(Types.STRING);
                if (suggestion.startsWith("/") && index == 0) {
                    suggestion = suggestion.substring(1);
                }
                wrapper.write(Types.STRING, (Object)suggestion);
                wrapper.write(Types.OPTIONAL_COMPONENT, null);
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.handler(wrapper -> Protocol1_12_2To1_13.this.componentRewriter.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT)));
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.COOLDOWN, wrapper -> {
            int item = (Integer)wrapper.read((Type)Types.VAR_INT);
            int ticks = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.cancel();
            if (item == 383) {
                int newItem;
                for (int i = 0; i < 44 && (newItem = MAPPINGS.getItemMappings().getNewId(item << 16 | i)) != -1; ++i) {
                    PacketWrapper packet = wrapper.create((PacketType)ClientboundPackets1_13.COOLDOWN);
                    packet.write((Type)Types.VAR_INT, (Object)newItem);
                    packet.write((Type)Types.VAR_INT, (Object)ticks);
                    packet.send(Protocol1_12_2To1_13.class);
                }
            } else {
                int newItem;
                for (int i = 0; i < 16 && (newItem = MAPPINGS.getItemMappings().getNewId(IdAndData.toRawData((int)item, (int)i))) != -1; ++i) {
                    PacketWrapper packet = wrapper.create((PacketType)ClientboundPackets1_13.COOLDOWN);
                    packet.write((Type)Types.VAR_INT, (Object)newItem);
                    packet.write((Type)Types.VAR_INT, (Object)ticks);
                    packet.send(Protocol1_12_2To1_13.class);
                }
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 1);
                    if (id == 1010) {
                        wrapper.set((Type)Types.INT, 1, (Object)Protocol1_12_2To1_13.this.getMappingData().getItemMappings().getNewId(IdAndData.toRawData((int)data)));
                    } else if (id == 2001) {
                        int blockId = data & 0xFFF;
                        int blockData = data >> 12;
                        wrapper.set((Type)Types.INT, 1, (Object)WorldPacketRewriter1_13.toNewId(IdAndData.toRawData((int)blockId, (int)blockData)));
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.PLACE_GHOST_RECIPE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> wrapper.write(Types.STRING, (Object)("viaversion:legacy/" + String.valueOf(wrapper.read((Type)Types.VAR_INT)))));
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.MAP_ITEM_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int iconCount = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    for (int i = 0; i < iconCount; ++i) {
                        byte directionAndType = (Byte)wrapper.read((Type)Types.BYTE);
                        int type = (directionAndType & 0xF0) >> 4;
                        wrapper.write((Type)Types.VAR_INT, (Object)type);
                        wrapper.passthrough((Type)Types.BYTE);
                        wrapper.passthrough((Type)Types.BYTE);
                        byte direction = (byte)(directionAndType & 0xF);
                        wrapper.write((Type)Types.BYTE, (Object)direction);
                        wrapper.write(Types.OPTIONAL_COMPONENT, null);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.RECIPE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                });
                this.handler(wrapper -> {
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    for (int i = 0; i < (action == 0 ? 2 : 1); ++i) {
                        int[] ids = (int[])wrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
                        String[] stringIds = new String[ids.length];
                        for (int j = 0; j < ids.length; ++j) {
                            stringIds[j] = "viaversion:legacy/" + ids[j];
                        }
                        wrapper.write(Types.STRING_ARRAY, (Object)stringIds);
                    }
                    if (action == 0) {
                        wrapper.create((PacketType)ClientboundPackets1_13.UPDATE_RECIPES, w -> Protocol1_12_2To1_13.this.writeDeclareRecipes(w)).send(Protocol1_12_2To1_13.class);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.SET_OBJECTIVE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    byte mode = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (mode == 0 || mode == 2) {
                        String value = (String)wrapper.read(Types.STRING);
                        wrapper.write(Types.COMPONENT, (Object)ComponentUtil.legacyToJson((String)value));
                        String type = (String)wrapper.read(Types.STRING);
                        wrapper.write((Type)Types.VAR_INT, (Object)(type.equals("integer") ? 0 : 1));
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.SET_PLAYER_TEAM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    byte action = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (action == 0 || action == 2) {
                        String displayName = (String)wrapper.read(Types.STRING);
                        wrapper.write(Types.COMPONENT, (Object)ComponentUtil.legacyToJson((String)displayName));
                        String prefix = (String)wrapper.read(Types.STRING);
                        Object suffix = (String)wrapper.read(Types.STRING);
                        wrapper.passthrough((Type)Types.BYTE);
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough(Types.STRING);
                        int colour = ((Byte)wrapper.read((Type)Types.BYTE)).intValue();
                        if (colour == -1) {
                            colour = 21;
                        }
                        if (Via.getConfig().is1_13TeamColourFix()) {
                            char lastColorChar = Protocol1_12_2To1_13.this.getLastColorChar(prefix);
                            colour = ChatColorUtil.getColorOrdinal((char)lastColorChar);
                            suffix = "\u00a7" + Character.toString(lastColorChar) + (String)suffix;
                        }
                        wrapper.write((Type)Types.VAR_INT, (Object)colour);
                        wrapper.write(Types.COMPONENT, (Object)ComponentUtil.legacyToJson((String)prefix));
                        wrapper.write(Types.COMPONENT, (Object)ComponentUtil.legacyToJson((String)suffix));
                    }
                    if (action == 0 || action == 3 || action == 4) {
                        String[] names = (String[])wrapper.read(Types.STRING_ARRAY);
                        for (int i = 0; i < names.length; ++i) {
                            names[i] = Protocol1_12_2To1_13.this.rewriteTeamMemberName(names[i]);
                        }
                        wrapper.write(Types.STRING_ARRAY, (Object)names);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.SET_SCORE, wrapper -> {
            String displayName = (String)wrapper.read(Types.STRING);
            displayName = this.rewriteTeamMemberName(displayName);
            wrapper.write(Types.STRING, (Object)displayName);
        });
        this.registerClientbound(ClientboundPackets1_12_1.PLAYER_INFO, wrapper -> {
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int count = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < count; ++i) {
                JsonElement displayName;
                wrapper.passthrough(Types.UUID);
                if (action == 0) {
                    String playerName = (String)wrapper.read(Types.STRING);
                    wrapper.write(Types.STRING, (Object)this.rewriteTeamMemberName(playerName));
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    JsonElement displayName2 = (JsonElement)wrapper.passthrough(Types.OPTIONAL_COMPONENT);
                    if (displayName2 == null) continue;
                    this.componentRewriter.processText(wrapper.user(), displayName2);
                    continue;
                }
                if (action == 1 || action == 2) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                    continue;
                }
                if (action != 3 || (displayName = (JsonElement)wrapper.passthrough(Types.OPTIONAL_COMPONENT)) == null) continue;
                this.componentRewriter.processText(wrapper.user(), displayName);
            }
        });
        this.registerClientbound(ClientboundPackets1_12_1.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    this.componentRewriter.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
                    this.componentRewriter.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
                    Item icon = (Item)wrapper.read(Types.ITEM1_8);
                    this.itemRewriter.handleItemToClient(wrapper.user(), icon);
                    wrapper.write(Types.ITEM1_13, (Object)icon);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        wrapper.passthrough(Types.STRING);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                wrapper.passthrough(Types.STRING_ARRAY);
                int arrayLength = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < arrayLength; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
            }
        });
        this.cancelServerbound(State.LOGIN, ServerboundLoginPackets.CUSTOM_QUERY_ANSWER.getId());
        this.cancelServerbound(ServerboundPackets1_13.BLOCK_ENTITY_TAG_QUERY);
        this.registerServerbound(ServerboundPackets1_13.COMMAND_SUGGESTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    if (Via.getConfig().isDisable1_13AutoComplete()) {
                        wrapper.cancel();
                    }
                    int tid = (Integer)wrapper.read((Type)Types.VAR_INT);
                    ((TabCompleteTracker)wrapper.user().get(TabCompleteTracker.class)).setTransactionId(tid);
                });
                this.map(Types.STRING, (ValueTransformer)new ValueTransformer<String, String>(Types.STRING){

                    public String transform(PacketWrapper wrapper, String inputValue) {
                        ((TabCompleteTracker)wrapper.user().get(TabCompleteTracker.class)).setInput(inputValue);
                        return "/" + inputValue;
                    }
                });
                this.handler(wrapper -> {
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    BlockPosition playerLookTarget = ((PlayerLookTargetProvider)Via.getManager().getProviders().get(PlayerLookTargetProvider.class)).getPlayerLookTarget(wrapper.user());
                    wrapper.write(Types.OPTIONAL_POSITION1_8, (Object)playerLookTarget);
                    if (!wrapper.isCancelled() && Via.getConfig().get1_13TabCompleteDelay() > 0) {
                        TabCompleteTracker tracker = (TabCompleteTracker)wrapper.user().get(TabCompleteTracker.class);
                        wrapper.cancel();
                        tracker.setTimeToSend(System.currentTimeMillis() + (long)Via.getConfig().get1_13TabCompleteDelay() * 50L);
                        tracker.setLastTabComplete((String)wrapper.get(Types.STRING, 0));
                    }
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_13.EDIT_BOOK, ServerboundPackets1_12_1.CUSTOM_PAYLOAD, wrapper -> {
            Item item = (Item)wrapper.read(Types.ITEM1_13);
            boolean isSigning = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            this.itemRewriter.handleItemToServer(wrapper.user(), item);
            wrapper.write(Types.STRING, (Object)(isSigning ? "MC|BSign" : "MC|BEdit"));
            wrapper.write(Types.ITEM1_8, (Object)item);
        });
        this.cancelServerbound(ServerboundPackets1_13.ENTITY_TAG_QUERY);
        this.registerServerbound(ServerboundPackets1_13.PICK_ITEM, ServerboundPackets1_12_1.CUSTOM_PAYLOAD, wrapper -> wrapper.write(Types.STRING, (Object)"MC|PickItem"));
        this.registerServerbound(ServerboundPackets1_13.PLACE_RECIPE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    Integer id;
                    String s = (String)wrapper.read(Types.STRING);
                    if (s.length() < 19 || (id = Ints.tryParse((String)s.substring(18))) == null) {
                        wrapper.cancel();
                        return;
                    }
                    wrapper.write((Type)Types.VAR_INT, (Object)id);
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_13.RECIPE_BOOK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int type = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (type == 0) {
                        Integer id;
                        String s = (String)wrapper.read(Types.STRING);
                        if (s.length() < 19 || (id = Ints.tryParse((String)s.substring(18))) == null) {
                            wrapper.cancel();
                            return;
                        }
                        wrapper.write((Type)Types.INT, (Object)id);
                    }
                    if (type == 1) {
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.read((Type)Types.BOOLEAN);
                        wrapper.read((Type)Types.BOOLEAN);
                    }
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_13.RENAME_ITEM, ServerboundPackets1_12_1.CUSTOM_PAYLOAD, wrapper -> wrapper.write(Types.STRING, (Object)"MC|ItemName"));
        this.registerServerbound(ServerboundPackets1_13.SELECT_TRADE, ServerboundPackets1_12_1.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.create(Types.STRING, "MC|TrSel");
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
            }
        });
        this.registerServerbound(ServerboundPackets1_13.SET_BEACON, ServerboundPackets1_12_1.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.create(Types.STRING, "MC|Beacon");
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
            }
        });
        this.registerServerbound(ServerboundPackets1_13.SET_COMMAND_BLOCK, ServerboundPackets1_12_1.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.create(Types.STRING, "MC|AutoCmd");
                this.handler(POS_TO_3_INT);
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    int mode = (Integer)wrapper.read((Type)Types.VAR_INT);
                    byte flags = (Byte)wrapper.read((Type)Types.BYTE);
                    String stringMode = mode == 0 ? "SEQUENCE" : (mode == 1 ? "AUTO" : "REDSTONE");
                    wrapper.write((Type)Types.BOOLEAN, (Object)((flags & 1) != 0 ? 1 : 0));
                    wrapper.write(Types.STRING, (Object)stringMode);
                    wrapper.write((Type)Types.BOOLEAN, (Object)((flags & 2) != 0 ? 1 : 0));
                    wrapper.write((Type)Types.BOOLEAN, (Object)((flags & 4) != 0 ? 1 : 0));
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_13.SET_COMMAND_MINECART, ServerboundPackets1_12_1.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    wrapper.write(Types.STRING, (Object)"MC|AdvCmd");
                    wrapper.write((Type)Types.BYTE, (Object)1);
                });
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
            }
        });
        this.registerServerbound(ServerboundPackets1_13.SET_STRUCTURE_BLOCK, ServerboundPackets1_12_1.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.create(Types.STRING, "MC|Struct");
                this.handler(POS_TO_3_INT);
                this.map((Type)Types.VAR_INT, (ValueTransformer)new ValueTransformer<Integer, Byte>((Type)Types.BYTE){

                    public Byte transform(PacketWrapper wrapper, Integer action) {
                        return (byte)(action + 1);
                    }
                });
                this.map((Type)Types.VAR_INT, (ValueTransformer)new ValueTransformer<Integer, String>(Types.STRING){

                    public String transform(PacketWrapper wrapper, Integer mode) {
                        return mode == 0 ? "SAVE" : (mode == 1 ? "LOAD" : (mode == 2 ? "CORNER" : "DATA"));
                    }
                });
                this.map(Types.STRING);
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.VAR_INT, (ValueTransformer)new ValueTransformer<Integer, String>(Types.STRING){

                    public String transform(PacketWrapper wrapper, Integer mirror) {
                        return mirror == 0 ? "NONE" : (mirror == 1 ? "LEFT_RIGHT" : "FRONT_BACK");
                    }
                });
                this.map((Type)Types.VAR_INT, (ValueTransformer)new ValueTransformer<Integer, String>(Types.STRING){

                    public String transform(PacketWrapper wrapper, Integer rotation) {
                        return rotation == 0 ? "NONE" : (rotation == 1 ? "CLOCKWISE_90" : (rotation == 2 ? "CLOCKWISE_180" : "COUNTERCLOCKWISE_90"));
                    }
                });
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    float integrity = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
                    long seed = (Long)wrapper.read((Type)Types.VAR_LONG);
                    byte flags = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.write((Type)Types.BOOLEAN, (Object)((flags & 1) != 0 ? 1 : 0));
                    wrapper.write((Type)Types.BOOLEAN, (Object)((flags & 2) != 0 ? 1 : 0));
                    wrapper.write((Type)Types.BOOLEAN, (Object)((flags & 4) != 0 ? 1 : 0));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(integrity));
                    wrapper.write((Type)Types.VAR_LONG, (Object)seed);
                });
            }
        });
    }

    public MappingData1_13 getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_13 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_13 getEntityRewriter() {
        return this.entityRewriter;
    }

    protected String rewriteTeamMemberName(String name) {
        if (ChatColorUtil.stripColor((String)name).isEmpty()) {
            StringBuilder newName = new StringBuilder();
            for (int i = 1; i < name.length(); i += 2) {
                char colorChar = name.charAt(i);
                Character rewrite = SCOREBOARD_TEAM_NAME_REWRITE.get(Character.valueOf(colorChar));
                if (rewrite == null) {
                    rewrite = Character.valueOf(colorChar);
                }
                newName.append('\u00a7').append(rewrite);
            }
            name = newName.toString();
        }
        return name;
    }

    private void writeDeclareRecipes(PacketWrapper recipesPacket) {
        recipesPacket.write((Type)Types.VAR_INT, (Object)RecipeData.recipes.size());
        for (Map.Entry<String, RecipeData.Recipe> entry : RecipeData.recipes.entrySet()) {
            RecipeData.Recipe recipe = entry.getValue();
            recipesPacket.write(Types.STRING, (Object)entry.getKey());
            recipesPacket.write(Types.STRING, (Object)recipe.type());
            switch (recipe.type()) {
                case "crafting_shapeless": {
                    int i;
                    Item[] clone;
                    recipesPacket.write(Types.STRING, (Object)recipe.group());
                    recipesPacket.write((Type)Types.VAR_INT, (Object)recipe.ingredients().length);
                    for (DataItem[] ingredient : recipe.ingredients()) {
                        clone = new Item[ingredient.length];
                        for (i = 0; i < ingredient.length; ++i) {
                            if (ingredient[i] == null) continue;
                            clone[i] = ingredient[i].copy();
                        }
                        recipesPacket.write(Types.ITEM1_13_ARRAY, (Object)clone);
                    }
                    recipesPacket.write(Types.ITEM1_13, (Object)recipe.result().copy());
                    break;
                }
                case "crafting_shaped": {
                    int i;
                    Item[] clone;
                    recipesPacket.write((Type)Types.VAR_INT, (Object)recipe.width());
                    recipesPacket.write((Type)Types.VAR_INT, (Object)recipe.height());
                    recipesPacket.write(Types.STRING, (Object)recipe.group());
                    for (DataItem[] ingredient : recipe.ingredients()) {
                        clone = new Item[ingredient.length];
                        for (i = 0; i < ingredient.length; ++i) {
                            if (ingredient[i] == null) continue;
                            clone[i] = ingredient[i].copy();
                        }
                        recipesPacket.write(Types.ITEM1_13_ARRAY, (Object)clone);
                    }
                    recipesPacket.write(Types.ITEM1_13, (Object)recipe.result().copy());
                    break;
                }
                case "smelting": {
                    recipesPacket.write(Types.STRING, (Object)recipe.group());
                    Item[] ingredient = new Item[recipe.ingredient().length];
                    for (int i = 0; i < ingredient.length; ++i) {
                        if (recipe.ingredient()[i] == null) continue;
                        ingredient[i] = recipe.ingredient()[i].copy();
                    }
                    recipesPacket.write(Types.ITEM1_13_ARRAY, (Object)ingredient);
                    recipesPacket.write(Types.ITEM1_13, (Object)recipe.result().copy());
                    recipesPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(recipe.experience()));
                    recipesPacket.write((Type)Types.VAR_INT, (Object)recipe.cookingTime());
                }
            }
        }
    }

    public char getLastColorChar(String input) {
        int length = input.length();
        for (int index = length - 1; index > -1; --index) {
            char c;
            char section = input.charAt(index);
            if (section != '\u00a7' || index >= length - 1 || !ChatColorUtil.isColorCode((char)(c = input.charAt(index + 1))) || FORMATTING_CODES.contains(Character.valueOf(c))) continue;
            return c;
        }
        return 'r';
    }

    static {
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('0'), Character.valueOf('g'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('1'), Character.valueOf('h'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('2'), Character.valueOf('i'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('3'), Character.valueOf('j'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('4'), Character.valueOf('p'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('5'), Character.valueOf('q'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('6'), Character.valueOf('s'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('7'), Character.valueOf('t'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('8'), Character.valueOf('u'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('9'), Character.valueOf('v'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('a'), Character.valueOf('w'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('b'), Character.valueOf('x'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('c'), Character.valueOf('y'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('d'), Character.valueOf('z'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('e'), Character.valueOf('!'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('f'), Character.valueOf('?'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('k'), Character.valueOf('#'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('l'), Character.valueOf('('));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('m'), Character.valueOf(')'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('n'), Character.valueOf(':'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('o'), Character.valueOf(';'));
        SCOREBOARD_TEAM_NAME_REWRITE.put(Character.valueOf('r'), Character.valueOf('/'));
        POS_TO_3_INT = wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_8);
            wrapper.write((Type)Types.INT, (Object)position.x());
            wrapper.write((Type)Types.INT, (Object)position.y());
            wrapper.write((Type)Types.INT, (Object)position.z());
        };
        SEND_DECLARE_COMMANDS_AND_TAGS = w -> {
            w.create((PacketType)ClientboundPackets1_13.COMMANDS, wrapper -> {
                wrapper.write((Type)Types.VAR_INT, (Object)2);
                wrapper.write((Type)Types.BYTE, (Object)0);
                wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[]{1});
                wrapper.write((Type)Types.BYTE, (Object)22);
                wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)new int[0]);
                wrapper.write(Types.STRING, (Object)"args");
                wrapper.write(Types.STRING, (Object)"brigadier:string");
                wrapper.write((Type)Types.VAR_INT, (Object)2);
                wrapper.write(Types.STRING, (Object)"minecraft:ask_server");
                wrapper.write((Type)Types.VAR_INT, (Object)0);
            }).scheduleSend(Protocol1_12_2To1_13.class);
            PacketWrapper tagsPacket = w.create((PacketType)ClientboundPackets1_13.UPDATE_TAGS, wrapper -> {
                wrapper.write((Type)Types.VAR_INT, (Object)MAPPINGS.getBlockTags().size());
                for (Map.Entry<String, int[]> tag : MAPPINGS.getBlockTags().entrySet()) {
                    wrapper.write(Types.STRING, (Object)tag.getKey());
                    wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)((int[])tag.getValue().clone()));
                }
                wrapper.write((Type)Types.VAR_INT, (Object)MAPPINGS.getItemTags().size());
                for (Map.Entry<String, int[]> tag : MAPPINGS.getItemTags().entrySet()) {
                    wrapper.write(Types.STRING, (Object)tag.getKey());
                    wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)((int[])tag.getValue().clone()));
                }
                wrapper.write((Type)Types.VAR_INT, (Object)MAPPINGS.getFluidTags().size());
                for (Map.Entry<String, int[]> tag : MAPPINGS.getFluidTags().entrySet()) {
                    wrapper.write(Types.STRING, (Object)tag.getKey());
                    wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)((int[])tag.getValue().clone()));
                }
            });
            if (w.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_5)) {
                tagsPacket.send(Protocol1_12_2To1_13.class);
            } else {
                tagsPacket.scheduleSend(Protocol1_12_2To1_13.class);
            }
        };
    }
}

