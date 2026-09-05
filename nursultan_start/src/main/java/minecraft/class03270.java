/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class03252
 *  minecraft.class03556
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05216
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class07536
 *  minecraft.class08548
 *  minecraft.class08551
 */
package minecraft;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class03252;
import minecraft.class03556;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05216;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class07536;
import minecraft.class08548;
import minecraft.class08551;

public class class03270 {
    public static final class05946<class03252> N = class03270.N("quartz");
    public static final class05946<class03252> y = class03270.N("iron");
    public static final class05946<class03252> L = class03270.N("netherite");
    public static final class05946<class03252> u = class03270.N("redstone");
    public static final class05946<class03252> i = class03270.N("copper");
    public static final class05946<class03252> R = class03270.N("gold");
    public static final class05946<class03252> M = class03270.N("emerald");
    public static final class05946<class03252> B = class03270.N("diamond");
    public static final class05946<class03252> Z = class03270.N("lapis");
    public static final class05946<class03252> z = class03270.N("amethyst");
    public static final class05946<class03252> U = class03270.N("resin");

    private static void N(class04116<class03252> class041162, class05946<class03252> class059462, class00405 class004052, class08548 class085482) {
        class05216 class052162 = class00392.L((String)class07536.N((String)"trim_material", (class01894)class059462.N())).L(class004052);
        class041162.N(class059462, (Object)new class03252(class085482, (class00392)class052162));
    }

    private static class05946<class03252> N(String string) {
        return class05946.N((class05946)class04227.yw, (class01894)class01894.y((String)string));
    }

    public static void N(class04116<class03252> class041162) {
        class03270.N(class041162, N, class00405.N.N(14931140), class08548.u);
        class03270.N(class041162, y, class00405.N.N(0xECECEC), class08548.i);
        class03270.N(class041162, L, class00405.N.N(6445145), class08548.R);
        class03270.N(class041162, u, class00405.N.N(9901575), class08548.M);
        class03270.N(class041162, i, class00405.N.N(11823181), class08548.B);
        class03270.N(class041162, R, class00405.N.N(14594349), class08548.Z);
        class03270.N(class041162, M, class00405.N.N(1155126), class08548.z);
        class03270.N(class041162, B, class00405.N.N(7269586), class08548.U);
        class03270.N(class041162, Z, class00405.N.N(4288151), class08548.E);
        class03270.N(class041162, z, class00405.N.N(10116294), class08548.W);
        class03270.N(class041162, U, class00405.N.N(16545810), class08548.m);
    }

    public static Optional<class03556<class03252>> N(class01929 class019292, class06584 class065842) {
        class08551 class085512 = (class08551)class065842.method_58694(class02484.Nz);
        return class085512 != null ? class085512.N(class019292) : Optional.empty();
    }
}

