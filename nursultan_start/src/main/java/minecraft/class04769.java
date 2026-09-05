/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03291
 *  minecraft.class04367
 *  minecraft.class04890
 *  minecraft.class04893
 *  minecraft.class06069
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
import minecraft.class04893;
import minecraft.class06069;
import minecraft.class07830;

public class class04769
extends class04748 {
    public static final MapCodec<class04769> N = class04769.N(class04769::new);

    public class04769(class04758 class047582) {
        super(class047582);
    }

    @Override
    public class04367<?> N() {
        return class04367.P;
    }

    @Override
    public Optional<class04780> N(class04764 class047642) {
        return class04769.N(class047642, class07830.field_13194, class032912 -> class04769.N(class032912, class047642));
    }

    private static void N(class03291 class032912, class04764 class047642) {
        class032912.N((class04890)new class04893((class06069)class047642.R(), class047642.B().i(), class047642.B().R()));
    }
}

