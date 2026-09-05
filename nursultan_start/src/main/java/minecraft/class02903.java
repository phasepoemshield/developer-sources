/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02741
 *  minecraft.class02919
 *  minecraft.class02950
 *  minecraft.class06584
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class02741;
import minecraft.class02919;
import minecraft.class02950;
import minecraft.class06584;

public class class02903
implements class02950 {
    public static final class02903 N = new class02903(0, 0, List.of());
    private final int y;
    private final int L;
    private final List<class06584> u;
    private final class02741 i = new class02741();
    private final int R;

    public class02741 L() {
        return this.i;
    }

    public int M() {
        return this.L;
    }

    private class02903(int n, int n2, List<class06584> list) {
        this.y = n;
        this.L = n2;
        this.u = list;
        int n3 = 0;
        for (class06584 class065842 : list) {
            if (class065842.R()) continue;
            ++n3;
            this.i.N(class065842, 1);
        }
        this.R = n3;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof class02903) {
            class02903 class029032 = (class02903)object;
            return this.y == class029032.y && this.L == class029032.L && this.R == class029032.R && class06584.N(this.u, class029032.u);
        }
        return false;
    }

    public int hashCode() {
        int n = class06584.N(this.u);
        n = 31 * n + this.y;
        n = 31 * n + this.L;
        return n;
    }

    public int i() {
        return this.R;
    }

    public List<class06584> u() {
        return this.u;
    }

    public boolean y() {
        return this.R == 0;
    }

    public static class02919 y(int n, int n2, List<class06584> list) {
        int n3;
        int n4;
        if (n == 0 || n2 == 0) {
            return class02919.N;
        }
        int n5 = n - 1;
        int n6 = 0;
        int n7 = n2 - 1;
        int n8 = 0;
        for (n4 = 0; n4 < n2; ++n4) {
            n3 = 1;
            for (int i = 0; i < n; ++i) {
                class06584 class065842 = list.get(i + n4 * n);
                if (class065842.R()) continue;
                n5 = Math.min(n5, i);
                n6 = Math.max(n6, i);
                n3 = 0;
            }
            if (n3 != 0) continue;
            n7 = Math.min(n7, n4);
            n8 = Math.max(n8, n4);
        }
        n4 = n6 - n5 + 1;
        n3 = n8 - n7 + 1;
        if (n4 <= 0 || n3 <= 0) {
            return class02919.N;
        }
        if (n4 == n && n3 == n2) {
            return new class02919(new class02903(n, n2, list), n5, n7);
        }
        ArrayList<class06584> arrayList = new ArrayList<class06584>(n4 * n3);
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n4; ++j) {
                int n9 = j + n5 + (i + n7) * n;
                arrayList.add(list.get(n9));
            }
        }
        return new class02919(new class02903(n4, n3, arrayList), n5, n7);
    }

    public int N() {
        return this.u.size();
    }

    public class06584 N(int n, int n2) {
        return this.u.get(n + n2 * this.y);
    }

    public class06584 N(int n) {
        return this.u.get(n);
    }

    public static class02903 N(int n, int n2, List<class06584> list) {
        return class02903.y(n, n2, list).N();
    }

    public int R() {
        return this.y;
    }
}

