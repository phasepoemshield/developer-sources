/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class00734;
import minecraft.class07211;

public class class01437 {
    public static class00734 N(class00734 class007342, class07211 class072112, double d) {
        double d2 = d * (double)class072112.i().N();
        double d3 = Math.min(d2, 0.0);
        double d4 = Math.max(d2, 0.0);
        switch (class072112) {
            case field_11039: {
                return new class00734(class007342.N + d3, class007342.y, class007342.L, class007342.N + d4, class007342.i, class007342.R);
            }
            case field_11034: {
                return new class00734(class007342.u + d3, class007342.y, class007342.L, class007342.u + d4, class007342.i, class007342.R);
            }
            case field_11033: {
                return new class00734(class007342.N, class007342.y + d3, class007342.L, class007342.u, class007342.y + d4, class007342.R);
            }
            default: {
                return new class00734(class007342.N, class007342.i + d3, class007342.L, class007342.u, class007342.i + d4, class007342.R);
            }
            case field_11043: {
                return new class00734(class007342.N, class007342.y, class007342.L + d3, class007342.u, class007342.i, class007342.L + d4);
            }
            case field_11035: 
        }
        return new class00734(class007342.N, class007342.y, class007342.R + d3, class007342.u, class007342.i, class007342.R + d4);
    }
}

