/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  me.shedaniel.clothconfig2.CCTextures
 *  me.shedaniel.clothconfig2.ClothConfigInitializer
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ConfigCategory
 *  me.shedaniel.clothconfig2.api.ConfigScreen
 *  me.shedaniel.clothconfig2.api.Expandable
 *  me.shedaniel.clothconfig2.api.LazyResettable
 *  me.shedaniel.clothconfig2.api.ReferenceBuildingConfigScreen
 *  me.shedaniel.clothconfig2.api.ReferenceProvider
 *  me.shedaniel.clothconfig2.gui.widget.SearchFieldEntry
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04654
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05034
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class06613
 *  minecraft.class08394
 *  org.apache.commons.lang3.StringUtils
 */
package me.shedaniel.clothconfig2.gui;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.CCTextures;
import me.shedaniel.clothconfig2.ClothConfigInitializer;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigScreen;
import me.shedaniel.clothconfig2.api.Expandable;
import me.shedaniel.clothconfig2.api.LazyResettable;
import me.shedaniel.clothconfig2.api.ReferenceBuildingConfigScreen;
import me.shedaniel.clothconfig2.api.ReferenceProvider;
import me.shedaniel.clothconfig2.api.scroll.ScrollingContainer;
import me.shedaniel.clothconfig2.gui.AbstractConfigScreen;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen$ListWidget;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$1;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$2;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$3;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$CategoryReference;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$CategoryTextEntry;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$ConfigEntryReference;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$Reference;
import me.shedaniel.clothconfig2.gui.entries.EmptyEntry;
import me.shedaniel.clothconfig2.gui.widget.SearchFieldEntry;
import me.shedaniel.math.Rectangle;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04654;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05034;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class06613;
import minecraft.class08394;
import org.apache.commons.lang3.StringUtils;

public class GlobalizedClothConfigScreen
extends AbstractConfigScreen
implements Expandable,
ReferenceBuildingConfigScreen {
    public ClothConfigScreen$ListWidget<AbstractConfigEntry<AbstractConfigEntry<?>>> listWidget;
    private class06478 cancelButton;
    private class06478 exitButton;
    final LinkedHashMap<class00392, List<AbstractConfigEntry<?>>> categorizedEntries = Maps.newLinkedHashMap();
    private final ScrollingContainer sideScroller = new GlobalizedClothConfigScreen$1(this);
    private GlobalizedClothConfigScreen$Reference lastHoveredReference = null;
    private SearchFieldEntry searchFieldEntry;
    private final ScrollingContainer sideSlider = new GlobalizedClothConfigScreen$2(this);
    final List<GlobalizedClothConfigScreen$Reference> references = Lists.newArrayList();
    private final LazyResettable<Integer> sideExpandLimit = new LazyResettable(() -> {
        int n = 0;
        for (GlobalizedClothConfigScreen$Reference globalizedClothConfigScreen$Reference : this.references) {
            class00392 class003922 = globalizedClothConfigScreen$Reference.getText();
            int n2 = this.field_22793.N((class05936)class00392.y((String)(StringUtils.repeat((String)"  ", (int)globalizedClothConfigScreen$Reference.getIndent()) + "- ")).y(class003922));
            if (n2 <= n) continue;
            n = n2;
        }
        return Math.min(n + 8, this.field_22789 / 4);
    });
    private boolean requestingReferenceRebuilding = false;

    static /* synthetic */ class01590 access$000(GlobalizedClothConfigScreen globalizedClothConfigScreen) {
        return globalizedClothConfigScreen.field_22793;
    }

    public GlobalizedClothConfigScreen(class05096 class050962, class00392 class003922, Map<String, ConfigCategory> map, class01894 class018942) {
        super(class050962, class003922, class018942);
        map.forEach((string, configCategory) -> {
            ArrayList arrayList = Lists.newArrayList();
            for (Object e : configCategory.getEntries()) {
                AbstractConfigListEntry abstractConfigListEntry = e instanceof class05034 ? (AbstractConfigListEntry)((class05034)e).y() : (AbstractConfigListEntry)e;
                abstractConfigListEntry.setScreen((AbstractConfigScreen)this);
                arrayList.add(abstractConfigListEntry);
            }
            this.categorizedEntries.put(configCategory.getCategoryKey(), arrayList);
        });
        this.sideSlider.scrollTo(0.0, false);
    }

    public void method_25426() {
        super.method_25426();
        this.sideExpandLimit.reset();
        this.references.clear();
        this.buildReferences();
        this.listWidget = new ClothConfigScreen$ListWidget(this, this.field_22787, this.field_22789 - 14, this.field_22790, 30, this.field_22790 - 32, this.getBackgroundLocation());
        this.method_25429((class04654)this.listWidget);
        this.listWidget.setLeftPos(14);
        this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)new EmptyEntry(5));
        this.searchFieldEntry = new SearchFieldEntry((ConfigScreen)this, this.listWidget);
        this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)this.searchFieldEntry);
        this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)new EmptyEntry(5));
        this.categorizedEntries.forEach((class003922, list) -> {
            if (!this.listWidget.method_25396().isEmpty()) {
                this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)new EmptyEntry(5));
            }
            this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)new EmptyEntry(4));
            this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)new GlobalizedClothConfigScreen$CategoryTextEntry((class00392)class003922, (class00392)class003922.L().N(class06541.field_1067)));
            this.listWidget.method_25396().add((AbstractConfigEntry<AbstractConfigEntry<?>>)new EmptyEntry(4));
            this.listWidget.method_25396().addAll((Collection<AbstractConfigEntry<AbstractConfigEntry<?>>>)list);
        });
        int n = Math.min(200, (this.field_22789 - 50 - 12) / 3);
        this.cancelButton = class05362.method_46430((class00392)(this.isEdited() ? class00392.L((String)"text.cloth-config.cancel_discard") : class00392.L((String)"gui.cancel")), class053622 -> this.quit()).N(0, this.field_22790 - 26, n, 20).N();
        this.method_37063((class04654)this.cancelButton);
        this.exitButton = new GlobalizedClothConfigScreen$3(this, 0, this.field_22790 - 26, n, 20, (class00392)class00392.i(), class053622 -> this.saveAll(true), Supplier::get);
        this.method_37063((class04654)this.exitButton);
        Optional.ofNullable(this.afterInitConsumer).ifPresent(consumer -> consumer.accept(this));
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        Rectangle rectangle;
        int n3;
        this.lastHoveredReference = null;
        if (this.requestingReferenceRebuilding) {
            this.references.clear();
            this.buildReferences();
            this.requestingReferenceRebuilding = false;
        }
        int n4 = this.getSideSliderPosition();
        if (!this.isTransparentBackground()) {
            class010542.L(n4, 0, this.field_22789, this.field_22790);
            this.method_57735(class010542);
            this.overlayBackground(class010542, new Rectangle(14, 0, this.field_22789, this.field_22790), 64, 64, 64, 255);
        } else {
            if ((class03448)this.field_22787.T_3 == null) {
                this.method_57728(class010542, f);
            }
            this.method_57734(class010542);
            this.method_57735(class010542);
            class010542.L(n4, 0, this.field_22789, this.field_22790);
        }
        this.listWidget.width = this.field_22789 - n4;
        this.listWidget.setLeftPos(n4);
        this.listWidget.method_25394(class010542, n, n2, f);
        class010542.L(this.listWidget.left, this.listWidget.top, this.listWidget.left + this.listWidget.width, this.listWidget.bottom);
        Rectangle rectangle2 = this.listWidget.method_25396().iterator();
        while (rectangle2.hasNext()) {
            AbstractConfigEntry<AbstractConfigEntry<?>> abstractConfigEntry = rectangle2.next();
            abstractConfigEntry.lateRender(class010542, n, n2, f);
        }
        class010542.R();
        class010542.y(this.field_22793, this.field_22785.method_30937(), (int)((float)n4 + (float)(this.field_22789 - n4) / 2.0f - (float)this.field_22793.N((class05936)this.field_22785) / 2.0f), 12, -1);
        class010542.R();
        this.cancelButton.method_46421(n4 + (this.field_22789 - n4) / 2 - this.cancelButton.method_25368() - 3);
        this.exitButton.method_46421(n4 + (this.field_22789 - n4) / 2 + 3);
        super.method_25394(class010542, n, n2, f);
        this.sideSlider.updatePosition(f);
        this.sideScroller.updatePosition(f);
        if (this.isTransparentBackground()) {
            class010542.N(class08394.Na, class01894.y((String)"textures/gui/menu_list_background.png"), 0, 0, (float)n4, (float)this.field_22790, n4, this.field_22790, 32, 32);
            class010542.N(class08394.Na, class01894.y((String)"textures/gui/menu_list_background.png"), 0, 0, (float)(n4 - 14), (float)this.field_22790, n4 - 14, this.field_22790, 32, 32);
            class010542.N(class08394.Na, CCTextures.VERTICAL_HEADER_SEPARATOR, n4 - 1, 0, 0.0f, 0.0f, 1, this.field_22790, 2, 32);
            if (n4 - 14 - 1 > 0) {
                class010542.N(class08394.Na, CCTextures.VERTICAL_HEADER_SEPARATOR, n4 - 14 - 1, 0, 0.0f, 0.0f, 1, this.field_22790, 2, 32);
            }
        } else {
            class010542.N(class08394.Na, this.getBackgroundLocation(), 0, 0, (float)n4, (float)this.field_22790, n4, this.field_22790, n4, this.field_22790, 32, 32, -12303292);
            class010542.N(class08394.Na, this.getBackgroundLocation(), 0, 0, (float)(n4 - 14), (float)this.field_22790, n4 - 14, this.field_22790, n4 - 14, this.field_22790, 32, 32, -14671840);
            class010542.N(class08394.Na, CCTextures.VERTICAL_HEADER_SEPARATOR, n4 - 1, 0, 0.0f, 0.0f, 1, this.field_22790, 2, 32);
            if (n4 - 14 - 1 > 0) {
                class010542.N(class08394.Na, CCTextures.VERTICAL_HEADER_SEPARATOR, n4 - 14 - 1, 0, 0.0f, 0.0f, 1, this.field_22790, 2, 32);
            }
        }
        int n5 = n3 = (rectangle2 = new Rectangle(n4 - 14, 0, 14, this.field_22790)).contains(n, n2) ? -96 : -1;
        if (class04995.L((double)((1.0 - this.sideSlider.scrollAmount()) * 255.0)) >= 10) {
            class010542.y(this.field_22793, ">", Math.round((float)(n4 - 7) - (float)this.field_22793.y(">") / 2.0f), this.field_22790 / 2, n3 | class04995.N((int)class04995.L((double)((1.0 - this.sideSlider.scrollAmount()) * 255.0)), (int)0, (int)255) << 24);
        }
        if (class04995.L((double)(this.sideSlider.scrollAmount() * 255.0)) >= 10) {
            class010542.y(this.field_22793, "<", Math.round((float)(n4 - 7) - (float)this.field_22793.y("<") / 2.0f), this.field_22790 / 2, n3 | class04995.N((int)class04995.L((double)(this.sideSlider.scrollAmount() * 255.0)), (int)0, (int)255) << 24);
        }
        if (!(rectangle = this.sideScroller.getBounds()).isEmpty()) {
            class010542.L(0, 0, n4 - 14, this.field_22790);
            int n6 = rectangle.y - this.sideScroller.scrollAmountInt();
            for (GlobalizedClothConfigScreen$Reference globalizedClothConfigScreen$Reference : this.references) {
                class010542.i().pushMatrix();
                class010542.i().scale(globalizedClothConfigScreen$Reference.getScale(), globalizedClothConfigScreen$Reference.getScale());
                class05216 class052162 = class00392.y((String)(StringUtils.repeat((String)"  ", (int)globalizedClothConfigScreen$Reference.getIndent()) + "- ")).y(globalizedClothConfigScreen$Reference.getText());
                if (this.lastHoveredReference == null) {
                    int n7 = rectangle.x;
                    int n8 = (int)((float)n6 - 4.0f * globalizedClothConfigScreen$Reference.getScale());
                    int n9 = (int)((float)this.field_22793.N((class05936)class052162) * globalizedClothConfigScreen$Reference.getScale());
                    Objects.requireNonNull(this.field_22793);
                    if (new Rectangle(n7, n8, n9, (int)((float)(9 + 4) * globalizedClothConfigScreen$Reference.getScale())).contains(n, n2)) {
                        this.lastHoveredReference = globalizedClothConfigScreen$Reference;
                    }
                }
                class010542.N(this.field_22793, class052162.method_30937(), rectangle.x, n6, this.lastHoveredReference == globalizedClothConfigScreen$Reference ? -7672 : -1, false);
                class010542.i().popMatrix();
                float f2 = n6;
                Objects.requireNonNull(this.field_22793);
                n6 = (int)(f2 + (float)(9 + 3) * globalizedClothConfigScreen$Reference.getScale());
            }
            class010542.R();
            this.sideScroller.renderScrollBar(class010542);
        }
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        Rectangle rectangle = new Rectangle(0, 0, this.getSideSliderPosition() - 14, this.field_22790);
        if (d4 != 0.0 && rectangle.contains(d, d2)) {
            this.sideScroller.offset(ClothConfigInitializer.getScrollStep() * -d4, true);
            return true;
        }
        return super.method_25401(d, d2, d3, d4);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        Rectangle rectangle = new Rectangle(0, 0, this.getSideSliderPosition() - 14, this.field_22790);
        if (class066132.v() == 0 && rectangle.contains(class066132.n(), class066132.t()) && this.lastHoveredReference != null) {
            this.field_22787.Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            this.lastHoveredReference.go();
            return true;
        }
        Rectangle rectangle2 = new Rectangle(this.getSideSliderPosition() - 14, 0, 14, this.field_22790);
        if (class066132.v() == 0 && rectangle2.contains(class066132.n(), class066132.t())) {
            this.setExpanded(!this.isExpanded());
            this.field_22787.Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public boolean isExpanded() {
        return this.sideSlider.scrollTarget() == 1.0;
    }

    public void setExpanded(boolean bl) {
        this.sideSlider.scrollTo(bl ? 1.0 : 0.0, true, 2000L);
    }

    public boolean matchesSearch(Iterator<String> iterator) {
        return this.searchFieldEntry.matchesSearch(iterator);
    }

    private void buildReferences() {
        this.categorizedEntries.forEach((class003922, list) -> {
            this.references.add(new GlobalizedClothConfigScreen$CategoryReference(this, (class00392)class003922));
            for (AbstractConfigEntry abstractConfigEntry : list) {
                this.buildReferenceFor(abstractConfigEntry, 1);
            }
        });
    }

    private void buildReferenceFor(AbstractConfigEntry<?> abstractConfigEntry, int n) {
        List list = abstractConfigEntry.getReferenceProviderEntries();
        if (list != null) {
            this.references.add(new GlobalizedClothConfigScreen$ConfigEntryReference(this, abstractConfigEntry, n));
            for (ReferenceProvider referenceProvider : list) {
                this.buildReferenceFor(referenceProvider.provideReferenceEntry(), n + 1);
            }
        }
    }

    public void requestReferenceRebuilding() {
        this.requestingReferenceRebuilding = true;
    }

    @Override
    public Map<class00392, List<AbstractConfigEntry<?>>> getCategorizedEntries() {
        return this.categorizedEntries;
    }

    int getSideSliderPosition() {
        return (int)(this.sideSlider.scrollAmount() * (double)((Integer)this.sideExpandLimit.get()).intValue() + 14.0);
    }
}

