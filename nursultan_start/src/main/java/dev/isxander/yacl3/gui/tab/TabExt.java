/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03241
 *  minecraft.class04141
 */
package dev.isxander.yacl3.gui.tab;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03241;
import minecraft.class04141;

public interface TabExt
extends class03241 {
    default public class00392 method_71245() {
        return class00392.i();
    }

    default public void tick() {
    }

    public class04141 getTooltip();

    default public void renderBackground(class01054 class010542) {
    }
}

