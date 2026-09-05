/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07458
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00737;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07458;
import minecraft.class07473;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class07535
extends class07473 {
    private static final int N = 64;
    private final class07079 y;
    private final int L;

    @Override
    public void L() {
        class06889 class068892 = class07535.N(this.y, this.L);
        this.y.F().N(class068892.N(), class068892.y(), class068892.L(), 1.0);
    }

    public class07535(class07079 class070792) {
        this(class070792, 0);
    }

    public class07535(class07079 class070792, int n) {
        this.y = class070792;
        this.L = n;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    @Override
    public boolean y() {
        return false;
    }

    private static class06889 N(class06889 class068892, class06069 class060692) {
        double d = class068892.N() + (double)((class060692.z() * 2.0f - 1.0f) * 16.0f);
        double d2 = class068892.y() + (double)((class060692.z() * 2.0f - 1.0f) * 16.0f);
        double d3 = class068892.L() + (double)((class060692.z() * 2.0f - 1.0f) * 16.0f);
        return new class06889(d, d2, d3);
    }

    private static boolean N(class07299 class072992, class06889 class068892, int n) {
        if (n <= 0) {
            return true;
        }
        class07209 class072092 = class07209.method_49638((class00737)class068892);
        if (!class072992.method_8320(class072092).P()) {
            return false;
        }
        for (class07211 class072112 : class07211.values()) {
            for (int i = 1; i < n; ++i) {
                class07209 class072093 = class072092.method_10079(class072112, i);
                if (class072992.method_8320(class072093).P()) continue;
                return true;
            }
        }
        return false;
    }

    private static @Nullable class06889 N(class07079 class070792, class06889 class068892, class06069 class060692) {
        class06889 class068893 = class07535.N(class068892, class060692);
        if (class070792.Nj() && !class070792.N(class068893)) {
            return null;
        }
        return class068893;
    }

    public static class06889 N(class07079 class070792, int n) {
        class07209 class072092;
        int n2;
        class07299 class072992 = class070792.method_73183();
        class06069 class060692 = class070792.method_59922();
        class06889 class068892 = class070792.method_73189();
        class06889 class068893 = null;
        for (int i = 0; i < 64; ++i) {
            class068893 = class07535.N(class070792, class068892, class060692);
            if (class068893 == null || !class07535.N(class072992, class068893, n)) continue;
            return class068893;
        }
        if (class068893 == null) {
            class068893 = class07535.N(class068892, class060692);
        }
        if ((n2 = class072992.method_8624(class07830.field_13197, (class072092 = class07209.method_49638(class068893)).method_10263(), class072092.method_10260())) < class072092.method_10264() && n2 > class072992.method_31607()) {
            class068893 = new class06889(class068893.N(), class070792.method_23318() - Math.abs(class070792.method_23318() - class068893.y()), class068893.L());
        }
        return class068893;
    }

    @Override
    public boolean N() {
        double d;
        double d2;
        class07458 class074582 = this.y.F();
        if (!class074582.y()) {
            return true;
        }
        double d3 = class074582.u() - this.y.method_23317();
        double d4 = d3 * d3 + (d2 = class074582.i() - this.y.method_23318()) * d2 + (d = class074582.R() - this.y.method_23321()) * d;
        return d4 < 1.0 || d4 > 3600.0;
    }
}

