/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04897
 *  minecraft.class05361
 *  minecraft.class08394
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget$Builder;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04897;
import minecraft.class05361;
import minecraft.class08394;

public class LegacyTexturedButtonWidget
extends class04897 {
    private final int u;
    private final int v;
    private final int hoveredVOffset;
    private final class01894 texture;
    private final int textureWidth;
    private final int textureHeight;

    public LegacyTexturedButtonWidget(int n, int n2, int n3, int n4, int n5, int n6, int n7, class01894 class018942, int n8, int n9, class05361 class053612, class00392 class003922) {
        super(n, n2, n3, n4, null, class053612, class003922);
        this.u = n5;
        this.v = n6;
        this.hoveredVOffset = n7;
        this.texture = class018942;
        this.textureWidth = n8;
        this.textureHeight = n9;
    }

    public static LegacyTexturedButtonWidget$Builder legacyTexturedBuilder(class00392 class003922, class05361 class053612) {
        return new LegacyTexturedButtonWidget$Builder(class003922, class053612);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        int n3 = this.v;
        if (!this.method_37303()) {
            n3 += this.hoveredVOffset * 2;
        } else if (this.method_25367()) {
            n3 += this.hoveredVOffset;
        }
        class010542.N(class08394.Na, this.texture, this.method_46426(), this.method_46427(), (float)this.u, (float)n3, this.field_22758, this.field_22759, this.textureWidth, this.textureHeight);
    }
}

