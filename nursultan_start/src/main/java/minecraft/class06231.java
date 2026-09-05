/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10569
 *  Nursultan.class10570
 *  Nursultan.class10571
 *  Nursultan.class10573
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02484
 *  minecraft.class02705
 *  minecraft.class05851
 *  minecraft.class05880
 *  minecraft.class06269
 *  minecraft.class06548
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06919
 *  minecraft.class06937
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07769
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import Nursultan.class10569;
import Nursultan.class10570;
import Nursultan.class10571;
import Nursultan.class10573;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class02705;
import minecraft.class05851;
import minecraft.class05880;
import minecraft.class06269;
import minecraft.class06548;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06919;
import minecraft.class06937;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07769;
import minecraft.class08036;
import minecraft.class08044;

public class class06231
extends class07482 {
    public static final int N = 0;
    public static final int y = 1;
    public static final int L = 2;
    private static final int R = 3;
    private static final int j = 30;
    private static final int v = 30;
    private static final int n = 39;
    private final class05880 t;
    long u;
    public final class06695 i = new class10570(this, 2);
    private final class06919 G = new class10573(this);

    public class06231(int n, class08044 class080442) {
        this(n, class080442, class05880.N);
    }

    public class06231(int n, class08044 class080442, class05880 class058802) {
        super(class05851.field_17343, n);
        this.t = class058802;
        this.N((class06937)new class10569(this, this.i, 0, 15, 15));
        this.N((class06937)new class10571(this, this.i, 1, 15, 52));
        this.N((class06937)new class06269(this, (class06695)this.G, 2, 145, 39, class058802));
        this.L((class06695)class080442, 8, 84);
    }

    public void y(class06695 class066952) {
        class06584 class065842 = this.i.method_5438(0);
        class06584 class065843 = this.i.method_5438(1);
        class06584 class065844 = this.G.method_5438(2);
        if (!class065844.R() && (class065842.R() || class065843.R())) {
            this.G.method_5441(2);
        } else if (!class065842.R() && !class065843.R()) {
            this.N(class065842, class065843, class065844);
        }
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.G.method_5441(2);
        this.t.N_53((class072992, class072092) -> this.N(class080362, this.i));
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n == 2) {
                class065843.B().L(class065843, class080362);
                if (!this.N(class065843, 3, 39, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
            } else if (n == 1 || n == 0 ? !this.N(class065843, 3, 39, false) : (class065843.L(class02484.f) ? !this.N(class065843, 0, 1, false) : (class065843.N(class06570.jk) || class065843.N(class06570.Gt) || class065843.N(class06570.Mg) ? !this.N(class065843, 1, 2, false) : (n >= 3 && n < 30 ? !this.N(class065843, 30, 39, false) : n >= 30 && n < 39 && !this.N(class065843, 3, 30, false))))) {
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.u(class06584.E);
            }
            class069372.M();
            if (class065843.c() == class065842.c()) {
                return class06584.E;
            }
            class069372.N(class080362, class065843);
            this.u();
        }
        return class065842;
    }

    public boolean N(class06584 class065842, class06937 class069372) {
        return class069372.L != this.G && super.N(class065842, class069372);
    }

    private void N(class06584 class065842, class06584 class065843, class06584 class065844) {
        this.t.N_53((class072992, class072092) -> {
            class06584 class065845;
            class07769 class077692 = class06548.y((class06584)class065842, (class07299)class072992);
            if (class077692 == null) {
                return;
            }
            if (class065843.N(class06570.jk) && !class077692.Z && class077692.M < 4) {
                class065845 = class065842.L(1);
                class065845.N(class02484.S, (Object)class02705.field_49354);
                this.u();
            } else if (class065843.N(class06570.Mg) && !class077692.Z) {
                class065845 = class065842.L(1);
                class065845.N(class02484.S, (Object)class02705.field_49353);
                this.u();
            } else if (class065843.N(class06570.Gt)) {
                class065845 = class065842.L(2);
                this.u();
            } else {
                this.G.method_5441(2);
                this.u();
                return;
            }
            if (!class06584.N((class06584)class065845, (class06584)class065844)) {
                this.G.method_5447(2, class065845);
                this.u();
            }
        });
    }

    public boolean N(class08036 class080362) {
        return class06231.N((class05880)this.t, (class08036)class080362, (class00891)class00869.PC);
    }
}

