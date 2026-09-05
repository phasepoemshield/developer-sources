/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class05096
 *  minecraft.class05361
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.TooltipButtonWidget;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class05096;
import minecraft.class05361;

public class TextScaledButtonWidget
extends TooltipButtonWidget {
    public float textScale;

    public TextScaledButtonWidget(class05096 class050962, int n, int n2, int n3, int n4, float f, class00392 class003922, class00392 class003923, class05361 class053612) {
        super(class050962, n, n2, n3, n4, class003922, class003923, class053612);
        this.textScale = f;
    }

    public TextScaledButtonWidget(class05096 class050962, int n, int n2, int n3, int n4, float f, class00392 class003922, class05361 class053612) {
        this(class050962, n, n2, n3, n4, f, class003922, null, class053612);
    }

    public void method_75793(class00580 class005802) {
        super.method_75793(class005802);
    }
}

