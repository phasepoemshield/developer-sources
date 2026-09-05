/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05729
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget;
import com.terraformersmc.modmenu.gui.widget.UpdateAvailableBadge;
import java.util.Collections;
import java.util.List;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05729;

public class DescriptionListWidget$DescriptionEntry
extends class05729<DescriptionListWidget$DescriptionEntry> {
    protected class01028 text;
    protected int indent;
    public boolean updateTextEntry = false;
    final /* synthetic */ DescriptionListWidget this$0;

    public DescriptionListWidget$DescriptionEntry(DescriptionListWidget descriptionListWidget, class01028 class010282, int n) {
        this.this$0 = descriptionListWidget;
        this.text = class010282;
        this.indent = n;
    }

    public DescriptionListWidget$DescriptionEntry(DescriptionListWidget descriptionListWidget, class01028 class010282) {
        this(descriptionListWidget, class010282, 0);
    }

    public List<? extends class04654> method_25396() {
        return Collections.emptyList();
    }

    public boolean method_25405(double d, double d2) {
        double d3;
        if (!super.method_25405(d, d2)) {
            return false;
        }
        int n = this.this$0.textRenderer.N(this.text);
        if (this.updateTextEntry) {
            n += 11;
        }
        return (d3 = d - (double)this.this$0.method_25342() - (double)this.indent) >= 0.0 && d3 < (double)n;
    }

    public DescriptionListWidget$DescriptionEntry setUpdateTextEntry() {
        this.updateTextEntry = true;
        return this;
    }

    public List<? extends class03434> method_37025() {
        return Collections.emptyList();
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_46426();
        int n4 = this.method_73382();
        if (this.updateTextEntry) {
            UpdateAvailableBadge.renderBadge(class010542, n3 + this.indent, n4);
            n3 += 11;
        }
        class010542.y(this.this$0.textRenderer, this.text, n3 + this.indent, n4, -5592406);
    }
}

