/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01402
 *  minecraft.class02102
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class05914
 *  minecraft.class06428
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01402;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class05914;
import minecraft.class06428;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class01827
extends class05914 {
    private static final class00392 L = class00392.L((String)"controls.keybinds.title");
    public @Nullable class06428 N;
    public long y;
    private class01402 u;
    private class05362 i;

    public class01827(class05096 class050962, class05630 class056302) {
        super(class050962, class056302, L);
    }

    public boolean method_25404(class06601 class066012) {
        if (this.N != null) {
            if (class066012.i()) {
                this.N.y(class04655.yI);
            } else {
                this.N.y(class04655.N((class06601)class066012));
            }
            this.N = null;
            this.y = class07536.L();
            this.u.y();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        this.field_49503.N();
        this.u.method_57712(this.field_22789, this.field_49503);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        boolean bl = false;
        class06428[] class06428Array = this.field_21336.Nn;
        int n3 = class06428Array.length;
        for (int i = 0; i < n3; ++i) {
            if (class06428Array[i].P()) continue;
            bl = true;
            break;
        }
        this.i.field_22763 = bl;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.N != null) {
            this.N.y(class04648.field_1672.N(class066132.v()));
            this.N = null;
            this.u.y();
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    protected void method_60325() {
    }

    protected void method_60329() {
        this.u = (class01402)this.field_49503.L((class02102)new class01402(this, this.field_22787));
    }

    protected void method_31387() {
        this.i = class05362.method_46430((class00392)class00392.L((String)"controls.resetAll"), class053622 -> {
            for (class06428 class064282 : this.field_21336.Nn) {
                class064282.y(class064282.E());
            }
            this.u.y();
        }).N();
        class01885 class018852 = (class01885)this.field_49503.y((class02102)class01885.i().N(8));
        class018852.N(this.i);
        class018852.N(class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N());
    }
}

