/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00607
 *  minecraft.class00608
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class07576
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.LongSupplier;
import minecraft.class00607;
import minecraft.class00608;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class07576;
import minecraft.class07595;
import minecraft.class07605;

public class class07587 {
    public static final Codec<class03556<class07587>> N = class03539.N((class05946)class04227.yG);
    private static final Codec<Map<class00607<?>, class07605<?, ?>>> u = Codec.dispatchedMap((Codec)class00608.f, (Function)class07536.y_4(class07605::N));
    public static final Codec<class07587> y = RecordCodecBuilder.create(instance -> instance.group((App)class06338.b.optionalFieldOf("period_ticks").forGetter(class075872 -> class075872.i), (App)u.optionalFieldOf("tracks", Map.of()).forGetter(class075872 -> class075872.R)).apply(instance, class07587::new)).validate(class07587::y);
    public static final Codec<class07587> L = y.xmap(class07587::N, class07587::N);
    private final Optional<Integer> i;
    private final Map<class00607<?>, class07605<?, ?>> R;

    public Set<class00607<?>> L() {
        return this.R.keySet();
    }

    class07587(Optional<Integer> optional, Map<class00607<?>, class07605<?, ?>> map) {
        this.i = optional;
        this.R = map;
    }

    private static DataResult<class07587> y(class07587 class075873) {
        if (class075873.i.isEmpty()) {
            return DataResult.success((Object)class075873);
        }
        int n = class075873.i.get();
        DataResult dataResult = DataResult.success((Object)class075873);
        for (class07605<?, ?> class076053 : class075873.R.values()) {
            dataResult = dataResult.apply2stable((class075872, class076052) -> class075872, class07605.N(class076053, n));
        }
        return dataResult;
    }

    public Optional<Integer> y() {
        return this.i;
    }

    public long y(class07299 class072992) {
        return class072992.method_8532();
    }

    private static class07587 N(class07587 class075872) {
        Map<class00607<?>, class07605<?, ?>> map = Map.copyOf(Maps.filterKeys(class075872.R, class00607::u));
        return new class07587(class075872.i, map);
    }

    public long N(class07299 class072992) {
        long l = this.y(class072992);
        if (this.i.isEmpty()) {
            return l;
        }
        return l % (long)this.i.get().intValue();
    }

    public static class07595 N() {
        return new class07595();
    }

    public <Value> class07576<Value, ?> N(class00607<Value> class006072, LongSupplier longSupplier) {
        class07605<?, ?> class076052 = this.R.get(class006072);
        if (class076052 == null) {
            throw new IllegalStateException("Timeline has no track for " + String.valueOf(class006072));
        }
        return class076052.N(class006072, this.i, longSupplier);
    }
}

