/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00729
 *  minecraft.class00869
 *  minecraft.class01362
 *  minecraft.class02692
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07086
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08400
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00729;
import minecraft.class00869;
import minecraft.class01362;
import minecraft.class02692;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08400;

public class class00424
extends class00729 {
    public static final MapCodec<class00424> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)y.forGetter(class00729::L), (App)class00424.t()).apply(instance, class00424::new));

    public class00424(class02692 class026922, class01362 class013622) {
        super(class026922, class013622);
    }

    public class00424(class03556<class07084> class035562, float f, class01362 class013622) {
        this(class00424.N(class035562, (float)f), class013622);
    }

    public class07055 y() {
        return new class07055(class07047.v, 40);
    }

    public MapCodec<class00424> N() {
        return N;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class072992 instanceof class04782) {
            class07438 class074382;
            class04782 class047822 = (class04782)class072992;
            if (class072992.y() != class07086.field_5801 && class070492 instanceof class07438 && !(class074382 = (class07438)class070492).method_5679(class047822, class072992.method_48963().b())) {
                class074382.method_6092(this.y());
            }
        }
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class06889 class068892 = this.N(class005002, (class07290)class072992, class072092, class06092.N()).method_1107().R();
        double d = (double)class072092.method_10263() + class068892.M;
        double d2 = (double)class072092.method_10260() + class068892.Z;
        for (int i = 0; i < 3; ++i) {
            if (!class060692.Z()) continue;
            class072992.method_8406((class07126)class07107.NZ, d + class060692.U() / 5.0, (double)class072092.method_10264() + (0.5 - class060692.U()), d2 + class060692.U() / 5.0, 0.0, 0.0, 0.0);
        }
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return super.N(class005002, class072902, class072092) || class005002.N(class00869.id) || class005002.N(class00869.iw) || class005002.N(class00869.ik);
    }
}

