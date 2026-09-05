/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00730
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
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00730;
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
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06460
extends class06456 {
    private static final int N = 5;
    private static final int y = 7;
    private static final int L = 5;

    public class06460(int n, class05163 class051632, class07211 class072112) {
        super(class04878.W, n, class051632);
        this.N(class072112);
    }

    public class06460(class07001 class070012) {
        super(class04878.W, class070012);
    }

    public static @Nullable class06460 N(class03860 class038602, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)0, (int)0, (int)5, (int)7, (int)5, (class07211)class072112);
        if (!class06460.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class06460(n4, class051632, class072112);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 4, 1, 4, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 2, 0, 4, 5, 4, class00869.N.W(), class00869.N.W(), false);
        class00500 class005002 = (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.u, (Comparable)Boolean.valueOf(true));
        this.N(class059742, class051632, 0, 2, 0, 0, 5, 4, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 4, 2, 0, 4, 5, 4, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 3, 1, 0, 4, 1, class005002, class005002, false);
        this.N(class059742, class051632, 0, 3, 3, 0, 4, 3, class005002, class005002, false);
        this.N(class059742, class051632, 4, 3, 1, 4, 4, 1, class005002, class005002, false);
        this.N(class059742, class051632, 4, 3, 3, 4, 4, 3, class005002, class005002, false);
        this.N(class059742, class051632, 0, 6, 0, 4, 6, 4, class00869.ML.W(), class00869.ML.W(), false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 4; ++j) {
                this.N(class059742, class00869.ML.W(), i, -1, j, class051632);
            }
        }
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class06461)class048902, class038602, class060692, 1, 0, true);
    }
}

