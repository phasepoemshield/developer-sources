/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04961
 *  minecraft.class04981
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class07282
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04961;
import minecraft.class04981;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05685;
import minecraft.class05699;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class07282;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

abstract class class05728
extends class05699<class05728> {
    protected static final int L = 10;
    private static final int N = 28;
    protected static final int u = 7;
    protected static final int i = 2;
    final /* synthetic */ class05685 R;

    protected int L(int n) {
        return n + this.y();
    }

    class05728(class05685 class056852) {
        this.R = class056852;
    }

    protected int u(int n) {
        return n + this.y() * 2;
    }

    protected int y() {
        Objects.requireNonNull(class05685.T(this.R));
        return 2 + 9;
    }

    protected int y(int n, int n2, class00392 class003922) {
        return n + n2 - class05685.P(this.R).N((class05936)class003922) - 20;
    }

    protected int y(int n) {
        return n + 36 + 2;
    }

    private void N(class01054 class010542, int n, int n2, int n3, int n4, class01894 class018942, Supplier<class00392> supplier) {
        class010542.N(class08394.Na, class018942, n, n2, 10, 28);
        if (this.R.b.method_25405(n3, n4) && n3 >= n && n3 <= n + 10 && n4 >= n2 && n4 <= n2 + 28) {
            class010542.N(supplier.get(), n3, n4);
        }
    }

    protected void N(class01054 class010542, int n, int n2, int n3, int n4, class04981 class049812) {
        int n5 = this.y(n2);
        int n6 = this.N(n);
        class00392 class003922 = class05685.N(class049812.G, class049812.u());
        int n7 = this.N(n2, n3, class003922);
        this.N(class010542, class049812.y(), n5, n6, n7, n4);
        if (class003922 != class05220.N && !class049812.z()) {
            class010542.y(class05685.i(this.R), class003922, n7, n6, -8355712);
        }
    }

    protected void N(class04981 class049812, class01054 class010542, int n, int n2, int n3, int n4) {
        int n5 = n - 10 - 7;
        int n6 = n2 + 2;
        if (class049812.U) {
            this.N(class010542, n5, n6, n3, n4, class05685.L, () -> class05685.E);
        } else if (class049812.R == class04961.field_19433) {
            this.N(class010542, n5, n6, n3, n4, class05685.R, () -> class05685.s);
        } else if (class05685.N(class049812) && class049812.W < 7) {
            this.N(class010542, n5, n6, n3, n4, class05685.u, () -> {
                if (class049812.W <= 0) {
                    return class05685.W;
                }
                if (class049812.W == 1) {
                    return class05685.m;
                }
                return class00392.N((String)"mco.selectServer.expires.days", (Object[])new Object[]{class049812.W});
            });
        } else if (class049812.R == class04961.field_19434) {
            this.N(class010542, n5, n6, n3, n4, class05685.i, () -> class05685.P);
        }
    }

    protected int N(class04981 class049812, class01054 class010542, int n, int n2, int n3) {
        boolean bl = class049812.P;
        int n4 = class049812.s;
        int n5 = n;
        if (class07282.L((int)n4)) {
            class00392 class003922 = class05685.N(n4, bl);
            n5 = this.y(n, n2, class003922);
            class010542.y(class05685.s(this.R), class003922, n5, this.L(n3), -8355712);
        }
        if (bl) {
            class010542.N(class08394.Na, class05685.M, n5 -= 10, this.L(n3), 8, 8);
        }
        return n5;
    }

    protected void N(class01054 class010542, @Nullable String string, int n, int n2, int n3, int n4) {
        if (string == null) {
            return;
        }
        int n5 = n3 - n;
        if (class05685.Z(this.R).y(string) > n5) {
            String string2 = class05685.U(this.R).N(string, n5 - class05685.z(this.R).y("... "));
            class010542.y(class05685.E(this.R), string2 + "...", n, n2, n4);
        } else {
            class010542.y(class05685.W(this.R), string, n, n2, n4);
        }
    }

    protected int N(int n, int n2, class00392 class003922) {
        return n + n2 - class05685.m(this.R).N((class05936)class003922) - 20;
    }

    protected void N(class01054 class010542, int n, int n2, int n3, class04981 class049812) {
        int n4 = this.y(n2);
        int n5 = this.N(n);
        int n6 = this.L(n5);
        String string = class049812.L();
        if (class049812.z() && string != null) {
            class05216 class052162 = class00392.y((String)string).N(class06541.field_1080);
            class010542.y(class05685.R(this.R), (class00392)class00392.N((String)"mco.selectServer.minigameName", (Object[])new Object[]{class052162}).y(-171), n4, n6, -1);
        } else {
            int n7 = this.N(class049812, class010542, n2, n3, n5);
            this.N(class010542, class049812.N(), n4, this.L(n5), n7, -8355712);
        }
    }

    protected int N(int n) {
        return n + 1;
    }

    protected void N(class01054 class010542, int n, int n2, class04981 class049812) {
        int n3 = this.y(n2);
        int n4 = this.N(n);
        int n5 = this.u(n4);
        if (!class05685.N(class049812)) {
            class010542.y(class05685.M(this.R), class049812.M, n3, this.u(n4), -8355712);
        } else if (class049812.U) {
            class00392 class003922 = class049812.E ? class05685.U : class05685.z;
            class010542.y(class05685.B(this.R), class003922, n3, n5, -2142128);
        }
    }
}

