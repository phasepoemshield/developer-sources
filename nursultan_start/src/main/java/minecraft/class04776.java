/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03291
 *  minecraft.class03860
 *  minecraft.class04367
 *  minecraft.class04890
 *  minecraft.class04898
 *  minecraft.class04933
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import minecraft.class03291;
import minecraft.class03860;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04890;
import minecraft.class04898;
import minecraft.class04933;
import minecraft.class06069;

public class class04776
extends class04748 {
    public static final MapCodec<class04776> N = class04776.N(class04776::new);

    public class04776(class04758 class047582) {
        super(class047582);
    }

    @Override
    public class04367<?> N() {
        return class04367.m;
    }

    @Override
    public Optional<class04780> N(class04764 class047642) {
        return Optional.of(new class04780(class047642.B().W(), class032912 -> class04776.N(class032912, class047642)));
    }

    private static void N(class03291 class032912, class04764 class047642) {
        class04898 class048982;
        int n = 0;
        do {
            class032912.y();
            class047642.R().L(class047642.M() + (long)n++, class047642.B().B, class047642.B().Z);
            class04933.N();
            class048982 = new class04898((class06069)class047642.R(), class047642.B().N(2), class047642.B().y(2));
            class032912.N((class04890)class048982);
            class048982.N((class04890)class048982, (class03860)class032912, (class06069)class047642.R());
            List var4 = class048982.L;
            while (!var4.isEmpty()) {
                int n2 = class047642.R().y(var4.size());
                ((class04890)var4.remove(n2)).N((class04890)class048982, (class03860)class032912, (class06069)class047642.R());
            }
            class032912.N(class047642.y().R(), class047642.y().M(), (class06069)class047642.R(), 10);
        } while (class032912.L() || class048982.y == null);
    }
}

