/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10412
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03556
 *  minecraft.class03942
 *  minecraft.class04480
 *  minecraft.class04489
 *  minecraft.class05074
 *  minecraft.class05537
 *  minecraft.class05561
 *  minecraft.class05566
 *  minecraft.class05576
 *  minecraft.class05908
 *  minecraft.class05946
 *  minecraft.class05950
 *  minecraft.class05957
 *  minecraft.class06584
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10412;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class03328;
import minecraft.class03331;
import minecraft.class03366;
import minecraft.class03556;
import minecraft.class03942;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class05074;
import minecraft.class05537;
import minecraft.class05561;
import minecraft.class05566;
import minecraft.class05576;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class05950;
import minecraft.class05957;
import minecraft.class06584;
import minecraft.class08122;

public class class03367
extends class03328 {
    public static final MapCodec<class03367> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.either((Codec)class05074.N, (Codec)class05074.u).fieldOf("value").forGetter(class033672 -> class033672.E)).and(class03367.y(instance)).apply(instance, class03367::new));
    public static final class04489 u = new class03331();
    private final Either<class05946<class05074>, class05074> E;

    private class03367(Either<class05946<class05074>, class05074> either, int n, int n2, List<class05957> list, List<class08122> list2) {
        super(n, n2, list, list2);
        this.E = either;
    }

    @Override
    public void N(class05561 class055612) {
        Optional optional = this.E.left();
        if (optional.isPresent()) {
            class05946 class059463 = (class05946)optional.get();
            if (!class055612.y()) {
                class055612.N((class04480)new class05566(class059463));
                return;
            }
            if (class055612.N(class059463)) {
                class055612.N((class04480)new class05537(class059463));
                return;
            }
        }
        super.N(class055612);
        this.E.ifLeft(class059462 -> class055612.N().u(class059462).ifPresentOrElse(class035292 -> ((class05074)class035292.N()).N(class055612.N((class04489)new class10412(class059462), class059462)), () -> class055612.N((class04480)new class05576(class059462)))).ifRight(class050742 -> class050742.N(class055612.N(u)));
    }

    public class05950 N() {
        return class03942.u;
    }

    public static class03366<?> N(class05946<class05074> class059462) {
        return class03367.N((n, n2, list, list2) -> new class03367((Either<class05946<class05074>, class05074>)Either.left((Object)class059462), n, n2, list, list2));
    }

    public static class03366<?> N(class05074 class050742) {
        return class03367.N((n, n2, list, list2) -> new class03367((Either<class05946<class05074>, class05074>)Either.right((Object)class050742), n, n2, list, list2));
    }

    @Override
    public void N(Consumer<class06584> consumer, class05908 class059082) {
        ((class05074)this.E.map(class059462 -> (class05074)class059082.N().u(class059462).map(class03556::N).orElse(class05074.R), class050742 -> class050742)).N(class059082, consumer);
    }
}

