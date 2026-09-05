/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.datagen.client;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl$Entry;

@Environment(value=EnvType.CLIENT)
public record SoundTypeBuilderImpl$SoundType(List<SoundTypeBuilderImpl$Entry> sounds, boolean replace, Optional<String> subtitle) {
    public static final Codec<SoundTypeBuilderImpl$SoundType> CODEC = RecordCodecBuilder.create(instance -> instance.group((App)SoundTypeBuilderImpl$Entry.CODEC.listOf().fieldOf("sounds").forGetter(SoundTypeBuilderImpl$SoundType::sounds), (App)Codec.BOOL.optionalFieldOf("replace", (Object)false).forGetter(SoundTypeBuilderImpl$SoundType::replace), (App)Codec.STRING.optionalFieldOf("subtitle").forGetter(SoundTypeBuilderImpl$SoundType::subtitle)).apply((Applicative)instance, SoundTypeBuilderImpl$SoundType::new));
}

