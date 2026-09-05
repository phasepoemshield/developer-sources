/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.storage.HashedItemConverterStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_2
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimPattern
 *  com.viaversion.viaversion.api.minecraft.item.data.ChatType
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Limit
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_21_5to1_21_4;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter.BlockItemPacketRewriter1_21_5;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter.BlockPacketRewriter1_21_5;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter.ComponentRewriter1_21_5;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter.EntityPacketRewriter1_21_5;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter.RegistryDataRewriter1_21_5;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.storage.HashedItemConverterStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_2;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimPattern;
import com.viaversion.viaversion.api.minecraft.item.data.ChatType;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter.RecipeDisplayRewriter1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Limit;
import com.viaversion.viaversion.util.ProtocolUtil;

public final class Protocol1_21_5To1_21_4
extends BackwardsProtocol<ClientboundPacket1_21_5, ClientboundPacket1_21_2, ServerboundPacket1_21_5, ServerboundPacket1_21_4> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.21.5", "1.21.4", Protocol1_21_4To1_21_5.class);
    private final EntityPacketRewriter1_21_5 entityRewriter = new EntityPacketRewriter1_21_5(this);
    private final BlockItemPacketRewriter1_21_5 itemRewriter = new BlockItemPacketRewriter1_21_5(this);
    private final ParticleRewriter<ClientboundPacket1_21_5> particleRewriter = new ParticleRewriter<ClientboundPacket1_21_5>((Protocol)this){

        public void rewriteParticle(UserConnection connection, Particle particle) {
            if (particle.id() == MAPPINGS.getParticleMappings().id("tinted_leaves")) {
                particle.getArguments().clear();
            }
            super.rewriteParticle(connection, particle);
        }
    };
    private final ComponentRewriter1_21_5 translatableRewriter = new ComponentRewriter1_21_5(this);
    private final TagRewriter<ClientboundPacket1_21_5> tagRewriter = new TagRewriter((Protocol)this);
    private final RecipeDisplayRewriter<ClientboundPacket1_21_5> recipeRewriter = new RecipeDisplayRewriter1_21_5<ClientboundPacket1_21_5>((Protocol)this){

        protected void handleSmithingTrimSlotDisplay(PacketWrapper wrapper) {
            this.handleSlotDisplay(wrapper);
            this.handleSlotDisplay(wrapper);
            wrapper.read((Type)ArmorTrimPattern.TYPE1_21_5);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
        }
    };
    private final BackwardsRegistryRewriter registryDataRewriter = new RegistryDataRewriter1_21_5(this);
    private final BlockRewriter<ClientboundPacket1_21_5> blockRewriter = new BlockPacketRewriter1_21_5(this);

    public Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> types() {
        return VersionedTypes.V1_21_5;
    }

    public Protocol1_21_5To1_21_4() {
        super(ClientboundPacket1_21_5.class, ClientboundPacket1_21_2.class, ServerboundPacket1_21_5.class, ServerboundPacket1_21_4.class);
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_21_4.PLAYER));
        user.put((StorableObject)new HashedItemConverterStorage((Protocol)this));
    }

    public BackwardsRegistryRewriter getRegistryDataRewriter() {
        return this.registryDataRewriter;
    }

    public ComponentRewriter1_21_5 getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_21_5> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_21_5, ClientboundPacket1_21_2, ServerboundPacket1_21_5, ServerboundPacket1_21_4> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_5.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_2.class, ClientboundConfigurationPackets1_21.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_5.class, ServerboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_4.class, ServerboundConfigurationPackets1_20_5.class}));
    }

    public Types1_20_5<StructuredDataKeys1_21_2, EntityDataTypes1_21_2> mappedTypes() {
        return VersionedTypes.V1_21_4;
    }

    protected void registerPackets() {
        super.registerPackets();
        CommandRewriter1_19_4<ClientboundPacket1_21_5> commandRewriter = new CommandRewriter1_19_4<ClientboundPacket1_21_5>((Protocol)this){

            public void handleArgument(PacketWrapper wrapper, String argumentType) {
                if (argumentType.equals("minecraft:resource")) {
                    String resource = (String)wrapper.read(Types.STRING);
                    if (Key.equals((String)resource, (String)"test_instance")) {
                        resource = "minecraft:item";
                    }
                    wrapper.write(Types.STRING, (Object)resource);
                } else if (argumentType.equals("minecraft:resource_selector")) {
                    wrapper.read(Types.STRING);
                    wrapper.write((Type)Types.VAR_INT, (Object)1);
                } else {
                    super.handleArgument(wrapper, argumentType);
                }
            }
        };
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_5.COMMANDS, arg_0 -> ((CommandRewriter1_19_4)commandRewriter).handle1_19(arg_0));
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_21_5.PLAYER_CHAT, wrapper -> {
            wrapper.read((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.OPTIONAL_SIGNATURE_BYTES);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.LONG);
            int lastSeen = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < lastSeen; ++i) {
                int index = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                if (index != 0) continue;
                wrapper.passthrough((Type)Types.SIGNATURE_BYTES);
            }
            this.translatableRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
            int filterMaskType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (filterMaskType == 2) {
                wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            }
            wrapper.passthrough((Type)ChatType.TYPE);
            this.translatableRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_TAG));
            this.translatableRewriter.processTag(wrapper.user(), (Tag)wrapper.passthrough(Types.TRUSTED_OPTIONAL_TAG));
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_4.CHAT_COMMAND_SIGNED, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.LONG);
            int signatures = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)8);
            for (int i = 0; i < signatures; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough((Type)Types.SIGNATURE_BYTES);
            }
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.ACKNOWLEDGED_BIT_SET);
            wrapper.write((Type)Types.BYTE, (Object)0);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_21_4.CHAT, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.OPTIONAL_SIGNATURE_BYTES);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.ACKNOWLEDGED_BIT_SET);
            wrapper.write((Type)Types.BYTE, (Object)0);
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_21_5.TEST_INSTANCE_BLOCK_STATUS);
    }

    public TagRewriter<ClientboundPacket1_21_5> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_21_5> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_21_5 getItemRewriter() {
        return this.itemRewriter;
    }

    public RecipeDisplayRewriter<ClientboundPacket1_21_5> getRecipeRewriter() {
        return this.recipeRewriter;
    }

    public EntityPacketRewriter1_21_5 getEntityRewriter() {
        return this.entityRewriter;
    }
}

