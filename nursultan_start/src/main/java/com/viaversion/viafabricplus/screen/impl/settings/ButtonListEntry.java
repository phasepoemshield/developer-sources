/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.type.ButtonSetting
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05216
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.screen.impl.settings;

import com.viaversion.viafabricplus.api.settings.type.ButtonSetting;
import com.viaversion.viafabricplus.screen.VFPListEntry;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05216;
import minecraft.class06202;

public final class ButtonListEntry
extends VFPListEntry {
    private final ButtonSetting value;

    public ButtonListEntry(ButtonSetting buttonSetting) {
        this.value = buttonSetting;
    }

    @Override
    public void mappedMouseClicked(double d, double d2, int n) {
        ((Runnable)this.value.getValue()).run();
    }

    @Override
    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        class05216 class052162 = this.value.displayValue();
        int n7 = n3 / 2;
        int n8 = n4 / 2;
        Objects.requireNonNull(class015902);
        class010542.N(class015902, (class00392)class052162, n7, n8 - 9 / 2, -1);
        this.renderTooltip(this.value.getTooltip(), n5, n6);
    }

    public class00392 method_37006() {
        return this.value.displayValue();
    }
}

