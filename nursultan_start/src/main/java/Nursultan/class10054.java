/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09770
 *  Nursultan.class09781
 *  Nursultan.class09980
 */
package Nursultan;

import Nursultan.class09770;
import Nursultan.class09781;
import Nursultan.class09980;
import Nursultan.class10021;
import Nursultan.class10022;
import Nursultan.class10026;
import Nursultan.class10030;
import Nursultan.class10031;
import Nursultan.class10037;
import Nursultan.class10043;
import Nursultan.class10052;
import Nursultan.class10056;
import Nursultan.class10058;
import Nursultan.class10060;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public final class class10054 {
    private static final Logger N = Logger.getLogger(class10054.class.getName());
    private static final int y = 8192;
    private static final class10043 L = new class10043();
    private final class09781 u;
    private final class10037 i;
    private final Map<class10021, class10060> R = new class10031(this, 256, 0.75f, true);
    private class10030 M = new class10030();
    private int B;

    class10054(class09781 class097812) {
        this.u = Objects.requireNonNull(class097812, "context");
        this.i = class10037.N(class097812);
    }

    class10037 y() {
        return this.i;
    }

    private static String y(class10021 class100212) {
        String string = class100212.N();
        return string == null || string.isBlank() ? "<anonymous>" : string;
    }

    private class10060 y(class10021 class100213, class09980 class099802) {
        class10060 class100602 = (class10060)this.R.computeIfAbsent(class100213, class100212 -> new class10060());
        int n = class100213.k();
        int n2 = class100213.l();
        int n3 = this.u.u().y();
        if (!class100602.i || class100602.y != n || class100602.L != n2 || class100602.u != n3) {
            class100602.i = true;
            class100602.y = n;
            class100602.L = n2;
            class100602.u = n3;
            class100602.R = null;
            class100602.M.clear();
        }
        return class100602;
    }

    public boolean N(class10021 class100212, float f, float f2, class09770 class097702) {
        if (class100212 == null) {
            return false;
        }
        class09770 class097703 = class097702 == null ? class09770.N : class097702;
        class10052 class100522 = new class10052(this, class100212, Math.max(0.0f, f), Math.max(0.0f, f2), this.u.u().N(), ++this.B);
        class100522.B();
        class10030 class100302 = this.M = class100522.i();
        if (class097703.u()) {
            N.info(() -> "Layout rebuilt for root='" + class10054.y(class100212) + "', viewport=" + class100522.y() + "x" + class100522.L() + ", epoch=" + class100522.u() + ", metadataNodes=" + class100302.N + ", intrinsicNodes=" + class100302.y + ", widthSizingNodes=" + class100302.L + ", heightSizingNodes=" + class100302.u + ", textWrapNodes=" + class100302.i + ", heightRecomputeNodes=" + class100302.R + ", positioningNodes=" + class100302.M);
        }
        return true;
    }

    public boolean N(class10021 class100212, float f, float f2) {
        return this.N(class100212, f, f2, class09770.N);
    }

    public static class10054 N(class09781 class097812) {
        class09781 class097813 = Objects.requireNonNull(class097812, "context");
        return (class10054)class097813.N(class10054.class).orElseGet(() -> {
            class10054 class100542 = new class10054(class097813);
            class097813.N(class10054.class, (Object)class100542);
            return class100542;
        });
    }

    class10030 N() {
        return this.M;
    }

    class10056 N(class10021 class100212, class09980 class099802) {
        class10060 class100602 = this.y(class100212, class099802);
        if (class100602.R != null) {
            return class100602.R;
        }
        class100602.R = class10058.N(this.u, class100212.B(), class099802.c(), class099802.X());
        return class100602.R;
    }

    class10026 N(class10021 class100212, class09980 class099802, float f) {
        class10060 class100602 = this.y(class100212, class099802);
        int n = Float.floatToIntBits(f);
        class10026 class100262 = class100602.M.get(n);
        if (class100262 != null) {
            return class100262;
        }
        class10026 class100263 = class10058.N(this.u, class100212.B(), f, class099802.c(), class099802.X(), this.N(class100212, class099802));
        class100602.M.put(n, class100263);
        return class100263;
    }

    public boolean N(class10021 class100212) {
        if (class100212 == null) {
            return false;
        }
        class10030 class100302 = new class10030();
        new class10022(class100302, L, this.u.u().N(), false).N(class100212);
        class100212.L(4);
        this.M = class100302;
        return true;
    }
}

