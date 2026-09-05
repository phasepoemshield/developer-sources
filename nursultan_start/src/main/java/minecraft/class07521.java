/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08024
 */
package minecraft;

import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07523;
import minecraft.class08024;

class class07521
extends class07473 {
    private final class07523 y;
    public int N;

    @Override
    public void L() {
        this.N = 0;
    }

    public class07521(class07523 class075232) {
        this.y = class075232;
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public void i() {
        class07438 class074382 = this.y.T();
        if (class074382 == null) {
            return;
        }
        double d = 64.0;
        if (class074382.method_5858((class07049)this.y) < 4096.0 && this.y.method_6057((class07049)class074382)) {
            class07299 class072992 = this.y.method_73183();
            ++this.N;
            if (this.N == 10 && !this.y.method_5701()) {
                class072992.method_8444(null, 1015, this.y.method_24515(), 0);
            }
            if (this.N == 20) {
                double d2 = 4.0;
                class06889 class068892 = this.y.method_5828(1.0f);
                double d3 = class074382.method_23317() - (this.y.method_23317() + class068892.M * 4.0);
                double d4 = class074382.method_23323(0.5) - (0.5 + this.y.method_23323(0.5));
                double d5 = class074382.method_23321() - (this.y.method_23321() + class068892.Z * 4.0);
                class06889 class068893 = new class06889(d3, d4, d5);
                if (!this.y.method_5701()) {
                    class072992.method_8444(null, 1016, this.y.method_24515(), 0);
                }
                class08024 class080242 = new class08024(class072992, (class07438)this.y, class068893.u(), this.y.B());
                class080242.method_5814(this.y.method_23317() + class068892.M * 4.0, this.y.method_23323(0.5) + 0.5, class080242.method_23321() + class068892.Z * 4.0);
                class072992.method_8649((class07049)class080242);
                this.N = -40;
            }
        } else if (this.N > 0) {
            --this.N;
        }
        this.y.N(this.N > 10);
    }

    @Override
    public void u() {
        this.y.N(false);
    }

    @Override
    public boolean N() {
        return this.y.T() != null;
    }
}

