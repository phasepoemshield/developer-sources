/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03264
 *  minecraft.class03674
 *  minecraft.class05428
 *  minecraft.class05433
 *  minecraft.class05547
 *  minecraft.class05565
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03264;
import minecraft.class03674;
import minecraft.class05387;
import minecraft.class05388;
import minecraft.class05399;
import minecraft.class05403;
import minecraft.class05404;
import minecraft.class05428;
import minecraft.class05433;
import minecraft.class05547;
import minecraft.class05565;
import org.jspecify.annotations.Nullable;

public class class05420 {
    private final class05388 y;
    private final Map<class05403, class01894> L = new HashMap<class05403, class01894>();
    private @Nullable class05547 u;
    private @Nullable class03674 i;
    private final Set<class00891> R = new HashSet<class00891>();
    final /* synthetic */ class05404 N;

    public class05420 L(class00891 class008912) {
        class05388 class053882 = class05388.j(class008912);
        class03264 class032642 = class05404.y(class05433.O.N(class008912, class053882, this.N.L));
        class03264 class032643 = class05404.y(class05433.g.N(class008912, class053882, this.N.L));
        class03264 class032644 = class05404.y(class05433.I.N(class008912, class053882, this.N.L));
        class03264 class032645 = class05404.y(class05433.J.N(class008912, class053882, this.N.L));
        class03264 class032646 = class05404.y(class05433.o.N(class008912, class053882, this.N.L));
        this.N.N.accept(class05404.N(class008912, class032642, class032643, class032644, class032645, class032646));
        class01894 class018942 = class05433.q.N(class008912, class053882, this.N.L);
        this.N.N(class008912, class018942);
        return this;
    }

    public class05420 M(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.h.N(class008912, this.y, this.N.L));
        class03264 class032643 = class05404.y(class05433.r.N(class008912, this.y, this.N.L));
        this.N.N.accept(class05404.u(class008912, class032642, class032643));
        return this;
    }

    public class05420(class05404 class054042, class05388 class053882) {
        this.N = class054042;
        this.y = class053882;
    }

    public class05420 B(class00891 class008912) {
        if (this.u == null) {
            throw new IllegalStateException("Family not defined");
        }
        class00891 class008913 = (class00891)this.u.y().get(class05565.field_28545);
        class03264 class032642 = class05404.y(class05433.NN.N(class008912, this.y, this.N.L));
        this.N.N.accept((class05399)class05404.N(class008912, class032642));
        this.N.N.accept((class05399)class05404.N(class008913, class032642));
        this.N.y(class008912.B());
        return this;
    }

    public class05420 Z(class00891 class008912) {
        if (this.i == null) {
            throw new IllegalStateException("Full block not generated yet");
        }
        class01894 class018942 = this.N(class05433.Ny, class008912);
        class03264 class032642 = class05404.y(this.N(class05433.NL, class008912));
        this.N.N.accept(class05404.i(class008912, class05404.y(class018942), class032642, class05404.N(this.i)));
        this.N.N(class008912, class018942);
        return this;
    }

    public class05420 i(class00891 class008912) {
        class05388 class053882 = class05388.j(class008912);
        class03264 class032642 = class05404.y(class05433.F.N(class008912, class053882, this.N.L));
        class03264 class032643 = class05404.y(class05433.p.N(class008912, class053882, this.N.L));
        class03264 class032644 = class05404.y(class05433.f.N(class008912, class053882, this.N.L));
        class03264 class032645 = class05404.y(class05433.A.N(class008912, class053882, this.N.L));
        this.N.N.accept(class05404.N(class008912, class032642, class032643, class032644, class032645, false));
        return this;
    }

    public class05420 U(class00891 class008912) {
        class03264 class032642 = class05404.y(class05404.m.getOrDefault(class008912, class05428.N.get(class008912)).N(class008912, this.N.L));
        this.N.N.accept((class05399)class05404.N(class008912, class032642));
        return this;
    }

    public class05420 z(class00891 class008912) {
        class03264 class032642 = class05404.y(this.N(class05433.NR, class008912));
        class01894 class018942 = this.N(class05433.Ni, class008912);
        class03264 class032643 = class05404.y(this.N(class05433.NM, class008912));
        this.N.N.accept(class05404.y(class008912, class032642, class05404.y(class018942), class032643));
        this.N.N(class008912, class018942);
        return this;
    }

    public class05420 u(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.K.N(class008912, this.y, this.N.L));
        class03264 class032643 = class05404.y(class05433.V.N(class008912, this.y, this.N.L));
        this.N.N.accept(class05404.y(class008912, class032642, class032643));
        class01894 class018942 = class05433.e.N(class008912, this.y, this.N.L);
        this.N.N(class008912, class018942);
        return this;
    }

    public class05420 y(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.H.N(class008912, this.y, this.N.L));
        class03264 class032643 = class05404.y(class05433.c.N(class008912, this.y, this.N.L));
        class03264 class032644 = class05404.y(class05433.X.N(class008912, this.y, this.N.L));
        this.N.N.accept(class05404.N(class008912, class032642, class032643, class032644));
        class01894 class018942 = class05433.a.N(class008912, this.y, this.N.L);
        this.N.N(class008912, class018942);
        return this;
    }

    public class05420 E(class00891 class008912) {
        this.N.Z(class008912);
        return this;
    }

    public class05420 N(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.j.N(class008912, this.y, this.N.L));
        class03264 class032643 = class05404.y(class05433.v.N(class008912, this.y, this.N.L));
        this.N.N.accept(class05404.N(class008912, class032642, class032643));
        class01894 class018942 = class05433.n.N(class008912, this.y, this.N.L);
        this.N.N(class008912, class018942);
        return this;
    }

    private class01894 N(class05403 class054033, class00891 class008912) {
        return this.L.computeIfAbsent(class054033, class054032 -> class054032.N(class008912, this.y, this.N.L));
    }

    public class05420 N(class05547 class055472) {
        this.u = class055472;
        class055472.y().forEach((class055652, class008912) -> {
            if (this.R.contains(class008912)) {
                return;
            }
            BiConsumer<class05420, class00891> var3 = class05404.P.get(class055652);
            if (var3 != null) {
                var3.accept(this, (class00891)class008912);
            }
        });
        return this;
    }

    public class05420 N(class00891 class008912, class05403 class054032) {
        this.i = class05404.N(class054032.N(class008912, this.y, this.N.L));
        if (class05404.W.containsKey(class008912)) {
            this.N.N.accept(class05404.W.get(class008912).create(class008912, this.i, this.y, this.N.L));
        } else {
            this.N.N.accept((class05399)class05404.N(class008912, class05404.N(this.i)));
        }
        return this;
    }

    public class05420 N(class00891 class008912, class00891 class008913) {
        class01894 class018942 = class05387.N(class008912);
        this.N.N.accept((class05399)class05404.N(class008913, class05404.y(class018942)));
        this.N.y.N(class008912.B(), class008913.B());
        this.R.add(class008913);
        return this;
    }

    public void W(class00891 class008912) {
        if (class05404.u.contains(class008912)) {
            this.N.U(class008912);
        } else {
            this.N.z(class008912);
        }
    }

    public class05420 R(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.S.N(class008912, this.y, this.N.L));
        class03264 class032643 = class05404.y(class05433.C.N(class008912, this.y, this.N.L));
        class03264 class032644 = class05404.y(class05433.D.N(class008912, this.y, this.N.L));
        class03264 class032645 = class05404.y(class05433.x.N(class008912, this.y, this.N.L));
        this.N.N.accept(class05404.N(class008912, class032642, class032643, class032644, class032645, true));
        return this;
    }
}

