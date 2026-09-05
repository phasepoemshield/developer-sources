/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class06338
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import minecraft.class04550;
import minecraft.class04564;
import minecraft.class04567;
import minecraft.class04569;
import minecraft.class04571;
import minecraft.class04573;
import minecraft.class06338;
import org.apache.commons.lang3.mutable.MutableObject;

public interface class04562<C, I extends class04573<C>>
extends class04573<C> {
    public static <C, I extends class04573<C>> class04562<C, I> N(float f) {
        return new class04550(f);
    }

    public static <C, I extends class04573<C>> Codec<class04562<C, I>> N(Codec<I> codec) {
        MutableObject mutableObject = new MutableObject();
        Codec codec2 = RecordCodecBuilder.create(instance -> instance.group((App)Codec.FLOAT.fieldOf("location").forGetter(class04569::N), (App)Codec.lazyInitialized((Supplier)mutableObject).fieldOf("value").forGetter(class04569::y), (App)Codec.FLOAT.fieldOf("derivative").forGetter(class04569::L)).apply((Applicative)instance, (f, class045622, f2) -> new class04569((float)f, class045622, (float)f2)));
        Codec codec3 = RecordCodecBuilder.create(instance -> instance.group((App)codec.fieldOf("coordinate").forGetter(class04564::u), (App)class06338.y((Codec)codec2.listOf()).fieldOf("points").forGetter(class045642 -> IntStream.range(0, class045642.i().length).mapToObj(n -> new class04569(class045642.i()[n], class045642.R().get(n), class045642.M()[n])).toList())).apply((Applicative)instance, (class045732, list) -> {
            float[] fArray = new float[list.size()];
            ImmutableList.Builder builder = ImmutableList.builder();
            float[] fArray2 = new float[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                class04569 class045692 = (class04569)((Object)((Object)((Object)list.get(i))));
                fArray[i] = class045692.N();
                builder.add(class045692.y());
                fArray2[i] = class045692.L();
            }
            return class04564.N(class045732, fArray, builder.build(), fArray2);
        }));
        mutableObject.setValue((Object)Codec.either((Codec)Codec.FLOAT, (Codec)codec3).xmap(either -> (class04562)either.map(class04550::new, class045642 -> class045642), class045622 -> class045622 instanceof class04550 ? Either.left((Object)Float.valueOf(((class04550)class045622).u())) : Either.right((Object)((class04564)class045622))));
        return (Codec)mutableObject.get();
    }

    public class04562<C, I> N_48(class04567<I> var1);

    public String N();

    public static <C, I extends class04573<C>> class04571<C, I> N(I i) {
        return new class04571(i);
    }

    public static <C, I extends class04573<C>> class04571<C, I> N(I i, class04573<Float> class045732) {
        return new class04571(i, class045732);
    }
}

