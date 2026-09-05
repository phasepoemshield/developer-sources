/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00651
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07007
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08054
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00651;
import minecraft.class00869;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class04898;
import minecraft.class04931;
import minecraft.class04933;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07007;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08054;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04934
extends class04931 {
    protected static final int N = 10;
    protected static final int y = 9;
    protected static final int L = 11;
    private final boolean u;
    private final boolean R;
    private final boolean M;
    private final boolean B;

    public class04934(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.t, n, class051632);
        this.N(class072112);
        this.i = this.N(class060692);
        this.u = class060692.Z();
        this.R = class060692.Z();
        this.M = class060692.Z();
        this.B = class060692.y(3) > 0;
    }

    public class04934(class07001 class070012) {
        super(class04878.t, class070012);
        this.u = class070012.y("leftLow", false);
        this.R = class070012.y("leftHigh", false);
        this.M = class070012.y("rightLow", false);
        this.B = class070012.y("rightHigh", false);
    }

    public static @Nullable class04934 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-4, (int)-3, (int)0, (int)10, (int)9, (int)11, (class07211)class072112);
        if (!class04934.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04934(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 9, 8, 10, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 4, 3, 0);
        if (this.u) {
            this.N(class059742, class051632, 0, 3, 1, 0, 5, 3, w, w, false);
        }
        if (this.M) {
            this.N(class059742, class051632, 9, 3, 1, 9, 5, 3, w, w, false);
        }
        if (this.R) {
            this.N(class059742, class051632, 0, 5, 7, 0, 7, 9, w, w, false);
        }
        if (this.B) {
            this.N(class059742, class051632, 9, 5, 7, 9, 7, 9, w, w, false);
        }
        this.N(class059742, class051632, 5, 1, 10, 7, 3, 10, w, w, false);
        this.N(class059742, class051632, 1, 2, 1, 8, 2, 6, false, class060692, class04933.L);
        this.N(class059742, class051632, 4, 1, 5, 4, 4, 9, false, class060692, class04933.L);
        this.N(class059742, class051632, 8, 1, 5, 8, 4, 9, false, class060692, class04933.L);
        this.N(class059742, class051632, 1, 4, 7, 3, 4, 9, false, class060692, class04933.L);
        this.N(class059742, class051632, 1, 3, 5, 3, 3, 6, false, class060692, class04933.L);
        this.N(class059742, class051632, 1, 3, 4, 3, 3, 4, class00869.Ul.W(), class00869.Ul.W(), false);
        this.N(class059742, class051632, 1, 4, 6, 3, 4, 6, class00869.Ul.W(), class00869.Ul.W(), false);
        this.N(class059742, class051632, 5, 1, 7, 7, 1, 8, false, class060692, class04933.L);
        this.N(class059742, class051632, 5, 1, 9, 7, 1, 9, class00869.Ul.W(), class00869.Ul.W(), false);
        this.N(class059742, class051632, 5, 2, 7, 7, 2, 7, class00869.Ul.W(), class00869.Ul.W(), false);
        this.N(class059742, class051632, 4, 5, 7, 4, 5, 9, class00869.Ul.W(), class00869.Ul.W(), false);
        this.N(class059742, class051632, 8, 5, 7, 8, 5, 9, class00869.Ul.W(), class00869.Ul.W(), false);
        this.N(class059742, class051632, 5, 5, 7, 7, 5, 9, (class00500)class00869.Ul.W().y((class08092)class07007.y, (Comparable)class08054.field_12682), (class00500)class00869.Ul.W().y((class08092)class07007.y, (Comparable)class08054.field_12682), false);
        this.L(class059742, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11035), 6, 5, 6, class051632);
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        int n = 3;
        int n2 = 5;
        class07211 class072112 = this.i();
        if (class072112 == class07211.field_11039 || class072112 == class07211.field_11043) {
            n = 8 - n;
            n2 = 8 - n2;
        }
        this.N((class04898)class048902, class038602, class060692, 5, 1);
        if (this.u) {
            this.y((class04898)class048902, class038602, class060692, n, 1);
        }
        if (this.R) {
            this.y((class04898)class048902, class038602, class060692, n2, 7);
        }
        if (this.M) {
            this.L((class04898)class048902, class038602, class060692, n, 1);
        }
        if (this.B) {
            this.L((class04898)class048902, class038602, class060692, n2, 7);
        }
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("leftLow", this.u);
        class070012.N("leftHigh", this.R);
        class070012.N("rightLow", this.M);
        class070012.N("rightHigh", this.B);
    }
}

