/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.resource.v1;

import net.fabricmc.fabric.api.resource.v1.DataResourceStore$Key;

public interface DataResourceStore {
    public <T> T getOrThrow(DataResourceStore$Key<T> var1);
}

