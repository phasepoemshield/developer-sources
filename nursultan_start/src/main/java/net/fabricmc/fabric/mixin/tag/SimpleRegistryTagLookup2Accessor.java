/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class03552
 */
package net.fabricmc.fabric.mixin.tag;

import java.util.Map;
import minecraft.class03530;
import minecraft.class03552;

public interface SimpleRegistryTagLookup2Accessor<T> {
    public void fabric_setTagMap(Map<class03530<T>, class03552<T>> var1);

    public Map<class03530<T>, class03552<T>> fabric_getTagMap();
}

