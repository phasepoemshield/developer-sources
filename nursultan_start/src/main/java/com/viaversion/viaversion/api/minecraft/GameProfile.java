/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;

public record GameProfile(@Nullable String name, @Nullable UUID id, Property[] properties, boolean dynamic) {
    public Map<String, List<Property>> propertiesMap() {
        HashMap<String, List<Property>> map = new HashMap<String, List<Property>>();
        for (Property property : this.properties) {
            map.computeIfAbsent(property.name(), k -> new ArrayList()).add(property);
        }
        return map;
    }

    public GameProfile(@Nullable String name, @Nullable UUID id, Property[] properties) {
        this(name, id, properties, true);
    }

    public GameProfile(@Nullable String name, @Nullable UUID id) {
        this(name, id, new Property[0]);
    }

    public record Property(String name, String value, @Nullable String signature) {
        public Property(String name, String value) {
            this(name, value, null);
        }
    }
}

