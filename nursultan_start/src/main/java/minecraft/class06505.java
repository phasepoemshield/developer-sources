/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 */
package minecraft;

import Nursultan.class10416;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;

public abstract class class06505
implements class05957 {
    protected final List<class05957> N;
    private final Predicate<class05908> i;

    public class06505(List<class05957> list, Predicate<class05908> predicate) {
        this.N = list;
        this.i = predicate;
    }

    protected static <T extends class06505> Codec<T> y(Function<List<class05957>, T> function) {
        return class05957.L.listOf().xmap(function, class065052 -> class065052.N);
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        for (int i = 0; i < this.N.size(); ++i) {
            this.N.get(i).N(class055612.N((class04489)new class10416("terms", i)));
        }
    }

    protected static <T extends class06505> MapCodec<T> N(Function<List<class05957>, T> function) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05957.L.listOf().fieldOf("terms").forGetter(class065052 -> class065052.N)).apply((Applicative)instance, function));
    }

    public final boolean test(class05908 class059082) {
        return this.i.test(class059082);
    }
}

