/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.ColorTheme
 *  net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$ClickableEntryWidget
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$EntryWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import com.google.common.collect.ImmutableList;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$PageEntryWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

class PageListWidget$HeaderEntryWidget
extends PageListWidget.ClickableEntryWidget {
    private final ModOptions modOptions;
    private final class01894 icon;
    private final boolean iconMonochrome;
    final /* synthetic */ PageListWidget this$0;

    PageListWidget$HeaderEntryWidget(PageListWidget pageListWidget, Dim2i dim2i, ModOptions modOptions, ColorTheme colorTheme) {
        this.this$0 = pageListWidget;
        super(pageListWidget, dim2i, (class00392)class00392.y((String)modOptions.name()), (class00392)class00392.y((String)modOptions.version()), false, colorTheme);
        this.modOptions = modOptions;
        this.icon = modOptions.icon();
        this.iconMonochrome = modOptions.iconMonochrome();
    }

    protected int renderIcon(class01054 class010542, int n) {
        if (this.icon == null) {
            return super.renderIcon(class010542, n);
        }
        return VideoSettingsScreen.renderIconWithSpacing((class01054)class010542, (class01894)this.icon, (int)n, (boolean)this.iconMonochrome, (int)this.getX(), (int)this.getY(), (int)this.getHeight(), (int)4);
    }

    void onAction() {
        ImmutableList immutableList = this.modOptions.pages();
        if (immutableList.isEmpty()) {
            return;
        }
        Page page = (Page)immutableList.getFirst();
        PageListWidget$PageEntryWidget pageListWidget$PageEntryWidget = (PageListWidget$PageEntryWidget)((Object)this.this$0.pageToWidget.get((Object)page));
        if (pageListWidget$PageEntryWidget != null) {
            this.this$0.switchSelectedWidget((PageListWidget.EntryWidget)pageListWidget$PageEntryWidget);
        }
        this.this$0.parent.jumpToPage(page);
    }
}

