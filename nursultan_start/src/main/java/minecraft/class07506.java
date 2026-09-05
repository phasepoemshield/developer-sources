/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10753
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class04782
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07308
 *  minecraft.class07310
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import Nursultan.class10753;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class04782;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07308;
import minecraft.class07310;
import minecraft.class07504;
import minecraft.class08299;
import minecraft.class08329;

public class class07506
extends class07504 {
    private final class07308 y = new class10753(this);
    private final Runnable L;

    @Override
    public class06584 method_31480() {
        return new class06584((class07310)class06570.sZ);
    }

    @Override
    public void method_5773() {
        super.method_5773();
        this.L.run();
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        this.y.N(class083292);
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y.N(this.method_73183(), this.method_24515(), class082992);
    }

    public void method_5711(byte by) {
        this.y.N(this.method_73183(), (int)by);
    }

    public class07506(class07078<? extends class07506> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.L = this.y(class072992);
    }

    public class07308 U() {
        return this.y;
    }

    protected class06581 z() {
        return class06570.sZ;
    }

    private Runnable y(class07299 class072992) {
        return class072992 instanceof class04782 ? () -> this.y.N((class04782)class072992, this.method_24515()) : () -> this.y.N(class072992, this.method_24515());
    }

    @Override
    public class00500 R() {
        return class00869.La.W();
    }
}

