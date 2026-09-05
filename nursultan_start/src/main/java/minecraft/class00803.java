/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09402
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class00737
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01002
 *  minecraft.class01016
 *  minecraft.class01043
 *  minecraft.class01146
 *  minecraft.class01210
 *  minecraft.class03218
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04433
 *  minecraft.class04540
 *  minecraft.class04643
 *  minecraft.class04688
 *  minecraft.class04748
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05042
 *  minecraft.class05214
 *  minecraft.class05324
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06218
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07321
 *  minecraft.class07428
 *  minecraft.class07446
 *  minecraft.class07448
 *  minecraft.class07830
 *  minecraft.class08036
 *  minecraft.class08050
 *  minecraft.class08088
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09402;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class00737;
import minecraft.class00760;
import minecraft.class00771;
import minecraft.class00780;
import minecraft.class00792;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01002;
import minecraft.class01016;
import minecraft.class01043;
import minecraft.class01146;
import minecraft.class01210;
import minecraft.class03218;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04433;
import minecraft.class04540;
import minecraft.class04643;
import minecraft.class04688;
import minecraft.class04748;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05042;
import minecraft.class05214;
import minecraft.class05324;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06218;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07321;
import minecraft.class07428;
import minecraft.class07446;
import minecraft.class07448;
import minecraft.class07830;
import minecraft.class08036;
import minecraft.class08050;
import minecraft.class08088;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class00803 {
    private static final Logger i = LogUtils.getLogger();
    private static final int R = 24;
    public static final int N = 8;
    public static final int y = 128;
    public static final int L = class04995.y((float)(8.0f / class04995.M));
    static final int u = (int)Math.pow(17.0, 2.0);
    private static final class07428[] M = (class07428[])Stream.of(class07428.values()).filter(class074282 -> class074282 != class07428.field_17715).toArray(class07428[]::new);

    private class00803() {
    }

    private static class07209 N(class05487 class054872, class07078<?> class070782, int n, int n2) {
        int n3 = class054872.method_8624(class07448.y(class070782), n, n2);
        class07218 class072182 = new class07218(n, n3, n2);
        if (class054872.method_8597().R()) {
            do {
                class072182.N(class07211.field_11033);
            } while (!class054872.method_8320((class07209)class072182).P());
            do {
                class072182.N(class07211.field_11033);
            } while (class054872.method_8320((class07209)class072182).P() && class072182.method_10264() > class054872.method_31607());
        }
        return class07448.N(class070782).N(class054872, class072182.method_10062());
    }

    public static void N(class01001 class010012, class03556<class00780> class035562, class07321 class073212, class06069 class060692) {
        class01002 class010022 = ((class00780)class035562.N()).N();
        class04540 var5 = class010022.N(class07428.field_6294);
        if (var5.L() || !((Boolean)class010012.method_8410().method_64395().N(class07305.S)).booleanValue()) {
            return;
        }
        int n = class073212.i();
        int n2 = class073212.R();
        while (class060692.z() < class010022.N()) {
            Optional var8 = var5.N(class060692);
            if (var8.isEmpty()) continue;
            class01016 class010162 = (class01016)var8.get();
            int n3 = class010162.y() + class060692.y(1 + class010162.L() - class010162.y());
            class07446 class074462 = null;
            int n4 = n + class060692.y(16);
            int n5 = n2 + class060692.y(16);
            int n6 = n4;
            int n7 = n5;
            for (int i = 0; i < n3; ++i) {
                boolean bl = false;
                for (int j = 0; !bl && j < 4; ++j) {
                    class07209 class072092 = class00803.N((class05487)class010012, class010162.N(), n4, n5);
                    if (class010162.N().y() && class07448.N((class07078)class010162.N(), (class05487)class010012, (class07209)class072092)) {
                        class07079 class070792;
                        class07049 class070492;
                        float f = class010162.N().z();
                        double d = class04995.N((double)n4, (double)((double)n + (double)f), (double)((double)n + 16.0 - (double)f));
                        double d2 = class04995.N((double)n5, (double)((double)n2 + (double)f), (double)((double)n2 + 16.0 - (double)f));
                        if (!class010012.y(class010162.N().N(d, (double)class072092.method_10264(), d2)) || !class07448.N((class07078)class010162.N(), (class01001)class010012, (class06113)class06113.field_16472, (class07209)class07209.method_49637((double)d, (double)class072092.method_10264(), (double)d2), (class06069)class010012.method_8409())) continue;
                        try {
                            class070492 = class010162.N().N((class07299)class010012.method_8410(), class06113.field_16459);
                        }
                        catch (Exception exception) {
                            class00803.i.warn("Failed to create mob", (Throwable)exception);
                            continue;
                        }
                        if (class070492 == null) continue;
                        class070492.method_5808(d, (double)class072092.method_10264(), d2, class060692.z() * 360.0f, 0.0f);
                        if (class070492 instanceof class07079 && (class070792 = (class07079)class070492).N((class07284)class010012, class06113.field_16472) && class070792.N((class05487)class010012)) {
                            class074462 = class070792.N(class010012, class010012.method_8404(class070792.method_24515()), class06113.field_16472, class074462);
                            class010012.y((class07049)class070792);
                            bl = true;
                        }
                    }
                    n4 += class060692.y(5) - class060692.y(5);
                    n5 += class060692.y(5) - class060692.y(5);
                    while (n4 < n || n4 >= n + 16 || n5 < n2 || n5 >= n2 + 16) {
                        n4 = n6 + class060692.y(5) - class060692.y(5);
                        n5 = n7 + class060692.y(5) - class060692.y(5);
                    }
                }
            }
        }
    }

    public static boolean N(class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882, class07078<?> class070782) {
        if (class005002.W(class072902, class072092)) {
            return false;
        }
        if (class005002.j()) {
            return false;
        }
        if (!class046882.W()) {
            return false;
        }
        if (class005002.N(class01210.yz)) {
            return false;
        }
        return !class070782.N(class005002);
    }

    private static class07209 N(class07299 class072992, class00570 class005702) {
        class07321 class073212 = class005702.R();
        int n = class073212.i() + class072992.field_9229.y(16);
        int n2 = class073212.R() + class072992.field_9229.y(16);
        int n3 = class005702.N(class07830.field_13202, n, n2) + 1;
        int n4 = class04995.y((class06069)class072992.field_9229, (int)class072992.method_31607(), (int)n3);
        return new class07209(n, n4, n2);
    }

    public static boolean N(class07209 class072092, class04782 class047822, class07428 class074282, class05324 class053242) {
        if (class074282 != class07428.field_6302 || !class047822.method_8320(class072092.method_10074()).N(class00869.ML)) {
            return false;
        }
        class04748 class047482 = (class04748)class053242.y().L(class04227.yj).L(class04433.P);
        if (class047482 == null) {
            return false;
        }
        return class053242.N(class072092, class047482).y();
    }

    private static class04540<class01016> N(class04782 class047822, class05324 class053242, class08088 class080882, class07428 class074282, class07209 class072092, @Nullable class03556<class00780> class035562) {
        if (class00803.N(class072092, class047822, class074282, class053242)) {
            return (class04540)class06218.N_0;
        }
        return class080882.N(class035562 != null ? class035562 : class047822.i(class072092), class053242, class074282, class072092);
    }

    private static boolean N(class04782 class047822, class05324 class053242, class08088 class080882, class07428 class074282, class01016 class010162, class07209 class072092) {
        return class00803.N(class047822, class053242, class080882, class074282, class072092, null).y((Object)class010162);
    }

    private static /* synthetic */ void N(class07209 class072092, class07049 class070492, class05214 class052142, class03218 class032182, class07428 class074282, Object2IntOpenHashMap object2IntOpenHashMap, class00570 class005702) {
        class01043 class010432 = class00803.N(class072092, (class08050)class005702).N().N(class070492.method_5864());
        if (class010432 != null) {
            class052142.N(class070492.method_24515(), class010432.y());
        }
        if (class070492 instanceof class07079) {
            class032182.N(class005702.R(), class074282);
        }
        object2IntOpenHashMap.addTo((Object)class074282, 1);
    }

    public static void N(class07428 class074282, class04782 class047822, class08050 class080502, class07209 class072092, class00771 class007712, class00792 class007922) {
        class05324 class053242 = class047822.method_27056();
        class08088 class080882 = class047822.method_14178().U();
        int n = class072092.method_10264();
        if (class080502.method_8320(class072092).u((class07290)class080502, class072092)) {
            return;
        }
        class07218 class072182 = new class07218();
        int n2 = 0;
        block0: for (int i = 0; i < 3; ++i) {
            int n3 = class072092.method_10263();
            int n4 = class072092.method_10260();
            int n5 = 6;
            class01016 class010162 = null;
            class07446 class074462 = null;
            int n6 = class04995.u((float)(class047822.field_9229.z() * 4.0f));
            int n7 = 0;
            for (int j = 0; j < n6; ++j) {
                double d;
                class072182.N(n3 += class047822.field_9229.y(6) - class047822.field_9229.y(6), n, n4 += class047822.field_9229.y(6) - class047822.field_9229.y(6));
                double d2 = (double)n3 + 0.5;
                double d3 = (double)n4 + 0.5;
                class08036 class080362 = class047822.N(d2, (double)n, d3, -1.0, false);
                if (class080362 == null || !class00803.N(class047822, class080502, class072182, d = class080362.method_5649(d2, (double)n, d3))) continue;
                if (class010162 == null) {
                    Optional<class01016> var28 = class00803.N(class047822, class053242, class080882, class074282, class047822.field_9229, (class07209)class072182);
                    if (var28.isEmpty()) continue block0;
                    class010162 = var28.get();
                    n6 = class010162.y() + class047822.field_9229.y(1 + class010162.L() - class010162.y());
                }
                if (!class00803.N(class047822, class074282, class053242, class080882, class010162, class072182, d) || !class007712.test(class010162.N(), (class07209)class072182, class080502)) continue;
                class07079 class070792 = class00803.N(class047822, class010162.N());
                if (class070792 == null) {
                    return;
                }
                class070792.method_5808(d2, (double)n, d3, class047822.field_9229.z() * 360.0f, 0.0f);
                if (!class00803.N(class047822, class070792, d)) continue;
                class074462 = class070792.N((class01001)class047822, class047822.method_8404(class070792.method_24515()), class06113.field_16459, class074462);
                ++n7;
                class047822.y((class07049)class070792);
                class007922.run(class070792, class080502);
                if (++n2 >= class070792.n_()) {
                    return;
                }
                if (class070792.R(n7)) continue block0;
            }
        }
    }

    public static void N(class07428 class074282, class04782 class047822, class07209 class072093) {
        class00803.N(class074282, class047822, class047822.method_8500(class072093), class072093, (class07078<?> class070782, class07209 class072092, class08050 class080502) -> true, (class07079 class070792, class08050 class080502) -> {});
    }

    public static void N(class07428 class074282, class04782 class047822, class00570 class005702, class00771 class007712, class00792 class007922) {
        class07209 class072092 = class00803.N((class07299)class047822, class005702);
        if (class072092.method_10264() < class047822.method_31607() + 1) {
            return;
        }
        class00803.N(class074282, class047822, (class08050)class005702, class072092, class007712, class007922);
    }

    public static void N(class04782 class047822, class00570 class005702, class00760 class007602, List<class07428> list) {
        class04643 class046432 = class08700.N();
        class046432.N("spawner");
        for (class07428 class074282 : list) {
            if (!class007602.N(class074282, class005702.R())) continue;
            class00803.N(class074282, class047822, class005702, class007602::N, class007602::N);
        }
        class046432.L();
    }

    public static List<class07428> N(class00760 class007602, boolean bl, boolean bl2, boolean bl3) {
        ArrayList<class07428> arrayList = new ArrayList<class07428>(M.length);
        for (class07428 class074282 : M) {
            if (!bl && class074282.L() || !bl2 && !class074282.L() || !bl3 && class074282.u() || !class007602.N(class074282)) continue;
            arrayList.add(class074282);
        }
        return arrayList;
    }

    static class00780 N(class07209 class072092, class08050 class080502) {
        return (class00780)class080502.method_16359(class01146.N((int)class072092.method_10263()), class01146.N((int)class072092.method_10264()), class01146.N((int)class072092.method_10260())).N();
    }

    public static class00760 N(int n, Iterable<class07049> iterable, class09402 class094022, class03218 class032182) {
        class05214 class052142 = new class05214();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (class07049 class070492 : iterable) {
            class07079 class070792;
            if (class070492 instanceof class07079 && ((class070792 = (class07079)class070492).Nm() || class070792.Nu()) || (class070792 = class070492.method_5864().i()) == class07428.field_17715) continue;
            class07209 class072092 = class070492.method_24515();
            class094022.query(class07321.N((class07209)class072092), arg_0 -> class00803.N(class072092, class070492, class052142, class032182, (class07428)class070792, object2IntOpenHashMap, arg_0));
        }
        return new class00760(n, (Object2IntOpenHashMap<class07428>)object2IntOpenHashMap, class052142, class032182);
    }

    private static Optional<class01016> N(class04782 class047822, class05324 class053242, class08088 class080882, class07428 class074282, class06069 class060692, class07209 class072092) {
        class03556 var6 = class047822.i(class072092);
        if (class074282 == class07428.field_24460 && var6.N(class03557.Nz) && class060692.z() < 0.98f) {
            return Optional.empty();
        }
        return class00803.N(class047822, class053242, class080882, class074282, class072092, (class03556<class00780>)var6).N(class060692);
    }

    private static boolean N(class04782 class047822, class07079 class070792, double d) {
        if (d > (double)(class070792.method_5864().i().i() * class070792.method_5864().i().i()) && class070792.N(d)) {
            return false;
        }
        return class070792.N((class07284)class047822, class06113.field_16459) && class070792.N((class05487)class047822);
    }

    private static @Nullable class07079 N(class04782 class047822, class07078<?> class070782) {
        try {
            class07049 class070492 = class070782.N((class07299)class047822, class06113.field_16459);
            if (class070492 instanceof class07079) {
                class07079 class070792 = (class07079)class070492;
                return class070792;
            }
            i.warn("Can't spawn entity of type: {}", (Object)class04206.M.y(class070782));
        }
        catch (Exception exception) {
            i.warn("Failed to create mob", (Throwable)exception);
        }
        return null;
    }

    private static boolean N(class04782 class047822, class07428 class074282, class05324 class053242, class08088 class080882, class01016 class010162, class07218 class072182, double d) {
        class07078 var8 = class010162.N();
        if (var8.i() == class07428.field_17715) {
            return false;
        }
        if (!var8.u() && d > (double)(var8.i().i() * var8.i().i())) {
            return false;
        }
        if (!var8.y() || !class00803.N(class047822, class053242, class080882, class074282, class010162, (class07209)class072182)) {
            return false;
        }
        if (!class07448.N((class07078)var8, (class05487)class047822, (class07209)class072182)) {
            return false;
        }
        if (!class07448.N((class07078)var8, (class01001)class047822, (class06113)class06113.field_16459, (class07209)class072182, (class06069)class047822.field_9229)) {
            return false;
        }
        return class047822.y(var8.N((double)class072182.method_10263() + 0.5, (double)class072182.method_10264(), (double)class072182.method_10260() + 0.5));
    }

    private static boolean N(class04782 class047822, class08050 class080502, class07218 class072182, double d) {
        if (d <= 576.0) {
            return false;
        }
        class05042 class050422 = class047822.method_74854();
        if (class050422.N() == class047822.method_27983() && class050422.y().method_19769((class00737)new class06889((double)class072182.method_10263() + 0.5, (double)class072182.method_10264(), (double)class072182.method_10260() + 0.5), 24.0)) {
            return false;
        }
        class07321 class073212 = new class07321((class07209)class072182);
        return Objects.equals(class073212, class080502.R()) || class047822.method_67505(class073212);
    }
}

