/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.DisableableWidget
 *  me.shedaniel.clothconfig2.api.HideableWidget
 *  me.shedaniel.clothconfig2.api.Requirement
 *  me.shedaniel.clothconfig2.api.TickableWidget
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05117
 */
package me.shedaniel.clothconfig2.gui.widget;

import java.util.List;
import me.shedaniel.clothconfig2.api.DisableableWidget;
import me.shedaniel.clothconfig2.api.HideableWidget;
import me.shedaniel.clothconfig2.api.Requirement;
import me.shedaniel.clothconfig2.api.TickableWidget;
import me.shedaniel.clothconfig2.gui.widget.DynamicEntryListWidget;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05117;

public abstract class DynamicEntryListWidget$Entry<E extends DynamicEntryListWidget$Entry<E>>
implements class04654,
DisableableWidget,
HideableWidget,
TickableWidget {
    @Deprecated
    DynamicEntryListWidget<E> parent;
    @Deprecated
    final Rectangle bounds = new Rectangle();
    private class03434 lastNarratable;
    protected Requirement enableRequirement = null;
    protected Requirement displayRequirement = null;
    protected boolean enabled = true;
    protected boolean displayed = true;

    public void setParent(DynamicEntryListWidget<E> dynamicEntryListWidget) {
        this.parent = dynamicEntryListWidget;
    }

    public void tick() {
        this.enabled = this.getRequirement() == null || this.getRequirement().check();
        this.displayed = this.getDisplayRequirement() == null || this.getDisplayRequirement().check();
    }

    public boolean isEnabled() {
        return this.isDisplayed() && this.enabled;
    }

    public DynamicEntryListWidget<E> getParent() {
        return this.parent;
    }

    @Deprecated
    public void setBounds(Rectangle rectangle) {
        this.bounds.setBounds(rectangle);
    }

    void method_37020(class03428 class034282) {
        List<class03434> list = this.narratables();
        class05117 class051172 = class05096.method_37061(list, (class03434)this.lastNarratable);
        if (class051172 != null) {
            if (class051172.L().N()) {
                this.lastNarratable = class051172.N();
            }
            if (list.size() > 1) {
                class034282.N(class03457.field_33789, (class00392)class00392.N((String)"narrator.position.object_list", (Object[])new Object[]{class051172.y() + 1, list.size()}));
                if (class051172.L() == class03432.field_33786) {
                    class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.component_list.usage"));
                }
            }
            class051172.N().method_37020(class034282.N());
        }
    }

    public boolean method_25405(double d, double d2) {
        return this.bounds.contains(d, d2);
    }

    public abstract void render(class01054 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10);

    public Requirement getRequirement() {
        return this.enableRequirement;
    }

    public boolean isDisplayed() {
        return this.displayed;
    }

    public abstract int getItemHeight();

    public void setRequirement(Requirement requirement) {
        this.enableRequirement = requirement;
    }

    public abstract List<? extends class03434> narratables();

    public void setDisplayRequirement(Requirement requirement) {
        this.displayRequirement = requirement;
    }

    @Deprecated
    public int getMorePossibleHeight() {
        return -1;
    }

    public Requirement getDisplayRequirement() {
        return this.displayRequirement;
    }
}

