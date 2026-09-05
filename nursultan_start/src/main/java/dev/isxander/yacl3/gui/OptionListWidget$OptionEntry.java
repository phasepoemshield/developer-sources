/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05096
 */
package dev.isxander.yacl3.gui;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.DescriptionWithName;
import dev.isxander.yacl3.gui.OptionListWidget;
import dev.isxander.yacl3.gui.OptionListWidget$Entry;
import dev.isxander.yacl3.gui.OptionListWidget$GroupSeparatorEntry;
import dev.isxander.yacl3.gui.TextScaledButtonWidget;
import dev.isxander.yacl3.gui.utils.WidgetUtils;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05096;

public class OptionListWidget$OptionEntry
extends OptionListWidget$Entry {
    public final Option<?> option;
    public final ConfigCategory category;
    public final OptionGroup group;
    public final OptionListWidget$GroupSeparatorEntry groupSeparatorEntry;
    public final AbstractWidget widget;
    private final TextScaledButtonWidget resetButton;
    private final String categoryName;
    private final String groupName;
    final /* synthetic */ OptionListWidget this$0;

    public OptionListWidget$OptionEntry(OptionListWidget optionListWidget, Option<?> option2, ConfigCategory configCategory, OptionGroup optionGroup, OptionListWidget$GroupSeparatorEntry optionListWidget$GroupSeparatorEntry, AbstractWidget abstractWidget) {
        this.this$0 = optionListWidget;
        super(optionListWidget);
        this.option = option2;
        this.category = configCategory;
        this.group = optionGroup;
        this.groupSeparatorEntry = optionListWidget$GroupSeparatorEntry;
        this.widget = abstractWidget;
        this.categoryName = configCategory.name().getString().toLowerCase();
        this.groupName = optionGroup.name().getString().toLowerCase();
        if (option2.canResetToDefault() && this.widget.canReset()) {
            this.widget.setDimension((Dimension<Integer>)this.widget.getDimension().expanded((Number)-20, (Number)0));
            this.resetButton = new TextScaledButtonWidget((class05096)optionListWidget.yaclScreen, (int)((Integer)abstractWidget.getDimension().xLimit()), -50, 20, 20, 2.0f, (class00392)class00392.y((String)"\u21bb"), class053622 -> option2.requestSetDefault());
            option2.addListener((option, object) -> {
                this.resetButton.field_22763 = !option.isPendingValueDefault() && option.available();
            });
            this.resetButton.field_22763 = !option2.isPendingValueDefault() && option2.available();
        } else {
            this.resetButton = null;
        }
        this.updateHeight();
    }

    public List<? extends class04654> method_25396() {
        if (this.resetButton == null) {
            return ImmutableList.of((Object)this.widget);
        }
        return ImmutableList.of((Object)this.widget, (Object)((Object)this.resetButton));
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        return this.widget.method_25401(d, d2, d3, d4);
    }

    public void method_25365(boolean bl) {
        super.method_25365(bl);
        if (bl) {
            this.this$0.setHoverDescription(DescriptionWithName.of(this.option.name(), this.option.description()));
        }
    }

    @Override
    public boolean keyPressed(int n, int n2, int n3) {
        return WidgetUtils.keyPressed(this.widget, n, n2, n3);
    }

    @Override
    public boolean isViewable() {
        return super.isViewable() && (this.groupSeparatorEntry == null || this.groupSeparatorEntry.isExpanded());
    }

    @Override
    public boolean charTyped(char c, int n) {
        return WidgetUtils.charTyped(this.widget, c, n);
    }

    private void updateHeight() {
        this.method_73383(Math.max((Integer)this.widget.getDimension().height(), this.resetButton != null ? this.resetButton.method_25364() : 0) + 2);
    }

    @Override
    public boolean updateSearchQuery(String string) {
        this.searchQueryMatches = string.isEmpty() || this.groupName.contains(string) || this.widget.matchesSearch(string);
        this.refreshVisibilityState();
        return this.searchQueryMatches;
    }

    @Override
    protected void onBecameViewable() {
        super.onBecameViewable();
        this.updateHeight();
    }

    public List<? extends class03434> method_37025() {
        if (this.resetButton == null) {
            return ImmutableList.of((Object)this.widget);
        }
        return ImmutableList.of((Object)this.widget, (Object)((Object)this.resetButton));
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        if (!this.isViewable()) {
            return;
        }
        this.updateHeight();
        this.widget.setDimension((Dimension<Integer>)this.widget.getDimension().withY((Number)this.method_46427()));
        this.widget.method_25394(class010542, n, n2, f);
        if (this.resetButton != null) {
            this.resetButton.method_46419(this.method_46427());
            this.resetButton.method_25394(class010542, n, n2, f);
        }
        if (this.method_25405(n, n2)) {
            this.this$0.setHoverDescription(DescriptionWithName.of(this.option.name(), this.option.description()));
        }
    }
}

