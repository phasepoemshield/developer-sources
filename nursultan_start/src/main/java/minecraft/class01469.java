/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00807
 *  minecraft.class01210
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00807;
import minecraft.class01210;
import minecraft.class01466;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;

public abstract class class01469
extends class06391<class01466> {
    public class01469(Codec<class01466> codec) {
        super(codec);
    }

    protected boolean N(class07284 class072842, class07209 class072092, int n, class07218 class072182, class01466 class014662) {
        int n2 = class072092.method_10264();
        if (n2 < class072842.method_31607() + 1 || n2 + n + 1 > class072842.method_31600()) {
            return false;
        }
        class00500 class005002 = class072842.method_8320(class072092.method_10074());
        if (!class01469.y((class00500)class005002) && !class005002.N(class01210.yE)) {
            return false;
        }
        for (int i = 0; i <= n; ++i) {
            int n3 = this.N(-1, -1, class014662.u, i);
            for (int j = -n3; j <= n3; ++j) {
                for (int k = -n3; k <= n3; ++k) {
                    class00500 class005003 = class072842.method_8320((class07209)class072182.N((class00753)class072092, j, i, k));
                    if (class005003.P() || class005003.N(class01210.H)) continue;
                    return false;
                }
            }
        }
        return true;
    }

    public boolean N(class06058<class01466> class060582) {
        class07218 class072182;
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        class01466 class014662 = (class01466)class060582.R();
        int n = this.N(class060692);
        if (!this.N((class07284)class059742, class072092, n, class072182 = new class07218(), class014662)) {
            return false;
        }
        this.N((class07284)class059742, class060692, class072092, n, class072182, class014662);
        this.N((class07284)class059742, class060692, class072092, class014662, n, class072182);
        return true;
    }

    protected abstract int N(int var1, int var2, int var3, int var4);

    protected abstract void N(class07284 var1, class06069 var2, class07209 var3, int var4, class07218 var5, class01466 var6);

    protected int N(class06069 class060692) {
        int n = class060692.y(3) + 4;
        if (class060692.y(12) == 0) {
            n *= 2;
        }
        return n;
    }

    protected void N(class07284 class072842, class07218 class072182, class00500 class005002) {
        class00500 class005003 = class072842.method_8320((class07209)class072182);
        if (class005003.P() || class005003.N(class01210.LI)) {
            this.N((class00807)class072842, (class07209)class072182, class005002);
        }
    }

    protected void N(class07284 class072842, class06069 class060692, class07209 class072092, class01466 class014662, int n, class07218 class072182) {
        for (int i = 0; i < n; ++i) {
            class072182.N((class00753)class072092).N(class07211.field_11036, i);
            this.N(class072842, class072182, class014662.L.N(class060692, class072092));
        }
    }
}

