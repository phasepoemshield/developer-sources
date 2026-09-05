/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 *  Nursultan.class11410
 *  Nursultan.class11951
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class11410;
import Nursultan.class11951;
import java.util.function.Supplier;

public class class11850 {
    public Object N_0;

    private void L() {
    }

    public class11850(Supplier<class11410> supplier) {
        this.L();
        this.N_0 = supplier;
    }

    public void N(class11951<class09276> class119512) {
        class11410 class114102 = (class11410)((Supplier)this.N_0).get();
        if (class114102 != null && class114102.y()) {
            class114102.N(class119512);
        }
    }
}

