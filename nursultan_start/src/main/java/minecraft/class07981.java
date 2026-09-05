/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05459
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07655
 */
package minecraft;

import minecraft.class05459;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07655;

public class class07981
extends class07473 {
    private final class07475 N;

    public void L() {
        class07623 class076232 = this.N.f();
        if (class076232 instanceof class07655) {
            ((class07655)class076232).L(true);
        }
    }

    public class07981(class07475 class074752) {
        this.N = class074752;
    }

    public void u() {
        class07623 class076232;
        if (class05459.N((class07079)this.N) && (class076232 = this.N.f()) instanceof class07655) {
            ((class07655)class076232).L(false);
        }
    }

    public boolean N() {
        return this.N.method_73183().method_8530() && this.N.method_6118(class07085.field_6169).R() && class05459.N((class07079)this.N);
    }
}

