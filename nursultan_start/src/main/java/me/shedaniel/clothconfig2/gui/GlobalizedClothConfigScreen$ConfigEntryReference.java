/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.Expandable
 *  me.shedaniel.clothconfig2.api.ReferenceProvider
 *  minecraft.class00392
 *  minecraft.class04654
 */
package me.shedaniel.clothconfig2.gui;

import java.util.List;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.Expandable;
import me.shedaniel.clothconfig2.api.ReferenceProvider;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen$Reference;
import minecraft.class00392;
import minecraft.class04654;

class GlobalizedClothConfigScreen$ConfigEntryReference
implements GlobalizedClothConfigScreen$Reference {
    private final AbstractConfigEntry<?> entry;
    private final int layer;
    final /* synthetic */ GlobalizedClothConfigScreen this$0;

    @Override
    public class00392 getText() {
        return this.entry.getFieldName();
    }

    public GlobalizedClothConfigScreen$ConfigEntryReference(GlobalizedClothConfigScreen globalizedClothConfigScreen, AbstractConfigEntry<?> abstractConfigEntry, int n) {
        this.this$0 = globalizedClothConfigScreen;
        this.entry = abstractConfigEntry;
        this.layer = n;
    }

    @Override
    public int getIndent() {
        return this.layer;
    }

    @Override
    public void go() {
        int[] nArray = new int[]{0};
        for (AbstractConfigEntry<AbstractConfigEntry<?>> abstractConfigEntry : this.this$0.listWidget.method_25396()) {
            int n = nArray[0];
            if (this.goChild(nArray, null, abstractConfigEntry)) {
                return;
            }
            nArray[0] = n + abstractConfigEntry.getItemHeight();
        }
    }

    @Override
    public float getScale() {
        return 1.0f;
    }

    private boolean goChild(int[] nArray, Integer n, AbstractConfigEntry<?> abstractConfigEntry) {
        boolean bl;
        if (abstractConfigEntry == this.entry) {
            this.this$0.listWidget.scrollTo(n == null ? (double)nArray[0] : (double)n.intValue(), true);
            return true;
        }
        int n2 = nArray[0];
        nArray[0] = nArray[0] + abstractConfigEntry.getInitialReferenceOffset();
        boolean bl2 = bl = abstractConfigEntry instanceof Expandable && ((Expandable)abstractConfigEntry).isExpanded();
        if (abstractConfigEntry instanceof Expandable) {
            ((Expandable)abstractConfigEntry).setExpanded(true);
        }
        List list = abstractConfigEntry.method_25396();
        if (abstractConfigEntry instanceof Expandable) {
            ((Expandable)abstractConfigEntry).setExpanded(bl);
        }
        for (class04654 class046542 : list) {
            if (!(class046542 instanceof ReferenceProvider)) continue;
            int n3 = nArray[0];
            if (this.goChild(nArray, n != null ? n : (abstractConfigEntry instanceof Expandable && !bl ? Integer.valueOf(n2) : null), ((ReferenceProvider)class046542).provideReferenceEntry())) {
                return true;
            }
            nArray[0] = n3 + ((ReferenceProvider)class046542).provideReferenceEntry().getItemHeight();
        }
        return false;
    }
}

