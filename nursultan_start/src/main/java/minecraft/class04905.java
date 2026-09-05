/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00651
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class05074
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class07001
 *  minecraft.class07123
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
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
import minecraft.class05074;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class07001;
import minecraft.class07123;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04905
extends class04931 {
    protected static final int N = 11;
    protected static final int y = 7;
    protected static final int L = 11;
    protected final int u;

    public class04905(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.Y, n, class051632);
        this.N(class072112);
        this.i = this.N(class060692);
        this.u = class060692.y(5);
    }

    public class04905(class07001 class070012) {
        super(class04878.Y, class070012);
        this.u = class070012.y("Type", 0);
    }

    public static @Nullable class04905 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-4, (int)-1, (int)0, (int)11, (int)7, (int)11, (class07211)class072112);
        if (!class04905.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04905(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 10, 6, 10, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 4, 1, 0);
        this.N(class059742, class051632, 4, 1, 10, 6, 3, 10, w, w, false);
        this.N(class059742, class051632, 0, 1, 4, 0, 3, 6, w, w, false);
        this.N(class059742, class051632, 10, 1, 4, 10, 3, 6, w, w, false);
        switch (this.u) {
            default: {
                break;
            }
            case 0: {
                this.L(class059742, class00869.Rm.W(), 5, 1, 5, class051632);
                this.L(class059742, class00869.Rm.W(), 5, 2, 5, class051632);
                this.L(class059742, class00869.Rm.W(), 5, 3, 5, class051632);
                this.L(class059742, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11039), 4, 3, 5, class051632);
                this.L(class059742, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11034), 6, 3, 5, class051632);
                this.L(class059742, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11035), 5, 3, 4, class051632);
                this.L(class059742, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11043), 5, 3, 6, class051632);
                this.L(class059742, class00869.Ul.W(), 4, 1, 4, class051632);
                this.L(class059742, class00869.Ul.W(), 4, 1, 5, class051632);
                this.L(class059742, class00869.Ul.W(), 4, 1, 6, class051632);
                this.L(class059742, class00869.Ul.W(), 6, 1, 4, class051632);
                this.L(class059742, class00869.Ul.W(), 6, 1, 5, class051632);
                this.L(class059742, class00869.Ul.W(), 6, 1, 6, class051632);
                this.L(class059742, class00869.Ul.W(), 5, 1, 4, class051632);
                this.L(class059742, class00869.Ul.W(), 5, 1, 6, class051632);
                break;
            }
            case 1: {
                for (int i = 0; i < 5; ++i) {
                    this.L(class059742, class00869.Rm.W(), 3, 1, 3 + i, class051632);
                    this.L(class059742, class00869.Rm.W(), 7, 1, 3 + i, class051632);
                    this.L(class059742, class00869.Rm.W(), 3 + i, 1, 3, class051632);
                    this.L(class059742, class00869.Rm.W(), 3 + i, 1, 7, class051632);
                }
                this.L(class059742, class00869.Rm.W(), 5, 1, 5, class051632);
                this.L(class059742, class00869.Rm.W(), 5, 2, 5, class051632);
                this.L(class059742, class00869.Rm.W(), 5, 3, 5, class051632);
                this.L(class059742, class00869.K.W(), 5, 4, 5, class051632);
                break;
            }
            case 2: {
                int n;
                for (n = 1; n <= 9; ++n) {
                    this.L(class059742, class00869.W.W(), 1, 3, n, class051632);
                    this.L(class059742, class00869.W.W(), 9, 3, n, class051632);
                }
                for (n = 1; n <= 9; ++n) {
                    this.L(class059742, class00869.W.W(), n, 3, 1, class051632);
                    this.L(class059742, class00869.W.W(), n, 3, 9, class051632);
                }
                this.L(class059742, class00869.W.W(), 5, 1, 4, class051632);
                this.L(class059742, class00869.W.W(), 5, 1, 6, class051632);
                this.L(class059742, class00869.W.W(), 5, 3, 4, class051632);
                this.L(class059742, class00869.W.W(), 5, 3, 6, class051632);
                this.L(class059742, class00869.W.W(), 4, 1, 5, class051632);
                this.L(class059742, class00869.W.W(), 6, 1, 5, class051632);
                this.L(class059742, class00869.W.W(), 4, 3, 5, class051632);
                this.L(class059742, class00869.W.W(), 6, 3, 5, class051632);
                for (n = 1; n <= 3; ++n) {
                    this.L(class059742, class00869.W.W(), 4, n, 4, class051632);
                    this.L(class059742, class00869.W.W(), 6, n, 4, class051632);
                    this.L(class059742, class00869.W.W(), 4, n, 6, class051632);
                    this.L(class059742, class00869.W.W(), 6, n, 6, class051632);
                }
                this.L(class059742, class00869.LH.W(), 5, 3, 5, class051632);
                for (n = 2; n <= 8; ++n) {
                    this.L(class059742, class00869.m.W(), 2, 3, n, class051632);
                    this.L(class059742, class00869.m.W(), 3, 3, n, class051632);
                    if (n <= 3 || n >= 7) {
                        this.L(class059742, class00869.m.W(), 4, 3, n, class051632);
                        this.L(class059742, class00869.m.W(), 5, 3, n, class051632);
                        this.L(class059742, class00869.m.W(), 6, 3, n, class051632);
                    }
                    this.L(class059742, class00869.m.W(), 7, 3, n, class051632);
                    this.L(class059742, class00869.m.W(), 8, 3, n, class051632);
                }
                class00500 class005002 = (class00500)class00869.uW.W().y((class08092)class07123.y, (Comparable)class07211.field_11039);
                this.L(class059742, class005002, 9, 1, 3, class051632);
                this.L(class059742, class005002, 9, 2, 3, class051632);
                this.L(class059742, class005002, 9, 3, 3, class051632);
                this.N(class059742, class051632, class060692, 3, 4, 8, (class05946<class05074>)class06273.G);
            }
        }
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class04898)class048902, class038602, class060692, 4, 1);
        this.y((class04898)class048902, class038602, class060692, 1, 4);
        this.L((class04898)class048902, class038602, class060692, 1, 4);
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Type", this.u);
    }
}

