/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class05640
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08031
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class05640;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08031;
import minecraft.class08299;
import minecraft.class08329;

public abstract class class05668
extends class08031
implements class05640 {
    private static final class02131<class06584> N = class03289.N(class05668.class, (class04383)class02154.B);

    public class06584 L() {
        return (class06584)this.method_5841().N(N);
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(N, (Object)new class06584((class07310)this.N()));
    }

    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Item", class06584.y, (Object)this.L());
    }

    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("Item", class06584.y).orElseGet(() -> new class06584((class07310)this.N())));
    }

    public class05668(class07078<? extends class05668> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class05668(class07078<? extends class05668> class070782, double d, double d2, double d3, class07299 class072992, class06584 class065842) {
        super(class070782, d, d2, d3, class072992);
        this.N(class065842);
    }

    public class05668(class07078<? extends class05668> class070782, class07438 class074382, class07299 class072992, class06584 class065842) {
        this(class070782, class074382.method_23317(), class074382.method_23320() - (double)0.1f, class074382.method_23321(), class072992, class065842);
        this.L((class07049)class074382);
    }

    public void N(class06584 class065842) {
        this.method_5841().N(N, (Object)class065842.L(1));
    }

    protected abstract class06581 N();
}

