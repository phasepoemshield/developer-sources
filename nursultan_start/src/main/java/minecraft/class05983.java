/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00515
 *  minecraft.class00869
 *  minecraft.class01376
 *  minecraft.class03291
 *  minecraft.class03855
 *  minecraft.class03860
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class06057
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07836
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00515;
import minecraft.class00869;
import minecraft.class01376;
import minecraft.class03291;
import minecraft.class03855;
import minecraft.class03860;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class05998;
import minecraft.class06057;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07836;

public class class05983
extends class04748 {
    public static final MapCodec<class05983> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05983.N(instance), (App)class03855.L.fieldOf("height").forGetter(class059832 -> class059832.y)).apply(instance, class05983::new));
    public final class03855 y;

    public class05983(class04758 class047582, class03855 class038552) {
        super(class047582);
        this.y = class038552;
    }

    private static /* synthetic */ void N(class04764 class047642, class07836 class078362, class07209 class072092, class03291 class032912) {
        class05998.N(class047642.i(), (class03860)class032912, (class06069)class078362, class072092);
    }

    public class04367<?> N() {
        return class04367.Z;
    }

    public Optional<class04780> N(class04764 class047642) {
        class00500 class005002;
        class07836 class078362 = class047642.R();
        int n = class047642.B().i() + class078362.y(16);
        int n2 = class047642.B().R() + class078362.y(16);
        int n3 = class047642.y().R();
        class06057 class060572 = new class06057(class047642.y(), class047642.Z());
        int n4 = this.y.N((class06069)class078362, class060572);
        class01376 class013762 = class047642.y().N(n, n2, class047642.Z(), class047642.u());
        class07218 class072182 = new class07218(n, n4, n2);
        while (n4 > n3) {
            class005002 = class013762.N(n4);
            class00500 class005003 = class013762.N(--n4);
            if (!class005002.P() || !class005003.N(class00869.iw) && !class005003.L((class07290)class00515.field_12294, (class07209)class072182.method_10099(n4), class07211.field_11036)) continue;
            break;
        }
        if (n4 <= n3) {
            return Optional.empty();
        }
        class005002 = new class07209(n, n4, n2);
        return Optional.of(new class04780((class07209)class005002, arg_0 -> class05983.N(class047642, class078362, (class07209)class005002, arg_0)));
    }
}

