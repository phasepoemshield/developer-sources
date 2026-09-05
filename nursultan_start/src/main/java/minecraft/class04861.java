/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01019
 *  minecraft.class01203
 *  minecraft.class01224
 *  minecraft.class01228
 *  minecraft.class01894
 *  minecraft.class02610
 *  minecraft.class03556
 *  minecraft.class04336
 *  minecraft.class05163
 *  minecraft.class05246
 *  minecraft.class05248
 *  minecraft.class05267
 *  minecraft.class05288
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01019;
import minecraft.class01203;
import minecraft.class01224;
import minecraft.class01228;
import minecraft.class01894;
import minecraft.class02610;
import minecraft.class03556;
import minecraft.class04336;
import minecraft.class04853;
import minecraft.class04858;
import minecraft.class04884;
import minecraft.class05163;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05267;
import minecraft.class05288;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08088;

public class class04861
extends class05248 {
    public static final MapCodec<class04861> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04336.y.fieldOf("feature").forGetter(class048612 -> class048612.L), (App)class04861.R()).apply(instance, class04861::new));
    private static final class01894 y = class01894.y((String)"bottom");
    private final class03556<class04336> L;
    private final class07001 u;

    public class04861(class03556<class04336> class035562, class05246 class052462) {
        super(class052462);
        this.L = class035562;
        this.u = this.y();
    }

    public String toString() {
        return "Feature[" + String.valueOf(this.L) + "]";
    }

    private class07001 y() {
        class07001 class070012 = new class07001();
        class070012.N("name", class01894.N, (Object)y);
        class070012.N_67("final_state", "minecraft:air");
        class070012.N("pool", class04858.N, (Object)class01019.N);
        class070012.N("target", class01894.N, (Object)class04858.y);
        class070012.N("joint", class04853.field_54790, (Object)class04853.field_23329);
        return class070012;
    }

    public boolean N(class01224 class012242, class05974 class059742, class05324 class053242, class08088 class080882, class07209 class072092, class07209 class072093, class06993 class069932, class05163 class051632, class06069 class060692, class02610 class026102, boolean bl) {
        return ((class04336)this.L.N()).N(class059742, class080882, class060692, class072092);
    }

    public class00753 N(class01224 class012242, class06993 class069932) {
        return class00753.field_11176;
    }

    public List<class01203> N(class01224 class012242, class07209 class072092, class06993 class069932, class06069 class060692) {
        return List.of(class01203.N((class01228)new class01228(class072092, (class00500)class00869.sr.W().y(class04884.y, (Comparable)class05288.N((class07211)class07211.field_11033, (class07211)class07211.field_11035)), this.u)));
    }

    public class05163 N(class01224 class012242, class07209 class072092, class06993 class069932) {
        class00753 class007532 = this.N(class012242, class069932);
        return new class05163(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072092.method_10263() + class007532.method_10263(), class072092.method_10264() + class007532.method_10264(), class072092.method_10260() + class007532.method_10260());
    }

    public class05267<?> N() {
        return class05267.L;
    }
}

