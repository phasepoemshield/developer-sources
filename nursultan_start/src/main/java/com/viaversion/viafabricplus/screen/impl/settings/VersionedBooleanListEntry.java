/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.type.VersionedBooleanSetting
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 */
package com.viaversion.viafabricplus.screen.impl.settings;

import com.viaversion.viafabricplus.api.settings.type.VersionedBooleanSetting;
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

public final class VersionedBooleanListEntry
extends VFPListEntry {
    private final VersionedBooleanSetting value;

    public VersionedBooleanListEntry(VersionedBooleanSetting versionedBooleanSetting) {
        this.value = versionedBooleanSetting;
    }

    @Override
    public void mappedMouseClicked(double d, double d2, int n) {
        this.value.setValue((Object)((Integer)this.value.getCurrentValue() + 1));
        if ((Integer)this.value.getCurrentValue() % 3 == 0) {
            this.value.setValue((Object)0);
        }
    }

    @Override
    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        boolean bl2 = (Integer)this.value.getCurrentValue() == 2;
        boolean bl3 = this.value.isEnabled((Integer)this.value.getCurrentValue());
        class05216 class052162 = class00392.L((String)("base.viafabricplus." + (bl2 ? "auto" : (bl3 ? "on" : "off"))));
        Color color = bl2 ? Color.ORANGE : (bl3 ? Color.GREEN : Color.RED);
        int n7 = class015902.N((class05936)class052162) + 2;
        this.renderScrollableText(class00392.N((String)(String.valueOf(class06541.field_1080) + this.value.getName().getString() + " " + String.valueOf(class06541.field_1070) + this.value.getProtocolRange().toString())), n7);
        int n8 = n4 / 2;
        Objects.requireNonNull(class015902);
        class010542.y(class015902, (class00392)class052162, n3 - n7, n8 - 9 / 2, color.getRGB());
        this.renderTooltip(this.value.getTooltip(), n5, n6);
    }

    public class00392 method_37006() {
        return this.value.getName();
    }
}

