/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.ClothConfigScreen$ListWidget
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 */
package me.shedaniel.clothconfig2.api;

import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;

public abstract class AbstractConfigListEntry<T>
extends AbstractConfigEntry<T> {
    private final class00392 fieldName;
    private boolean editable = true;
    private boolean requiresRestart;

    public AbstractConfigListEntry(class00392 class003922, boolean bl) {
        this.fieldName = class003922;
        this.requiresRestart = bl;
    }

    public void setEditable(boolean bl) {
        this.editable = bl;
    }

    public boolean isEditable() {
        return this.getConfigScreen().isEditable() && this.editable && this.isEnabled();
    }

    @Override
    public class00392 getFieldName() {
        return this.fieldName;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        if (this.isMouseInside(n6, n7, n3, n2, n4, n5)) {
            Rectangle rectangle = this.getEntryArea(n3, n2, n4, n5);
            if (this.getParent() instanceof ClothConfigScreen.ListWidget) {
                ((ClothConfigScreen.ListWidget)this.getParent()).thisTimeTarget = new Rectangle((double)rectangle.x, (double)rectangle.y + this.getParent().getScroll(), (double)rectangle.width, (double)rectangle.height);
            }
        }
    }

    @Override
    public void setRequiresRestart(boolean bl) {
        this.requiresRestart = bl;
    }

    public boolean isMouseInside(int n, int n2, int n3, int n4, int n5, int n6) {
        return this.getParent().method_25405((double)n, (double)n2) && this.getEntryArea(n3, n4, n5, n6).contains(n, n2);
    }

    @Override
    public boolean isRequiresRestart() {
        return this.requiresRestart;
    }

    public Rectangle getEntryArea(int n, int n2, int n3, int n4) {
        return new Rectangle(this.getParent().left, n2, this.getParent().right - this.getParent().left, this.getItemHeight() - 4);
    }

    public final int getPreferredTextColor() {
        return this.getConfigError().isPresent() ? -43691 : -1;
    }
}

