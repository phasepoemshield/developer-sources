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
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.DimensionData
 *  com.viaversion.viaversion.api.minecraft.GameMode
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArraySet
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.BannerPatterns1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.AcknowledgedMessagesStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ScoreboardTeamStorage
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.KeyMappings
 *  com.viaversion.viaversion.util.TagUtil
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.DimensionData;
import com.viaversion.viaversion.api.minecraft.GameMode;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.libs.fastutil.ints.IntArraySet;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.Protocol1_20_3To1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.Attributes1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.BannerPatterns1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.AcknowledgedMessagesStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ScoreboardTeamStorage;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.KeyMappings;
import com.viaversion.viaversion.util.TagUtil;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class EntityPacketRewriter1_20_5
extends EntityRewriter<ClientboundPacket1_20_3, Protocol1_20_3To1_20_5> {
    private static final UUID CREATIVE_BLOCK_INTERACTION_RANGE = UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542");
    private static final UUID CREATIVE_ENTITY_INTERACTION_RANGE = UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73");

    public EntityPacketRewriter1_20_5(Protocol1_20_3To1_20_5 protocol1_20_3To1_20_5) {
        super((Protocol)protocol1_20_3To1_20_5);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(n -> {
            int n2 = n;
            if (n2 >= ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).particlesType.typeId()) {
                ++n2;
            }
            if (n2 >= ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).wolfVariantType.typeId()) {
                ++n2;
            }
            if (n2 >= ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).armadilloState.typeId()) {
                ++n2;
            }
            return ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).byId(n2);
        });
        this.registerEntityDataTypeHandler(((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).itemType, ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).blockStateType, ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).optionalBlockStateType, ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).particleType, null, ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).componentType, ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_20_5.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_20_5.LIVING_ENTITY).index(10).handler((entityDataHandlerEvent, entityData) -> {
            int n = (Integer)entityData.value();
            if (n == 0) {
                entityData.setTypeAndValue(((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).particlesType, (Object)new Particle[0]);
                return;
            }
            Particle particle = new Particle(((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getParticleMappings().mappedId("entity_effect"));
            particle.add((Type)Types.INT, (Object)EntityPacketRewriter1_20_5.withAlpha(n));
            entityData.setTypeAndValue(((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).particlesType, (Object)new Particle[]{particle});
        });
        this.filter().type((EntityType)EntityTypes1_20_5.LLAMA).handler((entityDataHandlerEvent, entityData) -> {
            int n = entityDataHandlerEvent.index();
            if (n == 20) {
                entityDataHandlerEvent.cancel();
                int n2 = (Integer)entityData.value();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_20_5.SET_EQUIPMENT, (UserConnection)entityDataHandlerEvent.user());
                packetWrapper.write((Type)Types.VAR_INT, (Object)entityDataHandlerEvent.entityId());
                packetWrapper.write((Type)Types.BYTE, (Object)6);
                packetWrapper.write(VersionedTypes.V1_20_5.item, (Object)new StructuredItem(n2 + 446, 1, new StructuredDataContainer()));
                packetWrapper.scheduleSend(Protocol1_20_3To1_20_5.class);
            } else if (n > 20) {
                entityDataHandlerEvent.setIndex(n - 1);
            }
        });
        this.filter().type((EntityType)EntityTypes1_20_5.AREA_EFFECT_CLOUD).handler((entityDataHandlerEvent, entityData) -> {
            EntityData entityData2;
            int n = entityDataHandlerEvent.index();
            if (n == 9) {
                EntityData entityData3 = entityDataHandlerEvent.dataAtIndex(11);
                int n2 = (Integer)entityData.value();
                if (entityData3 == null) {
                    if (n2 != 0) {
                        Particle particle = new Particle(((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getParticleMappings().mappedId("entity_effect"));
                        particle.add((Type)Types.INT, (Object)EntityPacketRewriter1_20_5.withAlpha(n2));
                        entityDataHandlerEvent.createExtraData(new EntityData(10, ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).particleType, (Object)particle));
                    }
                } else {
                    this.addColor(entityData3, n2);
                }
                entityDataHandlerEvent.cancel();
                return;
            }
            if (n == 11 && (entityData2 = entityDataHandlerEvent.dataAtIndex(9)) != null && entityData2.dataType() == ((EntityDataTypes1_20_5)VersionedTypes.V1_20_5.entityDataTypes).varIntType) {
                this.addColor(entityData, (Integer)entityData2.value());
            }
            if (n > 9) {
                entityDataHandlerEvent.setIndex(n - 1);
            }
        });
        this.filter().type((EntityType)EntityTypes1_20_5.ARROW).index(10).handler((entityDataHandlerEvent, entityData) -> {
            int n = (Integer)entityData.value();
            if (n != -1) {
                entityData.setValue((Object)EntityPacketRewriter1_20_5.withAlpha(n));
            }
        });
        this.filter().type((EntityType)EntityTypes1_20_5.ITEM_PROJECTILE).index(8).handler((entityDataHandlerEvent, entityData) -> {
            Item item = (Item)entityData.value();
            if (item == null || item.isEmpty()) {
                entityDataHandlerEvent.cancel();
            }
        });
    }

    public void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_20_3.SET_ENTITY_DATA, Types1_20_3.ENTITY_DATA_LIST, VersionedTypes.V1_20_5.entityDataList);
        ((Protocol1_20_3To1_20_5)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_EQUIPMENT, packetWrapper -> {
            byte by;
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            EntityType entityType = this.tracker(packetWrapper.user()).entityType(n);
            do {
                by = (Byte)packetWrapper.read((Type)Types.BYTE);
                int n2 = by & 0x7F;
                if (entityType != null && entityType.isOrHasParent((EntityType)EntityTypes1_20_5.ABSTRACT_HORSE) && n2 == 4) {
                    boolean bl = (by & 0xFFFFFF80) == 0;
                    by = (byte)(bl ? 6 : -122);
                }
                packetWrapper.write((Type)Types.BYTE, (Object)by);
                Item item = ((Protocol1_20_3To1_20_5)this.protocol).getItemRewriter().handleItemToClient(packetWrapper.user(), (Item)packetWrapper.read(Types.ITEM1_20_2));
                packetWrapper.write(VersionedTypes.V1_20_5.item, (Object)item);
            } while ((by & 0xFFFFFF80) != 0);
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_3.REGISTRY_DATA, packetWrapper -> {
            Object object;
            Object object2;
            String[] stringArray;
            CompoundTag compoundTag2;
            CompoundTag compoundTag3;
            Object object32;
            Object object42;
            PacketWrapper packetWrapper2 = packetWrapper.create((PacketType)ClientboundConfigurationPackets1_20_5.SELECT_KNOWN_PACKS);
            packetWrapper2.write((Type)Types.VAR_INT, (Object)0);
            packetWrapper2.send(Protocol1_20_3To1_20_5.class);
            CompoundTag compoundTag4 = (CompoundTag)packetWrapper.read(Types.COMPOUND_TAG);
            this.cacheDimensionData(packetWrapper.user(), compoundTag4);
            this.trackBiomeSize(packetWrapper.user(), compoundTag4);
            ListTag listTag = TagUtil.getRegistryEntries((CompoundTag)compoundTag4, (String)"dimension_type");
            for (Object object42 : listTag) {
                object32 = object42.getCompoundTag("element");
                compoundTag3 = object32.getCompoundTag("monster_spawn_light_level");
                if (compoundTag3 == null) continue;
                compoundTag2 = (CompoundTag)compoundTag3.removeUnchecked("value");
                compoundTag3.putInt("min_inclusive", compoundTag2.getInt("min_inclusive"));
                compoundTag3.putInt("max_inclusive", compoundTag2.getInt("max_inclusive"));
            }
            Iterator iterator = TagUtil.getRegistryEntries((CompoundTag)compoundTag4, (String)"worldgen/biome");
            object42 = iterator.iterator();
            while (object42.hasNext()) {
                object32 = (CompoundTag)object42.next();
                compoundTag3 = object32.getCompoundTag("element").getCompoundTag("effects");
                this.checkSoundTag(compoundTag3.getCompoundTag("mood_sound"), "sound");
                this.checkSoundTag(compoundTag3.getCompoundTag("additions_sound"), "sound");
                this.checkSoundTag(compoundTag3.getCompoundTag("music"), "sound");
                this.checkSoundTag(compoundTag3, "ambient_sound");
                compoundTag2 = compoundTag3.getCompoundTag("particle");
                if (compoundTag2 == null) continue;
                stringArray = compoundTag2.getCompoundTag("options");
                object2 = stringArray.getString("type");
                this.updateParticleFormat((CompoundTag)stringArray, Key.stripMinecraftNamespace((String)object2));
            }
            for (Object object32 : compoundTag4.entrySet()) {
                compoundTag3 = (CompoundTag)object32.getValue();
                compoundTag2 = compoundTag3.getString("type");
                stringArray = compoundTag3.getListTag("value", CompoundTag.class);
                object2 = new RegistryEntry[stringArray.stream().map(compoundTag -> compoundTag.getInt("id")).distinct().toArray().length];
                boolean bl = false;
                int n = -1;
                object = new IntArraySet();
                for (CompoundTag compoundTag5 : stringArray) {
                    String string = compoundTag5.getString("name");
                    int n2 = compoundTag5.getInt("id");
                    if (object.add(n2)) {
                        n = Math.max(n, n2);
                        if (n2 >= ((RegistryEntry[])object2).length) {
                            object2 = Arrays.copyOf(object2, Math.max(((RegistryEntry[])object2).length * 2, n2 + 1));
                            bl = true;
                        }
                    }
                    object2[n2] = new RegistryEntry(string, compoundTag5.get("element"));
                }
                String string = Key.stripMinecraftNamespace((String)compoundTag2);
                if (string.equals("damage_type")) {
                    if (Arrays.stream(object2).noneMatch(registryEntry -> Key.namespaced((String)registryEntry.key()).equals("minecraft:spit"))) {
                        object2 = Arrays.copyOf(object2, ++n + 1);
                        CompoundTag compoundTag6 = new CompoundTag();
                        compoundTag6.putString("scaling", "when_caused_by_living_non_player");
                        compoundTag6.putString("message_id", "mob");
                        compoundTag6.putFloat("exhaustion", 0.1f);
                        object2[n] = new RegistryEntry("minecraft:spit", (Tag)compoundTag6);
                    }
                    Set set = Arrays.stream(object2).map(registryEntry -> Key.stripMinecraftNamespace((String)registryEntry.key())).collect(Collectors.toSet());
                    for (String string2 : ((Protocol1_20_3To1_20_5)this.protocol).getMappingData().damageKeys()) {
                        if (set.contains(string2)) continue;
                        object2 = Arrays.copyOf(object2, ++n + 1);
                        object2[n] = new RegistryEntry(Key.namespaced((String)string2), (Tag)((Protocol1_20_3To1_20_5)this.protocol).getMappingData().damageType(string2));
                    }
                }
                if (bl) {
                    int n3 = n + 1;
                    if (((RegistryEntry[])object2).length != n3) {
                        object2 = Arrays.copyOf(object2, n3);
                    }
                    this.replaceNullValues((RegistryEntry[])object2);
                }
                if (string.equals("trim_pattern")) {
                    ((ArmorTrimStorage)packetWrapper.user().get(ArmorTrimStorage.class)).setTrimPatterns(this.toMappings((RegistryEntry[])object2));
                } else if (string.equals("trim_material")) {
                    ((ArmorTrimStorage)packetWrapper.user().get(ArmorTrimStorage.class)).setTrimMaterials(this.toMappings((RegistryEntry[])object2));
                }
                PacketWrapper packetWrapper3 = packetWrapper.create((PacketType)ClientboundConfigurationPackets1_20_5.REGISTRY_DATA);
                packetWrapper3.write(Types.STRING, (Object)compoundTag2);
                packetWrapper3.write(Types.REGISTRY_ENTRY_ARRAY, object2);
                packetWrapper3.send(Protocol1_20_3To1_20_5.class);
            }
            packetWrapper.cancel();
            object42 = packetWrapper.create((PacketType)ClientboundConfigurationPackets1_20_5.REGISTRY_DATA);
            object42.write(Types.STRING, (Object)"minecraft:wolf_variant");
            object32 = new CompoundTag();
            object32.putString("wild_texture", "entity/wolf/wolf");
            object32.putString("tame_texture", "entity/wolf/wolf_tame");
            object32.putString("angry_texture", "entity/wolf/wolf_angry");
            object32.put("biomes", (Tag)new ListTag(StringTag.class));
            object42.write(Types.REGISTRY_ENTRY_ARRAY, (Object)new RegistryEntry[]{new RegistryEntry("minecraft:pale", (Tag)object32)});
            object42.send(Protocol1_20_3To1_20_5.class);
            compoundTag3 = packetWrapper.create((PacketType)ClientboundConfigurationPackets1_20_5.REGISTRY_DATA);
            compoundTag3.write(Types.STRING, (Object)"minecraft:banner_pattern");
            compoundTag2 = new RegistryEntry[BannerPatterns1_20_5.keys().length];
            stringArray = BannerPatterns1_20_5.keys();
            for (int i = 0; i < stringArray.length; ++i) {
                CompoundTag compoundTag7 = new CompoundTag();
                String string = stringArray[i];
                object = "minecraft:" + string;
                compoundTag7.putString("asset_id", string);
                compoundTag7.putString("translation_key", "block.minecraft.banner." + string);
                compoundTag2[i] = new RegistryEntry((String)object, (Tag)compoundTag7);
            }
            compoundTag3.write(Types.REGISTRY_ENTRY_ARRAY, (Object)compoundTag2);
            compoundTag3.send(Protocol1_20_3To1_20_5.class);
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.LOGIN, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_20_5 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map(Types.STRING_ARRAY);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    String dimensionKey = (String)wrapper.read(Types.STRING);
                    DimensionData data = this.this$0.tracker(wrapper.user()).dimensionData(dimensionKey);
                    wrapper.write((Type)Types.VAR_INT, (Object)data.id());
                });
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map(Types.OPTIONAL_GLOBAL_POSITION);
                this.map((Type)Types.VAR_INT);
                this.handler(this.this$0.worldDataTrackerHandlerByKey1_20_5(3));
                this.handler(this.this$0.playerTrackerHandler());
                this.handler(wrapper -> {
                    AcknowledgedMessagesStorage storage = (AcknowledgedMessagesStorage)wrapper.user().get(AcknowledgedMessagesStorage.class);
                    if (storage.secureChatEnforced() != null) {
                        wrapper.write((Type)Types.BOOLEAN, (Object)storage.isSecureChatEnforced());
                    } else {
                        wrapper.write((Type)Types.BOOLEAN, (Object)Via.getConfig().enforceSecureChat());
                    }
                    storage.clear();
                    byte gamemode = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    boolean creativeMode = gamemode == GameMode.CREATIVE.id();
                    this.this$0.sendRangeAttributes(wrapper.user(), creativeMode);
                    this.this$0.tracker(wrapper.user()).setInstaBuild(creativeMode);
                });
            }
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.RESPAWN, packetWrapper -> {
            String string = (String)packetWrapper.read(Types.STRING);
            DimensionData dimensionData = this.tracker(packetWrapper.user()).dimensionData(string);
            packetWrapper.write((Type)Types.VAR_INT, (Object)dimensionData.id());
            packetWrapper.passthrough(Types.STRING);
            this.worldDataTrackerHandlerByKey1_20_5(0).handle(packetWrapper);
            packetWrapper.passthrough((Type)Types.LONG);
            byte by = (Byte)packetWrapper.passthrough((Type)Types.BYTE);
            boolean bl = by == GameMode.CREATIVE.id();
            this.sendRangeAttributes(packetWrapper.user(), bl);
            this.tracker(packetWrapper.user()).setInstaBuild(bl);
            packetWrapper.user().put((StorableObject)new ScoreboardTeamStorage());
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.UPDATE_MOB_EFFECT, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.VAR_INT);
            packetWrapper.passthrough((Type)Types.VAR_INT);
            byte by = (Byte)packetWrapper.read((Type)Types.BYTE);
            packetWrapper.write((Type)Types.VAR_INT, (Object)by);
            packetWrapper.passthrough((Type)Types.VAR_INT);
            packetWrapper.passthrough((Type)Types.BYTE);
            packetWrapper.read(Types.OPTIONAL_COMPOUND_TAG);
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.UPDATE_ATTRIBUTES, packetWrapper -> {
            packetWrapper.passthrough((Type)Types.VAR_INT);
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < n; ++i) {
                String string = (String)packetWrapper.read(Types.STRING);
                int n2 = Attributes1_20_5.keyToId((String)string);
                packetWrapper.write((Type)Types.VAR_INT, (Object)(n2 != -1 ? n2 : 0));
                packetWrapper.passthrough((Type)Types.DOUBLE);
                int n3 = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
                for (int j = 0; j < n3; ++j) {
                    packetWrapper.passthrough(Types.UUID);
                    packetWrapper.passthrough((Type)Types.DOUBLE);
                    packetWrapper.passthrough((Type)Types.BYTE);
                }
            }
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.GAME_EVENT, packetWrapper -> {
            short s = (Short)packetWrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            if (s != 3) {
                return;
            }
            int n = (int)Math.floor(((Float)packetWrapper.passthrough((Type)Types.FLOAT)).floatValue() + 0.5f);
            boolean bl = n == GameMode.CREATIVE.id();
            this.sendRangeAttributes(packetWrapper.user(), bl);
            this.tracker(packetWrapper.user()).setInstaBuild(bl);
        });
        ((Protocol1_20_3To1_20_5)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.PLAYER_ABILITIES, packetWrapper -> {
            byte by = (Byte)packetWrapper.passthrough((Type)Types.BYTE);
            this.tracker(packetWrapper.user()).setInstaBuild((by & 8) != 0);
        });
    }

    public EntityType typeFromId(int n) {
        return EntityTypes1_20_5.getTypeFromId((int)n);
    }

    private void redirect$dgb000$viafabricplus$useLegacyValues(EntityPacketRewriter1_20_5 entityPacketRewriter1_20_5, PacketWrapper packetWrapper, String string, double d, UUID uUID, double d2) {
        if (string.equals("player.block_interaction_range") && packetWrapper.user().getProtocolInfo().serverProtocolVersion().olderThan(LegacyProtocolVersion.r1_0_0tor1_0_1)) {
            this.writeAttribute(packetWrapper, string, 4.0, uUID, 1.0);
        } else if (string.equals("player.entity_interaction_range") && packetWrapper.user().getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)) {
            this.writeAttribute(packetWrapper, string, 3.0, uUID, 3.0);
        } else {
            this.writeAttribute(packetWrapper, string, d, uUID, d2);
        }
    }

    private KeyMappings toMappings(RegistryEntry[] registryEntryArray) {
        String[] stringArray = new String[registryEntryArray.length];
        for (int i = 0; i < registryEntryArray.length; ++i) {
            stringArray[i] = Key.stripMinecraftNamespace((String)registryEntryArray[i].key());
        }
        return new KeyMappings(stringArray);
    }

    private void moveTag(CompoundTag compoundTag, String string, String string2) {
        Tag tag = compoundTag.remove(string);
        if (tag != null) {
            compoundTag.put(string2, tag);
        }
    }

    static int withAlpha(int n) {
        return 0xFF000000 | n & 0xFFFFFF;
    }

    private void addColor(@Nullable EntityData entityData, int n) {
        if (entityData == null) {
            return;
        }
        Particle particle = (Particle)entityData.value();
        if (particle.id() == ((Protocol1_20_3To1_20_5)this.protocol).getMappingData().getParticleMappings().mappedId("entity_effect")) {
            particle.getArgument(0).setValue((Object)EntityPacketRewriter1_20_5.withAlpha(n));
        }
    }

    private void updateParticleFormat(CompoundTag compoundTag, String string) {
        if ("block".equals(string) || "block_marker".equals(string) || "falling_dust".equals(string) || "dust_pillar".equals(string)) {
            this.moveTag(compoundTag, "value", "block_state");
        } else if ("item".equals(string)) {
            this.moveTag(compoundTag, "value", "item");
        } else if ("dust_color_transition".equals(string)) {
            this.moveTag(compoundTag, "fromColor", "from_color");
            this.moveTag(compoundTag, "toColor", "to_color");
        } else if ("entity_effect".equals(string)) {
            this.moveTag(compoundTag, "value", "color");
        }
    }

    private void sendRangeAttributes(UserConnection userConnection, boolean bl) {
        EntityPacketRewriter1_20_5 entityPacketRewriter1_20_5;
        PacketWrapper packetWrapper;
        String string;
        double d;
        UUID uUID;
        double d2;
        PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ClientboundPackets1_20_5.UPDATE_ATTRIBUTES, (UserConnection)userConnection);
        packetWrapper2.write((Type)Types.VAR_INT, (Object)this.tracker(userConnection).clientEntityId());
        if (userConnection.getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            packetWrapper2.write((Type)Types.VAR_INT, (Object)3);
            d2 = 0.0;
            uUID = null;
            d = 0.5;
            string = "generic.step_height";
            packetWrapper = packetWrapper2;
            entityPacketRewriter1_20_5 = this;
            this.redirect$dgb000$viafabricplus$useLegacyValues(entityPacketRewriter1_20_5, packetWrapper, string, d, uUID, d2);
        } else {
            packetWrapper2.write((Type)Types.VAR_INT, (Object)2);
        }
        d2 = 0.5;
        uUID = bl ? CREATIVE_BLOCK_INTERACTION_RANGE : null;
        d = 4.5;
        string = "player.block_interaction_range";
        packetWrapper = packetWrapper2;
        entityPacketRewriter1_20_5 = this;
        this.redirect$dgb000$viafabricplus$useLegacyValues(entityPacketRewriter1_20_5, packetWrapper, string, d, uUID, d2);
        if (userConnection.getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            d2 = 1.0;
            uUID = bl ? CREATIVE_ENTITY_INTERACTION_RANGE : null;
            d = 3.0;
            string = "player.entity_interaction_range";
            packetWrapper = packetWrapper2;
            entityPacketRewriter1_20_5 = this;
            this.redirect$dgb000$viafabricplus$useLegacyValues(entityPacketRewriter1_20_5, packetWrapper, string, d, uUID, d2);
        } else {
            d2 = 2.0;
            uUID = bl ? CREATIVE_ENTITY_INTERACTION_RANGE : null;
            d = 3.0;
            string = "player.entity_interaction_range";
            packetWrapper = packetWrapper2;
            entityPacketRewriter1_20_5 = this;
            this.redirect$dgb000$viafabricplus$useLegacyValues(entityPacketRewriter1_20_5, packetWrapper, string, d, uUID, d2);
        }
        packetWrapper2.scheduleSend(Protocol1_20_3To1_20_5.class);
    }

    private void writeAttribute(PacketWrapper packetWrapper, String string, double d, @Nullable UUID uUID, double d2) {
        packetWrapper.write((Type)Types.VAR_INT, (Object)Attributes1_20_5.keyToId((String)string));
        packetWrapper.write((Type)Types.DOUBLE, (Object)d);
        if (uUID != null) {
            packetWrapper.write((Type)Types.VAR_INT, (Object)1);
            packetWrapper.write(Types.UUID, (Object)uUID);
            packetWrapper.write((Type)Types.DOUBLE, (Object)d2);
            packetWrapper.write((Type)Types.BYTE, (Object)0);
        } else {
            packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        }
    }

    private void checkSoundTag(@Nullable CompoundTag compoundTag, String string) {
        if (compoundTag == null) {
            return;
        }
        String string2 = compoundTag.getString(string);
        if (string2 != null && ((Protocol1_20_3To1_20_5)this.protocol).getMappingData().soundId(string2) == -1) {
            CompoundTag compoundTag2 = new CompoundTag();
            compoundTag2.putString("sound_id", string2);
            compoundTag.put(string, (Tag)compoundTag2);
        }
    }

    private void replaceNullValues(RegistryEntry[] registryEntryArray) {
        RegistryEntry registryEntry = null;
        for (RegistryEntry registryEntry2 : registryEntryArray) {
            if (registryEntry2 == null) continue;
            registryEntry = registryEntry2;
            break;
        }
        for (int i = 0; i < registryEntryArray.length; ++i) {
            if (registryEntryArray[i] != null) continue;
            registryEntryArray[i] = registryEntry.withKey(UUID.randomUUID().toString());
        }
    }
}

