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
 *  org.joml.Matrix3x2fStack
 */
package com.viaversion.viafabricplus.screen.impl.settings;

import com.viaversion.viafabricplus.screen.VFPListEntry;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import org.joml.Matrix3x2fStack;

public final class TitleEntry
extends VFPListEntry {
    private final class00392 name;

    public TitleEntry(class00392 class003922) {
        this.name = class003922;
    }

    @Override
    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        class05216 class052162 = this.name.L().N(class06541.field_1067);
        int n7 = n4 / 2;
        Objects.requireNonNull(class015902);
        class010542.y(class015902, (class00392)class052162, 3, n7 - 9 / 2, -1);
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        Matrix3x2fStack matrix3x2fStack = class010542.i();
        matrix3x2fStack.pushMatrix();
        matrix3x2fStack.translate((float)this.method_46426(), (float)this.method_46427());
        this.mappedRender(class010542, this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), n, n2, bl, f);
        matrix3x2fStack.popMatrix();
    }

    public class00392 method_37006() {
        return this.name;
    }
}

