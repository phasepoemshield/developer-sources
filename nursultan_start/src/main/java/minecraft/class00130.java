/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class04474
 *  minecraft.class04680
 *  minecraft.class06090
 *  minecraft.class06128
 *  minecraft.class06202
 *  minecraft.class08762
 *  minecraft.class08764
 *  minecraft.class08966
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class04474;
import minecraft.class04680;
import minecraft.class06090;
import minecraft.class06128;
import minecraft.class06202;
import minecraft.class08762;
import minecraft.class08764;
import minecraft.class08966;
import org.jspecify.annotations.Nullable;

public class class00130
implements class08762 {
    private static final int N = 40;
    private static final int y = 40;
    private static final int L = 100;
    private static final int u = 20;
    private static final int i = -1;
    private static final class00392 R = class00392.N((String)"tutorial.move.title", (Object[])new Object[]{class08764.N((String)"forward"), class08764.N((String)"left"), class08764.N((String)"back"), class08764.N((String)"right")});
    private static final class00392 M = class00392.N((String)"tutorial.move.description", (Object[])new Object[]{class08764.N((String)"jump")});
    private static final class00392 B = class00392.L((String)"tutorial.look.title");
    private static final class00392 Z = class00392.L((String)"tutorial.look.description");
    private final class08764 z;
    private @Nullable class06128 U;
    private @Nullable class06128 E;
    private int W;
    private int m;
    private int P;
    private boolean s;
    private boolean T;
    private int b = -1;
    private int j = -1;

    public class00130(class08764 class087642) {
        this.z = class087642;
    }

    public void y() {
        if (this.U != null) {
            this.U.B();
            this.U = null;
        }
        if (this.E != null) {
            this.E.B();
            this.E = null;
        }
    }

    public void N(class04474 class044742) {
        if (class044742.field_54155.N() || class044742.field_54155.y() || class044742.field_54155.L() || class044742.field_54155.u() || class044742.field_54155.i()) {
            this.s = true;
        }
    }

    public void N(double d, double d2) {
        if (Math.abs(d) > 0.01 || Math.abs(d2) > 0.01) {
            this.T = true;
        }
    }

    public void N() {
        ++this.W;
        if (this.s) {
            ++this.m;
            this.s = false;
        }
        if (this.T) {
            ++this.P;
            this.T = false;
        }
        if (this.b == -1 && this.m > 40) {
            if (this.U != null) {
                this.U.B();
                this.U = null;
            }
            this.b = this.W;
        }
        if (this.j == -1 && this.P > 40) {
            if (this.E != null) {
                this.E.B();
                this.E = null;
            }
            this.j = this.W;
        }
        if (this.b != -1 && this.j != -1) {
            if (this.z.R()) {
                this.z.N(class08966.field_5648);
            } else {
                this.z.N(class08966.field_5653);
            }
        }
        if (this.U != null) {
            this.U.N((float)this.m / 40.0f);
        }
        if (this.E != null) {
            this.E.N((float)this.P / 40.0f);
        }
        if (this.W >= 100) {
            class06202 class062022 = this.z.i();
            if (this.b == -1 && this.U == null) {
                this.U = new class06128((class01590)class062022.i_3, class06090.field_2230, R, M, true);
                class062022.m().N((class04680)this.U);
            } else if (this.b != -1 && this.W - this.b >= 20 && this.j == -1 && this.E == null) {
                this.E = new class06128((class01590)class062022.i_3, class06090.field_2237, B, Z, true);
                class062022.m().N((class04680)this.E);
            }
        }
    }
}

