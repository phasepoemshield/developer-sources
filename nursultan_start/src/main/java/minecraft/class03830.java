/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01517
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import java.util.Map;
import minecraft.class01517;
import minecraft.class03811;
import minecraft.class03829;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07049;
import minecraft.class07438;

public class class03830
extends class05765<class03811> {
    static final int N = 5 * class01517.i * 20;
    static final int y = 5;
    static final int L = 75;
    int u = 0;
    boolean i;

    protected void L(class04782 class047822, class03811 class038112, long l) {
        class038112.t();
    }

    public class03830() {
        super(Map.of(), N);
    }

    protected void u(class04782 class047822, class03811 class038112, long l) {
        if (!class038112.l()) {
            class038112.G();
        }
    }

    protected boolean y(class04782 class047822, class03811 class038112, long l) {
        return class038112.n().N();
    }

    protected boolean N(class04782 class047822, class03811 class038112) {
        return class038112.method_24828();
    }

    protected void N(class04782 class047822, class03811 class038112, long l) {
        boolean bl;
        super.L(class047822, (class07438)class038112, l);
        if (this.u > 0) {
            --this.u;
        }
        if (class038112.v()) {
            class038112.N(class03829.field_47792);
            if (class038112.method_24828()) {
                class038112.method_43077(class04909.Nz);
            }
            return;
        }
        class03829 class038292 = class038112.n();
        long l2 = class038112.method_18868().i(class05378.o);
        boolean bl2 = bl = l2 > 75L;
        if (bl != this.i) {
            this.u = this.N(class038112);
        }
        this.i = bl;
        if (class038292 == class03829.field_47792) {
            if (this.u == 0 && class038112.method_24828() && bl) {
                class047822.method_8421((class07049)class038112, (byte)64);
                this.u = this.N(class038112);
            }
            if (l2 < (long)class03829.field_49084.y()) {
                class038112.method_43077(class04909.Nm);
                class038112.N(class03829.field_49084);
            }
        } else if (class038292 == class03829.field_49084 && l2 > (long)class03829.field_49084.y()) {
            class038112.N(class03829.field_47792);
        }
    }

    private int N(class03811 class038112) {
        return class03829.field_47792.y() + class038112.method_59922().N(100, 400);
    }
}

