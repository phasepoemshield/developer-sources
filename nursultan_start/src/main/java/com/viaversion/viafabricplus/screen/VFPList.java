/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class04654
 *  minecraft.class05724
 *  minecraft.class06202
 *  org.jspecify.annotations.Nullable
 */
package com.viaversion.viafabricplus.screen;

import com.viaversion.viafabricplus.screen.VFPListEntry;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class04654;
import minecraft.class05724;
import minecraft.class06202;
import org.jspecify.annotations.Nullable;

public class VFPList
extends class05724<VFPListEntry> {
    public VFPList(class06202 class062022, int n, int n2, int n3, int n4, int n5) {
        super(class062022, n, n2 - n3 - n4, n3, n5);
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    protected void renderSelection(class01054 class010542, VFPListEntry vFPListEntry, int n) {
    }

    public void initScrollY(double d) {
        if (((Boolean)GeneralSettings.INSTANCE.saveScrollPositionInSlotScreens.getValue()).booleanValue()) {
            this.method_44382(d);
        }
    }

    protected void updateSlotAmount(double d) {
    }

    public void method_44382(double d) {
        super.method_44382(d);
        this.updateSlotAmount(this.method_44387());
    }

    public /* synthetic */ void method_44398(class01054 class010542, class01202 class012022, int n) {
        this.renderSelection(class010542, (VFPListEntry)class012022, n);
    }
}

