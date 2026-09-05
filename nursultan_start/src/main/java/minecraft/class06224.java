/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class03136
 *  minecraft.class03530
 *  minecraft.class04890
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class06391
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07235
 *  minecraft.class07290
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.function.Predicate;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class03136;
import minecraft.class03530;
import minecraft.class04890;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06273;
import minecraft.class06391;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07235;
import minecraft.class07290;
import minecraft.class07536;
import org.slf4j.Logger;

public class class06224
extends class06391<class06225> {
    public static Object NE_0;
    public static Object NE_1;
    public static Object NE_2;

    public class06224(Codec<class06225> codec) {
        super(codec);
    }

    static {
        class06224.i();
        NE_0 = LogUtils.getLogger();
        NE_1 = new class07078[]{class07078.ym, class07078.yx, class07078.yx, class07078.yG};
        NE_2 = class00869.mr.W();
    }

    private static void i() {
        NE_0 = null;
        NE_1 = null;
        NE_2 = null;
    }

    public boolean N(class06058<class06225> class060582) {
        class07209 class072092;
        int n;
        int n2;
        int n3;
        Predicate var2 = class06391.N((class03530)class01210.Lu);
        class07209 class072093 = class060582.i();
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        int n4 = 3;
        int n5 = class060692.y(2) + 2;
        int n6 = -n5 - 1;
        int n7 = n5 + 1;
        int n8 = -1;
        int n9 = 4;
        int n10 = class060692.y(2) + 2;
        int n11 = -n10 - 1;
        int n12 = n10 + 1;
        int n13 = 0;
        for (n3 = n6; n3 <= n7; ++n3) {
            for (n2 = -1; n2 <= 4; ++n2) {
                for (n = n11; n <= n12; ++n) {
                    class072092 = class072093.method_10069(n3, n2, n);
                    boolean bl = class059742.method_8320(class072092).B();
                    if (n2 == -1 && !bl) {
                        return false;
                    }
                    if (n2 == 4 && !bl) {
                        return false;
                    }
                    if (n3 != n6 && n3 != n7 && n != n11 && n != n12 || n2 != 0 || !class059742.R(class072092) || !class059742.R(class072092.method_10084())) continue;
                    ++n13;
                }
            }
        }
        if (n13 < 1 || n13 > 5) {
            return false;
        }
        for (n3 = n6; n3 <= n7; ++n3) {
            for (n2 = 3; n2 >= -1; --n2) {
                for (n = n11; n <= n12; ++n) {
                    class072092 = class072093.method_10069(n3, n2, n);
                    class00500 class005002 = class059742.method_8320(class072092);
                    if (n3 == n6 || n2 == -1 || n == n11 || n3 == n7 || n2 == 4 || n == n12) {
                        if (class072092.method_10264() >= class059742.method_31607() && !class059742.method_8320(class072092.method_10074()).B()) {
                            class059742.method_8652(class072092, (class00500)NE_2, 2);
                            continue;
                        }
                        if (!class005002.B() || class005002.N(class00869.LA)) continue;
                        if (n2 == -1 && class060692.y(4) != 0) {
                            this.N(class059742, class072092, class00869.LK.W(), var2);
                            continue;
                        }
                        this.N(class059742, class072092, class00869.W.W(), var2);
                        continue;
                    }
                    if (class005002.N(class00869.LA) || class005002.N(class00869.La)) continue;
                    this.N(class059742, class072092, (class00500)NE_2, var2);
                }
            }
        }
        block6: for (n3 = 0; n3 < 2; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                int n14;
                int n15;
                n = class072093.method_10263() + class060692.y(n5 * 2 + 1) - n5;
                class07209 class072094 = new class07209(n, n15 = class072093.method_10264(), n14 = class072093.method_10260() + class060692.y(n10 * 2 + 1) - n10);
                if (!class059742.R(class072094)) continue;
                int n16 = 0;
                for (class07211 class072112 : class07221.field_11062) {
                    if (!class059742.method_8320(class072094.method_10093(class072112)).B()) continue;
                    ++n16;
                }
                if (n16 != 1) continue;
                this.N(class059742, class072094, class04890.N((class07290)class059742, (class07209)class072094, (class00500)class00869.LA.W()), var2);
                class03136.N((class07290)class059742, (class06069)class060692, (class07209)class072094, (class05946)class06273.L);
                continue block6;
            }
        }
        this.N(class059742, class072093, class00869.La.W(), var2);
        class00394 class003942 = class059742.method_8321(class072093);
        if (class003942 instanceof class07235) {
            class07235 class072352 = (class07235)class003942;
            class072352.N(this.N(class060692), class060692);
        } else {
            ((Logger)NE_0).error("Failed to fetch mob spawner entity at ({}, {}, {})", new Object[]{class072093.method_10263(), class072093.method_10264(), class072093.method_10260()});
        }
        return true;
    }

    private class07078<?> N(class06069 class060692) {
        return (class07078)class07536.N((Object[])((class07078[])NE_1), (class06069)class060692);
    }
}

