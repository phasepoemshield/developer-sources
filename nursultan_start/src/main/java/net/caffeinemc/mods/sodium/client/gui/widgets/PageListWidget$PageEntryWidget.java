/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.ColorTheme
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$ClickableEntryWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

abstract class PageListWidget$PageEntryWidget<P extends Page>
extends PageListWidget.ClickableEntryWidget {
    final P page;
    final int scrollTargetStart;

    /*
     * WARNING - Possible parameter corruption
     */
    PageListWidget$PageEntryWidget(Dim2i dim2i, P p, class00392 class003922, ColorTheme colorTheme, int n2) {
        super((PageListWidget)n, dim2i, class003922, true, colorTheme);
        this.page = p;
        this.scrollTargetStart = n2;
    }
}

