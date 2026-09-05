/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10686
 *  Nursultan.class10687
 *  Nursultan.class10688
 *  Nursultan.class10689
 *  Nursultan.class10690
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00412
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02055
 *  minecraft.class02484
 *  minecraft.class02701
 *  minecraft.class02708
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04463
 *  minecraft.class05851
 *  minecraft.class05865
 *  minecraft.class05880
 *  minecraft.class06559
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import Nursultan.class10686;
import Nursultan.class10687;
import Nursultan.class10688;
import Nursultan.class10689;
import Nursultan.class10690;
import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class00412;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02055;
import minecraft.class02484;
import minecraft.class02701;
import minecraft.class02708;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04463;
import minecraft.class05851;
import minecraft.class05865;
import minecraft.class05880;
import minecraft.class06559;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06907;
import minecraft.class06920;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;

public class class06951
extends class07482 {
    private static final int R = -1;
    private static final int j = 4;
    private static final int v = 31;
    private static final int n = 31;
    private static final int t = 40;
    private final class05880 G;
    final class05865 N = class05865.N();
    private List<class03556<class00412>> l = List.of();
    public Runnable y = () -> {};
    private final class02055<class00412> d;
    final class06937 L;
    final class06937 u;
    private final class06937 w;
    private final class06937 k;
    long i;
    private final class06695 Y = new class10686(this, 3);
    private final class06695 Q = new class10690(this, 1);

    public class06937 P() {
        return this.u;
    }

    public class06937 T() {
        return this.k;
    }

    public class06951(int n, class08044 class080442) {
        this(n, class080442, class05880.N);
    }

    public class06951(int n, class08044 class080442, class05880 class058802) {
        super(class05851.field_17339, n);
        this.G = class058802;
        this.L = this.N((class06937)new class10689(this, this.Y, 0, 13, 26));
        this.u = this.N((class06937)new class10688(this, this.Y, 1, 33, 26));
        this.w = this.N((class06937)new class10687(this, this.Y, 2, 23, 45));
        this.k = this.N(new class06907(this, this.Q, 0, 143, 57, class058802));
        this.L((class06695)class080442, 8, 84);
        this.N(this.N);
        this.d = class080442.z.method_56673().L(class04227.NF);
    }

    public class06937 s() {
        return this.w;
    }

    public class06937 m() {
        return this.L;
    }

    public boolean y(class08036 class080362, int n) {
        if (n >= 0 && n < this.l.size()) {
            this.N.N(n);
            this.N(this.l.get(n));
            return true;
        }
        return false;
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.G.N_53((class072992, class072092) -> this.N(class080362, this.Y));
    }

    private List<class03556<class00412>> y(class06584 class065842) {
        if (class065842.R()) {
            return (List)this.d.N(class04463.N).map(ImmutableList::copyOf).orElse(ImmutableList.of());
        }
        class03530 class035302 = (class03530)class065842.method_58694(class02484.NW);
        if (class035302 != null) {
            return (List)this.d.N(class035302).map(ImmutableList::copyOf).orElse(ImmutableList.of());
        }
        return List.of();
    }

    public void y(class06695 class066952) {
        int n;
        class03556<class00412> class035562;
        class06584 class065842 = this.L.i();
        class06584 class065843 = this.u.i();
        class06584 class065844 = this.w.i();
        if (class065842.R() || class065843.R()) {
            this.k.i(class06584.E);
            this.l = List.of();
            this.N.N(-1);
            return;
        }
        int n2 = this.N.y();
        boolean bl = this.N(n2);
        List<class03556<class00412>> var7 = this.l;
        this.l = this.y(class065844);
        if (this.l.size() == 1) {
            this.N.N(0);
            class03556<class00412> var8 = this.l.get(0);
        } else if (!bl) {
            this.N.N(-1);
            class035562 = null;
        } else {
            class03556<class00412> var9 = var7.get(n2);
            n = this.l.indexOf(var9);
            if (n != -1) {
                class035562 = var9;
                this.N.N(n);
            } else {
                class035562 = null;
                this.N.N(-1);
            }
        }
        if (class035562 != null) {
            class02708 class027082 = (class02708)class065842.a_(class02484.Nv, (Object)class02708.L);
            int n3 = n = class027082.y().size() >= 6 ? 1 : 0;
            if (n != 0) {
                this.N.N(-1);
                this.k.i(class06584.E);
            } else {
                this.N(class035562);
            }
        } else {
            this.k.i(class06584.E);
        }
        this.u();
    }

    public List<class03556<class00412>> E() {
        return this.l;
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            if (n == this.k.u) {
                if (!this.N(class065843, 4, 40, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
            } else if (n == this.u.u || n == this.L.u || n == this.w.u ? !this.N(class065843, 4, 40, false) : (class065843.B() instanceof class06920 ? !this.N(class065843, this.L.u, this.L.u + 1, false) : (class065843.B() instanceof class06559 ? !this.N(class065843, this.u.u, this.u.u + 1, false) : (class065843.L(class02484.NW) ? !this.N(class065843, this.w.u, this.w.u + 1, false) : (n >= 4 && n < 31 ? !this.N(class065843, 31, 40, false) : n >= 31 && n < 40 && !this.N(class065843, 4, 31, false)))))) {
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
        return class06951.N((class05880)this.G, (class08036)class080362, (class00891)class00869.Pp);
    }

    private boolean N(int n) {
        return n >= 0 && n < this.l.size();
    }

    public void N(Runnable runnable) {
        this.y = runnable;
    }

    private void N(class03556<class00412> class035562) {
        class06584 class065842 = this.L.i();
        class06584 class065843 = this.u.i();
        class06584 class065844 = class06584.E;
        if (!class065842.R() && !class065843.R()) {
            class065844 = class065842.L(1);
            class06563 class065632 = ((class06559)class065843.B()).N();
            class065844.N(class02484.Nv, (Object)class02708.L, class027082 -> new class02701().N(class027082).N(class035562, class065632).N());
        }
        if (!class06584.N((class06584)class065844, (class06584)this.k.i())) {
            this.k.i(class065844);
        }
    }

    public int W() {
        return this.N.y();
    }
}

