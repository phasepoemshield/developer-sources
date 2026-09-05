/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  minecraft.class00429
 *  minecraft.class00434
 *  minecraft.class00457
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class01861
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class07049
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00429;
import minecraft.class00434;
import minecraft.class00457;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class01861;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class07049;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class05375
implements class01857 {
    private static final boolean N = true;
    private static final boolean y = false;
    private static final boolean L = false;
    private static final boolean u = false;
    private static final boolean i = false;
    private static final boolean R = false;
    private static final boolean M = false;
    private static final boolean B = true;
    private static final boolean Z = false;
    private static final boolean z = true;
    private static final boolean U = true;
    private static final boolean E = true;
    private static final boolean W = true;
    private static final boolean m = true;
    private static final boolean P = true;
    private static final boolean s = true;
    private static final boolean T = true;
    private static final boolean b = true;
    private static final boolean j = true;
    private static final int v = 30;
    private static final int n = 8;
    private static final float t = 0.32f;
    private static final int G = -16711681;
    private static final int l = -3355444;
    private static final int d = -98404;
    private static final int w = -23296;
    private final class06202 k;
    private @Nullable UUID Y;

    public class05375(class06202 class062022) {
        this.k = class062022;
    }

    private void y(class00457 class004572) {
        class004572.L(class00429.L, (class070492, class004342) -> {
            if (((class04453)this.k.T_4).method_24516(class070492, 30.0)) {
                this.N((class07049)class070492, (class00434)class004342);
            }
        });
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        this.y(class004572);
        if (!((class04453)this.k.T_4).method_7325()) {
            this.N();
        }
    }

    public Map<class07209, List<String>> N(class00457 class004572) {
        HashMap hashMap = Maps.newHashMap();
        class004572.L(class00429.L, (class070492, class004342) -> {
            for (class07209 class072093 : Iterables.concat((Iterable)class004342.W(), (Iterable)class004342.m())) {
                hashMap.computeIfAbsent(class072093, class072092 -> Lists.newArrayList()).add(class004342.N());
            }
        });
        return hashMap;
    }

    private void N() {
        class01861.N((class07049)this.k.F(), (int)8).ifPresent(class070492 -> {
            this.Y = class070492.method_5667();
        });
    }

    private boolean N(class07049 class070492) {
        return Objects.equals(this.Y, class070492.method_5667());
    }

    private void N(class07049 class070492, class00434 class004342) {
        boolean bl = this.N(class070492);
        int n = 0;
        class06724.N((class07049)class070492, (int)n, (String)class004342.N(), (int)-1, (float)0.48f);
        ++n;
        if (bl) {
            class06724.N((class07049)class070492, (int)n, (String)(class004342.y() + " " + class004342.L() + " xp"), (int)-1, (float)0.32f);
            ++n;
        }
        if (bl) {
            int n2 = class004342.u() < class004342.i() ? -23296 : -1;
            class06724.N((class07049)class070492, (int)n, (String)("health: " + String.format(Locale.ROOT, "%.1f", Float.valueOf(class004342.u())) + " / " + String.format(Locale.ROOT, "%.1f", Float.valueOf(class004342.i()))), (int)n2, (float)0.32f);
            ++n;
        }
        if (bl && !class004342.R().equals("")) {
            class06724.N((class07049)class070492, (int)n, (String)class004342.R(), (int)-98404, (float)0.32f);
            ++n;
        }
        if (bl) {
            for (String string : class004342.z()) {
                class06724.N((class07049)class070492, (int)n, (String)string, (int)-16711681, (float)0.32f);
                ++n;
            }
        }
        if (bl) {
            for (String string : class004342.Z()) {
                class06724.N((class07049)class070492, (int)n, (String)string, (int)-16711936, (float)0.32f);
                ++n;
            }
        }
        if (class004342.M()) {
            class06724.N((class07049)class070492, (int)n, (String)"Wants Golem", (int)-23296, (float)0.32f);
            ++n;
        }
        if (bl && class004342.B() != -1) {
            class06724.N((class07049)class070492, (int)n, (String)("Anger Level: " + class004342.B()), (int)-98404, (float)0.32f);
            ++n;
        }
        if (bl) {
            for (String string : class004342.E()) {
                if (string.startsWith(class004342.N())) {
                    class06724.N((class07049)class070492, (int)n, (String)string, (int)-1, (float)0.32f);
                } else {
                    class06724.N((class07049)class070492, (int)n, (String)string, (int)-23296, (float)0.32f);
                }
                ++n;
            }
        }
        if (bl) {
            for (String string : Lists.reverse((List)class004342.U())) {
                class06724.N((class07049)class070492, (int)n, (String)string, (int)-3355444, (float)0.32f);
                ++n;
            }
        }
    }
}

