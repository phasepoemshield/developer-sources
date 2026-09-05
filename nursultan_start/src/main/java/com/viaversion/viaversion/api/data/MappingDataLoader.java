/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.io.NBTIO
 *  com.viaversion.nbt.io.TagReader
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntOpenHashMap
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonIOException
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonSyntaxException
 *  com.viaversion.viaversion.util.GsonUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.data;

import com.viaversion.nbt.io.NBTIO;
import com.viaversion.nbt.io.TagReader;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.IdentityMappings;
import com.viaversion.viaversion.api.data.IntArrayMappings;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntOpenHashMap;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonIOException;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonSyntaxException;
import com.viaversion.viaversion.util.GsonUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MappingDataLoader {
    public static final MappingDataLoader INSTANCE = new MappingDataLoader(MappingDataLoader.class, "assets/viaversion/data/");
    public static final TagReader<CompoundTag> MAPPINGS_READER = NBTIO.reader(CompoundTag.class).named();
    private static final Map<String, String[]> GLOBAL_IDENTIFIER_INDEXES = new HashMap<String, String[]>();
    private static final byte DIRECT_ID = 0;
    private static final byte SHIFTS_ID = 1;
    private static final byte CHANGES_ID = 2;
    private static final byte IDENTITY_ID = 3;
    private final Map<String, CompoundTag> mappingsCache = new HashMap<String, CompoundTag>();
    private final Class<?> dataLoaderClass;
    private final String dataPath;
    private boolean cacheValid = true;

    public void clearCache() {
        this.mappingsCache.clear();
        this.cacheValid = false;
    }

    private List<String> identifiers(Mappings mappings, String key) {
        ArrayList<String> identifiers = new ArrayList<String>(mappings.size());
        for (int i = 0; i < mappings.size(); ++i) {
            int globalId = mappings.getNewId(i);
            identifiers.add(this.identifierFromGlobalId(key, globalId));
        }
        return identifiers;
    }

    public MappingDataLoader(Class<?> dataLoaderClass, String dataPath) {
        this.dataLoaderClass = dataLoaderClass;
        this.dataPath = dataPath;
    }

    public @Nullable InputStream getResource(String name) {
        return this.dataLoaderClass.getClassLoader().getResourceAsStream(this.dataPath + name);
    }

    public Logger getLogger() {
        return Via.getPlatform().getLogger();
    }

    public Object2IntMap<String> indexedObjectToMap(JsonObject object) {
        Object2IntOpenHashMap map = new Object2IntOpenHashMap(object.size());
        map.defaultReturnValue(-1);
        for (Map.Entry entry : object.entrySet()) {
            map.put((Object)((JsonElement)entry.getValue()).getAsString(), Integer.parseInt((String)entry.getKey()));
        }
        return map;
    }

    public File getDataFolder() {
        return Via.getPlatform().getDataFolder();
    }

    public @Nullable JsonObject loadFromDataDir(String name) {
        JsonObject jsonObject;
        File file = new File(this.getDataFolder(), name);
        if (!file.exists()) {
            return this.loadData(name);
        }
        FileReader reader = new FileReader(file);
        try {
            jsonObject = (JsonObject)GsonUtil.getGson().fromJson((Reader)reader, JsonObject.class);
        }
        catch (Throwable throwable) {
            try {
                try {
                    reader.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (JsonSyntaxException e) {
                this.getLogger().warning(name + " is badly formatted!");
                throw new RuntimeException(e);
            }
            catch (JsonIOException | IOException e) {
                throw new RuntimeException(e);
            }
        }
        reader.close();
        return jsonObject;
    }

    public <M extends Mappings, V> @Nullable Mappings loadMappings(CompoundTag mappingsTag, String key, MappingHolderSupplier<V> holderSupplier, AddConsumer<V> addConsumer, MappingsSupplier<M, V> mappingsSupplier) {
        V mappings;
        CompoundTag tag = mappingsTag.getCompoundTag(key);
        if (tag == null) {
            return null;
        }
        int mappedSize = tag.getInt("mappedSize", -1);
        byte strategy = tag.getByteTag("id").asByte();
        if (strategy == 0) {
            IntArrayTag valuesTag = tag.getIntArrayTag("val");
            return IntArrayMappings.of(valuesTag.getValue(), mappedSize);
        }
        if (strategy == 1) {
            int[] shiftsAt = tag.getIntArrayTag("at").getValue();
            int[] shiftsTo = tag.getIntArrayTag("to").getValue();
            int size = tag.getIntTag("size").asInt();
            mappings = holderSupplier.get(size);
            if (shiftsAt[0] != 0) {
                int to = shiftsAt[0];
                for (int id = 0; id < to; ++id) {
                    addConsumer.addTo(mappings, id, id);
                }
            }
            for (int i = 0; i < shiftsAt.length; ++i) {
                boolean isLast = i == shiftsAt.length - 1;
                int from = shiftsAt[i];
                int to = isLast ? size : shiftsAt[i + 1];
                int mappedId = shiftsTo[i];
                for (int id = from; id < to; ++id) {
                    addConsumer.addTo(mappings, id, mappedId++);
                }
            }
        } else if (strategy == 2) {
            int[] changesAt = tag.getIntArrayTag("at").getValue();
            int[] values = tag.getIntArrayTag("val").getValue();
            int size = tag.getIntTag("size").asInt();
            boolean fillBetween = tag.get("nofill") == null;
            mappings = holderSupplier.get(size);
            int nextUnhandledId = 0;
            for (int i = 0; i < changesAt.length; ++i) {
                int changedId = changesAt[i];
                if (fillBetween) {
                    for (int id = nextUnhandledId; id < changedId; ++id) {
                        addConsumer.addTo(mappings, id, id);
                    }
                    nextUnhandledId = changedId + 1;
                }
                addConsumer.addTo(mappings, changedId, values[i]);
            }
        } else {
            if (strategy == 3) {
                IntTag sizeTag = tag.getIntTag("size");
                return new IdentityMappings(sizeTag.asInt(), mappedSize);
            }
            throw new IllegalArgumentException("Unknown serialization strategy: " + strategy);
        }
        return mappingsSupplier.create(mappings, mappedSize);
    }

    public @Nullable Mappings loadMappings(CompoundTag mappingsTag, String key) {
        return this.loadMappings(mappingsTag, key, size -> {
            int[] array = new int[size];
            Arrays.fill(array, -1);
            return array;
        }, (array, id, mappedId) -> {
            array[id] = mappedId;
        }, IntArrayMappings::of);
    }

    public @Nullable CompoundTag loadNBTFromFile(String name) {
        CompoundTag compoundTag;
        InputStream resource = this.getResource(name);
        if (resource == null) {
            return null;
        }
        BufferedInputStream stream = new BufferedInputStream(resource);
        try {
            compoundTag = (CompoundTag)MAPPINGS_READER.read((InputStream)stream);
        }
        catch (Throwable throwable) {
            try {
                try {
                    ((InputStream)stream).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        ((InputStream)stream).close();
        return compoundTag;
    }

    public @Nullable String identifierFromGlobalId(String registry, int globalId) {
        String[] array = GLOBAL_IDENTIFIER_INDEXES.get(registry);
        if (array == null) {
            throw new IllegalArgumentException("Unknown global identifier key: " + registry);
        }
        if (globalId < 0 || globalId >= array.length) {
            throw new IllegalArgumentException("Unknown global identifier index: " + globalId);
        }
        return array[globalId];
    }

    public static void loadGlobalIdentifiers() {
        CompoundTag globalIdentifiers = INSTANCE.loadNBT("identifier-table.nbt");
        for (Map.Entry entry : globalIdentifiers.entrySet()) {
            ListTag value = (ListTag)entry.getValue();
            int size = value.size();
            String[] array = new String[size];
            for (int i = 0; i < size; ++i) {
                array[i] = ((StringTag)value.get(i)).getValue();
            }
            GLOBAL_IDENTIFIER_INDEXES.put((String)entry.getKey(), array);
        }
    }

    public @Nullable List<String> identifiersFromGlobalIds(CompoundTag mappingsTag, String key) {
        Mappings mappings = this.loadMappings(mappingsTag, key);
        return mappings != null ? this.identifiers(mappings, key) : null;
    }

    public @Nullable IdentifiersPair identifiersFromGlobalIds(CompoundTag unmappedTag, CompoundTag mappedTag, String key) {
        Mappings unmapped = this.loadMappings(unmappedTag, key);
        if (unmapped == null) {
            return null;
        }
        Mappings mapped = this.loadMappings(mappedTag, key);
        if (mapped == null) {
            return null;
        }
        int size = unmapped.size();
        if (size != mapped.size()) {
            return new IdentifiersPair(this.identifiers(unmapped, key), this.identifiers(mapped, key), false);
        }
        ArrayList<String> unmappedIdentifiers = new ArrayList<String>(size);
        ArrayList<String> mappedIdentifiers = new ArrayList<String>(size);
        boolean identity = true;
        for (int i = 0; i < size; ++i) {
            int unmappedGlobalId = unmapped.getNewId(i);
            int mappedGlobalId = mapped.getNewId(i);
            String unmappedIdentifier = this.identifierFromGlobalId(key, unmappedGlobalId);
            if (unmappedGlobalId == mappedGlobalId) {
                unmappedIdentifiers.add(unmappedIdentifier);
                mappedIdentifiers.add(unmappedIdentifier);
                continue;
            }
            identity = false;
            unmappedIdentifiers.add(unmappedIdentifier);
            mappedIdentifiers.add(this.identifierFromGlobalId(key, mappedGlobalId));
        }
        return identity ? new IdentifiersPair(unmappedIdentifiers) : new IdentifiersPair(unmappedIdentifiers, mappedIdentifiers);
    }

    public @Nullable CompoundTag loadNBT(String name) {
        return this.loadNBT(name, false);
    }

    public @Nullable CompoundTag loadNBT(String name, boolean cache) {
        if (!this.cacheValid) {
            return this.loadNBTFromFile(name);
        }
        CompoundTag data = this.mappingsCache.get(name);
        if (data != null) {
            return data;
        }
        data = this.loadNBTFromFile(name);
        if (cache && data != null) {
            this.mappingsCache.put(name, data);
        }
        return data;
    }

    public @Nullable JsonObject loadData(String name) {
        JsonObject jsonObject;
        InputStream stream = this.getResource(name);
        if (stream == null) {
            return null;
        }
        InputStreamReader reader = new InputStreamReader(stream);
        try {
            jsonObject = (JsonObject)GsonUtil.getGson().fromJson((Reader)reader, JsonObject.class);
        }
        catch (Throwable throwable) {
            try {
                try {
                    reader.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        reader.close();
        return jsonObject;
    }

    public Object2IntMap<String> arrayToMap(JsonArray array) {
        Object2IntOpenHashMap map = new Object2IntOpenHashMap(array.size());
        map.defaultReturnValue(-1);
        for (int i = 0; i < array.size(); ++i) {
            map.put((Object)array.get(i).getAsString(), i);
        }
        return map;
    }

    @FunctionalInterface
    public static interface MappingHolderSupplier<T> {
        public T get(int var1);
    }

    @FunctionalInterface
    public static interface AddConsumer<T> {
        public void addTo(T var1, int var2, int var3);
    }

    @FunctionalInterface
    public static interface MappingsSupplier<T extends Mappings, V> {
        public T create(V var1, int var2);
    }

    public record IdentifiersPair(List<String> unmapped, List<String> mapped, boolean identity) {
        public IdentifiersPair(List<String> unmapped, List<String> mapped) {
            this(unmapped, mapped, false);
        }

        public IdentifiersPair(List<String> identifiers) {
            this(identifiers, identifiers, true);
        }
    }
}

