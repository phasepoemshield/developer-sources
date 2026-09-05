/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.List;
import minecraft.class03267;
import minecraft.class03285;

public class class03275 {
    private final List<class03285> N;
    private final class03285 y;

    public List<class03285> L() {
        return this.N;
    }

    class03275(List<class03285> list, class03285 class032852) {
        if (list.isEmpty() || class032852.equals((Object)class03285.y_const)) {
            throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
        }
        this.N = list;
        this.y = class032852;
    }

    public int i() {
        return this.u();
    }

    public int u() {
        return this.N.size();
    }

    public class03285 y() {
        return this.y;
    }

    public static class03267 N() {
        return new class03267();
    }

    public class03285 N(int n) {
        return this.N.get(n);
    }
}

