/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager
 *  net.caffeinemc.mods.sodium.client.config.structure.ExternalPage
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.OptionPage
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.ColorTheme
 *  net.caffeinemc.mods.sodium.client.gui.Layout
 *  net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen
 *  net.caffeinemc.mods.sodium.client.gui.options.control.AbstractScrollable
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$EntryWidget
 *  net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$ExternalPageEntryWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalPage;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.OptionPage;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.Layout;
import net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractScrollable;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$HeaderEntryWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$OptionPageEntryWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.PageListWidget$PageEntryWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.ScrollbarWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.NonNull;

public class PageListWidget
extends AbstractScrollable {
    final VideoSettingsScreen parent;
    private EntryWidget selected;
    final Reference2ReferenceMap<Page, PageListWidget$PageEntryWidget<?>> pageToWidget = new Reference2ReferenceOpenHashMap();

    static /* synthetic */ ScrollbarWidget access$000(PageListWidget pageListWidget) {
        return pageListWidget.scrollbar;
    }

    public PageListWidget(Dim2i dim2i, VideoSettingsScreen videoSettingsScreen) {
        super(dim2i);
        this.parent = videoSettingsScreen;
        this.rebuild();
    }

    public void method_25394(@NonNull class01054 class010542, int n, int n2, float f) {
        PageListWidget.renderBackgroundGradient(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY());
        class010542.L(this.getX(), this.getY(), this.getLimitX(), this.getLimitY());
        super.method_25394(class010542, n, n2, f);
        class010542.R();
    }

    public void switchSelected(Page page) {
        this.switchSelectedWidget((EntryWidget)this.pageToWidget.get((Object)page));
    }

    public static void renderBackgroundGradient(class01054 class010542, int n, int n2, int n3, int n4) {
        class010542.N(n, n2, n3, n4, 0x40000000, -1879048192);
    }

    void switchSelectedWidget(EntryWidget entryWidget) {
        if (entryWidget != this.selected) {
            if (this.selected != null) {
                this.selected.setSelected(false);
            }
            this.selected = entryWidget;
            this.selected.setSelected(true);
        }
        int n = this.selected.getScrollTargetStart();
        int n2 = n + this.selected.getHeight();
        int n3 = this.getY() + this.scrollbar.getScrollAmount();
        int n4 = n3 + this.getHeight();
        if (n < n3) {
            this.scrollbar.scrollTo(n - this.getY());
        } else if (n2 > n4) {
            this.scrollbar.scrollTo(n2 - this.getY() - this.getHeight());
        }
    }

    private void rebuild() {
        int n = this.getX();
        int n2 = this.getY();
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        this.clearChildren();
        this.scrollbar = (ScrollbarWidget)this.addRenderableChild((class04654)new ScrollbarWidget(new Dim2i(this.getLimitX() - 7, n2, 7, n4), false, false));
        int n5 = Layout.entryHeight((class01590)this.font);
        int n6 = Layout.pageHeaderHeight((class01590)this.font);
        int n7 = 0;
        for (ModOptions modOptions : ConfigManager.CONFIG.getModOptions()) {
            if (modOptions.pages().isEmpty()) continue;
            ColorTheme colorTheme = modOptions.theme();
            Dim2i dim2i = new Dim2i(n, n2 + (n7 += 2), n3, n6);
            int n8 = dim2i.y();
            PageListWidget$HeaderEntryWidget pageListWidget$HeaderEntryWidget = new PageListWidget$HeaderEntryWidget(this, dim2i, modOptions, colorTheme);
            n7 += n6;
            this.addRenderableChild((class04654)pageListWidget$HeaderEntryWidget);
            for (Page page : modOptions.pages()) {
                PageListWidget$OptionPageEntryWidget pageListWidget$OptionPageEntryWidget;
                Dim2i dim2i2 = new Dim2i(n, n2 + n7, n3, n5);
                int n9 = dim2i2.y();
                if (n8 != -1) {
                    n9 = n8;
                    n8 = -1;
                }
                if (page instanceof OptionPage) {
                    OptionPage optionPage = (OptionPage)page;
                    pageListWidget$OptionPageEntryWidget = new PageListWidget$OptionPageEntryWidget(this, dim2i2, (Page)optionPage, colorTheme, n9);
                } else if (page instanceof ExternalPage) {
                    ExternalPage externalPage = (ExternalPage)page;
                    pageListWidget$OptionPageEntryWidget = new ExternalPageEntryWidget(this, dim2i2, externalPage, colorTheme, n9);
                } else {
                    throw new IllegalStateException("Unknown page type: " + String.valueOf(page.getClass()));
                }
                this.pageToWidget.put((Object)page, (Object)pageListWidget$OptionPageEntryWidget);
                n7 += n5;
                this.addRenderableChild((class04654)pageListWidget$OptionPageEntryWidget);
            }
        }
        this.scrollbar.setScrollbarContext(n7 + 5);
    }
}

