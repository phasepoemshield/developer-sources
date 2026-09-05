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
 *  minecraft.class04068
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06953
 */
package minecraft;

import minecraft.class00780;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03552;
import minecraft.class03557;
import minecraft.class04068;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06953;
import minecraft.class08558;
import minecraft.class08561;
import minecraft.class08585;

public interface class08553 {
    public static final class05946<class04068> N = class08553.N(class08558.N);
    public static final class05946<class04068> y = class08553.N(class08558.y);
    public static final class05946<class04068> L = class08553.N(class08558.L);

    private static class05946<class04068> N(class01894 class018942) {
        return class05946.N((class05946)class04227.yB, (class01894)class018942);
    }

    private static void N(class04116<class04068> class041162, class05946<class04068> class059462, String string, class08585 class085852) {
        class041162.N(class059462, (Object)new class04068(new class06953(class01894.y((String)string)), class085852));
    }

    private static void N(class04116<class04068> class041162, class05946<class04068> class059462, String string, class03530<class00780> class035302) {
        class03552 class035522 = class041162.N(class04227.NA).y(class035302);
        class08553.N(class041162, class059462, string, class08585.N(new class08561((class03543<class00780>)class035522), 1));
    }

    public static void N(class04116<class04068> class041162) {
        class08553.N(class041162, N, "entity/frog/temperate_frog", class08585.N(0));
        class08553.N(class041162, y, "entity/frog/warm_frog", (class03530<class00780>)class03557.Ni);
        class08553.N(class041162, L, "entity/frog/cold_frog", (class03530<class00780>)class03557.Nu);
    }
}

