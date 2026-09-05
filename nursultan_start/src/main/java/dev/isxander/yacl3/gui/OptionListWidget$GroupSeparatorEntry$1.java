/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03457
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.gui.OptionListWidget$GroupSeparatorEntry;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03457;

class OptionListWidget$GroupSeparatorEntry$1
implements class03434 {
    final /* synthetic */ OptionListWidget$GroupSeparatorEntry this$1;

    OptionListWidget$GroupSeparatorEntry$1(OptionListWidget$GroupSeparatorEntry optionListWidget$GroupSeparatorEntry) {
        this.this$1 = optionListWidget$GroupSeparatorEntry;
    }

    public void method_37020(class03428 class034282) {
        class034282.N(class03457.field_33788, this.this$1.group.name());
        class034282.N(class03457.field_33790, this.this$1.group.tooltip());
    }

    public class03432 method_37018() {
        return class03432.field_33785;
    }
}

