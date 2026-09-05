/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.resource.v1;

import net.fabricmc.fabric.api.resource.v1.DataResourceStore;
import net.fabricmc.fabric.api.resource.v1.DataResourceStore$Key;

public interface DataResourceStore$Mutable
extends DataResourceStore {
    public <T> void put(DataResourceStore$Key<T> var1, T var2);
}

