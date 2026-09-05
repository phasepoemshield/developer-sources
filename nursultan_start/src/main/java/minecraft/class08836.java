/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00331
 *  minecraft.class00333
 *  minecraft.class00368
 *  minecraft.class00891
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class03662
 */
package minecraft;

import java.util.Map;
import minecraft.class00331;
import minecraft.class00333;
import minecraft.class00368;
import minecraft.class00891;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class03662;

public class class08836 {
    public static final class08836 N = new class08836(Map.of());
    private final Map<class00891, class00368<?>> y;

    public class08836(Map<class00891, class00368<?>> map) {
        this.y = map;
    }

    public static class08836 N(class00331 class003312) {
        return new class08836(class00333.N((class00331)class003312));
    }

    public void N(class00891 class008912, class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, int n3) {
        class00368<?> var8 = this.y.get(class008912);
        if (var8 != null) {
            var8.N(null, class036622, class014212, class012372, n, n2, false, n3);
        }
    }
}

