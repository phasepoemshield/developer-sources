/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13to1_13_1.Protocol1_13To1_13_1
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viabackwards.protocol.v1_13_1to1_13;

import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_13_1to1_13.rewriter.CommandRewriter1_13_1;
import com.viaversion.viabackwards.protocol.v1_13_1to1_13.rewriter.EntityPacketRewriter1_13_1;
import com.viaversion.viabackwards.protocol.v1_13_1to1_13.rewriter.ItemPacketRewriter1_13_1;
import com.viaversion.viabackwards.protocol.v1_13_1to1_13.rewriter.WorldPacketRewriter1_13_1;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13to1_13_1.Protocol1_13To1_13_1;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.ComponentUtil;

public class Protocol1_13_1To1_13
extends BackwardsProtocol<ClientboundPackets1_13, ClientboundPackets1_13, ServerboundPackets1_13, ServerboundPackets1_13> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.13.2", "1.13", Protocol1_13To1_13_1.class);
    private final EntityPacketRewriter1_13_1 entityRewriter = new EntityPacketRewriter1_13_1(this);
    private final ItemPacketRewriter1_13_1 itemRewriter = new ItemPacketRewriter1_13_1(this);
    private final ParticleRewriter<ClientboundPackets1_13> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_13> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_13> tagRewriter = new TagRewriter((Protocol)this);

    public Protocol1_13_1To1_13() {
        super(ClientboundPackets1_13.class, ClientboundPackets1_13.class, ServerboundPackets1_13.class, ServerboundPackets1_13.class);
    }

    public void init(UserConnection user) {
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_13.EntityType.PLAYER));
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_13> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_13> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        WorldPacketRewriter1_13_1.register(this);
        new CommandRewriter1_13_1(this).registerDeclareCommands((ClientboundPacketType)ClientboundPackets1_13.COMMANDS);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_13.COMMAND_SUGGESTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.STRING, (ValueTransformer)new ValueTransformer<String, String>(Types.STRING){

                    public String transform(PacketWrapper wrapper, String inputValue) {
                        return !inputValue.startsWith("/") ? "/" + inputValue : inputValue;
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_13.EDIT_BOOK, wrapper -> {
            Item item = this.itemRewriter.handleItemToServer(wrapper.user(), (Item)wrapper.read(Types.ITEM1_13));
            wrapper.write(Types.ITEM1_13, (Object)item);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    JsonElement title = (JsonElement)wrapper.passthrough(Types.COMPONENT);
                    Protocol1_13_1To1_13.this.translatableRewriter.processText(wrapper.user(), title);
                    if (ViaBackwards.getConfig().fix1_13FormattedInventoryTitle()) {
                        if (title.isJsonObject() && title.getAsJsonObject().size() == 1 && title.getAsJsonObject().has("translate")) {
                            return;
                        }
                        JsonObject legacyComponent = new JsonObject();
                        legacyComponent.addProperty("text", ComponentUtil.jsonToLegacy((JsonElement)title));
                        wrapper.set(Types.COMPONENT, 0, (Object)legacyComponent);
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.COMMAND_SUGGESTIONS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int start = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    wrapper.set((Type)Types.VAR_INT, 1, (Object)(start - 1));
                    int count = (Integer)wrapper.get((Type)Types.VAR_INT, 3);
                    for (int i = 0; i < count; ++i) {
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough(Types.OPTIONAL_COMPONENT);
                    }
                });
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_13.BOSS_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (action == 0 || action == 3) {
                        Protocol1_13_1To1_13.this.translatableRewriter.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
                        if (action == 0) {
                            wrapper.passthrough((Type)Types.FLOAT);
                            wrapper.passthrough((Type)Types.VAR_INT);
                            wrapper.passthrough((Type)Types.VAR_INT);
                            short flags = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
                            if ((flags & 4) != 0) {
                                flags = (short)(flags | 2);
                            }
                            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)flags);
                        }
                    }
                });
            }
        });
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets1_13.UPDATE_TAGS, RegistryType.ITEM);
    }

    public TagRewriter<ClientboundPackets1_13> getTagRewriter() {
        return this.tagRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_13_1 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_13_1 getEntityRewriter() {
        return this.entityRewriter;
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_13> translatableRewriter() {
        return this.translatableRewriter;
    }
}

