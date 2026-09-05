/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11290
 *  Nursultan.class11296
 *  Nursultan.class11938
 *  Nursultan.class12018
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class11290;
import Nursultan.class11296;
import Nursultan.class11510;
import Nursultan.class11526;
import Nursultan.class11938;
import Nursultan.class12018;
import Nursultan.class12020;
import java.util.List;

public class class11508
extends class11526 {
    private static String[] L;
    public static Object N_0;

    private static void L() {
    }

    static {
        class11508.i();
        class11508.L();
        N_0 = new class12018(L[0]);
    }

    private static void i() {
        L = new String[1];
        class11508.L[0] = "category.configs";
    }

    @Override
    public void N(String string, int n, List<class11510> list) {
        if ((n & 4) == 0) {
            return;
        }
        List<String> list2 = List.of(class12020.N((class12018)((class12018)N_0)));
        for (class11290 class112902 : class11938.G().L()) {
            int n2;
            int n3;
            int n4;
            if (class112902.M() == class11296.DELETING || (n4 = Math.max(n3 = this.N(class112902.i(), string), n2 = this.N(class112902.z(), string))) == 0) continue;
            list.add(new class11510(list2, class112902, n4));
        }
    }
}

