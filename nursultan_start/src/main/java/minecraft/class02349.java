/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06338
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class07304
 *  minecraft.class07323
 *  minecraft.class07439
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class01894;
import minecraft.class02317;
import minecraft.class02320;
import minecraft.class02330;
import minecraft.class02339;
import minecraft.class02351;
import minecraft.class03556;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06338;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class07304;
import minecraft.class07323;
import minecraft.class07439;
import minecraft.class07491;

public class class02349
extends class00453 {
    private static final Map<class01894, class02320> y = Stream.of(class02330.N, class02317.L, class02351.y).collect(Collectors.toMap(class02320::N, Function.identity()));
    private static final Codec<class02320> L = class01894.N.comapFlatMap(class018942 -> {
        class02320 class023202 = y.get(class018942);
        if (class023202 != null) {
            return DataResult.success((Object)((Object)class023202));
        }
        return DataResult.error(() -> "No formula type with id: '" + String.valueOf(class018942) + "'");
    }, class02320::N);
    private static final MapCodec<class02339> u = class06338.N((String)"formula", (String)"parameters", L, class02339::N, class02320::y);
    public static final MapCodec<class02349> N = RecordCodecBuilder.mapCodec(instance -> class02349.N(instance).and(instance.group((App)class07304.L.fieldOf("enchantment").forGetter(class023492 -> class023492.i), (App)u.forGetter(class023492 -> class023492.R))).apply(instance, class02349::new));
    private final class03556<class07304> i;
    private final class02339 R;

    private class02349(List<class05957> list, class03556<class07304> class035562, class02339 class023392) {
        super(list);
        this.i = class035562;
        this.R = class023392;
    }

    public static class00471<?> y(class03556<class07304> class035562) {
        return class02349.N((T list) -> new class02349((List<class05957>)list, class035562, new class02351(1)));
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.U);
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class06584 class065843 = (class06584)class059082.L(class06551.U);
        if (class065843 != null) {
            int n = class07323.N(this.i, (class06584)class065843);
            int n2 = this.R.N(class059082.y(), class065842.c(), n);
            class065842.i(n2);
        }
        return class065842;
    }

    public static class00471<?> N(class03556<class07304> class035562, float f, int n) {
        return class02349.N((T list) -> new class02349((List<class05957>)list, class035562, new class02330(n, f)));
    }

    public static class00471<?> N(class03556<class07304> class035562, int n) {
        return class02349.N((T list) -> new class02349((List<class05957>)list, class035562, new class02351(n)));
    }

    public class05959<class02349> N() {
        return class07439.l;
    }

    public static class00471<?> N(class03556<class07304> class035562) {
        return class02349.N((T list) -> new class02349((List<class05957>)list, class035562, class02317.N));
    }
}

