/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.CenteredFlatWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

abstract class PageListWidget$EntryWidget
extends CenteredFlatWidget {
    final /* synthetic */ PageListWidget this$0;

    PageListWidget$EntryWidget(PageListWidget pageListWidget, Dim2i dim2i, class00392 class003922, boolean bl, ColorTheme colorTheme) {
        this.this$0 = pageListWidget;
        super(dim2i, class003922, bl, colorTheme);
    }

    PageListWidget$EntryWidget(PageListWidget pageListWidget, Dim2i dim2i, class00392 class003922, class00392 class003923, boolean bl, ColorTheme colorTheme) {
        this.this$0 = pageListWidget;
        super(dim2i, class003922, class003923, bl, colorTheme);
    }

    @Override
    public int getY() {
        return super.getY() - PageListWidget.access$000((PageListWidget)this.this$0).getScrollAmount();
    }

    public int getScrollTargetStart() {
        return super.getY();
    }
}

