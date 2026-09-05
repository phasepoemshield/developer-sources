/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00753;
import minecraft.class00869;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07633;
import minecraft.class07637;
import minecraft.class08036;

class class07620
extends class07434 {
    private final class07637 u;
    private int i;

    private boolean M() {
        class07209 class072092 = this.u.method_24515();
        class07218 class072182 = new class07218();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 8; ++j) {
                int n = 0;
                while (n <= j) {
                    int n2;
                    int n3 = n2 = n < j && n > -j ? j : 0;
                    while (n2 <= j) {
                        class072182.N((class00753)class072092, n, i, n2);
                        if (this.y.method_8320((class07209)class072182).N(class00869.mx)) {
                            return true;
                        }
                        n2 = n2 > 0 ? -n2 : 1 - n2;
                    }
                    n = n > 0 ? -n : 1 - n;
                }
            }
        }
        return false;
    }

    public class07620(class07637 class076372, double d) {
        super((class07633)class076372, d);
        this.u = class076372;
    }

    public boolean N() {
        if (super.N() && this.u.B() == 0) {
            if (!this.M()) {
                if (this.i <= this.u.field_6012) {
                    this.u.N(32);
                    this.i = this.u.field_6012 + 600;
                    if (this.u.method_6034()) {
                        class08036 class080362 = this.y.N(class07637.N, (class07438)this.u);
                        this.u.R.N((class07438)class080362);
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }
}

