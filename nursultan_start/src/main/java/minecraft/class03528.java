/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00753
 *  minecraft.class02045
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class07321
 *  minecraft.class07836
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class02045;
import minecraft.class03532;
import minecraft.class03538;
import minecraft.class03549;
import minecraft.class03553;
import minecraft.class03555;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class07321;
import minecraft.class07836;

public class class03528
extends class03532 {
    public static final MapCodec<class03528> N = RecordCodecBuilder.mapCodec(instance -> class03528.N(instance).and(instance.group((App)Codec.intRange((int)0, (int)4096).fieldOf("spacing").forGetter(class03528::N), (App)Codec.intRange((int)0, (int)4096).fieldOf("separation").forGetter(class03528::y), (App)class03553.field_36423.optionalFieldOf("spread_type", (Object)class03553.field_36421).forGetter(class03528::L))).apply(instance, class03528::new)).validate(class03528::N);
    private final int L;
    private final int u;
    private final class03553 i;

    public class03553 L() {
        return this.i;
    }

    public class03528(class00753 class007532, class03555 class035552, float f, int n, Optional<class03538> optional, int n2, int n3, class03553 class035532) {
        super(class007532, class035552, f, n, optional);
        this.L = n2;
        this.u = n3;
        this.i = class035532;
    }

    public class03528(int n, int n2, class03553 class035532, int n3) {
        this(class00753.field_11176, class03555.field_37782, 1.0f, n3, Optional.empty(), n, n2, class035532);
    }

    @Override
    public class03549<?> i() {
        return class03549.N;
    }

    public int y() {
        return this.u;
    }

    private static DataResult<class03528> N(class03528 class035282) {
        if (class035282.L <= class035282.u) {
            return DataResult.error(() -> "Spacing has to be larger than separation");
        }
        return DataResult.success((Object)class035282);
    }

    @Override
    protected boolean N(class02045 class020452, int n, int n2) {
        class07321 class073212 = this.N(class020452.u(), n, n2);
        return class073212.B == n && class073212.Z == n2;
    }

    public class07321 N(long l, int n, int n2) {
        int n3 = Math.floorDiv(n, this.L);
        int n4 = Math.floorDiv(n2, this.L);
        class07836 class078362 = new class07836((class06069)new class06075(0L));
        class078362.N(l, n3, n4, this.Z());
        int n5 = this.L - this.u;
        int n6 = this.i.N((class06069)class078362, n5);
        int n7 = this.i.N((class06069)class078362, n5);
        return new class07321(n3 * this.L + n6, n4 * this.L + n7);
    }

    public int N() {
        return this.L;
    }
}

