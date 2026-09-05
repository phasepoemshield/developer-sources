/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01339
 *  minecraft.class02256
 *  minecraft.class04336
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01339;
import minecraft.class02256;
import minecraft.class04336;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class08088;

public class class02616
extends class06391<class02256> {
    public class02616(Codec<class02256> codec) {
        super(codec);
    }

    protected boolean N(class05974 class059742, class02256 class022562, Predicate<class00500> predicate, class06069 class060692, class07218 class072182, int n) {
        for (int i = 0; i < n; ++i) {
            class00500 class005002;
            class00500 class005003 = class022562.L.N(class060692, (class07209)class072182);
            if (class005003.N((class005002 = class059742.method_8320((class07209)class072182)).i())) continue;
            if (!predicate.test(class005002)) {
                return i != 0;
            }
            class059742.method_8652((class07209)class072182, class005003, 2);
            class072182.N(class022562.i.N());
        }
        return true;
    }

    protected boolean N(class05974 class059742, class02256 class022562, class08088 class080882, class06069 class060692, class07209 class072092) {
        return ((class04336)class022562.u.N()).N(class059742, class080882, class060692, class072092.method_10093(class022562.i.N().b()));
    }

    protected void N(class06058<class02256> class060582, class05974 class059742, class02256 class022562, class06069 class060692, Set<class07209> set, int n, int n2) {
        for (class07209 class072092 : set) {
            if (!(class022562.z > 0.0f) || !(class060692.z() < class022562.z)) continue;
            this.N(class059742, class022562, class060582.L(), class060692, class072092);
        }
    }

    protected Set<class07209> N(class05974 class059742, class02256 class022562, class06069 class060692, class07209 class072092, Predicate<class00500> predicate, int n, int n2) {
        class07218 class072182 = class072092.method_25503();
        class07218 class072183 = class072182.method_25503();
        class07211 class072112 = class022562.i.N();
        class07211 class072113 = class072112.b();
        HashSet<class07209> hashSet = new HashSet<class07209>();
        for (int i = -n; i <= n; ++i) {
            boolean bl = i == -n || i == n;
            for (int j = -n2; j <= n2; ++j) {
                int n3;
                boolean bl2;
                boolean bl3 = j == -n2 || j == n2;
                boolean bl4 = bl || bl3;
                boolean bl5 = bl && bl3;
                boolean bl6 = bl2 = bl4 && !bl5;
                if (bl5 || bl2 && (class022562.E == 0.0f || class060692.z() > class022562.E)) continue;
                class072182.N((class00753)class072092, i, 0, j);
                for (n3 = 0; class059742.method_16358((class07209)class072182, class01339::P) && n3 < class022562.Z; ++n3) {
                    class072182.N(class072112);
                }
                for (n3 = 0; class059742.method_16358((class07209)class072182, class005002 -> !class005002.P()) && n3 < class022562.Z; ++n3) {
                    class072182.N(class072113);
                }
                class072183.N((class00753)class072182, class022562.i.N());
                class00500 class005003 = class059742.method_8320((class07209)class072183);
                if (!class059742.R((class07209)class072182) || !class005003.L((class07290)class059742, (class07209)class072183, class022562.i.N().b())) continue;
                int n4 = class022562.M.N(class060692) + (class022562.B > 0.0f && class060692.z() < class022562.B ? 1 : 0);
                class07209 class072093 = class072183.method_10062();
                if (!this.N(class059742, class022562, predicate, class060692, class072183, n4)) continue;
                hashSet.add(class072093);
            }
        }
        return hashSet;
    }

    public boolean N(class06058<class02256> class060582) {
        class05974 class059742 = class060582.y();
        class02256 class022562 = (class02256)class060582.R();
        class06069 class060692 = class060582.u();
        class07209 class072092 = class060582.i();
        Predicate<class00500> predicate = class005002 -> class005002.N(class022562.y);
        int n = class022562.U.N(class060692) + 1;
        int n2 = class022562.U.N(class060692) + 1;
        Set<class07209> var9 = this.N(class059742, class022562, class060692, class072092, predicate, n, n2);
        this.N(class060582, class059742, class022562, class060692, var9, n, n2);
        return !var9.isEmpty();
    }
}

