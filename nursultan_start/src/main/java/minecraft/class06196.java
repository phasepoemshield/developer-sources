/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03291
 *  minecraft.class03860
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class04890
 *  minecraft.class04995
 *  minecraft.class05168
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class07836
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class03291;
import minecraft.class03860;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04890;
import minecraft.class04995;
import minecraft.class05168;
import minecraft.class06069;
import minecraft.class06187;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class07836;
import minecraft.class08088;

public class class06196
extends class04748 {
    public static final MapCodec<class06196> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06196.N(instance), (App)class06187.field_24839.fieldOf("mineshaft_type").forGetter(class061962 -> class061962.y)).apply(instance, class06196::new));
    private final class06187 y;

    public class06196(class04758 class047582, class06187 class061872) {
        super(class047582);
        this.y = class061872;
    }

    public class04367<?> N() {
        return class04367.B;
    }

    private int N(class03291 class032912, class04764 class047642) {
        class07321 class073212 = class047642.B();
        class07836 class078362 = class047642.R();
        class08088 class080882 = class047642.y();
        class05168 class051682 = new class05168(0, (class06069)class078362, class073212.N(2), class073212.y(2), this.y);
        class032912.N((class04890)class051682);
        class051682.N((class04890)class051682, (class03860)class032912, (class06069)class078362);
        int n = class080882.R();
        if (this.y == class06187.field_13691) {
            class07209 class072092 = class032912.u().M();
            int n2 = class080882.N(class072092.method_10263(), class072092.method_10260(), class07830.field_13194, class047642.Z(), class047642.u());
            int n3 = (n2 <= n ? n : class04995.y((class06069)class078362, (int)n, (int)n2)) - class072092.method_10264();
            class032912.N(n3);
            return n3;
        }
        return class032912.N(n, class080882.M(), (class06069)class078362, 10);
    }

    public Optional<class04780> N(class04764 class047642) {
        class047642.R().U();
        class07321 class073212 = class047642.B();
        class07209 class072092 = new class07209(class073212.L(), 50, class073212.R());
        class03291 class032912 = new class03291();
        int n = this.N(class032912, class047642);
        return Optional.of(new class04780(class072092.method_10069(0, n, 0), Either.right((Object)class032912)));
    }
}

