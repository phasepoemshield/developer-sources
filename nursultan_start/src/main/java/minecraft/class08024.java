/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05639
 *  minecraft.class06145
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07323
 *  minecraft.class07328
 *  minecraft.class07438
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class04782;
import minecraft.class05639;
import minecraft.class06145;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07323;
import minecraft.class07328;
import minecraft.class07438;
import minecraft.class08299;
import minecraft.class08329;

public class class08024
extends class05639 {
    private static final byte u = 1;
    private int R = 1;

    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("ExplosionPower", (byte)this.R);
    }

    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.R = class082992.N("ExplosionPower", (byte)1);
    }

    public class08024(class07078<? extends class08024> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class08024(class07299 class072992, class07438 class074382, class06889 class068892, int n) {
        super(class07078.NL, class074382, class068892, class072992);
        this.R = n;
    }

    protected void N(class07089 class070892) {
        super.N(class070892);
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            boolean bl = (Boolean)((class04782)class072992).method_64395().N(class07305.I);
            this.method_73183().method_8537((class07049)this, this.method_23317(), this.method_23318(), this.method_23321(), (float)this.R, bl, class07328.field_40890);
            this.method_31472();
        }
    }

    protected void N(class06145 class061452) {
        super.N(class061452);
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = class061452.L();
        class07049 class070492 = this.z();
        class07072 class070722 = this.method_48923().N((class05639)this, class070492);
        class072992.method_64397(class047822, class070722, 6.0f);
        class07323.N((class04782)class047822, (class07049)class072992, (class07072)class070722);
    }
}

