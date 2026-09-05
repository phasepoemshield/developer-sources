/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class04887
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06073
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01154;
import minecraft.class01175;
import minecraft.class01191;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class04887;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06073;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;

public class class01158
extends class06391<class01154> {
    public class01158(Codec<class01154> codec) {
        super(codec);
    }

    private boolean y(class05974 class059742, class07209 class072092) {
        class00500 class005002 = class059742.method_8320(class072092);
        if (class005002.N(class00869.K) || class005002.N(class00869.vF) || class005002.N(class00869.vp)) {
            return false;
        }
        if (class059742.method_8320(class072092.method_10084()).Y().N(class01231.N)) {
            return false;
        }
        for (class07211 class072112 : class07221.field_11062) {
            if (this.N((class07284)class059742, class072092.method_10093(class072112))) continue;
            return false;
        }
        return this.N((class07284)class059742, class072092.method_10074());
    }

    private boolean N(class07284 class072842, class07209 class072092) {
        class00500 class005002 = class072842.method_8320(class072092);
        return class005002.N(class01210.yb) || class005002.Y().N(class01231.N);
    }

    private void N(class05974 class059742, class07209 class072092, int n, class07211 class072112) {
        class07218 class072182 = class072092.method_25503();
        for (int i = 0; i < n; ++i) {
            if (!class01175.L((class07284)class059742, (class07209)class072182)) {
                return;
            }
            class072182.N(class072112);
        }
    }

    private double N(int n, int n2, int n3, int n4, class01154 class011542) {
        int n5 = n - Math.abs(n3);
        int n6 = n2 - Math.abs(n4);
        return class04995.y((float)Math.min(n5, n6), (float)0.0f, (float)class011542.E, (float)class011542.U, (float)1.0f);
    }

    private static float N(class06069 class060692, float f, float f2, float f3, float f4) {
        return class06073.N((class06069)class060692, (float)f3, (float)f4, (float)f, (float)f2);
    }

    private void N(class05974 class059742, class06069 class060692, class07209 class072092, int n, int n2, float f, double d, int n3, float f2, class01154 class011542) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        boolean bl;
        class01191 class011912;
        Optional<class01191> var12 = class01191.N((class04887)class059742, class072092, class011542.y, class01175::L, class01175::u);
        if (var12.isEmpty()) {
            return;
        }
        OptionalInt optionalInt = var12.get().y();
        OptionalInt optionalInt2 = var12.get().L();
        if (optionalInt.isEmpty() && optionalInt2.isEmpty()) {
            return;
        }
        if (class060692.z() < f && optionalInt2.isPresent() && this.y(class059742, class072092.method_33096(optionalInt2.getAsInt()))) {
            int n10 = optionalInt2.getAsInt();
            class011912 = var12.get().N(OptionalInt.of(n10 - 1));
            class059742.method_8652(class072092.method_33096(n10), class00869.K.W(), 2);
        } else {
            class011912 = var12.get();
        }
        OptionalInt optionalInt3 = class011912.L();
        boolean bl2 = bl = class060692.U() < d;
        if (optionalInt.isPresent() && bl && !this.N((class05487)class059742, class072092.method_33096(optionalInt.getAsInt()))) {
            n9 = class011542.B.N(class060692);
            this.N(class059742, class072092.method_33096(optionalInt.getAsInt()), n9, class07211.field_11036);
            n8 = optionalInt3.isPresent() ? Math.min(n3, optionalInt.getAsInt() - optionalInt3.getAsInt()) : n3;
            n7 = this.N(class060692, n, n2, f2, n8, class011542);
        } else {
            n7 = 0;
        }
        int n11 = n8 = class060692.U() < d ? 1 : 0;
        if (optionalInt3.isPresent() && n8 != 0 && !this.N((class05487)class059742, class072092.method_33096(optionalInt3.getAsInt()))) {
            n6 = class011542.B.N(class060692);
            this.N(class059742, class072092.method_33096(optionalInt3.getAsInt()), n6, class07211.field_11033);
            n9 = optionalInt.isPresent() ? Math.max(0, n7 + class04995.y((class06069)class060692, (int)(-class011542.i), (int)class011542.i)) : this.N(class060692, n, n2, f2, n3, class011542);
        } else {
            n9 = 0;
        }
        if (optionalInt.isPresent() && optionalInt3.isPresent() && optionalInt.getAsInt() - n7 <= optionalInt3.getAsInt() + n9) {
            n5 = optionalInt3.getAsInt();
            int n12 = optionalInt.getAsInt();
            int n13 = Math.max(n12 - n7, n5 + 1);
            int n14 = Math.min(n5 + n9, n12 - 1);
            int n15 = class04995.y((class06069)class060692, (int)n13, (int)(n14 + 1));
            int n16 = n15 - 1;
            n6 = n12 - n15;
            n4 = n16 - n5;
        } else {
            n6 = n7;
            n4 = n9;
        }
        int n17 = n5 = class060692.Z() && n6 > 0 && n4 > 0 && class011912.u().isPresent() && n6 + n4 == class011912.u().getAsInt() ? 1 : 0;
        if (optionalInt.isPresent()) {
            class01175.N((class07284)class059742, class072092.method_33096(optionalInt.getAsInt() - 1), class07211.field_11033, n6, n5 != 0);
        }
        if (optionalInt3.isPresent()) {
            class01175.N((class07284)class059742, class072092.method_33096(optionalInt3.getAsInt() + 1), class07211.field_11036, n4, n5 != 0);
        }
    }

    private boolean N(class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092).N(class00869.V);
    }

    private int N(class06069 class060692, int n, int n2, float f, int n3, class01154 class011542) {
        if (class060692.z() > f) {
            return 0;
        }
        float f2 = (float)class04995.N((double)(Math.abs(n) + Math.abs(n2)), (double)0.0, (double)class011542.W, (double)((double)n3 / 2.0), (double)0.0);
        return (int)class01158.N(class060692, 0.0f, n3, f2, class011542.M);
    }

    public boolean N(class06058<class01154> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class01154 class011542 = (class01154)class060582.R();
        class06069 class060692 = class060582.u();
        if (!class01175.N((class07284)class059742, class072092)) {
            return false;
        }
        int n = class011542.L.N(class060692);
        float f = class011542.z.N(class060692);
        float f2 = class011542.Z.N(class060692);
        int n2 = class011542.u.N(class060692);
        int n3 = class011542.u.N(class060692);
        for (int i = -n2; i <= n2; ++i) {
            for (int j = -n3; j <= n3; ++j) {
                double d = this.N(n2, n3, i, j, class011542);
                class07209 class072093 = class072092.method_10069(i, 0, j);
                this.N(class059742, class060692, class072093, i, j, f, d, n, f2, class011542);
            }
        }
        return true;
    }
}

