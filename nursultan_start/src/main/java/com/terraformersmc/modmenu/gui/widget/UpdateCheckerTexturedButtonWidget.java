/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class05361
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.gui.widget.LegacyTexturedButtonWidget;
import com.terraformersmc.modmenu.gui.widget.UpdateAvailableBadge;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class05361;

public class UpdateCheckerTexturedButtonWidget
extends LegacyTexturedButtonWidget {
    public UpdateCheckerTexturedButtonWidget(int n, int n2, int n3, int n4, int n5, int n6, int n7, class01894 class018942, int n8, int n9, class05361 class053612, class00392 class003922) {
        super(n, n2, n3, n4, n5, n6, n7, class018942, n8, n9, class053612, class003922);
    }

    @Override
    public void method_75752(class01054 class010542, int n, int n2, float f) {
        super.method_75752(class010542, n, n2, f);
        if (ModMenuConfig.BUTTON_UPDATE_BADGE.getValue() && ModMenu.areModUpdatesAvailable()) {
            UpdateAvailableBadge.renderBadge(class010542, this.method_46426() + this.field_22758 - 5, this.method_46427() - 3);
        }
    }
}

