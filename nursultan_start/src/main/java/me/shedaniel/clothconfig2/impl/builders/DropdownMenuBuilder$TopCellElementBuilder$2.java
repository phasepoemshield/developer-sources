/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionTopCellElement
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02862
 *  minecraft.class04206
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07310
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$TopCellElementBuilder;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02862;
import minecraft.class04206;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07310;

class DropdownMenuBuilder$TopCellElementBuilder$2
extends DropdownBoxEntry.DefaultSelectionTopCellElement<class01894> {
    DropdownMenuBuilder$TopCellElementBuilder$2(class01894 class018942, Function function, Function function2) {
        super((Object)class018942, function, function2);
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f) {
        this.textFieldWidget.method_46421(n3 + 4);
        this.textFieldWidget.method_46419(n4 + 6);
        this.textFieldWidget.method_25358(n5 - 4 - 20);
        this.textFieldWidget.method_1888(this.getParent().isEditable());
        this.textFieldWidget.method_1868(this.getPreferredTextColor());
        this.textFieldWidget.method_25394(class010542, n, n2, f);
        class02862 class028622 = class06202.Nq().NY();
        class06584 class065842 = this.hasConfigError() ? DropdownMenuBuilder$TopCellElementBuilder.BARRIER : new class06584((class07310)class04206.i.N((class01894)this.getValue()));
        class010542.N(class065842, n3 + n5 - 18, n4 + 2);
    }
}

