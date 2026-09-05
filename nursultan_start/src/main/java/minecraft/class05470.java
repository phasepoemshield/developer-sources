/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10515
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class01590
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class02102
 *  minecraft.class03458
 *  minecraft.class03597
 *  minecraft.class03686
 *  minecraft.class04453
 *  minecraft.class04568
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10515;
import java.net.URI;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class01590;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class02102;
import minecraft.class03458;
import minecraft.class03597;
import minecraft.class03686;
import minecraft.class04453;
import minecraft.class04568;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05451;
import minecraft.class05463;
import minecraft.class05480;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class05470
extends class05096 {
    public static final class00392 N = class00392.L((String)"gui.socialInteractions.title");
    private static final class01894 M = class01894.y((String)"social_interactions/background");
    private static final class01894 B = class01894.y((String)"icon/search");
    private static final class00392 Z = class00392.L((String)"gui.socialInteractions.tab_all");
    private static final class00392 z = class00392.L((String)"gui.socialInteractions.tab_hidden");
    private static final class00392 U = class00392.L((String)"gui.socialInteractions.tab_blocked");
    private static final class00392 E = Z.y().N(class06541.field_1073);
    private static final class00392 W = z.y().N(class06541.field_1073);
    private static final class00392 m = U.y().N(class06541.field_1073);
    private static final class00392 P = class00392.L((String)"gui.socialInteractions.search_hint").L(class04927.field_62466);
    public static final class00392 y = class00392.L((String)"gui.socialInteractions.search_empty").N(class06541.field_1080);
    private static final class00392 s = class00392.L((String)"gui.socialInteractions.empty_hidden").N(class06541.field_1080);
    private static final class00392 T = class00392.L((String)"gui.socialInteractions.empty_blocked").N(class06541.field_1080);
    private static final class00392 b = class00392.L((String)"gui.socialInteractions.blocking_hint");
    private static final int j = 8;
    private static final int v = 236;
    private static final int n = 16;
    private static final int t = 64;
    public static final int L = 72;
    public static final int u = 88;
    private static final int G = 238;
    private static final int l = 20;
    private static final int d = 36;
    private final class03686 w = new class03686((class05096)this);
    private final @Nullable class05096 k;
    public @Nullable class05480 i;
    public class04927 R;
    private String Y = "";
    private class05451 Q = class05451.field_26890;
    private class05362 O;
    private class05362 g;
    private class05362 I;
    private class05362 J;
    private @Nullable class00392 o;
    private int q;

    private int L() {
        return (this.field_22789 - 238) / 2;
    }

    public class05470() {
        this(null);
    }

    public class05470(@Nullable class05096 class050962) {
        super(N);
        this.k = class050962;
        this.N(class06202.Nq());
    }

    private int y() {
        return 80 + this.N() - 8;
    }

    public void N(UUID uUID) {
        this.i.N(uUID);
    }

    public void N(class03458 class034582) {
        this.i.N(class034582, this.Q);
    }

    private void N(String string) {
        if (!(string = string.toLowerCase(Locale.ROOT)).equals(this.Y)) {
            this.i.N(string);
            this.Y = string;
            this.N(this.Q);
        }
    }

    private void N(class06202 class062022) {
        int n = class062022.NE().Z().size();
        if (this.q != n) {
            String string = "";
            class04568 class045682 = class062022.yN();
            if (class062022.q()) {
                string = class062022.Na().x();
            } else if (class045682 != null) {
                string = class045682.N;
            }
            this.o = n > 1 ? class00392.N((String)"gui.socialInteractions.server_label.multiple", (Object[])new Object[]{string, n}) : class00392.N((String)"gui.socialInteractions.server_label.single", (Object[])new Object[]{string, n});
            this.q = n;
        }
    }

    private int N() {
        return Math.max(52, this.field_22790 - 128 - 16);
    }

    private void N(class05451 class054512) {
        Object object;
        this.Q = class054512;
        this.O.method_25355(Z);
        this.g.method_25355(z);
        this.I.method_25355(U);
        boolean bl = false;
        switch (class054512.ordinal()) {
            case 0: {
                this.O.method_25355(E);
                Collection<UUID> var3 = ((class01683)((class04453)this.field_22787.T_4).y_0).z();
                this.i.N(var3, this.i.method_44387(), true);
                break;
            }
            case 1: {
                this.g.method_25355(W);
                Collection<UUID> var3 = this.field_22787.yv().L();
                bl = var3.isEmpty();
                this.i.N(var3, this.i.method_44387(), false);
                break;
            }
            case 2: {
                this.I.method_25355(m);
                object = this.field_22787.yv();
                Set<UUID> set = ((class01683)((class04453)this.field_22787.T_4).y_0).z().stream().filter(((class05463)object)::i).collect(Collectors.toSet());
                bl = set.isEmpty();
                this.i.N(set, this.i.method_44387(), false);
            }
        }
        object = this.field_22787.NT();
        if (!this.R.method_1882().isEmpty() && this.i.y() && !this.R.method_25370()) {
            object.u(y);
        } else if (bl) {
            if (class054512 == class05451.field_26891) {
                object.u(s);
            } else if (class054512 == class05451.field_26921) {
                object.u(T);
            }
        }
    }

    public void method_25426() {
        this.w.N(N, this.field_22793);
        this.i = new class05480(this, this.field_22787, this.field_22789, this.y() - 88, 88, 36);
        int n = this.i.method_25322() / 3;
        int n2 = this.i.method_25342();
        int n3 = this.i.method_31383();
        this.O = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)Z, class053622 -> this.N(class05451.field_26890)).N(n2, 45, n, 20).N());
        this.g = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)z, class053622 -> this.N(class05451.field_26891)).N((n2 + n3 - n) / 2 + 1, 45, n, 20).N());
        this.I = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)U, class053622 -> this.N(class05451.field_26921)).N(n3 - n + 1, 45, n, 20).N());
        String string = this.R != null ? this.R.method_1882() : "";
        this.R = (class04927)this.method_37063((class04654)new class10515(this, this.field_22793, this.L() + 28, 74, 200, 15, P));
        this.R.method_1880(16);
        this.R.method_1862(true);
        this.R.method_1868(-1);
        this.R.method_1852(string);
        this.R.method_47404(P);
        this.R.method_1863(this::N);
        this.J = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)b, (class05361)class01321.y((class05096)this, (URI)class03597.P)).N(this.field_22789 / 2 - 100, 64 + this.N(), 200, 20).N());
        this.method_25429((class04654)this.i);
        this.N(this.Q);
        this.w.y((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(200).N());
        this.w.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_49589() {
        if (this.i != null) {
            this.i.L();
        }
    }

    protected void method_56131() {
        this.method_48265((class04654)this.R);
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.R.method_25370() && ((class05630)this.field_22787.i_7).V.N(class066012)) {
            this.method_25419();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        this.w.N();
        this.i.method_57714(this.field_22789, this.y() - 88, 88);
        this.R.y(this.L() + 28, 74);
        int n = this.i.method_25342();
        int n2 = this.i.method_31383();
        int n3 = this.i.method_25322() / 3;
        this.O.y(n, 45);
        this.g.y((n + n2 - n3) / 2 + 1, 45);
        this.I.y(n2 - n3 + 1, 45);
        this.J.y(this.field_22789 / 2 - 100, 64 + this.N());
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        super.method_25420(class010542, n, n2, f);
        int n3 = this.L() + 3;
        class010542.N(class08394.Na, M, n3, 64, 236, this.N() + 16);
        class010542.N(class08394.Na, B, n3 + 10, 76, 12, 12);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.N(this.field_22787);
        if (this.o != null) {
            class010542.y((class01590)this.field_22787.i_3, this.o, this.L() + 8, 35, -1);
        }
        if (!this.i.y()) {
            this.i.method_25394(class010542, n, n2, f);
        } else if (!this.R.method_1882().isEmpty()) {
            class010542.N((class01590)this.field_22787.i_3, y, this.field_22789 / 2, (72 + this.y()) / 2, -1);
        } else if (this.Q == class05451.field_26891) {
            class010542.N((class01590)this.field_22787.i_3, s, this.field_22789 / 2, (72 + this.y()) / 2, -1);
        } else if (this.Q == class05451.field_26921) {
            class010542.N((class01590)this.field_22787.i_3, T, this.field_22789 / 2, (72 + this.y()) / 2, -1);
        }
        this.J.field_22764 = this.Q == class05451.field_26921;
    }

    public void method_25419() {
        this.field_22787.N(this.k);
    }

    public boolean method_25421() {
        return false;
    }

    public class00392 method_25435() {
        if (this.o != null) {
            return class05220.N((class00392[])new class00392[]{super.method_25435(), this.o});
        }
        return super.method_25435();
    }
}

