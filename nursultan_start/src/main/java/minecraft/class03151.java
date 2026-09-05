/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01039
 *  minecraft.class01600
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04294
 *  minecraft.class04297
 *  minecraft.class04321
 *  minecraft.class04331
 *  minecraft.class04336
 *  minecraft.class05946
 */
package minecraft;

import java.util.List;
import minecraft.class01039;
import minecraft.class01600;
import minecraft.class02055;
import minecraft.class03157;
import minecraft.class03170;
import minecraft.class03529;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04294;
import minecraft.class04297;
import minecraft.class04321;
import minecraft.class04331;
import minecraft.class04336;
import minecraft.class05946;

public class class03151 {
    public static final class05946<class04336> N = class03170.N("seagrass_warm");
    public static final class05946<class04336> y = class03170.N("seagrass_normal");
    public static final class05946<class04336> L = class03170.N("seagrass_cold");
    public static final class05946<class04336> u = class03170.N("seagrass_river");
    public static final class05946<class04336> i = class03170.N("seagrass_swamp");
    public static final class05946<class04336> R = class03170.N("seagrass_deep_warm");
    public static final class05946<class04336> M = class03170.N("seagrass_deep");
    public static final class05946<class04336> B = class03170.N("seagrass_deep_cold");
    public static final class05946<class04336> Z = class03170.N("sea_pickle");
    public static final class05946<class04336> z = class03170.N("kelp_cold");
    public static final class05946<class04336> U = class03170.N("kelp_warm");
    public static final class05946<class04336> E = class03170.N("warm_ocean_vegetation");

    private static List<class04297> N(int n) {
        return List.of(class01039.y(), class03170.L, class04321.N((int)n), class04294.y());
    }

    public static void N(class04116<class04336> class041162) {
        class02055 class020552 = class041162.N(class04227.Nh);
        class03529 class035292 = class020552.y(class03157.N);
        class03529 class035293 = class020552.y(class03157.y);
        class03529 class035294 = class020552.y(class03157.L);
        class03529 class035295 = class020552.y(class03157.u);
        class03529 class035296 = class020552.y(class03157.i);
        class03529 class035297 = class020552.y(class03157.R);
        class03529 class035298 = class020552.y(class03157.M);
        class03170.N(class041162, N, class035292, class03151.N(80));
        class03170.N(class041162, y, class035292, class03151.N(48));
        class03170.N(class041162, L, class035292, class03151.N(32));
        class03170.N(class041162, u, class035293, class03151.N(48));
        class03170.N(class041162, i, class035294, class03151.N(64));
        class03170.N(class041162, R, class035295, class03151.N(80));
        class03170.N(class041162, M, class035295, class03151.N(48));
        class03170.N(class041162, B, class035295, class03151.N(40));
        class03170.N(class041162, Z, class035296, new class04297[]{class04331.N((int)16), class01039.y(), class03170.L, class04294.y()});
        class03170.N(class041162, z, class035297, new class04297[]{class01600.N((int)120, (double)80.0, (double)0.0), class01039.y(), class03170.L, class04294.y()});
        class03170.N(class041162, U, class035297, new class04297[]{class01600.N((int)80, (double)80.0, (double)0.0), class01039.y(), class03170.L, class04294.y()});
        class03170.N(class041162, E, class035298, new class04297[]{class01600.N((int)20, (double)400.0, (double)0.0), class01039.y(), class03170.L, class04294.y()});
    }
}

