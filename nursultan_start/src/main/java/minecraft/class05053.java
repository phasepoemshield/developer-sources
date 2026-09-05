/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00780
 *  minecraft.class01146
 *  minecraft.class01207
 *  minecraft.class01376
 *  minecraft.class01894
 *  minecraft.class03291
 *  minecraft.class03556
 *  minecraft.class04084
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class04890
 *  minecraft.class05065
 *  minecraft.class05073
 *  minecraft.class05082
 *  minecraft.class05085
 *  minecraft.class05163
 *  minecraft.class05474
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07536
 *  minecraft.class07830
 *  minecraft.class07836
 *  minecraft.class08088
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class00500;
import minecraft.class00780;
import minecraft.class01146;
import minecraft.class01207;
import minecraft.class01376;
import minecraft.class01894;
import minecraft.class03291;
import minecraft.class03556;
import minecraft.class04084;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04890;
import minecraft.class04995;
import minecraft.class05065;
import minecraft.class05073;
import minecraft.class05082;
import minecraft.class05085;
import minecraft.class05163;
import minecraft.class05474;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07536;
import minecraft.class07830;
import minecraft.class07836;
import minecraft.class08088;

public class class05053
extends class04748 {
    private static final String[] y = new String[]{"ruined_portal/portal_1", "ruined_portal/portal_2", "ruined_portal/portal_3", "ruined_portal/portal_4", "ruined_portal/portal_5", "ruined_portal/portal_6", "ruined_portal/portal_7", "ruined_portal/portal_8", "ruined_portal/portal_9", "ruined_portal/portal_10"};
    private static final String[] R = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};
    private static final float M = 0.05f;
    private static final int B = 15;
    private final List<class05082> Z;
    public static final MapCodec<class05053> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05053.N(instance), (App)class06338.y((Codec)class05082.N.listOf()).fieldOf("setups").forGetter(class050532 -> class050532.Z)).apply(instance, class05053::new));

    public class05053(class04758 class047582, List<class05082> list) {
        super(class047582);
        this.Z = list;
    }

    public class05053(class04758 class047582, class05082 class050822) {
        this(class047582, List.of(class050822));
    }

    private static /* synthetic */ void N(class05082 class050822, class05073 class050732, class07209 class072092, class04764 class047642, class04084 class040842, class08088 class080882, class01894 class018942, class01207 class012072, class06993 class069932, class07111 class071112, class07209 class072093, class03291 class032912) {
        if (class050822.R()) {
            class050732.y = class05053.N(class072092, (class03556<class00780>)class047642.y().u().method_38109(class01146.N((int)class072092.method_10263()), class01146.N((int)class072092.method_10264()), class01146.N((int)class072092.method_10260()), class040842.y()), class080882.R());
        }
        class032912.N((class04890)new class05065(class047642.i(), class072092, class050822.N(), class050732, class018942, class012072, class069932, class071112, class072093));
    }

    private static int N(class06069 class060692, int n, int n2) {
        if (n < n2) {
            return class04995.y(class060692, n, n2);
        }
        return n2;
    }

    private static boolean N(class07836 class078362, float f) {
        if (f == 0.0f) {
            return false;
        }
        if (f == 1.0f) {
            return true;
        }
        return class078362.z() < f;
    }

    private static boolean N(class07209 class072092, class03556<class00780> class035562, int n) {
        return ((class00780)class035562.N()).y(class072092, n);
    }

    private static int N(class06069 class060692, class08088 class080882, class05085 class050852, boolean bl, int n, int n2, class05163 class051632, class05474 class054742, class04084 class040842) {
        int n3;
        int n4 = class054742.method_31607() + 15;
        if (class050852 == class05085.field_24034) {
            var9_10 = bl ? class04995.y(class060692, 32, 100) : (class060692.z() < 0.5f ? class04995.y(class060692, 27, 29) : class04995.y(class060692, 29, 100));
        } else if (class050852 == class05085.field_24032) {
            var11_11 = n - n2;
            var9_10 = class05053.N(class060692, 70, var11_11);
        } else if (class050852 == class05085.field_24033) {
            var11_11 = n - n2;
            var9_10 = class05053.N(class060692, n4, var11_11);
        } else {
            var9_10 = class050852 == class05085.field_24030 ? n - n2 + class04995.y(class060692, 2, 8) : n;
        }
        ImmutableList immutableList = ImmutableList.of((Object)new class07209(class051632.B(), 0, class051632.z()), (Object)new class07209(class051632.U(), 0, class051632.z()), (Object)new class07209(class051632.B(), 0, class051632.W()), (Object)new class07209(class051632.U(), 0, class051632.W()));
        List list = immutableList.stream().map(class072092 -> class080882.N(class072092.method_10263(), class072092.method_10260(), class054742, class040842)).collect(Collectors.toList());
        class07830 class078302 = class050852 == class05085.field_24031 ? class07830.field_13195 : class07830.field_13194;
        block0: for (n3 = var9_10; n3 > n4; --n3) {
            int n5 = 0;
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                class00500 class005002 = ((class01376)iterator.next()).N(n3);
                if (!class078302.u().test(class005002) || ++n5 != 3) continue;
                break block0;
            }
        }
        return n3;
    }

    public Optional<class04780> N(class04764 class047642) {
        class05082 class0508222;
        class05082 class0508232;
        class05073 class050732 = new class05073();
        class07836 class078362 = class047642.R();
        class05082 class050824 = null;
        if (this.Z.size() > 1) {
            float f = 0.0f;
            for (class05082 class0508232 : this.Z) {
                f += class0508232.B();
            }
            float f2 = class078362.z();
            for (class05082 class0508222 : this.Z) {
                if (!((f2 -= class0508222.B() / f) < 0.0f)) continue;
                class050824 = class0508222;
                break;
            }
        } else {
            class050824 = this.Z.get(0);
        }
        if (class050824 == null) {
            throw new IllegalStateException();
        }
        class05082 class050825 = class050824;
        class050732.u = class05053.N(class078362, class050825.y());
        class050732.L = class050825.L();
        class050732.i = class050825.u();
        class050732.R = class050825.i();
        class050732.M = class050825.M();
        class01894 class018942 = class078362.z() < 0.05f ? class01894.y((String)R[class078362.y(R.length)]) : class01894.y((String)y[class078362.y(y.length)]);
        class0508232 = class047642.i().N(class018942);
        class0508222 = (class06993)class07536.N((Object[])class06993.values(), (class06069)class078362);
        class07111 class071112 = class078362.z() < 0.5f ? class07111.field_11302 : class07111.field_11301;
        class07209 class072092 = new class07209(class0508232.N().method_10263() / 2, 0, class0508232.N().method_10260() / 2);
        class08088 class080882 = class047642.y();
        class05474 class054742 = class047642.Z();
        class04084 class040842 = class047642.u();
        class07209 class072093 = class047642.B().W();
        class05163 class051632 = class0508232.N(class072093, (class06993)class0508222, class072092, class071112);
        class07209 class072094 = class051632.M();
        int n = class080882.N(class072094.method_10263(), class072094.method_10260(), class05065.N((class05085)class050825.N()), class054742, class040842) - 1;
        int n2 = class05053.N((class06069)class078362, class080882, class050825.N(), class050732.u, n, class051632.i(), class051632, class054742, class040842);
        class07209 class072095 = new class07209(class072093.method_10263(), n2, class072093.method_10260());
        return Optional.of(new class04780(class072095, arg_0 -> class05053.N(class050825, class050732, class072095, class047642, class040842, class080882, class018942, (class01207)class0508232, (class06993)class0508222, class071112, class072092, arg_0)));
    }

    public class04367<?> N() {
        return class04367.E;
    }
}

