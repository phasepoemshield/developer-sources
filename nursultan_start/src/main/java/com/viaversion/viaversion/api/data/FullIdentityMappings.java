/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.data;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.FullMappingsBase;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntMap;
import com.viaversion.viaversion.util.Key;
import org.checkerframework.checker.nullness.qual.Nullable;

public class FullIdentityMappings
implements FullMappings {
    private static final String[] EMPTY_ARRAY = new String[0];
    private final Object2IntMap<String> stringToId;
    private final String[] idToString;
    private final Mappings mappings;

    @Override
    public boolean isIdentity() {
        return true;
    }

    public FullIdentityMappings(MappingDataLoader.IdentifiersPair identifiersPair, Mappings mappings) {
        Preconditions.checkNotNull((Object)mappings, (Object)"Mappings cannot be null");
        this.mappings = mappings;
        this.stringToId = FullMappingsBase.toInverseMap(identifiersPair.unmapped());
        this.idToString = identifiersPair.unmapped().toArray(EMPTY_ARRAY);
    }

    private FullIdentityMappings(Object2IntMap<String> stringToId, String[] idToString, Mappings mappings) {
        this.stringToId = stringToId;
        this.idToString = idToString;
        this.mappings = mappings;
    }

    @Override
    public int size() {
        return this.mappings.size();
    }

    @Override
    public int id(String identifier) {
        return this.stringToId.getInt((Object)Key.stripMinecraftNamespace((String)identifier));
    }

    @Override
    public FullMappings inverse() {
        return new FullIdentityMappings(this.stringToId, this.idToString, this.mappings.inverse());
    }

    @Override
    public @Nullable String mappedIdentifier(int mappedId) {
        return this.identifier(mappedId);
    }

    @Override
    public @Nullable String mappedIdentifier(String identifier) {
        return this.identifier(identifier);
    }

    @Override
    public boolean isIntIdIdentity() {
        return true;
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
        return this.id(mappedIdentifier);
    }

    @Override
    public int getNewId(int id) {
        return this.mappings.getNewId(id);
    }

    @Override
    public int mappedSize() {
        return this.mappings.mappedSize();
    }
}

