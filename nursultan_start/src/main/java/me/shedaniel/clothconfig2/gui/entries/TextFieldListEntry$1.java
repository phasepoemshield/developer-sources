/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04927
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.TextFieldListEntry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04927;

class TextFieldListEntry$1
extends class04927 {
    final /* synthetic */ TextFieldListEntry this$0;

    TextFieldListEntry$1(TextFieldListEntry textFieldListEntry, class01590 class015902, int n, int n2, int n3, int n4, class00392 class003922) {
        this.this$0 = textFieldListEntry;
        super(class015902, n, n2, n3, n4, class003922);
    }

    public void method_1867(String string) {
        super.method_1867(this.this$0.stripAddText(string));
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        this.method_25365(this.this$0.isSelected && this.this$0.method_25399() == this);
        this.this$0.textFieldPreRender(this);
        super.method_48579(class010542, n, n2, f);
    }
}

