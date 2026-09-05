/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  minecraft.class01054
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager
 *  net.caffeinemc.mods.sodium.client.config.structure.ExternalPage
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.config.structure.Option$OptionNameSource
 *  net.caffeinemc.mods.sodium.client.config.structure.OptionGroup
 *  net.caffeinemc.mods.sodium.client.config.structure.OptionPage
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.widgets.ScrollbarWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class01054;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalPage;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.OptionPage;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.Layout;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget$ExternalPageWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget$GroupHeaderWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget$ModHeaderWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget$PageHeaderWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget$SectionInfo;
import net.caffeinemc.mods.sodium.client.gui.widgets.ScrollbarWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.NonNull;

public class OptionListWidget
extends AbstractOptionList {
    private List<Option.OptionNameSource> filteredOptions = null;
    private final Reference2ReferenceMap<Page, OptionListWidget$SectionInfo> pageToSectionInfo = new Reference2ReferenceOpenHashMap();
    private final Consumer<Page> onPageFocused;
    private OptionListWidget$SectionInfo lastFocusedSection;
    private boolean ignoreNextScrollUpdate = false;
    private int entryHeight;

    public OptionListWidget(class05096 class050962, Dim2i dim2i, Consumer<Page> consumer) {
        super(dim2i.insetLeft(3));
        this.onPageFocused = consumer;
        this.rebuild(class050962);
    }

    @Override
    public void method_25394(@NonNull class01054 class010542, int n, int n2, float f) {
        class010542.L(this.getX(), this.getY(), this.getLimitX(), this.getLimitY());
        super.method_25394(class010542, n, n2, f);
        class010542.R();
    }

    public void setFilteredOptions(List<Option.OptionNameSource> list) {
        this.filteredOptions = list;
    }

    static void resetAllOptions(Page page) {
        for (OptionGroup optionGroup : page.groups()) {
            for (Option option : optionGroup.options()) {
                option.resetToDefault();
            }
        }
    }

    static void resetAllOptions(ModOptions modOptions) {
        for (Page page : modOptions.pages()) {
            OptionListWidget.resetAllOptions(page);
        }
    }

    public void clearFilter() {
        this.filteredOptions = null;
    }

    private void updateSectionFocus(int n) {
        if (this.ignoreNextScrollUpdate) {
            this.ignoreNextScrollUpdate = false;
            return;
        }
        int n2 = n + this.getY() + Math.min(this.entryHeight * 3, this.getHeight() / 2);
        OptionListWidget$SectionInfo optionListWidget$SectionInfo = null;
        for (OptionListWidget$SectionInfo optionListWidget$SectionInfo2 : this.pageToSectionInfo.values()) {
            if (n2 < optionListWidget$SectionInfo2.startY || n2 > optionListWidget$SectionInfo2.endY) continue;
            optionListWidget$SectionInfo = optionListWidget$SectionInfo2;
            break;
        }
        if (optionListWidget$SectionInfo != null && optionListWidget$SectionInfo != this.lastFocusedSection) {
            this.lastFocusedSection = optionListWidget$SectionInfo;
            this.onPageFocused.accept(optionListWidget$SectionInfo.page());
        }
    }

    private int renderAllPages(class05096 class050962, int n, int n2, int n3) {
        int n4 = -12;
        for (ModOptions modOptions : ConfigManager.CONFIG.getModOptions()) {
            if (modOptions.pages().isEmpty()) continue;
            ColorTheme colorTheme = modOptions.theme();
            int n5 = n4 += 12;
            OptionListWidget$ModHeaderWidget optionListWidget$ModHeaderWidget = new OptionListWidget$ModHeaderWidget(this, new Dim2i(n, n2 + n4, n3, this.entryHeight), modOptions, colorTheme);
            this.addRenderableChild(optionListWidget$ModHeaderWidget);
            n4 += this.entryHeight;
            for (Page page : modOptions.pages()) {
                int n6 = n4;
                if (page instanceof OptionPage) {
                    var15_16 = new OptionListWidget$PageHeaderWidget(this, new Dim2i(n, n2 + (n4 += 6), n3, this.entryHeight), page, colorTheme);
                    this.addRenderableChild(var15_16);
                    n4 += this.entryHeight;
                    for (OptionGroup optionGroup : page.groups()) {
                        n4 += 3;
                        if (optionGroup.name() != null) {
                            OptionListWidget$GroupHeaderWidget optionListWidget$GroupHeaderWidget = new OptionListWidget$GroupHeaderWidget(this, new Dim2i(n, n2 + n4, n3, this.entryHeight).insetLeft(3), optionGroup.name().getString());
                            this.addRenderableChild(optionListWidget$GroupHeaderWidget);
                            n4 += this.entryHeight;
                        }
                        for (Option option : optionGroup.options()) {
                            Control control = option.getControl();
                            ControlElement controlElement = control.createElement(class050962, this, new Dim2i(n, n2 + n4, n3, this.entryHeight).insetLeft(3), colorTheme);
                            this.addRenderableChild(controlElement);
                            this.controls.add(controlElement);
                            n4 += this.entryHeight;
                        }
                    }
                } else if (page instanceof ExternalPage) {
                    ExternalPage externalPage = (ExternalPage)page;
                    var15_16 = new OptionListWidget$ExternalPageWidget(class050962, this, new Dim2i(n, n2 + (n4 += 6), n3, this.entryHeight), externalPage, colorTheme);
                    this.addRenderableChild(var15_16);
                    n4 += this.entryHeight;
                } else {
                    throw new IllegalStateException("Unknown page type: " + String.valueOf(page.getClass()));
                }
                int n7 = n6;
                if (n5 != -1) {
                    n7 = n5;
                    n5 = -1;
                }
                Object object = new OptionListWidget$SectionInfo(modOptions, page, n6, n4, n7);
                this.pageToSectionInfo.put((Object)page, object);
            }
        }
        return n4;
    }

    private int renderFilteredOptions(class05096 class050962, int n, int n2, int n3) {
        int n4 = -12;
        Option.OptionNameSource optionNameSource = null;
        for (Option.OptionNameSource optionNameSource2 : this.filteredOptions) {
            AbstractWidget abstractWidget;
            Option option = optionNameSource2.getOption();
            Control control = option.getControl();
            ModOptions modOptions = optionNameSource2.getModOptions();
            OptionPage optionPage = optionNameSource2.getPage();
            ColorTheme colorTheme = modOptions.theme();
            if (optionNameSource == null || optionNameSource.getModOptions() != modOptions) {
                abstractWidget = new OptionListWidget$ModHeaderWidget(this, new Dim2i(n, n2 + (n4 += 12), n3, this.entryHeight), modOptions, colorTheme);
                this.addRenderableChild(abstractWidget);
                n4 += this.entryHeight;
            }
            if (optionNameSource == null || optionNameSource.getPage() != optionPage) {
                abstractWidget = new OptionListWidget$PageHeaderWidget(this, new Dim2i(n, n2 + (n4 += 6), n3, this.entryHeight), (Page)optionPage, colorTheme);
                this.addRenderableChild(abstractWidget);
                n4 += this.entryHeight;
            }
            if (optionNameSource == null || optionNameSource.getOptionGroup() != optionNameSource2.getOptionGroup()) {
                n4 += 3;
            }
            abstractWidget = control.createElement(class050962, this, new Dim2i(n, n2 + n4, n3, this.entryHeight).insetLeft(3), colorTheme);
            this.addRenderableChild(abstractWidget);
            this.controls.add(abstractWidget);
            n4 += this.entryHeight;
            optionNameSource = optionNameSource2;
        }
        return n4;
    }

    public void jumpToPage(Page page) {
        OptionListWidget$SectionInfo optionListWidget$SectionInfo = (OptionListWidget$SectionInfo)((Object)this.pageToSectionInfo.get((Object)page));
        if (optionListWidget$SectionInfo != null) {
            this.ignoreNextScrollUpdate = true;
            this.scrollbar.scrollTo(optionListWidget$SectionInfo.scrollJumpTarget);
        }
    }

    public void rebuild(class05096 class050962) {
        int n = this.getX();
        int n2 = this.getY();
        int n3 = this.getWidth() - 5 - 7;
        int n4 = this.getHeight();
        this.clearChildren();
        this.controls.clear();
        this.pageToSectionInfo.clear();
        this.scrollbar = this.addRenderableChild(new ScrollbarWidget(new Dim2i(n + n3 + 5, n2, 7, n4), this::updateSectionFocus));
        this.entryHeight = Layout.entryHeight(this.font);
        int n5 = this.filteredOptions != null ? this.renderFilteredOptions(class050962, n, n2, n3) : this.renderAllPages(class050962, n, n2, n3);
        this.updateSectionFocus(this.scrollbar.getScrollAmount());
        this.scrollbar.setScrollbarContext(n5);
    }
}

