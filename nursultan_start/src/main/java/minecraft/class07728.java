/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00751
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06772
 *  minecraft.class07101
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08071
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00751;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06772;
import minecraft.class07101;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08071;
import minecraft.class08092;

public class class07728
extends class00864
implements class00873 {
    public static final MapCodec<class07728> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.Z).fieldOf("fruit").forGetter(class077282 -> class077282.i), (App)class05946.N((class05946)class04227.Z).fieldOf("attached_stem").forGetter(class077282 -> class077282.R), (App)class05946.N((class05946)class04227.F).fieldOf("seed").forGetter(class077282 -> class077282.M), (App)class07728.t()).apply(instance, class07728::new));
    public static final int y = 7;
    public static final class08071 L = class06665.Nw;
    private static final class00494[] u = class00891.N((int)7, n -> class00891.y((double)2.0, (double)0.0, (double)(2 + n * 2)));
    private final class05946<class00891> i;
    private final class05946<class00891> R;
    private final class05946<class06581> M;

    public class07728(class05946<class00891> class059462, class05946<class00891> class059463, class05946<class06581> class059464, class01362 class013622) {
        super(class013622);
        this.i = class059462;
        this.R = class059463;
        this.M = class059464;
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class047822.method_22335(class072092, 0) < 9) {
            return;
        }
        float f = class06772.N((class00891)this, (class07290)class047822, (class07209)class072092);
        if (class060692.y((int)(25.0f / f) + 1) == 0) {
            int n = (Integer)class005002.L((class08092)L);
            if (n < 7) {
                class005002 = (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n + 1));
                class047822.method_8652(class072092, class005002, 2);
            } else {
                class07211 class072112 = class07221.field_11062.N(class060692);
                class07209 class072093 = class072092.method_10093(class072112);
                class00500 class005003 = class047822.method_8320(class072093.method_10074());
                if (class047822.method_8320(class072093).P() && (class005003.N(class00869.Lr) || class005003.N(class01210.Ni))) {
                    class00751 class007512 = class047822.method_30349().L(class04227.Z);
                    Optional optional = class007512.M(this.i);
                    Optional optional2 = class007512.M(this.R);
                    if (optional.isPresent() && optional2.isPresent()) {
                        class047822.method_8501(class072093, ((class00891)optional.get()).W());
                        class047822.method_8501(class072092, (class00500)((class00891)optional2.get()).W().y((class08092)class07101.R, (Comparable)class072112));
                    }
                }
            }
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    public MapCodec<class07728> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u[(Integer)class005002.L((class08092)L)];
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class00869.Lr);
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)DataFixUtils.orElse((Optional)class054872.method_30349().L(class04227.F).M(this.M), (Object)((Object)this)));
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return (Integer)class005002.L((class08092)L) != 7;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        int n = Math.min(7, (Integer)class005002.L((class08092)L) + class04995.N((class06069)class047822.field_9229, (int)2, (int)5));
        class00500 class005003 = (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n));
        class047822.method_8652(class072092, class005003, 2);
        if (n == 7) {
            class005003.y(class047822, class072092, class047822.field_9229);
        }
    }
}

