/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  jerozgen.languagereload.access.IAdvancementsScreen
 *  jerozgen.languagereload.access.IAdvancementsTab
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01683
 *  minecraft.class01700
 *  minecraft.class01707
 *  minecraft.class01894
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class03711
 *  minecraft.class03734
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05502
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06220
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class07339
 *  minecraft.class08019
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import jerozgen.languagereload.access.IAdvancementsScreen;
import jerozgen.languagereload.access.IAdvancementsTab;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01387;
import minecraft.class01683;
import minecraft.class01700;
import minecraft.class01707;
import minecraft.class01894;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class03711;
import minecraft.class03734;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05502;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class07339;
import minecraft.class08019;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class01417
extends class05096
implements class01700,
IAdvancementsScreen {
    private static final class01894 Z = class01894.y((String)"textures/gui/advancements/window.png");
    public static final int N = 252;
    public static final int y = 140;
    private static final int z = 9;
    private static final int U = 18;
    public static final int L = 234;
    public static final int u = 113;
    private static final int E = 8;
    private static final int W = 6;
    private static final int m = 256;
    private static final int P = 256;
    public static final int i = 16;
    public static final int R = 16;
    public static final int M = 14;
    public static final int B = 7;
    private static final double s = 16.0;
    private static final class00392 T = class00392.L((String)"advancements.sad_label");
    private static final class00392 b = class00392.L((String)"advancements.empty");
    private static final class00392 j = class00392.L((String)"gui.advancements");
    private final class03686 v = new class03686((class05096)this);
    private final @Nullable class05096 n;
    private final class01707 t;
    private final Map<class03711, class05502> G = Maps.newLinkedHashMap();
    private @Nullable class05502 l;
    private boolean d;

    public void L(class03734 class037342) {
        class05502 class055022 = this.R(class037342);
        if (class055022 != null) {
            class055022.N(class037342);
        }
    }

    public class01417(class01707 class017072) {
        this(class017072, null);
    }

    public class01417(class01707 class017072, @Nullable class05096 class050962) {
        super(j);
        this.t = class017072;
        this.n = class050962;
    }

    public @Nullable class01387 i(class03734 class037342) {
        class05502 class055022 = this.R(class037342);
        return class055022 == null ? null : class055022.N(class037342.y());
    }

    public void u(class03734 class037342) {
    }

    public void y(class03734 class037342) {
    }

    private void y(class01054 class010542, int n, int n2, int n3, int n4) {
        if (this.l != null) {
            class010542.i().pushMatrix();
            class010542.i().translate((float)(n3 + 9), (float)(n4 + 18));
            class010542.L();
            this.l.N(class010542, n - n3 - 9, n2 - n4 - 18, n3, n4);
            class010542.i().popMatrix();
        }
        if (this.G.size() > 1) {
            for (class05502 class055022 : this.G.values()) {
                if (!class055022.N(n3, n4, (double)n, (double)n2)) continue;
                class010542.N(this.field_22793, class055022.u(), n, n2);
            }
        }
    }

    private void N(class01054 class010542, int n, int n2) {
        class05502 class055022 = this.l;
        if (class055022 == null) {
            class010542.N(n + 9, n2 + 18, n + 9 + 234, n2 + 18 + 113, -16777216);
            int n3 = n + 9 + 117;
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, b, n3, n2 + 18 + 56 - 4, -1);
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, T, n3, n2 + 18 + 113 - 9, -1);
            return;
        }
        class055022.y(class010542, n + 9, n2 + 18);
    }

    public void N(class01054 class010542, int n, int n2, int n3, int n4) {
        class010542.N(class08394.Na, Z, n, n2, 0.0f, 0.0f, 252, 140, 256, 256);
        if (this.G.size() > 1) {
            for (class05502 class055022 : this.G.values()) {
                class055022.N(class010542, n, n2, n3, n4, class055022 == this.l);
            }
            for (class05502 class055022 : this.G.values()) {
                class055022.N(class010542, n, n2);
            }
        }
        class010542.N(this.field_22793, this.l != null ? this.l.u() : j, n + 8, n2 + 6, -12566464, false);
    }

    public void N(class03734 class037342, class08019 class080192) {
        class01387 class013872 = this.i(class037342);
        if (class013872 != null) {
            class013872.N(class080192);
        }
    }

    public void N(class03734 class037342) {
        class05502 class055022 = class05502.N((class06202)this.field_22787, (class01417)this, (int)this.G.size(), (class03734)class037342);
        if (class055022 == null) {
            return;
        }
        this.G.put(class037342.y(), class055022);
    }

    public void N() {
        this.G.clear();
        this.l = null;
    }

    public void N(@Nullable class03711 class037112) {
        this.l = this.G.get(class037112);
    }

    public void method_25426() {
        this.v.N(j, this.field_22793);
        this.G.clear();
        this.l = null;
        this.t.N((class01700)this);
        if (this.l == null && !this.G.isEmpty()) {
            class05502 class055022 = this.G.values().iterator().next();
            this.t.N(class055022.L().y(), true);
        } else {
            this.t.N(this.l == null ? null : this.l.L().y(), true);
        }
        this.v.y((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(200).N());
        this.v.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public boolean method_25404(class06601 class066012) {
        if (((class05630)this.field_22787.i_7).a.N(class066012)) {
            this.field_22787.N(null);
            ((class06220)this.field_22787.L_2).Z();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        this.v.N();
    }

    public void method_25432() {
        this.t.N(null);
        class01683 class016832 = this.field_22787.NE();
        if (class016832 != null) {
            class016832.N((class00381)class07339.N());
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        int n3 = (this.field_22789 - 252) / 2;
        int n4 = (this.field_22790 - 140) / 2;
        class010542.L();
        this.N(class010542, n3, n4);
        class010542.L();
        this.N(class010542, n3, n4, n, n2);
        if (this.d && this.l != null) {
            if (this.l.R() && this.l.M()) {
                class010542.N(class06608.M);
            } else if (this.l.R()) {
                class010542.N(class06608.R);
            } else if (this.l.M()) {
                class010542.N(class06608.i);
            }
        }
        this.y(class010542, n, n2, n3, n4);
    }

    public void method_25419() {
        this.field_22787.N(this.n);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (class066132.v() != 0) {
            this.d = false;
            return false;
        }
        if (!this.d) {
            this.d = true;
        } else if (this.l != null) {
            this.l.N(d, d2);
        }
        return true;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.l != null) {
            this.l.N(d3 * 16.0, d4 * 16.0);
            return true;
        }
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        this.d = false;
        return super.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() == 0) {
            int n = (this.field_22789 - 252) / 2;
            int n2 = (this.field_22790 - 140) / 2;
            for (class05502 class055022 : this.G.values()) {
                if (!class055022.N(n, n2, class066132.n(), class066132.t())) continue;
                this.t.N(class055022.L().y(), true);
                break;
            }
        }
        return super.method_25402(class066132, bl);
    }

    private @Nullable class05502 R(class03734 class037342) {
        class03734 class037343 = class037342.u();
        return this.G.get(class037343.y());
    }

    public void languagereload_recreateWidgets() {
        Iterator<class05502> var1 = this.G.values().iterator();
        while (var1.hasNext()) {
            ((IAdvancementsTab)var1.next()).languagereload_recreateWidgets();
        }
    }
}

