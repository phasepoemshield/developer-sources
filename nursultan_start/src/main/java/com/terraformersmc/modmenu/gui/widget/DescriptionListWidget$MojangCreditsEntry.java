/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class05096
 *  minecraft.class06613
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget$DescriptionEntry;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget$MojangCreditsEntry$MinecraftCredits;
import minecraft.class01028;
import minecraft.class05096;
import minecraft.class06613;

public class DescriptionListWidget$MojangCreditsEntry
extends DescriptionListWidget$DescriptionEntry {
    final /* synthetic */ DescriptionListWidget this$0;

    public DescriptionListWidget$MojangCreditsEntry(DescriptionListWidget descriptionListWidget, class01028 class010282) {
        this.this$0 = descriptionListWidget;
        super(descriptionListWidget, class010282);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.method_25405(class066132.n(), class066132.t())) {
            DescriptionListWidget.access$000(this.this$0).N((class05096)new DescriptionListWidget$MojangCreditsEntry$MinecraftCredits(this));
        }
        return super.method_25402(class066132, bl);
    }
}

