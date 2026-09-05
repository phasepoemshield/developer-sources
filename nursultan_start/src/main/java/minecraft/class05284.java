/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class05302;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import org.jspecify.annotations.Nullable;

public class class05284
extends class06391<class05302> {
    private static final ImmutableList<class00891> NE = ImmutableList.of((Object)class00869.V, (Object)class00869.q, (Object)class00869.EI, (Object)class00869.iw, (Object)class00869.ML, (Object)class00869.Mu, (Object)class00869.Mi, (Object)class00869.MR, (Object)class00869.LA, (Object)class00869.La);
    private static final int NW = 5;
    private static final int Nm = 50;
    private static final int NP = 8;
    private static final int Ns = 15;

    public class05284(Codec<class05302> codec) {
        super(codec);
    }

    private static boolean N(class07284 class072842, int n, class07218 class072182) {
        if (class05284.N(class072842, n, (class07209)class072182)) {
            class00500 class005002 = class072842.method_8320((class07209)class072182.N(class07211.field_11033));
            class072182.N(class07211.field_11036);
            return !class005002.P() && !NE.contains((Object)class005002.i());
        }
        return false;
    }

    private static boolean N(class07284 class072842, int n, class07209 class072092) {
        class00500 class005002 = class072842.method_8320(class072092);
        return class005002.P() || class005002.N(class00869.V) && class072092.method_10264() <= n;
    }

    private static @Nullable class07209 N(class07284 class072842, class07218 class072182, int n) {
        while (class072182.method_10264() <= class072842.method_31600() && n > 0) {
            --n;
            class00500 class005002 = class072842.method_8320((class07209)class072182);
            if (NE.contains((Object)class005002.i())) {
                return null;
            }
            if (class005002.P()) {
                return class072182;
            }
            class072182.N(class07211.field_11036);
        }
        return null;
    }

    public boolean N(class06058<class05302> class060582) {
        int n = class060582.L().R();
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class05302 class053022 = (class05302)class060582.R();
        if (!class05284.N((class07284)class059742, n, class072092.method_25503())) {
            return false;
        }
        int n2 = class053022.y().N(class060692);
        boolean bl = class060692.z() < 0.9f;
        int n3 = Math.min(n2, bl ? 5 : 8);
        int n4 = bl ? 50 : 15;
        boolean bl2 = false;
        for (class07209 class072093 : class07209.method_27156((class06069)class060692, (int)n4, (int)(class072092.method_10263() - n3), (int)class072092.method_10264(), (int)(class072092.method_10260() - n3), (int)(class072092.method_10263() + n3), (int)class072092.method_10264(), (int)(class072092.method_10260() + n3))) {
            int n5 = n2 - class072093.method_19455((class00753)class072092);
            if (n5 < 0) continue;
            bl2 |= this.N((class07284)class059742, n, class072093, n5, class053022.N().N(class060692));
        }
        return bl2;
    }

    private static @Nullable class07209 N(class07284 class072842, int n, class07218 class072182, int n2) {
        while (class072182.method_10264() > class072842.method_31607() + 1 && n2 > 0) {
            --n2;
            if (class05284.N(class072842, n, class072182)) {
                return class072182;
            }
            class072182.N(class07211.field_11033);
        }
        return null;
    }

    private boolean N(class07284 class072842, int n, class07209 class072092, int n2, int n3) {
        boolean bl = false;
        block0: for (class07209 class072093 : class07209.method_10094((int)(class072092.method_10263() - n3), (int)class072092.method_10264(), (int)(class072092.method_10260() - n3), (int)(class072092.method_10263() + n3), (int)class072092.method_10264(), (int)(class072092.method_10260() + n3))) {
            class07209 class072094;
            int n4 = class072093.method_19455((class00753)class072092);
            class07209 class072095 = class072094 = class05284.N(class072842, n, class072093) ? class05284.N(class072842, n, class072093.method_25503(), n4) : class05284.N(class072842, class072093.method_25503(), n4);
            if (class072094 == null) continue;
            class07218 class072182 = class072094.method_25503();
            for (int i = n2 - n4 / 2; i >= 0; --i) {
                if (class05284.N(class072842, n, (class07209)class072182)) {
                    this.N((class00807)class072842, (class07209)class072182, class00869.iY.W());
                    class072182.N(class07211.field_11036);
                    bl = true;
                    continue;
                }
                if (!class072842.method_8320((class07209)class072182).N(class00869.iY)) continue block0;
                class072182.N(class07211.field_11036);
            }
        }
        return bl;
    }
}

