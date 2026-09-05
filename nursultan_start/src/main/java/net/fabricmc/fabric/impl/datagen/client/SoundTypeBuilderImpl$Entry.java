/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$RegistrationType
 */
package net.fabricmc.fabric.impl.datagen.client;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;

@Environment(value=EnvType.CLIENT)
public record SoundTypeBuilderImpl$Entry(class01894 name, SoundTypeBuilder.RegistrationType type, float volume, float pitch, int weight, int attenuationDistance, boolean stream, boolean preload) {
    private static final Codec<SoundTypeBuilderImpl$Entry> MAP_CODEC = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("name").forGetter(SoundTypeBuilderImpl$Entry::name), (App)SoundTypeBuilder.RegistrationType.CODEC.optionalFieldOf("type", (Object)SoundTypeBuilder.RegistrationType.FILE).forGetter(SoundTypeBuilderImpl$Entry::type), (App)Codec.floatRange((float)Float.MIN_VALUE, (float)1.0f).optionalFieldOf("volume", (Object)Float.valueOf(1.0f)).forGetter(SoundTypeBuilderImpl$Entry::volume), (App)Codec.floatRange((float)0.5f, (float)2.0f).optionalFieldOf("pitch", (Object)Float.valueOf(1.0f)).forGetter(SoundTypeBuilderImpl$Entry::pitch), (App)Codec.intRange((int)1, (int)Integer.MAX_VALUE).optionalFieldOf("weight", (Object)1).forGetter(SoundTypeBuilderImpl$Entry::weight), (App)Codec.INT.optionalFieldOf("attenuation_distance", (Object)16).forGetter(SoundTypeBuilderImpl$Entry::attenuationDistance), (App)Codec.BOOL.optionalFieldOf("stream", (Object)false).forGetter(SoundTypeBuilderImpl$Entry::stream), (App)Codec.BOOL.optionalFieldOf("preload", (Object)false).forGetter(SoundTypeBuilderImpl$Entry::preload)).apply((Applicative)instance, SoundTypeBuilderImpl$Entry::new));
    private static final Codec<SoundTypeBuilderImpl$Entry> STRING_CODEC = class01894.N.xmap(class018942 -> new SoundTypeBuilderImpl$Entry((class01894)class018942, SoundTypeBuilder.RegistrationType.FILE, 1.0f, 1.0f, 1, 16, false, false), SoundTypeBuilderImpl$Entry::name);
    static final Codec<SoundTypeBuilderImpl$Entry> CODEC = Codec.xor(STRING_CODEC, MAP_CODEC).xmap(Either::unwrap, soundTypeBuilderImpl$Entry -> {
        if (soundTypeBuilderImpl$Entry.type() != SoundTypeBuilder.RegistrationType.FILE || soundTypeBuilderImpl$Entry.volume() != 1.0f || soundTypeBuilderImpl$Entry.pitch() != 1.0f || soundTypeBuilderImpl$Entry.weight() != 1 || soundTypeBuilderImpl$Entry.attenuationDistance() != 16 || soundTypeBuilderImpl$Entry.stream() || soundTypeBuilderImpl$Entry.preload()) {
            return Either.right((Object)soundTypeBuilderImpl$Entry);
        }
        return Either.left((Object)soundTypeBuilderImpl$Entry);
    });
}

