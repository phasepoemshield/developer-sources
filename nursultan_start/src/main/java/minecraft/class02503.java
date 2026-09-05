/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06953
 *  minecraft.class08561
 *  minecraft.class08568
 *  minecraft.class08585
 */
package minecraft;

import minecraft.class00780;
import minecraft.class00795;
import minecraft.class01894;
import minecraft.class02497;
import minecraft.class02505;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06953;
import minecraft.class08561;
import minecraft.class08568;
import minecraft.class08585;

public class class02503 {
    public static final class05946<class02505> N = class02503.N("pale");
    public static final class05946<class02505> y = class02503.N("spotted");
    public static final class05946<class02505> L = class02503.N("snowy");
    public static final class05946<class02505> u = class02503.N("black");
    public static final class05946<class02505> i = class02503.N("ashen");
    public static final class05946<class02505> R = class02503.N("rusty");
    public static final class05946<class02505> M = class02503.N("woods");
    public static final class05946<class02505> B = class02503.N("chestnut");
    public static final class05946<class02505> Z = class02503.N("striped");
    public static final class05946<class02505> z = N;

    private static class08585 N(class03543<class00780> class035432) {
        return class08585.N((class08568)new class08561(class035432), (int)1);
    }

    public static void N(class04116<class02505> class041162) {
        class02503.N(class041162, N, "wolf", class08585.N((int)0));
        class02503.N(class041162, y, "wolf_spotted", (class03530<class00780>)class03557.U);
        class02503.N(class041162, L, "wolf_snowy", (class05946<class00780>)class00795.J);
        class02503.N(class041162, u, "wolf_black", (class05946<class00780>)class00795.P);
        class02503.N(class041162, i, "wolf_ashen", (class05946<class00780>)class00795.b);
        class02503.N(class041162, R, "wolf_rusty", (class03530<class00780>)class03557.Z);
        class02503.N(class041162, M, "wolf_woods", (class05946<class00780>)class00795.Z);
        class02503.N(class041162, B, "wolf_chestnut", (class05946<class00780>)class00795.s);
        class02503.N(class041162, Z, "wolf_striped", (class03530<class00780>)class03557.R);
    }

    private static void N(class04116<class02505> class041162, class05946<class02505> class059462, String string, class08585 class085852) {
        class01894 class018942 = class01894.y((String)("entity/wolf/" + string));
        class01894 class018943 = class01894.y((String)("entity/wolf/" + string + "_tame"));
        class01894 class018944 = class01894.y((String)("entity/wolf/" + string + "_angry"));
        class041162.N(class059462, (Object)new class02505(new class02497(new class06953(class018942), new class06953(class018943), new class06953(class018944)), class085852));
    }

    private static class05946<class02505> N(String string) {
        return class05946.N((class05946)class04227.yY, (class01894)class01894.y((String)string));
    }

    private static void N(class04116<class02505> class041162, class05946<class02505> class059462, String string, class03530<class00780> class035302) {
        class02503.N(class041162, class059462, string, class02503.N((class03543<class00780>)class041162.N(class04227.NA).y(class035302)));
    }

    private static void N(class04116<class02505> class041162, class05946<class02505> class059462, String string, class05946<class00780> class059463) {
        class02503.N(class041162, class059462, string, class02503.N((class03543<class00780>)class03543.N((class03556[])new class03556[]{class041162.N(class04227.NA).y(class059463)})));
    }
}

