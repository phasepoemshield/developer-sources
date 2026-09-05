/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05096
 *  minecraft.class05358
 *  minecraft.class05362
 *  minecraft.class06202
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.gui.widget.UpdateAvailableBadge;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05096;
import minecraft.class05358;
import minecraft.class05362;
import minecraft.class06202;

public class ModMenuButtonWidget
extends class05358 {
    public ModMenuButtonWidget(int n, int n2, int n3, int n4, class00392 class003922, class05096 class050962) {
        super(n, n2, n3, n4, class003922, class053622 -> class06202.Nq().N((class05096)new ModsScreen(class050962)), class05362.field_40754);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        super.method_75752(class010542, n, n2, f);
        if (ModMenuConfig.BUTTON_UPDATE_BADGE.getValue() && ModMenu.areModUpdatesAvailable()) {
            UpdateAvailableBadge.renderBadge(class010542, this.field_22758 + this.method_46426() - 13, this.field_22759 / 2 + this.method_46427() - 5);
        }
    }
}

