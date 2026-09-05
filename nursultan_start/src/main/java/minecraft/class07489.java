/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10752
 *  Nursultan.class10756
 *  minecraft.class01894
 *  minecraft.class05845
 *  minecraft.class05851
 *  minecraft.class05853
 *  minecraft.class06511
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07075
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import Nursultan.class10752;
import Nursultan.class10756;
import minecraft.class01894;
import minecraft.class05845;
import minecraft.class05851;
import minecraft.class05853;
import minecraft.class06511;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07075;
import minecraft.class07482;
import minecraft.class07484;
import minecraft.class08036;
import minecraft.class08044;

public class class07489
extends class07482 {
    public static final class01894 N = class01894.y((String)"container/slot/brewing_fuel");
    static final class01894 y = class01894.y((String)"container/slot/potion");
    private static final int L = 0;
    private static final int u = 2;
    private static final int i = 3;
    private static final int R = 4;
    private static final int j = 5;
    private static final int v = 2;
    private static final int n = 5;
    private static final int t = 32;
    private static final int G = 32;
    private static final int l = 41;
    private final class06695 d;
    private final class05845 w;
    private final class06937 k;

    public class07489(int n, class08044 class080442) {
        this(n, class080442, (class06695)new class07075(5), (class05845)new class05853(2));
    }

    public class07489(int n, class08044 class080442, class06695 class066952, class05845 class058452) {
        super(class05851.field_17332, n);
        class07489.N(class066952, 5);
        class07489.N(class058452, 2);
        this.d = class066952;
        this.w = class058452;
        class06511 class065112 = class080442.z.method_73183().method_59547();
        this.N(new class07484(class066952, 0, 56, 51));
        this.N(new class07484(class066952, 1, 79, 58));
        this.N(new class07484(class066952, 2, 102, 51));
        this.k = this.N((class06937)new class10752(class065112, class066952, 3, 79, 17));
        this.N((class06937)new class10756(class066952, 4, 17, 17));
        this.N(class058452);
        this.L((class06695)class080442, 8, 84);
    }

    public int E() {
        return this.w.N(1);
    }

    @Override
    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n >= 0 && n <= 2 || n == 3 || n == 4) {
                if (!this.N(class065843, 5, 41, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
            } else if (class10756.y((class06584)class065842) ? this.N(class065843, 4, 5, false) || this.k.N(class065843) && !this.N(class065843, 3, 4, false) : (this.k.N(class065843) ? !this.N(class065843, 3, 4, false) : (class07484.y(class065842) ? !this.N(class065843, 0, 3, false) : (n >= 5 && n < 32 ? !this.N(class065843, 32, 41, false) : (n >= 32 && n < 41 ? !this.N(class065843, 5, 32, false) : !this.N(class065843, 5, 41, false)))))) {
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
            class069372.N(class080362, class065842);
        }
        return class065842;
    }

    @Override
    public boolean N(class08036 class080362) {
        return this.d.method_5443(class080362);
    }

    public int W() {
        return this.w.N(0);
    }
}

