/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class03860
 *  minecraft.class05163
 *  minecraft.class06069
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class03860;
import minecraft.class04890;
import minecraft.class04896;
import minecraft.class04898;
import minecraft.class04899;
import minecraft.class04904;
import minecraft.class04905;
import minecraft.class04908;
import minecraft.class04913;
import minecraft.class04916;
import minecraft.class04918;
import minecraft.class04921;
import minecraft.class04925;
import minecraft.class04926;
import minecraft.class04928;
import minecraft.class04929;
import minecraft.class04931;
import minecraft.class04934;
import minecraft.class04936;
import minecraft.class04937;
import minecraft.class05163;
import minecraft.class06069;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

public class class04933 {
    private static final int u = 3;
    private static final int i = 3;
    private static final int R = 50;
    private static final int M = 10;
    private static final boolean B = true;
    public static final int N = 64;
    private static final class04918[] Z = new class04918[]{new class04918(class04899.class, 40, 0), new class04918(class04925.class, 5, 5), new class04918(class04896.class, 20, 0), new class04918(class04913.class, 20, 0), new class04918(class04905.class, 10, 6), new class04918(class04929.class, 5, 5), new class04918(class04921.class, 5, 5), new class04918(class04934.class, 5, 4), new class04918(class04936.class, 5, 4), new class04908(class04926.class, 10, 2), new class04916(class04937.class, 20, 1)};
    private static List<class04918> z;
    static @Nullable Class<? extends class04931> y;
    private static int U;
    static final class04904 L;

    static {
        L = new class04904();
    }

    private static @Nullable class04931 y(class04898 class048982, class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        if (!class04933.y()) {
            return null;
        }
        if (y != null) {
            class04931 class049312 = class04933.N(y, class038602, class060692, n, n2, n3, class072112, n4);
            y = null;
            if (class049312 != null) {
                return class049312;
            }
        }
        int n5 = 0;
        block0: while (n5 < 5) {
            ++n5;
            int n6 = class060692.y(U);
            for (class04918 class049182 : z) {
                if ((n6 -= class049182.y) >= 0) continue;
                if (!class049182.N(n4) || class049182 == class048982.N) continue block0;
                class04931 class049313 = class04933.N(class049182.N, class038602, class060692, n, n2, n3, class072112, n4);
                if (class049313 == null) continue;
                ++class049182.L;
                class048982.N = class049182;
                if (!class049182.N()) {
                    z.remove(class049182);
                }
                return class049313;
            }
        }
        class05163 class051632 = class04928.N(class038602, class060692, n, n2, n3, class072112);
        if (class051632 != null && class051632.Z() > 1) {
            return new class04928(n4, class051632, class072112);
        }
        return null;
    }

    private static boolean y() {
        boolean bl = false;
        U = 0;
        for (class04918 class049182 : z) {
            if (class049182.u > 0 && class049182.L < class049182.u) {
                bl = true;
            }
            U += class049182.y;
        }
        return bl;
    }

    private static @Nullable class04931 N(Class<? extends class04931> clazz, class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class04931 class049312 = null;
        if (clazz == class04899.class) {
            class049312 = class04899.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04925.class) {
            class049312 = class04925.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04896.class) {
            class049312 = class04896.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04913.class) {
            class049312 = class04913.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04905.class) {
            class049312 = class04905.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04929.class) {
            class049312 = class04929.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04921.class) {
            class049312 = class04921.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04934.class) {
            class049312 = class04934.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04936.class) {
            class049312 = class04936.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04926.class) {
            class049312 = class04926.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (clazz == class04937.class) {
            class049312 = class04937.N(class038602, n, n2, n3, class072112, n4);
        }
        return class049312;
    }

    static @Nullable class04890 N(class04898 class048982, class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        if (n4 > 50) {
            return null;
        }
        if (Math.abs(n - class048982.L().B()) > 112 || Math.abs(n3 - class048982.L().z()) > 112) {
            return null;
        }
        class04931 class049312 = class04933.y(class048982, class038602, class060692, n, n2, n3, class072112, n4 + 1);
        if (class049312 != null) {
            class038602.N((class04890)class049312);
            class048982.L.add(class049312);
        }
        return class049312;
    }

    public static void N() {
        z = Lists.newArrayList();
        for (class04918 class049182 : Z) {
            class049182.L = 0;
            z.add(class049182);
        }
        y = null;
    }
}

