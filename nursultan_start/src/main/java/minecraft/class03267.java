/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class03275;
import minecraft.class03285;
import minecraft.class06584;

public class class03267 {
    private final List<class03285> N = new ArrayList<class03285>();
    private class03285 y = class03285.y_const;

    public class03275 N() {
        int n = this.N.size();
        for (int i = 0; i < n; ++i) {
            if (this.N.get(i).N() == i) continue;
            throw new IllegalArgumentException("Expected input slots to have continous indexes");
        }
        if (this.y.N() != n) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
        }
        return new class03275(this.N, this.y);
    }

    public class03267 N(int n, int n2, int n3) {
        this.y = new class03285(n, n2, n3, class065842 -> false);
        return this;
    }

    public class03267 N(int n, int n2, int n3, Predicate<class06584> predicate) {
        this.N.add(new class03285(n, n2, n3, predicate));
        return this;
    }
}

