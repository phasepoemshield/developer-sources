/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class03860
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
import minecraft.class04890;
import minecraft.class04931;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public class class04928
extends class04931 {
    private final int N;

    public class04928(int n, class05163 class051632, class07211 class072112) {
        super(class04878.n, n, class051632);
        this.N(class072112);
        this.N = class072112 == class07211.field_11043 || class072112 == class07211.field_11035 ? class051632.R() : class051632.u();
    }

    public class04928(class07001 class070012) {
        super(class04878.n, class070012);
        this.N = class070012.y("Steps", 0);
    }

    public static @Nullable class05163 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112) {
        int n4 = 3;
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-1, (int)0, (int)5, (int)5, (int)4, (class07211)class072112);
        class04890 class048902 = class038602.N(class051632);
        if (class048902 == null) {
            return null;
        }
        if (class048902.L().Z() == class051632.Z()) {
            for (int i = 2; i >= 1; --i) {
                class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-1, (int)0, (int)5, (int)5, (int)i, (class07211)class072112);
                if (class048902.L().N(class051632)) continue;
                return class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-1, (int)0, (int)5, (int)5, (int)(i + 1), (class07211)class072112);
            }
        }
        return null;
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        for (int i = 0; i < this.N; ++i) {
            this.L(class059742, class00869.Rm.W(), 0, 0, i, class051632);
            this.L(class059742, class00869.Rm.W(), 1, 0, i, class051632);
            this.L(class059742, class00869.Rm.W(), 2, 0, i, class051632);
            this.L(class059742, class00869.Rm.W(), 3, 0, i, class051632);
            this.L(class059742, class00869.Rm.W(), 4, 0, i, class051632);
            for (int j = 1; j <= 3; ++j) {
                this.L(class059742, class00869.Rm.W(), 0, j, i, class051632);
                this.L(class059742, class00869.mr.W(), 1, j, i, class051632);
                this.L(class059742, class00869.mr.W(), 2, j, i, class051632);
                this.L(class059742, class00869.mr.W(), 3, j, i, class051632);
                this.L(class059742, class00869.Rm.W(), 4, j, i, class051632);
            }
            this.L(class059742, class00869.Rm.W(), 0, 4, i, class051632);
            this.L(class059742, class00869.Rm.W(), 1, 4, i, class051632);
            this.L(class059742, class00869.Rm.W(), 2, 4, i, class051632);
            this.L(class059742, class00869.Rm.W(), 3, 4, i, class051632);
            this.L(class059742, class00869.Rm.W(), 4, 4, i, class051632);
        }
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Steps", this.N);
    }
}

