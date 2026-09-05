/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.HashMultimap
 *  com.viaversion.nbt.io.NBTIO
 *  com.viaversion.nbt.limiter.TagLimiter
 *  com.viaversion.nbt.stringified.SNBT
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.ints.IntCollection
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  com.viaversion.viaversion.util.GsonUtil
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.viabedrock.protocol.data.BedrockMappingData$JavaSoundLevelEvent
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.data;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.viaversion.nbt.io.NBTIO;
import com.viaversion.nbt.limiter.TagLimiter;
import com.viaversion.nbt.stringified.SNBT;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.util.GsonUtil;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgrader;
import net.raphimc.viabedrock.api.item.ItemUpgrader;
import net.raphimc.viabedrock.api.model.BedrockBlockState;
import net.raphimc.viabedrock.api.model.BlockState;
import net.raphimc.viabedrock.api.resourcepack.ResourcePack;
import net.raphimc.viabedrock.api.resourcepack.content.ZipContent;
import net.raphimc.viabedrock.api.resourcepack.definition.SoundDefinitions;
import net.raphimc.viabedrock.api.util.EnumUtil;
import net.raphimc.viabedrock.api.util.FileSystemUtil;
import net.raphimc.viabedrock.api.util.JsonUtil;
import net.raphimc.viabedrock.protocol.data.ArgumentTypeRegistry;
import net.raphimc.viabedrock.protocol.data.BedrockMappingData;
import net.raphimc.viabedrock.protocol.data.DataValues;
import net.raphimc.viabedrock.protocol.data.ProtocolConstants;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ActorDataIDs;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ActorFlags;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.DataItemType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Enchant_Type;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.NoteBlockInstrument;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ParticleType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SharedTypes_Legacy_ActorDamageCause;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SharedTypes_Legacy_LevelSoundEvent;
import net.raphimc.viabedrock.protocol.data.enums.java.LevelEvent;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.SoundSource;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class BedrockMappingData
extends MappingDataBase {
    private Map<ResourcePack.Key, ResourcePack> bedrockResourcePacks;
    private Map<ResourcePack.Key, ResourcePack> bedrockSkinPacks;
    private List<ResourcePack> bedrockVanillaResourcePacks;
    private Map<String, Object> bedrockGameRules;
    private CompoundTag javaRegistries;
    private CompoundTag javaTags;
    private BiMap<String, Integer> javaCommandArgumentTypes;
    private BlockStateUpgrader bedrockBlockStateUpgrader;
    private BiMap<String, Integer> javaBlocks;
    private BiMap<BlockState, Integer> javaBlockStates;
    private Set<BedrockBlockState> bedrockBlockStates;
    private Map<BlockState, BlockState> bedrockToJavaBlockStates;
    private Map<String, String> bedrockCustomBlockTags;
    private Map<String, Map<String, Map<String, Set<String>>>> bedrockBlockTraits;
    private BiMap<String, Integer> bedrockLegacyBlocks;
    private Int2ObjectMap<BedrockBlockState> bedrockLegacyBlockStates;
    private IntSet javaPreWaterloggedBlockStates;
    private IntSet javaFluidBlockStates;
    private Int2IntMap javaPottedBlockStates;
    private Map<String, IntSet> javaHeightMapBlockStates;
    private CompoundTag bedrockBiomeDefinitions;
    private BiMap<String, Integer> bedrockBiomes;
    private BiMap<String, Integer> javaBiomes;
    private Map<String, Map<String, Object>> bedrockToJavaBiomeExtraData;
    private ItemUpgrader bedrockItemUpgrader;
    private BiMap<String, Integer> javaItems;
    private Set<String> bedrockBlockItems;
    private Set<String> bedrockMetaItems;
    private Map<String, Set<String>> bedrockItemTags;
    private Map<String, String> bedrockCustomItemTags;
    private Map<String, Map<BlockState, JavaItemMapping>> bedrockToJavaBlockItems;
    private Map<String, Map<Integer, JavaItemMapping>> bedrockToJavaMetaItems;
    private Map<ContainerType, Integer> bedrockToJavaContainers;
    private BiMap<String, Integer> bedrockEntities;
    private Map<ActorDataIDs, DataItemType> bedrockEntityDataTypes;
    private Map<ActorFlags, String> bedrockEntityFlagMoLangQueries;
    private Map<String, EntityTypes1_21_11> bedrockToJavaEntities;
    private BiMap<String, Integer> javaBlockEntities;
    private BiMap<String, Integer> javaEntityAttributes;
    private Map<EntityTypes1_21_11, List<String>> javaEntityDataFields;
    private BiMap<String, Integer> javaEffects;
    private BiMap<String, Integer> bedrockEffects;
    private Map<String, String> bedrockToJavaEffects;
    private BiMap<String, Integer> javaSounds;
    private BiMap<String, Integer> javaParticles;
    private Map<String, String> bedrockBlockSounds;
    private Map<SharedTypes_Legacy_LevelSoundEvent, Map<String, SoundDefinitions.ConfiguredSound>> bedrockLevelSoundEvents;
    private Map<NoteBlockInstrument, String> bedrockNoteBlockInstrumentSounds;
    private Map<String, JavaSound> bedrockToJavaSounds;
    private Map<String, JavaParticle> bedrockToJavaParticles;
    private Map<net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent, LevelEventMapping> bedrockToJavaLevelEvents;
    private Map<ParticleType, JavaParticle> bedrockToJavaLevelEventParticles;
    private BiMap<String, String> bedrockToJavaExperimentalFeatures;
    private BiMap<String, String> bedrockToJavaBannerPatterns;
    private BiMap<String, String> bedrockToJavaPaintings;
    private Map<SharedTypes_Legacy_ActorDamageCause, String> bedrockToJavaDamageCauses;
    private Map<Enchant_Type, String> bedrockToJavaEnchantments;

    public BedrockMappingData() {
        super(BedrockProtocolVersion.bedrockLatest.getName(), ProtocolConstants.JAVA_VERSION.getName());
    }

    /*
     * WARNING - void declaration
     */
    public void load() {
        void var14_159;
        void var13_122;
        void var14_149;
        void var10_67;
        EntityTypes1_21_11[] javaIdentifier;
        Object bedrockIdentifier;
        Iterator<Map.Entry<String, Map<Integer, JavaItemMapping>>> entry8;
        void var3_11;
        ResourcePack resourcePack;
        if (Via.getManager().isDebug()) {
            this.getLogger().info("Loading " + this.unmappedVersion + " -> " + this.mappedVersion + " mappings...");
        }
        JsonObject javaViaMappingJson = this.readJson("java/via_mappings.json");
        this.bedrockResourcePacks = new HashMap<ResourcePack.Key, ResourcePack>();
        try {
            for (Map.Entry<Path, byte[]> entry2 : FileSystemUtil.getFilesInDirectory("assets/viabedrock/resource_packs").entrySet()) {
                resourcePack = new ResourcePack(new ZipContent(entry2.getValue()));
                this.bedrockResourcePacks.put(resourcePack.key(), resourcePack);
            }
        }
        catch (Exception e) {
            this.getLogger().log(Level.SEVERE, "Failed to load resource packs", e);
        }
        this.bedrockSkinPacks = new HashMap<ResourcePack.Key, ResourcePack>();
        try {
            for (Map.Entry<Path, byte[]> entry3 : FileSystemUtil.getFilesInDirectory("assets/viabedrock/skin_packs").entrySet()) {
                resourcePack = new ResourcePack(new ZipContent(entry3.getValue()));
                this.bedrockSkinPacks.put(resourcePack.key(), resourcePack);
            }
        }
        catch (Exception e) {
            this.getLogger().log(Level.SEVERE, "Failed to load skin packs", e);
        }
        JsonArray bedrockVanillaResourcePacksJson = this.readJson("custom/vanilla_resource_packs.json", JsonArray.class);
        this.bedrockVanillaResourcePacks = new ArrayList<ResourcePack>(bedrockVanillaResourcePacksJson.size());
        for (Object entry4 : bedrockVanillaResourcePacksJson) {
            ResourcePack.Key key = ResourcePack.Key.fromString(entry4.getAsString());
            if (!this.bedrockResourcePacks.containsKey((Object)key)) {
                throw new RuntimeException("Unknown bedrock vanilla resource pack: " + String.valueOf((Object)key));
            }
            this.bedrockVanillaResourcePacks.add(this.bedrockResourcePacks.get((Object)key));
        }
        JsonObject jsonObject = this.readJson("bedrock/game_rules.json");
        this.bedrockGameRules = new HashMap<String, Object>(jsonObject.size());
        for (Map.Entry entry5 : jsonObject.entrySet()) {
            this.bedrockGameRules.put(((String)entry5.getKey()).toLowerCase(Locale.ROOT), JsonUtil.getValue((JsonElement)entry5.getValue()));
        }
        this.javaRegistries = this.readNBT("java/registries.nbt");
        this.javaTags = this.readNBT("java/tags.nbt");
        JsonArray javaCommandArgumentTypesJson = javaViaMappingJson.getAsJsonArray("argumenttypes");
        this.javaCommandArgumentTypes = HashBiMap.create((int)javaCommandArgumentTypesJson.size());
        boolean bl = false;
        while (var3_11 < javaCommandArgumentTypesJson.size()) {
            this.javaCommandArgumentTypes.put((Object)Key.namespaced((String)javaCommandArgumentTypesJson.get((int)var3_11).getAsString()), (Object)((int)var3_11));
            ++var3_11;
        }
        ArgumentTypeRegistry.init();
        this.bedrockBlockStateUpgrader = new BlockStateUpgrader();
        JsonArray jsonArray = javaViaMappingJson.getAsJsonArray("blocks");
        this.javaBlocks = HashBiMap.create((int)jsonArray.size());
        for (int i = 0; i < jsonArray.size(); ++i) {
            this.javaBlocks.put((Object)Key.namespaced((String)jsonArray.get(i).getAsString()), (Object)i);
        }
        JsonArray javaBlockStatesJson = javaViaMappingJson.getAsJsonArray("blockstates");
        this.javaBlockStates = HashBiMap.create((int)javaBlockStatesJson.size());
        for (int i = 0; i < javaBlockStatesJson.size(); ++i) {
            BlockState blockState = BlockState.fromString(javaBlockStatesJson.get(i).getAsString());
            this.javaBlockStates.put((Object)blockState, (Object)i);
        }
        ListTag bedrockBlockStatesTag = this.readNBT("bedrock/block_palette.nbt").getListTag("blocks", CompoundTag.class);
        this.bedrockBlockStates = new LinkedHashSet<BedrockBlockState>(bedrockBlockStatesTag.size());
        HashMultimap bedrockBlockStatesByIdentifier = HashMultimap.create((int)bedrockBlockStatesTag.size(), (int)32);
        for (Object tag : bedrockBlockStatesTag) {
            BedrockBlockState bedrockBlockState = BedrockBlockState.fromNbt((CompoundTag)tag);
            this.bedrockBlockStates.add(bedrockBlockState);
            bedrockBlockStatesByIdentifier.put((Object)bedrockBlockState.namespacedIdentifier(), (Object)bedrockBlockState);
        }
        JsonObject bedrockToJavaBlockStateMappingsJson = this.readJson("custom/blockstate_mappings.json");
        this.bedrockToJavaBlockStates = new HashMap<BlockState, BlockState>(bedrockToJavaBlockStateMappingsJson.size());
        for (Object entry6 : bedrockToJavaBlockStateMappingsJson.entrySet()) {
            BlockState bedrockBlockState = BlockState.fromString((String)entry6.getKey());
            if (!this.bedrockBlockStates.contains(bedrockBlockState)) {
                throw new RuntimeException("Unknown bedrock block state: " + bedrockBlockState.toBlockStateString());
            }
            BlockState blockState = BlockState.fromString(((JsonElement)entry6.getValue()).getAsString());
            if (!this.javaBlockStates.containsKey((Object)blockState)) {
                throw new RuntimeException("Unknown java block state: " + blockState.toBlockStateString());
            }
            if (this.bedrockToJavaBlockStates.put(bedrockBlockState, blockState) == null) continue;
            throw new RuntimeException("Duplicate bedrock -> java block state mapping for " + bedrockBlockState.toBlockStateString());
        }
        JsonObject bedrockCustomBlockTagsJson = this.readJson("custom/block_tags.json");
        this.bedrockCustomBlockTags = new HashMap<String, String>();
        for (Object entry22 : bedrockCustomBlockTagsJson.entrySet()) {
            String string = (String)entry22.getKey();
            for (JsonElement itemIdentifierJson : ((JsonElement)entry22.getValue()).getAsJsonArray()) {
                String string2 = itemIdentifierJson.getAsString();
                if (!bedrockBlockStatesByIdentifier.containsKey((Object)string2)) {
                    throw new RuntimeException("Unknown bedrock block: " + string2);
                }
                if (this.bedrockCustomBlockTags.put(string2, string) == null) continue;
                throw new RuntimeException("Duplicate bedrock custom block tag for " + string2);
            }
        }
        JsonObject bedrockBlockTraitsJson = this.readJson("bedrock/block_traits.json");
        this.bedrockBlockTraits = new HashMap<String, Map<String, Map<String, Set<String>>>>(bedrockBlockTraitsJson.size());
        for (Map.Entry entry4 : bedrockBlockTraitsJson.entrySet()) {
            String traitName = (String)entry4.getKey();
            JsonObject enabledStatesJson = ((JsonElement)entry4.getValue()).getAsJsonObject();
            HashMap hashMap = new HashMap(enabledStatesJson.size());
            for (Map.Entry enabledStatesEntry : enabledStatesJson.entrySet()) {
                String enabledStateName = (String)enabledStatesEntry.getKey();
                JsonObject jsonObject2 = ((JsonElement)enabledStatesEntry.getValue()).getAsJsonObject();
                HashMap properties = new HashMap(jsonObject2.size());
                for (Map.Entry propertiesEntry : jsonObject2.entrySet()) {
                    String string = (String)propertiesEntry.getKey();
                    JsonArray jsonArray2 = ((JsonElement)propertiesEntry.getValue()).getAsJsonArray();
                    LinkedHashSet<String> values = new LinkedHashSet<String>(jsonArray2.size());
                    for (JsonElement valueJson : jsonArray2) {
                        if (values.add(valueJson.getAsString())) continue;
                        throw new RuntimeException("Duplicate value for property " + string + " in enabled state " + enabledStateName + " of trait " + traitName);
                    }
                    if (properties.put(string, values) == null) continue;
                    throw new RuntimeException("Duplicate property " + string + " in enabled state " + enabledStateName + " of trait " + traitName);
                }
                if (hashMap.put(enabledStateName, properties) == null) continue;
                throw new RuntimeException("Duplicate enabled state " + enabledStateName + " for trait " + traitName);
            }
            if (this.bedrockBlockTraits.put(traitName, hashMap) == null) continue;
            throw new RuntimeException("Duplicate bedrock block trait " + traitName);
        }
        JsonObject bedrockLegacyBlocksJson = this.readJson("bedrock/block_legacy_id_map.json");
        this.bedrockLegacyBlocks = HashBiMap.create((int)bedrockLegacyBlocksJson.size());
        for (Iterator entry8 : bedrockLegacyBlocksJson.entrySet()) {
            this.bedrockLegacyBlocks.put((Object)((String)entry8.getKey()).toLowerCase(Locale.ROOT), (Object)((JsonElement)entry8.getValue()).getAsInt());
        }
        this.buildLegacyBlockStateMappings();
        JsonArray jsonArray3 = this.readJson("custom/pre_waterlogged_blockstates.json", JsonArray.class);
        this.javaPreWaterloggedBlockStates = new IntOpenHashSet(jsonArray3.size());
        for (JsonElement stateJson : jsonArray3) {
            BlockState blockState = BlockState.fromString(stateJson.getAsString());
            if (!this.javaBlockStates.containsKey((Object)blockState)) {
                throw new RuntimeException("Unknown java block state: " + blockState.toBlockStateString());
            }
            this.javaPreWaterloggedBlockStates.add(((Integer)this.javaBlockStates.get((Object)blockState)).intValue());
        }
        this.javaFluidBlockStates = new IntOpenHashSet((IntCollection)this.javaPreWaterloggedBlockStates);
        for (Object entry9 : this.javaBlockStates.entrySet()) {
            if (!((BlockState)entry9.getKey()).hasProperty("waterlogged", "true") && !((BlockState)entry9.getKey()).namespacedIdentifier().equals("minecraft:lava")) continue;
            this.javaFluidBlockStates.add(((Integer)entry9.getValue()).intValue());
        }
        JsonObject javaPottedBlockStatesJson = this.readJson("custom/potted_blockstates.json");
        this.javaPottedBlockStates = new Int2IntOpenHashMap(javaPottedBlockStatesJson.size());
        for (Map.Entry entry5 : javaPottedBlockStatesJson.entrySet()) {
            BlockState blockState = BlockState.fromString((String)entry5.getKey());
            if (!this.javaBlockStates.containsKey((Object)blockState)) {
                throw new RuntimeException("Unknown java block state: " + blockState.toBlockStateString());
            }
            BlockState javaPottedBlockState = BlockState.fromString(((JsonElement)entry5.getValue()).getAsString());
            if (!this.javaBlockStates.containsKey((Object)javaPottedBlockState)) {
                throw new RuntimeException("Unknown java block state: " + javaPottedBlockState.toBlockStateString());
            }
            this.javaPottedBlockStates.put(((Integer)this.javaBlockStates.get((Object)blockState)).intValue(), ((Integer)this.javaBlockStates.get((Object)javaPottedBlockState)).intValue());
        }
        CompoundTag javaHeightMapBlockStatesTag = this.readNBT("java/heightmap_blockstates.nbt");
        this.javaHeightMapBlockStates = new HashMap<String, IntSet>(javaHeightMapBlockStatesTag.size());
        for (Map.Entry entry6 : javaHeightMapBlockStatesTag.getValue().entrySet()) {
            IntOpenHashSet blockStates = new IntOpenHashSet();
            IntArrayTag blockStatesArrayTag = (IntArrayTag)entry6.getValue();
            for (int blockState : blockStatesArrayTag.getValue()) {
                blockStates.add(blockState);
            }
            this.javaHeightMapBlockStates.put((String)entry6.getKey(), (IntSet)blockStates);
        }
        this.bedrockBiomeDefinitions = this.readNBT("bedrock/biome_definitions.nbt");
        JsonObject jsonObject3 = this.readJson("bedrock/biomes.json", JsonObject.class);
        this.bedrockBiomes = HashBiMap.create((int)jsonObject3.size());
        for (Map.Entry entry12 : jsonObject3.entrySet()) {
            String bedrockBiomeName = (String)entry12.getKey();
            if (!this.bedrockBiomeDefinitions.contains(bedrockBiomeName)) {
                throw new RuntimeException("Unknown bedrock biome: " + bedrockBiomeName);
            }
            this.bedrockBiomes.put((Object)bedrockBiomeName, (Object)((JsonElement)entry12.getValue()).getAsInt());
        }
        for (Object bedrockBiomeName : this.bedrockBiomeDefinitions.keySet()) {
            if (this.bedrockBiomes.containsKey(bedrockBiomeName)) continue;
            throw new RuntimeException("Missing bedrock biome id mapping: " + (String)bedrockBiomeName);
        }
        this.javaBiomes = HashBiMap.create((int)this.bedrockBiomes.size());
        this.javaBiomes.put((Object)"the_void", (Object)0);
        for (Object bedrockBiomeName : this.bedrockBiomes.keySet()) {
            this.javaBiomes.put(bedrockBiomeName, (Object)this.javaBiomes.size());
        }
        JsonObject bedrockToJavaBiomeExtraDataJson = this.readJson("custom/biome_extra_data.json");
        this.bedrockToJavaBiomeExtraData = new HashMap<String, Map<String, Object>>(bedrockToJavaBiomeExtraDataJson.size());
        for (Object entry13 : bedrockToJavaBiomeExtraDataJson.entrySet()) {
            String dataName = (String)entry13.getKey();
            JsonObject extraDataJson = ((JsonElement)entry13.getValue()).getAsJsonObject();
            HashMap<String, Object> extraData = new HashMap<String, Object>(extraDataJson.size());
            for (Map.Entry extraDataEntry : extraDataJson.entrySet()) {
                JsonPrimitive primitive = ((JsonElement)extraDataEntry.getValue()).getAsJsonPrimitive();
                if (primitive.isString()) {
                    extraData.put((String)extraDataEntry.getKey(), primitive.getAsString());
                    continue;
                }
                if (primitive.isNumber()) {
                    extraData.put((String)extraDataEntry.getKey(), primitive.getAsNumber().intValue());
                    continue;
                }
                if (primitive.isBoolean()) {
                    extraData.put((String)extraDataEntry.getKey(), primitive.getAsBoolean());
                    continue;
                }
                throw new IllegalArgumentException("Unknown extra data type: " + ((JsonElement)extraDataEntry.getValue()).getClass().getName());
            }
            this.bedrockToJavaBiomeExtraData.put(dataName, extraData);
        }
        this.bedrockItemUpgrader = new ItemUpgrader();
        JsonArray jsonArray4 = javaViaMappingJson.get("items").getAsJsonArray();
        this.javaItems = HashBiMap.create((int)jsonArray4.size());
        for (int i = 0; i < jsonArray4.size(); ++i) {
            this.javaItems.put((Object)Key.namespaced((String)jsonArray4.get(i).getAsString()), (Object)i);
        }
        JsonArray bedrockItemsJson = this.readJson("bedrock/runtime_item_states.json", JsonArray.class);
        HashSet<String> bedrockItems = new HashSet<String>(bedrockItemsJson.size());
        this.bedrockBlockItems = new HashSet<String>();
        this.bedrockMetaItems = new HashSet<String>();
        for (Object entry14 : bedrockItemsJson) {
            JsonObject itemEntry = entry14.getAsJsonObject();
            String identifier = itemEntry.get("name").getAsString();
            int n = itemEntry.get("id").getAsInt();
            bedrockItems.add(identifier);
            if (n <= 255) {
                this.bedrockBlockItems.add(identifier);
                continue;
            }
            this.bedrockMetaItems.add(identifier);
        }
        JsonObject bedrockItemTagsJson = this.readJson("bedrock/item_tags.json");
        this.bedrockItemTags = new HashMap<String, Set<String>>();
        for (Object entry7 : bedrockItemTagsJson.entrySet()) {
            String tagName = (String)entry7.getKey();
            for (Object itemIdentifierJson : ((JsonElement)entry7.getValue()).getAsJsonArray()) {
                String bedrockIdentifier3 = itemIdentifierJson.getAsString();
                if (!bedrockItems.contains(bedrockIdentifier3)) {
                    throw new RuntimeException("Unknown bedrock item: " + bedrockIdentifier3);
                }
                if (!this.bedrockItemTags.containsKey(bedrockIdentifier3)) {
                    this.bedrockItemTags.put(bedrockIdentifier3, new HashSet());
                }
                if (this.bedrockItemTags.get(bedrockIdentifier3).add(tagName)) continue;
                throw new RuntimeException("Duplicate bedrock item tag " + tagName + " for " + bedrockIdentifier3);
            }
        }
        JsonObject bedrockCustomItemTagsJson = this.readJson("custom/item_tags.json");
        this.bedrockCustomItemTags = new HashMap<String, String>();
        for (Iterator<Map.Entry<String, Map<Integer, JavaItemMapping>>> entry8 : bedrockCustomItemTagsJson.entrySet()) {
            String string = (String)entry8.getKey();
            for (JsonElement itemIdentifierJson : ((JsonElement)entry8.getValue()).getAsJsonArray()) {
                String string3 = itemIdentifierJson.getAsString();
                if (!bedrockItems.contains(string3)) {
                    throw new RuntimeException("Unknown bedrock item: " + string3);
                }
                if (this.bedrockCustomItemTags.put(string3, string) == null) continue;
                throw new RuntimeException("Duplicate bedrock custom item tag for " + string3);
            }
        }
        JsonObject bedrockToJavaItemMappingsJson = this.readJson("custom/item_mappings.json");
        this.bedrockToJavaBlockItems = new HashMap<String, Map<BlockState, JavaItemMapping>>(bedrockToJavaItemMappingsJson.size());
        this.bedrockToJavaMetaItems = new HashMap<String, Map<Integer, JavaItemMapping>>(bedrockToJavaItemMappingsJson.size());
        for (Map.Entry entry9 : bedrockToJavaItemMappingsJson.entrySet()) {
            bedrockIdentifier = (String)entry9.getKey();
            if (!bedrockItems.contains(bedrockIdentifier)) {
                throw new RuntimeException("Unknown bedrock item: " + (String)bedrockIdentifier);
            }
            JsonObject definition = ((JsonElement)entry9.getValue()).getAsJsonObject();
            if (definition.has("block")) {
                if (!this.bedrockBlockItems.contains(bedrockIdentifier)) {
                    throw new RuntimeException("Tried to register meta item as block item: " + (String)bedrockIdentifier);
                }
                JsonObject jsonObject4 = definition.get("block").getAsJsonObject();
                HashMap<BlockState, JavaItemMapping> hashMap = new HashMap<BlockState, JavaItemMapping>(jsonObject4.size());
                this.bedrockToJavaBlockItems.put((String)bedrockIdentifier, hashMap);
                ArrayList allPossibleStates = new ArrayList();
                for (Map.Entry entry10 : jsonObject4.entrySet()) {
                    BlockState blockState = BlockState.fromString((String)entry10.getKey());
                    String blockStateIdentifier = blockState.namespacedIdentifier();
                    ArrayList<BedrockBlockState> blockStates = new ArrayList<BedrockBlockState>();
                    for (BedrockBlockState bedrockBlockState : bedrockBlockStatesByIdentifier.get((Object)blockStateIdentifier)) {
                        if (!bedrockBlockState.properties().keySet().containsAll(blockState.properties().keySet())) {
                            throw new RuntimeException("Unknown bedrock block state property: " + String.valueOf(blockState.properties().keySet()) + " for " + blockStateIdentifier);
                        }
                        if (bedrockBlockState.properties().entrySet().containsAll(blockState.properties().entrySet())) {
                            blockStates.add(bedrockBlockState);
                        }
                        allPossibleStates.add(bedrockBlockState);
                    }
                    if (blockStates.isEmpty()) {
                        throw new RuntimeException("Unknown bedrock block state: " + blockState.toBlockStateString());
                    }
                    for (BlockState blockState2 : blockStates) {
                        if (hashMap.put(blockState2, this.parseJavaItemData(((JsonElement)entry10.getValue()).getAsJsonObject())) == null) continue;
                        throw new RuntimeException("Duplicate bedrock -> java item mapping for " + (String)bedrockIdentifier);
                    }
                }
                continue;
            }
            if (definition.has("meta")) {
                if (!this.bedrockMetaItems.contains(bedrockIdentifier)) {
                    throw new RuntimeException("Tried to register block item as meta item: " + (String)bedrockIdentifier);
                }
                JsonObject jsonObject5 = definition.get("meta").getAsJsonObject();
                HashMap<void, JavaItemMapping> hashMap = new HashMap<void, JavaItemMapping>(jsonObject5.size());
                this.bedrockToJavaMetaItems.put((String)bedrockIdentifier, hashMap);
                for (Map.Entry metaMapping : jsonObject5.entrySet()) {
                    void var17_181;
                    try {
                        Integer n = Integer.parseInt((String)metaMapping.getKey());
                    }
                    catch (NumberFormatException e) {
                        Object var17_180 = null;
                    }
                    if (hashMap.put(var17_181, this.parseJavaItemData(((JsonElement)metaMapping.getValue()).getAsJsonObject())) == null) continue;
                    throw new RuntimeException("Duplicate bedrock -> java item mapping for " + (String)bedrockIdentifier + ":" + (Integer)var17_181);
                }
                if (hashMap.containsKey(null)) continue;
                throw new RuntimeException("Missing bedrock -> java item mapping for " + (String)bedrockIdentifier + ":null");
            }
            throw new RuntimeException("Unknown item mapping definition: " + String.valueOf(definition));
        }
        for (Map.Entry<String, Map<Integer, JavaItemMapping>> entry11 : this.bedrockToJavaMetaItems.entrySet()) {
            bedrockIdentifier = entry11.getKey();
            for (Map.Entry entry12 : entry11.getValue().entrySet()) {
                String newBedrockIdentifier;
                Integer n = (Integer)entry12.getKey();
                if (n == null || (newBedrockIdentifier = this.bedrockItemUpgrader.upgradeMetaItem((String)bedrockIdentifier, n)) == null) continue;
                if (newBedrockIdentifier.equals(((JavaItemMapping)((Object)entry12.getValue())).identifier())) {
                    throw new RuntimeException("Redundant bedrock -> java item mapping for " + (String)bedrockIdentifier + ":" + n);
                }
                throw new RuntimeException("Upgraded " + (String)bedrockIdentifier + ":" + n + " to " + newBedrockIdentifier + " but it was mapped to " + ((JavaItemMapping)((Object)entry12.getValue())).identifier());
            }
        }
        entry8 = bedrockItems.iterator();
        while (entry8.hasNext()) {
            String string = (String)((Object)entry8.next());
            if (this.bedrockToJavaBlockItems.containsKey(string) || this.bedrockToJavaMetaItems.containsKey(string)) continue;
            throw new RuntimeException("Missing bedrock -> java item mapping for " + string);
        }
        JsonArray javaMenusJson = javaViaMappingJson.get("menus").getAsJsonArray();
        ArrayList<String> arrayList = new ArrayList<String>(javaMenusJson.size());
        for (JsonElement menuJson : javaMenusJson) {
            arrayList.add(Key.namespaced((String)menuJson.getAsString()));
        }
        JsonObject bedrockToJavaContainersJson = this.readJson("custom/container_mappings.json");
        this.bedrockToJavaContainers = new EnumMap<ContainerType, Integer>(ContainerType.class);
        HashSet<ContainerType> unmappedContainerTypes = new HashSet<ContainerType>();
        for (Map.Entry entry13 : bedrockToJavaContainersJson.entrySet()) {
            ContainerType bedrockContainerType = ContainerType.valueOf((String)entry13.getKey());
            if (((JsonElement)entry13.getValue()).isJsonNull()) {
                unmappedContainerTypes.add(bedrockContainerType);
                continue;
            }
            String javaIdentifier2 = ((JsonElement)entry13.getValue()).getAsString();
            int n = arrayList.indexOf(javaIdentifier2);
            if (n == -1) {
                throw new IllegalStateException("Unknown java menu: " + javaIdentifier2);
            }
            this.bedrockToJavaContainers.put(bedrockContainerType, n);
        }
        for (ContainerType containerType : ContainerType.values()) {
            if (this.bedrockToJavaContainers.containsKey((Object)containerType) || unmappedContainerTypes.contains((Object)containerType)) continue;
            throw new RuntimeException("Missing bedrock -> java container mapping for " + containerType.name());
        }
        CompoundTag compoundTag = this.readNBT("bedrock/entity_identifiers.nbt");
        ListTag entityIdentifiersListTag = compoundTag.getListTag("idlist", CompoundTag.class);
        this.bedrockEntities = HashBiMap.create((int)entityIdentifiersListTag.size());
        for (CompoundTag entry14 : entityIdentifiersListTag) {
            this.bedrockEntities.put((Object)entry14.getStringTag("id").getValue(), (Object)entry14.getIntTag("rid").asInt());
        }
        JsonObject entityDataTypesJson = this.readJson("bedrock/entity_data_types.json");
        this.bedrockEntityDataTypes = new EnumMap<ActorDataIDs, DataItemType>(ActorDataIDs.class);
        Iterator unmappedEntityDataIds = EnumSet.noneOf(ActorDataIDs.class);
        for (Object entry7 : entityDataTypesJson.entrySet()) {
            ActorDataIDs entityDataId = ActorDataIDs.valueOf((String)entry7.getKey());
            if (((JsonElement)entry7.getValue()).isJsonNull()) {
                unmappedEntityDataIds.add((ActorDataIDs)entityDataId);
                continue;
            }
            this.bedrockEntityDataTypes.put(entityDataId, DataItemType.valueOf(((JsonElement)entry7.getValue()).getAsString()));
        }
        for (ActorDataIDs actorDataIDs : ActorDataIDs.values()) {
            if (this.bedrockEntityDataTypes.containsKey((Object)actorDataIDs) || unmappedEntityDataIds.contains((Object)actorDataIDs)) continue;
            throw new RuntimeException("Missing bedrock entity data type mapping for " + actorDataIDs.name());
        }
        JsonObject entityFlagMoLangQueryMappingsJson = this.readJson("bedrock/entity_flag_molang_query_mappings.json");
        this.bedrockEntityFlagMoLangQueries = new EnumMap<ActorFlags, String>(ActorFlags.class);
        EnumSet<ActorFlags> unmappedEntityFlags = EnumSet.noneOf(ActorFlags.class);
        for (Map.Entry entry15 : entityFlagMoLangQueryMappingsJson.entrySet()) {
            ActorFlags entityFlag = ActorFlags.valueOf((String)entry15.getKey());
            if (((JsonElement)entry15.getValue()).isJsonNull()) {
                unmappedEntityFlags.add(entityFlag);
                continue;
            }
            this.bedrockEntityFlagMoLangQueries.put(entityFlag, ((JsonElement)entry15.getValue()).getAsString());
        }
        for (ActorFlags entityFlag : ActorFlags.values()) {
            if (this.bedrockEntityFlagMoLangQueries.containsKey((Object)entityFlag) || unmappedEntityFlags.contains((Object)entityFlag)) continue;
            throw new RuntimeException("Missing bedrock MoLang query mapping for " + entityFlag.name());
        }
        JsonObject bedrockToJavaEntityMappingsJson = this.readJson("custom/entity_mappings.json");
        this.bedrockToJavaEntities = new HashMap<String, EntityTypes1_21_11>(bedrockToJavaEntityMappingsJson.size());
        HashSet<String> unmappedEntities = new HashSet<String>();
        for (Map.Entry entry16 : bedrockToJavaEntityMappingsJson.entrySet()) {
            void var13_114;
            String bedrockIdentifier5 = (String)entry16.getKey();
            if (!this.bedrockEntities.containsKey((Object)bedrockIdentifier5)) {
                throw new RuntimeException("Unknown bedrock entity identifier: " + bedrockIdentifier5);
            }
            if (((JsonElement)entry16.getValue()).isJsonNull()) {
                unmappedEntities.add(bedrockIdentifier5);
                continue;
            }
            javaIdentifier = ((JsonElement)entry16.getValue()).getAsString();
            Object var13_112 = null;
            for (EntityTypes1_21_11 entityTypes1_21_11 : EntityTypes1_21_11.values()) {
                if (entityTypes1_21_11.isAbstractType() || !entityTypes1_21_11.identifier().equals(javaIdentifier)) continue;
                EntityTypes1_21_11 entityTypes1_21_112 = entityTypes1_21_11;
                break;
            }
            if (var13_114 == null) {
                throw new RuntimeException("Unknown java entity identifier: " + (String)javaIdentifier);
            }
            this.bedrockToJavaEntities.put(bedrockIdentifier5, (EntityTypes1_21_11)var13_114);
        }
        for (String string : this.bedrockEntities.keySet()) {
            if (this.bedrockToJavaEntities.containsKey(string) || unmappedEntities.contains(string)) continue;
            throw new RuntimeException("Missing bedrock -> java entity mapping for " + string);
        }
        JsonArray javaBlockEntitiesJson = javaViaMappingJson.get("blockentities").getAsJsonArray();
        this.javaBlockEntities = HashBiMap.create((int)javaBlockEntitiesJson.size());
        boolean bl2 = false;
        while (var10_67 < javaBlockEntitiesJson.size()) {
            this.javaBlockEntities.put((Object)javaBlockEntitiesJson.get((int)var10_67).getAsString(), (Object)((int)var10_67));
            ++var10_67;
        }
        JsonArray jsonArray5 = javaViaMappingJson.get("attributes").getAsJsonArray();
        this.javaEntityAttributes = HashBiMap.create((int)jsonArray5.size());
        for (int i = 0; i < jsonArray5.size(); ++i) {
            this.javaEntityAttributes.put((Object)Key.namespaced((String)jsonArray5.get(i).getAsString()), (Object)i);
        }
        JsonObject javaEntityDataFieldsJson = this.readJson("java/entity_data_fields.json");
        this.javaEntityDataFields = new EnumMap<EntityTypes1_21_11, List<String>>(EntityTypes1_21_11.class);
        for (Map.Entry entry17 : javaEntityDataFieldsJson.entrySet()) {
            if (EnumUtil.getEnumConstantOrNull(EntityTypes1_21_11.class, (String)entry17.getKey()) != null) continue;
            throw new RuntimeException("Unknown java entity type: " + (String)entry17.getKey());
        }
        javaIdentifier = EntityTypes1_21_11.values();
        int n = javaIdentifier.length;
        boolean bl3 = false;
        while (var14_149 < n) {
            EntityTypes1_21_11 type = javaIdentifier[var14_149];
            if (!type.isAbstractType()) {
                EntityTypes1_21_11 realType = type;
                ArrayList arrayList2 = new ArrayList();
                do {
                    JsonArray entityTypeFieldsJson;
                    if ((entityTypeFieldsJson = javaEntityDataFieldsJson.getAsJsonArray(type.name())) == null) continue;
                    ArrayList<String> entityTypeFields = new ArrayList<String>(entityTypeFieldsJson.size());
                    for (JsonElement jsonElement : entityTypeFieldsJson) {
                        if (arrayList2.contains(jsonElement.getAsString()) || entityTypeFields.contains(jsonElement.getAsString())) {
                            throw new IllegalStateException("Duplicate entity data field for " + realType.name() + ": " + jsonElement.getAsString());
                        }
                        entityTypeFields.add(jsonElement.getAsString());
                    }
                    arrayList2.addAll(0, entityTypeFields);
                } while ((type = (EntityTypes1_21_11)type.getParent()) != null);
                this.javaEntityDataFields.put(realType, arrayList2);
            }
            ++var14_149;
        }
        JsonArray jsonArray6 = this.readJson("java/effects.json", JsonArray.class);
        this.javaEffects = HashBiMap.create((int)jsonArray6.size());
        for (int i = 0; i < jsonArray6.size(); ++i) {
            this.javaEffects.put((Object)jsonArray6.get(i).getAsString(), (Object)i);
        }
        JsonArray bedrockEffectsJson = this.readJson("bedrock/effects.json", JsonArray.class);
        this.bedrockEffects = HashBiMap.create((int)bedrockEffectsJson.size());
        for (int i = 0; i < bedrockEffectsJson.size(); ++i) {
            this.bedrockEffects.put((Object)bedrockEffectsJson.get(i).getAsString(), (Object)(i + 1));
        }
        JsonObject bedrockToJavaEffectMappingsJson = this.readJson("custom/effect_mappings.json");
        this.bedrockToJavaEffects = new HashMap<String, String>(bedrockToJavaEffectMappingsJson.size());
        for (Map.Entry entry18 : bedrockToJavaEffectMappingsJson.entrySet()) {
            String bedrockIdentifier7 = (String)entry18.getKey();
            if (!this.bedrockEffects.containsKey((Object)bedrockIdentifier7)) {
                throw new IllegalStateException("Unknown bedrock effect: " + bedrockIdentifier7);
            }
            String javaIdentifier3 = ((JsonElement)entry18.getValue()).getAsString();
            if (!this.javaEffects.containsKey((Object)javaIdentifier3)) {
                throw new IllegalStateException("Unknown java effect: " + javaIdentifier3);
            }
            this.bedrockToJavaEffects.put(bedrockIdentifier7, javaIdentifier3);
        }
        for (Object bedrockIdentifier8 : this.bedrockEffects.keySet()) {
            if (this.bedrockToJavaEffects.containsKey(bedrockIdentifier8)) continue;
            throw new IllegalStateException("Missing bedrock -> java effect mapping for " + (String)bedrockIdentifier8);
        }
        JsonArray jsonArray7 = javaViaMappingJson.get("sounds").getAsJsonArray();
        this.javaSounds = HashBiMap.create((int)jsonArray7.size());
        for (int i = 0; i < jsonArray7.size(); ++i) {
            this.javaSounds.put((Object)Key.namespaced((String)jsonArray7.get(i).getAsString()), (Object)i);
        }
        JsonArray javaParticlesJson = javaViaMappingJson.get("particles").getAsJsonArray();
        this.javaParticles = HashBiMap.create((int)javaParticlesJson.size());
        for (int i = 0; i < javaParticlesJson.size(); ++i) {
            this.javaParticles.put((Object)Key.namespaced((String)javaParticlesJson.get(i).getAsString()), (Object)i);
        }
        JsonObject bedrockSoundsJson = this.readJson("bedrock/sounds.json");
        HashMap<String, String> bedrockSounds = new HashMap<String, String>(bedrockSoundsJson.size());
        for (Object entry20 : bedrockSoundsJson.entrySet()) {
            bedrockSounds.put((String)entry20.getKey(), ((JsonElement)entry20.getValue()).getAsString());
        }
        JsonObject bedrockBlockSoundsJson = this.readJson("bedrock/block_sounds.json");
        this.bedrockBlockSounds = new HashMap<String, String>(bedrockBlockSoundsJson.size());
        for (Map.Entry entry21 : bedrockBlockSoundsJson.entrySet()) {
            this.bedrockBlockSounds.put((String)entry21.getKey(), ((JsonElement)entry21.getValue()).getAsString());
        }
        JsonObject bedrockLevelSoundEventMappingsJson = this.readJson("bedrock/level_sound_event_mappings.json");
        this.bedrockLevelSoundEvents = new EnumMap<SharedTypes_Legacy_LevelSoundEvent, Map<String, SoundDefinitions.ConfiguredSound>>(SharedTypes_Legacy_LevelSoundEvent.class);
        EnumSet<SharedTypes_Legacy_LevelSoundEvent> unmappedLevelSoundEvents = EnumSet.noneOf(SharedTypes_Legacy_LevelSoundEvent.class);
        for (Map.Entry entry22 : bedrockLevelSoundEventMappingsJson.entrySet()) {
            SharedTypes_Legacy_LevelSoundEvent soundEvent = SharedTypes_Legacy_LevelSoundEvent.valueOf((String)entry22.getKey());
            if (((JsonElement)entry22.getValue()).isJsonNull()) {
                unmappedLevelSoundEvents.add(soundEvent);
                continue;
            }
            JsonObject jsonObject6 = ((JsonElement)entry22.getValue()).getAsJsonObject();
            HashMap<String, SoundDefinitions.ConfiguredSound> hashMap = new HashMap<String, SoundDefinitions.ConfiguredSound>(jsonObject6.size());
            for (Map.Entry soundEventEntry : jsonObject6.entrySet()) {
                SoundDefinitions.ConfiguredSound configuredSound;
                String[] stringArray = ((String)soundEventEntry.getKey()).split(":", 2);
                if (stringArray[0].equals("entity")) {
                    if (!this.bedrockEntities.containsKey((Object)stringArray[1])) {
                        throw new RuntimeException("Unknown bedrock entity: " + stringArray[1]);
                    }
                } else if (stringArray[0].equals("block")) {
                    if (!this.bedrockBlockSounds.containsValue(stringArray[1])) {
                        throw new RuntimeException("Unknown bedrock block sound: " + stringArray[1]);
                    }
                } else if (!stringArray[0].isEmpty()) {
                    throw new RuntimeException("Unknown bedrock level sound event definition: " + (String)soundEventEntry.getKey());
                }
                if (!bedrockSounds.containsKey((configuredSound = SoundDefinitions.ConfiguredSound.fromJson(((JsonElement)soundEventEntry.getValue()).getAsJsonObject())).sound())) {
                    throw new RuntimeException("Unknown bedrock sound: " + configuredSound.sound());
                }
                if (((String)soundEventEntry.getKey()).isEmpty()) {
                    hashMap.put(null, configuredSound);
                    continue;
                }
                hashMap.put(stringArray[1], configuredSound);
            }
            this.bedrockLevelSoundEvents.put(soundEvent, hashMap);
        }
        for (SharedTypes_Legacy_LevelSoundEvent sharedTypes_Legacy_LevelSoundEvent : SharedTypes_Legacy_LevelSoundEvent.values()) {
            if (this.bedrockLevelSoundEvents.containsKey((Object)sharedTypes_Legacy_LevelSoundEvent) || unmappedLevelSoundEvents.contains((Object)sharedTypes_Legacy_LevelSoundEvent)) continue;
            throw new RuntimeException("Missing bedrock -> java level sound event mapping for " + sharedTypes_Legacy_LevelSoundEvent.name());
        }
        JsonObject jsonObject7 = this.readJson("custom/note_block_instrument_mappings.json");
        this.bedrockNoteBlockInstrumentSounds = new EnumMap<NoteBlockInstrument, String>(NoteBlockInstrument.class);
        for (Map.Entry entry23 : jsonObject7.entrySet()) {
            NoteBlockInstrument noteBlockInstrument = NoteBlockInstrument.valueOf((String)entry23.getKey());
            String string = ((JsonElement)entry23.getValue()).getAsString();
            if (!bedrockSounds.containsKey(string)) {
                throw new RuntimeException("Unknown bedrock sound: " + string);
            }
            this.bedrockNoteBlockInstrumentSounds.put(noteBlockInstrument, string);
        }
        NoteBlockInstrument[] entry22 = NoteBlockInstrument.values();
        int entry23 = entry22.length;
        boolean bl4 = false;
        while (var13_122 < entry23) {
            NoteBlockInstrument noteBlockInstrument = entry22[var13_122];
            if (!this.bedrockNoteBlockInstrumentSounds.containsKey((Object)noteBlockInstrument)) {
                throw new RuntimeException("Missing bedrock -> java note block instrument mapping for " + noteBlockInstrument.name());
            }
            ++var13_122;
        }
        JsonObject bedrockToJavaSoundCategoryMappingsJson = this.readJson("custom/sound_category_mappings.json");
        HashMap<String, SoundSource> bedrockToJavaSoundCategories = new HashMap<String, SoundSource>(bedrockToJavaSoundCategoryMappingsJson.size());
        for (Map.Entry entry19 : bedrockToJavaSoundCategoryMappingsJson.entrySet()) {
            String bedrockName = (String)entry19.getKey();
            if (!bedrockSounds.containsValue(bedrockName)) {
                throw new IllegalStateException("Unknown bedrock sound category: " + bedrockName);
            }
            SoundSource javaCategory = SoundSource.valueOf(((JsonElement)entry19.getValue()).getAsString());
            bedrockToJavaSoundCategories.put(bedrockName, javaCategory);
        }
        for (String string : bedrockSounds.values()) {
            if (bedrockToJavaSoundCategories.containsKey(string)) continue;
            throw new IllegalStateException("Missing bedrock -> java sound category mapping for " + string);
        }
        JsonObject jsonObject8 = this.readJson("custom/sound_mappings.json");
        this.bedrockToJavaSounds = new HashMap<String, JavaSound>(jsonObject8.size());
        HashSet<String> hashSet = new HashSet<String>();
        for (Map.Entry entry25 : jsonObject8.entrySet()) {
            String string = (String)entry25.getKey();
            if (!bedrockSounds.containsKey(string)) {
                throw new IllegalStateException("Unknown bedrock sound: " + string);
            }
            if (((JsonElement)entry25.getValue()).isJsonNull()) {
                hashSet.add(string);
                continue;
            }
            String javaIdentifier4 = ((JsonElement)entry25.getValue()).getAsString();
            if (!this.javaSounds.containsKey((Object)javaIdentifier4)) {
                throw new IllegalStateException("Unknown java sound: " + javaIdentifier4);
            }
            JavaSound javaSoundMapping = new JavaSound((Integer)this.javaSounds.get((Object)javaIdentifier4), javaIdentifier4, (SoundSource)((Object)bedrockToJavaSoundCategories.get(bedrockSounds.get(string))));
            this.bedrockToJavaSounds.put(string, javaSoundMapping);
        }
        for (String bedrockIdentifier10 : bedrockSounds.keySet()) {
            if (this.bedrockToJavaSounds.containsKey(bedrockIdentifier10) || hashSet.contains(bedrockIdentifier10)) continue;
            throw new IllegalStateException("Missing bedrock -> java sound mapping for " + bedrockIdentifier10);
        }
        JsonArray bedrockParticlesJson = this.readJson("bedrock/particles.json", JsonArray.class);
        ArrayList<String> bedrockParticles = new ArrayList<String>(bedrockParticlesJson.size());
        for (JsonElement particleJson : bedrockParticlesJson) {
            bedrockParticles.add(particleJson.getAsString());
        }
        JsonObject jsonObject9 = this.readJson("custom/particle_mappings.json");
        this.bedrockToJavaParticles = new HashMap<String, JavaParticle>(jsonObject9.size());
        HashSet<String> unmappedParticles = new HashSet<String>();
        for (Map.Entry entry26 : jsonObject9.entrySet()) {
            String string = (String)entry26.getKey();
            if (!bedrockParticles.contains(string)) {
                throw new IllegalStateException("Unknown bedrock particle: " + string);
            }
            if (((JsonElement)entry26.getValue()).isJsonNull()) {
                unmappedParticles.add(string);
                continue;
            }
            if (((JsonElement)entry26.getValue()).isJsonObject()) {
                this.bedrockToJavaParticles.put(string, this.parseJavaParticle(((JsonElement)entry26.getValue()).getAsJsonObject()));
                continue;
            }
            String string4 = ((JsonElement)entry26.getValue()).getAsString();
            if (!this.javaParticles.containsKey((Object)string4)) {
                throw new IllegalStateException("Unknown java particle: " + string4);
            }
            JavaParticle javaParticleMapping = new JavaParticle(new Particle(((Integer)this.javaParticles.get((Object)string4)).intValue()), 0.0f, 0.0f, 0.0f, 0.0f, 0);
            this.bedrockToJavaParticles.put(string, javaParticleMapping);
        }
        for (String bedrockIdentifier12 : bedrockParticles) {
            if (this.bedrockToJavaParticles.containsKey(bedrockIdentifier12) || unmappedParticles.contains(bedrockIdentifier12)) continue;
            throw new IllegalStateException("Missing bedrock -> java particle mapping for " + bedrockIdentifier12);
        }
        JsonObject bedrockToJavaLevelEventMappingsJson = this.readJson("custom/level_event_mappings.json");
        this.bedrockToJavaLevelEvents = new EnumMap<net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent, LevelEventMapping>(net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.class);
        EnumSet<net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent> unmappedLevelEvents = EnumSet.noneOf(net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.class);
        for (Map.Entry entry20 : bedrockToJavaLevelEventMappingsJson.entrySet()) {
            net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent levelEvent = net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.valueOf((String)entry20.getKey());
            if (((JsonElement)entry20.getValue()).isJsonNull()) {
                unmappedLevelEvents.add(levelEvent);
                continue;
            }
            if (((JsonElement)entry20.getValue()).isJsonObject()) {
                JsonObject mapping = ((JsonElement)entry20.getValue()).getAsJsonObject();
                if (mapping.has("event")) {
                    Integer data = mapping.has("data") ? Integer.valueOf(mapping.get("data").getAsInt()) : null;
                    JavaLevelEvent javaLevelEvent = new JavaLevelEvent(LevelEvent.valueOf(mapping.get("event").getAsString()), data);
                    this.bedrockToJavaLevelEvents.put(levelEvent, javaLevelEvent);
                    continue;
                }
                if (mapping.has("sound")) {
                    String bedrockSound = mapping.get("sound").getAsString();
                    if (!this.bedrockToJavaSounds.containsKey(bedrockSound)) {
                        throw new IllegalStateException("Unknown bedrock sound: " + bedrockSound);
                    }
                    if (mapping.has("event")) {
                        Integer data = mapping.has("data") ? Integer.valueOf(mapping.get("data").getAsInt()) : null;
                        JavaLevelEvent javaLevelEvent = new JavaLevelEvent(LevelEvent.valueOf(mapping.get("event").getAsString()), data);
                        this.bedrockToJavaLevelEvents.put(levelEvent, (LevelEventMapping)new JavaSoundLevelEvent(this.bedrockToJavaSounds.get(bedrockSound), javaLevelEvent));
                        continue;
                    }
                    this.bedrockToJavaLevelEvents.put(levelEvent, this.bedrockToJavaSounds.get(bedrockSound));
                    continue;
                }
                if (mapping.has("particle")) {
                    this.bedrockToJavaLevelEvents.put(levelEvent, this.parseJavaParticle(mapping));
                    continue;
                }
                throw new IllegalStateException("Unknown level event mapping: " + String.valueOf(mapping));
            }
            this.bedrockToJavaLevelEvents.put(levelEvent, new JavaLevelEvent(LevelEvent.valueOf(((JsonElement)entry20.getValue()).getAsString()), null));
        }
        for (net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent levelEvent : net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent.values()) {
            if (this.bedrockToJavaLevelEvents.containsKey((Object)levelEvent) || unmappedLevelEvents.contains((Object)levelEvent)) continue;
            throw new RuntimeException("Missing bedrock -> java level event mapping for " + levelEvent.name());
        }
        JsonObject jsonObject10 = this.readJson("custom/level_event_particle_mappings.json");
        this.bedrockToJavaLevelEventParticles = new EnumMap<ParticleType, JavaParticle>(ParticleType.class);
        EnumSet<ParticleType> enumSet = EnumSet.noneOf(ParticleType.class);
        for (Map.Entry entry28 : jsonObject10.entrySet()) {
            ParticleType particleType = ParticleType.valueOf((String)entry28.getKey());
            if (((JsonElement)entry28.getValue()).isJsonNull()) {
                enumSet.add(particleType);
                continue;
            }
            if (((JsonElement)entry28.getValue()).isJsonObject()) {
                this.bedrockToJavaLevelEventParticles.put(particleType, this.parseJavaParticle(((JsonElement)entry28.getValue()).getAsJsonObject()));
                continue;
            }
            String javaIdentifier5 = ((JsonElement)entry28.getValue()).getAsString();
            if (!this.javaParticles.containsKey((Object)javaIdentifier5)) {
                throw new IllegalStateException("Unknown java particle: " + javaIdentifier5);
            }
            JavaParticle javaParticleMapping = new JavaParticle(new Particle(((Integer)this.javaParticles.get((Object)javaIdentifier5)).intValue()), 0.0f, 0.0f, 0.0f, 0.0f, 0);
            this.bedrockToJavaLevelEventParticles.put(particleType, javaParticleMapping);
        }
        for (ParticleType particleType : ParticleType.values()) {
            if (this.bedrockToJavaLevelEventParticles.containsKey((Object)particleType) || enumSet.contains((Object)particleType)) continue;
            throw new RuntimeException("Missing bedrock -> java level event particle mapping for " + particleType.name());
        }
        JsonObject jsonObject11 = this.readJson("custom/experimental_feature_mappings.json");
        this.bedrockToJavaExperimentalFeatures = HashBiMap.create((int)jsonObject11.size());
        for (Map.Entry entry29 : jsonObject11.entrySet()) {
            this.bedrockToJavaExperimentalFeatures.put((Object)((String)entry29.getKey()), (Object)((JsonElement)entry29.getValue()).getAsString());
        }
        CompoundTag javaBannerPatternRegistry = this.javaRegistries.getCompoundTag("minecraft:banner_pattern");
        JsonObject bedrockToJavaBannerPatternMappingsJson = this.readJson("custom/banner_pattern_mappings.json");
        this.bedrockToJavaBannerPatterns = HashBiMap.create((int)bedrockToJavaBannerPatternMappingsJson.size());
        for (Map.Entry entry18 : bedrockToJavaBannerPatternMappingsJson.entrySet()) {
            String javaIdentifier6 = ((JsonElement)entry18.getValue()).getAsString();
            if (!javaBannerPatternRegistry.contains(javaIdentifier6)) {
                throw new RuntimeException("Unknown java banner pattern: " + (String)javaIdentifier6);
            }
            this.bedrockToJavaBannerPatterns.put((Object)((String)entry18.getKey()), (Object)javaIdentifier6);
        }
        CompoundTag javaPaintingVariantRegistry = this.javaRegistries.getCompoundTag("minecraft:painting_variant");
        JsonObject bedrockToJavaPaintingMappingsJson = this.readJson("custom/painting_mappings.json");
        this.bedrockToJavaPaintings = HashBiMap.create((int)bedrockToJavaPaintingMappingsJson.size());
        for (Map.Entry entry21 : bedrockToJavaPaintingMappingsJson.entrySet()) {
            String string = ((JsonElement)entry21.getValue()).getAsString();
            if (!javaPaintingVariantRegistry.contains(string)) {
                throw new RuntimeException("Unknown java painting: " + string);
            }
            this.bedrockToJavaPaintings.put((Object)((String)entry21.getKey()), (Object)string);
        }
        CompoundTag javaDamageTypeRegistry = this.javaRegistries.getCompoundTag("minecraft:damage_type");
        JsonObject bedrockToJavaDamageCauseMappingsJson = this.readJson("custom/damage_cause_mappings.json");
        this.bedrockToJavaDamageCauses = new EnumMap<SharedTypes_Legacy_ActorDamageCause, String>(SharedTypes_Legacy_ActorDamageCause.class);
        for (Map.Entry entry24 : bedrockToJavaDamageCauseMappingsJson.entrySet()) {
            SharedTypes_Legacy_ActorDamageCause damageCause = SharedTypes_Legacy_ActorDamageCause.valueOf((String)entry24.getKey());
            String string = ((JsonElement)entry24.getValue()).getAsString();
            if (!javaDamageTypeRegistry.contains(string)) {
                throw new RuntimeException("Unknown java damage type: " + string);
            }
            this.bedrockToJavaDamageCauses.put(damageCause, string);
        }
        for (SharedTypes_Legacy_ActorDamageCause sharedTypes_Legacy_ActorDamageCause : SharedTypes_Legacy_ActorDamageCause.values()) {
            if (this.bedrockToJavaDamageCauses.containsKey((Object)sharedTypes_Legacy_ActorDamageCause)) continue;
            throw new RuntimeException("Missing bedrock -> java damage cause mapping for " + sharedTypes_Legacy_ActorDamageCause.name());
        }
        CompoundTag compoundTag2 = this.javaRegistries.getCompoundTag("minecraft:enchantment");
        JsonObject bedrockToJavaEnchantmentMappingsJson = this.readJson("custom/enchantment_mappings.json");
        this.bedrockToJavaEnchantments = new EnumMap<Enchant_Type, String>(Enchant_Type.class);
        for (Map.Entry entry25 : bedrockToJavaEnchantmentMappingsJson.entrySet()) {
            Enchant_Type enchant_Type = Enchant_Type.valueOf((String)entry25.getKey());
            String javaIdentifier7 = ((JsonElement)entry25.getValue()).getAsString();
            if (!compoundTag2.contains(javaIdentifier7)) {
                throw new RuntimeException("Unknown java enchantment: " + javaIdentifier7);
            }
            this.bedrockToJavaEnchantments.put(enchant_Type, javaIdentifier7);
        }
        Enchant_Type[] enchant_TypeArray = Enchant_Type.values();
        int n2 = enchant_TypeArray.length;
        boolean bl5 = false;
        while (var14_159 < n2) {
            Enchant_Type enchantType = enchant_TypeArray[var14_159];
            if (!this.bedrockToJavaEnchantments.containsKey((Object)enchantType)) {
                throw new RuntimeException("Missing bedrock -> java enchantment mapping for " + enchantType.name());
            }
            ++var14_159;
        }
        DataValues.validate();
    }

    protected Logger getLogger() {
        return ViaBedrock.getPlatform().getLogger();
    }

    public Map<NoteBlockInstrument, String> getBedrockNoteBlockInstrumentSounds() {
        return this.bedrockNoteBlockInstrumentSounds;
    }

    public Map<String, String> getBedrockCustomBlockTags() {
        return this.bedrockCustomBlockTags;
    }

    public Map<ResourcePack.Key, ResourcePack> getBedrockResourcePacks() {
        return this.bedrockResourcePacks;
    }

    public Set<BedrockBlockState> getBedrockBlockStates() {
        return this.bedrockBlockStates;
    }

    public Map<String, Map<String, Map<String, Set<String>>>> getBedrockBlockTraits() {
        return this.bedrockBlockTraits;
    }

    public Map<ResourcePack.Key, ResourcePack> getBedrockSkinPacks() {
        return this.bedrockSkinPacks;
    }

    public Map<String, Object> getBedrockGameRules() {
        return this.bedrockGameRules;
    }

    public Map<String, String> getBedrockBlockSounds() {
        return this.bedrockBlockSounds;
    }

    public Map<String, Map<Integer, JavaItemMapping>> getBedrockToJavaMetaItems() {
        return this.bedrockToJavaMetaItems;
    }

    public Map<SharedTypes_Legacy_LevelSoundEvent, Map<String, SoundDefinitions.ConfiguredSound>> getBedrockLevelSoundEvents() {
        return this.bedrockLevelSoundEvents;
    }

    public Map<String, JavaParticle> getBedrockToJavaParticles() {
        return this.bedrockToJavaParticles;
    }

    public Map<String, EntityTypes1_21_11> getBedrockToJavaEntities() {
        return this.bedrockToJavaEntities;
    }

    public BiMap<String, Integer> getBedrockLegacyBlocks() {
        return this.bedrockLegacyBlocks;
    }

    public CompoundTag getBedrockBiomeDefinitions() {
        return this.bedrockBiomeDefinitions;
    }

    public BiMap<String, Integer> getJavaBlockEntities() {
        return this.javaBlockEntities;
    }

    public BiMap<String, Integer> getJavaEntityAttributes() {
        return this.javaEntityAttributes;
    }

    public BiMap<String, String> getBedrockToJavaPaintings() {
        return this.bedrockToJavaPaintings;
    }

    public Map<String, String> getBedrockToJavaEffects() {
        return this.bedrockToJavaEffects;
    }

    public Map<String, JavaSound> getBedrockToJavaSounds() {
        return this.bedrockToJavaSounds;
    }

    public ItemUpgrader getBedrockItemUpgrader() {
        return this.bedrockItemUpgrader;
    }

    public Int2IntMap getJavaPottedBlockStates() {
        return this.javaPottedBlockStates;
    }

    public Map<ActorDataIDs, DataItemType> getBedrockEntityDataTypes() {
        return this.bedrockEntityDataTypes;
    }

    public Map<EntityTypes1_21_11, List<String>> getJavaEntityDataFields() {
        return this.javaEntityDataFields;
    }

    public Map<String, Map<BlockState, JavaItemMapping>> getBedrockToJavaBlockItems() {
        return this.bedrockToJavaBlockItems;
    }

    public Map<ContainerType, Integer> getBedrockToJavaContainers() {
        return this.bedrockToJavaContainers;
    }

    public IntSet getJavaFluidBlockStates() {
        return this.javaFluidBlockStates;
    }

    public Map<String, String> getBedrockCustomItemTags() {
        return this.bedrockCustomItemTags;
    }

    public Set<String> getBedrockBlockItems() {
        return this.bedrockBlockItems;
    }

    public Set<String> getBedrockMetaItems() {
        return this.bedrockMetaItems;
    }

    public BiMap<String, String> getBedrockToJavaExperimentalFeatures() {
        return this.bedrockToJavaExperimentalFeatures;
    }

    public Map<ParticleType, JavaParticle> getBedrockToJavaLevelEventParticles() {
        return this.bedrockToJavaLevelEventParticles;
    }

    private JavaItemMapping parseJavaItemData(JsonObject obj) {
        String javaIdentifier = obj.get("java_id").getAsString();
        if (!this.javaItems.containsKey((Object)javaIdentifier)) {
            throw new RuntimeException("Unknown java item: " + javaIdentifier);
        }
        String javaName = obj.has("java_name") ? obj.get("java_name").getAsString() : null;
        CompoundTag javaTag = null;
        try {
            if (obj.has("java_tag")) {
                javaTag = SNBT.deserializeCompoundTag((String)obj.get("java_tag").getAsString());
            }
        }
        catch (Throwable e) {
            throw new RuntimeException("Failed to parse java tag for " + javaIdentifier, e);
        }
        return new JavaItemMapping((Integer)this.javaItems.get((Object)javaIdentifier), javaIdentifier, javaName, javaTag);
    }

    private JavaParticle parseJavaParticle(JsonObject obj) {
        String javaIdentifier = obj.get("particle").getAsString();
        if (!this.javaParticles.containsKey((Object)javaIdentifier)) {
            throw new IllegalStateException("Unknown java particle: " + javaIdentifier);
        }
        float offsetX = obj.has("offset_x") ? obj.get("offset_x").getAsFloat() : 0.0f;
        float offsetY = obj.has("offset_y") ? obj.get("offset_y").getAsFloat() : 0.0f;
        float offsetZ = obj.has("offset_z") ? obj.get("offset_z").getAsFloat() : 0.0f;
        float speed = obj.has("speed") ? obj.get("speed").getAsFloat() : 0.0f;
        int count = obj.has("count") ? obj.get("count").getAsInt() : 0;
        Particle particle = new Particle(((Integer)this.javaParticles.get((Object)javaIdentifier)).intValue());
        if (obj.has("arguments")) {
            block16: for (JsonElement argument : obj.get("arguments").getAsJsonArray()) {
                String type;
                JsonObject argumentObject = argument.getAsJsonObject();
                switch (type = argumentObject.get("type").getAsString()) {
                    case "var_int": {
                        particle.add((Type)Types.VAR_INT, (Object)argumentObject.get("value").getAsInt());
                        continue block16;
                    }
                    case "float": {
                        particle.add((Type)Types.FLOAT, (Object)Float.valueOf(argumentObject.get("value").getAsFloat()));
                        continue block16;
                    }
                    case "double": {
                        particle.add((Type)Types.DOUBLE, (Object)argumentObject.get("value").getAsDouble());
                        continue block16;
                    }
                    case "int": {
                        particle.add((Type)Types.INT, (Object)argumentObject.get("value").getAsInt());
                        continue block16;
                    }
                    case "block_state": {
                        BlockState javaBlockState = BlockState.fromString(argumentObject.get("value").getAsString());
                        if (!this.javaBlockStates.containsKey((Object)javaBlockState)) {
                            throw new IllegalStateException("Unknown java block state: " + javaBlockState.toBlockStateString());
                        }
                        particle.add((Type)Types.VAR_INT, (Object)((Integer)this.javaBlockStates.get((Object)javaBlockState)));
                        continue block16;
                    }
                    case "item_stack": {
                        String identifier = argumentObject.get("value").getAsString();
                        if (!this.javaItems.containsKey((Object)identifier)) {
                            throw new IllegalStateException("Unknown java item: " + identifier);
                        }
                        particle.add(VersionedTypes.V26_1.item, (Object)new StructuredItem(((Integer)this.javaItems.get((Object)identifier)).intValue(), 1, ProtocolConstants.createStructuredDataContainer()));
                        continue block16;
                    }
                }
                throw new IllegalStateException("Unknown particle argument type: " + type);
            }
        }
        return new JavaParticle(particle, offsetX, offsetY, offsetZ, speed, count);
    }

    public BiMap<String, Integer> getBedrockEntities() {
        return this.bedrockEntities;
    }

    public BiMap<String, Integer> getJavaBlocks() {
        return this.javaBlocks;
    }

    public BiMap<BlockState, Integer> getJavaBlockStates() {
        return this.javaBlockStates;
    }

    public CompoundTag getJavaTags() {
        return this.javaTags;
    }

    public BiMap<String, Integer> getJavaBiomes() {
        return this.javaBiomes;
    }

    public BiMap<String, Integer> getJavaItems() {
        return this.javaItems;
    }

    public BiMap<String, Integer> getJavaEffects() {
        return this.javaEffects;
    }

    public BiMap<String, Integer> getBedrockEffects() {
        return this.bedrockEffects;
    }

    public BiMap<String, Integer> getJavaSounds() {
        return this.javaSounds;
    }

    public BiMap<String, Integer> getJavaParticles() {
        return this.javaParticles;
    }

    public CompoundTag getJavaRegistries() {
        return this.javaRegistries;
    }

    public BiMap<String, Integer> getBedrockBiomes() {
        return this.bedrockBiomes;
    }

    public Map<String, Set<String>> getBedrockItemTags() {
        return this.bedrockItemTags;
    }

    public Map<ActorFlags, String> getBedrockEntityFlagMoLangQueries() {
        return this.bedrockEntityFlagMoLangQueries;
    }

    public Map<Enchant_Type, String> getBedrockToJavaEnchantments() {
        return this.bedrockToJavaEnchantments;
    }

    public BiMap<String, String> getBedrockToJavaBannerPatterns() {
        return this.bedrockToJavaBannerPatterns;
    }

    public Map<SharedTypes_Legacy_ActorDamageCause, String> getBedrockToJavaDamageCauses() {
        return this.bedrockToJavaDamageCauses;
    }

    public Map<net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.LevelEvent, LevelEventMapping> getBedrockToJavaLevelEvents() {
        return this.bedrockToJavaLevelEvents;
    }

    private JsonObject readJson(String file) {
        return this.readJson(file, JsonObject.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <T> T readJson(String file, Class<T> classOfT) {
        file = "assets/viabedrock/data/" + (String)file;
        try (InputStream inputStream = ((Object)((Object)this)).getClass().getClassLoader().getResourceAsStream((String)file);){
            if (inputStream == null) {
                this.getLogger().severe("Failed to open " + (String)file);
                T t = null;
                return t;
            }
            Object object = GsonUtil.getGson().fromJson((Reader)new InputStreamReader(inputStream), classOfT);
            return (T)object;
        }
        catch (IOException e) {
            this.getLogger().log(Level.SEVERE, "Failed to read " + (String)file, e);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private CompoundTag readNBT(String file) {
        file = "assets/viabedrock/data/" + (String)file;
        try (InputStream inputStream = ((Object)((Object)this)).getClass().getClassLoader().getResourceAsStream((String)file);){
            if (inputStream == null) {
                this.getLogger().severe("Failed to open " + (String)file);
                CompoundTag compoundTag2 = null;
                return compoundTag2;
            }
            CompoundTag compoundTag = (CompoundTag)NBTIO.readTag((DataInput)new DataInputStream(new GZIPInputStream(inputStream)), (TagLimiter)TagLimiter.noop(), (boolean)true, CompoundTag.class);
            return compoundTag;
        }
        catch (IOException e) {
            this.getLogger().log(Level.SEVERE, "Failed to read " + (String)file, e);
            return null;
        }
    }

    public Map<BlockState, BlockState> getBedrockToJavaBlockStates() {
        return this.bedrockToJavaBlockStates;
    }

    public IntSet getJavaPreWaterloggedBlockStates() {
        return this.javaPreWaterloggedBlockStates;
    }

    public List<ResourcePack> getBedrockVanillaResourcePacks() {
        return this.bedrockVanillaResourcePacks;
    }

    public Map<String, IntSet> getJavaHeightMapBlockStates() {
        return this.javaHeightMapBlockStates;
    }

    public Map<String, Map<String, Object>> getBedrockToJavaBiomeExtraData() {
        return this.bedrockToJavaBiomeExtraData;
    }

    public BiMap<String, Integer> getJavaCommandArgumentTypes() {
        return this.javaCommandArgumentTypes;
    }

    public Int2ObjectMap<BedrockBlockState> getBedrockLegacyBlockStates() {
        return this.bedrockLegacyBlockStates;
    }

    public BlockStateUpgrader getBedrockBlockStateUpgrader() {
        return this.bedrockBlockStateUpgrader;
    }

    private void buildLegacyBlockStateMappings() {
        try (InputStream inputStream = ((Object)((Object)this)).getClass().getClassLoader().getResourceAsStream("assets/viabedrock/data/bedrock/block_id_meta_to_1_12_0_nbt.bin");){
            if (inputStream == null) {
                this.getLogger().severe("Failed to open block_id_meta_to_1_12_0_nbt.bin");
                return;
            }
            byte[] bytes = inputStream.readAllBytes();
            ByteBuf buf = Unpooled.wrappedBuffer((byte[])bytes);
            this.bedrockLegacyBlockStates = new Int2ObjectOpenHashMap();
            int blockCount = BedrockTypes.UNSIGNED_VAR_INT.read(buf);
            for (int i = 0; i < blockCount; ++i) {
                String identifier = ((String)BedrockTypes.STRING.read(buf)).toLowerCase(Locale.ROOT);
                if (!this.bedrockLegacyBlocks.containsKey((Object)identifier)) {
                    throw new RuntimeException("Unknown block identifier in block_id_meta_to_1_12_0_nbt.bin: " + identifier);
                }
                int id = (Integer)this.bedrockLegacyBlocks.get((Object)identifier);
                int metaCount = BedrockTypes.UNSIGNED_VAR_INT.read(buf);
                for (int i1 = 0; i1 < metaCount; ++i1) {
                    int metadata = BedrockTypes.UNSIGNED_VAR_INT.read(buf);
                    CompoundTag tag = (CompoundTag)BedrockTypes.TAG_LE.read(buf);
                    this.bedrockBlockStateUpgrader.upgradeToLatest(tag);
                    BedrockBlockState bedrockBlockState = BedrockBlockState.fromNbt(tag);
                    if (!this.bedrockBlockStates.contains(bedrockBlockState)) {
                        throw new RuntimeException("Legacy block state " + bedrockBlockState.toBlockStateString() + " is not mapped to a modern block state");
                    }
                    this.bedrockLegacyBlockStates.put(id << 6 | metadata & 0x3F, (Object)bedrockBlockState);
                }
            }
        }
        catch (Exception e) {
            this.getLogger().log(Level.SEVERE, "Failed to read block_id_meta_to_1_12_0_nbt.bin", e);
            this.bedrockLegacyBlockStates = null;
        }
    }

    public record JavaItemMapping(int id, String identifier, String name, CompoundTag overrideTag) {
    }

    public record JavaSound(int id, String identifier, SoundSource category) implements LevelEventMapping
    {
    }

    public record JavaParticle(Particle particle, float offsetX, float offsetY, float offsetZ, float speed, int count) implements LevelEventMapping
    {
        public JavaParticle withCount(int count) {
            return new JavaParticle(this.particle, this.offsetX, this.offsetY, this.offsetZ, this.speed, count);
        }

        public JavaParticle withParticle(Particle particle) {
            return new JavaParticle(particle, this.offsetX, this.offsetY, this.offsetZ, this.speed, this.count);
        }
    }

    public record JavaLevelEvent(LevelEvent levelEvent, Integer data) implements LevelEventMapping
    {
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static interface LevelEventMapping {
    }
}

