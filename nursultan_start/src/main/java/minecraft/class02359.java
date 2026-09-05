/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class02484
 *  minecraft.class02706
 *  minecraft.class02826
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class00453;
import minecraft.class02484;
import minecraft.class02706;
import minecraft.class02826;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07439;

public class class02359
extends class00453 {
    public static final MapCodec<class02359> N = RecordCodecBuilder.mapCodec(instance -> class02359.N(instance).and(instance.group((App)class02826.N((Codec)Codec.string((int)0, (int)32)).optionalFieldOf("title").forGetter(class023592 -> class023592.L), (App)Codec.STRING.optionalFieldOf("author").forGetter(class023592 -> class023592.y), (App)class06338.N((int)0, (int)3).optionalFieldOf("generation").forGetter(class023592 -> class023592.u))).apply(instance, class02359::new));
    private final Optional<String> y;
    private final Optional<class02826<String>> L;
    private final Optional<Integer> u;

    public class02359(List<class05957> list, Optional<class02826<String>> optional, Optional<String> optional2, Optional<Integer> optional3) {
        super(list);
        this.y = optional2;
        this.L = optional;
        this.u = optional3;
    }

    public class05959<class02359> N() {
        return class07439.H;
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(class02484.NL, (Object)class02706.N, this::N);
        return class065842;
    }

    private class02706 N(class02706 class027062) {
        return new class02706(this.L.orElseGet(() -> ((class02706)class027062).u()), this.y.orElseGet(() -> ((class02706)class027062).i()), this.u.orElseGet(() -> ((class02706)class027062).R()).intValue(), class027062.N(), class027062.M());
    }
}

