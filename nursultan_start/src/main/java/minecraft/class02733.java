/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06069
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class07536
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02759;
import minecraft.class06069;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07536;

public class class02733 {
    public static final class02362<ByteBuf, class02733> N = class02389.N(class02733::N, class02733::Z);
    private static final class02733[] y = (class02733[])class07536.N(() -> {
        class02733[] class02733Array = new class02733[48];
        class02733.N(new class02733(class07211.field_11036, class07211.field_11043, class02759.field_52681), class02733Array);
        return class02733Array;
    });
    private final class07211 L;
    private final class07211 u;
    private final class07211 i;
    private final class02759 R;
    private final int M;
    private final List<class07211> B;
    private final List<class07211> Z;
    private final List<class07211> z;
    private final Map<class07211, class02733> U = new EnumMap<class07211, class02733>(class07211.class);
    private final Map<class07211, class02733> E = new EnumMap<class07211, class02733>(class07211.class);
    private final Map<class02759, class02733> W = new EnumMap<class02759, class02733>(class02759.class);

    public class02733 L(class07211 class072112) {
        if (class072112.z() == this.L.z()) {
            return this;
        }
        return this.U.get(class072112);
    }

    public class07211 L() {
        return this.L;
    }

    public List<class07211> M() {
        return this.Z;
    }

    private class02733(class07211 class072113, class07211 class072114, class02759 class027592) {
        this.L = class072113;
        this.u = class072114;
        this.R = class027592;
        this.M = class02733.y(class072113, class072114, class027592);
        class07211 class072115 = class07211.N((class00753)class072114.E().method_10259(class072113.E()), null);
        Objects.requireNonNull(class072115);
        this.i = this.R == class02759.field_52682 ? class072115 : class072115.b();
        this.B = List.of(this.u.b(), this.u, this.i, this.i.b(), this.L.b(), this.L);
        this.Z = this.B.stream().filter(class072112 -> class072112.z() != this.L.z()).toList();
        this.z = this.B.stream().filter(class072112 -> class072112.z() == this.L.z()).toList();
    }

    public String toString() {
        return "[up=" + String.valueOf(this.L) + ",front=" + String.valueOf(this.u) + ",sideBias=" + String.valueOf((Object)this.R) + "]";
    }

    public List<class07211> B() {
        return this.z;
    }

    public int Z() {
        return this.M;
    }

    public class02759 i() {
        return this.R;
    }

    public class02733 u(class07211 class072112) {
        class02733 class027332 = this.y(class072112);
        if (this.u == class027332.i) {
            return class027332.N();
        }
        return class027332;
    }

    public class07211 u() {
        return this.i;
    }

    public class07211 y() {
        return this.u;
    }

    protected static int y(class07211 class072112, class07211 class072113, class02759 class027592) {
        if (class072112.z() == class072113.z()) {
            throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
        }
        int n = class072112.z() == class07185.field_11052 ? (class072113.z() == class07185.field_11048 ? 1 : 0) : (class072113.z() == class07185.field_11052 ? 1 : 0);
        int n2 = n << 1 | class072113.i().ordinal();
        return ((class072112.ordinal() << 2) + n2 << 1) + class027592.ordinal();
    }

    public class02733 y(class07211 class072112) {
        return this.U.get(class072112);
    }

    private static class02733 N(class02733 class027332, class02733[] class02733Array) {
        class07211 class072112;
        if (class02733Array[class027332.Z()] != null) {
            return class02733Array[class027332.Z()];
        }
        class02733Array[class027332.Z()] = class027332;
        for (class02759 class027592 : class02759.values()) {
            class027332.W.put(class027592, class02733.N(new class02733(class027332.L, class027332.u, class027592), class02733Array));
        }
        for (class02759 class027592 : class07211.values()) {
            class072112 = class027332.L;
            if (class027592 == class027332.L) {
                class072112 = class027332.u.b();
            }
            if (class027592 == class027332.L.b()) {
                class072112 = class027332.u;
            }
            class027332.U.put((class07211)class027592, class02733.N(new class02733(class072112, (class07211)class027592, class027332.R), class02733Array));
        }
        for (class02759 class027593 : class07211.values()) {
            class072112 = class027332.u;
            if (class027593 == class027332.u) {
                class072112 = class027332.L.b();
            }
            if (class027593 == class027332.u.b()) {
                class072112 = class027332.L;
            }
            class027332.E.put((class07211)class027593, class02733.N(new class02733((class07211)class027593, class072112, class027332.R), class02733Array));
        }
        return class027332;
    }

    public class02733 N(class02759 class027592) {
        return this.W.get((Object)class027592);
    }

    public class02733 N() {
        return this.N(this.R.N());
    }

    public class02733 N(class07211 class072112) {
        return this.E.get(class072112);
    }

    public static class02733 N(class07211 class072112, class07211 class072113, class02759 class027592) {
        return y[class02733.y(class072112, class072113, class027592)];
    }

    public static class02733 N(int n) {
        return y[n];
    }

    public static class02733 N(class06069 class060692) {
        return (class02733)class07536.N((Object[])y, (class06069)class060692);
    }

    public List<class07211> R() {
        return this.B;
    }
}

