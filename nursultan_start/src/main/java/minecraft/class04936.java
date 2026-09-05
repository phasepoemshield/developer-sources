/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
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
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00753;
import minecraft.class00869;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class04898;
import minecraft.class04900;
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
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public class class04936
extends class04931 {
    private static final int N = 5;
    private static final int y = 5;
    private static final int L = 7;
    private boolean u;

    public class04936(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.v, n, class051632);
        this.N(class072112);
        this.i = this.N(class060692);
    }

    public class04936(class07001 class070012) {
        super(class04878.v, class070012);
        this.u = class070012.y("Chest", false);
    }

    public static @Nullable class04936 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-1, (int)0, (int)5, (int)5, (int)7, (class07211)class072112);
        if (!class04936.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04936(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 4, 4, 6, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 1, 1, 0);
        this.N(class059742, class060692, class051632, class04900.field_15288, 1, 1, 6);
        this.N(class059742, class051632, 3, 1, 2, 3, 1, 4, class00869.Rm.W(), class00869.Rm.W(), false);
        this.L(class059742, class00869.UO.W(), 3, 1, 1, class051632);
        this.L(class059742, class00869.UO.W(), 3, 1, 5, class051632);
        this.L(class059742, class00869.UO.W(), 3, 2, 2, class051632);
        this.L(class059742, class00869.UO.W(), 3, 2, 4, class051632);
        for (int i = 2; i <= 4; ++i) {
            this.L(class059742, class00869.UO.W(), 2, 1, i, class051632);
        }
        if (!this.u && class051632.y((class00753)this.L(3, 2, 3))) {
            this.u = true;
            this.N(class059742, class051632, class060692, 3, 2, 3, (class05946<class05074>)class06273.l);
        }
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class04898)class048902, class038602, class060692, 1, 1);
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Chest", this.u);
    }
}

