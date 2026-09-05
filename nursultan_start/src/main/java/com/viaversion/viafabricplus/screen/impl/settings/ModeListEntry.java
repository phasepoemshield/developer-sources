/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.type.ModeSetting
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 */
package com.viaversion.viafabricplus.screen.impl.settings;

import com.viaversion.viafabricplus.api.settings.type.ModeSetting;
import com.viaversion.viafabricplus.screen.VFPListEntry;
import java.util.Arrays;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;

public final class ModeListEntry
extends VFPListEntry {
    private final ModeSetting value;

    public ModeListEntry(ModeSetting modeSetting) {
        this.value = modeSetting;
    }

    @Override
    public void mappedMouseClicked(double d, double d2, int n) {
        int n2 = Arrays.stream(this.value.getOptions()).toList().indexOf(this.value.getCurrentValue()) + 1;
        this.value.setValue(n2 > this.value.getOptions().length - 1 ? 0 : n2);
    }

    @Override
    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        int n7 = class015902.N((class05936)this.value.getCurrentValue()) + 2;
        this.renderScrollableText((class00392)this.value.getName().N(class06541.field_1080), n7);
        class00392 class003922 = (class00392)this.value.getCurrentValue();
        int n8 = n4 / 2;
        Objects.requireNonNull(class015902);
        class010542.y(class015902, class003922, n3 - n7, n8 - 9 / 2, -1);
        this.renderTooltip(this.value.getTooltip(), n5, n6);
    }

    public class00392 method_37006() {
        return this.value.getName();
    }
}

