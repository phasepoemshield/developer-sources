/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class06608
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class06608;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$EntryWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

abstract class PageListWidget$ClickableEntryWidget
extends PageListWidget$EntryWidget {
    PageListWidget$ClickableEntryWidget(PageListWidget pageListWidget, Dim2i dim2i, class00392 class003922, boolean bl, ColorTheme colorTheme) {
        super(pageListWidget, dim2i, class003922, bl, colorTheme);
    }

    PageListWidget$ClickableEntryWidget(PageListWidget pageListWidget, Dim2i dim2i, class00392 class003922, class00392 class003923, boolean bl, ColorTheme colorTheme) {
        super(pageListWidget, dim2i, class003922, class003923, bl, colorTheme);
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        if (this.isHovered()) {
            class010542.N(class06608.u);
        }
    }
}

