/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04654
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.SettingsScreen$SlotList;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class04654;

public final class SettingsScreen
extends VFPScreen {
    public static final SettingsScreen INSTANCE = new SettingsScreen();

    public SettingsScreen() {
        super((class00392)class00392.L((String)"screen.viafabricplus.settings"), true);
    }

    @Override
    public void method_25426() {
        this.setupDefaultSubtitle();
        Objects.requireNonNull(this.field_22793);
        Objects.requireNonNull(this.field_22793);
        this.method_37063((class04654)new SettingsScreen$SlotList(this.field_22787, this.field_22789, this.field_22790, 6 + (9 + 2) * 3, -5, (9 + 2) * 2));
        super.method_25426();
    }
}

