/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.OptionGroup
 *  minecraft.class00392
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05482
 *  minecraft.class06202
 */
package dev.isxander.yacl3.gui;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.gui.DescriptionWithName;
import dev.isxander.yacl3.gui.LowProfileButtonWidget;
import dev.isxander.yacl3.gui.OptionListWidget;
import dev.isxander.yacl3.gui.OptionListWidget$Entry;
import dev.isxander.yacl3.gui.OptionListWidget$GroupSeparatorEntry$1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05482;
import minecraft.class06202;

public class OptionListWidget$GroupSeparatorEntry
extends OptionListWidget$Entry {
    protected final OptionGroup group;
    protected final class05482 wrappedName;
    protected final class05482 wrappedTooltip;
    protected final LowProfileButtonWidget expandMinimizeButton;
    protected final class05096 screen;
    protected final class01590 font;
    protected boolean groupExpanded;
    protected List<OptionListWidget$Entry> childEntries;
    final /* synthetic */ OptionListWidget this$0;

    OptionListWidget$GroupSeparatorEntry(OptionListWidget optionListWidget, OptionGroup optionGroup, class05096 class050962) {
        this.this$0 = optionListWidget;
        super(optionListWidget);
        this.font = (class01590)class06202.Nq().i_3;
        this.childEntries = new ArrayList<OptionListWidget$Entry>();
        this.group = optionGroup;
        this.screen = class050962;
        this.wrappedName = class05482.N((class01590)this.font, (class00392)optionGroup.name(), (int)(optionListWidget.method_25322() - 45));
        this.wrappedTooltip = class05482.N((class01590)this.font, (class00392)optionGroup.tooltip(), (int)(class050962.field_22789 / 3 * 2 - 10));
        this.groupExpanded = !optionGroup.collapsed();
        this.expandMinimizeButton = new LowProfileButtonWidget(0, 0, 20, 20, (class00392)class00392.i(), class053622 -> this.onExpandButtonPress());
        this.updateExpandMinimizeText();
        this.updateHeight();
    }

    public List<? extends class04654> method_25396() {
        return ImmutableList.of((Object)((Object)this.expandMinimizeButton));
    }

    public void method_25365(boolean bl) {
        super.method_25365(bl);
        if (bl) {
            this.this$0.setHoverDescription(DescriptionWithName.of(this.group.name(), this.group.description()));
        }
    }

    protected void updateExpandMinimizeText() {
        this.expandMinimizeButton.method_25355((class00392)class00392.y((String)(this.isExpanded() ? "\u25bc" : "\u25b6")));
    }

    protected void onExpandButtonPress() {
        this.setExpanded(!this.isExpanded());
    }

    public boolean isExpanded() {
        return this.groupExpanded;
    }

    public void setExpanded(boolean bl) {
        if (this.groupExpanded == bl) {
            return;
        }
        this.groupExpanded = bl;
        this.updateExpandMinimizeText();
        this.childEntries.forEach(OptionListWidget$Entry::refreshVisibilityState);
        this.this$0.repositionEntries();
    }

    private void updateHeight() {
        int n = Math.max(this.wrappedName.N(), 1);
        Objects.requireNonNull(this.font);
        this.method_73383(n * 9 + this.getYPadding() * 2);
    }

    private int getYPadding() {
        return 6;
    }

    public void setChildEntries(List<? extends OptionListWidget$Entry> list) {
        this.childEntries.clear();
        this.childEntries.addAll(list);
    }

    @Override
    public boolean updateSearchQuery(String string) {
        this.searchQueryMatches = string.isEmpty() || this.childEntries.stream().anyMatch(optionListWidget$Entry -> optionListWidget$Entry.updateSearchQuery(string));
        return this.searchQueryMatches;
    }

    public List<? extends class03434> method_37025() {
        return ImmutableList.of((Object)new OptionListWidget$GroupSeparatorEntry$1(this));
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        if (!this.isViewable()) {
            return;
        }
        this.updateHeight();
        int n3 = this.method_46427() + this.method_25364() / 2 - this.expandMinimizeButton.method_25364() / 2 + 1;
        this.expandMinimizeButton.method_46419(n3);
        this.expandMinimizeButton.method_46421(this.method_46426());
        this.expandMinimizeButton.method_25394(class010542, n, n2, f);
        int n4 = this.method_46426() + this.method_25368() / 2;
        int n5 = this.method_46427() + this.getYPadding();
        Objects.requireNonNull(this.font);
        this.wrappedName.N(class00937.field_62010, n4, n5, 9, class010542.B());
        if (this.method_25405(n, n2)) {
            this.this$0.setHoverDescription(DescriptionWithName.of(this.group.name(), this.group.description()));
        }
    }
}

