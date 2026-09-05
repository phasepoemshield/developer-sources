/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03345
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01639;
import minecraft.class03345;
import org.jspecify.annotations.Nullable;

class class01641 {
    private final class01639[] N;

    class01641(int n) {
        this.N = new class01639[n];
    }

    public void N(class03345 class033452, class01639 class016392) {
        this.N[class033452.y] = class016392;
    }

    public @Nullable class01639 N(class03345 class033452) {
        int n = class033452.y;
        if (n < 0 || n >= this.N.length) {
            return null;
        }
        return this.N[n];
    }
}

