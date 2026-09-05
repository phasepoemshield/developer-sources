/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09553
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntRBTreeSet
 *  minecraft.class02033
 *  minecraft.class03047
 *  minecraft.class03407
 *  minecraft.class03412
 *  minecraft.class03926
 */
package minecraft;

import Nursultan.class09553;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class02033;
import minecraft.class03047;
import minecraft.class03407;
import minecraft.class03412;
import minecraft.class03926;

public class class03791 {
    final int N;
    private final List<class02033> y = new ArrayList<class02033>();

    public class03791(int n) {
        this.N = n;
    }

    public boolean y(class03926 class039262) {
        boolean bl = false;
        Iterator<class02033> var3 = this.y.iterator();
        while (var3.hasNext()) {
            class02033 class020332 = var3.next();
            if (!class020332.N(class039262)) continue;
            bl = true;
            if (!class020332.N()) continue;
            var3.remove();
        }
        return bl;
    }

    public boolean N() {
        return !this.y.isEmpty();
    }

    public void N(class03926 class039262) {
        this.y.add(new class02033(this, class039262));
    }

    public void N(class03407 class034072, IntCollection intCollection, class09553 class095532) {
        IntRBTreeSet intRBTreeSet = new IntRBTreeSet(intCollection);
        for (int i = intRBTreeSet.lastInt(); i >= class034072.N() && (this.N() || !intRBTreeSet.isEmpty()); --i) {
            class03047 class030472 = class034072.y(i);
            if (!(class030472 instanceof class03412)) continue;
            class03412 class034122 = (class03412)class030472;
            boolean bl = this.y(class034122.M());
            if (intRBTreeSet.remove(i)) {
                this.N(class034122.M());
                class095532.accept(i, class034122);
                continue;
            }
            if (!bl) continue;
            class095532.accept(i, class034122);
        }
    }
}

