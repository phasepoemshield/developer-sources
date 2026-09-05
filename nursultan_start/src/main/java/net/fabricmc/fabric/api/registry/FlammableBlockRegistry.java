/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class03530
 *  net.fabricmc.fabric.api.util.Block2ObjectMap
 *  net.fabricmc.fabric.impl.content.registry.FlammableBlockRegistryImpl
 */
package net.fabricmc.fabric.api.registry;

import minecraft.class00869;
import minecraft.class00891;
import minecraft.class03530;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry$Entry;
import net.fabricmc.fabric.api.util.Block2ObjectMap;
import net.fabricmc.fabric.impl.content.registry.FlammableBlockRegistryImpl;

public interface FlammableBlockRegistry
extends Block2ObjectMap<FlammableBlockRegistry$Entry> {
    default public void add(class03530<class00891> class035302, int n, int n2) {
        this.add(class035302, new FlammableBlockRegistry$Entry(n, n2));
    }

    default public void add(class00891 class008912, int n, int n2) {
        this.add(class008912, new FlammableBlockRegistry$Entry(n, n2));
    }

    public static FlammableBlockRegistry getInstance(class00891 class008912) {
        return FlammableBlockRegistryImpl.getInstance((class00891)class008912);
    }

    public static FlammableBlockRegistry getDefaultInstance() {
        return FlammableBlockRegistry.getInstance(class00869.Lc);
    }
}

