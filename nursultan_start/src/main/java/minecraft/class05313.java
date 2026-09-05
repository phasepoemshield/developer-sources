/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  minecraft.class00282
 *  minecraft.class00311
 *  minecraft.class00329
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01756
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class02422
 *  minecraft.class02484
 *  minecraft.class03448
 *  minecraft.class04141
 *  minecraft.class04453
 *  minecraft.class04897
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05287
 *  minecraft.class05294
 *  minecraft.class05299
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06584
 *  minecraft.class06613
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00282;
import minecraft.class00311;
import minecraft.class00329;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01756;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class02422;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04141;
import minecraft.class04453;
import minecraft.class04897;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05287;
import minecraft.class05294;
import minecraft.class05299;
import minecraft.class05306;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06584;
import minecraft.class06613;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class05313 {
    public static final int N = 20;
    private static final class01883 y = new class01883(class01894.y((String)"recipe_book/page_forward"), class01894.y((String)"recipe_book/page_forward_highlighted"));
    private static final class01883 L = new class01883(class01894.y((String)"recipe_book/page_backward"), class01894.y((String)"recipe_book/page_backward_highlighted"));
    private static final class00392 u = class00392.L((String)"gui.recipebook.next_page");
    private static final class00392 i = class00392.L((String)"gui.recipebook.previous_page");
    private static final int R = 12;
    private static final int M = 17;
    private final List<class05294> B = Lists.newArrayListWithCapacity((int)20);
    private @Nullable class05294 Z;
    private final class05299 z;
    private class06202 U;
    private final class05306<?> E;
    private List<class05287> W = ImmutableList.of();
    private @Nullable class04897 m;
    private @Nullable class04897 P;
    private int s;
    private int T;
    private class01756 b;
    private @Nullable class00329 j;
    private @Nullable class05287 v;
    private boolean n;

    public void L() {
        this.z.N(false);
    }

    public class05313(class05306<?> class053062, class02422 class024222, boolean bl) {
        this.E = class053062;
        this.z = new class05299(class024222, bl);
        for (int i = 0; i < 20; ++i) {
            this.B.add(new class05294(class024222));
        }
    }

    private void i() {
        int n = 20 * this.T;
        class00311 class003112 = class00282.N((class07299)((class03448)this.U.T_3));
        for (int i = 0; i < this.B.size(); ++i) {
            class05294 class052942 = this.B.get(i);
            if (n + i < this.W.size()) {
                class05287 class052872 = this.W.get(n + i);
                class052942.N(class052872, this.n, this, class003112);
                class052942.field_22764 = true;
                continue;
            }
            class052942.field_22764 = false;
        }
        this.R();
    }

    public class01756 u() {
        return this.b;
    }

    public @Nullable class05287 y() {
        return this.v;
    }

    public void N(class00329 class003292) {
        this.E.N(class003292);
    }

    public void N(class01054 class010542, int n, int n2, int n3, int n4, float f) {
        if (this.s > 1) {
            class05216 class052162 = class00392.N((String)"gui.recipebook.page", (Object[])new Object[]{this.T + 1, this.s});
            int n5 = ((class01590)this.U.i_3).N((class05936)class052162);
            class010542.y((class01590)this.U.i_3, (class00392)class052162, n - n5 / 2 + 73, n2 + 141, -1);
        }
        this.Z = null;
        for (class05294 class052942 : this.B) {
            class052942.method_25394(class010542, n3, n4, f);
            if (!class052942.field_22764 || !class052942.method_25367()) continue;
            this.Z = class052942;
        }
        if (this.m != null) {
            this.m.method_25394(class010542, n3, n4, f);
        }
        if (this.P != null) {
            this.P.method_25394(class010542, n3, n4, f);
        }
        class010542.L();
        this.z.method_25394(class010542, n3, n4, f);
    }

    protected void N(Consumer<class06478> consumer) {
        this.B.forEach(consumer);
    }

    public boolean N(class06613 class066132, int n, int n2, int n3, int n4, boolean bl) {
        this.j = null;
        this.v = null;
        if (this.z.L()) {
            if (this.z.method_25402(class066132, bl)) {
                this.j = this.z.y();
                this.v = this.z.N();
            } else {
                this.z.N(false);
            }
            return true;
        }
        if (this.m.method_25402(class066132, bl)) {
            ++this.T;
            this.i();
            return true;
        }
        if (this.P.method_25402(class066132, bl)) {
            --this.T;
            this.i();
            return true;
        }
        class00311 class003112 = class00282.N((class07299)((class03448)this.U.T_3));
        for (class05294 class052942 : this.B) {
            if (!class052942.method_25402(class066132, bl)) continue;
            if (class066132.v() == 0) {
                this.j = class052942.u();
                this.v = class052942.y();
            } else if (class066132.v() == 1 && !this.z.L() && !class052942.L()) {
                this.z.N(class052942.y(), class003112, this.n, class052942.method_46426(), class052942.method_46427(), n + n3 / 2, n2 + 13 + n4 / 2, (float)class052942.method_25368());
            }
            return true;
        }
        return false;
    }

    public @Nullable class00329 N() {
        return this.j;
    }

    public void N(List<class05287> list, boolean bl, boolean bl2) {
        this.W = list;
        this.n = bl2;
        this.s = (int)Math.ceil((double)list.size() / 20.0);
        if (this.s <= this.T || bl) {
            this.T = 0;
        }
        this.i();
    }

    public void N(class06202 class062022, int n, int n2) {
        this.U = class062022;
        this.b = ((class04453)class062022.T_4).q();
        for (int i = 0; i < this.B.size(); ++i) {
            this.B.get(i).y(n + 11 + 25 * (i % 5), n2 + 31 + 25 * (i / 5));
        }
        this.m = new class04897(n + 93, n2 + 137, 12, 17, y, class053622 -> this.R(), u);
        this.m.method_47400(class04141.N((class00392)u));
        this.P = new class04897(n + 38, n2 + 137, 12, 17, L, class053622 -> this.R(), i);
        this.P.method_47400(class04141.N((class00392)i));
    }

    public void N(class01054 class010542, int n, int n2) {
        if ((class05096)this.U.v_3 != null && this.Z != null && !this.z.L()) {
            class06584 class065842 = this.Z.i();
            class01894 class018942 = (class01894)class065842.method_58694(class02484.V);
            class010542.N((class01590)this.U.i_3, this.Z.N(class065842), n, n2, class018942);
        }
    }

    private void R() {
        if (this.m != null) {
            boolean bl = this.m.field_22764 = this.s > 1 && this.T < this.s - 1;
        }
        if (this.P != null) {
            this.P.field_22764 = this.s > 1 && this.T > 0;
        }
    }
}

