/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  minecraft.class04995
 *  minecraft.class08036
 */
package minecraft;

import java.util.List;
import minecraft.class04770;
import minecraft.class04995;
import minecraft.class08036;

public class class06060 {
    private int N;
    private int y;

    public int y() {
        return this.y;
    }

    public int y(int n) {
        return Math.max(1, class04995.u((float)((float)(this.N * n) / 100.0f)));
    }

    public boolean N(List<class04770> list) {
        int n = this.N;
        int n2 = this.y;
        this.N = 0;
        this.y = 0;
        for (class04770 class047702 : list) {
            if (class047702.method_7325()) continue;
            ++this.N;
            if (!class047702.method_6113()) continue;
            ++this.y;
        }
        return !(n2 <= 0 && this.y <= 0 || n == this.N && n2 == this.y);
    }

    public boolean N(int n) {
        return this.y >= this.y(n);
    }

    public void N() {
        this.y = 0;
    }

    public boolean N(int n, List<class04770> list) {
        return (int)list.stream().filter(class08036::method_7276).count() >= this.y(n);
    }
}

