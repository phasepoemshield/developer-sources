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
import minecraft.class04898;
import minecraft.class04900;
import minecraft.class04931;
import minecraft.class04933;
import minecraft.class04934;
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

public class class04921
extends class04931 {
    private static final int N = 5;
    private static final int y = 11;
    private static final int L = 5;
    private final boolean u;

    public class04921(class07001 class070012) {
        this(class04878.Q, class070012);
    }

    public class04921(class04878 class048782, class07001 class070012) {
        super(class048782, class070012);
        this.u = class070012.y("Source", false);
    }

    public class04921(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.Q, n, class051632);
        this.u = false;
        this.N(class072112);
        this.i = this.N(class060692);
    }

    public class04921(class04878 class048782, int n, int n2, int n3, class07211 class072112) {
        super(class048782, n, class04921.N(n2, 64, n3, class072112, 5, 11, 5));
        this.u = true;
        this.N(class072112);
        this.i = class04900.field_15288;
    }

    public static @Nullable class04921 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-7, (int)0, (int)5, (int)11, (int)5, (class07211)class072112);
        if (!class04921.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04921(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 4, 10, 4, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 1, 7, 0);
        this.N(class059742, class060692, class051632, class04900.field_15288, 1, 1, 4);
        this.L(class059742, class00869.Rm.W(), 2, 6, 1, class051632);
        this.L(class059742, class00869.Rm.W(), 1, 5, 1, class051632);
        this.L(class059742, class00869.Ul.W(), 1, 6, 1, class051632);
        this.L(class059742, class00869.Rm.W(), 1, 5, 2, class051632);
        this.L(class059742, class00869.Rm.W(), 1, 4, 3, class051632);
        this.L(class059742, class00869.Ul.W(), 1, 5, 3, class051632);
        this.L(class059742, class00869.Rm.W(), 2, 4, 3, class051632);
        this.L(class059742, class00869.Rm.W(), 3, 3, 3, class051632);
        this.L(class059742, class00869.Ul.W(), 3, 4, 3, class051632);
        this.L(class059742, class00869.Rm.W(), 3, 3, 2, class051632);
        this.L(class059742, class00869.Rm.W(), 3, 2, 1, class051632);
        this.L(class059742, class00869.Ul.W(), 3, 3, 1, class051632);
        this.L(class059742, class00869.Rm.W(), 2, 2, 1, class051632);
        this.L(class059742, class00869.Rm.W(), 1, 1, 1, class051632);
        this.L(class059742, class00869.Ul.W(), 1, 2, 1, class051632);
        this.L(class059742, class00869.Rm.W(), 1, 1, 2, class051632);
        this.L(class059742, class00869.Ul.W(), 1, 1, 3, class051632);
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        if (this.u) {
            class04933.y = class04934.class;
        }
        this.N((class04898)class048902, class038602, class060692, 1, 1);
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Source", this.u);
    }
}

