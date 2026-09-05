/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01019
 *  minecraft.class01207
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05281
 *  minecraft.class05288
 *  minecraft.class05946
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07269
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01019;
import minecraft.class01207;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class04848;
import minecraft.class04853;
import minecraft.class04884;
import minecraft.class05281;
import minecraft.class05288;
import minecraft.class05946;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class08299;
import minecraft.class08329;

public class class04858
extends class00394 {
    public static final Codec<class05946<class05281>> N = class05946.N((class05946)class04227.yv);
    public static final class01894 y = class01894.y((String)"empty");
    private static final int P = 0;
    private static final int s = 0;
    public static final String L = "target";
    public static final String u = "pool";
    public static final String i = "joint";
    public static final String R = "placement_priority";
    public static final String M = "selection_priority";
    public static final String B = "name";
    public static final String Z = "final_state";
    public static final String m = "minecraft:air";
    private class01894 T = y;
    private class01894 b = y;
    private class05946<class05281> j = class01019.N;
    private class04853 v = class04853.field_23329;
    private String n = "minecraft:air";
    private int t = 0;
    private int G = 0;

    public class01894 L() {
        return this.b;
    }

    public class04853 M() {
        return this.v;
    }

    public class04858(class07209 class072092, class00500 class005002) {
        super(class00404.field_16549, class072092, class005002);
    }

    public int B() {
        return this.t;
    }

    public int Z() {
        return this.G;
    }

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    public class05946<class05281> u() {
        return this.j;
    }

    public void y(int n) {
        this.G = n;
    }

    public void y(class01894 class018942) {
        this.b = class018942;
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N(B, class01894.N, (Object)this.T);
        class083292.N(L, class01894.N, (Object)this.b);
        class083292.N(u, N, this.j);
        class083292.N(Z, this.n);
        class083292.N(i, class04853.field_54790, (Object)this.v);
        class083292.N(R, this.t);
        class083292.N(M, this.G);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.T = class082992.N(B, class01894.N).orElse(y);
        this.b = class082992.N(L, class01894.N).orElse(y);
        this.j = class082992.N(u, N).orElse(class01019.N);
        this.n = class082992.N(Z, m);
        this.v = class082992.N(i, class04853.field_54790).orElseGet(() -> class01207.N((class00500)this.w()));
        this.t = class082992.N(R, 0);
        this.G = class082992.N(M, 0);
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    public void N(class04782 class047822, int n, boolean bl) {
        class07209 class072092 = this.d().method_10093(((class05288)this.w().L(class04884.y)).N());
        class03529 class035292 = class047822.method_30349().L(class04227.yv).y(this.j);
        class04848.N(class047822, (class03556<class05281>)class035292, this.b, n, class072092, bl);
    }

    public void N(int n) {
        this.t = n;
    }

    public void N(class01894 class018942) {
        this.T = class018942;
    }

    public void N(class05946<class05281> class059462) {
        this.j = class059462;
    }

    public void N(String string) {
        this.n = string;
    }

    public void N(class04853 class048532) {
        this.v = class048532;
    }

    public class01894 N() {
        return this.T;
    }

    public String R() {
        return this.n;
    }
}

