/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01034
 *  minecraft.class04323
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01034;
import minecraft.class04025;
import minecraft.class04050;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class07209;

public class class04033
extends class04050 {
    public static final MapCodec<class04033> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04025.y.fieldOf("predicate").forGetter(class040332 -> class040332.L)).apply(instance, class04033::new));
    private final class04025 L;

    private class04033(class04025 class040252) {
        this.L = class040252;
    }

    @Override
    protected boolean y(class01034 class010342, class06069 class060692, class07209 class072092) {
        return this.L.test(class010342.y(), class072092);
    }

    public class04323<?> N() {
        return class04323.N;
    }

    public static class04033 N(class04025 class040252) {
        return new class04033(class040252);
    }
}

