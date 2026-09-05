/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00392
 *  minecraft.class00453
 *  minecraft.class02484
 *  minecraft.class02489
 *  minecraft.class02848
 *  minecraft.class03748
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07491
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class00453;
import minecraft.class02484;
import minecraft.class02489;
import minecraft.class02848;
import minecraft.class03748;
import minecraft.class04646;
import minecraft.class04686;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public class class04668
extends class00453 {
    public static final MapCodec<class04668> N = RecordCodecBuilder.mapCodec(instance -> class04668.N(instance).and(instance.group((App)class03748.N.sizeLimitedListOf(256).fieldOf("lore").forGetter(class046682 -> class046682.y), (App)class02489.N((int)256).forGetter(class046682 -> class046682.L), (App)class05919.field_45792.optionalFieldOf("entity").forGetter(class046682 -> class046682.u))).apply(instance, class04668::new));
    private final List<class00392> y;
    private final class02489 L;
    private final Optional<class05919> u;

    public static class04686 L() {
        return new class04686();
    }

    public class04668(List<class05957> list, List<class00392> list2, class02489 class024892, Optional<class05919> optional) {
        super(list);
        this.y = List.copyOf(list2);
        this.L = class024892;
        this.u = optional;
    }

    public Set<class07491<?>> y() {
        return this.u.map(class059192 -> Set.of(class059192.N())).orElseGet(Set::of);
    }

    public class05959<class04668> N() {
        return class07439.k;
    }

    private List<class00392> N(@Nullable class02848 class028482, class05908 class059082) {
        if (class028482 == null && this.y.isEmpty()) {
            return List.of();
        }
        UnaryOperator<class00392> unaryOperator = class04646.N(class059082, this.u.orElse(null));
        List list = this.y.stream().map(unaryOperator).toList();
        return this.L.N(class028482.N(), list, 256);
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(class02484.W, (Object)class02848.N, class028482 -> new class02848(this.N((class02848)class028482, class059082)));
        return class065842;
    }
}

