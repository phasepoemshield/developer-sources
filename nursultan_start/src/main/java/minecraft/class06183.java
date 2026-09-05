/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class06889;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;

public class class06183
extends class07089 {
    private final class07211 y;
    private final class07209 L;
    private final boolean u;
    private final boolean i;
    private final boolean R;

    public class06183 L() {
        return new class06183(this.u, this.N, this.y, this.L, this.i, true);
    }

    public boolean M() {
        return this.R;
    }

    public class06183(class06889 class068892, class07211 class072112, class07209 class072092, boolean bl) {
        this(false, class068892, class072112, class072092, bl, false);
    }

    private class06183(boolean bl, class06889 class068892, class07211 class072112, class07209 class072092, boolean bl2, boolean bl3) {
        super(class068892);
        this.u = bl;
        this.y = class072112;
        this.L = class072092;
        this.i = bl2;
        this.R = bl3;
    }

    public class06183(class06889 class068892, class07211 class072112, class07209 class072092, boolean bl, boolean bl2) {
        this(false, class068892, class072112, class072092, bl, bl2);
    }

    public class07211 i() {
        return this.y;
    }

    public class07209 u() {
        return this.L;
    }

    public static class06183 N(class06889 class068892, class07211 class072112, class07209 class072092) {
        return new class06183(true, class068892, class072112, class072092, false, false);
    }

    public class07113 N() {
        return this.u ? class07113.field_1333 : class07113.field_1332;
    }

    public class06183 N(class07211 class072112) {
        return new class06183(this.u, this.N, class072112, this.L, this.i, this.R);
    }

    public class06183 N(class07209 class072092) {
        return new class06183(this.u, this.N, this.y, class072092, this.i, this.R);
    }

    public boolean R() {
        return this.i;
    }
}

