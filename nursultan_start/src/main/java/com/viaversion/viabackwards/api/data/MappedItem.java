/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.util.ComponentUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.api.data;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.util.ComponentUtil;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MappedItem {
    private final int id;
    private final String jsonName;
    private final Tag tagName;
    private final Integer customModelData;

    public Tag tagName() {
        return this.tagName;
    }

    public MappedItem(int id, String name) {
        this(id, name, null);
    }

    public MappedItem(int id, String name, @Nullable Integer customModelData) {
        this.id = id;
        this.jsonName = ComponentUtil.legacyToJsonString((String)("\u00a7f" + name), (boolean)true);
        this.tagName = ComponentUtil.jsonStringToTag((String)this.jsonName);
        this.customModelData = customModelData;
    }

    public int id() {
        return this.id;
    }

    public @Nullable Integer customModelData() {
        return this.customModelData;
    }

    public String jsonName() {
        return this.jsonName;
    }
}

