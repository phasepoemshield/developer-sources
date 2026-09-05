/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07030
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07688
 *  minecraft.class08064
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07030;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07688;
import minecraft.class08064;
import minecraft.class08092;

public class class00653
extends class07688 {
    public static final MapCodec<class00653> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07030.y.fieldOf("kind").forGetter(class07688::y), (App)class00653.t()).apply(instance, class00653::new));
    public static final class08064<class07211> u = class07101.R;
    private static final Map<class07211, class00494> y = class00389.L((class00494)class00891.L((double)8.0, (double)8.0, (double)16.0));

    public class00653(class07030 class070302, class01362 class013622) {
        super(class070302, class013622);
        this.P((class00500)this.W().y(u, (Comparable)class07211.field_11043));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        super.N(class005172);
        class005172.N(new class08092[]{u});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(u)));
    }

    public MapCodec<? extends class00653> N() {
        return L;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(u, (Comparable)class069932.N((class07211)class005002.L(u)));
    }

    public class00500 N(class06942 class069422) {
        class00500 class005002 = super.N(class069422);
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        for (class07211 class072112 : class069422.i()) {
            if (!class072112.z().L()) continue;
            class07211 class072113 = class072112.b();
            class005002 = (class00500)class005002.y(u, (Comparable)class072113);
            if (class072992.method_8320(class072092.method_10093(class072112)).N(class069422)) continue;
            return class005002;
        }
        return null;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y.get(class005002.L(u));
    }
}

