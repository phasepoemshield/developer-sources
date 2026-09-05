/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10582
 *  Nursultan.class10583
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class03767
 */
package minecraft;

import Nursultan.class10582;
import Nursultan.class10583;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class06506;
import minecraft.class06510;
import minecraft.class06517;
import minecraft.class06525;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;

public class class06511 {
    public static final int N = 20;
    public static final class06511 y = new class06511(List.of(), List.of(), List.of());
    private final List<class06510> L;
    private final List<class10583<class06525>> u;
    private final List<class10583<class06581>> i;

    public boolean L(class06584 class065842) {
        Iterator<class10583<class06525>> var2 = this.u.iterator();
        while (var2.hasNext()) {
            if (!var2.next().y().method_8093(class065842)) continue;
            return true;
        }
        return false;
    }

    public boolean L(class06584 class065842, class06584 class065843) {
        Optional<class03556<class06525>> var3 = ((class06517)((Object)class065842.a_(class02484.h, (Object)class06517.N))).i();
        if (var3.isEmpty()) {
            return false;
        }
        for (class10583<class06525> var5 : this.u) {
            if (!var5.N().N(var3.get()) || !var5.y().method_8093(class065843)) continue;
            return true;
        }
        return false;
    }

    public class06511(List<class06510> list, List<class10583<class06525>> list2, List<class10583<class06581>> list3) {
        this.L = list;
        this.u = list2;
        this.i = list3;
    }

    public class06584 u(class06584 class065842, class06584 class065843) {
        if (class065843.R()) {
            return class065843;
        }
        Optional<class03556<class06525>> var3 = ((class06517)((Object)class065843.a_(class02484.h, (Object)class06517.N))).i();
        if (var3.isEmpty()) {
            return class065843;
        }
        for (class10583<class06581> class105832 : this.i) {
            if (!class065843.N((class03556<class06581>)class105832.N()) || !class105832.y().method_8093(class065842)) continue;
            return class06517.N((class06581)class105832.L().N(), var3.get());
        }
        for (class10583 class105832 : this.u) {
            if (!class105832.N().N(var3.get()) || !class105832.y().method_8093(class065842)) continue;
            return class06517.N(class065843.B(), (class03556<class06525>)class105832.L());
        }
        return class065843;
    }

    private boolean u(class06584 class065842) {
        Iterator<class06510> var2 = this.L.iterator();
        while (var2.hasNext()) {
            if (!var2.next().method_8093(class065842)) continue;
            return true;
        }
        return false;
    }

    public boolean y(class06584 class065842, class06584 class065843) {
        for (class10583<class06581> var4 : this.i) {
            if (!class065842.N((class03556<class06581>)var4.N()) || !var4.y().method_8093(class065843)) continue;
            return true;
        }
        return false;
    }

    public boolean y(class06584 class065842) {
        Iterator<class10583<class06581>> var2 = this.i.iterator();
        while (var2.hasNext()) {
            if (!var2.next().y().method_8093(class065842)) continue;
            return true;
        }
        return false;
    }

    public static class06511 N(class03767 class037672) {
        class10582 class105822 = new class10582(class037672);
        class06511.N(class105822);
        return class105822.N();
    }

    public boolean N(class06584 class065842, class06584 class065843) {
        if (!this.u(class065842)) {
            return false;
        }
        return this.y(class065842, class065843) || this.L(class065842, class065843);
    }

    public static void N(class10582 class105822) {
        class105822.N(class06570.ns);
        class105822.N(class06570.lO);
        class105822.N(class06570.lJ);
        class105822.N(class06570.ns, class06570.bN, class06570.lO);
        class105822.N(class06570.lO, class06570.lQ, class06570.lJ);
        class105822.N(class06506.N, class06570.vL, class06506.L);
        class105822.N(class06506.N, class06570.WY, class06506.y);
        class105822.N(class06506.N, class06570.nm, class06506.u);
        class105822.N(class06570.GW, class06506.p);
        class105822.N(class06570.Wq, class06506.A);
        class105822.N(class06570.y, class06506.f);
        class105822.N(class06570.Lf, class06506.F);
        class105822.N(class06506.u, class06570.GG, class06506.i);
        class105822.N(class06506.i, class06570.WY, class06506.R);
        class105822.N(class06506.i, class06570.nb, class06506.M);
        class105822.N(class06506.R, class06570.nb, class06506.B);
        class105822.N(class06506.M, class06570.WY, class06506.B);
        class105822.N(class06570.nv, class06506.E);
        class105822.N(class06506.E, class06570.WY, class06506.W);
        class105822.N(class06570.Gp, class06506.Z);
        class105822.N(class06506.Z, class06570.WY, class06506.z);
        class105822.N(class06506.Z, class06570.vL, class06506.U);
        class105822.N(class06506.Z, class06570.nb, class06506.T);
        class105822.N(class06506.z, class06570.nb, class06506.b);
        class105822.N(class06506.T, class06570.WY, class06506.b);
        class105822.N(class06506.T, class06570.vL, class06506.j);
        class105822.N(class06506.u, class06570.sa, class06506.v);
        class105822.N(class06506.v, class06570.WY, class06506.n);
        class105822.N(class06506.v, class06570.vL, class06506.t);
        class105822.N(class06506.m, class06570.nb, class06506.T);
        class105822.N(class06506.P, class06570.nb, class06506.b);
        class105822.N(class06570.vg, class06506.m);
        class105822.N(class06506.m, class06570.WY, class06506.P);
        class105822.N(class06506.m, class06570.vL, class06506.s);
        class105822.N(class06506.u, class06570.vM, class06506.G);
        class105822.N(class06506.G, class06570.WY, class06506.l);
        class105822.N(class06570.nl, class06506.d);
        class105822.N(class06506.d, class06570.vL, class06506.w);
        class105822.N(class06506.d, class06570.nb, class06506.k);
        class105822.N(class06506.w, class06570.nb, class06506.Y);
        class105822.N(class06506.k, class06570.vL, class06506.Y);
        class105822.N(class06506.Q, class06570.nb, class06506.k);
        class105822.N(class06506.O, class06570.nb, class06506.k);
        class105822.N(class06506.g, class06570.nb, class06506.Y);
        class105822.N(class06570.nT, class06506.Q);
        class105822.N(class06506.Q, class06570.WY, class06506.O);
        class105822.N(class06506.Q, class06570.vL, class06506.g);
        class105822.N(class06570.nE, class06506.I);
        class105822.N(class06506.I, class06570.WY, class06506.J);
        class105822.N(class06506.I, class06570.vL, class06506.o);
        class105822.N(class06570.nj, class06506.q);
        class105822.N(class06506.q, class06570.WY, class06506.K);
        class105822.N(class06506.q, class06570.vL, class06506.V);
        class105822.N(class06506.N, class06570.nb, class06506.e);
        class105822.N(class06506.e, class06570.WY, class06506.H);
        class105822.N(class06506.u, class06570.ss, class06506.X);
        class105822.N(class06506.X, class06570.WY, class06506.a);
    }

    public boolean N(class06584 class065842) {
        return this.y(class065842) || this.L(class065842);
    }

    public boolean N(class03556<class06525> class035562) {
        Iterator<class10583<class06525>> var2 = this.u.iterator();
        while (var2.hasNext()) {
            if (!var2.next().L().N(class035562)) continue;
            return true;
        }
        return false;
    }
}

