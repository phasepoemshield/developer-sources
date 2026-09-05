/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.type.BooleanSetting
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 */
package com.viaversion.viafabricplus.screen.impl.settings;

import com.viaversion.viafabricplus.api.settings.type.BooleanSetting;
import com.viaversion.viafabricplus.screen.VFPListEntry;
import java.awt.Color;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;

public final class BooleanListEntry
extends VFPListEntry {
    private final BooleanSetting value;

    public BooleanListEntry(BooleanSetting booleanSetting) {
        this.value = booleanSetting;
    }

    @Override
    public void mappedMouseClicked(double d, double d2, int n) {
        this.value.setValue((Object)((Boolean)this.value.getCurrentValue() == false ? 1 : 0));
    }

    @Override
    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        class05216 class052162 = (Boolean)this.value.getCurrentValue() != false ? class00392.L((String)"base.viafabricplus.on") : class00392.L((String)"base.viafabricplus.off");
        int n7 = class015902.N((class05936)class052162) + 2;
        this.renderScrollableText((class00392)this.value.getName().N(class06541.field_1080), n7);
        int n8 = n4 / 2;
        Objects.requireNonNull(class015902);
        class010542.y(class015902, (class00392)class052162, n3 - n7, n8 - 9 / 2, (Boolean)this.value.getCurrentValue() != false ? Color.GREEN.getRGB() : Color.RED.getRGB());
        this.renderTooltip(this.value.getTooltip(), n5, n6);
    }

    public class00392 method_37006() {
        return this.value.getName();
    }
}

