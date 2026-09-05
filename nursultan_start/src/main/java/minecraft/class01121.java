/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01471
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01471;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06338;

public class class01121 {
    public final class01471 N;
    public final class01471 y;
    public final class01471 L;
    public final class01471 u;
    public final class01471 i;
    public final List<class00500> R;
    public final class03530<class00891> M;
    public final class03530<class00891> B;
    public static final Codec<class01121> Z = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("filling_provider").forGetter(class011212 -> class011212.N), (App)class01471.N.fieldOf("inner_layer_provider").forGetter(class011212 -> class011212.y), (App)class01471.N.fieldOf("alternate_inner_layer_provider").forGetter(class011212 -> class011212.L), (App)class01471.N.fieldOf("middle_layer_provider").forGetter(class011212 -> class011212.u), (App)class01471.N.fieldOf("outer_layer_provider").forGetter(class011212 -> class011212.i), (App)class06338.y((Codec)class00500.N.listOf()).fieldOf("inner_placements").forGetter(class011212 -> class011212.R), (App)class03530.y((class05946)class04227.Z).fieldOf("cannot_replace").forGetter(class011212 -> class011212.M), (App)class03530.y((class05946)class04227.Z).fieldOf("invalid_blocks").forGetter(class011212 -> class011212.B)).apply(instance, class01121::new));

    public class01121(class01471 class014712, class01471 class014713, class01471 class014714, class01471 class014715, class01471 class014716, List<class00500> list, class03530<class00891> class035302, class03530<class00891> class035303) {
        this.N = class014712;
        this.y = class014713;
        this.L = class014714;
        this.u = class014715;
        this.i = class014716;
        this.R = list;
        this.M = class035302;
        this.B = class035303;
    }
}

