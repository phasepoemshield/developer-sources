/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class00901
 *  minecraft.class01362
 *  minecraft.class03238
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class00901;
import minecraft.class01362;
import minecraft.class03238;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07299;

public class class00320
extends class00891
implements class00873 {
    public static final MapCodec<class00320> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.Nh).fieldOf("feature").forGetter(class003202 -> class003202.y), (App)class00320.t()).apply(instance, class00320::new));
    private final class05946<class03238<?, ?>> y;

    public class00320(class05946<class03238<?, ?>> class059462, class01362 class013622) {
        super(class013622);
        this.y = class059462;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8320(class072092.method_10084()).P();
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class047822.method_30349().method_46759(class04227.Nh).flatMap(class007512 -> class007512.N(this.y)).ifPresent(class035292 -> ((class03238)class035292.N()).N((class05974)class047822, class047822.method_14178().U(), class060692, class072092.method_10084()));
    }

    public MapCodec<class00320> N() {
        return N;
    }

    public class00901 ay_() {
        return class00901.field_47834;
    }
}

