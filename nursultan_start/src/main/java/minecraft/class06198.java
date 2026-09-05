/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03291
 *  minecraft.class03300
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class04043
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class05167
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class07836
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import minecraft.class03291;
import minecraft.class03300;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class04043;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05167;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class07836;

public class class06198
extends class04748 {
    public static final MapCodec<class06198> N = class06198.N(class06198::new);

    public class06198(class04758 class047582) {
        super(class047582);
    }

    public static class03300 N(class07321 class073212, long l, class03300 class033002) {
        if (class033002.N()) {
            return class033002;
        }
        class07836 class078362 = new class07836((class06069)new class06075(class04043.N()));
        class078362.L(l, class073212.B, class073212.Z);
        class04890 class048902 = (class04890)class033002.L().get(0);
        class05163 class051632 = class048902.L();
        int n = class051632.B();
        int n2 = class051632.z();
        class07211 class072112 = class07221.field_11062.N((class06069)class078362);
        class07211 class072113 = Objects.requireNonNullElse(class048902.i(), class072112);
        class05167 class051672 = new class05167((class06069)class078362, n, n2, class072113);
        class03291 class032912 = new class03291();
        class032912.N((class04890)class051672);
        return class032912.N();
    }

    public class04367<?> N() {
        return class04367.z;
    }

    public Optional<class04780> N(class04764 class047642) {
        int n = class047642.B().N(9);
        int n2 = class047642.B().y(9);
        Iterator var5 = class047642.L().N(n, class047642.y().R(), n2, 29, class047642.u().y()).iterator();
        while (var5.hasNext()) {
            if (((class03556)var5.next()).N(class03557.D)) continue;
            return Optional.empty();
        }
        return class06198.N((class04764)class047642, (class07830)class07830.field_13195, (T class032912) -> class06198.N(class032912, class047642));
    }

    private static void N(class03291 class032912, class04764 class047642) {
        class032912.N(class06198.N(class047642.B(), class047642.R()));
    }

    private static class04890 N(class07321 class073212, class07836 class078362) {
        int n = class073212.i() - 29;
        int n2 = class073212.R() - 29;
        class07211 class072112 = class07221.field_11062.N((class06069)class078362);
        return new class05167((class06069)class078362, n, n2, class072112);
    }
}

