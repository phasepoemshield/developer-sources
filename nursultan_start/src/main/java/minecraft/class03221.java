/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Iterator;
import java.util.List;
import minecraft.class03197;
import minecraft.class03200;
import minecraft.class03229;
import minecraft.class03231;
import minecraft.class03235;
import minecraft.class06338;

public class class03221<T> {
    private final List<Pair<class03229, T>> N;
    private final class03197<T> y;

    public T L(class03231 class032312) {
        return this.N(class032312, class03235::N);
    }

    public class03221(List<Pair<class03229, T>> list) {
        this.N = list;
        this.y = class03197.N(list);
    }

    public T y(class03231 class032312) {
        Iterator<Pair<class03229, T>> iterator = this.N().iterator();
        Pair<class03229, T> pair = iterator.next();
        long l = ((class03229)((Object)pair.getFirst())).N(class032312);
        Object object = pair.getSecond();
        while (iterator.hasNext()) {
            Pair<class03229, T> pair2 = iterator.next();
            long l2 = ((class03229)((Object)pair2.getFirst())).N(class032312);
            if (l2 >= l) continue;
            l = l2;
            object = pair2.getSecond();
        }
        return (T)object;
    }

    protected T N(class03231 class032312, class03200<T> class032002) {
        return this.y.N(class032312, class032002);
    }

    public static <T> Codec<class03221<T>> N(MapCodec<T> mapCodec) {
        return class06338.y((Codec)RecordCodecBuilder.create(instance -> instance.group((App)class03229.N.fieldOf("parameters").forGetter(Pair::getFirst), (App)mapCodec.forGetter(Pair::getSecond)).apply((Applicative)instance, Pair::of)).listOf()).xmap(class03221::new, class03221::N);
    }

    public T N(class03231 class032312) {
        return this.L(class032312);
    }

    public List<Pair<class03229, T>> N() {
        return this.N;
    }
}

