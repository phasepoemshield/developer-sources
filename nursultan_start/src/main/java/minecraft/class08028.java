/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00473
 *  minecraft.class06145
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07048
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import java.util.List;
import minecraft.class00473;
import minecraft.class06145;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07048;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08039;

public class class08028
extends class08039 {
    public static final float u = 4.0f;

    public class08028(class07078<? extends class08028> class070782, class07299 class072992) {
        super((class07078<? extends class08039>)class070782, class072992);
    }

    public class08028(class07299 class072992, class07438 class074382, class06889 class068892) {
        super((class07078<? extends class08039>)class07078.c, class074382, class068892, class072992);
    }

    @Override
    protected class07126 u() {
        return class00473.N((class07103)class07107.Z, (float)1.0f);
    }

    @Override
    protected void N(class07089 class070892) {
        super.N(class070892);
        if (class070892.N() == class07113.field_1331 && this.u(((class06145)class070892).L())) {
            return;
        }
        if (!this.method_73183().method_8608()) {
            List var2 = this.method_73183().N(class07438.class, this.method_5829().L(4.0, 2.0, 4.0));
            class07048 class070482 = new class07048(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321());
            class07049 class070492 = this.z();
            if (class070492 instanceof class07438) {
                class070482.N((class07438)class070492);
            }
            class070482.N((class07126)class00473.N((class07103)class07107.Z, (float)1.0f));
            class070482.N(3.0f);
            class070482.N(600);
            class070482.u((7.0f - class070482.N()) / (float)class070482.u());
            class070482.y(0.25f);
            class070482.N(new class07055(class07047.M, 1, 1));
            if (!var2.isEmpty()) {
                for (class07438 class074382 : var2) {
                    if (!(this.method_5858((class07049)class074382) < 16.0)) continue;
                    class070482.method_5814(class074382.method_23317(), class074382.method_23318(), class074382.method_23321());
                    break;
                }
            }
            this.method_73183().N(2006, this.method_24515(), this.method_5701() ? -1 : 1);
            this.method_73183().method_8649((class07049)class070482);
            this.method_31472();
        }
    }

    @Override
    protected boolean ad_() {
        return false;
    }
}

