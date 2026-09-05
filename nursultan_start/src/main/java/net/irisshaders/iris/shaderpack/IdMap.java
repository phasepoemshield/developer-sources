/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntFunction
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.helpers.StringPair
 *  net.irisshaders.iris.shaderpack.materialmap.TagEntry
 *  net.irisshaders.iris.shaderpack.option.OrderBackedProperties
 *  net.irisshaders.iris.shaderpack.option.ShaderPackOptions
 *  net.irisshaders.iris.shaderpack.preprocessor.PropertiesPreprocessor
 */
package net.irisshaders.iris.shaderpack;

import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntFunction;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.shaderpack.IdMap$DuplicateTracker;
import net.irisshaders.iris.shaderpack.materialmap.BlockEntry;
import net.irisshaders.iris.shaderpack.materialmap.BlockRenderType;
import net.irisshaders.iris.shaderpack.materialmap.Entry;
import net.irisshaders.iris.shaderpack.materialmap.LegacyIdMap;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.TagEntry;
import net.irisshaders.iris.shaderpack.option.OrderBackedProperties;
import net.irisshaders.iris.shaderpack.option.ShaderPackOptions;
import net.irisshaders.iris.shaderpack.preprocessor.PropertiesPreprocessor;

public class IdMap {
    private final Object2IntMap<NamespacedId> itemIdMap;
    private final Object2IntMap<NamespacedId> entityIdMap;
    private final Int2ObjectLinkedOpenHashMap<List<TagEntry>> blockTagMap;
    private Int2ObjectLinkedOpenHashMap<List<BlockEntry>> blockPropertiesMap;
    private Map<NamespacedId, BlockRenderType> blockRenderTypeMap;

    IdMap(Path path, ShaderPackOptions shaderPackOptions, Iterable<StringPair> iterable) {
        this.itemIdMap = IdMap.loadProperties(path, "item.properties", shaderPackOptions, iterable).map(IdMap::parseItemIdMap).orElse(Object2IntMaps.emptyMap());
        this.entityIdMap = IdMap.loadProperties(path, "entity.properties", shaderPackOptions, iterable).map(IdMap::parseEntityIdMap).orElse(Object2IntMaps.emptyMap());
        this.blockTagMap = new Int2ObjectLinkedOpenHashMap();
        IdMap.loadProperties(path, "block.properties", shaderPackOptions, iterable).ifPresent(properties -> {
            this.blockPropertiesMap = IdMap.parseBlockMap(properties, "block.", "block.properties", this.blockTagMap);
            this.blockRenderTypeMap = IdMap.parseRenderTypeMap(properties, "layer.", "block.properties");
        });
        if (this.blockPropertiesMap == null) {
            this.blockPropertiesMap = new Int2ObjectLinkedOpenHashMap();
            LegacyIdMap.addLegacyValues(this.blockPropertiesMap);
        }
        if (this.blockRenderTypeMap == null) {
            this.blockRenderTypeMap = Collections.emptyMap();
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        IdMap idMap = (IdMap)object;
        return Objects.equals(this.itemIdMap, idMap.itemIdMap) && Objects.equals(this.entityIdMap, idMap.entityIdMap) && Objects.equals(this.blockPropertiesMap, idMap.blockPropertiesMap) && Objects.equals(this.blockTagMap, idMap.blockTagMap) && Objects.equals(this.blockRenderTypeMap, idMap.blockRenderTypeMap);
    }

    public int hashCode() {
        return Objects.hash(this.itemIdMap, this.entityIdMap, this.blockPropertiesMap, this.blockTagMap, this.blockRenderTypeMap);
    }

    private static Optional<Properties> loadProperties(Path path, String string, ShaderPackOptions shaderPackOptions, Iterable<StringPair> iterable) {
        String string2 = IdMap.readProperties(path, string);
        if (string2 == null) {
            return Optional.empty();
        }
        String string3 = PropertiesPreprocessor.preprocessSource((String)string2, (ShaderPackOptions)shaderPackOptions, iterable).replaceAll("\\\\\\n\\s*\\n", " ").replaceAll("\\S *block\\.", "\nblock.");
        StringReader stringReader = new StringReader(string3);
        IdMap.warnMissingBackslashInPropertiesFile(string3, string);
        OrderBackedProperties orderBackedProperties = new OrderBackedProperties();
        try {
            orderBackedProperties.load(stringReader);
        }
        catch (IOException iOException) {
            Iris.logger.error("Error loading " + string + " at " + String.valueOf(path), (Throwable)iOException);
            return Optional.empty();
        }
        if (Iris.getIrisConfig().areDebugOptionsEnabled()) {
            ShaderPrinter.deleteIfClearing();
            try (OutputStream outputStream = Files.newOutputStream(IrisPlatformHelpers.getInstance().getGameDir().resolve("patched_shaders").resolve(string), new OpenOption[0]);){
                orderBackedProperties.store(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), "Patched version of properties");
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        return Optional.of(orderBackedProperties);
    }

    private static void warnMissingBackslashInPropertiesFile(String string, String string2) {
        if (string2.equals("shaders.properties")) {
            return;
        }
        String[] stringArray = string2.split("\\.");
        Object object = "entry";
        if (stringArray.length >= 2) {
            object = stringArray[0] + " entry";
        }
        Matcher matcher = PropertiesPreprocessor.BACKSLASH_MATCHER.matcher(string);
        while (matcher.find()) {
            Iris.logger.warn("Found missing \"\\\" in file \"{}\" in {}: \"{}\"", new Object[]{string2, object, matcher.group(0)});
            for (int i = 1; i <= matcher.groupCount(); ++i) {
                String string3 = matcher.group(i);
                if (string3 == null) continue;
                Iris.logger.warn("At ID: \"{}\"", new Object[]{string3});
            }
        }
    }

    public Int2ObjectLinkedOpenHashMap<List<TagEntry>> getTagEntries() {
        return this.blockTagMap;
    }

    public Object2IntFunction<NamespacedId> getItemIdMap() {
        return this.itemIdMap;
    }

    public Int2ObjectLinkedOpenHashMap<List<BlockEntry>> getBlockProperties() {
        return this.blockPropertiesMap;
    }

    public Object2IntFunction<NamespacedId> getEntityIdMap() {
        return this.entityIdMap;
    }

    public Map<NamespacedId, BlockRenderType> getBlockRenderTypeMap() {
        return this.blockRenderTypeMap;
    }

    private static String readProperties(Path path, String string) {
        try {
            return Files.readString(path.resolve(string), StandardCharsets.ISO_8859_1);
        }
        catch (NoSuchFileException noSuchFileException) {
            Iris.logger.debug("An " + string + " file was not found in the current shaderpack");
            return null;
        }
        catch (IOException iOException) {
            Iris.logger.error("An IOException occurred reading " + string + " from the current shaderpack", (Throwable)iOException);
            return null;
        }
    }

    private static Object2IntMap<NamespacedId> parseIdMap(Properties properties, String string, String string2) {
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        object2IntOpenHashMap.defaultReturnValue(-1);
        IdMap$DuplicateTracker idMap$DuplicateTracker = new IdMap$DuplicateTracker(string2, "entry");
        properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(arg_0, arg_1) -> IdMap.lambda$parseIdMap$1(string, string2, idMap$DuplicateTracker, (Object2IntMap)object2IntOpenHashMap, arg_0, arg_1)));
        idMap$DuplicateTracker.reportSummary();
        return Object2IntMaps.unmodifiable((Object2IntMap)object2IntOpenHashMap);
    }

    private static Int2ObjectLinkedOpenHashMap<List<BlockEntry>> parseBlockMap(Properties properties, String string, String string2, Int2ObjectLinkedOpenHashMap<List<TagEntry>> int2ObjectLinkedOpenHashMap) {
        Int2ObjectLinkedOpenHashMap int2ObjectLinkedOpenHashMap2 = new Int2ObjectLinkedOpenHashMap();
        Int2ObjectLinkedOpenHashMap int2ObjectLinkedOpenHashMap3 = new Int2ObjectLinkedOpenHashMap();
        IdMap$DuplicateTracker idMap$DuplicateTracker = new IdMap$DuplicateTracker(string2, "block entry");
        properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> {
            int n;
            String string3 = (String)object;
            String string4 = (String)object2;
            if (!string3.startsWith(string)) {
                return;
            }
            try {
                n = Integer.parseInt(string3.substring(string.length()));
            }
            catch (NumberFormatException numberFormatException) {
                Iris.logger.warn("Failed to parse line in " + string2 + ": invalid key " + string3);
                return;
            }
            ArrayList<BlockEntry> arrayList = new ArrayList<BlockEntry>();
            ArrayList<TagEntry> arrayList2 = new ArrayList<TagEntry>();
            for (String string5 : string4.split("\\s+")) {
                if (string5.isEmpty()) continue;
                try {
                    Entry entry = BlockEntry.parse(string5);
                    if (entry instanceof BlockEntry) {
                        BlockEntry blockEntry = (BlockEntry)entry;
                        String string6 = IdMap$DuplicateTracker.getUniqueBlockIdentifier(blockEntry);
                        idMap$DuplicateTracker.checkAndRecord(string6, string3, string5);
                        arrayList.add(blockEntry);
                        continue;
                    }
                    if (!(entry instanceof TagEntry)) continue;
                    TagEntry tagEntry = (TagEntry)entry;
                    arrayList2.add(tagEntry);
                }
                catch (Exception exception) {
                    Iris.logger.warn("Unexpected error while parsing an entry from " + string2 + " for the key " + string3 + ":", (Throwable)exception);
                }
            }
            int2ObjectLinkedOpenHashMap2.put(n, Collections.unmodifiableList(arrayList));
            int2ObjectLinkedOpenHashMap3.put(n, Collections.unmodifiableList(arrayList2));
        }));
        idMap$DuplicateTracker.reportSummary();
        int2ObjectLinkedOpenHashMap.putAll((Map)int2ObjectLinkedOpenHashMap3);
        return int2ObjectLinkedOpenHashMap2;
    }

    private static Object2IntMap<NamespacedId> parseItemIdMap(Properties properties) {
        return IdMap.parseIdMap(properties, "item.", "item.properties");
    }

    private static Object2IntMap<NamespacedId> parseEntityIdMap(Properties properties) {
        return IdMap.parseIdMap(properties, "entity.", "entity.properties");
    }

    private static Map<NamespacedId, BlockRenderType> parseRenderTypeMap(Properties properties, String string, String string2) {
        HashMap<NamespacedId, BlockRenderType> hashMap = new HashMap<NamespacedId, BlockRenderType>();
        IdMap$DuplicateTracker idMap$DuplicateTracker = new IdMap$DuplicateTracker(string2, "render type map");
        properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> {
            String string3 = (String)object;
            String string4 = (String)object2;
            if (!string3.startsWith(string)) {
                return;
            }
            String string5 = string3.substring(string.length());
            BlockRenderType blockRenderType = BlockRenderType.fromString(string5).orElse(null);
            if (blockRenderType == null) {
                Iris.logger.warn("Failed to parse line in " + string2 + ": invalid block render type: " + string3);
                return;
            }
            for (String string6 : string4.split("\\s+")) {
                if (string6.startsWith("%")) {
                    Iris.logger.fatal("Cannot use a tag in the render type map: " + string3 + " = " + string4);
                    continue;
                }
                idMap$DuplicateTracker.checkAndRecord(string6, string3, string6);
                hashMap.put(new NamespacedId(string6), blockRenderType);
            }
        }));
        idMap$DuplicateTracker.reportSummary();
        return hashMap;
    }

    private static Map<NamespacedId, String> parseDimensionMap(Properties properties, String string, String string2) {
        Object2ObjectArrayMap object2ObjectArrayMap = new Object2ObjectArrayMap();
        properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(arg_0, arg_1) -> IdMap.lambda$parseDimensionMap$4(string, (Map)object2ObjectArrayMap, arg_0, arg_1)));
        return object2ObjectArrayMap;
    }

    private static /* synthetic */ void lambda$parseIdMap$1(String string, String string2, IdMap$DuplicateTracker idMap$DuplicateTracker, Object2IntMap object2IntMap, Object object, Object object2) {
        int n;
        String string3 = (String)object;
        String string4 = (String)object2;
        if (!string3.startsWith(string)) {
            return;
        }
        try {
            n = Integer.parseInt(string3.substring(string.length()));
        }
        catch (NumberFormatException numberFormatException) {
            Iris.logger.warn("Failed to parse line in " + string2 + ": invalid key " + string3);
            return;
        }
        for (String string5 : string4.split("\\s+")) {
            if (string5.contains("=")) {
                Iris.logger.warn("Failed to parse an Identifier in " + string2 + " for the key " + string3 + ": state properties are currently not supported: " + string5);
                continue;
            }
            idMap$DuplicateTracker.checkAndRecord(string5, string3, string5);
            object2IntMap.put((Object)new NamespacedId(string5), n);
        }
    }

    private static /* synthetic */ void lambda$parseDimensionMap$4(String string, Map map, Object object, Object object2) {
        String string2 = (String)object;
        String string3 = (String)object2;
        if (!string2.startsWith(string)) {
            return;
        }
        string2 = string2.substring(string.length());
        for (String string4 : string3.split("\\s+")) {
            map.put(new NamespacedId(string4), string2);
        }
    }
}

