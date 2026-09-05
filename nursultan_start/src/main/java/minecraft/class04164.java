/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class00570
 *  minecraft.class01296
 *  minecraft.class01688
 *  minecraft.class03448
 *  minecraft.class04751
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class07321
 *  minecraft.class08337
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import minecraft.class00570;
import minecraft.class01296;
import minecraft.class01688;
import minecraft.class03448;
import minecraft.class04172;
import minecraft.class04751;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class07321;
import minecraft.class08337;

final class class04164 {
    final Map<class07321, String> N;
    final CompletableFuture<Map<class07321, String>> y;

    class04164(class04172 class041722, class08337 class083372, double d, double d2) {
        class03448 class034482 = (class03448)class041722.N.T_3;
        class05946 var8 = class034482.method_27983();
        int n = class01296.N((double)d);
        int n2 = class01296.N((double)d2);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        class01688 class016882 = class034482.method_8398();
        for (int i = n - 12; i <= n + 12; ++i) {
            for (int j = n2 - 12; j <= n2 + 12; ++j) {
                class07321 class073212 = new class07321(i, j);
                Object object = "";
                class00570 class005702 = class016882.N(i, j, false);
                object = (String)object + "Client: ";
                if (class005702 == null) {
                    object = (String)object + "0n/a\n";
                } else {
                    object = (String)object + (class005702.O() ? " E" : "");
                    object = (String)object + "\n";
                }
                builder.put((Object)class073212, object);
            }
        }
        this.N = builder.build();
        this.y = class083372.N(() -> {
            class04782 class047822 = class083372.N(var8);
            if (class047822 == null) {
                return ImmutableMap.of();
            }
            ImmutableMap.Builder builder = ImmutableMap.builder();
            class04751 class047512 = class047822.method_14178();
            for (int i = n - 12; i <= n + 12; ++i) {
                for (int j = n2 - 12; j <= n2 + 12; ++j) {
                    class07321 class073212 = new class07321(i, j);
                    builder.put((Object)class073212, (Object)("Server: " + class047512.N(class073212)));
                }
            }
            return builder.build();
        });
    }
}

