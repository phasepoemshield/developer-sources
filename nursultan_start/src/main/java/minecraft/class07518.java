/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07067
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07067;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07504;
import minecraft.class08036;

public class class07518
extends class07504 {
    private float y;
    private float L;

    @Override
    public class06584 method_31480() {
        return new class06584((class07310)class06570.sZ);
    }

    @Override
    public void method_5773() {
        double d = this.method_36454();
        class06889 class068892 = this.method_73189();
        super.method_5773();
        double d2 = ((double)this.method_36454() - d) % 360.0;
        if (this.method_73183().method_8608() && class068892.R(this.method_73189()) > 0.01) {
            this.y += (float)d2;
            this.y %= 360.0f;
        }
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        if (!class080362.method_21823() && !this.method_5782() && (this.method_73183().method_8608() || class080362.method_5804((class07049)this))) {
            this.L = this.y;
            if (!this.method_73183().method_8608()) {
                return class080362.method_5804((class07049)this) ? class07082.L : class07082.i;
            }
            return class07082.N;
        }
        return class07082.i;
    }

    protected void method_5865(class07049 class070492, class07067 class070672) {
        class08036 class080362;
        super.method_5865(class070492, class070672);
        if (this.method_73183().method_8608() && class070492 instanceof class08036 && (class080362 = (class08036)class070492).method_61498() && class07518.N(this.method_73183())) {
            float f = (float)class04995.i((double)0.5, (double)this.L, (double)this.y);
            class080362.method_36456(class080362.method_36454() - (f - this.L));
            this.L = f;
        }
    }

    public class07518(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    @Override
    public boolean Z() {
        return true;
    }

    protected class06581 z() {
        return class06570.sZ;
    }

    @Override
    public void N(class04782 class047822, int n, int n2, int n3, boolean bl) {
        if (bl) {
            if (this.method_5782()) {
                this.method_5772();
            }
            if (this.G() == 0) {
                this.L(-this.l());
                this.y(10);
                this.y(50.0f);
                this.method_5785();
            }
        }
    }
}

