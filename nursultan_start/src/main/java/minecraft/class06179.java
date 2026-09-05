/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  minecraft.class00675
 *  minecraft.class00683
 *  minecraft.class01001
 *  minecraft.class06113
 *  minecraft.class06140
 *  minecraft.class07052
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07446
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07952
 *  minecraft.class07993
 *  minecraft.class08004
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10714;
import minecraft.class00675;
import minecraft.class00683;
import minecraft.class01001;
import minecraft.class06113;
import minecraft.class06140;
import minecraft.class06163;
import minecraft.class07052;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07299;
import minecraft.class07446;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07952;
import minecraft.class07993;
import minecraft.class08004;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class06179
extends class00683 {
    private static final int C = 47999;
    private int S = 47999;

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("DespawnDelay", this.S);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.S = class082992.N("DespawnDelay", 47999);
    }

    public class06179(class07078<? extends class06179> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected void y(class08036 class080362) {
        if (this.yW() instanceof class06163) {
            return;
        }
        super.y(class080362);
    }

    public void E(int n) {
        this.S = n;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class061132 == class06113.field_16467) {
            this.u(0);
        }
        if (class074462 == null) {
            class074462 = new class10714(false);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean ND() {
        return true;
    }

    private boolean yP() {
        return this.g_() && !this.ym();
    }

    private void yM() {
        if (!this.yB()) {
            return;
        }
        int n = this.S = this.ym() ? ((class06163)this.yW()).B() - 1 : this.S - 1;
        if (this.S <= 0) {
            this.yE();
            this.method_31472();
        }
    }

    private boolean yB() {
        return !this.I() && !this.yP() && !this.method_5817();
    }

    protected void l_() {
        super.l_();
        this.e.N(1, (class07473)new class07993((class07475)this, 2.0));
        this.H.N(1, (class07473)new class06140((class00683)this));
        this.H.N(2, (class07473)new class07952((class07079)this, class08004.class, true, (class074382, class047822) -> class074382.method_5864() != class07078.LN));
        this.H.N(2, (class07473)new class07952((class07079)this, class00675.class, true));
    }

    protected @Nullable class00683 yy() {
        return (class00683)class07078.yJ.N(this.method_73183(), class06113.field_16466);
    }

    private boolean ym() {
        return this.yW() instanceof class06163;
    }

    public void method_6007() {
        super.method_6007();
        if (!this.method_73183().method_8608()) {
            this.yM();
        }
    }
}

