/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00816
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class03543
 *  minecraft.class03648
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04398
 *  minecraft.class04748
 *  minecraft.class05946
 *  minecraft.class06953
 */
package minecraft;

import java.util.List;
import minecraft.class00816;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03543;
import minecraft.class03648;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04398;
import minecraft.class04748;
import minecraft.class05946;
import minecraft.class06953;
import minecraft.class08547;
import minecraft.class08556;
import minecraft.class08563;
import minecraft.class08585;

public interface class08574 {
    public static final class05946<class03648> N = class08574.N("tabby");
    public static final class05946<class03648> y = class08574.N("black");
    public static final class05946<class03648> L = class08574.N("red");
    public static final class05946<class03648> u = class08574.N("siamese");
    public static final class05946<class03648> i = class08574.N("british_shorthair");
    public static final class05946<class03648> R = class08574.N("calico");
    public static final class05946<class03648> M = class08574.N("persian");
    public static final class05946<class03648> B = class08574.N("ragdoll");
    public static final class05946<class03648> Z = class08574.N("white");
    public static final class05946<class03648> z = class08574.N("jellie");
    public static final class05946<class03648> U = class08574.N("all_black");

    private static class05946<class03648> N(String string) {
        return class05946.N((class05946)class04227.Nf, (class01894)class01894.y((String)string));
    }

    private static void N(class04116<class03648> class041162, class05946<class03648> class059462, String string, class08585 class085852) {
        class041162.N(class059462, (Object)new class03648(new class06953(class01894.y((String)string)), class085852));
    }

    private static void N(class04116<class03648> class041162, class05946<class03648> class059462, String string) {
        class08574.N(class041162, class059462, string, class08585.N(0));
    }

    public static void N(class04116<class03648> class041162) {
        class02055 class020552 = class041162.N(class04227.yj);
        class08574.N(class041162, N, "entity/cat/tabby");
        class08574.N(class041162, y, "entity/cat/black");
        class08574.N(class041162, L, "entity/cat/red");
        class08574.N(class041162, u, "entity/cat/siamese");
        class08574.N(class041162, i, "entity/cat/british_shorthair");
        class08574.N(class041162, R, "entity/cat/calico");
        class08574.N(class041162, M, "entity/cat/persian");
        class08574.N(class041162, B, "entity/cat/ragdoll");
        class08574.N(class041162, Z, "entity/cat/white");
        class08574.N(class041162, z, "entity/cat/jellie");
        class08574.N(class041162, U, "entity/cat/all_black", new class08585(List.of(new class08556(new class08547((class03543<class04748>)class020552.y(class04398.P)), 1), new class08556(new class08563(class00816.y((double)0.9)), 0))));
    }
}

