/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class05341
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class06478
 */
package me.shedaniel.clothconfig2.gui;

import com.google.common.collect.Lists;
import java.util.List;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class05341;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class06478;

class ClothConfigScreen$2
extends class05362 {
    final /* synthetic */ ClothConfigScreen this$0;

    ClothConfigScreen$2(ClothConfigScreen clothConfigScreen, int n, int n2, int n3, int n4, class00392 class003922, class05361 class053612, class05341 class053412) {
        this.this$0 = clothConfigScreen;
        super(n, n2, n3, n4, class003922, class053612, class053412);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        boolean bl = false;
        for (List list : Lists.newArrayList(this.this$0.categorizedEntries.values())) {
            for (AbstractConfigEntry abstractConfigEntry : list) {
                if (!abstractConfigEntry.getConfigError().isPresent()) continue;
                bl = true;
                break;
            }
            if (!bl) continue;
            break;
        }
        this.field_22763 = this.this$0.isEdited() && !bl;
        this.method_25355((class00392)(bl ? class00392.L((String)"text.cloth-config.error_cannot_save") : class00392.L((String)"text.cloth-config.save_and_done")));
        this.method_75794(class010542);
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
    }
}

