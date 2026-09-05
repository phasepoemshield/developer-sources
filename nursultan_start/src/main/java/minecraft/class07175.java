/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class06069
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07473
 */
package minecraft;

import minecraft.class00891;
import minecraft.class06069;
import minecraft.class07049;
import minecraft.class07137;
import minecraft.class07147;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07473;

class class07175
extends class07473 {
    private final class07147 N;
    private int y;

    public void M() {
        if (this.y == 0) {
            this.y = this.N(20);
        }
    }

    public class07175(class07147 class071472) {
        this.N = class071472;
    }

    public void i() {
        --this.y;
        if (this.y <= 0) {
            class07299 class072992 = this.N.method_73183();
            class06069 class060692 = this.N.method_59922();
            class07209 class072092 = this.N.method_24515();
            int n = 0;
            block0: while (n <= 5 && n >= -5) {
                int n2 = 0;
                while (n2 <= 10 && n2 >= -10) {
                    int n3 = 0;
                    while (n3 <= 10 && n3 >= -10) {
                        class07209 class072093 = class072092.method_10069(n2, n, n3);
                        class00891 class008912 = class072992.method_8320(class072093).i();
                        if (class008912 instanceof class07137) {
                            if (((Boolean)class07175.N_18((class07299)class072992).method_64395().N(class07305.I)).booleanValue()) {
                                class072992.N(class072093, true, (class07049)this.N);
                            } else {
                                class072992.method_8652(class072093, ((class07137)class008912).T(class072992.method_8320(class072093)), 3);
                            }
                            if (class060692.Z()) break block0;
                        }
                        n3 = (n3 <= 0 ? 1 : 0) - n3;
                    }
                    n2 = (n2 <= 0 ? 1 : 0) - n2;
                }
                n = (n <= 0 ? 1 : 0) - n;
            }
        }
    }

    public boolean N() {
        return this.y > 0;
    }
}

