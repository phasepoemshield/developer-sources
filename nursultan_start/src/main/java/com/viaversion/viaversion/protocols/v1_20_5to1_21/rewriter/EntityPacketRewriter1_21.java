/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.PaintingVariant
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Enchantments1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.EfficiencyAttributeStorage
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.PlayerPositionStorage
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.WolfVariantRegistryMarker
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_20_5to1_21.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.PaintingVariant;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Enchantments1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.Protocol1_20_5To1_21;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.data.Paintings1_20_5;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.EfficiencyAttributeStorage;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.PlayerPositionStorage;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.storage.WolfVariantRegistryMarker;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.rewriter.RegistryDataRewriter;
import com.viaversion.viaversion.util.Key;

public final class EntityPacketRewriter1_21
extends EntityRewriter<ClientboundPacket1_20_5, Protocol1_20_5To1_21> {
    public EntityPacketRewriter1_21(Protocol1_20_5To1_21 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.dataTypeMapper().skip(((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).wolfVariantType).skip(((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).paintingVariantType).register();
        this.filter().dataType(((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).paintingVariantType).handler((event, data) -> {
            int variant = (Integer)data.value();
            data.setTypeAndValue(((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).paintingVariantType, (Object)Holder.of((int)variant));
        });
        this.filter().dataType(((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).wolfVariantType).handler((event, data) -> {
            int variant = (Integer)data.value();
            data.setTypeAndValue(((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).wolfVariantType, (Object)Holder.of((int)variant));
        });
        this.registerEntityDataTypeHandler(((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).itemType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).blockStateType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).optionalBlockStateType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).particleType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).particlesType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).componentType, ((EntityDataTypes1_21)VersionedTypes.V1_21.entityDataTypes).optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_20_5.ABSTRACT_MINECART, 11);
    }

    public void registerPackets() {
        RegistryDataRewriter registryDataRewriter = new RegistryDataRewriter(this.protocol);
        CompoundTag campfireDamageType = new CompoundTag();
        campfireDamageType.putString("scaling", "when_caused_by_living_non_player");
        campfireDamageType.putString("message_id", "inFire");
        campfireDamageType.putFloat("exhaustion", 0.1f);
        registryDataRewriter.addEntries("damage_type", new RegistryEntry[]{new RegistryEntry("minecraft:campfire", (Tag)campfireDamageType)});
        ((Protocol1_20_5To1_21)this.protocol).registerClientbound(ClientboundConfigurationPackets1_20_5.REGISTRY_DATA, wrapper -> {
            String registryKey = Key.stripMinecraftNamespace((String)((String)wrapper.passthrough(Types.STRING)));
            RegistryEntry[] entries = (RegistryEntry[])wrapper.read(Types.REGISTRY_ENTRY_ARRAY);
            entries = registryDataRewriter.handle(wrapper.user(), registryKey, entries);
            wrapper.write(Types.REGISTRY_ENTRY_ARRAY, (Object)entries);
            if (registryKey.equals("wolf_variant")) {
                wrapper.user().put((StorableObject)new WolfVariantRegistryMarker());
            }
        });
        ((Protocol1_20_5To1_21)this.protocol).appendClientbound(ClientboundConfigurationPackets1_20_5.FINISH_CONFIGURATION, wrapper -> {
            PacketWrapper paintingRegistryPacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_20_5.REGISTRY_DATA);
            paintingRegistryPacket.write(Types.STRING, (Object)"minecraft:painting_variant");
            RegistryEntry[] paintingsRegistry = new RegistryEntry[Paintings1_20_5.PAINTINGS.length];
            for (int i = 0; i < Paintings1_20_5.PAINTINGS.length; ++i) {
                PaintingVariant painting = Paintings1_20_5.PAINTINGS[i];
                CompoundTag tag = new CompoundTag();
                tag.putInt("width", painting.width());
                tag.putInt("height", painting.height());
                tag.putString("asset_id", painting.assetId());
                paintingsRegistry[i] = new RegistryEntry(painting.assetId(), (Tag)tag);
            }
            paintingRegistryPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)paintingsRegistry);
            paintingRegistryPacket.send(Protocol1_20_5To1_21.class);
            PacketWrapper enchantmentRegistryPacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_20_5.REGISTRY_DATA);
            enchantmentRegistryPacket.write(Types.STRING, (Object)"minecraft:enchantment");
            RegistryEntry[] enchantmentRegistry = new RegistryEntry[Enchantments1_20_5.ENCHANTMENTS.size()];
            for (int i = 0; i < Enchantments1_20_5.ENCHANTMENTS.size(); ++i) {
                String key = Enchantments1_20_5.idToKey((int)i);
                CompoundTag tag = ((Protocol1_20_5To1_21)this.protocol).getMappingData().enchantment(i);
                enchantmentRegistry[i] = new RegistryEntry(key, (Tag)tag);
            }
            enchantmentRegistryPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)enchantmentRegistry);
            enchantmentRegistryPacket.send(Protocol1_20_5To1_21.class);
            PacketWrapper jukeboxSongsPacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_20_5.REGISTRY_DATA);
            jukeboxSongsPacket.write(Types.STRING, (Object)"minecraft:jukebox_song");
            jukeboxSongsPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)((Protocol1_20_5To1_21)this.protocol).getMappingData().jukeboxSongs());
            jukeboxSongsPacket.send(Protocol1_20_5To1_21.class);
            if (!wrapper.user().has(WolfVariantRegistryMarker.class)) {
                EntityPacketRewriter1_21.createDefaultWolfVariantRegistryDataPacket(wrapper).send(Protocol1_20_5To1_21.class);
            }
        });
        ((Protocol1_20_5To1_21)this.protocol).appendClientbound(ClientboundPackets1_20_5.LOGIN, wrapper -> ((EfficiencyAttributeStorage)wrapper.user().get(EfficiencyAttributeStorage.class)).onLoginSent(((Integer)wrapper.get((Type)Types.INT, 0)).intValue(), wrapper.user()));
        ((Protocol1_20_5To1_21)this.protocol).appendClientbound(ClientboundPackets1_20_5.RESPAWN, wrapper -> {
            ((EfficiencyAttributeStorage)wrapper.user().get(EfficiencyAttributeStorage.class)).onRespawn(wrapper.user());
            wrapper.user().put((StorableObject)new PlayerPositionStorage());
        });
        ((Protocol1_20_5To1_21)this.protocol).registerServerbound(ServerboundPackets1_20_5.MOVE_PLAYER_POS, wrapper -> {
            if (Via.getConfig().fix1_21PlacementRotation()) {
                this.storePosition(wrapper);
                this.storeOnGround(wrapper);
            }
        });
        ((Protocol1_20_5To1_21)this.protocol).registerServerbound(ServerboundPackets1_20_5.MOVE_PLAYER_ROT, wrapper -> {
            if (Via.getConfig().fix1_21PlacementRotation()) {
                wrapper.passthrough((Type)Types.FLOAT);
                wrapper.passthrough((Type)Types.FLOAT);
                this.storeOnGround(wrapper);
            }
        });
        ((Protocol1_20_5To1_21)this.protocol).registerServerbound(ServerboundPackets1_20_5.MOVE_PLAYER_POS_ROT, wrapper -> {
            if (Via.getConfig().fix1_21PlacementRotation()) {
                this.storePosition(wrapper);
                wrapper.passthrough((Type)Types.FLOAT);
                wrapper.passthrough((Type)Types.FLOAT);
                this.storeOnGround(wrapper);
            }
        });
        ((Protocol1_20_5To1_21)this.protocol).registerServerbound(ServerboundPackets1_20_5.MOVE_PLAYER_STATUS_ONLY, wrapper -> {
            if (Via.getConfig().fix1_21PlacementRotation()) {
                this.storeOnGround(wrapper);
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_20_5.getTypeFromId((int)type);
    }

    private static RegistryEntry[] getDefaultWolfVariantRegistryEntries() {
        CompoundTag paleWolfVariant = new CompoundTag();
        paleWolfVariant.putString("wild_texture", "minecraft:entity/wolf/wolf");
        paleWolfVariant.putString("angry_texture", "minecraft:entity/wolf/wolf_angry");
        paleWolfVariant.put("biomes", (Tag)new ListTag(StringTag.class));
        paleWolfVariant.putString("tame_texture", "minecraft:entity/wolf/wolf_tame");
        return new RegistryEntry[]{new RegistryEntry("minecraft:pale", (Tag)paleWolfVariant)};
    }

    private static PacketWrapper createDefaultWolfVariantRegistryDataPacket(PacketWrapper wrapper) {
        PacketWrapper wolfVariantPacket = wrapper.create((PacketType)ClientboundConfigurationPackets1_20_5.REGISTRY_DATA);
        wolfVariantPacket.write(Types.STRING, (Object)"minecraft:wolf_variant");
        wolfVariantPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)EntityPacketRewriter1_21.getDefaultWolfVariantRegistryEntries());
        return wolfVariantPacket;
    }

    private void storePosition(PacketWrapper wrapper) {
        double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
        double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
        double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
        ((PlayerPositionStorage)wrapper.user().get(PlayerPositionStorage.class)).setPosition(x, y, z);
    }

    private void storeOnGround(PacketWrapper wrapper) {
        boolean onGround = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
        ((PlayerPositionStorage)wrapper.user().get(PlayerPositionStorage.class)).setOnGround(onGround);
    }
}

