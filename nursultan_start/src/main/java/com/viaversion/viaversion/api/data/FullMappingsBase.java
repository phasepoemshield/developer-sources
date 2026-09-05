/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntOpenHashMap
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.data;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.data.FullIdentityMappings;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntOpenHashMap;
import com.viaversion.viaversion.util.Key;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public class FullMappingsBase
implements FullMappings {
    private static final String[] EMPTY_ARRAY = new String[0];
    private final Object2IntMap<String> stringToId;
    private final Object2IntMap<String> mappedStringToId;
    private final String[] idToString;
    private final String[] mappedIdToString;
    private final Mappings mappings;

    public FullMappingsBase(MappingDataLoader.IdentifiersPair identifiersPair, Mappings mappings) {
        Preconditions.checkNotNull((Object)mappings, (Object)"Mappings cannot be null");
        this.mappings = mappings;
        this.stringToId = FullMappingsBase.toInverseMap(identifiersPair.unmapped());
        this.idToString = identifiersPair.unmapped().toArray(EMPTY_ARRAY);
        this.mappedStringToId = FullMappingsBase.toInverseMap(identifiersPair.mapped());
        this.mappedIdToString = identifiersPair.mapped().toArray(EMPTY_ARRAY);
    }

    private FullMappingsBase(Object2IntMap<String> stringToId, Object2IntMap<String> mappedStringToId, String[] idToString, String[] mappedIdToString, Mappings mappings) {
        this.stringToId = stringToId;
        this.mappedStringToId = mappedStringToId;
        this.idToString = idToString;
        this.mappedIdToString = mappedIdToString;
        this.mappings = mappings;
    }

    @Override
    public int size() {
        return this.mappings.size();
    }

    public static FullMappings of(MappingDataLoader.IdentifiersPair identifiersPair, Mappings mappings) {
        return mappings.isIdentity() && identifiersPair.identity() ? new FullIdentityMappings(identifiersPair, mappings) : new FullMappingsBase(identifiersPair, mappings);
    }

    @Override
    public int id(String identifier) {
        return this.stringToId.getInt((Object)Key.stripMinecraftNamespace((String)identifier));
    }

    @Override
    public FullMappings inverse() {
        return new FullMappingsBase(this.mappedStringToId, this.stringToId, this.mappedIdToString, this.idToString, this.mappings.inverse());
    }

    @Override
    public @Nullable String mappedIdentifier(int mappedId) {
        if (mappedId < 0 || mappedId >= this.mappedIdToString.length) {
            return null;
        }
        String identifier = this.mappedIdToString[mappedId];
        return Key.namespaced((String)identifier);
    }

    @Override
    public @Nullable String mappedIdentifier(String identifier) {
        int id = this.id(identifier);
        if (id == -1) {
            return null;
        }
        int mappedId = this.mappings.getNewId(id);
        return mappedId != -1 ? this.mappedIdentifier(mappedId) : null;
    }

    @Override
    public boolean isIntIdIdentity() {
        return this.mappings.isIdentity();
    }

    @Override
    public @Nullable String identifier(String mappedIdentifier) {
        int mappedId = this.mappedId(mappedIdentifier);
        if (mappedId == -1) {
            return null;
        }
        int id = this.mappings.inverse().getNewId(mappedId);
        return id != -1 ? this.identifier(id) : null;
    }

    @Override
    public String identifier(int id) {
        if (id < 0 || id >= this.idToString.length) {
            return null;
        }
        String identifier = this.idToString[id];
        return Key.namespaced((String)identifier);
    }

    @Override
    public void setNewId(int id, int mappedId) {
        this.mappings.setNewId(id, mappedId);
    }

    @Override
    public int mappedId(String mappedIdentifier) {
        return this.mappedStringToId.getInt((Object)Key.stripMinecraftNamespace((String)mappedIdentifier));
    }

    @Override
    public int getNewId(int id) {
        return this.mappings.getNewId(id);
    }

    @Override
    public int mappedSize() {
        return this.mappings.mappedSize();
    }

    static Object2IntMap<String> toInverseMap(List<String> list) {
        Object2IntOpenHashMap map = new Object2IntOpenHashMap(list.size());
        map.defaultReturnValue(-1);
        for (int i = 0; i < list.size(); ++i) {
            map.put((Object)list.get(i), i);
        }
        return map;
    }
}

