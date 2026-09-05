/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10762
 *  Nursultan.class10866
 *  minecraft.class01001
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06824
 *  minecraft.class06832
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class08004
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10762;
import Nursultan.class10866;
import minecraft.class01001;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06824;
import minecraft.class06832;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class08004;
import org.jspecify.annotations.Nullable;

public class class07564
extends class08004 {
    protected void L(class04782 class047822) {
        this.N(class047822, class07078.yx);
        if (!this.method_5701()) {
            class047822.method_8444(null, 1041, this.method_24515(), 0);
        }
    }

    public class07564(class07078<? extends class07564> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class04891 s() {
        return class04909.Ph;
    }

    protected boolean m() {
        return true;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class06069 class060692 = class010012.method_8409();
        class074462 = super.N(class010012, class070522, class061132, class074462);
        float f = class070522.u();
        if (class061132 != class06113.field_16468) {
            this.L(class060692.z() < 0.55f * f);
        }
        if (class074462 != null) {
            class074462 = new class10762((class10866)class074462);
            boolean bl = ((class10762)class074462).N = class061132 != class06113.field_16459;
        }
        if (class074462 instanceof class10762) {
            class07209 class072092;
            class10762 class107622 = (class10762)class074462;
            if (!class107622.N && class010012.y(class07078.G.N((double)(class072092 = this.method_24515()).method_10263() + 0.5, (double)class072092.method_10264(), (double)class072092.method_10260() + 0.5))) {
                class107622.N = true;
                if (class060692.z() < 0.1f) {
                    this.method_5673(class07085.field_6173, new class06584((class07310)class06570.le));
                    class06832 class068322 = (class06832)class07078.G.N(this.method_73183(), class06113.field_16459);
                    if (class068322 != null) {
                        class068322.method_5814(this.method_23317(), this.method_23318(), this.method_23321());
                        class068322.N(class010012, class070522, class061132, null);
                        this.method_5873((class07049)class068322, true, true);
                        class010012.method_8649((class07049)class068322);
                        class06824 class068242 = (class06824)class07078.NS.N(this.method_73183(), class06113.field_16459);
                        if (class068242 != null) {
                            class068242.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0f);
                            class068242.N(class010012, class070522, class061132, null);
                            class068242.method_5873((class07049)class068322, false, false);
                            class010012.y((class07049)class068242);
                        }
                    }
                }
            }
        }
        return class074462;
    }

    public class04891 method_6002() {
        return class04909.sN;
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        boolean bl = super.method_6121(class047822, class070492);
        if (bl && this.method_6047().R() && class070492 instanceof class07438) {
            float f = class047822.method_8404(this.method_24515()).y();
            ((class07438)class070492).method_37222(new class07055(class07047.T, 140 * (int)f), (class07049)this);
        }
        return bl;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.sy;
    }

    protected class04891 X_() {
        return class04909.sL;
    }

    protected boolean U_() {
        return false;
    }
}

