/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Rectangle
 */
package me.shedaniel.clothconfig2.gui;

import me.shedaniel.clothconfig2.api.scroll.ScrollingContainer;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen;
import me.shedaniel.math.Rectangle;

class ClothConfigScreen$1
extends ScrollingContainer {
    final /* synthetic */ ClothConfigScreen this$0;

    ClothConfigScreen$1(ClothConfigScreen clothConfigScreen) {
        this.this$0 = clothConfigScreen;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(0, 0, 1, this.this$0.field_22789 - 40);
    }

    @Override
    public void updatePosition(float f) {
        super.updatePosition(f);
        this.setScrollTarget(this.clamp(this.scrollTarget(), 0.0));
    }

    @Override
    public int getMaxScrollHeight() {
        return (int)this.this$0.getTabsMaximumScrolled();
    }
}

