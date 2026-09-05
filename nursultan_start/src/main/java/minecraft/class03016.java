/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01034
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class04297
 *  minecraft.class04323
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class04297;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class07209;

public class class03016
extends class04297 {
    public static final MapCodec<class03016> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02142.N((int)-16, (int)16).fieldOf("xz_spread").forGetter(class030162 -> class030162.L), (App)class02142.N((int)-16, (int)16).fieldOf("y_spread").forGetter(class030162 -> class030162.u)).apply(instance, class03016::new));
    private final class02142 L;
    private final class02142 u;

    private class03016(class02142 class021422, class02142 class021423) {
        this.L = class021422;
        this.u = class021423;
    }

    public static class03016 y(class02142 class021422) {
        return new class03016(class021422, (class02142)class02151.N((int)0));
    }

    public static class03016 N(class02142 class021422, class02142 class021423) {
        return new class03016(class021422, class021423);
    }

    public class04323<?> N() {
        return class04323.m;
    }

    public Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072092) {
        int n = class072092.method_10263() + this.L.N(class060692);
        int n2 = class072092.method_10264() + this.u.N(class060692);
        int n3 = class072092.method_10260() + this.L.N(class060692);
        return Stream.of(new class07209(n, n2, n3));
    }

    public static class03016 N(class02142 class021422) {
        return new class03016((class02142)class02151.N((int)0), class021422);
    }
}

