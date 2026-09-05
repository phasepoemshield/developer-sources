/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07883
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00869;
import minecraft.class01001;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07883;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class05574
extends class07883 {
    private static final class02131<Integer> X = class03289.N(class05574.class, (class04383)class02154.y);
    private static final int a = 0;

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(X, (Object)0);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        boolean bl = super.method_64397(class047822, class070722, f);
        if (bl) {
            this.y(100);
        }
        return bl;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("DarkTicksRemaining", this.v());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y(class082992.N("DarkTicksRemaining", 0));
    }

    public class05574(class07078<? extends class05574> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class04891 s() {
        return class04909.Wd;
    }

    public int v() {
        return (Integer)this.field_6011.N(X);
    }

    private void y(int n) {
        this.field_6011.N(X, (Object)n);
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return (class07077)class07078.NE.N((class07299)class047822, class06113.field_16466);
    }

    protected class04891 E() {
        return class04909.WY;
    }

    public static boolean N(class07078<? extends class07438> class070782, class01001 class010012, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072092.method_10264() <= class010012.method_8615() - 33 && class010012.method_22335(class072092, 0) == 0 && class010012.method_8320(class072092).N(class00869.K);
    }

    protected class07126 W() {
        return class07107.Nf;
    }

    public class04891 method_6002() {
        return class04909.Ww;
    }

    public void method_6007() {
        super.method_6007();
        int n = this.v();
        if (n > 0) {
            this.y(n - 1);
        }
        this.method_73183().method_8406((class07126)class07107.NC, this.method_23322(0.6), this.method_23319(), this.method_23325(0.6), 0.0, 0.0, 0.0);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Wk;
    }
}

