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
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class03238
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06092
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
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class03238;
import minecraft.class03556;
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

public class class07119
extends class00864
implements class00873 {
    public static final MapCodec<class07119> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.Nh).fieldOf("feature").forGetter(class071192 -> class071192.L), (App)class07119.t()).apply(instance, class07119::new));
    private static final class00494 y = class00891.y((double)6.0, (double)0.0, (double)6.0);
    private final class05946<class03238<?, ?>> L;

    public class07119(class05946<class03238<?, ?>> class059462, class01362 class013622) {
        super(class013622);
        this.L = class059462;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 object, class06069 class060692) {
        if (class060692.y(25) == 0) {
            int n = 5;
            int n2 = 4;
            for (class07209 class072092 : class07209.method_10097(object.method_10069(-4, -1, -4), object.method_10069(4, 1, 4))) {
                if (!class047822.method_8320(class072092).N((class00891)this) || --n > 0) continue;
                return;
            }
            Object object2 = object.method_10069(class060692.y(3) - 1, class060692.y(2) - class060692.y(2), class060692.y(3) - 1);
            for (int i = 0; i < 4; ++i) {
                if (class047822.R(object2) && class005002.N((class05487)class047822, object2)) {
                    object = object2;
                }
                object2 = object.method_10069(class060692.y(3) - 1, class060692.y(2) - class060692.y(2), class060692.y(3) - 1);
            }
            if (class047822.R(object2) && class005002.N((class05487)class047822, object2)) {
                class047822.method_8652(object2, class005002, 2);
            }
        }
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return (double)class060692.z() < 0.4;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        this.N(class047822, class072092, class005002, class060692);
    }

    public MapCodec<class07119> N() {
        return N;
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.t();
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }

    public boolean N(class04782 class047822, class07209 class072092, class00500 class005002, class06069 class060692) {
        Optional optional = class047822.method_30349().L(class04227.Nh).N(this.L);
        if (optional.isEmpty()) {
            return false;
        }
        class047822.method_8650(class072092, false);
        if (((class03238)((class03556)optional.get()).N()).N((class05974)class047822, class047822.method_14178().U(), class060692, class072092)) {
            return true;
        }
        class047822.method_8652(class072092, class005002, 3);
        return false;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return true;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class054872.method_8320(class072093);
        if (class005003.N(class01210.yE)) {
            return true;
        }
        return class054872.method_22335(class072092, 0) < 13 && this.N(class005003, (class07290)class054872, class072093);
    }
}

