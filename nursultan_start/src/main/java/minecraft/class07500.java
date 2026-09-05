/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10754
 *  Nursultan.class10755
 *  minecraft.class00750
 *  minecraft.class00869
 *  minecraft.class01042
 *  minecraft.class01235
 *  minecraft.class01894
 *  minecraft.class02625
 *  minecraft.class03552
 *  minecraft.class04227
 *  minecraft.class04770
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05851
 *  minecraft.class05865
 *  minecraft.class05880
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06912
 *  minecraft.class06937
 *  minecraft.class07203
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07317
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import Nursultan.class10754;
import Nursultan.class10755;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00750;
import minecraft.class00869;
import minecraft.class01042;
import minecraft.class01235;
import minecraft.class01894;
import minecraft.class02625;
import minecraft.class03552;
import minecraft.class04227;
import minecraft.class04770;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05851;
import minecraft.class05865;
import minecraft.class05880;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06912;
import minecraft.class06937;
import minecraft.class07203;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07317;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07482;
import minecraft.class07509;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08044;

public class class07500
extends class07482 {
    static final class01894 N = class01894.y((String)"container/slot/lapis_lazuli");
    private final class06695 i = new class10754(this, 2);
    private final class05880 R;
    private final class06069 j = class06069.u();
    private final class05865 v = class05865.N();
    public final int[] y = new int[3];
    public final int[] L = new int[]{-1, -1, -1};
    public final int[] u = new int[]{-1, -1, -1};

    public class07500(int n, class08044 class080442) {
        this(n, class080442, class05880.N);
    }

    public class07500(int n, class08044 class080442, class05880 class058802) {
        super(class05851.field_17334, n);
        this.R = class058802;
        this.N((class06937)new class10755(this, this.i, 0, 15, 47));
        this.N(new class07509(this, this.i, 1, 35, 47));
        this.L((class06695)class080442, 8, 84);
        this.N(class05865.N((int[])this.y, (int)0));
        this.N(class05865.N((int[])this.y, (int)1));
        this.N(class05865.N((int[])this.y, (int)2));
        this.N(this.v).N(class080442.z.method_7278());
        this.N(class05865.N((int[])this.L, (int)0));
        this.N(class05865.N((int[])this.L, (int)1));
        this.N(class05865.N((int[])this.L, (int)2));
        this.N(class05865.N((int[])this.u, (int)0));
        this.N(class05865.N((int[])this.u, (int)1));
        this.N(class05865.N((int[])this.u, (int)2));
    }

    @Override
    public void y(class08036 class080362) {
        super.y(class080362);
        this.R.N_53((class072992, class072092) -> this.N(class080362, this.i));
    }

    @Override
    public void y(class06695 class066952) {
        if (class066952 == this.i) {
            class06584 class065842 = class066952.method_5438(0);
            if (class065842.R() || !class065842.g()) {
                for (int i = 0; i < 3; ++i) {
                    this.y[i] = 0;
                    this.L[i] = -1;
                    this.u[i] = -1;
                }
            } else {
                this.R.N_53((class072992, class072092) -> {
                    int n;
                    class00750 class007502 = class072992.method_30349().L(class04227.yR).v();
                    int n2 = 0;
                    for (class07209 class072093 : class07203.y) {
                        if (!class07203.N((class07299)class072992, (class07209)class072092, (class07209)class072093)) continue;
                        ++n2;
                    }
                    this.j.N((long)this.v.y());
                    for (n = 0; n < 3; ++n) {
                        this.y[n] = class07323.N((class06069)this.j, (int)n, (int)n2, (class06584)class065842);
                        this.L[n] = -1;
                        this.u[n] = -1;
                        if (this.y[n] >= n + 1) continue;
                        this.y[n] = 0;
                    }
                    for (n = 0; n < 3; ++n) {
                        List<class07317> var7;
                        if (this.y[n] <= 0 || (var7 = this.N(class072992.method_30349(), class065842, n, this.y[n])).isEmpty()) continue;
                        class07317 class073172 = var7.get(this.j.y(var7.size()));
                        this.L[n] = class007502.N((Object)class073172.y());
                        this.u[n] = class073172.L();
                    }
                    this.u();
                });
            }
        }
    }

    @Override
    public boolean y(class08036 class080362, int n) {
        if (n < 0 || n >= this.y.length) {
            class07536.y(class080362.method_74861() + " pressed invalid button id: " + n);
            return false;
        }
        class06584 class065842 = this.i.method_5438(0);
        class06584 class065843 = this.i.method_5438(1);
        int n2 = n + 1;
        if ((class065843.R() || class065843.c() < n2) && !class080362.method_56992()) {
            return false;
        }
        if (this.y[n] > 0 && !class065842.R() && (class080362.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= n2 && class080362.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= this.y[n] || class080362.method_56992())) {
            this.R.N_53((class072992, class072092) -> {
                class06584 class065844 = class065842;
                List<class07317> var9 = this.N(class072992.method_30349(), class065844, n, this.y[n]);
                if (!var9.isEmpty()) {
                    class080362.method_7286(class065844, n2);
                    if (class065844.N(class06570.jY)) {
                        class065844 = class065842.N((class07310)class06570.Gq);
                        this.i.method_5447(0, class065844);
                    }
                    for (class07317 class073172 : var9) {
                        class065844.N(class073172.y(), class073172.L());
                    }
                    class065843.N(n2, (class07438)class080362);
                    if (class065843.R()) {
                        this.i.method_5447(1, class06584.E);
                    }
                    class080362.method_7281(class01235.NW);
                    if (class080362 instanceof class04770) {
                        class06912.z.N((class04770)class080362, class065844, n2);
                    }
                    this.i.method_5431();
                    this.v.N(class080362.method_7278());
                    this.y(this.i);
                    class072992.method_8396(null, class072092, class04909.zI, class04911.field_15245, 1.0f, class072992.field_9229.z() * 0.1f + 0.9f);
                }
            });
            return true;
        }
        return false;
    }

    public int E() {
        class06584 class065842 = this.i.method_5438(1);
        if (class065842.R()) {
            return 0;
        }
        return class065842.c();
    }

    @Override
    public boolean N(class08036 class080362) {
        return class07500.N(this.R, class080362, class00869.MM);
    }

    @Override
    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n == 0) {
                if (!this.N(class065843, 2, 38, true)) {
                    return class06584.E;
                }
            } else if (n == 1) {
                if (!this.N(class065843, 2, 38, true)) {
                    return class06584.E;
                }
            } else if (class065843.N(class06570.TL)) {
                if (!this.N(class065843, 1, 2, true)) {
                    return class06584.E;
                }
            } else if (!((class06937)this.T.get(0)).R() && ((class06937)this.T.get(0)).N(class065843)) {
                class06584 class065844 = class065843.L(1);
                class065843.B(1);
                ((class06937)this.T.get(0)).u(class065844);
            } else {
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

    private List<class07317> N(class01042 class010422, class06584 class065842, int n, int n2) {
        this.j.N((long)(this.v.y() + n));
        Optional optional = class010422.L(class04227.yR).N(class02625.U);
        if (optional.isEmpty()) {
            return List.of();
        }
        List var6 = class07323.y((class06069)this.j, (class06584)class065842, (int)n2, (Stream)((class03552)optional.get()).N());
        if (class065842.N(class06570.jY) && var6.size() > 1) {
            var6.remove(this.j.y(var6.size()));
        }
        return var6;
    }

    public int W() {
        return this.v.y();
    }
}

