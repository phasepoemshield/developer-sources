/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.caffeinemc.mods.sodium.client.config.structure.ExternalPage
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$PageEntryWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalPage;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

class PageListWidget$ExternalPageEntryWidget
extends PageListWidget.PageEntryWidget<ExternalPage> {
    final /* synthetic */ PageListWidget this$0;

    PageListWidget$ExternalPageEntryWidget(PageListWidget pageListWidget, Dim2i dim2i, ExternalPage externalPage, ColorTheme colorTheme, int n) {
        this.this$0 = pageListWidget;
        super(pageListWidget, dim2i, (Page)externalPage, (class00392)class00392.y((String)"\u25b6 ").y(externalPage.name()), colorTheme, n);
    }

    void onAction() {
        ((ExternalPage)this.page).currentScreenConsumer().accept(this.this$0.parent);
    }
}

