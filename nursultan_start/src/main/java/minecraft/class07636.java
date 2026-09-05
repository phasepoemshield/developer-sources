/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01210
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07789
 *  minecraft.class08036
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01210;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07617;
import minecraft.class07789;
import minecraft.class08036;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

class class07636
extends class07473 {
    private final class07617 N;
    private @Nullable class08036 y;
    private @Nullable class07209 L;
    private int u;

    public void L() {
        if (this.L != null) {
            this.N.B(false);
            this.N.f().N((double)this.L.method_10263(), (double)this.L.method_10264(), (double)this.L.method_10260(), 1.1f);
        }
    }

    private boolean M() {
        for (class07617 class076172 : this.N.method_73183().N(class07617.class, new class00734(this.L).M(2.0))) {
            if (class076172 == this.N || !class076172.W() && !class076172.m()) continue;
            return true;
        }
        return false;
    }

    public class07636(class07617 class076172) {
        this.N = class076172;
    }

    private void Z() {
        class06069 class060692 = this.N.method_59922();
        class07218 class072182 = new class07218();
        class072182.N((class00753)(this.N.g_() ? this.N.yW().method_24515() : this.N.method_24515()));
        this.N.method_6082(class072182.method_10263() + class060692.y(11) - 5, class072182.method_10264() + class060692.y(5) - 2, class072182.method_10260() + class060692.y(11) - 5, false);
        class072182.N((class00753)this.N.method_24515());
        this.N.method_64169(class07636.N((class07049)this.N), class06273.NT, (class047822, class065842) -> class047822.method_8649((class07049)new class00717((class07299)class047822, (double)class072182.method_10263() - (double)class04995.m((double)(((class07438)this.N).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * ((float)Math.PI / 180))), (double)class072182.method_10264(), (double)class072182.method_10260() + (double)class04995.P((double)(((class07438)this.N).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * ((float)Math.PI / 180))), class065842)));
    }

    public void i() {
        if (this.y != null && this.L != null) {
            this.N.B(false);
            this.N.f().N((double)this.L.method_10263(), (double)this.L.method_10264(), (double)this.L.method_10260(), 1.1f);
            if (this.N.method_5858((class07049)this.y) < 2.5) {
                ++this.u;
                if (this.u > this.N(16)) {
                    this.N.N(true);
                    this.N.z(false);
                } else {
                    this.N.N((class07049)this.y, 45.0f, 45.0f);
                    this.N.z(true);
                }
            } else {
                this.N.N(false);
            }
        }
    }

    public void u() {
        this.N.N(false);
        if (this.y.method_7297() >= 100 && this.N.method_73183().method_8409().z() < ((Float)this.N.method_73183().method_75728().N(class00608.c, this.N.method_73189())).floatValue()) {
            this.Z();
        }
        this.u = 0;
        this.N.z(false);
        this.N.f().W();
    }

    public boolean y() {
        return this.N.NQ() && !this.N.NJ() && this.y != null && this.y.method_6113() && this.L != null && !this.M();
    }

    public boolean N() {
        if (!this.N.NQ()) {
            return false;
        }
        if (this.N.NJ()) {
            return false;
        }
        class07438 class074382 = this.N.L_();
        if (class074382 instanceof class08036) {
            class08036 class080362;
            this.y = class080362 = (class08036)class074382;
            if (!class074382.method_6113()) {
                return false;
            }
            if (this.N.method_5858((class07049)this.y) > 100.0) {
                return false;
            }
            class07209 class072092 = this.y.method_24515();
            class00500 class005002 = this.N.method_73183().method_8320(class072092);
            if (class005002.N(class01210.F)) {
                this.L = class005002.u((class08092)class07789.R).map(class072112 -> class072092.method_10093(class072112.b())).orElseGet(() -> new class07209((class00753)class072092));
                return !this.M();
            }
        }
        return false;
    }
}

