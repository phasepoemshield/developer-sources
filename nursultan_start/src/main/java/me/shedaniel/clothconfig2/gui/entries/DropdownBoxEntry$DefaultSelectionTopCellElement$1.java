/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04927
 *  minecraft.class06601
 *  minecraft.class06626
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionTopCellElement;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04927;
import minecraft.class06601;
import minecraft.class06626;

class DropdownBoxEntry$DefaultSelectionTopCellElement$1
extends class04927 {
    final /* synthetic */ DropdownBoxEntry$DefaultSelectionTopCellElement this$0;

    DropdownBoxEntry$DefaultSelectionTopCellElement$1(DropdownBoxEntry$DefaultSelectionTopCellElement defaultSelectionTopCellElement, class01590 class015902, int n, int n2, int n3, int n4, class00392 class003922) {
        this.this$0 = defaultSelectionTopCellElement;
        super(class015902, n, n2, n3, n4, class003922);
    }

    public boolean method_25404(class06601 class066012) {
        block3: {
            block2: {
                if (class066012.v() == 257) break block2;
                if (class066012.v() != 256) break block3;
            }
            this.this$0.selectFirstRecommendation();
            return true;
        }
        return this.this$0.isSuggestionMode() && super.method_25404(class066012);
    }

    public boolean method_25400(class06626 class066262) {
        return this.this$0.isSuggestionMode() && super.method_25400(class066262);
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        this.method_25365(this.this$0.isSuggestionMode() && this.this$0.isSelected && this.this$0.getParent().method_25399() == this.this$0.getParent().selectionElement && this.this$0.getParent().selectionElement.method_25399() == this.this$0 && this.this$0.method_25399() == this);
        super.method_48579(class010542, n, n2, f);
    }
}

