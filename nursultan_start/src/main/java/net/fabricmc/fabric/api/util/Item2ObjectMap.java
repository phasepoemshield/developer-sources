/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class06581
 *  minecraft.class07310
 *  org.jspecify.annotations.NullMarked
 */
package net.fabricmc.fabric.api.util;

import minecraft.class03530;
import minecraft.class06581;
import minecraft.class07310;
import org.jspecify.annotations.NullMarked;

@NullMarked
public interface Item2ObjectMap<V> {
    public void remove(class07310 var1);

    public void remove(class03530<class06581> var1);

    public V get(class07310 var1);

    public void clear(class03530<class06581> var1);

    public void clear(class07310 var1);

    public void add(class07310 var1, V var2);

    public void add(class03530<class06581> var1, V var2);
}

