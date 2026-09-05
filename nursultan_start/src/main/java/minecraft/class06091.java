/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10555
 *  minecraft.class00772
 *  minecraft.class01001
 *  minecraft.class02055
 *  minecraft.class04227
 *  minecraft.class04877
 *  minecraft.class07052
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07446
 *  minecraft.class07473
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10555;
import minecraft.class00772;
import minecraft.class01001;
import minecraft.class02055;
import minecraft.class04227;
import minecraft.class04877;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07052;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07446;
import minecraft.class07473;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public abstract class class06091
extends class07150 {
    private static final boolean N = false;
    private static final boolean y = false;
    private @Nullable class07209 L;
    private boolean u = false;
    private boolean i = false;

    public void M(boolean bl) {
        this.u = bl;
        this.i = true;
    }

    public boolean Q() {
        return this.u;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.y("patrol_target", class07209.field_25064, (Object)this.L);
        class083292.N("PatrolLeader", this.u);
        class083292.N("Patrolling", this.i);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.L = class082992.N("patrol_target", class07209.field_25064).orElse(null);
        this.u = class082992.N("PatrolLeader", false);
        this.i = class082992.N("Patrolling", false);
    }

    public class06091(class07078<? extends class06091> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public void B(boolean bl) {
        this.i = bl;
    }

    public void I() {
        this.L = this.method_24515().method_10069(-500 + this.field_5974.y(1000), 0, -500 + this.field_5974.y(1000));
        this.i = true;
    }

    public @Nullable class07209 l() {
        return this.L;
    }

    public boolean d() {
        return this.L != null;
    }

    public boolean o() {
        return this.i;
    }

    public boolean v() {
        return true;
    }

    public void N(class07209 class072092) {
        this.L = class072092;
        this.i = true;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class061132 != class06113.field_16527 && class061132 != class06113.field_16467 && class061132 != class06113.field_16474 && class010012.method_8409().z() < 0.06f && this.v()) {
            this.u = true;
        }
        if (this.Q()) {
            this.method_5673(class07085.field_6169, class04877.N((class02055)this.method_56673().L(class04227.NF)));
            this.N(class07085.field_6169, 2.0f);
        }
        if (class061132 == class06113.field_16527) {
            this.i = true;
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean N(double d) {
        return !this.i || d > 16384.0;
    }

    public static boolean N(class07078<? extends class06091> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        if (class072842.method_8314(class00772.field_9282, class072092) > 8) {
            return false;
        }
        return class06091.L(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
    }

    public boolean O() {
        return true;
    }

    public void l_() {
        super.l_();
        this.e.N(4, (class07473)new class10555(this, 0.7, 0.595));
    }
}

