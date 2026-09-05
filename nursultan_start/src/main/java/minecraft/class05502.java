/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  jerozgen.languagereload.access.IAdvancementsTab
 *  jerozgen.languagereload.mixin.AdvancementWidgetAccessor
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01387
 *  minecraft.class01417
 *  minecraft.class01894
 *  minecraft.class03711
 *  minecraft.class03734
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06513
 *  minecraft.class06584
 *  minecraft.class06608
 *  minecraft.class06953
 *  minecraft.class08394
 *  minecraft.class08627
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import jerozgen.languagereload.access.IAdvancementsTab;
import jerozgen.languagereload.mixin.AdvancementWidgetAccessor;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01387;
import minecraft.class01417;
import minecraft.class01894;
import minecraft.class03711;
import minecraft.class03734;
import minecraft.class04995;
import minecraft.class05525;
import minecraft.class06202;
import minecraft.class06513;
import minecraft.class06584;
import minecraft.class06608;
import minecraft.class06953;
import minecraft.class08394;
import minecraft.class08627;
import org.jspecify.annotations.Nullable;

public class class05502
implements IAdvancementsTab {
    private final class06202 N;
    private final class01417 y;
    private final class05525 L;
    private final int u;
    private final class03734 i;
    private final class06513 R;
    private final class06584 M;
    private final class00392 B;
    private final class01387 Z;
    private final Map<class03711, class01387> z = Maps.newLinkedHashMap();
    private double U;
    private double E;
    private int W = Integer.MAX_VALUE;
    private int m = Integer.MAX_VALUE;
    private int P = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;
    private float T;
    private boolean b;

    public class03734 L() {
        return this.i;
    }

    public boolean M() {
        return this.s - this.m > 113;
    }

    public class05502(class06202 class062022, class01417 class014172, class05525 class055252, int n, class03734 class037342, class06513 class065132) {
        this.N = class062022;
        this.y = class014172;
        this.L = class055252;
        this.u = n;
        this.i = class037342;
        this.R = class065132;
        this.M = class065132.L();
        this.B = class065132.N();
        this.Z = new class01387(this, class062022, class037342, class065132);
        this.N(this.Z, class037342.y());
    }

    public class01417 B() {
        return this.y;
    }

    public class06513 i() {
        return this.R;
    }

    public class00392 u() {
        return this.B;
    }

    public void y(class01054 class010542, int n, int n2) {
        if (!this.b) {
            this.U = 117 - (this.P + this.W) / 2;
            this.E = 56 - (this.s + this.m) / 2;
            this.b = true;
        }
        class010542.L(n, n2, n + 234, n2 + 113);
        class010542.i().pushMatrix();
        class010542.i().translate((float)n, (float)n2);
        class01894 class018942 = this.R.u().map(class06953::y).orElse(class08627.N);
        int n3 = class04995.N((double)this.U);
        int n4 = class04995.N((double)this.E);
        int n5 = n3 % 16;
        int n6 = n4 % 16;
        for (int i = -1; i <= 15; ++i) {
            for (int j = -1; j <= 8; ++j) {
                class010542.N(class08394.Na, class018942, n5 + 16 * i, n6 + 16 * j, 0.0f, 0.0f, 16, 16, 16, 16);
            }
        }
        this.Z.N(class010542, n3, n4, true);
        this.Z.N(class010542, n3, n4, false);
        this.Z.N(class010542, n3, n4);
        class010542.i().popMatrix();
        class010542.R();
    }

    public int y() {
        return this.u;
    }

    public void N(class03734 class037342) {
        Optional var2 = class037342.N().L();
        if (var2.isEmpty()) {
            return;
        }
        class01387 class013872 = new class01387(this, this.N, class037342, (class06513)var2.get());
        this.N(class013872, class037342.y());
    }

    public void N(double d, double d2) {
        if (this.R()) {
            this.U = class04995.N((double)(this.U + d), (double)(-(this.P - 234)), (double)0.0);
        }
        if (this.M()) {
            this.E = class04995.N((double)(this.E + d2), (double)(-(this.s - 113)), (double)0.0);
        }
    }

    private void N(class01387 class013872, class03711 class037112) {
        this.z.put(class037112, class013872);
        int n = class013872.u();
        int n2 = n + 28;
        int n3 = class013872.L();
        int n4 = n3 + 27;
        this.W = Math.min(this.W, n);
        this.P = Math.max(this.P, n2);
        this.m = Math.min(this.m, n3);
        this.s = Math.max(this.s, n4);
        Iterator<class01387> var7 = this.z.values().iterator();
        while (var7.hasNext()) {
            var7.next().y();
        }
    }

    public @Nullable class01387 N(class03711 class037112) {
        return this.z.get(class037112);
    }

    public void N(class01054 class010542, int n, int n2, int n3, int n4, boolean bl) {
        int n5 = n + this.L.N(this.u);
        int n6 = n2 + this.L.y(this.u);
        this.L.N(class010542, n5, n6, bl, this.u);
        if (!bl && n3 > n5 && n4 > n6 && n3 < n5 + this.L.N() && n4 < n6 + this.L.y()) {
            class010542.N(class06608.u);
        }
    }

    public class05525 N() {
        return this.L;
    }

    public void N(class01054 class010542, int n, int n2, int n3, int n4) {
        class010542.N(0, 0, 234, 113, class04995.y((float)(this.T * 255.0f)) << 24);
        boolean bl = false;
        int n5 = class04995.N((double)this.U);
        int n6 = class04995.N((double)this.E);
        if (n > 0 && n < 234 && n2 > 0 && n2 < 113) {
            for (class01387 class013872 : this.z.values()) {
                if (!class013872.N(n5, n6, n, n2)) continue;
                bl = true;
                class013872.N(class010542, n5, n6, this.T, n3, n4);
                break;
            }
        }
        this.T = bl ? class04995.N((float)(this.T + 0.02f), (float)0.0f, (float)0.3f) : class04995.N((float)(this.T - 0.04f), (float)0.0f, (float)1.0f);
    }

    public void N(class01054 class010542, int n, int n2) {
        this.L.N(class010542, n, n2, this.u, this.M);
    }

    public static @Nullable class05502 N(class06202 class062022, class01417 class014172, int n, class03734 class037342) {
        Optional var4 = class037342.N().L();
        if (var4.isEmpty()) {
            return null;
        }
        for (class05525 class055252 : class05525.values()) {
            if (n >= class055252.L()) {
                n -= class055252.L();
                continue;
            }
            return new class05502(class062022, class014172, class055252, n, class037342, (class06513)var4.get());
        }
        return null;
    }

    public boolean N(int n, int n2, double d, double d2) {
        return this.L.N(n, n2, this.u, d, d2);
    }

    public boolean R() {
        return this.P - this.W > 234;
    }

    public void languagereload_recreateWidgets() {
        this.z.replaceAll((class037112, class013872) -> {
            class01387 class013873 = new class01387(((AdvancementWidgetAccessor)class013872).languagereload_getTab(), this.N, ((AdvancementWidgetAccessor)class013872).languagereload_getAdvancement(), ((AdvancementWidgetAccessor)class013872).languagereload_getDisplay());
            class013873.N(((AdvancementWidgetAccessor)class013872).languagereload_getProgress());
            ((AdvancementWidgetAccessor)class013873).languagereload_setParent(((AdvancementWidgetAccessor)class013872).languagereload_getParent());
            ((AdvancementWidgetAccessor)class013873).languagereload_setChildren(((AdvancementWidgetAccessor)class013872).languagereload_getChildren());
            return class013873;
        });
    }
}

