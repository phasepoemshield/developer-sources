/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class02251
 *  minecraft.class02484
 *  minecraft.class02710
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07146
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07473
 *  minecraft.class07862
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00672;
import minecraft.class00682;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class02251;
import minecraft.class02484;
import minecraft.class02710;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07146;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07473;
import minecraft.class07862;
import org.jspecify.annotations.Nullable;

public class class00687
extends class07473 {
    private final class00682 N;

    public class00687(class00682 class006822) {
        this.N = class006822;
    }

    public void i() {
        class04782 class047822 = (class04782)this.N.method_73183();
        class07052 class070522 = class047822.method_8404(this.N.method_24515());
        this.N.N(false);
        this.N.M(true);
        this.N.u(0);
        class00672 class006722 = (class00672)class07078.NY.N((class07299)class047822, class06113.field_16461);
        if (class006722 == null) {
            return;
        }
        class006722.method_24203(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
        class006722.N(true);
        class047822.method_8649((class07049)class006722);
        class07146 class071462 = this.N(class070522, this.N);
        if (class071462 == null) {
            return;
        }
        class071462.method_5804((class07049)this.N);
        class047822.y((class07049)class071462);
        for (int i = 0; i < 3; ++i) {
            class07146 class071463;
            class07862 class078622 = this.N(class070522);
            if (class078622 == null || (class071463 = this.N(class070522, class078622)) == null) continue;
            class071463.method_5804((class07049)class078622);
            class078622.method_5762(this.N.method_59922().N(0.0, 1.1485), 0.0, this.N.method_59922().N(0.0, 1.1485));
            class047822.y((class07049)class078622);
        }
    }

    private void N(class07146 class071462, class07085 class070852, class07052 class070522) {
        class06584 class065842 = class071462.method_6118(class070852);
        class065842.N(class02484.P, (Object)class02710.N);
        class07323.N((class06584)class065842, (class01042)class071462.method_73183().method_30349(), (class05946)class02251.N, (class07052)class070522, (class06069)class071462.method_59922());
        class071462.method_5673(class070852, class065842);
    }

    private @Nullable class07146 N(class07052 class070522, class07862 class078622) {
        class07146 class071462 = (class07146)class07078.ym.N(class078622.method_73183(), class06113.field_16461);
        if (class071462 != null) {
            class071462.N((class01001)((class04782)class078622.method_73183()), class070522, class06113.field_16461, null);
            class071462.method_5814(class078622.method_23317(), class078622.method_23318(), class078622.method_23321());
            class071462.field_6008 = 60;
            class071462.NW();
            if (class071462.method_6118(class07085.field_6169).R()) {
                class071462.method_5673(class07085.field_6169, new class06584((class07310)class06570.bT));
            }
            this.N(class071462, class07085.field_6173, class070522);
            this.N(class071462, class07085.field_6169, class070522);
        }
        return class071462;
    }

    private @Nullable class07862 N(class07052 class070522) {
        class00682 class006822 = (class00682)class07078.yP.N(this.N.method_73183(), class06113.field_16461);
        if (class006822 != null) {
            class006822.N((class01001)((class04782)this.N.method_73183()), class070522, class06113.field_16461, null);
            class006822.method_5814(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
            class006822.field_6008 = 60;
            class006822.NW();
            class006822.M(true);
            class006822.u(0);
        }
        return class006822;
    }

    public boolean N() {
        return this.N.method_73183().N(this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), 10.0);
    }
}

