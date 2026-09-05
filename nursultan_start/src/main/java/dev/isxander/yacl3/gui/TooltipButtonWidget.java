/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05096
 *  minecraft.class05358
 *  minecraft.class05361
 */
package dev.isxander.yacl3.gui;

import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05096;
import minecraft.class05358;
import minecraft.class05361;

public class TooltipButtonWidget
extends class05358 {
    protected final class05096 screen;

    public TooltipButtonWidget(class05096 class050962, int n, int n2, int n3, int n4, class00392 class003922, class00392 class003923, class05361 class053612) {
        super(n, n2, n3, n4, class003922, class053612, field_40754);
        this.screen = class050962;
        if (class003923 != null) {
            this.method_47400(class04141.N((class00392)class003923));
        }
    }
}

