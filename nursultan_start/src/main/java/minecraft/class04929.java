/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03860
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class07746
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class04898;
import minecraft.class04900;
import minecraft.class04931;
import minecraft.class04933;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class07746;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04929
extends class04931 {
    private static final int N = 5;
    private static final int y = 11;
    private static final int L = 8;

    public class04929(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.I, n, class051632);
        this.N(class072112);
        this.i = this.N(class060692);
    }

    public class04929(class07001 class070012) {
        super(class04878.I, class070012);
    }

    public static @Nullable class04929 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-7, (int)0, (int)5, (int)11, (int)8, (class07211)class072112);
        if (!class04929.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04929(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 4, 10, 7, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 1, 7, 0);
        this.N(class059742, class060692, class051632, class04900.field_15288, 1, 1, 7);
        class00500 class005002 = (class00500)class00869.uP.W().y((class08092)class07746.y, (Comparable)class07211.field_11035);
        for (int i = 0; i < 6; ++i) {
            this.L(class059742, class005002, 1, 6 - i, 1 + i, class051632);
            this.L(class059742, class005002, 2, 6 - i, 1 + i, class051632);
            this.L(class059742, class005002, 3, 6 - i, 1 + i, class051632);
            if (i >= 5) continue;
            this.L(class059742, class00869.Rm.W(), 1, 5 - i, 1 + i, class051632);
            this.L(class059742, class00869.Rm.W(), 2, 5 - i, 1 + i, class051632);
            this.L(class059742, class00869.Rm.W(), 3, 5 - i, 1 + i, class051632);
        }
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class04898)class048902, class038602, class060692, 1, 1);
    }
}

