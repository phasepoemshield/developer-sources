/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11510
 *  Nursultan.class11512
 *  Nursultan.class11526
 *  Nursultan.class11536
 *  Nursultan.class11938
 *  Nursultan.class12018
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11510;
import Nursultan.class11512;
import Nursultan.class11526;
import Nursultan.class11536;
import Nursultan.class11938;
import Nursultan.class12018;
import Nursultan.class12020;
import java.util.Iterator;
import java.util.List;

public class class11539
extends class11526 {
    private void N(class11067 class110672, String string, List<String> list, List<class11510> list2) {
        int n = this.N(class110672.L(), string);
        if (n != 0) {
            list2.add(new class11510(list, (Object)class110672, n));
            return;
        }
        n = this.N(class110672.N(), string);
        if (n != 0) {
            list2.add(new class11510(list, (Object)class110672, n));
        }
    }

    public void N(String string, int n, List<class11510> list) {
        boolean bl;
        boolean bl2 = (n & 1) != 0;
        boolean bl3 = bl = (n & 2) != 0;
        if (!bl2 && !bl) {
            return;
        }
        for (class11067 class110672 : class11938.u().NN()) {
            String string2 = class12020.N((class12018)class110672.M().N());
            String string3 = class110672.L();
            if (bl2) {
                this.N(class110672, string, List.of(string2), list);
            }
            if (!bl) continue;
            this.N((class11512)class110672, string, List.of(string2, string3), list);
        }
    }

    private void N(class11512 class115122, String string, List<String> list, List<class11510> list2) {
        Iterator var5 = class115122.w().entrySet().iterator();
        while (var5.hasNext()) {
            class11536 var7 = (class11536)var5.next().getValue();
            var7.m();
            if (!var7.E()) {
                return;
            }
            String string2 = class12020.N((class12018)var7.P());
            int n = this.N(string2, string);
            if (n != 0) {
                list2.add(new class11510(list, (Object)var7, n));
            }
            this.N((class11512)var7, string, (List<String>)this.N(list, string2), list2);
        }
    }
}

