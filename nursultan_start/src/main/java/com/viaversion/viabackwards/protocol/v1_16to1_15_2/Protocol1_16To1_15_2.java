/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.PlayerAttributesStorage
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.PlayerSneakStorage
 *  com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.WorldNameTracker
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ClientboundStatusPackets
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.GsonUtil
 */
package com.viaversion.viabackwards.protocol.v1_16to1_15_2;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.data.BackwardsMappingData1_16;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.rewriter.BlockItemPacketRewriter1_16;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.rewriter.CommandRewriter1_16;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.rewriter.EntityPacketRewriter1_16;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.rewriter.TranslatableRewriter1_16;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.PlayerAttributesStorage;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.PlayerSneakStorage;
import com.viaversion.viabackwards.protocol.v1_16to1_15_2.storage.WorldNameTracker;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ClientboundStatusPackets;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.GsonUtil;
import java.util.UUID;

public class Protocol1_16To1_15_2
extends BackwardsProtocol<ClientboundPackets1_16, ClientboundPackets1_15, ServerboundPackets1_16, ServerboundPackets1_14> {
    public static final BackwardsMappingData1_16 MAPPINGS = new BackwardsMappingData1_16();
    private final EntityPacketRewriter1_16 entityRewriter = new EntityPacketRewriter1_16(this);
    private final BlockItemPacketRewriter1_16 blockItemPackets = new BlockItemPacketRewriter1_16(this);
    private final ParticleRewriter<ClientboundPackets1_16> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TranslatableRewriter1_16 translatableRewriter = new TranslatableRewriter1_16(this);
    private final TagRewriter<ClientboundPackets1_16> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_16> blockRewriter = BlockRewriter.for1_14((Protocol)this);

    public Protocol1_16To1_15_2() {
        super(ClientboundPackets1_16.class, ClientboundPackets1_15.class, ServerboundPackets1_16.class, ServerboundPackets1_14.class);
    }

    public void init(UserConnection user) {
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_16.PLAYER));
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
        user.put((StorableObject)new PlayerSneakStorage());
        user.put((StorableObject)new WorldNameTracker());
        user.put((StorableObject)new PlayerAttributesStorage());
    }

    public TranslatableRewriter1_16 getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_16> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        new CommandRewriter1_16(this).registerDeclareCommands((ClientboundPacketType)ClientboundPackets1_16.COMMANDS);
        this.registerClientbound(State.STATUS, (ClientboundPacketType)ClientboundStatusPackets.STATUS_RESPONSE, wrapper -> {
            String original = (String)wrapper.passthrough(Types.STRING);
            JsonObject object = (JsonObject)GsonUtil.getGson().fromJson(original, JsonObject.class);
            JsonElement description = object.get("description");
            if (description == null) {
                return;
            }
            this.translatableRewriter.processText(wrapper.user(), description);
            wrapper.set(Types.STRING, 0, (Object)object.toString());
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_16.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> Protocol1_16To1_15_2.this.translatableRewriter.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT)));
                this.map((Type)Types.BYTE);
                this.read(Types.UUID);
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_16.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> Protocol1_16To1_15_2.this.translatableRewriter.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT)));
                this.handler(wrapper -> {
                    int windowType = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (windowType == 20) {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)7);
                    } else if (windowType > 20) {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)(--windowType));
                    }
                });
            }
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, wrapper -> {
            UUID uuid = (UUID)wrapper.read(Types.UUID);
            wrapper.write(Types.STRING, (Object)uuid.toString());
        });
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets1_16.UPDATE_TAGS, RegistryType.ENTITY);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_14.PLAYER_COMMAND, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action == 0) {
                ((PlayerSneakStorage)wrapper.user().get(PlayerSneakStorage.class)).setSneaking(true);
            } else if (action == 1) {
                ((PlayerSneakStorage)wrapper.user().get(PlayerSneakStorage.class)).setSneaking(false);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_14.INTERACT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action == 0 || action == 2) {
                if (action == 2) {
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                wrapper.passthrough((Type)Types.VAR_INT);
            }
            wrapper.write((Type)Types.BOOLEAN, (Object)((PlayerSneakStorage)wrapper.user().get(PlayerSneakStorage.class)).isSneaking());
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_14.PLAYER_ABILITIES, wrapper -> {
            byte flags = (Byte)wrapper.read((Type)Types.BYTE);
            flags = (byte)(flags & 2);
            wrapper.write((Type)Types.BYTE, (Object)flags);
            wrapper.read((Type)Types.FLOAT);
            wrapper.read((Type)Types.FLOAT);
        });
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_14.SET_JIGSAW_BLOCK);
    }

    public TagRewriter<ClientboundPackets1_16> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_16> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData1_16 getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_16 getItemRewriter() {
        return this.blockItemPackets;
    }

    public EntityPacketRewriter1_16 getEntityRewriter() {
        return this.entityRewriter;
    }
}

