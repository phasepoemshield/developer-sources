/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00436
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07078
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00436;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07078;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08007;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class08016
extends class08007 {
    private static final int u = 200;
    private int R = 200;

    @Override
    protected class06584 M() {
        return new class06584((class07310)class06570.lg);
    }

    @Override
    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608() && !this.y()) {
            this.method_73183().method_8406((class07126)class00436.N((class07103)class07107.T, (int)-1, (float)1.0f), this.method_23317(), this.method_23318(), this.method_23321(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Duration", this.R);
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.R = class082992.N("Duration", 200);
    }

    public class08016(class07078<? extends class08016> class070782, class07299 class072992) {
        super((class07078<? extends class08007>)class070782, class072992);
    }

    public class08016(class07299 class072992, double d, double d2, double d3, class06584 class065842, @Nullable class06584 class065843) {
        super((class07078<? extends class08007>)class07078.yt, d, d2, d3, class072992, class065842, class065843);
    }

    public class08016(class07299 class072992, class07438 class074382, class06584 class065842, @Nullable class06584 class065843) {
        super((class07078<? extends class08007>)class07078.yt, class074382, class072992, class065842, class065843);
    }

    @Override
    protected void N(class07438 class074382) {
        super.N(class074382);
        class07055 class070552 = new class07055(class07047.l, this.R, 0);
        class074382.method_37222(class070552, this.P());
    }
}

