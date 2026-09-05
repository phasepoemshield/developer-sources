/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05456
 *  minecraft.class05751
 *  minecraft.class05765
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import minecraft.class02484;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05456;
import minecraft.class05751;
import minecraft.class05765;
import minecraft.class06537;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class06547
extends class05765<class07475> {
    public static final int N = 9;
    public static final int y = 11;
    public static final int L = 100;
    double u;

    protected void L(class04782 class047822, class07475 class074752, long l) {
        class07438 class074382 = this.N(class074752);
        class07049 class070492 = class074752.method_5668();
        float f = class070492 instanceof class07079 ? ((class07079)class070492).K_() : 1.0f;
        class074752.method_18868().N(class05378.P, (Object)new class05751((class07049)class074382, true));
        class074752.method_18868().N(class05378.NB, (Object)(class074752.method_18868().L(class05378.NB).orElse(0) + 1));
        class074752.method_18868().L(class05378.NZ).ifPresent(class068892 -> class074752.f().N(class068892.M, class068892.B, class068892.Z, (double)f * this.u));
    }

    public class06547(double d) {
        super(Map.of(class05378.NE, class05367.field_18456), 100);
        this.u = d;
    }

    protected void u(class04782 class047822, class07475 class074752, long l) {
        class074752.f().W();
        class074752.R(false);
        class074752.method_6021();
        class074752.method_18868().y(class05378.NB);
        class074752.method_18868().y(class05378.NZ);
        class074752.method_18868().y(class05378.NE);
    }

    private boolean y(class07475 class074752) {
        return this.N(class074752) != null && class074752.method_6047().L(class02484.X);
    }

    protected boolean y(class04782 class047822, class07475 class074752, long l) {
        return class074752.method_18868().L(class05378.NB).orElse(100) < 100 && class074752.method_18868().L(class05378.NZ).isPresent() && !class074752.f().U() && this.y(class074752);
    }

    private @Nullable class07438 N(class07475 class074752) {
        return class074752.method_18868().L(class05378.s).orElse(null);
    }

    protected void N(class04782 class047822, class07475 class074752, long l) {
        class074752.R(true);
        class074752.method_18868().N(class05378.NB, (Object)0);
        super.u(class047822, (class07438)class074752, l);
    }

    protected boolean N(class04782 class047822, class07475 class074752) {
        double d;
        if (!this.y(class074752) || class074752.method_6115()) {
            return false;
        }
        if (class074752.method_18868().L(class05378.NE).orElse(class06537.field_64629) != class06537.field_64631) {
            return false;
        }
        class07438 class074382 = this.N(class074752);
        double d2 = class074752.method_5649(class074382.method_23317(), class074382.method_23318(), class074382.method_23321());
        int n = class074752.method_5765() ? 2 : 0;
        class06889 class068892 = class05456.N((class07475)class074752, (double)Math.max(0.0, (double)(9 + n) - (d = Math.sqrt(d2))), (double)Math.max(1.0, (double)(11 + n) - d), (int)7, (class06889)class074382.method_73189());
        if (class068892 == null) {
            return false;
        }
        class074752.method_18868().N(class05378.NZ, (Object)class068892);
        return true;
    }
}

