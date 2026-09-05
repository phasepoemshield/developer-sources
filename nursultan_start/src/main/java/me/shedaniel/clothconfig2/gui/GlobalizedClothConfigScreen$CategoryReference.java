/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui;

import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$CategoryTextEntry;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$Reference;
import minecraft.class00392;

class GlobalizedClothConfigScreen$CategoryReference
implements GlobalizedClothConfigScreen$Reference {
    private final class00392 category;
    final /* synthetic */ GlobalizedClothConfigScreen this$0;

    @Override
    public class00392 getText() {
        return this.category;
    }

    public GlobalizedClothConfigScreen$CategoryReference(GlobalizedClothConfigScreen globalizedClothConfigScreen, class00392 class003922) {
        this.this$0 = globalizedClothConfigScreen;
        this.category = class003922;
    }

    @Override
    public void go() {
        int n = 0;
        for (AbstractConfigEntry<AbstractConfigEntry<?>> abstractConfigEntry : this.this$0.listWidget.method_25396()) {
            if (abstractConfigEntry instanceof GlobalizedClothConfigScreen$CategoryTextEntry && ((GlobalizedClothConfigScreen$CategoryTextEntry)abstractConfigEntry).category == this.category) {
                this.this$0.listWidget.scrollTo(n, true);
                return;
            }
            n += abstractConfigEntry.getItemHeight();
        }
    }

    @Override
    public float getScale() {
        return 1.0f;
    }
}

