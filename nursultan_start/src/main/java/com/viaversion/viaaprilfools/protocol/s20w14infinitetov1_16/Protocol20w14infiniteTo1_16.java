/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.Protocol1_15_2To1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.provider.PlayerAbilitiesProvider
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.rewriter.StatisticsRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 */
package com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16;

import com.viaversion.viaaprilfools.api.data.VAFBackwardsMappingData;
import com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.packet.ClientboundPackets20w14infinite;
import com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.packet.ServerboundPackets20w14infinite;
import com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.rewriter.BlockItemPacketRewriter20w14infinite;
import com.viaversion.viaaprilfools.protocol.s20w14infinitetov1_16.rewriter.EntityPacketRewriter20w14infinite;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.SoundRewriter;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.Protocol1_15_2To1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.provider.PlayerAbilitiesProvider;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.rewriter.StatisticsRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import java.util.UUID;

public final class Protocol20w14infiniteTo1_16
extends BackwardsProtocol<ClientboundPackets20w14infinite, ClientboundPackets1_16, ServerboundPackets20w14infinite, ServerboundPackets1_16> {
    public static final BackwardsMappingData MAPPINGS = new VAFBackwardsMappingData("20w14infinite", "1.16", Protocol1_15_2To1_16.class);
    private static final UUID ZERO_UUID = new UUID(0L, 0L);
    private final BlockItemPacketRewriter20w14infinite itemRewriter = new BlockItemPacketRewriter20w14infinite(this);
    private final ParticleRewriter<ClientboundPackets20w14infinite> particleRewriter = new ParticleRewriter((Protocol)this);
    private final EntityPacketRewriter20w14infinite entityRewriter = new EntityPacketRewriter20w14infinite(this);
    private final TagRewriter<ClientboundPackets20w14infinite> tagRewriter = new TagRewriter((Protocol)this);

    public Protocol20w14infiniteTo1_16() {
        super(ClientboundPackets20w14infinite.class, ClientboundPackets1_16.class, ServerboundPackets20w14infinite.class, ServerboundPackets1_16.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_16.PLAYER));
    }

    protected void onMappingDataLoaded() {
        this.tagRewriter.addEmptyTags(RegistryType.ITEM, new String[]{"minecraft:crimson_stems", "minecraft:non_flammable_wood", "minecraft:piglin_loved", "minecraft:piglin_repellents", "minecraft:soul_fire_base_blocks", "minecraft:warped_stems"});
        this.tagRewriter.addEmptyTags(RegistryType.BLOCK, new String[]{"minecraft:crimson_stems", "minecraft:guarded_by_piglins", "minecraft:hoglin_repellents", "minecraft:non_flammable_wood", "minecraft:nylium", "minecraft:piglin_repellents", "minecraft:soul_fire_base_blocks", "minecraft:soul_speed_blocks", "minecraft:strider_warm_blocks", "minecraft:warped_stems"});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPackets20w14infinite> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.particleRewriter.registerLevelParticles1_13((ClientboundPacketType)ClientboundPackets20w14infinite.LEVEL_PARTICLES, (Type)Types.DOUBLE);
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets20w14infinite.UPDATE_TAGS, RegistryType.ENTITY);
        SoundRewriter<ClientboundPackets20w14infinite> soundRewriter = new SoundRewriter<ClientboundPackets20w14infinite>(this);
        soundRewriter.registerSound(ClientboundPackets20w14infinite.SOUND);
        soundRewriter.registerSound(ClientboundPackets20w14infinite.SOUND_ENTITY);
        soundRewriter.registerNamedSound(ClientboundPackets20w14infinite.CUSTOM_SOUND);
        soundRewriter.registerStopSound(ClientboundPackets20w14infinite.STOP_SOUND);
        new StatisticsRewriter((Protocol)this).register((ClientboundPacketType)ClientboundPackets20w14infinite.AWARD_STATS);
        new RecipeRewriter((Protocol)this).register((ClientboundPacketType)ClientboundPackets20w14infinite.UPDATE_RECIPES);
        this.registerClientbound(ClientboundPackets20w14infinite.CHAT, wrapper -> {
            wrapper.passthrough(Types.COMPONENT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.write(Types.UUID, (Object)ZERO_UUID);
        });
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_16.JIGSAW_GENERATE);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_16.INTERACT, wrapper -> {
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
            wrapper.read((Type)Types.BOOLEAN);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_16.PLAYER_ABILITIES, wrapper -> {
            wrapper.passthrough((Type)Types.BYTE);
            PlayerAbilitiesProvider playerAbilities = (PlayerAbilitiesProvider)Via.getManager().getProviders().get(PlayerAbilitiesProvider.class);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(playerAbilities.getFlyingSpeed(wrapper.user())));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(playerAbilities.getWalkingSpeed(wrapper.user())));
        });
    }

    @Override
    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter20w14infinite getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter20w14infinite getEntityRewriter() {
        return this.entityRewriter;
    }
}

