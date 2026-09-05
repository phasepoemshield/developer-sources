/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00630
 *  minecraft.class00631
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00630;
import minecraft.class00631;

public class class07708
implements class00630 {
    private final DoubleList N;

    public class07708(DoubleList doubleList) {
        this.N = doubleList;
    }

    public int size() {
        return this.N.size();
    }

    public boolean method_1065(class00631 class006312) {
        int n = this.N.size() - 1;
        for (int i = 0; i < n; ++i) {
            if (class006312.merge(i, i, i)) continue;
            return false;
        }
        return true;
    }

    public DoubleList method_1066() {
        return this.N;
    }
}

