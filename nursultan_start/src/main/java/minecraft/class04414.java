/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02968
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class02968;
import minecraft.class04421;

public class class04414 {
    private static final Codec<class04414> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.list(class04421.N).fieldOf("block").forGetter(class044142 -> class044142.L)).apply(instance, class04414::new));
    public static final class02968<class04414> N = new class02968("filter", y);
    private final List<class04421> L;

    public class04414(List<class04421> list) {
        this.L = List.copyOf(list);
    }

    public boolean y(String string) {
        return this.L.stream().anyMatch(class044212 -> class044212.y().test(string));
    }

    public boolean N(String string) {
        return this.L.stream().anyMatch(class044212 -> class044212.N().test(string));
    }
}

