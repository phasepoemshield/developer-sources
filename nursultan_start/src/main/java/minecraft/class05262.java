/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10504
 *  Nursultan.class10505
 *  Nursultan.class10506
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02484
 *  minecraft.class02625
 *  minecraft.class02710
 *  minecraft.class03556
 *  minecraft.class05851
 *  minecraft.class05880
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06919
 *  minecraft.class06937
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07482
 *  minecraft.class07497
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import Nursultan.class10504;
import Nursultan.class10505;
import Nursultan.class10506;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class02625;
import minecraft.class02710;
import minecraft.class03556;
import minecraft.class05277;
import minecraft.class05851;
import minecraft.class05880;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06919;
import minecraft.class06937;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07482;
import minecraft.class07497;
import minecraft.class08036;
import minecraft.class08044;

public class class05262
extends class07482 {
    public static final int N = 35;
    public static final int y = 0;
    public static final int L = 1;
    public static final int u = 2;
    private static final int R = 3;
    private static final int j = 30;
    private static final int v = 30;
    private static final int n = 39;
    private final class06695 t = new class06919();
    final class06695 i = new class10504(this, 2);
    private final class05880 G;

    private void L(class06584 class065842, class06584 class065843) {
        class07323.N((class06584)class065842, (T class027152) -> {
            for (Object2IntMap.Entry entry : class07323.y((class06584)class065843).y()) {
                class03556 var5 = (class03556)entry.getKey();
                if (var5.N(class02625.P) && class027152.N(var5) != 0) continue;
                class027152.y(var5, entry.getIntValue());
            }
        });
    }

    public class05262(int n, class08044 class080442) {
        this(n, class080442, class05880.N);
    }

    public class05262(int n, class08044 class080442, class05880 class058802) {
        super(class05851.field_17336, n);
        this.G = class058802;
        this.N((class06937)new class10506(this, this.i, 0, 49, 19));
        this.N((class06937)new class10505(this, this.i, 1, 49, 40));
        this.N(new class05277(this, this.t, 2, 129, 34, class058802));
        this.L((class06695)class080442, 8, 84);
    }

    private class06584 y(class06584 class065842, class06584 class065843) {
        class06584 class065844;
        if (!class065842.N(class065843.B())) {
            return class06584.E;
        }
        int n = Math.max(class065842.s(), class065843.s());
        int n2 = class065842.s() - class065842.P();
        int n3 = class065843.s() - class065843.P();
        int n4 = n2 + n3 + n * 5 / 100;
        int n5 = 1;
        if (!class065842.W()) {
            if (class065842.U() < 2 || !class06584.N((class06584)class065842, (class06584)class065843)) {
                return class06584.E;
            }
            n5 = 2;
        }
        if ((class065844 = class065842.L(n5)).W()) {
            class065844.N(class02484.u, (Object)n);
            class065844.y(Math.max(n - n4, 0));
        }
        this.L(class065844, class065843);
        return this.y(class065844);
    }

    private class06584 y(class06584 class065842) {
        class02710 class027102 = class07323.N((class06584)class065842, (T class027152) -> class027152.N((T class035562) -> !class035562.N(class02625.P)));
        if (class065842.N(class06570.Gq) && class027102.u()) {
            class065842 = class065842.N((class07310)class06570.jY);
        }
        int n = 0;
        for (int i = 0; i < class027102.L(); ++i) {
            n = class07497.N((int)n);
        }
        class065842.N(class02484.n, (Object)n);
        return class065842;
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.G.N_53((class072992, class072092) -> this.N(class080362, this.i));
    }

    public void y(class06695 class066952) {
        super.y(class066952);
        if (class066952 == this.i) {
            this.E();
        }
    }

    private void E() {
        this.t.method_5447(0, this.N(this.i.method_5438(0), this.i.method_5438(1)));
        this.u();
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            class06584 class065844 = this.i.method_5438(0);
            class06584 class065845 = this.i.method_5438(1);
            if (n == 2) {
                if (!this.N(class065843, 3, 39, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
            } else if (n == 0 || n == 1 ? !this.N(class065843, 3, 39, false) : (class065844.R() || class065845.R() ? !this.N(class065843, 0, 2, false) : (n >= 3 && n < 30 ? !this.N(class065843, 30, 39, false) : n >= 30 && n < 39 && !this.N(class065843, 3, 30, false)))) {
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.u(class06584.E);
            } else {
                class069372.M();
            }
            if (class065843.c() == class065842.c()) {
                return class06584.E;
            }
            class069372.N(class080362, class065843);
        }
        return class065842;
    }

    public boolean N(class08036 class080362) {
        return class05262.N((class05880)this.G, (class08036)class080362, (class00891)class00869.Px);
    }

    private class06584 N(class06584 class065842, class06584 class065843) {
        if (!(!class065842.R() || !class065843.R())) {
            return class06584.E;
        }
        if (class065842.c() > 1 || class065843.c() > 1) {
            return class06584.E;
        }
        if (!(!class065842.R() && !class065843.R())) {
            class06584 class065844;
            class06584 class065845 = class065844 = !class065842.R() ? class065842 : class065843;
            if (!class07323.u((class06584)class065844)) {
                return class06584.E;
            }
            return this.y(class065844.t());
        }
        return this.y(class065842, class065843);
    }
}

