/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04384
 *  minecraft.class04507
 *  minecraft.class04792
 *  minecraft.class04802
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04832
 *  minecraft.class04838
 *  minecraft.class06271
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07513
 *  minecraft.class08276
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class04384;
import minecraft.class04507;
import minecraft.class04792;
import minecraft.class04802;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04832;
import minecraft.class04838;
import minecraft.class06271;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07513;
import minecraft.class08276;
import minecraft.class08800;

public class class02905
extends class04507<class07513, class08276> {
    private static final class01894 N = class01894.y((String)"textures/entity/wither/wither_invulnerable.png");
    private static final class01894 y = class01894.y((String)"textures/entity/wither/wither.png");
    private final class04384 L;

    public class02905(class04832 class048322) {
        super(class048322);
        this.L = new class04384(class048322.N(class04802.is));
    }

    public class08276 method_55269() {
        return new class08276();
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class047922.N().N("head", class04822.L().N(0, 35).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_62354(class07513 class075132, class08276 class082762, float f) {
        super.method_62354((class07049)class075132, (class08800)class082762, f);
        class082762.N = class075132.M();
        class082762.y.N = 0.0f;
        class082762.y.y = class075132.method_61415(f);
        class082762.y.L = class075132.method_61414(f);
    }

    protected int method_24087(class07513 class075132, class07209 class072092) {
        return 15;
    }

    public void method_3936(class08276 class082762, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.y(-1.0f, -1.0f, 1.0f);
        class012372.N((class06271)this.L, (Object)class082762.y, class014212, this.L.method_23500(this.N(class082762)), class082762.G, class01384.u, class082762.l, null);
        class014212.y();
        super.method_3936((class08800)class082762, class014212, class012372, class069592);
    }

    private class01894 N(class08276 class082762) {
        return class082762.N ? N : y;
    }
}

