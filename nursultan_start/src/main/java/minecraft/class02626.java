/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class00737
 *  minecraft.class01194
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04641
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08005
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00717;
import minecraft.class00737;
import minecraft.class01194;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02649;
import minecraft.class02661;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04641;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08005;
import minecraft.class08299;
import minecraft.class08329;

public class class02626
extends class07049 {
    private static final int y = 60;
    private static final int L = 120;
    private static final String u = "spawn_item_after_ticks";
    private static final String i = "item";
    private static final class02131<class06584> R = class03289.N(class02626.class, (class04383)class02154.B);
    public static final int N = 36;
    private long M;

    private void L() {
        if (this.method_73183().N() % 5L == 0L) {
            this.N();
        }
    }

    public boolean method_5696() {
        return true;
    }

    public class04641 method_5657() {
        return class04641.field_15975;
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(R, (Object)class06584.E);
    }

    public void method_5773() {
        super.method_5773();
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class047822);
        } else {
            this.L();
        }
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    protected void method_5652(class08329 class083292) {
        if (!this.y().R()) {
            class083292.N(i, class06584.y, (Object)this.y());
        }
        class083292.N(u, this.M);
    }

    protected void method_5749(class08299 class082992) {
        this.N(class082992.N(i, class06584.y).orElse(class06584.E));
        this.M = class082992.N(u, 0L);
    }

    protected boolean method_5818(class07049 class070492) {
        return false;
    }

    protected boolean method_48921() {
        return false;
    }

    protected void method_5627(class07049 class070492) {
        throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
    }

    public class02626(class07078<? extends class02626> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_5960 = true;
    }

    private void u() {
        class07049 class070492;
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = this.y();
        if (class072992.R()) {
            return;
        }
        class06581 class065812 = class072992.B();
        if (class065812 instanceof class02661) {
            class02661 class026612 = (class02661)class065812;
            class070492 = this.N(class047822, class026612, (class06584)class072992);
        } else {
            class070492 = new class00717((class07299)class047822, this.method_23317(), this.method_23318(), this.method_23321(), (class06584)class072992);
            class047822.method_8649(class070492);
        }
        class047822.N(3021, this.method_24515(), 1);
        class047822.N(class070492, (class03556)class01194.v, this.method_73189());
        this.N(class06584.E);
    }

    public class06584 y() {
        return (class06584)this.method_5841().N(R);
    }

    private void N(class06584 class065842) {
        this.method_5841().N(R, (Object)class065842);
    }

    public static class02626 N(class07299 class072992, class06584 class065842) {
        class02626 class026262 = new class02626((class07078<? extends class02626>)class07078.Np, class072992);
        class026262.M = class072992.field_9229.N(60, 120);
        class026262.N(class065842);
        return class026262;
    }

    private void N(class04782 class047822) {
        if ((long)this.field_6012 == this.M - 36L) {
            class047822.N(null, this.method_24515(), class04909.mD, class04911.field_15254);
        }
        if ((long)this.field_6012 >= this.M) {
            this.u();
            this.method_5768(class047822);
        }
    }

    private class07049 N(class04782 class047822, class02661 class026612, class06584 class065842) {
        class02649 class026492 = class026612.N();
        class026492.i().ifPresent(n -> class047822.N(n, this.method_24515(), 0));
        class07211 class072112 = class07211.field_11033;
        class08005 class080052 = class08005.N((class08005)class026612.N((class07299)class047822, (class00737)this.method_73189(), class065842, class072112), (class04782)class047822, (class06584)class065842, (double)class072112.P(), (double)class072112.s(), (double)class072112.T(), (float)class026492.u(), (float)class026492.L());
        class080052.L((class07049)this);
        return class080052;
    }

    public void N() {
        class06889 class068892 = this.method_73189();
        int n = this.field_5974.N(1, 3);
        for (int i = 0; i < n; ++i) {
            double d = 0.4;
            class06889 class068893 = new class06889(this.method_23317() + 0.4 * (this.field_5974.E() - this.field_5974.E()), this.method_23318() + 0.4 * (this.field_5974.E() - this.field_5974.E()), this.method_23321() + 0.4 * (this.field_5974.E() - this.field_5974.E()));
            class06889 class068894 = class068892.N(class068893);
            this.method_73183().method_8406((class07126)class07107.yM, class068892.N(), class068892.y(), class068892.L(), class068894.N(), class068894.y(), class068894.L());
        }
    }
}

