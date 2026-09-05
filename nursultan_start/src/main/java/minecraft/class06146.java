/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10557
 *  minecraft.class00252
 *  minecraft.class00279
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class02904
 *  minecraft.class03729
 *  minecraft.class05851
 *  minecraft.class05865
 *  minecraft.class05880
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06919
 *  minecraft.class06937
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import Nursultan.class10557;
import java.util.Optional;
import minecraft.class00252;
import minecraft.class00279;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class02904;
import minecraft.class03729;
import minecraft.class05851;
import minecraft.class05865;
import minecraft.class05880;
import minecraft.class06156;
import minecraft.class06159;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06919;
import minecraft.class06937;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;

public class class06146
extends class07482 {
    public static final int N = 0;
    public static final int y = 1;
    private static final int t = 2;
    private static final int G = 29;
    private static final int l = 29;
    private static final int d = 38;
    private final class05880 w;
    final class05865 L = class05865.N();
    private final class07299 k;
    private class00279<class06156> Y = class00279.N();
    private class06584 Q = class06584.E;
    long u;
    final class06937 i;
    final class06937 R;
    public Runnable j = () -> {};
    public final class06695 v = new class10557(this, 1);
    final class06919 n = new class06919();

    public boolean P() {
        return this.i.R() && !this.Y.L();
    }

    public class06146(int n, class08044 class080442) {
        this(n, class080442, class05880.N);
    }

    public class06146(int n, class08044 class080442, class05880 class058802) {
        super(class05851.field_17625, n);
        this.w = class058802;
        this.k = class080442.z.method_73183();
        this.i = this.N(new class06937(this.v, 0, 20, 33));
        this.R = this.N(new class06159(this, (class06695)this.n, 1, 143, 33, class058802));
        this.L((class06695)class080442, 8, 84);
        this.N(this.L);
    }

    public int m() {
        return this.Y.u();
    }

    public void y(class06695 class066952) {
        class06584 class065842 = this.i.i();
        if (!class065842.N(this.Q.B())) {
            this.Q = class065842.t();
            this.y(class065842);
        }
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.n.method_5441(1);
        this.w.N_53((class072992, class072092) -> this.N(class080362, this.v));
    }

    private void y(class06584 class065842) {
        this.L.N(-1);
        this.R.i(class06584.E);
        this.Y = !class065842.R() ? this.k.method_8433().N().y(class065842) : class00279.N();
    }

    public boolean y(class08036 class080362, int n) {
        if (this.L.y() == n) {
            return false;
        }
        if (this.R(n)) {
            this.L.N(n);
            this.N(n);
        }
        return true;
    }

    public int E() {
        return this.L.y();
    }

    public boolean N(class06584 class065842, class06937 class069372) {
        return class069372.L != this.n && super.N(class065842, class069372);
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class06581 class065812 = class065843.B();
            class065842 = class065843.t();
            if (n == 1) {
                class065812.L(class065843, class080362);
                if (!this.N(class065843, 2, 38, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
            } else if (n == 0 ? !this.N(class065843, 2, 38, false) : (this.k.method_8433().N().N(class065843) ? !this.N(class065843, 0, 1, false) : (n >= 2 && n < 29 ? !this.N(class065843, 29, 38, false) : n >= 29 && n < 38 && !this.N(class065843, 2, 29, false)))) {
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
            if (n == 1) {
                class080362.method_7328(class065843, false);
            }
            this.u();
        }
        return class065842;
    }

    public boolean N(class08036 class080362) {
        return class06146.N((class05880)this.w, (class08036)class080362, (class00891)class00869.Pr);
    }

    void N(int n) {
        Optional<class03729> optional;
        if (!this.Y.L() && this.R(n)) {
            Optional var2 = ((class00252)this.Y.i().get(n)).L().L();
        } else {
            optional = Optional.empty();
        }
        optional.ifPresentOrElse(class037292 -> {
            this.n.N(class037292);
            this.R.i(((class06156)class037292.y()).method_8116(new class02904(this.v.method_5438(0)), (class01929)this.k.method_30349()));
        }, () -> {
            this.R.i(class06584.E);
            this.n.N(null);
        });
        this.u();
    }

    public class05851<?> N() {
        return class05851.field_17625;
    }

    public void N(Runnable runnable) {
        this.j = runnable;
    }

    public class00279<class06156> W() {
        return this.Y;
    }

    private boolean R(int n) {
        return n >= 0 && n < this.Y.u();
    }
}

