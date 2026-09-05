/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01034
 *  minecraft.class01708
 *  minecraft.class03854
 *  minecraft.class03855
 *  minecraft.class06055
 *  minecraft.class06057
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class01708;
import minecraft.class03854;
import minecraft.class03855;
import minecraft.class04297;
import minecraft.class04323;
import minecraft.class06055;
import minecraft.class06057;
import minecraft.class06069;
import minecraft.class07209;

public class class04308
extends class04297 {
    public static final MapCodec<class04308> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03855.L.fieldOf("height").forGetter(class043082 -> class043082.L)).apply(instance, class04308::new));
    private final class03855 L;

    private class04308(class03855 class038552) {
        this.L = class038552;
    }

    public static class04308 y(class06055 class060552, class06055 class060553) {
        return class04308.N((class03855)class01708.N((class06055)class060552, (class06055)class060553));
    }

    @Override
    public Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072092) {
        return Stream.of(class072092.method_33096(this.L.N(class060692, (class06057)class010342)));
    }

    @Override
    public class04323<?> N() {
        return class04323.E;
    }

    public static class04308 N(class03855 class038552) {
        return new class04308(class038552);
    }

    public static class04308 N(class06055 class060552, class06055 class060553) {
        return class04308.N((class03855)class03854.N((class06055)class060552, (class06055)class060553));
    }
}

