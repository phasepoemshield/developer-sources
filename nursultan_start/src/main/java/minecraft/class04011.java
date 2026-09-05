/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class04000;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;

public class class04011 {
    public static <T extends class07079> Optional<T> N(class07078<T> class070782, class06113 class061132, class04782 class047822, class07209 class072092, int n, int n2, int n3, class04000 class040002, boolean bl) {
        class07218 class072182 = class072092.method_25503();
        for (int i = 0; i < n; ++i) {
            class07079 class070792;
            int n4 = class04995.y((class06069)class047822.field_9229, (int)(-n2), (int)n2);
            int n5 = class04995.y((class06069)class047822.field_9229, (int)(-n2), (int)n2);
            class072182.N((class00753)class072092, n4, n3, n5);
            if (!class047822.method_8621().N((class07209)class072182) || !class04011.N(class047822, n3, class072182, class040002) || bl && !class047822.y(class070782.N((double)class072182.method_10263() + 0.5, (double)class072182.method_10264(), (double)class072182.method_10260() + 0.5)) || (class070792 = (class07079)class070782.y(class047822, null, (class07209)class072182, class061132, false, false)) == null) continue;
            if (class070792.N((class07284)class047822, class061132) && class070792.N((class05487)class047822)) {
                class047822.y((class07049)class070792);
                class070792.D();
                return Optional.of(class070792);
            }
            class070792.method_31472();
        }
        return Optional.empty();
    }

    private static boolean N(class04782 class047822, int n, class07218 class072182, class04000 class040002) {
        class07218 class072183 = new class07218().N((class00753)class072182);
        class00500 class005002 = class047822.method_8320((class07209)class072183);
        for (int i = n; i >= -n; --i) {
            class072182.N(class07211.field_11033);
            class072183.N((class00753)class072182, class07211.field_11036);
            class00500 class005003 = class047822.method_8320((class07209)class072182);
            if (class040002.canSpawnOn(class047822, (class07209)class072182, class005003, (class07209)class072183, class005002)) {
                class072182.N(class07211.field_11036);
                return true;
            }
            class005002 = class005003;
        }
        return false;
    }
}

