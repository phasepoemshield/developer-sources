/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Rectangle
 */
package me.shedaniel.clothconfig2.gui;

import java.util.Objects;
import me.shedaniel.clothconfig2.api.scroll.ScrollingContainer;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$Reference;
import me.shedaniel.math.Rectangle;

class GlobalizedClothConfigScreen$1
extends ScrollingContainer {
    final /* synthetic */ GlobalizedClothConfigScreen this$0;

    GlobalizedClothConfigScreen$1(GlobalizedClothConfigScreen globalizedClothConfigScreen) {
        this.this$0 = globalizedClothConfigScreen;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(4, 4, this.this$0.getSideSliderPosition() - 14 - 4, this.this$0.field_22790 - 8);
    }

    @Override
    public int getMaxScrollHeight() {
        int n = 0;
        for (GlobalizedClothConfigScreen$Reference globalizedClothConfigScreen$Reference : this.this$0.references) {
            if (n != 0) {
                n = (int)((float)n + 3.0f * globalizedClothConfigScreen$Reference.getScale());
            }
            float f = n;
            Objects.requireNonNull(GlobalizedClothConfigScreen.access$000(this.this$0));
            n = (int)(f + 9.0f * globalizedClothConfigScreen$Reference.getScale());
        }
        return n;
    }
}

