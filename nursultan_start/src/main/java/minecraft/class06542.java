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
 *  minecraft.class07050
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class08174
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.Optional;
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
import minecraft.class07050;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class08174;
import org.jspecify.annotations.Nullable;

public class class06542
extends class05765<class07475> {
    public static final int N = 6;
    public static final int y = 7;
    double L;
    double u;
    float i;
    float R;

    private int L(class07475 class074752) {
        return Optional.ofNullable((class08174)class074752.method_6047().method_58694(class02484.X)).map(class08174::N).orElse(0);
    }

    protected void L(class04782 class047822, class07475 class074752, long l) {
        class07438 class074382 = this.N(class074752);
        double d = class074752.method_5649(class074382.method_23317(), class074382.method_23318(), class074382.method_23321());
        class07049 class070492 = class074752.method_5668();
        float f = 1.0f;
        if (class070492 instanceof class07079) {
            class07079 class070792 = (class07079)class070492;
            f = class070792.K_();
        }
        int n = class074752.method_5765() ? 2 : 0;
        class074752.method_18868().N(class05378.P, (Object)new class05751((class07049)class074382, true));
        class074752.method_18868().N(class05378.NU, (Object)(class074752.method_18868().L(class05378.NU).orElse(0) - 1));
        class06889 class068892 = class074752.method_18868().L(class05378.Nz).orElse(null);
        if (class068892 != null) {
            class074752.f().N(class068892.M, class068892.B, class068892.Z, (double)f * this.u);
            if (class074752.f().U()) {
                class074752.method_18868().y(class05378.Nz);
            }
        } else {
            class074752.f().N((class07049)class074382, (double)f * this.L);
            if (d < (double)this.R || class074752.f().U()) {
                double d2 = Math.sqrt(d);
                class06889 class068893 = class05456.N((class07475)class074752, (double)((double)(6 + n) - d2), (double)((double)(7 + n) - d2), (int)7, (class06889)class074382.method_73189());
                class074752.method_18868().N(class05378.Nz, (Object)class068893);
            }
        }
    }

    public class06542(double d, double d2, float f, float f2) {
        super(Map.of(class05378.NE, class05367.field_18456));
        this.L = d;
        this.u = d2;
        this.i = f * f;
        this.R = f2 * f2;
    }

    protected void u(class04782 class047822, class07475 class074752, long l) {
        class074752.f().W();
        class074752.method_6021();
        class074752.method_18868().y(class05378.Nz);
        class074752.method_18868().y(class05378.NU);
        class074752.method_18868().N(class05378.NE, (Object)class06537.field_64631);
    }

    private boolean y(class07475 class074752) {
        return this.N(class074752) != null && class074752.method_6047().L(class02484.X);
    }

    protected boolean y(class04782 class047822, class07475 class074752, long l) {
        return class074752.method_18868().L(class05378.NU).orElse(0) > 0 && this.y(class074752);
    }

    private @Nullable class07438 N(class07475 class074752) {
        return class074752.method_18868().L(class05378.s).orElse(null);
    }

    protected boolean N(class04782 class047822, class07475 class074752) {
        return class074752.method_18868().L(class05378.NE).orElse(class06537.field_64629) == class06537.field_64630 && this.y(class074752) && !class074752.method_6115();
    }

    protected boolean N(long l) {
        return false;
    }

    protected void N(class04782 class047822, class07475 class074752, long l) {
        class074752.R(true);
        class074752.method_18868().N(class05378.NU, (Object)this.L(class074752));
        class074752.method_18868().y(class05378.Nz);
        class074752.method_6019(class07050.field_5808);
        super.u(class047822, (class07438)class074752, l);
    }
}

