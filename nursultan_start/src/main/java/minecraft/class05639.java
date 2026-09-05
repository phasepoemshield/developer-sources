/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04803
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08039
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04803;
import minecraft.class05640;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08039;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public abstract class class05639
extends class08039
implements class05640 {
    private static final float u = 12.25f;
    private static final class02131<class06584> R = class03289.N(class05639.class, (class04383)class02154.B);

    @Override
    public class06584 L() {
        return (class06584)this.method_5841().N(R);
    }

    private class06584 M() {
        return new class06584((class07310)class06570.GZ);
    }

    public @Nullable class04803 method_32318(int n) {
        if (n == 0) {
            return class04803.N(this::L, this::N);
        }
        return super.method_32318(n);
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(R, (Object)this.M());
    }

    protected void method_36975() {
    }

    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Item", class06584.y, (Object)this.L());
    }

    public boolean method_5640(double d) {
        if (this.field_6012 < 2 && d < 12.25) {
            return false;
        }
        return super.method_5640(d);
    }

    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("Item", class06584.y).orElse(this.M()));
    }

    public class05639(class07078<? extends class05639> class070782, double d, double d2, double d3, class06889 class068892, class07299 class072992) {
        super(class070782, d, d2, d3, class068892, class072992);
    }

    public class05639(class07078<? extends class05639> class070782, class07438 class074382, class06889 class068892, class07299 class072992) {
        super(class070782, class074382, class068892, class072992);
    }

    public class05639(class07078<? extends class05639> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public void N(class06584 class065842) {
        if (class065842.R()) {
            this.method_5841().N(R, (Object)this.M());
        } else {
            this.method_5841().N(R, (Object)class065842.L(1));
        }
    }
}

