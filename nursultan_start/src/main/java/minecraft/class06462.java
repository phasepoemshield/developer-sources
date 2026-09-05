/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class04878
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
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06456;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public class class06462
extends class06456 {
    private static final int N = 5;
    private static final int y = 10;
    private static final int L = 8;
    private final int u;

    public class06462(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.R, n, class051632);
        this.N(class072112);
        this.u = class060692.M();
    }

    public class06462(class07001 class070012) {
        super(class04878.R, class070012);
        this.u = class070012.y("Seed", 0);
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Seed", this.u);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        int n2;
        int n3;
        class06069 class060693 = class06069.y((long)this.u);
        for (n3 = 0; n3 <= 4; ++n3) {
            for (n2 = 3; n2 <= 4; ++n2) {
                n = class060693.y(8);
                this.N(class059742, class051632, n3, n2, 0, n3, n2, n, class00869.ML.W(), class00869.ML.W(), false);
            }
        }
        n3 = class060693.y(8);
        this.N(class059742, class051632, 0, 5, 0, 0, 5, n3, class00869.ML.W(), class00869.ML.W(), false);
        n3 = class060693.y(8);
        this.N(class059742, class051632, 4, 5, 0, 4, 5, n3, class00869.ML.W(), class00869.ML.W(), false);
        for (n3 = 0; n3 <= 4; ++n3) {
            n2 = class060693.y(5);
            this.N(class059742, class051632, n3, 2, 0, n3, 2, n2, class00869.ML.W(), class00869.ML.W(), false);
        }
        for (n3 = 0; n3 <= 4; ++n3) {
            for (n2 = 0; n2 <= 1; ++n2) {
                n = class060693.y(3);
                this.N(class059742, class051632, n3, n2, 0, n3, n2, n, class00869.ML.W(), class00869.ML.W(), false);
            }
        }
    }

    public static @Nullable class06462 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-3, (int)0, (int)5, (int)10, (int)8, (class07211)class072112);
        if (!class06462.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class06462(n4, class060692, class051632, class072112);
    }
}

