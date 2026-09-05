/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  minecraft.class01894
 */
package net.fabricmc.fabric.api.event.registry;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import minecraft.class01894;

public interface RegistryIdRemapCallback$RemapState<T> {
    public class01894 getIdFromOld(int var1);

    public Int2IntMap getRawIdChangeMap();

    public class01894 getIdFromNew(int var1);
}

