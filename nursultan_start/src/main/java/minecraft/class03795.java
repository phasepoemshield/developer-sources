/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02113
 *  minecraft.class07211
 */
package minecraft;

import java.util.Optional;
import minecraft.class02113;
import minecraft.class07211;

public class class03795 {
    private static final class02113 N = new class02113(4);
    private static final int y = N.N();
    private static final int L = 0;
    private static final int u = 4;
    private static final int i = 8;
    private static final int R = 12;

    public static float y(int n) {
        return N.y(n);
    }

    public static int N(float f) {
        return N.y(f);
    }

    public static Optional<class07211> N(int n) {
        return Optional.ofNullable(switch (n) {
            case 0 -> class07211.field_11043;
            case 4 -> class07211.field_11034;
            case 8 -> class07211.field_11035;
            case 12 -> class07211.field_11039;
            default -> null;
        });
    }

    public static int N() {
        return y;
    }

    public static int N(class07211 class072112) {
        return N.N(class072112);
    }
}

