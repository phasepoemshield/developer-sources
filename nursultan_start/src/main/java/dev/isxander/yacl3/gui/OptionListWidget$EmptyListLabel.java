/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ConfigCategory
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class06202
 *  minecraft.class06541
 */
package dev.isxander.yacl3.gui;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.gui.OptionListWidget;
import dev.isxander.yacl3.gui.OptionListWidget$Entry;
import dev.isxander.yacl3.gui.OptionListWidget$ListGroupSeparatorEntry;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class06202;
import minecraft.class06541;

public class OptionListWidget$EmptyListLabel
extends OptionListWidget$Entry {
    private final OptionListWidget$ListGroupSeparatorEntry parent;
    private final String groupName;
    private final String categoryName;

    public OptionListWidget$EmptyListLabel(OptionListWidget optionListWidget, OptionListWidget$ListGroupSeparatorEntry optionListWidget$ListGroupSeparatorEntry, ConfigCategory configCategory) {
        super(optionListWidget);
        this.parent = optionListWidget$ListGroupSeparatorEntry;
        this.groupName = optionListWidget$ListGroupSeparatorEntry.group.name().getString().toLowerCase();
        this.categoryName = configCategory.name().getString().toLowerCase();
        this.method_73383(11);
    }

    public List<? extends class04654> method_25396() {
        return ImmutableList.of();
    }

    @Override
    public boolean isViewable() {
        return this.parent.isExpanded() && super.isViewable();
    }

    @Override
    public boolean updateSearchQuery(String string) {
        this.searchQueryMatches = string.isEmpty() || this.groupName.contains(string);
        return this.searchQueryMatches;
    }

    @Override
    protected void onBecameHidden() {
        super.onBecameHidden();
        this.method_73383(0);
    }

    public List<? extends class03434> method_37025() {
        return ImmutableList.of();
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.N((class01590)class06202.Nq().i_3, (class00392)class00392.L((String)"yacl.list.empty").N(new class06541[]{class06541.field_1063, class06541.field_1056}), this.method_46426() + this.method_25368() / 2, this.method_46427(), -1);
    }
}

