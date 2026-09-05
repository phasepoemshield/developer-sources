/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.ColorTheme
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$EntryWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$PageEntryWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

class PageListWidget$OptionPageEntryWidget
extends PageListWidget$PageEntryWidget<Page> {
    final /* synthetic */ PageListWidget this$0;

    PageListWidget$OptionPageEntryWidget(PageListWidget pageListWidget, Dim2i dim2i, Page page, ColorTheme colorTheme, int n) {
        this.this$0 = pageListWidget;
        super(pageListWidget, dim2i, page, page.name(), colorTheme, n);
    }

    public int getScrollTargetStart() {
        return this.scrollTargetStart;
    }

    void onAction() {
        this.this$0.switchSelectedWidget((PageListWidget.EntryWidget)this);
        this.this$0.parent.jumpToPage(this.page);
    }
}

