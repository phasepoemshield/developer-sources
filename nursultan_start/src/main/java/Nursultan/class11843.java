/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11438
 *  Nursultan.class11448
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package Nursultan;

import Nursultan.class11438;
import Nursultan.class11448;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class class11843 {
    public Object N_0;

    private void L() {
    }

    public class11843() {
        this.L();
        this.N_0 = new Int2ObjectOpenHashMap();
        this.N(0, (class11448)new class11438());
    }

    public class11448 N(int n) {
        return (class11448)((Int2ObjectOpenHashMap)this.N_0).get(n);
    }

    public void N(int n, class11448 class114482) {
        ((Int2ObjectOpenHashMap)this.N_0).put(n, (Object)class114482);
    }
}

