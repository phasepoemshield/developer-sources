/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03860
 *  minecraft.class04890
 *  minecraft.class05148
 *  minecraft.class05154
 *  minecraft.class05156
 *  minecraft.class05162
 *  minecraft.class05163
 *  minecraft.class06069
 *  minecraft.class06187
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class03860;
import minecraft.class04890;
import minecraft.class05148;
import minecraft.class05154;
import minecraft.class05156;
import minecraft.class05162;
import minecraft.class05163;
import minecraft.class06069;
import minecraft.class06187;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

public class class05184 {
    private static final int y = 3;
    private static final int L = 3;
    private static final int u = 5;
    private static final int i = 20;
    private static final int R = 50;
    private static final int M = 8;
    public static final int N = 50;

    private static @Nullable class05154 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4, class06187 class061872) {
        int n5 = class060692.y(100);
        if (n5 >= 80) {
            class05163 class051632 = class05156.N((class03860)class038602, (class06069)class060692, (int)n, (int)n2, (int)n3, (class07211)class072112);
            if (class051632 != null) {
                return new class05156(n4, class051632, class072112, class061872);
            }
        } else if (n5 >= 70) {
            class05163 class051633 = class05148.N((class03860)class038602, (class06069)class060692, (int)n, (int)n2, (int)n3, (class07211)class072112);
            if (class051633 != null) {
                return new class05148(n4, class051633, class072112, class061872);
            }
        } else {
            class05163 class051634 = class05162.N((class03860)class038602, (class06069)class060692, (int)n, (int)n2, (int)n3, (class07211)class072112);
            if (class051634 != null) {
                return new class05162(n4, class060692, class051634, class072112, class061872);
            }
        }
        return null;
    }

    static @Nullable class05154 N(class04890 class048902, class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        if (n4 > 8) {
            return null;
        }
        if (Math.abs(n - class048902.L().B()) > 80 || Math.abs(n3 - class048902.L().z()) > 80) {
            return null;
        }
        class06187 class061872 = ((class05154)class048902).N;
        class05154 class051542 = class05184.N(class038602, class060692, n, n2, n3, class072112, n4 + 1, class061872);
        if (class051542 != null) {
            class038602.N((class04890)class051542);
            class051542.N(class048902, class038602, class060692);
        }
        return class051542;
    }
}

