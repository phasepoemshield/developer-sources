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
 *  minecraft.class07582
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
import minecraft.class07582;
import minecraft.class07589;
import minecraft.class08545;
import minecraft.class08558;
import minecraft.class08561;
import minecraft.class08568;
import minecraft.class08585;

public class class07597 {
    public static final class05946<class07589> N = class07597.N(class08558.N);
    public static final class05946<class07589> y = class07597.N(class08558.y);
    public static final class05946<class07589> L = N;

    private static void N(class04116<class07589> class041162, class05946<class07589> class059462, class07582 class075822, String string, class03530<class00780> class035302) {
        class03552 class035522 = class041162.N(class04227.NA).y(class035302);
        class07597.N(class041162, class059462, class075822, string, class08585.N((class08568)new class08561((class03543)class035522), (int)1));
    }

    private static void N(class04116<class07589> class041162, class05946<class07589> class059462, class07582 class075822, String string, class08585 class085852) {
        class01894 class018942 = class01894.y((String)("entity/nautilus/" + string));
        class041162.N(class059462, (Object)new class07589((class08545<class07582>)new class08545((Object)class075822, class018942), class085852));
    }

    private static class05946<class07589> N(class01894 class018942) {
        return class05946.N((class05946)class04227.Nx, (class01894)class018942);
    }

    public static void N(class04116<class07589> class041162) {
        class07597.N(class041162, N, class07582.field_64365, "zombie_nautilus", class08585.N((int)0));
        class07597.N(class041162, y, class07582.field_64366, "zombie_nautilus_coral", (class03530<class00780>)class03557.Ns);
    }
}

