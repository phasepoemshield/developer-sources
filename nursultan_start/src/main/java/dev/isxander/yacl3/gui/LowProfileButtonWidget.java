/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class04141
 *  minecraft.class05358
 *  minecraft.class05361
 *  minecraft.class06478
 */
package dev.isxander.yacl3.gui;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class04141;
import minecraft.class05358;
import minecraft.class05361;
import minecraft.class06478;

public class LowProfileButtonWidget
extends class05358 {
    public LowProfileButtonWidget(int n, int n2, int n3, int n4, class00392 class003922, class05361 class053612) {
        super(n, n2, n3, n4, class003922, class053612, field_40754);
    }

    public LowProfileButtonWidget(int n, int n2, int n3, int n4, class00392 class003922, class05361 class053612, class04141 class041412) {
        this(n, n2, n3, n4, class003922, class053612);
        this.method_47400(class041412);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        if (this.method_25367() && this.method_37303()) {
            this.method_75794(class010542);
        }
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
    }
}

