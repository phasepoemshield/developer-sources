/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Rectangle
 */
package me.shedaniel.clothconfig2.gui;

import me.shedaniel.clothconfig2.api.scroll.ScrollingContainer;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen;
import me.shedaniel.math.Rectangle;

class GlobalizedClothConfigScreen$2
extends ScrollingContainer {
    private final Rectangle empty = new Rectangle();

    GlobalizedClothConfigScreen$2(GlobalizedClothConfigScreen globalizedClothConfigScreen) {
    }

    @Override
    public Rectangle getBounds() {
        return this.empty;
    }

    @Override
    public int getMaxScrollHeight() {
        return 1;
    }
}

