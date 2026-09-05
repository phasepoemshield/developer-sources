/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00659
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class01207
 *  minecraft.class01209
 *  minecraft.class01210
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01233
 *  minecraft.class01249
 *  minecraft.class01894
 *  minecraft.class03298
 *  minecraft.class03442
 *  minecraft.class04878
 *  minecraft.class05243
 *  minecraft.class05244
 *  minecraft.class05258
 *  minecraft.class05261
 *  minecraft.class05265
 *  minecraft.class05273
 *  minecraft.class05282
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06667
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07111
 *  minecraft.class07131
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07321
 *  minecraft.class07713
 *  minecraft.class07830
 *  minecraft.class08088
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00659;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class01207;
import minecraft.class01209;
import minecraft.class01210;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01249;
import minecraft.class01894;
import minecraft.class03298;
import minecraft.class03442;
import minecraft.class04878;
import minecraft.class05073;
import minecraft.class05077;
import minecraft.class05083;
import minecraft.class05085;
import minecraft.class05163;
import minecraft.class05243;
import minecraft.class05244;
import minecraft.class05258;
import minecraft.class05261;
import minecraft.class05265;
import minecraft.class05273;
import minecraft.class05282;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06667;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07111;
import minecraft.class07131;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07321;
import minecraft.class07713;
import minecraft.class07830;
import minecraft.class08088;
import minecraft.class08092;

public class class05065
extends class01209 {
    private static final float i = 0.3f;
    private static final float R = 0.07f;
    private static final float M = 0.2f;
    private final class05085 B;
    private final class05073 Z;

    private void L(class06069 class060692, class07284 class072842, class07209 class072092) {
        class07218 class072182 = class072092.method_25503();
        this.u(class060692, class072842, (class07209)class072182);
        for (int i = 8; i > 0 && class060692.z() < 0.5f; --i) {
            class072182.N(class07211.field_11033);
            this.u(class060692, class072842, (class07209)class072182);
        }
    }

    public class05065(class01224 class012242, class07209 class072092, class05085 class050852, class05073 class050732, class01894 class018942, class01207 class012072, class06993 class069932, class07111 class071112, class07209 class072093) {
        super(class04878.K, 0, class012242, class018942, class018942.toString(), class05065.N(class071112, class069932, class050852, class072093, class050732), class072092);
        this.B = class050852;
        this.Z = class050732;
    }

    public class05065(class01224 class012242, class07001 class070012) {
        super(class04878.K, class070012, class012242, class018942 -> class05065.N(class012242, class070012, class018942));
        this.B = (class05085)((Object)class070012.N_15("VerticalPlacement", class05085.field_37811).orElseThrow());
        this.Z = (class05073)class070012.N_15("Properties", class05073.N).orElseThrow();
    }

    private void u(class06069 class060692, class07284 class072842, class07209 class072092) {
        if (!this.Z.y && class060692.z() < 0.07f) {
            class072842.method_8652(class072092, class00869.EI.W(), 3);
        } else {
            class072842.method_8652(class072092, class00869.id.W(), 3);
        }
    }

    private void y(class06069 class060692, class07284 class072842, class07209 class072092) {
        if (class060692.z() < 0.5f && class072842.method_8320(class072092).N(class00869.id) && class072842.method_8320(class072092.method_10084()).P()) {
            class072842.method_8652(class072092.method_10084(), (class00500)class00869.Nc.W().y((class08092)class07131.i, (Comparable)Boolean.valueOf(true)), 3);
        }
    }

    private void y(class06069 class060692, class07284 class072842) {
        boolean bl = this.B == class05085.field_24029 || this.B == class05085.field_24031;
        class07209 class072092 = this.k.M();
        int n = class072092.method_10263();
        int n2 = class072092.method_10260();
        float[] fArray = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.9f, 0.9f, 0.8f, 0.7f, 0.6f, 0.4f, 0.2f};
        int n3 = fArray.length;
        int n4 = (this.k.u() + this.k.R()) / 2;
        int n5 = class060692.y(Math.max(1, 8 - n4 / 2));
        int n6 = 3;
        class07218 class072182 = class07209.field_10980.method_25503();
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                int n7 = Math.abs(i - n) + Math.abs(j - n2);
                int n8 = Math.max(0, n7 + n5);
                if (n8 >= n3) continue;
                float f = fArray[n8];
                if (!(class060692.U() < (double)f)) continue;
                int n9 = class05065.N(class072842, i, j, this.B);
                int n10 = bl ? n9 : Math.min(this.k.Z(), n9);
                class072182.N(i, n10, j);
                if (Math.abs(n10 - this.k.Z()) > 3 || !this.N(class072842, (class07209)class072182)) continue;
                this.u(class060692, class072842, (class07209)class072182);
                if (this.Z.i) {
                    this.y(class060692, class072842, (class07209)class072182);
                }
                this.L(class060692, class072842, class072182.method_10074());
            }
        }
    }

    private static class05265 N(class00891 class008912, float f, class00891 class008913) {
        return new class05265((class05261)new class05258(class008912, f), (class05261)class05243.y, class008913.W());
    }

    public static class07830 N(class05085 class050852) {
        return class050852 == class05085.field_24031 ? class07830.field_13195 : class07830.field_13194;
    }

    private static int N(class07284 class072842, int n, int n2, class05085 class050852) {
        return class072842.method_8624(class05065.N(class050852), n, n2) - 1;
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Rotation", class06993.field_56670, (Object)this.L.u());
        class070012.N("Mirror", class07111.field_56669, (Object)this.L.L());
        class070012.N("VerticalPlacement", class05085.field_37811, (Object)this.B);
        class070012.N("Properties", class05073.N, (Object)this.Z);
    }

    private static class05265 N(class00891 class008912, class00891 class008913) {
        return new class05265((class05261)new class05244(class008912), (class05261)class05243.y, class008913.W());
    }

    private void N(class06069 class060692, class07284 class072842) {
        for (int i = this.k.B() + 1; i < this.k.U(); ++i) {
            for (int j = this.k.z() + 1; j < this.k.W(); ++j) {
                class07209 class072092 = new class07209(i, this.k.Z(), j);
                if (!class072842.method_8320(class072092).N(class00869.id)) continue;
                this.L(class060692, class072842, class072092.method_10074());
            }
        }
    }

    private static class05265 N(class05085 class050852, class05073 class050732) {
        if (class050852 == class05085.field_24031) {
            return class05065.N(class00869.V, class00869.EI);
        }
        if (class050732.y) {
            return class05065.N(class00869.V, class00869.id);
        }
        return class05065.N(class00869.V, 0.2f, class00869.EI);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072093) {
        class05163 class051633 = this.y.y(this.L, this.u);
        if (!class051632.y((class00753)class051633.M())) {
            return;
        }
        class051632.y(class051633);
        super.N(class059742, class053242, class080882, class060692, class051632, class073212, class072093);
        this.y(class060692, (class07284)class059742);
        this.N(class060692, (class07284)class059742);
        if (this.Z.R || this.Z.i) {
            class07209.method_23627((class05163)this.L()).forEach(class072092 -> {
                if (this.Z.R) {
                    this.N(class060692, (class07284)class059742, (class07209)class072092);
                }
                if (this.Z.i) {
                    this.y(class060692, (class07284)class059742, (class07209)class072092);
                }
            });
        }
    }

    private void N(class06069 class060692, class07284 class072842, class07209 class072092) {
        class00500 class005002 = class072842.method_8320(class072092);
        if (class005002.P() || class005002.N(class00869.Rc)) {
            return;
        }
        class07211 class072112 = class05065.y((class06069)class060692);
        class07209 class072093 = class072092.method_10093(class072112);
        if (!class072842.method_8320(class072093).P()) {
            return;
        }
        if (!class00891.N((class00494)class005002.M((class07290)class072842, class072092), (class07211)class072112)) {
            return;
        }
        class06667 class066672 = class00659.N((class07211)class072112.b());
        class072842.method_8652(class072093, (class00500)class00869.Rc.W().y((class08092)class066672, (Comparable)Boolean.valueOf(true)), 3);
    }

    protected void N(String string, class07209 class072092, class01001 class010012, class06069 class060692, class05163 class051632) {
    }

    private static class01233 N(class07111 class071112, class06993 class069932, class05085 class050852, class07209 class072092, class05073 class050732) {
        class05282 class052822 = class050732.u ? class05282.y : class05282.u;
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(class05065.N(class00869.Lb, 0.3f, class00869.N));
        arrayList.add(class05065.N(class050852, class050732));
        if (!class050732.y) {
            arrayList.add(class05065.N(class00869.id, 0.07f, class00869.EI));
        }
        class01233 class012332 = new class01233().N(class069932).N(class071112).N(class072092).N((class01219)class052822).N((class01219)new class05273((List)arrayList)).N((class01219)new class05083(class050732.L)).N((class01219)new class03442(class01210.Lu)).N((class01219)new class01249());
        if (class050732.M) {
            class012332.N((class01219)class05077.y);
        }
        return class012332;
    }

    private static class01233 N(class01224 class012242, class07001 class070012, class01894 class018942) {
        class01207 class012072 = class012242.N(class018942);
        class07209 class072092 = new class07209(class012072.N().method_10263() / 2, 0, class012072.N().method_10260() / 2);
        return class05065.N((class07111)class070012.N_15("Mirror", class07111.field_56669).orElseThrow(), (class06993)class070012.N_15("Rotation", class06993.field_56670).orElseThrow(), (class05085)((Object)class070012.N_15("VerticalPlacement", class05085.field_37811).orElseThrow()), class072092, (class05073)class05073.N.parse(new Dynamic((DynamicOps)class07713.N, (Object)class070012.N("Properties"))).getPartialOrThrow());
    }

    private boolean N(class07284 class072842, class07209 class072092) {
        class00500 class005002 = class072842.method_8320(class072092);
        return !class005002.N(class00869.N) && !class005002.N(class00869.LV) && !class005002.N(class01210.Lu) && (this.B == class05085.field_24034 || !class005002.N(class00869.V));
    }
}

