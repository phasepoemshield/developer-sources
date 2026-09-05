/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02968
 */
package net.caffeinemc.mods.sodium.client.checks;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class02968;

public record SodiumResourcePackMetadata(List<String> ignoredShaders) {
    public static final Codec<SodiumResourcePackMetadata> CODEC = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.listOf().fieldOf("ignored_shaders").forGetter(SodiumResourcePackMetadata::ignoredShaders)).apply((Applicative)instance, SodiumResourcePackMetadata::new));
    public static final class02968<SodiumResourcePackMetadata> SERIALIZER = new class02968("sodium", CODEC);
}

