/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.ListOptionEntry
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  dev.isxander.yacl3.mixin.AbstractSelectionListAccessor
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class03249
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class06202
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.ListOptionEntry;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.DescriptionWithName;
import dev.isxander.yacl3.gui.OptionListWidget$EmptyListLabel;
import dev.isxander.yacl3.gui.OptionListWidget$Entry;
import dev.isxander.yacl3.gui.OptionListWidget$GroupSeparatorEntry;
import dev.isxander.yacl3.gui.OptionListWidget$ListGroupSeparatorEntry;
import dev.isxander.yacl3.gui.OptionListWidget$OptionEntry;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.YACLSelectionList;
import dev.isxander.yacl3.gui.utils.WidgetUtils;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import dev.isxander.yacl3.mixin.AbstractSelectionListAccessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class03249;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class06202;

public class OptionListWidget
extends YACLSelectionList<OptionListWidget$Entry> {
    final YACLScreen yaclScreen;
    private final ConfigCategory category;
    private String searchQuery = "";
    private final Consumer<DescriptionWithName> hoverEvent;
    private DescriptionWithName lastHoveredOption;

    public OptionListWidget(YACLScreen yACLScreen, ConfigCategory configCategory, class06202 class062022, int n, int n2, int n3, int n4, Consumer<DescriptionWithName> consumer) {
        super(class062022, n3, n4, n2);
        this.yaclScreen = yACLScreen;
        this.category = configCategory;
        this.hoverEvent = consumer;
        this.refreshOptions();
        for (OptionGroup optionGroup : configCategory.groups()) {
            if (!(optionGroup instanceof ListOption)) continue;
            ListOption listOption = (ListOption)optionGroup;
            listOption.addRefreshListener(() -> this.refreshListEntries(listOption, configCategory));
        }
    }

    protected int addEntry(OptionListWidget$Entry optionListWidget$Entry) {
        return this.method_73370((class01202)optionListWidget$Entry, optionListWidget$Entry.method_25364());
    }

    protected OptionListWidget$Entry nextEntry(class03249 class032492, Predicate<OptionListWidget$Entry> predicate, OptionListWidget$Entry optionListWidget$Entry2) {
        return (OptionListWidget$Entry)super.method_48199(class032492, optionListWidget$Entry -> optionListWidget$Entry.isViewable() && predicate.test((OptionListWidget$Entry)((Object)optionListWidget$Entry)), (class01202)optionListWidget$Entry2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        OptionListWidget$Entry optionListWidget$Entry;
        super.method_25401(d, d2, d3, d4);
        Iterator iterator = this.method_25396().iterator();
        while (iterator.hasNext() && !(optionListWidget$Entry = (OptionListWidget$Entry)((Object)iterator.next())).method_25401(d, d2, d3, d4)) {
        }
        return true;
    }

    @Override
    public boolean keyPressed(int n, int n2, int n3) {
        for (OptionListWidget$Entry optionListWidget$Entry : this.method_25396()) {
            if (!optionListWidget$Entry.keyPressed(n, n2, n3)) continue;
            return true;
        }
        return super.keyPressed(n, n2, n3);
    }

    @Override
    public boolean mouseClicked(double d, double d2, int n) {
        for (OptionListWidget$Entry optionListWidget$Entry : this.method_25396()) {
            if (optionListWidget$Entry == this.method_25308(d, d2) || !(optionListWidget$Entry instanceof OptionListWidget$OptionEntry)) continue;
            OptionListWidget$OptionEntry optionListWidget$OptionEntry = (OptionListWidget$OptionEntry)optionListWidget$Entry;
            optionListWidget$OptionEntry.widget.unfocus();
        }
        return super.mouseClicked(d, d2, n);
    }

    @Override
    public boolean mouseDragged(double d, double d2, int n, double d3, double d4) {
        if (this.method_25336() != null && this.method_25397() && this.isValidMouseClick(n)) {
            return WidgetUtils.mouseDragged((class04654)this.method_25336(), d, d2, n, d3, d4);
        }
        return super.mouseDragged(d, d2, n, d3, d4);
    }

    void setHoverDescription(DescriptionWithName descriptionWithName) {
        if (descriptionWithName != this.lastHoveredOption) {
            this.lastHoveredOption = descriptionWithName;
            this.hoverEvent.accept(descriptionWithName);
        }
    }

    private List<OptionListWidget$Entry> superModifiableChildren() {
        return ((AbstractSelectionListAccessor)this).getChildren();
    }

    public Dimension<Integer> getDefaultEntryDimension() {
        return Dimension.ofInt((int)this.method_25342(), (int)0, (int)this.method_25322(), (int)20);
    }

    public void addEntryBelowWithoutScroll(OptionListWidget$Entry optionListWidget$Entry, OptionListWidget$Entry optionListWidget$Entry2) {
        double d = (double)this.method_44395() - this.method_44387();
        this.addEntryBelow(optionListWidget$Entry, optionListWidget$Entry2);
        this.method_44382((double)this.method_44395() - d);
    }

    @Override
    public boolean charTyped(char c, int n) {
        for (OptionListWidget$Entry optionListWidget$Entry : this.method_25396()) {
            if (!optionListWidget$Entry.charTyped(c, n)) continue;
            return true;
        }
        return super.charTyped(c, n);
    }

    protected boolean isValidMouseClick(int n) {
        return n == 0 || n == 1 || n == 2;
    }

    public void refreshOptions() {
        this.method_25339();
        for (OptionGroup optionGroup : this.category.groups()) {
            OptionListWidget$GroupSeparatorEntry optionListWidget$GroupSeparatorEntry;
            Object object;
            if (!optionGroup.isRoot()) {
                OptionListWidget$GroupSeparatorEntry optionListWidget$GroupSeparatorEntry2;
                if (optionGroup instanceof ListOption) {
                    object = (ListOption)optionGroup;
                    optionListWidget$GroupSeparatorEntry2 = new OptionListWidget$ListGroupSeparatorEntry(this, (ListOption<?>)object, (class05096)this.yaclScreen);
                } else {
                    optionListWidget$GroupSeparatorEntry2 = new OptionListWidget$GroupSeparatorEntry(this, optionGroup, this.yaclScreen);
                }
                optionListWidget$GroupSeparatorEntry = optionListWidget$GroupSeparatorEntry2;
                this.addEntry(optionListWidget$GroupSeparatorEntry);
            } else {
                optionListWidget$GroupSeparatorEntry = null;
            }
            object = new ArrayList();
            if (optionListWidget$GroupSeparatorEntry instanceof OptionListWidget$ListGroupSeparatorEntry) {
                OptionListWidget$ListGroupSeparatorEntry optionListWidget$ListGroupSeparatorEntry = (OptionListWidget$ListGroupSeparatorEntry)optionListWidget$GroupSeparatorEntry;
                if (optionListWidget$ListGroupSeparatorEntry.listOption.options().isEmpty()) {
                    Object object2 = new OptionListWidget$EmptyListLabel(this, optionListWidget$ListGroupSeparatorEntry, this.category);
                    this.addEntry((OptionListWidget$Entry)((Object)object2));
                    object.add(object2);
                }
            }
            for (Object object2 : optionGroup.options()) {
                OptionListWidget$OptionEntry optionListWidget$OptionEntry = new OptionListWidget$OptionEntry(this, (Option<?>)object2, this.category, optionGroup, optionListWidget$GroupSeparatorEntry, object2.controller().provideWidget(this.yaclScreen, this.getDefaultEntryDimension()));
                this.addEntry(optionListWidget$OptionEntry);
                object.add(optionListWidget$OptionEntry);
            }
            if (optionListWidget$GroupSeparatorEntry == null) continue;
            optionListWidget$GroupSeparatorEntry.setChildEntries((List<? extends OptionListWidget$Entry>)object);
        }
        this.method_44382(0.0);
        this.repositionEntries();
    }

    private void refreshListEntries(ListOption<?> listOption, ConfigCategory configCategory) {
        Object object;
        OptionListWidget$ListGroupSeparatorEntry optionListWidget$ListGroupSeparatorEntry = this.method_25396().stream().filter(optionListWidget$Entry -> {
            if (!(optionListWidget$Entry instanceof OptionListWidget$ListGroupSeparatorEntry)) return false;
            OptionListWidget$ListGroupSeparatorEntry optionListWidget$ListGroupSeparatorEntry = (OptionListWidget$ListGroupSeparatorEntry)((Object)optionListWidget$Entry);
            if (optionListWidget$ListGroupSeparatorEntry.group != listOption) return false;
            return true;
        }).map(OptionListWidget$ListGroupSeparatorEntry.class::cast).findAny().orElse(null);
        if (optionListWidget$ListGroupSeparatorEntry == null) {
            YACLConstants.LOGGER.warn("Can't find group seperator to refresh list option entries for list option " + String.valueOf(listOption.name()));
            return;
        }
        for (OptionListWidget$Entry optionListWidget$Entry2 : optionListWidget$ListGroupSeparatorEntry.childEntries) {
            this.method_25330((class01202)optionListWidget$Entry2);
        }
        optionListWidget$ListGroupSeparatorEntry.childEntries.clear();
        if (listOption.options().isEmpty()) {
            object = new OptionListWidget$EmptyListLabel(this, optionListWidget$ListGroupSeparatorEntry, configCategory);
            this.addEntryBelow(optionListWidget$ListGroupSeparatorEntry, (OptionListWidget$Entry)((Object)object));
            optionListWidget$ListGroupSeparatorEntry.childEntries.add(object);
            return;
        }
        object = optionListWidget$ListGroupSeparatorEntry;
        for (ListOptionEntry listOptionEntry : listOption.options()) {
            OptionListWidget$OptionEntry optionListWidget$OptionEntry = new OptionListWidget$OptionEntry(this, (Option<?>)listOptionEntry, configCategory, (OptionGroup)listOption, optionListWidget$ListGroupSeparatorEntry, listOptionEntry.controller().provideWidget(this.yaclScreen, this.getDefaultEntryDimension()));
            this.addEntryBelow((OptionListWidget$Entry)((Object)object), optionListWidget$OptionEntry);
            optionListWidget$ListGroupSeparatorEntry.childEntries.add(optionListWidget$OptionEntry);
            object = optionListWidget$OptionEntry;
        }
    }

    public void addEntryBelow(OptionListWidget$Entry optionListWidget$Entry, OptionListWidget$Entry optionListWidget$Entry2) {
        int n = this.superModifiableChildren().indexOf((Object)optionListWidget$Entry) + 1;
        if (n == 0) {
            throw new IllegalStateException("The entry to insert below does not exist!");
        }
        this.addEntryAtIndex(n, optionListWidget$Entry2);
    }

    public void expandAllGroups() {
        for (OptionListWidget$Entry optionListWidget$Entry : super.method_25396()) {
            if (!(optionListWidget$Entry instanceof OptionListWidget$GroupSeparatorEntry)) continue;
            OptionListWidget$GroupSeparatorEntry optionListWidget$GroupSeparatorEntry = (OptionListWidget$GroupSeparatorEntry)optionListWidget$Entry;
            optionListWidget$GroupSeparatorEntry.setExpanded(true);
        }
    }

    public void updateSearchQuery(String string) {
        this.searchQuery = string;
        for (OptionListWidget$Entry optionListWidget$Entry : this.method_25396()) {
            optionListWidget$Entry.updateSearchQuery(string);
        }
        this.expandAllGroups();
        this.repositionEntries();
    }

    public void addEntryAtIndex(int n, OptionListWidget$Entry optionListWidget$Entry) {
        this.superModifiableChildren().add(n, optionListWidget$Entry);
        this.repositionEntries();
    }

    public /* synthetic */ int method_25321(class01202 class012022) {
        return this.addEntry((OptionListWidget$Entry)class012022);
    }

    public /* synthetic */ class01202 method_48199(class03249 class032492, Predicate predicate, class01202 class012022) {
        return this.nextEntry(class032492, predicate, (OptionListWidget$Entry)class012022);
    }

    public int method_25342() {
        return super.method_25342() - 6;
    }

    public int method_25322() {
        return this.method_25368() - 6 - 20;
    }

    public void method_57715(class01054 class010542) {
    }
}

