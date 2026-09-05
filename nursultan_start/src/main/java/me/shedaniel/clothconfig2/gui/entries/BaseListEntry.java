/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.Expandable
 *  me.shedaniel.clothconfig2.api.ReferenceProvider
 *  me.shedaniel.clothconfig2.gui.entries.TooltipListEntry
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class08394
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.Expandable;
import me.shedaniel.clothconfig2.api.ReferenceProvider;
import me.shedaniel.clothconfig2.gui.entries.BaseListCell;
import me.shedaniel.clothconfig2.gui.entries.BaseListEntry$ListLabelWidget;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08394;

public abstract class BaseListEntry<T, C extends BaseListCell, SELF extends BaseListEntry<T, C, SELF>>
extends TooltipListEntry<List<T>>
implements Expandable {
    protected static final class01894 CONFIG_TEX = class01894.N((String)"cloth-config2", (String)"textures/gui/cloth_config.png");
    protected final List<C> cells;
    protected final List<class04654> widgets;
    protected final List<class03434> narratables;
    protected boolean expanded;
    protected boolean insertButtonEnabled = true;
    protected boolean deleteButtonEnabled;
    protected boolean insertInFront;
    protected BaseListEntry$ListLabelWidget labelWidget;
    protected class06478 resetWidget;
    protected Function<SELF, C> createNewInstance;
    protected Supplier<List<T>> defaultValue;
    protected class00392 addTooltip = class00392.L((String)"text.cloth-config.list.add");
    protected class00392 removeTooltip = class00392.L((String)"text.cloth-config.list.remove");

    public BaseListEntry(class00392 class003922, Supplier<Optional<class00392[]>> supplier, Supplier<List<T>> supplier2, Function<SELF, C> function, Consumer<List<T>> consumer, class00392 class003923, boolean bl, boolean bl2, boolean bl3) {
        super(class003922, supplier, bl);
        this.deleteButtonEnabled = bl2;
        this.insertInFront = bl3;
        this.cells = Lists.newArrayList();
        this.labelWidget = new BaseListEntry$ListLabelWidget(this);
        this.widgets = Lists.newArrayList((Object[])new class04654[]{this.labelWidget});
        this.narratables = Lists.newArrayList();
        this.resetWidget = class05362.method_46430((class00392)class003923, class053622 -> {
            this.widgets.removeAll(this.cells);
            this.narratables.removeAll(this.cells);
            for (BaseListCell baseListCell : this.cells) {
                baseListCell.onDelete();
            }
            this.cells.clear();
            ((List)supplier2.get()).stream().map(this::getFromValue).forEach(this.cells::add);
            for (BaseListCell baseListCell : this.cells) {
                baseListCell.onAdd();
            }
            this.widgets.addAll(this.cells);
            this.narratables.addAll(this.cells);
        }).N(0, 0, ((class01590)class06202.Nq().i_3).N((class05936)class003923) + 6, 20).N();
        this.widgets.add((class04654)this.resetWidget);
        this.narratables.add((class03434)this.resetWidget);
        this.saveCallback = consumer;
        this.createNewInstance = function;
        this.defaultValue = supplier2;
    }

    public BaseListEntry(class00392 class003922, Supplier<Optional<class00392[]>> supplier, Supplier<List<T>> supplier2, Function<SELF, C> function, Consumer<List<T>> consumer, class00392 class003923, boolean bl) {
        this(class003922, supplier, supplier2, function, consumer, class003923, bl, true, true);
    }

    public BaseListEntry(class00392 class003922, Supplier<Optional<class00392[]>> supplier, Supplier<List<T>> supplier2, Function<SELF, C> function, Consumer<List<T>> consumer, class00392 class003923) {
        this(class003922, supplier, supplier2, function, consumer, class003923, false);
    }

    public void save() {
        for (BaseListCell baseListCell : this.cells) {
            if (!(baseListCell instanceof ReferenceProvider)) continue;
            ((ReferenceProvider)baseListCell).provideReferenceEntry().save();
        }
        super.save();
    }

    public Optional<List<T>> getDefaultValue() {
        if (this.defaultValue == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.defaultValue.get());
    }

    public abstract SELF self();

    public List<? extends class04654> method_25396() {
        if (!this.isExpanded()) {
            ArrayList<class04654> arrayList = new ArrayList<class04654>(this.widgets);
            arrayList.removeAll(this.cells);
            return arrayList;
        }
        return this.widgets;
    }

    public boolean method_25405(double d, double d2) {
        if (super.method_25405(d, d2)) {
            return true;
        }
        if (this.isExpanded()) {
            for (BaseListCell baseListCell : this.cells) {
                if (!baseListCell.method_25405(d, d2)) continue;
                return true;
            }
        }
        return false;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        BaseListCell baseListCell = !this.isExpanded() || this.method_25399() == null || !(this.method_25399() instanceof BaseListCell) ? null : (BaseListCell)this.method_25399();
        boolean bl2 = this.labelWidget.rectangle.contains(n6, n7);
        boolean bl3 = this.isInsideCreateNew(n6, n7);
        boolean bl4 = this.isInsideDelete(n6, n7);
        class010542.N(class08394.Na, CONFIG_TEX, n3 - 15, n2 + 5, 33.0f, (float)((this.isEnabled() ? (bl2 && !bl3 && !bl4 ? 18 : 0) : 36) + (this.isExpanded() ? 9 : 0)), 9, 9, 256, 256);
        if (this.isInsertButtonEnabled()) {
            class010542.N(class08394.Na, CONFIG_TEX, n3 - 15 + 13, n2 + 5, 42.0f, bl3 ? 9.0f : 0.0f, 9, 9, 256, 256);
        }
        if (this.isDeleteButtonEnabled()) {
            class010542.N(class08394.Na, CONFIG_TEX, n3 - 15 + (this.isInsertButtonEnabled() ? 26 : 13), n2 + 5, 51.0f, baseListCell == null ? 0.0f : (bl4 ? 18.0f : 9.0f), 9, 9, 256, 256);
        }
        this.resetWidget.method_46421(n3 + n4 - this.resetWidget.method_25368());
        this.resetWidget.method_46419(n2);
        this.resetWidget.field_22763 = this.isEditable() && this.getDefaultValue().isPresent() && !this.isMatchDefault();
        this.resetWidget.method_25394(class010542, n6, n7, f);
        int n8 = (this.isInsertButtonEnabled() || this.isDeleteButtonEnabled() ? 6 : 0) + (this.isInsertButtonEnabled() ? 9 : 0) + (this.isDeleteButtonEnabled() ? 9 : 0);
        class010542.y((class01590)class06202.Nq().i_3, this.getDisplayedFieldName().method_30937(), n3 + n8, n2 + 6, bl2 && !this.resetWidget.method_25405((double)n6, (double)n7) && !bl4 && !bl3 ? -1638890 : this.getPreferredTextColor());
        if (this.isExpanded()) {
            int n9 = n2 + 24;
            for (BaseListCell baseListCell2 : this.cells) {
                baseListCell2.render(class010542, -1, n9, n3 + 14, n4 - 14, baseListCell2.getCellHeight(), n6, n7, this.getParent().getFocused() != null && ((AbstractConfigEntry)this.getParent().getFocused()).equals((Object)this) && this.method_25399() != null && this.method_25399().equals((Object)baseListCell2), f);
                baseListCell2.updateBounds(true, n3 + 14, n9, n4 - 14, baseListCell2.getCellHeight());
                n9 += baseListCell2.getCellHeight();
            }
        } else {
            int n10 = n2 + 24;
            for (BaseListCell baseListCell3 : this.cells) {
                baseListCell3.updateBounds(false, n3 + 14, n10, n4 - 14, baseListCell3.getCellHeight());
                n10 += baseListCell3.getCellHeight();
            }
        }
    }

    public Optional<class00392[]> getTooltip(int n, int n2) {
        if (this.addTooltip != null && this.isInsideCreateNew(n, n2)) {
            return Optional.of(new class00392[]{this.addTooltip});
        }
        if (this.removeTooltip != null && this.isInsideDelete(n, n2)) {
            return Optional.of(new class00392[]{this.removeTooltip});
        }
        return super.getTooltip(n, n2);
    }

    public Optional<class00392> getError() {
        List list = this.cells.stream().map(BaseListCell::getConfigError).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
        if (list.size() > 1) {
            return Optional.of(class00392.L((String)"text.cloth-config.multi_error"));
        }
        return list.stream().findFirst();
    }

    public boolean isExpanded() {
        return this.expanded && this.isEnabled();
    }

    public boolean isEdited() {
        if (super.isEdited()) {
            return true;
        }
        return this.cells.stream().anyMatch(BaseListCell::isEdited);
    }

    public void setExpanded(boolean bl) {
        this.expanded = bl;
    }

    public void setRequiresRestart(boolean bl) {
    }

    public int getItemHeight() {
        if (this.isExpanded()) {
            int n = 24;
            for (BaseListCell baseListCell : this.cells) {
                n += baseListCell.getCellHeight();
            }
            return n;
        }
        return 24;
    }

    public boolean isRequiresRestart() {
        return this.cells.stream().anyMatch(BaseListCell::isRequiresRestart);
    }

    public Rectangle getEntryArea(int n, int n2, int n3, int n4) {
        this.labelWidget.rectangle.x = n - 15;
        this.labelWidget.rectangle.y = n2;
        this.labelWidget.rectangle.width = n3 + 15;
        this.labelWidget.rectangle.height = 24;
        return new Rectangle(this.getParent().left, n2, this.getParent().right - this.getParent().left, 20);
    }

    public void updateSelected(boolean bl) {
        for (BaseListCell baseListCell : this.cells) {
            baseListCell.updateSelected(bl && this.method_25399() == baseListCell && this.isExpanded());
        }
    }

    public List<? extends class03434> narratables() {
        return this.narratables;
    }

    protected boolean isInsideCreateNew(double d, double d2) {
        return this.isInsertButtonEnabled() && d >= (double)(this.labelWidget.rectangle.x + 12) && d2 >= (double)(this.labelWidget.rectangle.y + 3) && d <= (double)(this.labelWidget.rectangle.x + 12 + 11) && d2 <= (double)(this.labelWidget.rectangle.y + 3 + 11);
    }

    public boolean insertInFront() {
        return this.insertInFront;
    }

    public void setAddTooltip(class00392 class003922) {
        this.addTooltip = class003922;
    }

    protected abstract C getFromValue(T var1);

    public class00392 getAddTooltip() {
        return this.addTooltip;
    }

    public boolean isMatchDefault() {
        Optional<List<T>> optional = this.getDefaultValue();
        if (optional.isPresent()) {
            List list = (List)this.getValue();
            List<T> list2 = optional.get();
            if (list.size() != list2.size()) {
                return false;
            }
            for (int i = 0; i < list.size(); ++i) {
                if (Objects.equals(list.get(i), list2.get(i))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public void setRemoveTooltip(class00392 class003922) {
        this.removeTooltip = class003922;
    }

    public class00392 getRemoveTooltip() {
        return this.removeTooltip;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean isInsideDelete(double d, double d2) {
        if (!this.isDeleteButtonEnabled()) return false;
        int n = this.labelWidget.rectangle.x;
        int n2 = this.isInsertButtonEnabled() ? 25 : 12;
        if (!(d >= (double)(n + n2))) return false;
        if (!(d2 >= (double)(this.labelWidget.rectangle.y + 3))) return false;
        int n3 = this.labelWidget.rectangle.x;
        int n4 = this.isInsertButtonEnabled() ? 25 : 12;
        if (!(d <= (double)(n3 + n4 + 11))) return false;
        if (!(d2 <= (double)(this.labelWidget.rectangle.y + 3 + 11))) return false;
        return true;
    }

    public void setInsertButtonEnabled(boolean bl) {
        this.insertButtonEnabled = bl;
    }

    public int getInitialReferenceOffset() {
        return 24;
    }

    public boolean isDeleteButtonEnabled() {
        return this.deleteButtonEnabled && this.isEnabled();
    }

    public void setDeleteButtonEnabled(boolean bl) {
        this.deleteButtonEnabled = bl;
    }

    public Function<SELF, C> getCreateNewInstance() {
        return this.createNewInstance;
    }

    public void setCreateNewInstance(Function<SELF, C> function) {
        this.createNewInstance = function;
    }

    public boolean isInsertButtonEnabled() {
        return this.insertButtonEnabled && this.isEnabled();
    }
}

