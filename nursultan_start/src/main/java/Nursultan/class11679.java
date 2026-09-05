/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11297
 *  Nursultan.class11328
 *  Nursultan.class11535
 */
package Nursultan;

import Nursultan.class11297;
import Nursultan.class11328;
import Nursultan.class11535;
import java.util.Comparator;
import java.util.stream.Stream;

public class class11679
extends class11535 {
    public Object N_0;

    private void L() {
    }

    public class11679(String string, boolean bl, class11328 class113282) {
        super(string, bl);
        this.L();
        this.N_0 = class113282;
    }

    static {
        class11679.N();
    }

    private static void N() {
    }

    public int N(Stream<class11297> stream) {
        return stream.sorted(Comparator.comparingInt(class112972 -> class112972.N().I() ? 0 : 1)).filter(class112972 -> {
            this.L();
            return ((class11328)this.N_0).test((Object)class112972.N());
        }).map(class11297::y).findFirst().orElse(-1);
    }
}

