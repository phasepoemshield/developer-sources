/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03291
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class04890
 *  minecraft.class05252
 *  minecraft.class07209
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class03291;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04890;
import minecraft.class05252;
import minecraft.class07209;
import minecraft.class07830;

public class class04338
extends class04748 {
    public static final MapCodec<class04338> N = class04338.N(class04338::new);

    public class04338(class04758 class047582) {
        super(class047582);
    }

    public class04367<?> N() {
        return class04367.N;
    }

    public Optional<class04780> N(class04764 class047642) {
        return class04338.N((class04764)class047642, (class07830)class07830.field_13195, class032912 -> class04338.N(class032912, class047642));
    }

    private static void N(class03291 class032912, class04764 class047642) {
        class07209 class072092 = new class07209(class047642.B().N(9), 90, class047642.B().y(9));
        class032912.N((class04890)new class05252(class072092));
    }
}

