/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.rewriter.ComponentRewriter
 *  com.viaversion.viaversion.api.rewriter.RegistryDataRewriter
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.DimensionDataImpl
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap
 *  com.viaversion.viaversion.util.KeyMappings
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.rewriter.ComponentRewriter;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.DimensionDataImpl;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.KeyMappings;
import com.viaversion.viaversion.util.TagUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RegistryDataRewriter
implements com.viaversion.viaversion.api.rewriter.RegistryDataRewriter {
    private final Map<String, BiConsumer<String, CompoundTag>> registryEntryHandlers = new Object2ObjectArrayMap();
    private final Map<String, Consumer<CompoundTag>> enchantmentEffectHandlers = new Object2ObjectArrayMap();
    private final Map<String, List<RegistryEntry>> toAdd = new Object2ObjectArrayMap();
    private final Set<String> toRemove = new HashSet<String>();
    protected final Map<String, KeyMappings> registryKeyMappings = new HashMap<String, KeyMappings>();
    protected final Protocol<?, ?, ?, ?> protocol;

    public RegistryDataRewriter(Protocol<?, ?, ?, ?> protocol) {
        this.protocol = protocol;
    }

    public void remove(String registryKey) {
        this.toRemove.add(Key.stripMinecraftNamespace(registryKey));
    }

    public void handle(PacketWrapper wrapper) {
        String registryKey = Key.stripMinecraftNamespace((String)wrapper.passthrough(Types.STRING));
        RegistryEntry[] entries = (RegistryEntry[])wrapper.read(Types.REGISTRY_ENTRY_ARRAY);
        entries = this.handle(wrapper.user(), registryKey, entries);
        wrapper.write(Types.REGISTRY_ENTRY_ARRAY, (Object)entries);
        if (this.toRemove.contains(registryKey)) {
            wrapper.cancel();
        }
    }

    public RegistryEntry[] handle(UserConnection connection, String key, RegistryEntry[] entries) {
        List<RegistryEntry> toAdd;
        key = Key.stripMinecraftNamespace(key);
        String[] keys = new String[entries.length];
        for (int i = 0; i < entries.length; ++i) {
            keys[i] = Key.stripMinecraftNamespace(entries[i].key());
        }
        this.registryKeyMappings.put(key, new KeyMappings(keys));
        switch (key) {
            case "enchantment": {
                this.updateEnchantments(connection, entries);
                break;
            }
            case "trim_material": {
                this.updateTrimMaterials(entries);
                break;
            }
            case "jukebox_song": {
                this.updateJukeboxSongs(entries);
                break;
            }
            case "worldgen/biome": {
                this.updateBiomes(entries);
                break;
            }
            case "dialog": {
                this.updateDialogs(connection, entries);
            }
        }
        BiConsumer<String, CompoundTag> registryEntryHandler = this.registryEntryHandlers.get(key);
        if (registryEntryHandler != null) {
            for (RegistryEntry entry : entries) {
                if (entry.tag() == null) continue;
                CompoundTag tag = (CompoundTag)entry.tag();
                registryEntryHandler.accept(entry.key(), tag);
            }
        }
        if ((toAdd = this.toAdd.get(key)) != null) {
            HashSet<String> existingKeys = new HashSet<String>();
            RegistryEntry[] updatedEntries = new RegistryEntry[entries.length + toAdd.size()];
            int index = 0;
            for (RegistryEntry entry : entries) {
                updatedEntries[index++] = entry;
                existingKeys.add(Key.stripMinecraftNamespace(entry.key()));
            }
            for (RegistryEntry entry : toAdd) {
                if (existingKeys.contains(Key.stripMinecraftNamespace(entry.key()))) continue;
                updatedEntries[index++] = entry.copy();
            }
            entries = index < updatedEntries.length ? Arrays.copyOf(updatedEntries, index) : updatedEntries;
        }
        this.trackDimensionAndBiomes(connection, key, entries);
        return entries;
    }

    public boolean shouldRemoveRegistry(String registryKey) {
        return this.toRemove.contains(Key.stripMinecraftNamespace(registryKey));
    }

    protected void updateTextComponent(UserConnection connection, @Nullable CompoundTag tag, String key) {
        if (tag != null && this.protocol.getComponentRewriter() != null) {
            this.protocol.getComponentRewriter().processTag(connection, tag.get(key));
        }
    }

    public void sendMissingRegistries(UserConnection connection) {
        for (Map.Entry<String, List<RegistryEntry>> entry : this.toAdd.entrySet()) {
            if (this.registryKeyMappings.containsKey(entry.getKey())) continue;
            List<RegistryEntry> toAdd = entry.getValue();
            RegistryEntry[] entries = new RegistryEntry[toAdd.size()];
            for (int i = 0; i < toAdd.size(); ++i) {
                entries[i] = toAdd.get(i).copy();
            }
            ClientboundPacketType packetType = this.protocol.getPacketTypesProvider().mappedClientboundType(State.CONFIGURATION, "REGISTRY_DATA");
            PacketWrapper registryData = PacketWrapper.create((PacketType)packetType, (UserConnection)connection);
            registryData.write(Types.STRING, (Object)entry.getKey());
            registryData.write(Types.REGISTRY_ENTRY_ARRAY, (Object)entries);
            registryData.send(this.protocol.getClass());
        }
    }

    public void updateDialog(UserConnection connection, CompoundTag tag) {
        ListTag inputsTag;
        ComponentRewriter componentRewriter = this.protocol.getComponentRewriter();
        if (componentRewriter != null) {
            componentRewriter.processTag(connection, tag.get("title"));
            componentRewriter.processTag(connection, tag.get("external_title"));
        }
        if ((inputsTag = tag.getListTag("inputs", CompoundTag.class)) != null && componentRewriter != null) {
            for (String input : inputsTag) {
                ListTag optionsTag;
                this.updateTextComponent(connection, (CompoundTag)input, "label");
                String type = input.getString("type");
                if (!Key.equals(type, "single_option") || (optionsTag = input.getListTag("options", CompoundTag.class)) == null) continue;
                optionsTag.forEach(option -> this.updateTextComponent(connection, (CompoundTag)option, "display"));
            }
        }
        String type = tag.getString("type");
        switch (Key.stripMinecraftNamespace(type)) {
            case "confirmation": {
                this.updateDialogAction(connection, tag.getCompoundTag("yes"));
                this.updateDialogAction(connection, tag.getCompoundTag("no"));
                break;
            }
            case "dialog_list": {
                this.updateDialogAction(connection, tag.getCompoundTag("exit_action"));
                ListTag dialogsTag = tag.getListTag("dialogs", CompoundTag.class);
                if (dialogsTag != null) {
                    dialogsTag.forEach(dialog -> this.updateDialog(connection, (CompoundTag)dialog));
                    break;
                }
                CompoundTag dialogTag = tag.getCompoundTag("dialogs");
                if (dialogTag == null) break;
                this.updateDialog(connection, dialogTag);
                break;
            }
            case "multi_action": {
                this.updateDialogAction(connection, tag.getCompoundTag("exit_action"));
                ListTag actionsTag = tag.getListTag("actions", CompoundTag.class);
                if (actionsTag == null) break;
                actionsTag.forEach(action -> this.updateDialogAction(connection, (CompoundTag)action));
                break;
            }
            case "notice": {
                this.updateDialogAction(connection, tag.getCompoundTag("action"));
                break;
            }
            case "server_links": {
                this.updateDialogAction(connection, tag.getCompoundTag("exit_action"));
            }
        }
        ListTag bodiesTag = tag.getListTag("body", CompoundTag.class);
        if (bodiesTag != null) {
            bodiesTag.forEach(body -> this.updateDialogBody(connection, (CompoundTag)body));
        } else {
            CompoundTag bodyTag = tag.getCompoundTag("body");
            if (bodyTag != null) {
                this.updateDialogBody(connection, bodyTag);
            }
        }
    }

    public RegistryEntry[] entriesFromTag(CompoundTag tag) {
        RegistryEntry[] entries = new RegistryEntry[tag.size()];
        int index = 0;
        for (Map.Entry entry : tag.entrySet()) {
            entries[index++] = new RegistryEntry((String)entry.getKey(), (Tag)entry.getValue());
        }
        return entries;
    }

    public void addEntries(String registryKey, RegistryEntry ... entries) {
        this.toAdd.computeIfAbsent(Key.stripMinecraftNamespace(registryKey), $ -> new ArrayList()).addAll(List.of(entries));
    }

    public boolean hasRegistriesToRemove() {
        return !this.toRemove.isEmpty();
    }

    public void addHandler(String registryKey, BiConsumer<String, CompoundTag> handler) {
        this.registryEntryHandlers.put(Key.stripMinecraftNamespace(registryKey), handler);
    }

    public void updateTrimMaterials(RegistryEntry[] entries) {
        if (Mappings.isFullIdentity((Mappings)this.protocol.getMappingData().getFullItemMappings())) {
            return;
        }
        for (RegistryEntry entry : entries) {
            if (entry.tag() == null) continue;
            StringTag ingredientTag = ((CompoundTag)entry.tag()).getStringTag("ingredient");
            if (ingredientTag == null) {
                return;
            }
            this.updateItem(ingredientTag);
        }
    }

    public Map<String, KeyMappings> registryKeyMappings() {
        return this.registryKeyMappings;
    }

    public void trackDimensionAndBiomes(UserConnection connection, String registryKey, RegistryEntry[] entries) {
        if (registryKey.equals("worldgen/biome")) {
            this.protocol.getEntityRewriter().tracker(connection).setBiomesSent(entries.length);
        } else if (registryKey.equals("dimension_type")) {
            HashMap<String, DimensionDataImpl> dimensionDataMap = new HashMap<String, DimensionDataImpl>(entries.length);
            for (int i = 0; i < entries.length; ++i) {
                RegistryEntry entry = entries[i];
                String key = Key.stripMinecraftNamespace(entry.key());
                DimensionDataImpl dimensionData = entry.tag() != null ? new DimensionDataImpl(i, (CompoundTag)entry.tag()) : DimensionDataImpl.withDefaultsFor((String)key, (int)i);
                dimensionDataMap.put(key, dimensionData);
            }
            this.protocol.getEntityRewriter().tracker(connection).setDimensions(dimensionDataMap);
        }
    }

    private void updateAttributesFields(CompoundTag effects) {
        ListTag<CompoundTag> attributesList = TagUtil.getNamespacedCompoundTagList(effects, "attributes");
        if (attributesList == null) {
            return;
        }
        for (CompoundTag attributeData : attributesList) {
            this.updateType(attributeData, "attribute", this.protocol.getMappingData().getAttributeMappings());
        }
    }

    protected void updateType(CompoundTag tag, String key, FullMappings mappings) {
        ListTag listTag;
        Tag typeTag = tag.get(key);
        if (typeTag == null || Mappings.isFullIdentity((Mappings)mappings)) {
            return;
        }
        if (typeTag instanceof StringTag) {
            StringTag stringTag = (StringTag)typeTag;
            this.setMappedOrDummyId(mappings, stringTag);
        } else if (typeTag instanceof ListTag && (listTag = (ListTag)typeTag).getElementType() == StringTag.class) {
            ListTag typesTag = listTag;
            for (StringTag entry : typesTag) {
                this.setMappedOrDummyId(mappings, entry);
            }
        }
    }

    private void updateItem(StringTag tag) {
        String mapped = this.protocol.getMappingData().getFullItemMappings().mappedIdentifier(tag.getValue());
        if (mapped != null) {
            tag.setValue(mapped);
        }
    }

    public void updateJukeboxSongs(RegistryEntry[] entries) {
    }

    public void updateBiomes(RegistryEntry[] entries) {
        for (RegistryEntry entry : entries) {
            CompoundTag particle;
            CompoundTag effects;
            if (entry.tag() == null || (effects = ((CompoundTag)entry.tag()).getCompoundTag("effects")) == null || (particle = effects.getCompoundTag("particle")) == null) continue;
            this.handleParticleData(particle.getCompoundTag("options"));
        }
    }

    public void updateDialogs(UserConnection connection, RegistryEntry[] entries) {
        if (this.protocol.getMappingData() != null && this.protocol.getMappingData().getFullItemMappings() == null) {
            return;
        }
        for (RegistryEntry entry : entries) {
            if (entry.tag() == null) continue;
            this.updateDialog(connection, (CompoundTag)entry.tag());
        }
    }

    public void updateDialogAction(UserConnection connection, CompoundTag tag) {
        this.updateTextComponent(connection, tag, "label");
        this.updateTextComponent(connection, tag, "tooltip");
    }

    public void updateDialogBody(UserConnection connection, CompoundTag tag) {
        String type = tag.getString("type");
        ComponentRewriter componentRewriter = this.protocol.getComponentRewriter();
        if (Key.equals(type, "plain_message")) {
            if (componentRewriter != null) {
                componentRewriter.processTag(connection, tag.get("contents"));
            }
        } else if (Key.equals(type, "item")) {
            StringTag itemIdTag;
            if (componentRewriter != null) {
                Tag description = tag.get("description");
                componentRewriter.processTag(connection, description);
                if (description instanceof CompoundTag) {
                    CompoundTag descriptionTag = (CompoundTag)description;
                    componentRewriter.processTag(connection, descriptionTag.get("contents"));
                }
            }
            if ((itemIdTag = tag.getStringTag("item")) != null) {
                String mappedId = this.protocol.getMappingData().getFullItemMappings().mappedIdentifier(itemIdTag.getValue());
                if (mappedId != null) {
                    itemIdTag.setValue(mappedId);
                }
            } else if (componentRewriter != null) {
                componentRewriter.handleShowItem(connection, tag.getCompoundTag("item"));
            }
        }
    }

    protected void handleParticleData(CompoundTag particleData) {
        this.updateType(particleData, "type", (FullMappings)this.protocol.getMappingData().getParticleMappings());
    }

    private void setMappedOrDummyId(FullMappings mappings, StringTag tag) {
        String mappedType = mappings.mappedIdentifier(tag.getValue());
        if (mappedType == null) {
            mappedType = mappings.mappedIdentifier(0);
        }
        tag.setValue(mappedType);
    }

    private void updateNestedEffect(CompoundTag effectsTag) {
        ListTag terms;
        CompoundTag requirements;
        CompoundTag effect = effectsTag.getCompoundTag("effect");
        if (effect != null) {
            this.runEffectRewriters(effect);
            ListTag innerEffects = effect.getListTag("effects", CompoundTag.class);
            if (innerEffects != null) {
                for (CompoundTag innerEffect : innerEffects) {
                    this.runEffectRewriters(innerEffect);
                }
            }
        }
        if ((requirements = effectsTag.getCompoundTag("requirements")) != null && (terms = requirements.getListTag("terms", CompoundTag.class)) != null) {
            for (CompoundTag term : terms) {
                this.updateEnchantmentTerm(term);
            }
        }
    }

    private void runEffectRewriters(CompoundTag effectTag) {
        CompoundTag particleData;
        String effect = effectTag.getString("type");
        if (effect == null) {
            return;
        }
        if ((effect = Key.stripMinecraftNamespace(effect)).equals("attribute")) {
            this.updateType(effectTag, "attribute", this.protocol.getMappingData().getAttributeMappings());
        } else if (effect.equals("spawn_particles") && (particleData = effectTag.getCompoundTag("particle")) != null) {
            this.handleParticleData(particleData);
        }
        Consumer<CompoundTag> rewriter = this.enchantmentEffectHandlers.get(effect);
        if (rewriter != null) {
            rewriter.accept(effectTag);
        } else if (effect.equals("play_sound")) {
            this.updateType(effectTag, "sound", this.protocol.getMappingData().getFullSoundMappings());
        }
    }

    public @Nullable KeyMappings getMappings(String registryKey) {
        return this.registryKeyMappings.get(Key.stripMinecraftNamespace(registryKey));
    }

    public void updateEnchantmentTerm(CompoundTag term) {
        String condition = term.getString("condition");
        if (Key.equals(condition, "all_of") || Key.equals(condition, "any_of")) {
            ListTag terms = term.getListTag("terms", CompoundTag.class);
            if (terms != null) {
                for (CompoundTag childTerm : terms) {
                    this.updateEnchantmentTerm(childTerm);
                }
            }
        } else if (Key.equals(condition, "inverted")) {
            CompoundTag childTerm = term.getCompoundTag("term");
            if (childTerm != null) {
                this.updateEnchantmentTerm(childTerm);
            }
        } else if (Key.equals(condition, "entity_properties")) {
            CompoundTag predicate = term.getCompoundTag("predicate");
            if (predicate != null) {
                this.updateType(predicate, "type", this.protocol.getMappingData().getEntityMappings());
            }
        } else if (Key.equals(condition, "block_state_property")) {
            this.updateType(term, "block", this.protocol.getMappingData().getFullBlockMappings());
        }
    }

    public void addEnchantmentEffectRewriter(String key, Consumer<CompoundTag> rewriter) {
        this.enchantmentEffectHandlers.put(Key.stripMinecraftNamespace(key), rewriter);
    }

    private void updateItemList(ListTag<StringTag> listTag) {
        if (listTag == null) {
            return;
        }
        for (StringTag tag : listTag) {
            this.updateItem(tag);
        }
    }

    public void updateEnchantments(UserConnection connection, RegistryEntry[] entries) {
        for (RegistryEntry entry : entries) {
            CompoundTag effects;
            if (entry.tag() == null) continue;
            CompoundTag tag = (CompoundTag)entry.tag();
            if (!Mappings.isFullIdentity((Mappings)this.protocol.getMappingData().getFullItemMappings())) {
                this.updateItemList((ListTag<StringTag>)tag.getListTag("supported_items", StringTag.class));
                this.updateItemList((ListTag<StringTag>)tag.getListTag("primary_items", StringTag.class));
            }
            if ((effects = tag.getCompoundTag("effects")) == null) continue;
            for (Map.Entry effectEntry : effects.entrySet()) {
                ListTag listTag;
                Object object = effectEntry.getValue();
                if (object instanceof CompoundTag) {
                    CompoundTag compoundTag = (CompoundTag)object;
                    this.updateNestedEffect(compoundTag);
                    continue;
                }
                object = effectEntry.getValue();
                if (!(object instanceof ListTag) || (listTag = (ListTag)object).getElementType() != CompoundTag.class) continue;
                for (Tag effectTag : listTag) {
                    this.updateNestedEffect((CompoundTag)effectTag);
                }
            }
            MappingData mappingData = this.protocol.getMappingData();
            if (mappingData == null || mappingData.getAttributeMappings() == null) continue;
            this.updateAttributesFields(effects);
        }
    }
}

