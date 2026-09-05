/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  minecraft.class00392
 *  minecraft.class03428
 *  minecraft.class06308
 *  minecraft.class06611
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import minecraft.class00392;
import minecraft.class03428;
import minecraft.class06308;
import minecraft.class06611;

public abstract class EnumButton<T extends Enum<T>>
extends class06308 {
    protected ConfigEntry<T> entry;

    protected abstract class00392 getText(T var1);

    public EnumButton(int n, int n2, int n3, int n4, ConfigEntry<T> configEntry) {
        super(n, n2, n3, n4, (class00392)class00392.i());
        this.entry = configEntry;
        this.updateText();
    }

    protected void onUpdate(T t) {
    }

    public void method_25306(class06611 class066112) {
        Enum enum_ = (Enum)this.entry.get();
        Enum[] enumArray = (Enum[])enum_.getClass().getEnumConstants();
        Enum enum_2 = enumArray[(enum_.ordinal() + 1) % enumArray.length];
        this.entry.set((Object)enum_2).save();
        this.updateText();
        this.onUpdate(enum_2);
    }

    protected void updateText() {
        this.method_25355(this.getText((Enum)this.entry.get()));
    }

    public void method_47399(class03428 class034282) {
        this.method_37021(class034282);
    }
}

