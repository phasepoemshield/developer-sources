/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class04297
 *  minecraft.class04323
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01034;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class04297;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07830;

@Deprecated
public class class01006
extends class04297 {
    public static final MapCodec<class01006> N = class02142.N((int)0, (int)256).fieldOf("count").xmap(class01006::new, class010062 -> class010062.L);
    private final class02142 L;

    private class01006(class02142 class021422) {
        this.L = class021422;
    }

    private static int N(class01034 class010342, int n, int n2, int n3, int n4) {
        class07218 class072182 = new class07218(n, n2, n3);
        int n5 = 0;
        class00500 class005002 = class010342.N((class07209)class072182);
        for (int i = n2; i >= class010342.N() + 1; --i) {
            class072182.method_10099(i - 1);
            class00500 class005003 = class010342.N((class07209)class072182);
            if (!class01006.N(class005003) && class01006.N(class005002) && !class005003.N(class00869.q)) {
                if (n5 == n4) {
                    return class072182.method_10264() + 1;
                }
                ++n5;
            }
            class005002 = class005003;
        }
        return Integer.MAX_VALUE;
    }

    private static boolean N(class00500 class005002) {
        return class005002.P() || class005002.N(class00869.K) || class005002.N(class00869.V);
    }

    public class04323<?> N() {
        return class04323.Z;
    }

    public static class01006 N(class02142 class021422) {
        return new class01006(class021422);
    }

    public Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072092) {
        boolean bl;
        Stream.Builder<class07209> builder = Stream.builder();
        int n = 0;
        do {
            bl = false;
            for (int i = 0; i < this.L.N(class060692); ++i) {
                int n2;
                int n3;
                int n4 = class060692.y(16) + class072092.method_10263();
                int n5 = class01006.N(class010342, n4, n3 = class010342.N(class07830.field_13197, n4, n2 = class060692.y(16) + class072092.method_10260()), n2, n);
                if (n5 == Integer.MAX_VALUE) continue;
                builder.add(new class07209(n4, n5, n2));
                bl = true;
            }
            ++n;
        } while (bl);
        return builder.build();
    }

    public static class01006 N(int n) {
        return class01006.N((class02142)class02151.N((int)n));
    }
}

