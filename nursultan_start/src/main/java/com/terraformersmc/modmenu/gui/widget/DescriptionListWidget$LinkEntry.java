/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class01321
 *  minecraft.class05096
 *  minecraft.class06613
 *  minecraft.class07536
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget$DescriptionEntry;
import minecraft.class01028;
import minecraft.class01321;
import minecraft.class05096;
import minecraft.class06613;
import minecraft.class07536;

public class DescriptionListWidget$LinkEntry
extends DescriptionListWidget$DescriptionEntry {
    private final String link;
    final /* synthetic */ DescriptionListWidget this$0;

    public DescriptionListWidget$LinkEntry(DescriptionListWidget descriptionListWidget, class01028 class010282, String string, int n) {
        this.this$0 = descriptionListWidget;
        super(descriptionListWidget, class010282, n);
        this.link = string;
    }

    public DescriptionListWidget$LinkEntry(DescriptionListWidget descriptionListWidget, class01028 class010282, String string) {
        this(descriptionListWidget, class010282, string, 0);
    }

    public boolean method_25402(class06613 class066132, boolean bl2) {
        if (this.method_25405(class066132.n(), class066132.t())) {
            DescriptionListWidget.access$100(this.this$0).N((class05096)new class01321(bl -> {
                if (bl) {
                    class07536.m().N(this.link);
                }
                DescriptionListWidget.access$200(this.this$0).N((class05096)this.this$0.parent);
            }, this.link, false));
        }
        return super.method_25402(class066132, bl2);
    }
}

