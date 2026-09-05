/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import minecraft.class00780;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03562;
import minecraft.class03573;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05946;

public class class03565 {
    public static final class05946<class03573> N = class03565.N("nether");
    public static final class05946<class03573> y = class03565.N("overworld");

    public static void N(class04116<class03573> class041162) {
        class02055 class020552 = class041162.N(class04227.NA);
        class041162.N(N, (Object)new class03573(class03562.y, (class02055<class00780>)class020552));
        class041162.N(y, (Object)new class03573(class03562.L, (class02055<class00780>)class020552));
    }

    private static class05946<class03573> N(String string) {
        return class05946.N((class05946)class04227.yU, (class01894)class01894.y((String)string));
    }
}

