/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class03748
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class06984
 *  minecraft.class07049
 *  minecraft.class07439
 *  minecraft.class07491
 *  minecraft.class07701
 *  minecraft.class08152
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class03748;
import minecraft.class04675;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class06984;
import minecraft.class07049;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class07701;
import minecraft.class08152;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04646
extends class00453 {
    private static final Logger y = LogUtils.getLogger();
    public static final MapCodec<class04646> N = RecordCodecBuilder.mapCodec(instance -> class04646.N(instance).and(instance.group((App)class03748.N.optionalFieldOf("name").forGetter(class046462 -> class046462.L), (App)class05919.field_45792.optionalFieldOf("entity").forGetter(class046462 -> class046462.u), (App)class04675.field_50212.optionalFieldOf("target", (Object)class04675.field_50210).forGetter(class046462 -> class046462.i))).apply(instance, class04646::new));
    private final Optional<class00392> L;
    private final Optional<class05919> u;
    private final class04675 i;

    private class04646(List<class05957> list, Optional<class00392> optional, Optional<class05919> optional2, class04675 class046752) {
        super(list);
        this.L = optional;
        this.u = optional2;
        this.i = class046752;
    }

    public Set<class07491<?>> y() {
        return this.u.map(class059192 -> Set.of(class059192.N())).orElse(Set.of());
    }

    private static /* synthetic */ class00392 N(class07701 class077012, class07049 class070492, class00392 class003922) {
        try {
            return class00390.N((class07701)class077012, (class00392)class003922, (class07049)class070492, (int)0);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            y.warn("Failed to resolve text component", (Throwable)commandSyntaxException);
            return class003922;
        }
    }

    public class05959<class04646> N() {
        return class07439.s;
    }

    public static class00471<?> N(class00392 class003922, class04675 class046752, class05919 class059192) {
        return class04646.N((T list) -> new class04646((List<class05957>)list, Optional.of(class003922), Optional.of(class059192), class046752));
    }

    public static class00471<?> N(class00392 class003922, class04675 class046752) {
        return class04646.N((T list) -> new class04646((List<class05957>)list, Optional.of(class003922), Optional.empty(), class046752));
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        this.L.ifPresent(class003922 -> class065842.N(this.i.N(), (Object)((class00392)class04646.N(class059082, this.u.orElse(null)).apply((class00392)class003922))));
        return class065842;
    }

    public static UnaryOperator<class00392> N(class05908 class059082, @Nullable class05919 class059192) {
        class07049 class070492;
        if (class059192 != null && (class070492 = (class07049)class059082.L(class059192.N())) != null) {
            return arg_0 -> class04646.N(class070492.method_5671(class059082.u()).N((class08152)class06984.L), class070492, arg_0);
        }
        return class003922 -> class003922;
    }
}

