/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class04137
 *  minecraft.class04139
 *  minecraft.class04142
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05456
 *  minecraft.class05751
 *  minecraft.class05779
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07475
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class00737;
import minecraft.class04137;
import minecraft.class04139;
import minecraft.class04142;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05456;
import minecraft.class05751;
import minecraft.class05779;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07475;

public class class06278 {
    private static final int N = 20;
    private static final int y = 8;
    private static final float L = 0.6f;
    private static final float u = 0.6f;
    private static final int i = 5;
    private static final int R = 10;

    private static Map<class07438, Integer> y(List<class07438> list) {
        HashMap hashMap = Maps.newHashMap();
        list.stream().filter(class06278::y).forEach(class074383 -> hashMap.compute(class06278.N(class074383), (class074382, n) -> n == null ? 1 : n + 1));
        return hashMap;
    }

    private static boolean y(class07438 class074382) {
        return class074382.method_18868().L(class05378.b).isPresent();
    }

    public static class04142<class07475> N() {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.y(class05378.Z), (App)class041282.L(class05378.m), (App)class041282.N(class05378.P), (App)class041282.N(class05378.b)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395) -> (class047822, class074752, l) -> {
            if (class047822.method_8409().y(10) != 0) {
                return false;
            }
            List list = (List)class041282.y(class041392);
            if (list.stream().filter(class074382 -> class06278.N(class074752, class074382)).findAny().isPresent()) {
                for (int i = 0; i < 10; ++i) {
                    class06889 class068892 = class05456.N((class07475)class074752, (int)20, (int)8);
                    if (class068892 == null || !class047822.method_19500(class07209.method_49638((class00737)class068892))) continue;
                    class041393.N((Object)new class05352(class068892, 0.6f, 0));
                    break;
                }
                return true;
            }
            Optional<class07438> var11 = class06278.N(list);
            if (var11.isPresent()) {
                class06278.N(class041395, class041394, class041393, var11.get());
                return true;
            }
            list.stream().findAny().ifPresent(class074382 -> class06278.N(class041395, class041394, class041393, class074382));
            return true;
        }));
    }

    private static class07438 N(class07438 class074382) {
        return (class07438)class074382.method_18868().L(class05378.b).get();
    }

    private static Optional<class07438> N(List<class07438> list) {
        return class06278.y(list).entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).filter(entry -> (Integer)entry.getValue() > 0 && (Integer)entry.getValue() <= 5).map(Map.Entry::getKey).findFirst();
    }

    private static boolean N(class07438 class074382, class07438 class074384) {
        return class074384.method_18868().L(class05378.b).filter(class074383 -> class074383 == class074382).isPresent();
    }

    private static void N(class04139<?, class07438> class041392, class04139<?, class05779> class041393, class04139<?, class05352> class041394, class07438 class074382) {
        class041392.N((Object)class074382);
        class041393.N((Object)new class05751((class07049)class074382, true));
        class041394.N((Object)new class05352((class05779)new class05751((class07049)class074382, false), 0.6f, 1));
    }
}

