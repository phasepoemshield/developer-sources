/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09432
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07218
 *  minecraft.class07290
 */
package minecraft;

import Nursultan.class09432;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01009;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07218;
import minecraft.class07290;

public class class01008 {
    public static Optional<class07209> N(class07290 class072902, class07209 class072092, class00891 class008912, class07211 class072112, class00891 class008913) {
        class00500 class005002;
        class07218 class072182 = class072092.method_25503();
        do {
            class072182.N(class072112);
        } while ((class005002 = class072902.method_8320((class07209)class072182)).N(class008912));
        if (class005002.N(class008913)) {
            return Optional.of(class072182);
        }
        return Optional.empty();
    }

    static Pair<class09432, Integer> N(int[] nArray) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        IntArrayList intArrayList = new IntArrayList();
        intArrayList.push(0);
        for (int i = 1; i <= nArray.length; ++i) {
            int n4;
            int n5 = n4 = i == nArray.length ? 0 : nArray[i];
            while (!intArrayList.isEmpty()) {
                int n6 = nArray[intArrayList.topInt()];
                if (n4 >= n6) {
                    intArrayList.push(i);
                    break;
                }
                intArrayList.popInt();
                int n7 = intArrayList.isEmpty() ? 0 : intArrayList.topInt() + 1;
                if (n6 * (i - n7) <= n3 * (n2 - n)) continue;
                n2 = i;
                n = n7;
                n3 = n6;
            }
            if (!intArrayList.isEmpty()) continue;
            intArrayList.push(i);
        }
        return new Pair((Object)new class09432(n, n2 - 1), (Object)n3);
    }

    private static int N(Predicate<class07209> predicate, class07218 class072182, class07211 class072112, int n) {
        int n2;
        for (n2 = 0; n2 < n && predicate.test((class07209)class072182.N(class072112)); ++n2) {
        }
        return n2;
    }

    public static class01009 N(class07209 class072092, class07185 class071852, int n, class07185 class071853, int n2, Predicate<class07209> predicate) {
        class09432 class094322;
        int n3;
        class07218 class072182 = class072092.method_25503();
        class07211 class072112 = class07211.N((class07212)class07212.field_11060, (class07185)class071852);
        class07211 class072113 = class072112.b();
        class07211 class072114 = class07211.N((class07212)class07212.field_11060, (class07185)class071853);
        class07211 class072115 = class072114.b();
        int n4 = class01008.N(predicate, class072182.N((class00753)class072092), class072112, n);
        int n5 = class01008.N(predicate, class072182.N((class00753)class072092), class072113, n);
        int n6 = n4;
        class09432[] class09432Array = new class09432[n6 + 1 + n5];
        class09432Array[n6] = new class09432(class01008.N(predicate, class072182.N((class00753)class072092), class072114, n2), class01008.N(predicate, class072182.N((class00753)class072092), class072115, n2));
        int n7 = class09432Array[n6].N;
        for (n3 = 1; n3 <= n4; ++n3) {
            class094322 = class09432Array[n6 - (n3 - 1)];
            class09432Array[n6 - n3] = new class09432(class01008.N(predicate, class072182.N((class00753)class072092).N(class072112, n3), class072114, class094322.N), class01008.N(predicate, class072182.N((class00753)class072092).N(class072112, n3), class072115, class094322.y));
        }
        for (n3 = 1; n3 <= n5; ++n3) {
            class094322 = class09432Array[n6 + n3 - 1];
            class09432Array[n6 + n3] = new class09432(class01008.N(predicate, class072182.N((class00753)class072092).N(class072113, n3), class072114, class094322.N), class01008.N(predicate, class072182.N((class00753)class072092).N(class072113, n3), class072115, class094322.y));
        }
        n3 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int[] nArray = new int[class09432Array.length];
        for (int i = n7; i >= 0; --i) {
            int n11;
            int n12;
            class09432 class094323;
            for (int j = 0; j < class09432Array.length; ++j) {
                class094323 = class09432Array[j];
                n12 = n7 - class094323.N;
                n11 = n7 + class094323.y;
                nArray[j] = i >= n12 && i <= n11 ? n11 + 1 - i : 0;
            }
            Pair<class09432, Integer> var22 = class01008.N(nArray);
            class094323 = (class09432)var22.getFirst();
            n12 = 1 + class094323.y - class094323.N;
            n11 = (Integer)var22.getSecond();
            if (n12 * n11 <= n9 * n10) continue;
            n3 = class094323.N;
            n8 = i;
            n9 = n12;
            n10 = n11;
        }
        return new class01009(class072092.method_30513(class071852, n3 - n6).method_30513(class071853, n8 - n7), n9, n10);
    }
}

