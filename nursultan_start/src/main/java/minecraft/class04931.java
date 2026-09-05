/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00889
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class05163
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07100
 *  minecraft.class07196
 *  minecraft.class07211
 *  minecraft.class08059
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00889;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class04898;
import minecraft.class04900;
import minecraft.class04933;
import minecraft.class05163;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07100;
import minecraft.class07196;
import minecraft.class07211;
import minecraft.class08059;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

abstract class class04931
extends class04890 {
    protected class04900 i = class04900.field_15288;

    protected @Nullable class04890 L(class04898 class048982, class03860 class038602, class06069 class060692, int n, int n2) {
        class07211 class072112 = this.i();
        if (class072112 != null) {
            switch (class072112) {
                case field_11043: {
                    return class04933.N(class048982, class038602, class060692, this.k.U() + 1, this.k.Z() + n, this.k.z() + n2, class07211.field_11034, this.u());
                }
                case field_11035: {
                    return class04933.N(class048982, class038602, class060692, this.k.U() + 1, this.k.Z() + n, this.k.z() + n2, class07211.field_11034, this.u());
                }
                case field_11039: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() + n2, this.k.Z() + n, this.k.W() + 1, class07211.field_11035, this.u());
                }
                case field_11034: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() + n2, this.k.Z() + n, this.k.W() + 1, class07211.field_11035, this.u());
                }
            }
        }
        return null;
    }

    protected class04931(class04878 class048782, int n, class05163 class051632) {
        super(class048782, n, class051632);
    }

    public class04931(class04878 class048782, class07001 class070012) {
        super(class048782, class070012);
        this.i = (class04900)((Object)class070012.N_15("EntryDoor", class04900.field_56683).orElseThrow());
    }

    protected @Nullable class04890 y(class04898 class048982, class03860 class038602, class06069 class060692, int n, int n2) {
        class07211 class072112 = this.i();
        if (class072112 != null) {
            switch (class072112) {
                case field_11043: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() - 1, this.k.Z() + n, this.k.z() + n2, class07211.field_11039, this.u());
                }
                case field_11035: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() - 1, this.k.Z() + n, this.k.z() + n2, class07211.field_11039, this.u());
                }
                case field_11039: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() + n2, this.k.Z() + n, this.k.z() - 1, class07211.field_11043, this.u());
                }
                case field_11034: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() + n2, this.k.Z() + n, this.k.z() - 1, class07211.field_11043, this.u());
                }
            }
        }
        return null;
    }

    protected @Nullable class04890 N(class04898 class048982, class03860 class038602, class06069 class060692, int n, int n2) {
        class07211 class072112 = this.i();
        if (class072112 != null) {
            switch (class072112) {
                case field_11043: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() + n, this.k.Z() + n2, this.k.z() - 1, class072112, this.u());
                }
                case field_11035: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() + n, this.k.Z() + n2, this.k.W() + 1, class072112, this.u());
                }
                case field_11039: {
                    return class04933.N(class048982, class038602, class060692, this.k.B() - 1, this.k.Z() + n2, this.k.z() + n, class072112, this.u());
                }
                case field_11034: {
                    return class04933.N(class048982, class038602, class060692, this.k.U() + 1, this.k.Z() + n2, this.k.z() + n, class072112, this.u());
                }
            }
        }
        return null;
    }

    protected static boolean N(class05163 class051632) {
        return class051632.Z() > 10;
    }

    protected class04900 N(class06069 class060692) {
        switch (class060692.y(5)) {
            default: {
                return class04900.field_15288;
            }
            case 2: {
                return class04900.field_15290;
            }
            case 3: {
                return class04900.field_15289;
            }
            case 4: 
        }
        return class04900.field_15291;
    }

    protected void N(class05974 class059742, class06069 class060692, class05163 class051632, class04900 class049002, int n, int n2, int n3) {
        switch (class049002.ordinal()) {
            case 0: {
                this.N(class059742, class051632, n, n2, n3, n + 3 - 1, n2 + 3 - 1, n3, w, w, false);
                break;
            }
            case 1: {
                this.L(class059742, class00869.Rm.W(), n, n2, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n, n2 + 1, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n, n2 + 2, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n + 1, n2 + 2, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n + 2, n2 + 2, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n + 2, n2 + 1, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n + 2, n2, n3, class051632);
                this.L(class059742, class00869.uE.W(), n + 1, n2, n3, class051632);
                this.L(class059742, (class00500)class00869.uE.W().y((class08092)class07196.L, (Comparable)class08059.field_12609), n + 1, n2 + 1, n3, class051632);
                break;
            }
            case 2: {
                this.L(class059742, class00869.mr.W(), n + 1, n2, n3, class051632);
                this.L(class059742, class00869.mr.W(), n + 1, n2 + 1, n3, class051632);
                this.L(class059742, (class00500)class00869.RQ.W().y((class08092)class07100.i, (Comparable)Boolean.valueOf(true)), n, n2, n3, class051632);
                this.L(class059742, (class00500)class00869.RQ.W().y((class08092)class07100.i, (Comparable)Boolean.valueOf(true)), n, n2 + 1, n3, class051632);
                this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.L, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.i, (Comparable)Boolean.valueOf(true)), n, n2 + 2, n3, class051632);
                this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.L, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.i, (Comparable)Boolean.valueOf(true)), n + 1, n2 + 2, n3, class051632);
                this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.L, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.i, (Comparable)Boolean.valueOf(true)), n + 2, n2 + 2, n3, class051632);
                this.L(class059742, (class00500)class00869.RQ.W().y((class08092)class07100.L, (Comparable)Boolean.valueOf(true)), n + 2, n2 + 1, n3, class051632);
                this.L(class059742, (class00500)class00869.RQ.W().y((class08092)class07100.L, (Comparable)Boolean.valueOf(true)), n + 2, n2, n3, class051632);
                break;
            }
            case 3: {
                this.L(class059742, class00869.Rm.W(), n, n2, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n, n2 + 1, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n, n2 + 2, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n + 1, n2 + 2, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n + 2, n2 + 2, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n + 2, n2 + 1, n3, class051632);
                this.L(class059742, class00869.Rm.W(), n + 2, n2, n3, class051632);
                this.L(class059742, class00869.ur.W(), n + 1, n2, n3, class051632);
                this.L(class059742, (class00500)class00869.ur.W().y((class08092)class07196.L, (Comparable)class08059.field_12609), n + 1, n2 + 1, n3, class051632);
                this.L(class059742, (class00500)class00869.iP.W().y((class08092)class00889.R, (Comparable)class07211.field_11043), n + 2, n2 + 1, n3 + 1, class051632);
                this.L(class059742, (class00500)class00869.iP.W().y((class08092)class00889.R, (Comparable)class07211.field_11035), n + 2, n2 + 1, n3 - 1, class051632);
            }
        }
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        class070012.N("EntryDoor", class04900.field_56683, (Object)this.i);
    }
}

