/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00513
 *  minecraft.class00869
 *  minecraft.class04641
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.util.DirectionConstants
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00500;
import minecraft.class00513;
import minecraft.class00869;
import minecraft.class04641;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;

public class class00484 {
    public static final int N = 12;
    private final class07299 y;
    private final class07209 L;
    private final boolean u;
    private final class07209 i;
    private final class07211 R;
    private final List<class07209> M = Lists.newArrayList();
    private final List<class07209> B = Lists.newArrayList();
    private final class07211 Z;

    public List<class07209> L() {
        return this.M;
    }

    public class00484(class07299 class072992, class07209 class072092, class07211 class072112, boolean bl) {
        this.y = class072992;
        this.L = class072092;
        this.Z = class072112;
        this.u = bl;
        if (bl) {
            this.R = class072112;
            this.i = class072092.method_10093(class072112);
        } else {
            this.R = class072112.b();
            this.i = class072092.method_10079(class072112, 2);
        }
    }

    private class07211[] i() {
        return DirectionConstants.ALL;
    }

    public List<class07209> u() {
        return this.B;
    }

    public class07211 y() {
        return this.R;
    }

    private void N(int n, int n2) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        arrayList.addAll(this.M.subList(0, n2));
        arrayList2.addAll(this.M.subList(this.M.size() - n, this.M.size()));
        arrayList3.addAll(this.M.subList(n2, this.M.size() - n));
        this.M.clear();
        this.M.addAll(arrayList);
        this.M.addAll(arrayList2);
        this.M.addAll(arrayList3);
    }

    public boolean N() {
        this.M.clear();
        this.B.clear();
        class00500 class005002 = this.y.method_8320(this.i);
        if (!class00513.N((class00500)class005002, (class07299)this.y, (class07209)this.i, (class07211)this.R, (boolean)false, (class07211)this.Z)) {
            if (this.u && class005002.n() == class04641.field_15971) {
                this.B.add(this.i);
                return true;
            }
            return false;
        }
        if (!this.N(this.i, this.R)) {
            return false;
        }
        for (int i = 0; i < this.M.size(); ++i) {
            class07209 class072092 = this.M.get(i);
            if (!class00484.N(this.y.method_8320(class072092)) || this.N(class072092)) continue;
            return false;
        }
        return true;
    }

    private static boolean N(class00500 class005002, class00500 class005003) {
        if (class005002.N(class00869.TM) && class005003.N(class00869.Zc)) {
            return false;
        }
        if (class005002.N(class00869.Zc) && class005003.N(class00869.TM)) {
            return false;
        }
        return class00484.N(class005002) || class00484.N(class005003);
    }

    private boolean N(class07209 class072092) {
        class00500 class005002 = this.y.method_8320(class072092);
        for (class07211 class072112 : this.i()) {
            class07209 class072093;
            if (class072112.z() == this.R.z() || !class00484.N(this.y.method_8320(class072093 = class072092.method_10093(class072112)), class005002) || this.N(class072093, class072112)) continue;
            return false;
        }
        return true;
    }

    private static boolean N(class00500 class005002) {
        return class005002.N(class00869.Zc) || class005002.N(class00869.TM);
    }

    private boolean N(class07209 class072092, class07211 class072112) {
        int n;
        class00500 class005002 = this.y.method_8320(class072092);
        if (class005002.P()) {
            return true;
        }
        if (!class00513.N((class00500)class005002, (class07299)this.y, (class07209)class072092, (class07211)this.R, (boolean)false, (class07211)class072112)) {
            return true;
        }
        if (class072092.equals((Object)this.L)) {
            return true;
        }
        if (this.M.contains(class072092)) {
            return true;
        }
        int n2 = 1;
        if (n2 + this.M.size() > 12) {
            return false;
        }
        while (class00484.N(class005002)) {
            class07209 class072093 = class072092.method_10079(this.R.b(), n2);
            class00500 class005003 = class005002;
            class005002 = this.y.method_8320(class072093);
            if (class005002.P() || !class00484.N(class005003, class005002) || !class00513.N((class00500)class005002, (class07299)this.y, (class07209)class072093, (class07211)this.R, (boolean)false, (class07211)this.R.b()) || class072093.equals((Object)this.L)) break;
            if (++n2 + this.M.size() <= 12) continue;
            return false;
        }
        int n3 = 0;
        for (n = n2 - 1; n >= 0; --n) {
            this.M.add(class072092.method_10079(this.R.b(), n));
            ++n3;
        }
        n = 1;
        while (true) {
            class07209 class072094;
            int n4;
            if ((n4 = this.M.indexOf(class072094 = class072092.method_10079(this.R, n))) > -1) {
                this.N(n3, n4);
                for (int i = 0; i <= n4 + n3; ++i) {
                    class07209 class072095 = this.M.get(i);
                    if (!class00484.N(this.y.method_8320(class072095)) || this.N(class072095)) continue;
                    return false;
                }
                return true;
            }
            class005002 = this.y.method_8320(class072094);
            if (class005002.P()) {
                return true;
            }
            if (!class00513.N((class00500)class005002, (class07299)this.y, (class07209)class072094, (class07211)this.R, (boolean)true, (class07211)this.R) || class072094.equals((Object)this.L)) {
                return false;
            }
            if (class005002.n() == class04641.field_15971) {
                this.B.add(class072094);
                return true;
            }
            if (this.M.size() >= 12) {
                return false;
            }
            this.M.add(class072094);
            ++n3;
            ++n;
        }
    }
}

