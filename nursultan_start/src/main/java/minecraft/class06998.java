/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.IntMath
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00389
 *  minecraft.class00630
 *  minecraft.class00631
 *  minecraft.class06857
 */
package minecraft;

import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00389;
import minecraft.class00630;
import minecraft.class00631;
import minecraft.class06857;

public final class class06998
implements class00630 {
    private final class06857 N;
    private final int y;
    private final int L;

    class06998(int n, int n2) {
        this.N = new class06857((int)class00389.N((int)n, (int)n2));
        int n3 = IntMath.gcd((int)n, (int)n2);
        this.y = n / n3;
        this.L = n2 / n3;
    }

    public int size() {
        return this.N.size();
    }

    public boolean method_1065(class00631 class006312) {
        int n = this.N.size() - 1;
        for (int i = 0; i < n; ++i) {
            if (class006312.merge(i / this.L, i / this.y, i)) continue;
            return false;
        }
        return true;
    }

    public DoubleList method_1066() {
        return this.N;
    }
}

