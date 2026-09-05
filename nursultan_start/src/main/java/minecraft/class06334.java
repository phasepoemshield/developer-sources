/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02128
 *  minecraft.class02484
 *  minecraft.class02830
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06584
 *  minecraft.class08394
 *  org.apache.commons.lang3.math.Fraction
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02128;
import minecraft.class02484;
import minecraft.class02830;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06357;
import minecraft.class06584;
import minecraft.class08394;
import org.apache.commons.lang3.math.Fraction;
import org.jspecify.annotations.Nullable;

public class class06334
implements class06357 {
    private static final class01894 N = class01894.y((String)"container/bundle/bundle_progressbar_border");
    private static final class01894 y = class01894.y((String)"container/bundle/bundle_progressbar_fill");
    private static final class01894 L = class01894.y((String)"container/bundle/bundle_progressbar_full");
    private static final class01894 u = class01894.y((String)"container/bundle/slot_highlight_back");
    private static final class01894 i = class01894.y((String)"container/bundle/slot_highlight_front");
    private static final class01894 R = class01894.y((String)"container/bundle/slot_background");
    private static final int M = 4;
    private static final int B = 24;
    private static final int Z = 96;
    private static final int z = 13;
    private static final int U = 96;
    private static final int E = 1;
    private static final int W = 94;
    private static final int m = 4;
    private static final class00392 P = class00392.L((String)"item.minecraft.bundle.full");
    private static final class00392 s = class00392.L((String)"item.minecraft.bundle.empty");
    private static final class00392 T = class00392.L((String)"item.minecraft.bundle.empty.description");
    private final class02830 b;

    private int L() {
        return this.u() * 24;
    }

    private class01894 M() {
        return this.b.R().compareTo(Fraction.ONE) >= 0 ? L : y;
    }

    public class06334(class02830 class028302) {
        this.b = class028302;
    }

    private @Nullable class00392 B() {
        if (this.b.M()) {
            return s;
        }
        if (this.b.R().compareTo(Fraction.ONE) >= 0) {
            return P;
        }
        return null;
    }

    private int i() {
        return Math.min(12, this.b.i());
    }

    private int u() {
        return class04995.R((int)this.i(), (int)4);
    }

    private void y(class01590 class015902, int n, int n2, int n3, int n4, class01054 class010542) {
        boolean bl = this.b.i() > 12;
        List<class06584> var8 = this.y(this.b.N());
        int n5 = n + this.N(n3) + 96;
        int n6 = n2 + this.u() * 24;
        int n7 = 1;
        for (int i = 1; i <= this.u(); ++i) {
            for (int j = 1; j <= 4; ++j) {
                int n8 = n5 - j * 24;
                int n9 = n6 - i * 24;
                if (class06334.N(bl, j, i)) {
                    class06334.N(n8, n9, this.N(var8), class015902, class010542);
                    continue;
                }
                if (!class06334.N(var8, n7)) continue;
                this.N(n7, n8, n9, var8, n7, class015902, class010542);
                ++n7;
            }
        }
        this.N(class015902, class010542, n, n2, n3);
        this.N(n + this.N(n3), n2 + this.L() + 4, class015902, class010542);
    }

    private static int y(class01590 class015902) {
        int n = class015902.L((class05936)T, 96).size();
        Objects.requireNonNull(class015902);
        return n * 9;
    }

    private static void y(int n, int n2, class01590 class015902, class01054 class010542) {
        class010542.N(class015902, (class05936)T, n, n2, 96, -5592406);
    }

    private List<class06584> y(int n) {
        int n2 = Math.min(this.b.i(), n);
        return this.b.y().toList().subList(0, n2);
    }

    private int y() {
        return this.L() + 13 + 8;
    }

    private static void N(int n, int n2, int n3, class01590 class015902, class01054 class010542) {
        class010542.N(class015902, "+" + n3, n + 12, n2 + 10, -1);
    }

    private void N(class01590 class015902, class01054 class010542, int n, int n2, int n3) {
        if (this.b.Z()) {
            class06584 class065842 = this.b.N(this.b.B());
            class00392 class003922 = class065842.Y();
            int n4 = class015902.N(class003922.method_30937());
            int n5 = n + n3 / 2 - 12;
            class06357 class063572 = class06357.N(class003922.method_30937());
            class010542.N(class015902, List.of(class063572), n5 - n4 / 2, n2 - 15, class02128.N, (class01894)class065842.method_58694(class02484.V));
        }
    }

    private void N(int n, int n2, int n3, List<class06584> list, int n4, class01590 class015902, class01054 class010542) {
        int n5 = list.size() - n;
        boolean bl = n5 == this.b.B();
        class06584 class065842 = list.get(n5);
        if (bl) {
            class010542.N(class08394.Na, u, n2, n3, 24, 24);
        } else {
            class010542.N(class08394.Na, R, n2, n3, 24, 24);
        }
        class010542.N(class065842, n2 + 4, n3 + 4, n4);
        class010542.N(class015902, class065842, n2 + 4, n3 + 4);
        if (bl) {
            class010542.N(class08394.Na, i, n2, n3, 24, 24);
        }
    }

    private void N(int n, int n2, class01590 class015902, class01054 class010542) {
        class010542.N(class08394.Na, this.M(), n + 1, n2, this.R(), 13);
        class010542.N(class08394.Na, N, n, n2, 96, 13);
        class00392 class003922 = this.B();
        if (class003922 != null) {
            class010542.N(class015902, class003922, n + 48, n2 + 3, -1);
        }
    }

    private static int N(class01590 class015902) {
        return class06334.y(class015902) + 13 + 8;
    }

    private int N(int n) {
        return (n - 96) / 2;
    }

    @Override
    public boolean N() {
        return true;
    }

    private void N(class01590 class015902, int n, int n2, int n3, int n4, class01054 class010542) {
        class06334.y(n + this.N(n3), n2, class015902, class010542);
        this.N(n + this.N(n3), n2 + class06334.y(class015902) + 4, class015902, class010542);
    }

    private int N(List<class06584> list) {
        return this.b.y().skip(list.size()).mapToInt(class06584::c).sum();
    }

    private static boolean N(boolean bl, int n, int n2) {
        return bl && n * n2 == 1;
    }

    private static boolean N(List<class06584> list, int n) {
        return list.size() >= n;
    }

    @Override
    public void method_32666(class01590 class015902, int n, int n2, int n3, int n4, class01054 class010542) {
        if (this.b.M()) {
            this.N(class015902, n, n2, n3, n4, class010542);
        } else {
            this.y(class015902, n, n2, n3, n4, class010542);
        }
    }

    @Override
    public int method_32664(class01590 class015902) {
        return 96;
    }

    @Override
    public int method_32661(class01590 class015902) {
        return this.b.M() ? class06334.N(class015902) : this.y();
    }

    private int R() {
        return class04995.N((int)class04995.N((Fraction)this.b.R(), (int)94), (int)0, (int)94);
    }
}

