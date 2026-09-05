/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04227
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06993
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07310
 *  minecraft.class07728
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04227;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06993;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07310;
import minecraft.class07728;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;

public class class07660
extends class00864 {
    public static final MapCodec<class07660> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.Z).fieldOf("fruit").forGetter(class076602 -> class076602.u), (App)class05946.N((class05946)class04227.Z).fieldOf("stem").forGetter(class076602 -> class076602.i), (App)class05946.N((class05946)class04227.F).fieldOf("seed").forGetter(class076602 -> class076602.R), (App)class07660.t()).apply(instance, class07660::new));
    public static final class08064<class07211> y = class07101.R;
    private static final Map<class07211, class00494> L = class00389.L((class00494)class00891.N((double)4.0, (double)0.0, (double)10.0, (double)0.0, (double)10.0));
    private final class05946<class00891> u;
    private final class05946<class00891> i;
    private final class05946<class06581> R;

    public class07660(class05946<class00891> class059462, class05946<class00891> class059463, class05946<class06581> class059464, class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043));
        this.i = class059462;
        this.u = class059463;
        this.R = class059464;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public MapCodec<class07660> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L.get(class005002.L(y));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        Optional optional;
        if (!class005003.N(this.u) && class072112 == class005002.L(y) && (optional = class054872.method_30349().L(class04227.Z).M(this.i)).isPresent()) {
            return (class00500)((class00891)optional.get()).W().L((class08092)class07728.L, (Comparable)Integer.valueOf(7));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class00869.Lr);
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)DataFixUtils.orElse((Optional)class054872.method_30349().L(class04227.F).M(this.R), (Object)((Object)this)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }
}

