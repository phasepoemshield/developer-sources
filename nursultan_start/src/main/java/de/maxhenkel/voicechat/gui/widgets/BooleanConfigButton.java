/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class03428
 *  minecraft.class06308
 *  minecraft.class06478
 *  minecraft.class06611
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class03428;
import minecraft.class06308;
import minecraft.class06478;
import minecraft.class06611;

public class BooleanConfigButton
extends class06308 {
    protected ConfigEntry<Boolean> entry;
    protected Function<Boolean, class00392> component;

    public BooleanConfigButton(int n, int n2, int n3, int n4, ConfigEntry<Boolean> configEntry, Function<Boolean, class00392> function) {
        super(n, n2, n3, n4, (class00392)class00392.i());
        this.entry = configEntry;
        this.component = function;
        this.updateText();
    }

    public void method_25306(class06611 class066112) {
        this.entry.set((Object)((Boolean)this.entry.get() == false ? 1 : 0)).save();
        this.updateText();
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.method_75794(class010542);
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
    }

    private void updateText() {
        this.method_25355(this.component.apply((Boolean)this.entry.get()));
    }

    public void method_47399(class03428 class034282) {
        this.method_37021(class034282);
    }
}

