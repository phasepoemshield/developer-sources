/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellElement
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02862
 *  minecraft.class06202
 *  minecraft.class06584
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$9;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02862;
import minecraft.class06202;
import minecraft.class06584;

class DropdownMenuBuilder$CellCreatorBuilder$9$1
extends DropdownBoxEntry.DefaultSelectionCellElement<class01894> {
    final /* synthetic */ class06584 val$s;

    DropdownMenuBuilder$CellCreatorBuilder$9$1(DropdownMenuBuilder.CellCreatorBuilder.9 var1_1, class01894 class018942, Function function, class06584 class065842) {
        this.val$s = class065842;
        super((Object)class018942, function);
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f) {
        boolean bl;
        this.rendering = true;
        this.x = n3;
        this.y = n4;
        this.width = n5;
        this.height = n6;
        boolean bl2 = bl = n >= n3 && n <= n3 + n5 && n2 >= n4 && n2 <= n4 + n6;
        if (bl) {
            class010542.N(n3 + 1, n4 + 1, n3 + n5 - 1, n4 + n6 - 1, -15132391);
        }
        class010542.y((class01590)class06202.Nq().i_3, ((class00392)this.toTextFunction.apply((class01894)this.r)).method_30937(), n3 + 6 + 18, n4 + 6, bl ? -1 : -7829368);
        class02862 class028622 = class06202.Nq().NY();
        class010542.N(this.val$s, n3 + 4, n4 + 2);
    }
}

