/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11882
 *  Nursultan.class11938
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class11510;
import Nursultan.class11526;
import Nursultan.class11882;
import Nursultan.class11938;
import Nursultan.class12020;
import java.util.List;

public class class11513
extends class11526 {
    @Override
    public void N(String string, int n, List<class11510> list) {
        if ((n & 8) == 0) {
            return;
        }
        for (class11882 class118822 : class11938.n().y().values()) {
            int n2 = this.N(class118822.y(), string);
            if (n2 == 0) continue;
            list.add(new class11510(List.of(class12020.N((String)class118822.i().N())), class118822, n2));
        }
    }
}

