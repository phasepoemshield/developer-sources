/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class05765
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
import minecraft.class05751;
import minecraft.class05765;
import minecraft.class06537;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class06545
extends class05765<class07475> {
    double N;
    float y;

    private boolean L(class07475 class074752) {
        class07438 class074382 = this.y(class074752);
        return class074752.method_5649(class074382.method_23317(), class074382.method_23318(), class074382.method_23321()) > (double)this.y;
    }

    protected void L(class04782 class047822, class07475 class074752, long l) {
        class07438 class074382 = this.y(class074752);
        class07049 class070492 = class074752.method_5668();
        float f = 1.0f;
        if (class070492 instanceof class07079) {
            f = ((class07079)class070492).K_();
        }
        class074752.method_18868().N(class05378.P, (Object)new class05751((class07049)class074382, true));
        class074752.f().N((class07049)class074382, (double)f * this.N);
    }

    public class06545(double d, float f) {
        super(Map.of(class05378.NE, class05367.field_18457));
        this.N = d;
        this.y = f * f;
    }

    protected void u(class04782 class047822, class07475 class074752, long l) {
        class074752.f().W();
        class074752.method_18868().N(class05378.NE, (Object)class06537.field_64630);
    }

    private @Nullable class07438 y(class07475 class074752) {
        return class074752.method_18868().L(class05378.s).orElse(null);
    }

    protected boolean y(class04782 class047822, class07475 class074752, long l) {
        return this.N(class074752) && this.L(class074752);
    }

    protected boolean N(long l) {
        return false;
    }

    private boolean N(class07475 class074752) {
        return this.y(class074752) != null && class074752.method_6047().L(class02484.X);
    }

    protected void N(class04782 class047822, class07475 class074752, long l) {
        class074752.R(true);
        class074752.method_18868().N(class05378.NE, (Object)class06537.field_64629);
        super.u(class047822, (class07438)class074752, l);
    }

    protected boolean N(class04782 class047822, class07475 class074752) {
        return this.N(class074752) && !class074752.method_6115();
    }
}

