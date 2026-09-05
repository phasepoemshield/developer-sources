/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ConfigCategory
 *  me.shedaniel.clothconfig2.api.ConfigScreen
 *  me.shedaniel.clothconfig2.api.Tooltip
 *  me.shedaniel.clothconfig2.gui.widget.SearchFieldEntry
 *  me.shedaniel.math.Point
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class04654
 *  minecraft.class05034
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class08392
 *  minecraft.class08394
 */
package me.shedaniel.clothconfig2.gui;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigScreen;
import me.shedaniel.clothconfig2.api.Tooltip;
import me.shedaniel.clothconfig2.api.scroll.ScrollingContainer;
import me.shedaniel.clothconfig2.gui.AbstractConfigScreen;
import me.shedaniel.clothconfig2.gui.AbstractTabbedConfigScreen;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen$1;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen$2;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen$3;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen$4;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen$ListWidget;
import me.shedaniel.clothconfig2.gui.ClothConfigTabButton;
import me.shedaniel.clothconfig2.gui.entries.EmptyEntry;
import me.shedaniel.clothconfig2.gui.widget.SearchFieldEntry;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04654;
import minecraft.class05034;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08392;
import minecraft.class08394;

public class ClothConfigScreen
extends AbstractTabbedConfigScreen {
    private final ScrollingContainer tabsScroller = new ClothConfigScreen$1(this);
    public ClothConfigScreen$ListWidget<AbstractConfigEntry<AbstractConfigEntry<?>>> listWidget;
    final LinkedHashMap<class00392, List<AbstractConfigEntry<?>>> categorizedEntries = Maps.newLinkedHashMap();
    private final List<class05034<class00392, Integer>> tabs;
    private SearchFieldEntry searchFieldEntry;
    private class06478 buttonLeftTab;
    private class06478 buttonRightTab;
    private Rectangle tabsBounds;
    private Rectangle tabsLeftBounds;
    private Rectangle tabsRightBounds;
    private double tabsMaximumScrolled = -1.0;
    private final List<ClothConfigTabButton> tabButtons = Lists.newArrayList();
    private final Map<String, ConfigCategory> categoryMap;

    public ClothConfigScreen(class05096 class050962, class00392 class003923, Map<String, ConfigCategory> map, class01894 class018942) {
        super(class050962, class003923, class018942);
        map.forEach((string, configCategory) -> {
            ArrayList arrayList = Lists.newArrayList();
            for (Object e : configCategory.getEntries()) {
                AbstractConfigListEntry abstractConfigListEntry = e instanceof class05034 ? (AbstractConfigListEntry)((class05034)e).y() : (AbstractConfigListEntry)e;
                abstractConfigListEntry.setScreen((AbstractConfigScreen)this);
                arrayList.add(abstractConfigListEntry);
            }
            this.categorizedEntries.put(configCategory.getCategoryKey(), arrayList);
            if (configCategory.getBackground() != null) {
                this.registerCategoryBackground(configCategory.getCategoryKey().getString(), configCategory.getBackground());
                this.registerCategoryTransparency(configCategory.getCategoryKey().getString(), false);
            }
        });
        this.tabs = this.categorizedEntries.keySet().stream().map(class003922 -> new class05034(class003922, (Object)(((class01590)class06202.Nq().i_3).N((class05936)class003922) + 8))).collect(Collectors.toList());
        this.categoryMap = map;
    }

    @Override
    public void save() {
        super.save();
    }

    public void method_25426() {
        super.method_25426();
        this.tabButtons.clear();
        this.listWidget = new ClothConfigScreen$ListWidget(this, this.field_22787, this.field_22789, this.field_22790, this.isShowingTabs() ? 70 : 30, this.field_22790 - 32, this.getBackgroundLocation());
        this.childrenL().add((class04654)this.listWidget);
        this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)new EmptyEntry(5));
        this.searchFieldEntry = new SearchFieldEntry((ConfigScreen)this, this.listWidget);
        this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)this.searchFieldEntry);
        this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)new EmptyEntry(5));
        if (this.categorizedEntries.size() > this.selectedCategoryIndex) {
            this.listWidget.method_25396().addAll((List)Lists.newArrayList(this.categorizedEntries.values()).get(this.selectedCategoryIndex));
        }
        int n = Math.min(200, (this.field_22789 - 50 - 12) / 3);
        this.method_37063((class04654)class05362.method_46430((class00392)(this.isEdited() ? class00392.L((String)"text.cloth-config.cancel_discard") : class00392.L((String)"gui.cancel")), class053622 -> this.quit()).N(this.field_22789 / 2 - n - 3, this.field_22790 - 26, n, 20).N());
        this.method_37063((class04654)new ClothConfigScreen$2(this, this.field_22789 / 2 + 3, this.field_22790 - 26, n, 20, (class00392)class00392.i(), class053622 -> this.saveAll(true), Supplier::get));
        if (this.isShowingTabs()) {
            this.tabsBounds = new Rectangle(0, 41, this.field_22789, 24);
            this.tabsLeftBounds = new Rectangle(0, 41, 18, 24);
            this.tabsRightBounds = new Rectangle(this.field_22789 - 18, 41, 18, 24);
            this.buttonLeftTab = new ClothConfigScreen$3(this, 4, 44, 12, 18, (class00392)class00392.i(), class053622 -> this.tabsScroller.scrollTo(0.0, true), Supplier::get);
            this.childrenL().add((class04654)this.buttonLeftTab);
            int n2 = 0;
            for (class05034<class00392, Integer> class050342 : this.tabs) {
                this.tabButtons.add(new ClothConfigTabButton(this, n2, -100, 43, (Integer)class050342.y(), 20, (class00392)class050342.N(), this.categoryMap.get(((class00392)class050342.N()).getString()).getDescription()));
                ++n2;
            }
            this.childrenL().addAll(this.tabButtons);
            this.buttonRightTab = new ClothConfigScreen$4(this, this.field_22789 - 16, 44, 12, 18, (class00392)class00392.i(), class053622 -> this.tabsScroller.scrollTo(this.tabsScroller.getMaxScroll(), true), Supplier::get);
            this.childrenL().add((class04654)this.buttonRightTab);
        } else {
            this.tabsLeftBounds = this.tabsRightBounds = new Rectangle();
            this.tabsBounds = this.tabsRightBounds;
        }
        Optional.ofNullable(this.afterInitConsumer).ifPresent(consumer -> consumer.accept(this));
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        Object object;
        if (this.isShowingTabs()) {
            this.tabsScroller.updatePosition(f * 3.0f);
            int n3 = 24 - this.tabsScroller.scrollAmountInt();
            for (ClothConfigTabButton clothConfigTabButton2 : this.tabButtons) {
                clothConfigTabButton2.method_46421(n3);
                n3 += clothConfigTabButton2.method_25368() + 2;
            }
            this.buttonLeftTab.field_22763 = this.tabsScroller.scrollAmount() > 0.0;
            boolean bl = this.buttonRightTab.field_22763 = this.tabsScroller.scrollAmount() < this.getTabsMaximumScrolled() - (double)this.field_22789 + 40.0;
        }
        if (!this.isTransparentBackground()) {
            this.method_57735(class010542);
        } else {
            if ((class03448)this.field_22787.T_3 == null) {
                this.method_57728(class010542, f);
            }
            this.method_57734(class010542);
            this.method_57735(class010542);
        }
        this.listWidget.method_25394(class010542, n, n2, f);
        class010542.L(this.listWidget.left, this.listWidget.top, this.listWidget.left + this.listWidget.width, this.listWidget.bottom);
        for (AbstractConfigEntry<AbstractConfigEntry<?>> abstractConfigEntry : this.listWidget.method_25396()) {
            abstractConfigEntry.lateRender(class010542, n, n2, f);
        }
        class010542.R();
        if (this.isShowingTabs()) {
            class010542.N((class01590)this.field_22787.i_3, this.field_22785, this.field_22789 / 2, 18, -1);
            object = new Rectangle(this.tabsBounds.x + 20, this.tabsBounds.y, this.tabsBounds.width - 40, this.tabsBounds.height);
            class010542.L(((Rectangle)object).x, ((Rectangle)object).y, object.getMaxX(), object.getMaxY());
            if (this.isTransparentBackground()) {
                class010542.N(((Rectangle)object).x, ((Rectangle)object).y, object.getMaxX(), object.getMaxY(), 0x68000000, 0x68000000);
            } else {
                this.overlayBackground(class010542, (Rectangle)object, 32, 32, 32, 255);
            }
            this.tabButtons.forEach(clothConfigTabButton -> clothConfigTabButton.method_25394(class010542, n, n2, f));
            this.drawTabsShades(class010542, 0, this.isTransparentBackground() ? 120 : 255);
            class010542.R();
            this.buttonLeftTab.method_25394(class010542, n, n2, f);
            this.buttonRightTab.method_25394(class010542, n, n2, f);
        } else {
            class010542.N((class01590)this.field_22787.i_3, this.field_22785, this.field_22789 / 2, 12, -1);
        }
        if (this.isEditable()) {
            object = Lists.newArrayList();
            for (List list : Lists.newArrayList(this.categorizedEntries.values())) {
                for (AbstractConfigEntry abstractConfigEntry : list) {
                    if (!abstractConfigEntry.getConfigError().isPresent()) continue;
                    object.add((class00392)abstractConfigEntry.getConfigError().get());
                }
            }
            if (object.size() > 0) {
                String string = "\u00a7c" + (object.size() == 1 ? ((class00392)object.get(0)).y().getString() : class08392.N((String)"text.cloth-config.multi_error", (Object[])new Object[0]));
                if (this.isTransparentBackground()) {
                    int n3 = ((class01590)this.field_22787.i_3).y(string);
                    Objects.requireNonNull((class01590)this.field_22787.i_3);
                    class010542.N(8, 9, 20 + n3, 14 + 9, 0x68000000, 0x68000000);
                }
                class010542.N(class08394.Na, CONFIG_TEX, 10, 10, 0.0f, 54.0f, 3, 11, 256, 256);
                class010542.y((class01590)this.field_22787.i_3, string, 18, 12, -1);
                if (object.size() > 1) {
                    int n4 = ((class01590)this.field_22787.i_3).y(string);
                    if (n >= 10 && n2 >= 10 && n <= 18 + n4) {
                        Objects.requireNonNull((class01590)this.field_22787.i_3);
                        if (n2 <= 14 + 9) {
                            this.addTooltip(Tooltip.of((Point)new Point(n, n2), (class00392[])object.toArray(new class00392[0])));
                        }
                    }
                }
            }
        } else if (!this.isEditable()) {
            object = "\u00a7c" + class08392.N((String)"text.cloth-config.not_editable", (Object[])new Object[0]);
            if (this.isTransparentBackground()) {
                int n5 = ((class01590)this.field_22787.i_3).y((String)object);
                Objects.requireNonNull((class01590)this.field_22787.i_3);
                class010542.N(8, 9, 20 + n5, 14 + 9, 0x68000000, 0x68000000);
            }
            class010542.N(class08394.Na, CONFIG_TEX, 10, 10, 0.0f, 54.0f, 3, 11, 256, 256);
            class010542.y((class01590)this.field_22787.i_3, (String)object, 18, 12, -1);
        }
        super.method_25394(class010542, n, n2, f);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.tabsBounds.contains(d, d2) && !this.tabsLeftBounds.contains(d, d2) && !this.tabsRightBounds.contains(d, d2) && d4 != 0.0) {
            this.tabsScroller.offset(-d4 * 16.0, true);
            return true;
        }
        return super.method_25401(d, d2, d3, d4);
    }

    @Override
    public boolean isEditable() {
        return super.isEditable();
    }

    public boolean matchesSearch(Iterator<String> iterator) {
        return this.searchFieldEntry.matchesSearch(iterator);
    }

    private void drawTabsShades(class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, class05096.field_49895, this.tabsBounds.getMinX() - 20, this.tabsBounds.getMinY() - 2, 0.0f, 0.0f, this.tabsBounds.getWidth() + 40, 2, 32, 2);
        class010542.N(class08394.Na, class05096.field_49896, this.tabsBounds.getMinX() - 20, this.tabsBounds.getMaxY(), 0.0f, 0.0f, this.tabsBounds.getWidth() + 40, 2, 32, 2);
    }

    public class00392 getSelectedCategory() {
        return (class00392)this.tabs.get(this.selectedCategoryIndex).N();
    }

    @Override
    public Map<class00392, List<AbstractConfigEntry<?>>> getCategorizedEntries() {
        return this.categorizedEntries;
    }

    public double getTabsMaximumScrolled() {
        if (this.tabsMaximumScrolled == -1.0) {
            int[] nArray = new int[]{0};
            for (class05034<class00392, Integer> class050342 : this.tabs) {
                nArray[0] = nArray[0] + ((Integer)class050342.y() + 2);
            }
            this.tabsMaximumScrolled = nArray[0];
        }
        return this.tabsMaximumScrolled + 6.0;
    }

    public void resetTabsMaximumScrolled() {
        this.tabsMaximumScrolled = -1.0;
    }
}

