/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class05836
 *  minecraft.class06581
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.registry.CompostingChanceRegistry
 */
package net.fabricmc.fabric.impl.content.registry;

import minecraft.class03530;
import minecraft.class05836;
import minecraft.class06581;
import minecraft.class07310;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

public class CompostingChanceRegistryImpl
implements CompostingChanceRegistry {
    public void remove(class03530<class06581> class035302) {
        throw new UnsupportedOperationException("Tags currently not supported!");
    }

    public void remove(class07310 class073102) {
        class05836.R.removeFloat((Object)class073102.B());
    }

    public Float get(class07310 class073102) {
        return Float.valueOf(class05836.R.getOrDefault((Object)class073102.B(), 0.0f));
    }

    public void clear(class03530<class06581> class035302) {
        throw new UnsupportedOperationException("CompostingChanceRegistry operates directly on the vanilla map - clearing not supported!");
    }

    public void clear(class07310 class073102) {
        throw new UnsupportedOperationException("CompostingChanceRegistry operates directly on the vanilla map - clearing not supported!");
    }

    public void add(class03530<class06581> class035302, Float f) {
        throw new UnsupportedOperationException("Tags currently not supported!");
    }

    public void add(class07310 class073102, Float f) {
        class05836.R.put((Object)class073102.B(), f);
    }
}

