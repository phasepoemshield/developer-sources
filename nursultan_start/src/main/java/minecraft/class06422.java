/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01207
 *  minecraft.class01224
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class02670
 *  minecraft.class05163
 *  minecraft.class05483
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07830
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01207;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class02670;
import minecraft.class05163;
import minecraft.class05483;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07830;
import org.apache.commons.lang3.mutable.MutableInt;

public class class06422
extends class06391<class02670> {
    public class06422(Codec<class02670> codec) {
        super(codec);
    }

    private static int N(class05974 class059742, class05163 class051632) {
        MutableInt mutableInt = new MutableInt(0);
        class051632.N((T class072092) -> {
            class00500 class005002 = class059742.method_8320(class072092);
            if (class005002.P() || class005002.N(class00869.V) || class005002.N(class00869.K)) {
                mutableInt.add(1);
            }
        });
        return mutableInt.intValue();
    }

    @Override
    public boolean N(class06058<class02670> class060582) {
        int n;
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06993 class069932 = class06993.N((class06069)class060692);
        class02670 class026702 = (class02670)class060582.R();
        int n2 = class060692.y(class026702.y.size());
        class01224 class012242 = class059742.method_8410().method_8503().yv();
        class01207 class012072 = class012242.N((class01894)class026702.y.get(n2));
        class01207 class012073 = class012242.N((class01894)class026702.L.get(n2));
        class07321 class073212 = new class07321(class072092);
        class05163 class051632 = new class05163(class073212.i() - 16, class059742.method_31607(), class073212.R() - 16, class073212.M() + 16, class059742.method_31600(), class073212.B() + 16);
        class01233 class012332 = new class01233().N(class069932).N(class051632).N(class060692);
        class00753 class007532 = class012072.N(class069932);
        class07209 class072093 = class072092.method_10069(-class007532.method_10263() / 2, 0, -class007532.method_10260() / 2);
        int n3 = class072092.method_10264();
        for (n = 0; n < class007532.method_10263(); ++n) {
            for (int i = 0; i < class007532.method_10260(); ++i) {
                n3 = Math.min(n3, class059742.method_8624(class07830.field_13195, class072093.method_10263() + n, class072093.method_10260() + i));
            }
        }
        n = Math.max(n3 - 15 - class060692.y(10), class059742.method_31607() + 10);
        class07209 class072094 = class012072.N(class072093.method_33096(n), class07111.field_11302, class069932);
        if (class06422.N(class059742, class012072.y(class012332, class072094)) > class026702.M) {
            return false;
        }
        class012332.y();
        ((class05483)class026702.u.N()).N().forEach(arg_0 -> ((class01233)class012332).N(arg_0));
        class012072.N((class01001)class059742, class072094, class072094, class012332, class060692, 260);
        class012332.y();
        ((class05483)class026702.i.N()).N().forEach(arg_0 -> ((class01233)class012332).N(arg_0));
        class012073.N((class01001)class059742, class072094, class072094, class012332, class060692, 260);
        return true;
    }
}

