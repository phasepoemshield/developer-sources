/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class05096
 *  minecraft.class06613
 *  minecraft.class07536
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget;
import com.terraformersmc.modmenu.gui.widget.DescriptionListWidget$DescriptionEntry;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class05096;
import minecraft.class06613;
import minecraft.class07536;

public class DescriptionListWidget$MailableContactEntry
extends DescriptionListWidget$DescriptionEntry {
    private final String email;
    final /* synthetic */ DescriptionListWidget this$0;

    public DescriptionListWidget$MailableContactEntry(DescriptionListWidget descriptionListWidget, class01028 class010282, String string, int n) {
        this.this$0 = descriptionListWidget;
        super(descriptionListWidget, class010282, n);
        this.email = string;
    }

    public DescriptionListWidget$MailableContactEntry(DescriptionListWidget descriptionListWidget, class01028 class010282, String string) {
        this(descriptionListWidget, class010282, string, 0);
    }

    public boolean method_25402(class06613 class066132, boolean bl2) {
        if (this.method_25405(class066132.n(), class066132.t())) {
            DescriptionListWidget.access$300(this.this$0).N((class05096)new class01321(bl -> {
                if (bl) {
                    class07536.m().N("mailto:" + this.email);
                }
                DescriptionListWidget.access$400(this.this$0).N((class05096)this.this$0.parent);
            }, "mailto:" + this.email, false));
        }
        return super.method_25402(class066132, bl2);
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        super.method_25343(class010542, n, n2, bl, f);
        class010542.y(this.this$0.textRenderer, (class00392)class00392.y((String)" ").y((class00392)class00392.y((String)"\u2709")), this.method_73380() + this.indent + this.this$0.textRenderer.N(this.text) + 1, this.method_73382(), -5592406);
    }
}

