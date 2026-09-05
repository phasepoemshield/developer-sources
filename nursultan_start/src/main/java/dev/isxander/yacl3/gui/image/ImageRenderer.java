/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 */
package dev.isxander.yacl3.gui.image;

import minecraft.class01054;

public interface ImageRenderer {
    default public void tick() {
    }

    public void close();

    public int render(class01054 var1, int var2, int var3, int var4, float var5);
}

