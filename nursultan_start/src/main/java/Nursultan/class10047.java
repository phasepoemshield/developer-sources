/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09908
 */
package Nursultan;

import Nursultan.class09908;
import Nursultan.class10019;
import Nursultan.class10021;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class class10047 {
    private class10047() {
    }

    private static boolean y(class10021 class100212) {
        return class10019.L(class100212) || !class100212.o().T();
    }

    public static List<class10021> N(class10021 class100213) {
        int n;
        int n2;
        if (class100213 == null || class100213.u() == 0) {
            return List.of();
        }
        int n3 = class100213.u();
        class09908 class099082 = class100213.q();
        if (class099082.N(n2 = class100213.Y(), n = class100213.Q(), n3)) {
            return class099082.N();
        }
        ArrayList<class10021> arrayList = new ArrayList<class10021>(n3);
        ArrayList<class10021> arrayList2 = new ArrayList<class10021>();
        for (int i = 0; i < n3; ++i) {
            class10021 class100214 = class100213.N(i);
            if (class10047.y(class100214)) {
                arrayList2.add(class100214);
                continue;
            }
            arrayList.add(class100214);
        }
        arrayList2.sort(Comparator.comparingInt(class100212 -> class100212.c().z()));
        ArrayList<class10021> arrayList3 = new ArrayList<class10021>(n3);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        class099082.N(arrayList3, n2, n, n3);
        return class099082.N();
    }
}

