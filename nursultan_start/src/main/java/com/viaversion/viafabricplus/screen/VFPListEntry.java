/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04995
 *  minecraft.class05699
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06613
 *  minecraft.class07536
 *  minecraft.class09033
 *  org.joml.Matrix3x2fStack
 */
package com.viaversion.viafabricplus.screen;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04995;
import minecraft.class05699;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06613;
import minecraft.class07536;
import minecraft.class09033;
import org.joml.Matrix3x2fStack;

public abstract class VFPListEntry
extends class05699<VFPListEntry> {
    protected static final int SCISSORS_OFFSET = 4;
    public static final int SLOT_MARGIN = 3;
    private class01054 context;

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.mappedMouseClicked(class066132.n(), class066132.t(), class066132.v());
        class06478.method_62888((class09033)class06202.Nq().Nr());
        return super.method_25402(class066132, bl);
    }

    public void mappedMouseClicked(double d, double d2, int n) {
    }

    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
    }

    public void renderTooltip(class00392 class003922, int n, int n2) {
        if (class003922 != null && n >= this.method_46426() && n <= this.method_46426() + this.method_25368() && n2 >= this.method_46427() && n2 <= this.method_46427() + this.method_25364()) {
            this.context.N((class01590)class06202.Nq().i_3, class003922, n, n2);
        }
    }

    public void renderScrollableText(class00392 class003922, int n, int n2) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        int n3 = class015902.N((class05936)class003922);
        if (n3 > this.method_73387() - n2) {
            double d = (double)class07536.L() / 1000.0;
            double d2 = n3 - (this.method_73387() - n2 - 7);
            double d3 = Math.sin(1.5707963267948966 * Math.cos(Math.PI * 2 * d / Math.max(d2 * 0.5, 3.0))) / 2.0 + 0.5;
            this.context.L(0, 0, this.method_73387() - n2 - 4, this.method_73384());
            this.context.y(class015902, class003922, 3 - (int)class04995.u((double)d3, (double)0.0, (double)d2), n, -1);
            this.context.R();
        } else {
            this.context.y(class015902, class003922, 3, n, -1);
        }
    }

    public void renderScrollableText(class00392 class003922, int n) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        int n2 = this.method_73384() / 2;
        Objects.requireNonNull(class015902);
        this.renderScrollableText(class003922, n2 - 9 / 2, n);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.context = class010542;
        Matrix3x2fStack matrix3x2fStack = class010542.i();
        matrix3x2fStack.pushMatrix();
        matrix3x2fStack.translate((float)this.method_73380(), (float)this.method_73382());
        class010542.N(0, 0, this.method_73387(), this.method_73384(), Integer.MIN_VALUE);
        this.mappedRender(class010542, this.method_73380(), this.method_73382(), this.method_73387(), this.method_73384(), n, n2, bl, f);
        matrix3x2fStack.popMatrix();
    }
}

