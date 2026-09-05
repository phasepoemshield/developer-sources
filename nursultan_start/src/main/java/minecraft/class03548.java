/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P4
 *  com.mojang.datafixers.Products$P5
 *  com.mojang.datafixers.Products$P9
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class00753
 *  minecraft.class00780
 *  minecraft.class02045
 *  minecraft.class04227
 *  minecraft.class07321
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class00780;
import minecraft.class02045;
import minecraft.class03532;
import minecraft.class03538;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03549;
import minecraft.class03555;
import minecraft.class04227;
import minecraft.class07321;

public class class03548
extends class03532 {
    public static final MapCodec<class03548> N = RecordCodecBuilder.mapCodec(instance -> class03548.y(instance).apply(instance, class03548::new));
    private final int L;
    private final int u;
    private final int i;
    private final class03543<class00780> R;

    public int L() {
        return this.i;
    }

    public class03548(int n, int n2, int n3, class03543<class00780> class035432) {
        this(class00753.field_11176, class03555.field_37782, 1.0f, 0, Optional.empty(), n, n2, n3, class035432);
    }

    public class03548(class00753 class007532, class03555 class035552, float f, int n, Optional<class03538> optional, int n2, int n3, int n4, class03543<class00780> class035432) {
        super(class007532, class035552, f, n, optional);
        this.L = n2;
        this.u = n3;
        this.i = n4;
        this.R = class035432;
    }

    @Override
    public class03549<?> i() {
        return class03549.y;
    }

    public class03543<class00780> u() {
        return this.R;
    }

    public int y() {
        return this.u;
    }

    private static Products.P9<RecordCodecBuilder.Mu<class03548>, class00753, class03555, Float, Integer, Optional<class03538>, Integer, Integer, Integer, class03543<class00780>> y(RecordCodecBuilder.Instance<class03548> instance) {
        Products.P5<RecordCodecBuilder.Mu<class03548>, class00753, class03555, Float, Integer, Optional<class03538>> p5 = class03548.N(instance);
        Products.P4 p4 = instance.group((App)Codec.intRange((int)0, (int)1023).fieldOf("distance").forGetter(class03548::N), (App)Codec.intRange((int)0, (int)1023).fieldOf("spread").forGetter(class03548::y), (App)Codec.intRange((int)1, (int)4095).fieldOf("count").forGetter(class03548::L), (App)class03541.N(class04227.NA).fieldOf("preferred_biomes").forGetter(class03548::u));
        return new Products.P9(p5.t1(), p5.t2(), p5.t3(), p5.t4(), p5.t5(), p4.t1(), p4.t2(), p4.t3(), p4.t4());
    }

    public int N() {
        return this.L;
    }

    @Override
    protected boolean N(class02045 class020452, int n, int n2) {
        List list = class020452.N(this);
        if (list == null) {
            return false;
        }
        return list.contains(new class07321(n, n2));
    }
}

