/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00729
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class02584
 *  minecraft.class03556
 *  minecraft.class04626
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07086
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08400
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00729;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class02584;
import minecraft.class03556;
import minecraft.class04626;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08400;
import minecraft.class08846;

public class class08817
extends class00729 {
    public static final MapCodec<class08817> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.fieldOf("open").forGetter(class088172 -> class088172.R.field_55072), (App)class08817.t()).apply(instance, class08817::new));
    private static final int u = 3;
    private static final int i = 2;
    private final class08846 R;

    private boolean L(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (((class02584)class047822.method_75728().N(class00608.o, class072092)).y(this.R.field_55072) == this.R.field_55072) {
            return false;
        }
        class08846 class088462 = this.R.L();
        class047822.method_8652(class072092, class088462.y(), 3);
        class047822.N((class03556)class01194.L, class072092, class01164.N((class00500)class005002));
        class088462.N(class047822, class072092, class060692);
        class07209.method_10097((class07209)class072092.method_10069(-3, -2, -3), (class07209)class072092.method_10069(3, 2, 3)).forEach(class072093 -> {
            if (class047822.method_8320(class072093) == class005002) {
                double d = Math.sqrt(class072092.method_10262((class00753)class072093));
                int n = class060692.N((int)(d * 5.0), (int)(d * 10.0));
                class047822.N(class072093, class005002.i(), n);
            }
        });
        return true;
    }

    public class08817(boolean bl, class01362 class013622) {
        super(class08846.N((boolean)bl).field_55073, class08846.N((boolean)bl).field_55074, class013622);
        this.R = class08846.N(bl);
    }

    public class08817(class08846 class088462, class01362 class013622) {
        super(class088462.field_55073, class088462.field_55074, class013622);
        this.R = class088462;
    }

    public class07055 y() {
        return new class07055(class07047.j, 25);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (this.L(class005002, class047822, class072092, class060692)) {
            class047822.method_8396(null, class072092, this.R.L().field_55075, class04911.field_15245, 1.0f, 1.0f);
        }
        super.y_2(class005002, class047822, class072092, class060692);
    }

    public MapCodec<? extends class08817> N() {
        return N;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (!class072992.method_8608() && class072992.y() != class07086.field_5801 && class070492 instanceof class04626) {
            class04626 class046262 = (class04626)class070492;
            if (class04626.N((class00500)class005002) && !class046262.method_6059(class07047.j)) {
                class046262.method_6092(this.y());
            }
        }
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (this.R.u() && class060692.y(700) == 0 && class072992.method_8320(class072092.method_10074()).N(class00869.nf)) {
            class072992.method_8486((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class04909.Un, class04911.field_15256, 1.0f, 1.0f, false);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (this.L(class005002, class047822, class072092, class060692)) {
            class047822.method_8396(null, class072092, this.R.L().field_55076, class04911.field_15245, 1.0f, 1.0f);
        }
        super.N(class005002, class047822, class072092, class060692);
    }
}

