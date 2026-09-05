/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen;
import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen$SharedSlot;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;

public final class PerServerVersionScreen$ResetSlot
extends PerServerVersionScreen$SharedSlot {
    final /* synthetic */ PerServerVersionScreen this$0;

    public PerServerVersionScreen$ResetSlot(PerServerVersionScreen perServerVersionScreen) {
        this.this$0 = perServerVersionScreen;
        super(perServerVersionScreen);
    }

    @Override
    public void mappedMouseClicked(double d, double d2, int n) {
        this.this$0.selectionConsumer.accept(null);
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        class05216 class052162 = ((class05216)this.method_37006()).N(class06541.field_1065);
        int n3 = this.method_73388();
        int n4 = this.method_73385();
        Objects.requireNonNull(class015902);
        class010542.N(class015902, (class00392)class052162, n3, n4 - 9 / 2, -1);
    }

    public class00392 method_37006() {
        return class00392.L((String)"base.viafabricplus.cancel_and_reset");
    }
}

