/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 */
package minecraft;

import java.util.Arrays;
import minecraft.class03621;
import minecraft.class06069;

public class class03620
implements class03621 {
    private final class03621[] N;

    public class03620(class03621 ... class03621Array) {
        this.N = class03621Array;
    }

    public String toString() {
        return "MultipliedFloats" + Arrays.toString(this.N);
    }

    @Override
    public float N(class06069 class060692) {
        float f = 1.0f;
        for (class03621 class036212 : this.N) {
            f *= class036212.N(class060692);
        }
        return f;
    }
}

