/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05216
 *  minecraft.class05946
 *  minecraft.class07536
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04449;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05216;
import minecraft.class05946;
import minecraft.class07536;

public interface class04460 {
    public static final int N = 256;
    public static final float y = 7.0f;
    public static final class05946<class04449> L = class04460.N("ponder_goat_horn");
    public static final class05946<class04449> u = class04460.N("sing_goat_horn");
    public static final class05946<class04449> i = class04460.N("seek_goat_horn");
    public static final class05946<class04449> R = class04460.N("feel_goat_horn");
    public static final class05946<class04449> M = class04460.N("admire_goat_horn");
    public static final class05946<class04449> B = class04460.N("call_goat_horn");
    public static final class05946<class04449> Z = class04460.N("yearn_goat_horn");
    public static final class05946<class04449> z = class04460.N("dream_goat_horn");

    private static class05946<class04449> N(String string) {
        return class05946.N((class05946)class04227.yZ, (class01894)class01894.y((String)string));
    }

    public static void N(class04116<class04449> class041162, class05946<class04449> class059462, class03556<class04891> class035562, float f, float f2) {
        class05216 class052162 = class00392.L((String)class07536.N((String)"instrument", (class01894)class059462.N()));
        class041162.N(class059462, (Object)new class04449(class035562, f, f2, (class00392)class052162));
    }

    public static void N(class04116<class04449> class041162) {
        class04460.N(class041162, L, (class03556<class04891>)((class03556)class04909.PO.get(0)), 7.0f, 256.0f);
        class04460.N(class041162, u, (class03556<class04891>)((class03556)class04909.PO.get(1)), 7.0f, 256.0f);
        class04460.N(class041162, i, (class03556<class04891>)((class03556)class04909.PO.get(2)), 7.0f, 256.0f);
        class04460.N(class041162, R, (class03556<class04891>)((class03556)class04909.PO.get(3)), 7.0f, 256.0f);
        class04460.N(class041162, M, (class03556<class04891>)((class03556)class04909.PO.get(4)), 7.0f, 256.0f);
        class04460.N(class041162, B, (class03556<class04891>)((class03556)class04909.PO.get(5)), 7.0f, 256.0f);
        class04460.N(class041162, Z, (class03556<class04891>)((class03556)class04909.PO.get(6)), 7.0f, 256.0f);
        class04460.N(class041162, z, (class03556<class04891>)((class03556)class04909.PO.get(7)), 7.0f, 256.0f);
    }
}

