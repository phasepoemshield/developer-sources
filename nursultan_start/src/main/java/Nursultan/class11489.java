/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09250
 *  Nursultan.class11938
 *  Nursultan.class12018
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09250;
import Nursultan.class11510;
import Nursultan.class11526;
import Nursultan.class11938;
import Nursultan.class12018;
import Nursultan.class12020;
import java.util.List;

public class class11489
extends class11526 {
    private static String[] L;
    public static Object N_0;

    static {
        class11489.i();
        class11489.N();
        N_0 = new class12018(L[0]);
    }

    private static void i() {
        L = new String[1];
        class11489.L[0] = "category.accounts";
    }

    @Override
    public void N(String string, int n, List<class11510> list) {
        if ((n & 0x10) == 0) {
            return;
        }
        List<String> list2 = List.of(class12020.N((class12018)((class12018)N_0)));
        for (class09250 class092502 : class11938.s().u()) {
            int n2 = this.N(class092502.u(), string);
            if (n2 == 0) continue;
            list.add(new class11510(list2, class092502, n2));
        }
    }

    private static void N() {
    }
}

