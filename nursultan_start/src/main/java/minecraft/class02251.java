/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class02530
 *  minecraft.class02545
 *  minecraft.class02555
 *  minecraft.class02625
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07314
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02055;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class02530;
import minecraft.class02545;
import minecraft.class02555;
import minecraft.class02625;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07314;

public interface class02251 {
    public static final class05946<class02530> N = class02251.N("mob_spawn_equipment");
    public static final class05946<class02530> y = class02251.N("pillager_spawn_crossbow");
    public static final class05946<class02530> L = class02251.N("raid/pillager_post_wave_3");
    public static final class05946<class02530> u = class02251.N("raid/pillager_post_wave_5");
    public static final class05946<class02530> i = class02251.N("raid/vindicator");
    public static final class05946<class02530> R = class02251.N("raid/vindicator_post_wave_5");
    public static final class05946<class02530> M = class02251.N("enderman_loot_drop");

    public static class05946<class02530> N(String string) {
        return class05946.N((class05946)class04227.yi, (class01894)class01894.y((String)string));
    }

    public static void N(class04116<class02530> class041162) {
        class02055 class020552 = class041162.N(class04227.yR);
        class041162.N(N, (Object)new class02545((class03543)class020552.y(class02625.E), 5, 17));
        class041162.N(y, (Object)new class02555((class03556)class020552.y(class07314.V), (class02142)class02151.N((int)1)));
        class041162.N(L, (Object)new class02555((class03556)class020552.y(class07314.K), (class02142)class02151.N((int)1)));
        class041162.N(u, (Object)new class02555((class03556)class020552.y(class07314.K), (class02142)class02151.N((int)2)));
        class041162.N(i, (Object)new class02555((class03556)class020552.y(class07314.m), (class02142)class02151.N((int)1)));
        class041162.N(R, (Object)new class02555((class03556)class020552.y(class07314.m), (class02142)class02151.N((int)2)));
        class041162.N(M, (Object)new class02555((class03556)class020552.y(class07314.t), (class02142)class02151.N((int)1)));
    }
}

