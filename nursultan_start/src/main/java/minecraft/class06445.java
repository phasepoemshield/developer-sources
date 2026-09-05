/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class03860
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00869;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06456;
import minecraft.class06461;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public class class06445
extends class06456 {
    private static final int N = 19;
    private static final int y = 10;
    private static final int L = 19;

    public class06445(class07001 class070012) {
        this(class04878.i, class070012);
    }

    protected class06445(class04878 class048782, class07001 class070012) {
        super(class048782, class070012);
    }

    protected class06445(int n, int n2, class07211 class072112) {
        super(class04878.i, 0, class04890.N((int)n, (int)64, (int)n2, (class07211)class072112, (int)19, (int)10, (int)19));
        this.N(class072112);
    }

    public class06445(int n, class05163 class051632, class07211 class072112) {
        super(class04878.i, n, class051632);
        this.N(class072112);
    }

    public static @Nullable class06445 N(class03860 class038602, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-8, (int)-3, (int)0, (int)19, (int)10, (int)19, (class07211)class072112);
        if (!class06445.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class06445(n4, class051632, class072112);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        int n2;
        this.N(class059742, class051632, 7, 3, 0, 11, 4, 18, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 3, 7, 18, 4, 11, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 8, 5, 0, 10, 7, 18, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 0, 5, 8, 18, 7, 10, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 7, 5, 0, 7, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 7, 5, 11, 7, 5, 18, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 11, 5, 0, 11, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 11, 5, 11, 11, 5, 18, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 5, 7, 7, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 11, 5, 7, 18, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 5, 11, 7, 5, 11, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 11, 5, 11, 18, 5, 11, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 7, 2, 0, 11, 2, 5, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 7, 2, 13, 11, 2, 18, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 7, 0, 0, 11, 1, 3, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 7, 0, 15, 11, 1, 18, class00869.ML.W(), class00869.ML.W(), false);
        for (n2 = 7; n2 <= 11; ++n2) {
            for (n = 0; n <= 2; ++n) {
                this.N(class059742, class00869.ML.W(), n2, -1, n, class051632);
                this.N(class059742, class00869.ML.W(), n2, -1, 18 - n, class051632);
            }
        }
        this.N(class059742, class051632, 0, 2, 7, 5, 2, 11, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 13, 2, 7, 18, 2, 11, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 0, 7, 3, 1, 11, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 15, 0, 7, 18, 1, 11, class00869.ML.W(), class00869.ML.W(), false);
        for (n2 = 0; n2 <= 2; ++n2) {
            for (n = 7; n <= 11; ++n) {
                this.N(class059742, class00869.ML.W(), n2, -1, n, class051632);
                this.N(class059742, class00869.ML.W(), 18 - n2, -1, n, class051632);
            }
        }
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class06461)class048902, class038602, class060692, 8, 3, false);
        this.y((class06461)class048902, class038602, class060692, 3, 8, false);
        this.L((class06461)class048902, class038602, class060692, 3, 8, false);
    }
}

