/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00869
 *  minecraft.class01339
 *  minecraft.class01471
 *  minecraft.class01474
 *  minecraft.class03194
 *  minecraft.class05163
 *  minecraft.class05894
 *  minecraft.class05930
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00869;
import minecraft.class01339;
import minecraft.class01471;
import minecraft.class01474;
import minecraft.class03194;
import minecraft.class05163;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07830;

public class class08631
extends class01474 {
    public static final MapCodec<class08631> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.b.fieldOf("tries").orElse((Object)128).forGetter(class086312 -> class086312.L), (App)class06338.T.fieldOf("radius").orElse((Object)2).forGetter(class086312 -> class086312.u), (App)class06338.T.fieldOf("height").orElse((Object)1).forGetter(class086312 -> class086312.i), (App)class01471.N.fieldOf("block_state_provider").forGetter(class086312 -> class086312.R)).apply(instance, class08631::new));
    private final int L;
    private final int u;
    private final int i;
    private final class01471 R;

    public class08631(int n, int n2, int n3, class01471 class014712) {
        this.L = n;
        this.u = n2;
        this.i = n3;
        this.R = class014712;
    }

    protected class05930<?> N() {
        return class05930.Z;
    }

    private void N(class05894 class058942, class07209 class072092) {
        class07209 class072093 = class072092.method_10084();
        if (class058942.N().method_16358(class072093, class005002 -> class005002.P() || class005002.N(class00869.Rc)) && class058942.N(class072092, class01339::t) && class058942.N().N(class07830.field_13203, class072092).method_10264() <= class072093.method_10264()) {
            class058942.N(class072093, this.R.N(class058942.y(), class072093));
        }
    }

    public void N(class05894 class058942) {
        class07209 class0720922;
        List list = class03194.N((class05894)class058942);
        if (list.isEmpty()) {
            return;
        }
        class07209 class072093 = (class07209)list.getFirst();
        int n = class072093.method_10264();
        int n2 = class072093.method_10263();
        int n3 = class072093.method_10263();
        int n4 = class072093.method_10260();
        int n5 = class072093.method_10260();
        for (class07209 class0720922 : list) {
            if (class0720922.method_10264() != n) continue;
            n2 = Math.min(n2, class0720922.method_10263());
            n3 = Math.max(n3, class0720922.method_10263());
            n4 = Math.min(n4, class0720922.method_10260());
            n5 = Math.max(n5, class0720922.method_10260());
        }
        class06069 class060692 = class058942.y();
        class0720922 = new class05163(n2, n, n4, n3, n, n5).L(this.u, this.i, this.u);
        class07218 class072182 = new class07218();
        for (int i = 0; i < this.L; ++i) {
            class072182.N(class060692.N(class0720922.B(), class0720922.U()), class060692.N(class0720922.Z(), class0720922.E()), class060692.N(class0720922.z(), class0720922.W()));
            this.N(class058942, (class07209)class072182);
        }
    }
}

