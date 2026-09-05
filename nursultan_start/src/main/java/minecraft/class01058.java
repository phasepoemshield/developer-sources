/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00676
 *  minecraft.class00756
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class04685
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06391
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07100
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.concurrent.TimeUnit;
import minecraft.class00500;
import minecraft.class00676;
import minecraft.class00756;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01052;
import minecraft.class01076;
import minecraft.class04685;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06391;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07100;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;

public class class01058
extends class06391<class04685> {
    public static final int NE = 10;
    private static final int NW = 42;
    private static final LoadingCache<Long, List<class01076>> Nm = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build((CacheLoader)new class01052());

    public class01058(Codec<class04685> codec) {
        super(codec);
    }

    public static List<class01076> N(class05974 class059742) {
        long l = class06069.y((long)class059742.method_8412()).B() & 0xFFFFL;
        return (List)Nm.getUnchecked((Object)l);
    }

    private void N(class01001 class010012, class06069 class060692, class04685 class046852, class01076 class010762) {
        class00676 class006762;
        int n = class010762.L();
        for (class07209 class072092 : class07209.method_10097((class07209)new class07209(class010762.N() - n, class010012.method_31607(), class010762.y() - n), (class07209)new class07209(class010762.N() + n, class010762.u() + 10, class010762.y() + n))) {
            if (class072092.method_40081((double)class010762.N(), (double)class072092.method_10264(), (double)class010762.y()) <= (double)(n * n + 1) && class072092.method_10264() < class010762.u()) {
                this.N((class00807)class010012, class072092, class00869.LV.W());
                continue;
            }
            if (class072092.method_10264() <= 65) continue;
            this.N((class00807)class010012, class072092, class00869.N.W());
        }
        if (class010762.i()) {
            int n2 = -2;
            int n3 = 2;
            int n4 = 3;
            class07218 class072182 = new class07218();
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    for (int k = 0; k <= 3; ++k) {
                        boolean bl;
                        boolean bl2 = class04995.N((int)i) == 2;
                        boolean bl3 = class04995.N((int)j) == 2;
                        boolean bl4 = bl = k == 3;
                        if (!bl2 && !bl3 && !bl) continue;
                        boolean bl5 = i == -2 || i == 2 || bl;
                        boolean bl6 = j == -2 || j == 2 || bl;
                        class00500 class005002 = (class00500)((class00500)((class00500)((class00500)class00869.RQ.W().y((class08092)class07100.y, (Comparable)Boolean.valueOf(bl5 && j != -2))).y((class08092)class07100.u, (Comparable)Boolean.valueOf(bl5 && j != 2))).y((class08092)class07100.i, (Comparable)Boolean.valueOf(bl6 && i != -2))).y((class08092)class07100.L, (Comparable)Boolean.valueOf(bl6 && i != 2));
                        this.N((class00807)class010012, (class07209)class072182.N(class010762.N() + i, class010762.u() + k, class010762.y() + j), class005002);
                    }
                }
            }
        }
        if ((class006762 = (class00676)class07078.S.N((class07299)class010012.method_8410(), class06113.field_16474)) != null) {
            class006762.N(class046852.L());
            class006762.method_5684(class046852.N());
            class006762.method_5808((double)class010762.N() + 0.5, (double)(class010762.u() + 1), (double)class010762.y() + 0.5, class060692.z() * 360.0f, 0.0f);
            class010012.method_8649((class07049)class006762);
            class07209 class072093 = class006762.method_24515();
            this.N((class00807)class010012, class072093.method_10074(), class00869.q.W());
            this.N((class00807)class010012, class072093, class00756.y((class07290)class010012, (class07209)class072093));
        }
    }

    public boolean N(class06058<class04685> class060582) {
        class04685 class046852 = (class04685)class060582.R();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class07209 class072092 = class060582.i();
        List<class01076> var6 = class046852.y();
        if (var6.isEmpty()) {
            var6 = class01058.N(class059742);
        }
        for (class01076 class010762 : var6) {
            if (!class010762.N(class072092)) continue;
            this.N((class01001)class059742, class060692, class046852, class010762);
        }
        return true;
    }
}

