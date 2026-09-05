/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.CCTextures
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.Expandable
 *  me.shedaniel.clothconfig2.gui.entries.TooltipListEntry
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class06202
 *  minecraft.class06613
 *  minecraft.class08394
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import me.shedaniel.clothconfig2.CCTextures;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.Expandable;
import me.shedaniel.clothconfig2.gui.entries.MultiElementListEntry$CategoryLabelWidget;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class06202;
import minecraft.class06613;
import minecraft.class08394;

public class MultiElementListEntry<T>
extends TooltipListEntry<T>
implements Expandable {
    private final T object;
    private final List<AbstractConfigListEntry<?>> entries;
    private final MultiElementListEntry$CategoryLabelWidget widget;
    private final List<Object> children;
    boolean expanded;

    public MultiElementListEntry(class00392 class003922, T t, List<AbstractConfigListEntry<?>> list, boolean bl) {
        super(class003922, null);
        this.object = t;
        this.entries = list;
        this.expanded = bl;
        this.widget = new MultiElementListEntry$CategoryLabelWidget(this);
        this.children = Lists.newArrayList((Object[])new Object[]{this.widget});
        this.children.addAll(list);
        this.setReferenceProviderEntries(list);
    }

    public T getValue() {
        return this.object;
    }

    public void save() {
        this.entries.forEach(AbstractConfigEntry::save);
    }

    public Optional<T> getDefaultValue() {
        return Optional.empty();
    }

    public List<? extends class04654> method_25396() {
        return this.isExpanded() ? this.children : Collections.singletonList(this.widget);
    }

    public boolean method_25405(double d, double d2) {
        if (super.method_25405(d, d2)) {
            return true;
        }
        if (this.isExpanded()) {
            for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
                if (!abstractConfigListEntry.method_25405(d, d2)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return super.method_25402(class066132, bl);
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        boolean bl2 = this.widget.rectangle.contains(n6, n7);
        class010542.N(class08394.Na, CCTextures.CONFIG, n3 - 15, n2 + 5, 24.0f, (float)((this.isEnabled() ? (bl2 ? 18 : 0) : 36) + (this.isExpanded() ? 9 : 0)), 9, 9, 256, 256);
        class010542.y((class01590)class06202.Nq().i_3, this.getDisplayedFieldName().method_30937(), n3, n2 + 6, bl2 ? -1638890 : -1);
        for (AbstractConfigListEntry<?> object : this.entries) {
            object.setParent(this.getParent());
            object.setScreen(this.getConfigScreen());
        }
        if (this.isExpanded()) {
            int n8 = n2 + 24;
            for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
                abstractConfigListEntry.setBounds(new Rectangle(n3, n8, n4, abstractConfigListEntry.getItemHeight()));
                abstractConfigListEntry.render(class010542, -1, n8, n3 + 14, n4 - 14, abstractConfigListEntry.getItemHeight(), n6, n7, bl, f);
                n8 += abstractConfigListEntry.getItemHeight();
                n8 += Math.max(0, abstractConfigListEntry.getMorePossibleHeight());
            }
        } else {
            for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
                abstractConfigListEntry.setBounds(new Rectangle());
            }
        }
    }

    public Optional<class00392> getError() {
        List list = this.entries.stream().map(AbstractConfigEntry::getConfigError).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
        if (list.size() > 1) {
            return Optional.of(class00392.L((String)"text.cloth-config.multi_error"));
        }
        return list.stream().findFirst();
    }

    public boolean isExpanded() {
        return this.expanded && this.isEnabled();
    }

    public void lateRender(class01054 class010542, int n, int n2, float f) {
        if (this.isExpanded()) {
            for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
                abstractConfigListEntry.lateRender(class010542, n, n2, f);
            }
        }
    }

    public boolean isEdited() {
        for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
            if (!abstractConfigListEntry.isEdited()) continue;
            return true;
        }
        return false;
    }

    public void setExpanded(boolean bl) {
        this.expanded = bl;
    }

    public void setRequiresRestart(boolean bl) {
    }

    public int getItemHeight() {
        if (this.isExpanded()) {
            int n = 24;
            for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
                n += abstractConfigListEntry.getItemHeight();
            }
            return n;
        }
        return 24;
    }

    public Iterator<String> getSearchTags() {
        return Iterators.concat((Iterator)super.getSearchTags(), (Iterator)Iterators.concat(this.entries.stream().map(AbstractConfigEntry::getSearchTags).iterator()));
    }

    public boolean isRequiresRestart() {
        for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
            if (!abstractConfigListEntry.isRequiresRestart()) continue;
            return true;
        }
        return false;
    }

    public Rectangle getEntryArea(int n, int n2, int n3, int n4) {
        this.widget.rectangle.x = n - 15;
        this.widget.rectangle.y = n2;
        this.widget.rectangle.width = n3 + 15;
        this.widget.rectangle.height = 24;
        return new Rectangle(this.getParent().left, n2, this.getParent().right - this.getParent().left, 20);
    }

    public void updateSelected(boolean bl) {
        for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
            abstractConfigListEntry.updateSelected(this.isExpanded() && bl && this.method_25399() == abstractConfigListEntry);
        }
    }

    public List<? extends class03434> narratables() {
        return this.isExpanded() ? this.children : Collections.singletonList(this.widget);
    }

    public class00392 getCategoryName() {
        return this.getFieldName();
    }

    public int getMorePossibleHeight() {
        if (!this.isExpanded()) {
            return -1;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = 24;
        for (AbstractConfigListEntry<?> abstractConfigListEntry : this.entries) {
            n += abstractConfigListEntry.getItemHeight();
            if (abstractConfigListEntry.getMorePossibleHeight() < 0) continue;
            arrayList.add(n + abstractConfigListEntry.getMorePossibleHeight());
        }
        arrayList.add(n);
        return arrayList.stream().max(Integer::compare).orElse(0) - this.getItemHeight();
    }

    public int getInitialReferenceOffset() {
        return 24;
    }
}

