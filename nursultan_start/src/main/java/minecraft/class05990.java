/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class03238
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class03238;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;

public class class05990
extends class00864
implements class00873 {
    public static final MapCodec<class05990> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N(class04227.Nh).fieldOf("feature").forGetter(class059902 -> class059902.i), (App)class04206.i.T().fieldOf("grows_on").forGetter(class059902 -> class059902.u), (App)class05990.t()).apply(instance, class05990::new));
    private static final double y = 0.4;
    private static final class00494 L = class00891.y((double)8.0, (double)0.0, (double)9.0);
    private final class00891 u;
    private final class05946<class03238<?, ?>> i;

    public class05990(class05946<class03238<?, ?>> class059462, class00891 class008912, class01362 class013622) {
        super(class013622);
        this.i = class059462;
        this.u = class008912;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        this.N((class05487)class047822).ifPresent(class035562 -> ((class03238)class035562.N()).N((class05974)class047822, class047822.method_14178().U(), class060692, class072092));
    }

    public MapCodec<class05990> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L;
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class01210.Nr) || class005002.N(class00869.RC) || class005002.N(class00869.ik) || super.N(class005002, class072902, class072092);
    }

    private Optional<? extends class03556<class03238<?, ?>>> N(class05487 class054872) {
        return class054872.method_30349().L(class04227.Nh).N(this.i);
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8320(class072092.method_10074()).N(this.u);
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return (double)class060692.z() < 0.4;
    }
}

