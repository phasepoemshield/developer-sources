/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class04995
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;

public class class06003
extends class06391<class06225> {
    public class06003(Codec<class06225> codec) {
        super(codec);
    }

    private boolean y(class07284 class072842, class06069 class060692, class07209 class072092) {
        if (class060692.y(10) != 0) {
            class072842.method_8652(class072092, class00869.iY.W(), 2);
            return true;
        }
        return false;
    }

    public boolean N(class06058<class06225> class060582) {
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        if (!class059742.R(class072092) || class059742.R(class072092.method_10084())) {
            return false;
        }
        class07218 class072182 = class072092.method_25503();
        class07218 class072183 = class072092.method_25503();
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        while (class059742.R((class07209)class072182)) {
            if (class059742.method_31606((class07209)class072182)) {
                return true;
            }
            class059742.method_8652((class07209)class072182, class00869.iY.W(), 2);
            bl = bl && this.y((class07284)class059742, class060692, (class07209)class072183.N((class00753)class072182, class07211.field_11043));
            bl2 = bl2 && this.y((class07284)class059742, class060692, (class07209)class072183.N((class00753)class072182, class07211.field_11035));
            bl3 = bl3 && this.y((class07284)class059742, class060692, (class07209)class072183.N((class00753)class072182, class07211.field_11039));
            bl4 = bl4 && this.y((class07284)class059742, class060692, (class07209)class072183.N((class00753)class072182, class07211.field_11034));
            class072182.N(class07211.field_11033);
        }
        class072182.N(class07211.field_11036);
        this.N((class07284)class059742, class060692, (class07209)class072183.N((class00753)class072182, class07211.field_11043));
        this.N((class07284)class059742, class060692, (class07209)class072183.N((class00753)class072182, class07211.field_11035));
        this.N((class07284)class059742, class060692, (class07209)class072183.N((class00753)class072182, class07211.field_11039));
        this.N((class07284)class059742, class060692, (class07209)class072183.N((class00753)class072182, class07211.field_11034));
        class072182.N(class07211.field_11033);
        class07218 class072184 = new class07218();
        for (int i = -3; i < 4; ++i) {
            for (int j = -3; j < 4; ++j) {
                int n = class04995.N((int)i) * class04995.N((int)j);
                if (class060692.y(10) >= 10 - n) continue;
                class072184.N((class00753)class072182.method_10069(i, 0, j));
                int n2 = 3;
                while (class059742.R((class07209)class072183.N((class00753)class072184, class07211.field_11033))) {
                    class072184.N(class07211.field_11033);
                    if (--n2 > 0) continue;
                }
                if (class059742.R((class07209)class072183.N((class00753)class072184, class07211.field_11033))) continue;
                class059742.method_8652((class07209)class072184, class00869.iY.W(), 2);
            }
        }
        return true;
    }

    private void N(class07284 class072842, class06069 class060692, class07209 class072092) {
        if (class060692.Z()) {
            class072842.method_8652(class072092, class00869.iY.W(), 2);
        }
    }
}

