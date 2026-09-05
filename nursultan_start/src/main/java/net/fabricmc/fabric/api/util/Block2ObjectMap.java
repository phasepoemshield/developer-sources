/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class03530
 *  org.jspecify.annotations.NullMarked
 */
package net.fabricmc.fabric.api.util;

import minecraft.class00891;
import minecraft.class03530;
import org.jspecify.annotations.NullMarked;

@NullMarked
public interface Block2ObjectMap<V> {
    public void remove(class00891 var1);

    public void remove(class03530<class00891> var1);

    public V get(class00891 var1);

    public void clear(class03530<class00891> var1);

    public void clear(class00891 var1);

    public void add(class00891 var1, V var2);

    public void add(class03530<class00891> var1, V var2);
}

