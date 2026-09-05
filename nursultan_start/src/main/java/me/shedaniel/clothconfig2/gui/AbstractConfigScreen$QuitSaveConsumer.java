/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class05096
 */
package me.shedaniel.clothconfig2.gui;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import me.shedaniel.clothconfig2.gui.AbstractConfigScreen;
import minecraft.class05096;

class AbstractConfigScreen$QuitSaveConsumer
implements BooleanConsumer {
    final /* synthetic */ AbstractConfigScreen this$0;

    AbstractConfigScreen$QuitSaveConsumer(AbstractConfigScreen abstractConfigScreen) {
        this.this$0 = abstractConfigScreen;
    }

    public void accept(boolean bl) {
        if (!bl) {
            AbstractConfigScreen.access$000(this.this$0).N((class05096)this.this$0);
        } else {
            AbstractConfigScreen.access$100(this.this$0).N(this.this$0.parent);
        }
    }
}

