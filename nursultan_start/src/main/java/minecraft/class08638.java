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
import minecraft.class08545;
import minecraft.class08558;
import minecraft.class08561;
import minecraft.class08585;
import minecraft.class08603;
import minecraft.class08642;

public class class08638 {
    public static final class05946<class08642> N = class08638.N(class08558.N);
    public static final class05946<class08642> y = class08638.N(class08558.y);
    public static final class05946<class08642> L = class08638.N(class08558.L);
    public static final class05946<class08642> u = N;

    private static void N(class04116<class08642> class041162, class05946<class08642> class059462, class08603 class086032, String string, class03530<class00780> class035302) {
        class03552 class035522 = class041162.N(class04227.NA).y(class035302);
        class08638.N(class041162, class059462, class086032, string, class08585.N(new class08561((class03543<class00780>)class035522), 1));
    }

    private static void N(class04116<class08642> class041162, class05946<class08642> class059462, class08603 class086032, String string, class08585 class085852) {
        class01894 class018942 = class01894.y((String)("entity/pig/" + string));
        class041162.N(class059462, (Object)new class08642(new class08545<class08603>(class086032, class018942), class085852));
    }

    private static class05946<class08642> N(class01894 class018942) {
        return class05946.N((class05946)class04227.yP, (class01894)class018942);
    }

    public static void N(class04116<class08642> class041162) {
        class08638.N(class041162, N, class08603.field_55688, "temperate_pig", class08585.N(0));
        class08638.N(class041162, y, class08603.field_55688, "warm_pig", (class03530<class00780>)class03557.NM);
        class08638.N(class041162, L, class08603.field_55689, "cold_pig", (class03530<class00780>)class03557.NR);
    }
}

