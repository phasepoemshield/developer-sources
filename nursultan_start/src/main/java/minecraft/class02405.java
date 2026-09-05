/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01034
 *  minecraft.class04297
 *  minecraft.class04323
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class04297;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07830;

public class class02405
extends class04297 {
    public static final MapCodec<class02405> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07830.field_24772.fieldOf("heightmap").forGetter(class024052 -> class024052.L)).apply(instance, class02405::new));
    private final class07830 L;

    private class02405(class07830 class078302) {
        this.L = class078302;
    }

    public class04323<?> N() {
        return class04323.U;
    }

    public static class02405 N(class07830 class078302) {
        return new class02405(class078302);
    }

    public Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072092) {
        int n;
        int n2 = class072092.method_10263();
        int n3 = class010342.N(this.L, n2, n = class072092.method_10260());
        if (n3 > class010342.N()) {
            return Stream.of(new class07209(n2, n3, n));
        }
        return Stream.of(new class07209[0]);
    }
}

