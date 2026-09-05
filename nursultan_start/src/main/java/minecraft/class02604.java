/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06521
 *  minecraft.class07329
 */
package minecraft;

import java.util.Iterator;
import minecraft.class02605;
import minecraft.class04995;
import minecraft.class06521;
import minecraft.class07329;

public interface class02604 {
    public static <T> void N(int n, int n2, class06521<?> class065212, Iterable<T> iterable, class02605<T> class026052) {
        if (class065212 instanceof class07329) {
            class07329 class073292 = (class07329)class065212;
            class02604.N(n, n2, class073292.M(), class073292.B(), iterable, class026052);
        } else {
            class02604.N(n, n2, n, n2, iterable, class026052);
        }
    }

    public static <T> void N(int n, int n2, int n3, int n4, Iterable<T> iterable, class02605<T> class026052) {
        Iterator<T> iterator = iterable.iterator();
        int n5 = 0;
        block0: for (int i = 0; i < n2; ++i) {
            boolean bl = (float)n4 < (float)n2 / 2.0f;
            int n6 = class04995.y((float)((float)n2 / 2.0f - (float)n4 / 2.0f));
            if (bl && n6 > i) {
                n5 += n;
                ++i;
            }
            for (int j = 0; j < n; ++j) {
                boolean bl2;
                if (!iterator.hasNext()) {
                    return;
                }
                bl = (float)n3 < (float)n / 2.0f;
                n6 = class04995.y((float)((float)n / 2.0f - (float)n3 / 2.0f));
                int n7 = n3;
                boolean bl3 = bl2 = j < n3;
                if (bl) {
                    n7 = n6 + n3;
                    boolean bl4 = bl2 = n6 <= j && j < n6 + n3;
                }
                if (bl2) {
                    class026052.addItemToSlot(iterator.next(), n5, j, i);
                } else if (n7 == j) {
                    n5 += n - j;
                    continue block0;
                }
                ++n5;
            }
        }
    }
}

