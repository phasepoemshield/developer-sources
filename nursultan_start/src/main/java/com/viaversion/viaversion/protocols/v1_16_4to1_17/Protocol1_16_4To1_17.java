/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_17
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter.EntityPacketRewriter1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter.ItemPacketRewriter1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter.WorldPacketRewriter1_17
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 */
package com.viaversion.viaversion.protocols.v1_16_4to1_17;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_17;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter.ComponentRewriter1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter.EntityPacketRewriter1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter.ItemPacketRewriter1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter.WorldPacketRewriter1_17;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;

public final class Protocol1_16_4To1_17
extends AbstractProtocol<ClientboundPackets1_16_2, ClientboundPackets1_17, ServerboundPackets1_16_2, ServerboundPackets1_17> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.16.2", "1.17");
    private final EntityPacketRewriter1_17 entityRewriter = new EntityPacketRewriter1_17(this);
    private final ItemPacketRewriter1_17 itemRewriter = new ItemPacketRewriter1_17(this);
    private final ParticleRewriter<ClientboundPackets1_16_2> particleRewriter = new ParticleRewriter((Protocol)this);
    private final ComponentRewriter1_17 componentRewriter = new ComponentRewriter1_17((Protocol<ClientboundPackets1_16_2, ?, ?, ?>)this);
    private final TagRewriter<ClientboundPackets1_16_2> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_16_2> blockRewriter = BlockRewriter.for1_14((Protocol)this);

    public Protocol1_16_4To1_17() {
        super(ClientboundPackets1_16_2.class, ClientboundPackets1_17.class, ServerboundPackets1_16_2.class, ServerboundPackets1_17.class);
    }

    protected void registerPackets() {
        this.entityRewriter.register();
        this.itemRewriter.register();
        WorldPacketRewriter1_17.register((Protocol1_16_4To1_17)this);
        this.registerClientbound(ClientboundPackets1_16_2.UPDATE_TAGS, wrapper -> {
            wrapper.write((Type)Types.VAR_INT, (Object)5);
            for (RegistryType type : RegistryType.getValues()) {
                wrapper.write(Types.STRING, (Object)type.identifier());
                this.tagRewriter.handle(wrapper, type);
                if (type == RegistryType.ENTITY) break;
            }
            wrapper.write(Types.STRING, (Object)RegistryType.GAME_EVENT.identifier());
            this.tagRewriter.appendNewTags(wrapper, RegistryType.GAME_EVENT);
        });
        this.registerClientbound(ClientboundPackets1_16_2.RESOURCE_PACK, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.write((Type)Types.BOOLEAN, (Object)Via.getConfig().isForcedUse1_17ResourcePack());
            wrapper.write(Types.OPTIONAL_COMPONENT, (Object)Via.getConfig().get1_17ResourcePackPrompt());
        });
        this.registerClientbound(ClientboundPackets1_16_2.MAP_ITEM_DATA, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (size != 0) {
                wrapper.write((Type)Types.BOOLEAN, (Object)true);
                wrapper.write((Type)Types.VAR_INT, (Object)size);
            } else {
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
            }
        });
        this.registerClientbound(ClientboundPackets1_16_2.SET_TITLES, null, wrapper -> {
            ClientboundPackets1_17 packetType;
            int type = (Integer)wrapper.read((Type)Types.VAR_INT);
            switch (type) {
                case 0: {
                    packetType = ClientboundPackets1_17.SET_TITLE_TEXT;
                    break;
                }
                case 1: {
                    packetType = ClientboundPackets1_17.SET_SUBTITLE_TEXT;
                    break;
                }
                case 2: {
                    packetType = ClientboundPackets1_17.SET_ACTION_BAR_TEXT;
                    break;
                }
                case 3: {
                    packetType = ClientboundPackets1_17.SET_TITLES_ANIMATION;
                    break;
                }
                case 4: {
                    packetType = ClientboundPackets1_17.CLEAR_TITLES;
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    break;
                }
                case 5: {
                    packetType = ClientboundPackets1_17.CLEAR_TITLES;
                    wrapper.write((Type)Types.BOOLEAN, (Object)true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid title type received: " + type);
                }
            }
            if (type < 3) {
                this.componentRewriter.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
            }
            wrapper.setPacketType((PacketType)packetType);
        });
        this.registerClientbound(ClientboundPackets1_16_2.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.INT))));
            }
        });
        this.registerClientbound(ClientboundPackets1_16_2.SET_DEFAULT_SPAWN_POSITION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14);
                this.handler(wrapper -> wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f)));
            }
        });
        this.registerServerbound(ServerboundPackets1_17.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.read((Type)Types.BOOLEAN);
            }
        });
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_17.initialize((Protocol)this);
        ParticleType.Fillers.fill1_17((Protocol)this, (ParticleType)Types1_17.PARTICLE);
        this.tagRewriter.addEmptyTags(RegistryType.ITEM, new String[]{"minecraft:axolotl_tempt_items", "minecraft:candles", "minecraft:cluster_max_harvestables", "minecraft:copper_ores", "minecraft:freeze_immune_wearables", "minecraft:occludes_vibration_signals"});
        this.tagRewriter.addEmptyTags(RegistryType.BLOCK, new String[]{"minecraft:candle_cakes", "minecraft:candles", "minecraft:cave_vines", "minecraft:copper_ores", "minecraft:crystal_sound_blocks", "minecraft:deepslate_ore_replaceables", "minecraft:dripstone_replaceable_blocks", "minecraft:geode_invalid_blocks", "minecraft:lush_ground_replaceable", "minecraft:moss_replaceable", "minecraft:occludes_vibration_signals", "minecraft:small_dripleaf_placeable"});
        this.tagRewriter.addEmptyTags(RegistryType.ENTITY, new String[]{"minecraft:axolotl_always_hostiles", "minecraft:axolotl_hunt_targets", "minecraft:freeze_hurts_extra_types", "minecraft:freeze_immune_entity_types", "minecraft:powder_snow_walkable_mobs"});
        this.tagRewriter.addEmptyTags(RegistryType.GAME_EVENT, new String[]{"minecraft:ignore_vibrations_sneaking", "minecraft:vibrations"});
        super.onMappingDataLoaded();
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_17.PLAYER));
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter1_17 getEntityRewriter() {
        return this.entityRewriter;
    }

    public ItemPacketRewriter1_17 getItemRewriter() {
        return this.itemRewriter;
    }

    public BlockRewriter<ClientboundPackets1_16_2> getBlockRewriter() {
        return this.blockRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_16_2> getParticleRewriter() {
        return this.particleRewriter;
    }

    public ComponentRewriter1_17 getComponentRewriter() {
        return this.componentRewriter;
    }

    public TagRewriter<ClientboundPackets1_16_2> getTagRewriter() {
        return this.tagRewriter;
    }
}

