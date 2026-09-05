/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00576
 *  minecraft.class00587
 *  minecraft.class00607
 *  minecraft.class00619
 */
package net.fabricmc.fabric.api.biome.v1;

import minecraft.class00576;
import minecraft.class00587;
import minecraft.class00607;
import minecraft.class00619;

public interface BiomeModificationContext$AttributesContext {
    public void addAll(class00587 var1);

    default public void addAll(class00576 class005762) {
        this.addAll(class005762.N());
    }

    public <T> void set(class00607<T> var1, T var2);

    public <T, M> void setModifier(class00607<T> var1, class00619<T, M> var2, M var3);
}

