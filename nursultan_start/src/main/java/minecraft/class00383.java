/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00630
 *  minecraft.class00631
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00630;
import minecraft.class00631;

public class class00383
extends AbstractDoubleList
implements class00630 {
    private final DoubleList N;
    private final DoubleList y;
    private final boolean L;

    public class00383(DoubleList doubleList, DoubleList doubleList2, boolean bl) {
        this.N = doubleList;
        this.y = doubleList2;
        this.L = bl;
    }

    public int size() {
        return this.N.size() + this.y.size();
    }

    public double getDouble(int n) {
        if (n < this.N.size()) {
            return this.N.getDouble(n);
        }
        return this.y.getDouble(n - this.N.size());
    }

    private boolean N(class00631 class006312) {
        int n;
        int n2 = this.N.size();
        for (n = 0; n < n2; ++n) {
            if (class006312.merge(n, -1, n)) continue;
            return false;
        }
        n = this.y.size() - 1;
        for (int i = 0; i < n; ++i) {
            if (class006312.merge(n2 - 1, i, n2 + i)) continue;
            return false;
        }
        return true;
    }

    public boolean method_1065(class00631 class006312) {
        if (this.L) {
            return this.N((n, n2, n3) -> class006312.merge(n2, n, n3));
        }
        return this.N(class006312);
    }

    public DoubleList method_1066() {
        return this;
    }
}

