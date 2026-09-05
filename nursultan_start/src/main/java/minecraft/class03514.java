/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03136
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class06273
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.stream.IntStream;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03136;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06273;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class07830;

public class class03514
extends class06391<class06225> {
    public class03514(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        class07321 class073212 = new class07321(class060582.i());
        IntArrayList intArrayList = class07536.N((IntStream)IntStream.rangeClosed(class073212.i(), class073212.M()), (class06069)class060692);
        IntArrayList intArrayList2 = class07536.N((IntStream)IntStream.rangeClosed(class073212.R(), class073212.B()), (class06069)class060692);
        class07218 class072182 = new class07218();
        for (Integer n : intArrayList) {
            for (Integer n2 : intArrayList2) {
                class072182.N(n.intValue(), 0, n2.intValue());
                class07209 class072092 = class059742.N(class07830.field_13203, (class07209)class072182);
                if (!class059742.R(class072092) && !class059742.method_8320(class072092).M((class07290)class059742, class072092).method_1110()) continue;
                class059742.method_8652(class072092, class00869.LA.W(), 2);
                class03136.N((class07290)class059742, (class06069)class060692, (class07209)class072092, (class05946)class06273.N);
                class00500 class005002 = class00869.Le.W();
                for (class07211 class072112 : class07221.field_11062) {
                    class07209 class072093 = class072092.method_10093(class072112);
                    if (!class005002.N((class05487)class059742, class072093)) continue;
                    class059742.method_8652(class072093, class005002, 2);
                }
                return true;
            }
        }
        return false;
    }
}

