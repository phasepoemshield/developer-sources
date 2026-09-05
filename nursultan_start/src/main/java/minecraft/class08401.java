/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03552
 *  minecraft.class03557
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class08438
 *  minecraft.class08545
 *  minecraft.class08558
 *  minecraft.class08561
 *  minecraft.class08568
 *  minecraft.class08585
 */
package minecraft;

import minecraft.class00780;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03552;
import minecraft.class03557;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class08403;
import minecraft.class08438;
import minecraft.class08545;
import minecraft.class08558;
import minecraft.class08561;
import minecraft.class08568;
import minecraft.class08585;

public class class08401 {
    public static final class05946<class08403> N = class08401.N(class08558.N);
    public static final class05946<class08403> y = class08401.N(class08558.y);
    public static final class05946<class08403> L = class08401.N(class08558.L);
    public static final class05946<class08403> u = N;

    private static void N(class04116<class08403> class041162, class05946<class08403> class059462, class08438 class084382, String string, class03530<class00780> class035302) {
        class03552 class035522 = class041162.N(class04227.NA).y(class035302);
        class08401.N(class041162, class059462, class084382, string, class08585.N((class08568)new class08561((class03543)class035522), (int)1));
    }

    private static void N(class04116<class08403> class041162, class05946<class08403> class059462, class08438 class084382, String string, class08585 class085852) {
        class01894 class018942 = class01894.y((String)("entity/cow/" + string));
        class041162.N(class059462, (Object)new class08403((class08545<class08438>)new class08545((Object)class084382, class018942), class085852));
    }

    private static class05946<class08403> N(class01894 class018942) {
        return class05946.N((class05946)class04227.Nr, (class01894)class018942);
    }

    public static void N(class04116<class08403> class041162) {
        class08401.N(class041162, N, class08438.field_56429, "temperate_cow", class08585.N((int)0));
        class08401.N(class041162, y, class08438.field_56431, "warm_cow", (class03530<class00780>)class03557.NM);
        class08401.N(class041162, L, class08438.field_56430, "cold_cow", (class03530<class00780>)class03557.NR);
    }
}

