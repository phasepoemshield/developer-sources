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
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04899
extends class04931 {
    private static final int N = 5;
    private static final int y = 5;
    private static final int L = 7;
    private final boolean u;
    private final boolean R;

    public class04899(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.g, n, class051632);
        this.N(class072112);
        this.i = this.N(class060692);
        this.u = class060692.y(2) == 0;
        this.R = class060692.y(2) == 0;
    }

    public class04899(class07001 class070012) {
        super(class04878.g, class070012);
        this.u = class070012.y("Left", false);
        this.R = class070012.y("Right", false);
    }

    public static @Nullable class04899 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-1, (int)0, (int)5, (int)5, (int)7, (class07211)class072112);
        if (!class04899.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04899(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 4, 4, 6, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 1, 1, 0);
        this.N(class059742, class060692, class051632, class04900.field_15288, 1, 1, 6);
        class00500 class005002 = (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11034);
        class00500 class005003 = (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11039);
        this.N(class059742, class051632, class060692, 0.1f, 1, 2, 1, class005002);
        this.N(class059742, class051632, class060692, 0.1f, 3, 2, 1, class005003);
        this.N(class059742, class051632, class060692, 0.1f, 1, 2, 5, class005002);
        this.N(class059742, class051632, class060692, 0.1f, 3, 2, 5, class005003);
        if (this.u) {
            this.N(class059742, class051632, 0, 1, 2, 0, 3, 4, w, w, false);
        }
        if (this.R) {
            this.N(class059742, class051632, 4, 1, 2, 4, 3, 4, w, w, false);
        }
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class04898)class048902, class038602, class060692, 1, 1);
        if (this.u) {
            this.y((class04898)class048902, class038602, class060692, 1, 2);
        }
        if (this.R) {
            this.L((class04898)class048902, class038602, class060692, 1, 2);
        }
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Left", this.u);
        class070012.N("Right", this.R);
    }
}

