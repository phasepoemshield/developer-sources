/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.OptionGroup
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05096
 */
package dev.isxander.yacl3.gui;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.gui.OptionListWidget;
import dev.isxander.yacl3.gui.OptionListWidget$GroupSeparatorEntry;
import dev.isxander.yacl3.gui.TextScaledButtonWidget;
import dev.isxander.yacl3.gui.TooltipButtonWidget;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05096;

public class OptionListWidget$ListGroupSeparatorEntry
extends OptionListWidget$GroupSeparatorEntry {
    final ListOption<?> listOption;
    private final TextScaledButtonWidget resetListButton;
    private final TooltipButtonWidget addListButton;

    OptionListWidget$ListGroupSeparatorEntry(OptionListWidget optionListWidget, ListOption<?> listOption, class05096 class050962) {
        super(optionListWidget, (OptionGroup)listOption, class050962);
        this.listOption = listOption;
        this.resetListButton = new TextScaledButtonWidget(class050962, optionListWidget.method_31383() - 20, -50, 20, 20, 1.0f, (class00392)class00392.y((String)"\u21bb"), class053622 -> listOption.requestSetDefault());
        listOption.addListener((option, list) -> {
            this.resetListButton.field_22763 = !option.isPendingValueDefault() && option.available();
        });
        this.resetListButton.field_22763 = !listOption.isPendingValueDefault() && listOption.available();
        this.addListButton = new TooltipButtonWidget(optionListWidget.yaclScreen, this.resetListButton.method_46426() - 20, -50, 20, 20, (class00392)class00392.y((String)"+"), (class00392)class00392.L((String)"yacl.list.add_top"), class053622 -> {
            listOption.insertNewEntry();
            this.setExpanded(true);
        });
        this.updateExpandMinimizeText();
        this.minimizeIfUnavailable();
    }

    @Override
    public List<? extends class04654> method_25396() {
        return ImmutableList.of((Object)((Object)this.expandMinimizeButton), (Object)((Object)this.addListButton), (Object)((Object)this.resetListButton));
    }

    @Override
    protected void updateExpandMinimizeText() {
        super.updateExpandMinimizeText();
        boolean bl = this.expandMinimizeButton.field_22763 = this.listOption == null || this.listOption.available();
        if (this.addListButton != null) {
            this.addListButton.field_22763 = this.expandMinimizeButton.field_22763 && this.listOption.numberOfEntries() < this.listOption.maximumNumberOfEntries();
        }
    }

    private void minimizeIfUnavailable() {
        if (!this.listOption.available() && this.isExpanded()) {
            this.setExpanded(false);
        }
    }

    @Override
    public void setExpanded(boolean bl) {
        super.setExpanded(this.listOption.available() && bl);
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        if (!this.isViewable()) {
            return;
        }
        this.updateExpandMinimizeText();
        super.method_25343(class010542, n, n2, bl, f);
        int n3 = this.expandMinimizeButton.method_46427();
        this.resetListButton.method_46419(n3);
        this.addListButton.method_46419(n3);
        this.resetListButton.method_25394(class010542, n, n2, f);
        this.addListButton.method_25394(class010542, n, n2, f);
    }
}

