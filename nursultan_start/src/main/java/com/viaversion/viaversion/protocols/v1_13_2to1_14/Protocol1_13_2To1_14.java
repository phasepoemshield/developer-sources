/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_13_2
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.storage.EntityTracker1_14
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ProtocolLogger
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_13_2to1_14;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_13_2;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.data.MappingData1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter.ComponentRewriter1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter.EntityPacketRewriter1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter.ItemPacketRewriter1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter.PlayerPacketRewriter1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.rewriter.WorldPacketRewriter1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.storage.EntityTracker1_14;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.CommandRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ProtocolLogger;
import org.checkerframework.checker.nullness.qual.Nullable;

public class Protocol1_13_2To1_14
extends AbstractProtocol<ClientboundPackets1_13, ClientboundPackets1_14, ServerboundPackets1_13, ServerboundPackets1_14> {
    public static final MappingData1_14 MAPPINGS = new MappingData1_14();
    public static final ProtocolLogger LOGGER = new ProtocolLogger(Protocol1_13_2To1_14.class);
    private final EntityPacketRewriter1_14 entityRewriter = new EntityPacketRewriter1_14(this);
    private final ItemPacketRewriter1_14 itemRewriter = new ItemPacketRewriter1_14(this);
    private final ParticleRewriter<ClientboundPackets1_13> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPackets1_13> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_13> blockRewriter = BlockRewriter.for1_14((Protocol)this);

    public Protocol1_13_2To1_14() {
        super(ClientboundPackets1_13.class, ClientboundPackets1_14.class, ServerboundPackets1_13.class, ServerboundPackets1_14.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTracker1_14(userConnection));
        userConnection.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    public ProtocolLogger getLogger() {
        return LOGGER;
    }

    protected void onMappingDataLoaded() {
        WorldPacketRewriter1_14.air = MAPPINGS.getBlockStateMappings().getNewId(0);
        WorldPacketRewriter1_14.voidAir = MAPPINGS.getBlockStateMappings().getNewId(8591);
        WorldPacketRewriter1_14.caveAir = MAPPINGS.getBlockStateMappings().getNewId(8592);
        EntityTypes1_14.initialize((Protocol)this);
        ParticleType.Fillers.fill1_13_2((Protocol)this, (ParticleType)Types1_13_2.PARTICLE, (boolean)false);
        ParticleType.Fillers.fill1_13_2((Protocol)this, (ParticleType)Types1_14.PARTICLE, (boolean)true);
        this.tagRewriter.addEmptyTag(RegistryType.BLOCK, "bamboo_plantable_on");
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPackets1_13> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        WorldPacketRewriter1_14.register(this);
        PlayerPacketRewriter1_14.register(this);
        ComponentRewriter1_14 componentRewriter = new ComponentRewriter1_14(this);
        componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_13.CHAT);
        CommandRewriter<ClientboundPackets1_13> commandRewriter = new CommandRewriter<ClientboundPackets1_13>((Protocol)this){

            public @Nullable String handleArgumentType(String argumentType) {
                if (argumentType.equals("minecraft:nbt")) {
                    return "minecraft:nbt_compound_tag";
                }
                return super.handleArgumentType(argumentType);
            }
        };
        commandRewriter.registerDeclareCommands((ClientboundPacketType)ClientboundPackets1_13.COMMANDS);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.UPDATE_TAGS, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.handler(Protocol1_13_2To1_14.this.tagRewriter.getHandler(RegistryType.FLUID));
                this.handler(wrapper -> Protocol1_13_2To1_14.this.tagRewriter.appendNewTags(wrapper, RegistryType.ENTITY));
            }
        });
        this.cancelServerbound(ServerboundPackets1_14.CHANGE_DIFFICULTY);
        this.cancelServerbound(ServerboundPackets1_14.LOCK_DIFFICULTY);
        this.cancelServerbound(ServerboundPackets1_14.SET_JIGSAW_BLOCK);
    }

    public TagRewriter<ClientboundPackets1_13> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_13> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData1_14 getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_14 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_14 getEntityRewriter() {
        return this.entityRewriter;
    }
}

