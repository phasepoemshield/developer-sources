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
 *  minecraft.class02501
 *  minecraft.class02845
 *  minecraft.class04711
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06338
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00453;
import minecraft.class02484;
import minecraft.class02501;
import minecraft.class02845;
import minecraft.class04711;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06338;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07491;

public class class02937
extends class00453 {
    private static final Codec<class06378> y = Codec.withAlternative((Codec)class06339.N, (Codec)class06338.E, class04711::new);
    public static final MapCodec<class02937> N = RecordCodecBuilder.mapCodec(instance -> class02937.N(instance).and(instance.group((App)class02501.N((Codec)class06339.N, (int)Integer.MAX_VALUE).optionalFieldOf("floats").forGetter(class029372 -> class029372.L), (App)class02501.N((Codec)Codec.BOOL, (int)Integer.MAX_VALUE).optionalFieldOf("flags").forGetter(class029372 -> class029372.u), (App)class02501.N((Codec)Codec.STRING, (int)Integer.MAX_VALUE).optionalFieldOf("strings").forGetter(class029372 -> class029372.i), (App)class02501.N(y, (int)Integer.MAX_VALUE).optionalFieldOf("colors").forGetter(class029372 -> class029372.R))).apply(instance, class02937::new));
    private final Optional<class02501<class06378>> L;
    private final Optional<class02501<Boolean>> u;
    private final Optional<class02501<String>> i;
    private final Optional<class02501<class06378>> R;

    public class02937(List<class05957> list, Optional<class02501<class06378>> optional, Optional<class02501<Boolean>> optional2, Optional<class02501<String>> optional3, Optional<class02501<class06378>> optional4) {
        super(list);
        this.L = optional;
        this.u = optional2;
        this.i = optional3;
        this.R = optional4;
    }

    public Set<class07491<?>> y() {
        return Stream.concat(this.L.stream(), this.R.stream()).flatMap(class025012 -> class025012.N().stream()).flatMap(class063782 -> class063782.y().stream()).collect(Collectors.toSet());
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class02845 class028452 = (class02845)class065842.a_(class02484.j, (Object)class02845.N);
        class065842.N(class02484.j, (Object)new class02845(class02937.N(this.L, class028452.N(), (T class063782) -> Float.valueOf(class063782.y(class059082))), class02937.N(this.u, class028452.y()), class02937.N(this.i, class028452.L()), class02937.N(this.R, class028452.u(), (T class063782) -> class063782.N(class059082))));
        return class065842;
    }

    private static <T, E> List<E> N(Optional<class02501<T>> optional, List<E> list, Function<T, E> function) {
        return optional.map(class025012 -> {
            List list2 = class025012.N().stream().map(function).toList();
            return class025012.y().N(list, list2);
        }).orElse(list);
    }

    private static <T> List<T> N(Optional<class02501<T>> optional, List<T> list) {
        return optional.map(class025012 -> class025012.N(list)).orElse(list);
    }

    public class05959<class02937> N() {
        return class07439.F;
    }
}

