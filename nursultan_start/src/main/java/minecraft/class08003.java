/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01325
 *  minecraft.class01929
 *  minecraft.class02204
 *  minecraft.class02484
 *  minecraft.class05668
 *  minecraft.class06113
 *  minecraft.class06145
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07092
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07628
 */
package minecraft;

import java.util.Optional;
import minecraft.class01325;
import minecraft.class01929;
import minecraft.class02204;
import minecraft.class02484;
import minecraft.class05668;
import minecraft.class06113;
import minecraft.class06145;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07092;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07628;

public class class08003
extends class05668 {
    private static final class01325 N = class01325.L((float)0.0f, (float)0.0f);

    public void method_5711(byte by) {
        if (by == 3) {
            double d = 0.08;
            for (int i = 0; i < 8; ++i) {
                this.method_73183().method_8406((class07126)new class07092(class07107.S, this.L()), this.method_23317(), this.method_23318(), this.method_23321(), ((double)this.field_5974.z() - 0.5) * 0.08, ((double)this.field_5974.z() - 0.5) * 0.08, ((double)this.field_5974.z() - 0.5) * 0.08);
            }
        }
    }

    public class08003(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        super(class07078.a, d, d2, d3, class072992, class065842);
    }

    public class08003(class07299 class072992, class07438 class074382, class06584 class065842) {
        super(class07078.a, class074382, class072992, class065842);
    }

    public class08003(class07078<? extends class08003> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected void N(class06145 class061452) {
        super.N(class061452);
        class061452.L().method_64419(this.method_48923().y((class07049)this, this.z()), 0.0f);
    }

    protected class06581 N() {
        return class06570.jO;
    }

    protected void N(class07089 class070892) {
        super.N(class070892);
        if (!this.method_73183().method_8608()) {
            if (this.field_5974.y(8) == 0) {
                int n = 1;
                if (this.field_5974.y(32) == 0) {
                    n = 4;
                }
                for (int i = 0; i < n; ++i) {
                    class07628 class076282 = (class07628)class07078.Q.N(this.method_73183(), class06113.field_16461);
                    if (class076282 == null) continue;
                    class076282.u(-24000);
                    class076282.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0f);
                    Optional.ofNullable((class02204)this.L().method_58694(class02484.Np)).flatMap(class022042 -> class022042.N((class01929)this.method_56673())).ifPresent(arg_0 -> ((class07628)class076282).N(arg_0));
                    if (!class076282.method_60490(N)) break;
                    this.method_73183().method_8649((class07049)class076282);
                }
            }
            this.method_73183().method_8421((class07049)this, (byte)3);
            this.method_31472();
        }
    }
}

