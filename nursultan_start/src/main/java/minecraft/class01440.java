/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01471
 *  minecraft.class01474
 *  minecraft.class03194
 *  minecraft.class04887
 *  minecraft.class05894
 *  minecraft.class05930
 *  minecraft.class06391
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class01471;
import minecraft.class01474;
import minecraft.class03194;
import minecraft.class04887;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class06391;
import minecraft.class07209;

public class class01440
extends class01474 {
    public static final MapCodec<class01440> N = class01471.N.fieldOf("provider").xmap(class01440::new, class014402 -> class014402.L);
    private final class01471 L;

    public class01440(class01471 class014712) {
        this.L = class014712;
    }

    private void y(class05894 class058942, class07209 class072092) {
        for (int i = 2; i >= -3; --i) {
            class07209 class072093 = class072092.method_10086(i);
            if (class06391.u((class04887)class058942.N(), (class07209)class072093)) {
                class058942.N(class072093, this.L.N(class058942.y(), class072092));
                break;
            }
            if (!class058942.N(class072093) && i < 0) break;
        }
    }

    private void N(class05894 class058942, class07209 class072092) {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (Math.abs(i) == 2 && Math.abs(j) == 2) continue;
                this.y(class058942, class072092.method_10069(i, 0, j));
            }
        }
    }

    protected class05930<?> N() {
        return class05930.M;
    }

    public void N(class05894 class058942) {
        List var2 = class03194.N((class05894)class058942);
        if (var2.isEmpty()) {
            return;
        }
        int n = ((class07209)var2.get(0)).method_10264();
        var2.stream().filter(class072092 -> class072092.method_10264() == n).forEach(class072092 -> {
            this.N(class058942, class072092.method_10067().method_10095());
            this.N(class058942, class072092.method_10089(2).method_10095());
            this.N(class058942, class072092.method_10067().method_10077(2));
            this.N(class058942, class072092.method_10089(2).method_10077(2));
            for (int i = 0; i < 5; ++i) {
                int n = class058942.y().y(64);
                int n2 = n % 8;
                int n3 = n / 8;
                if (n2 != 0 && n2 != 7 && n3 != 0 && n3 != 7) continue;
                this.N(class058942, class072092.method_10069(-3 + n2, 0, -3 + n3));
            }
        });
    }
}

