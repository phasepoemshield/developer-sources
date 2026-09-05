/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04909
 *  minecraft.class07049
 *  minecraft.class07086
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class08002
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class04909;
import minecraft.class07049;
import minecraft.class07086;
import minecraft.class07144;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class08002;

class class07170
extends class07473 {
    private int y;
    final /* synthetic */ class07144 N;

    public void L() {
        this.y = 20;
        this.N.N(100);
    }

    public class07170(class07144 class071442) {
        this.N = class071442;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        if (this.N.method_73183().y() == class07086.field_5801) {
            return;
        }
        --this.y;
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return;
        }
        this.N.p().N((class07049)class074382, 180.0f, 180.0f);
        if (this.N.method_5858((class07049)class074382) < 400.0) {
            if (this.y <= 0) {
                this.y = 20 + class07144.L(this.N).y(10) * 20 / 2;
                this.N.method_73183().method_8649((class07049)new class08002(this.N.method_73183(), (class07438)this.N, (class07049)class074382, this.N.E().z()));
                this.N.method_5783(class04909.kL, 2.0f, (class07144.u(this.N).z() - class07144.i(this.N).z()) * 0.2f + 1.0f);
            }
        } else {
            this.N.y((class07438)null);
        }
        super.i();
    }

    public void u() {
        this.N.N(0);
    }

    public boolean N() {
        class07438 class074382 = this.N.T();
        if (class074382 == null || !class074382.method_5805()) {
            return false;
        }
        return this.N.method_73183().y() != class07086.field_5801;
    }
}

