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
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class06834;
import minecraft.class06838;
import minecraft.class06848;

public abstract class class06822
implements class06834 {
    protected final List<class06834> N;
    private final Function<class05908, class06838> y;

    public class06822(List<class06834> list) {
        this.N = list;
        this.y = class06848.N(list);
    }

    protected static <T extends class06822> Codec<T> y(Function<List<class06834>, T> function) {
        return class06848.y.listOf().xmap(function, class068222 -> class068222.N);
    }

    @Override
    public class06838 N(class05908 class059082) {
        return this.y.apply(class059082);
    }

    public void N(class05561 class055612) {
        class06834.super.N(class055612);
        for (int i = 0; i < this.N.size(); ++i) {
            this.N.get(i).N(class055612.N((class04489)new class10416("terms", i)));
        }
    }

    protected static <T extends class06822> MapCodec<T> N(Function<List<class06834>, T> function) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06848.y.listOf().fieldOf("terms").forGetter(class068222 -> class068222.N)).apply((Applicative)instance, function));
    }

    public abstract MapCodec<? extends class06822> N();
}

