/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03241
 *  minecraft.class03271
 *  minecraft.class03281
 */
package minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class03241;
import minecraft.class03271;
import minecraft.class03281;

public class class03669 {
    private final int N;
    private final class03271 y;
    private final List<class03241> L = new ArrayList<class03241>();

    class03669(class03271 class032712, int n) {
        this.y = class032712;
        this.N = n;
    }

    public class03669 N(class03241 ... class03241Array) {
        Collections.addAll(this.L, class03241Array);
        return this;
    }

    public class03281 N() {
        return new class03281(this.N, this.y, this.L);
    }
}

