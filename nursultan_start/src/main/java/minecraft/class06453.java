/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00730
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class04878
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07235
 *  minecraft.class07321
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00730;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06456;
import minecraft.class07001;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07235;
import minecraft.class07321;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06453
extends class06456 {
    private static final int N = 7;
    private static final int y = 8;
    private static final int L = 9;
    private boolean u;

    public class06453(int n, class05163 class051632, class07211 class072112) {
        super(class04878.s, n, class051632);
        this.N(class072112);
    }

    public class06453(class07001 class070012) {
        super(class04878.s, class070012);
        this.u = class070012.y("Mob", false);
    }

    public static @Nullable class06453 N(class03860 class038602, int n, int n2, int n3, int n4, class07211 class072112) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-2, (int)0, (int)0, (int)7, (int)8, (int)9, (class07211)class072112);
        if (!class06453.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class06453(n4, class051632, class072112);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        class07218 class072182;
        this.N(class059742, class051632, 0, 2, 0, 6, 7, 7, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 1, 0, 0, 5, 1, 7, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 2, 1, 5, 2, 7, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 3, 2, 5, 3, 7, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 4, 3, 5, 4, 7, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 2, 0, 1, 4, 2, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 5, 2, 0, 5, 4, 2, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 5, 2, 1, 5, 3, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 5, 5, 2, 5, 5, 3, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 5, 3, 0, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 6, 5, 3, 6, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 5, 8, 5, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
        class00500 class005002 = (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true));
        class00500 class005003 = (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.u, (Comparable)Boolean.valueOf(true));
        this.L(class059742, (class00500)class00869.Mu.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true)), 1, 6, 3, class051632);
        this.L(class059742, (class00500)class00869.Mu.W().y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), 5, 6, 3, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.L, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.y, (Comparable)Boolean.valueOf(true)), 0, 6, 3, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.y, (Comparable)Boolean.valueOf(true)), 6, 6, 3, class051632);
        this.N(class059742, class051632, 0, 6, 4, 0, 6, 7, class005003, class005003, false);
        this.N(class059742, class051632, 6, 6, 4, 6, 6, 7, class005003, class005003, false);
        this.L(class059742, (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.L, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.u, (Comparable)Boolean.valueOf(true)), 0, 6, 8, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.u, (Comparable)Boolean.valueOf(true)), 6, 6, 8, class051632);
        this.N(class059742, class051632, 1, 6, 8, 5, 6, 8, class005002, class005002, false);
        this.L(class059742, (class00500)class00869.Mu.W().y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), 1, 7, 8, class051632);
        this.N(class059742, class051632, 2, 7, 8, 4, 7, 8, class005002, class005002, false);
        this.L(class059742, (class00500)class00869.Mu.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true)), 5, 7, 8, class051632);
        this.L(class059742, (class00500)class00869.Mu.W().y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), 2, 8, 8, class051632);
        this.L(class059742, class005002, 3, 8, 8, class051632);
        this.L(class059742, (class00500)class00869.Mu.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true)), 4, 8, 8, class051632);
        if (!this.u && class051632.y((class00753)(class072182 = this.L(3, 5, 5)))) {
            this.u = true;
            class059742.method_8652((class07209)class072182, class00869.La.W(), 2);
            class00394 class003942 = class059742.method_8321((class07209)class072182);
            if (class003942 instanceof class07235) {
                ((class07235)class003942).N(class07078.T, class060692);
            }
        }
        for (int i = 0; i <= 6; ++i) {
            for (int j = 0; j <= 6; ++j) {
                this.N(class059742, class00869.ML.W(), i, -1, j, class051632);
            }
        }
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Mob", this.u);
    }
}

