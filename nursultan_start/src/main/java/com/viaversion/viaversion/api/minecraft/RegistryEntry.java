/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.util.Copyable
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.util.Copyable;
import org.checkerframework.checker.nullness.qual.Nullable;

public record RegistryEntry(String key, @Nullable Tag tag) implements Copyable
{
    public RegistryEntry withKey(String key) {
        return new RegistryEntry(key, this.tag != null ? this.tag.copy() : null);
    }

    public RegistryEntry copy() {
        return new RegistryEntry(this.key, this.tag != null ? this.tag.copy() : null);
    }
}

