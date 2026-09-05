/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  jerozgen.languagereload.mixin.AdvancementWidgetAccessor
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03734
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05228
 *  minecraft.class05502
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06513
 *  minecraft.class07018
 *  minecraft.class08019
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import jerozgen.languagereload.mixin.AdvancementWidgetAccessor;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01394;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03734;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05228;
import minecraft.class05502;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06513;
import minecraft.class07018;
import minecraft.class08019;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class01387
implements AdvancementWidgetAccessor {
    private static final class01894 N = class01894.y((String)"advancements/title_box");
    private static final int y = 26;
    private static final int L = 0;
    private static final int u = 200;
    private static final int i = 26;
    private static final int R = 8;
    private static final int M = 5;
    private static final int B = 26;
    private static final int Z = 3;
    private static final int z = 5;
    private static final int U = 32;
    private static final int E = 9;
    private static final int W = 8;
    private static final int m = 163;
    private static final int P = 80;
    private static final int[] s = new int[]{0, 10, -10, 25, -25};
    private final class05502 T;
    private final class03734 b;
    private final class06513 j;
    private final List<class01028> v;
    private final int n;
    private final List<class01028> t;
    private final class06202 G;
    private @Nullable class01387 l;
    private List<class01387> d = Lists.newArrayList();
    private @Nullable class08019 w;
    private final int k;
    private final int Y;

    public int L() {
        return this.Y;
    }

    public class01387(class05502 class055022, class06202 class062022, class03734 class037342, class06513 class065132) {
        this.T = class055022;
        this.b = class037342;
        this.j = class065132;
        this.G = class062022;
        this.v = ((class01590)class062022.i_3).L((class05936)class065132.N(), 163);
        this.k = class04995.y((float)(class065132.R() * 28.0f));
        this.Y = class04995.y((float)(class065132.M() * 27.0f));
        int n = Math.max(this.v.stream().mapToInt(arg_0 -> ((class01590)((class01590)class062022.i_3)).N(arg_0)).max().orElse(0), 80);
        int n2 = this.i();
        int n3 = 29 + n + n2;
        this.t = class07018.y().N(this.N(class00390.N((class00392)class065132.y(), (class00405)class00405.N.N(class065132.i().N())), n3));
        for (class01028 class010282 : this.t) {
            n3 = Math.max(n3, ((class01590)class062022.i_3).N(class010282));
        }
        this.n = n3 + 3 + 5;
    }

    private int i() {
        int n = this.b.N().R().N();
        if (n <= 1) {
            return 0;
        }
        int n2 = 8;
        class05216 class052162 = class00392.N((String)"advancements.progress", (Object[])new Object[]{n, n});
        return ((class01590)this.G.i_3).N((class05936)class052162) + 8;
    }

    public int u() {
        return this.k;
    }

    public void y() {
        if (this.l == null && this.b.L() != null) {
            this.l = this.N(this.b);
            if (this.l != null) {
                this.l.N(this);
            }
        }
    }

    public void N(class01387 class013872) {
        this.d.add(class013872);
    }

    public void N(class01054 class010542, int n, int n2, float f, int n3, int n4) {
        class01394 class013942;
        class01394 class013943;
        class01394 class013944;
        class01590 class015902 = (class01590)this.G.i_3;
        Objects.requireNonNull(class015902);
        int n5 = 9 * this.v.size() + 9 + 8;
        int n6 = n2 + this.Y + (26 - n5) / 2;
        int n7 = n6 + n5;
        int n8 = this.t.size();
        Objects.requireNonNull(class015902);
        int n9 = n8 * 9;
        int n10 = 6 + n9;
        boolean bl = n3 + n + this.k + this.n + 26 >= this.T.B().field_22789;
        class00392 class003922 = this.w == null ? null : this.w.u();
        int n11 = class003922 == null ? 0 : class015902.N((class05936)class003922);
        boolean bl2 = n7 + n10 >= 113;
        float f2 = this.w == null ? 0.0f : this.w.L();
        int n12 = class04995.y((float)(f2 * (float)this.n));
        if (f2 >= 1.0f) {
            n12 = this.n / 2;
            class013944 = class01394.field_2701;
            class013943 = class01394.field_2701;
            class013942 = class01394.field_2701;
        } else if (n12 < 2) {
            n12 = this.n / 2;
            class013944 = class01394.field_2699;
            class013943 = class01394.field_2699;
            class013942 = class01394.field_2699;
        } else if (n12 > this.n - 2) {
            n12 = this.n / 2;
            class013944 = class01394.field_2701;
            class013943 = class01394.field_2701;
            class013942 = class01394.field_2699;
        } else {
            class013944 = class01394.field_2701;
            class013943 = class01394.field_2699;
            class013942 = class01394.field_2699;
        }
        int n13 = this.n - n12;
        int n14 = bl ? n + this.k - this.n + 26 + 6 : n + this.k;
        int n15 = n5 + n10;
        if (!this.t.isEmpty()) {
            if (bl2) {
                class010542.N(class08394.Na, N, n14, n7 - n15, this.n, n15);
            } else {
                class010542.N(class08394.Na, N, n14, n6, this.n, n15);
            }
        }
        if (class013944 != class013943) {
            class010542.N(class08394.Na, class013944.N(), 200, n5, 0, 0, n14, n6, n12, n5);
            class010542.N(class08394.Na, class013943.N(), 200, n5, 200 - n13, 0, n14 + n12, n6, n13, n5);
        } else {
            class010542.N(class08394.Na, class013944.N(), n14, n6, this.n, n5);
        }
        class010542.N(class08394.Na, class013942.N(this.j.i()), n + this.k + 3, n2 + this.Y, 26, 26);
        int n16 = n14 + 5;
        if (bl) {
            this.N(class010542, this.v, n16, n6 + 9, -1);
            if (class003922 != null) {
                class010542.y(class015902, class003922, n + this.k - n11, n6 + 9, -1);
            }
        } else {
            this.N(class010542, this.v, n + this.k + 32, n6 + 9, -1);
            if (class003922 != null) {
                class010542.y(class015902, class003922, n + this.k + this.n - n11 - 5, n6 + 9, -1);
            }
        }
        if (bl2) {
            this.N(class010542, this.t, n16, n6 - n9 + 1, -16711936);
        } else {
            this.N(class010542, this.t, n16, n7, -16711936);
        }
        class010542.y(this.j.L(), n + this.k + 8, n2 + this.Y + 5);
    }

    private void N(class01054 class010542, List<class01028> list, int n, int n2, int n3) {
        class01590 class015902 = (class01590)this.G.i_3;
        for (int i = 0; i < list.size(); ++i) {
            Objects.requireNonNull(class015902);
            class010542.y(class015902, list.get(i), n, n2 + i * 9, n3);
        }
    }

    public boolean N(int n, int n2, int n3, int n4) {
        if (this.j.z() && (this.w == null || !this.w.N())) {
            return false;
        }
        int n5 = n + this.k;
        int n6 = n5 + 26;
        int n7 = n2 + this.Y;
        int n8 = n7 + 26;
        return n3 >= n5 && n3 <= n6 && n4 >= n7 && n4 <= n8;
    }

    public void N(class01054 class010542, int n, int n2, boolean bl) {
        if (this.l != null) {
            int n3;
            int n4 = n + this.l.k + 13;
            int n5 = n + this.l.k + 26 + 4;
            int n6 = n2 + this.l.Y + 13;
            int n7 = n + this.k + 13;
            int n8 = n2 + this.Y + 13;
            int n9 = n3 = bl ? -16777216 : -1;
            if (bl) {
                class010542.N(n5, n4, n6 - 1, n3);
                class010542.N(n5 + 1, n4, n6, n3);
                class010542.N(n5, n4, n6 + 1, n3);
                class010542.N(n7, n5 - 1, n8 - 1, n3);
                class010542.N(n7, n5 - 1, n8, n3);
                class010542.N(n7, n5 - 1, n8 + 1, n3);
                class010542.y(n5 - 1, n8, n6, n3);
                class010542.y(n5 + 1, n8, n6, n3);
            } else {
                class010542.N(n5, n4, n6, n3);
                class010542.N(n7, n5, n8, n3);
                class010542.y(n5, n8, n6, n3);
            }
        }
        for (class01387 class013872 : this.d) {
            class013872.N(class010542, n, n2, bl);
        }
    }

    private @Nullable class01387 N(class03734 class037342) {
        while ((class037342 = class037342.L()) != null && class037342.N().L().isEmpty()) {
        }
        if (class037342 == null || class037342.N().L().isEmpty()) {
            return null;
        }
        return this.T.N(class037342.y());
    }

    private List<class05936> N(class00392 class003922, int n) {
        List var4;
        class05228 class052282 = ((class01590)this.G.i_3).y();
        Object var4_4 = null;
        float f = Float.MAX_VALUE;
        for (int n2 : s) {
            List var10 = class052282.y((class05936)class003922, n - n2, class00405.N);
            float f2 = Math.abs(class01387.N(class052282, var10) - (float)n);
            if (f2 <= 10.0f) {
                return var10;
            }
            if (!(f2 < f)) continue;
            f = f2;
            var4 = var10;
        }
        return var4;
    }

    private static float N(class05228 class052282, List<class05936> list) {
        return (float)list.stream().mapToDouble(arg_0 -> ((class05228)class052282).N(arg_0)).max().orElse(0.0);
    }

    public void N(class08019 class080192) {
        this.w = class080192;
    }

    public int N() {
        return this.n;
    }

    /*
     * WARNING - void declaration
     */
    public void N(class01054 class010542, int n, int n2) {
        if (!this.j.z() || this.w != null && this.w.N()) {
            void var5_8;
            float f;
            float f2 = f = this.w == null ? 0.0f : this.w.L();
            if (f >= 1.0f) {
                class01394 object = class01394.field_2701;
            } else {
                class01394 class013942 = class01394.field_2699;
            }
            class010542.N(class08394.Na, var5_8.N(this.j.i()), n + this.k + 3, n2 + this.Y, 26, 26);
            class010542.y(this.j.L(), n + this.k + 8, n2 + this.Y + 5);
        }
        for (class01387 class013872 : this.d) {
            class013872.N(class010542, n, n2);
        }
    }

    public /* synthetic */ class03734 languagereload_getAdvancement() {
        return this.b;
    }

    public /* synthetic */ void languagereload_setChildren(List list) {
        this.d = list;
    }

    public /* synthetic */ class01387 languagereload_getParent() {
        return this.l;
    }

    public /* synthetic */ class06513 languagereload_getDisplay() {
        return this.j;
    }

    public /* synthetic */ class05502 languagereload_getTab() {
        return this.T;
    }

    public /* synthetic */ void languagereload_setParent(class01387 class013872) {
        this.l = class013872;
    }

    public /* synthetic */ List languagereload_getChildren() {
        return this.d;
    }

    public /* synthetic */ class08019 languagereload_getProgress() {
        return this.w;
    }
}

