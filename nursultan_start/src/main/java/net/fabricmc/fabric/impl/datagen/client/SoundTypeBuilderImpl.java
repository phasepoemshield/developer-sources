/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04206
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder
 *  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$EntryBuilder
 *  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$RegistrationType
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.include.com.google.common.base.Preconditions
 */
package net.fabricmc.fabric.impl.datagen.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class04206;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl$Entry;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl$EntryBuilderImpl;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl$SoundType;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.include.com.google.common.base.Preconditions;

@Environment(value=EnvType.CLIENT)
public final class SoundTypeBuilderImpl
implements SoundTypeBuilder {
    static final Logger LOGGER = LoggerFactory.getLogger(SoundTypeBuilderImpl.class);
    private boolean replace = false;
    private @Nullable String subtitle;
    private final List<SoundTypeBuilderImpl$Entry> sounds = new ArrayList<SoundTypeBuilderImpl$Entry>();

    public SoundTypeBuilder replace(boolean bl) {
        this.replace = bl;
        return this;
    }

    public SoundTypeBuilderImpl$SoundType build() {
        Preconditions.checkState((!this.sounds.isEmpty() ? 1 : 0) != 0, (Object)"Sound definition must have at least one sound file");
        for (SoundTypeBuilderImpl$Entry soundTypeBuilderImpl$Entry : this.sounds) {
            if (soundTypeBuilderImpl$Entry.type() != SoundTypeBuilder.RegistrationType.SOUND_EVENT) continue;
            class04206.y.y(soundTypeBuilderImpl$Entry.name()).orElseThrow(() -> new IllegalStateException("Referenced sound event " + String.valueOf(soundTypeBuilderImpl$Entry.name()) + " does not exist"));
        }
        return new SoundTypeBuilderImpl$SoundType(this.sounds, this.replace, Optional.ofNullable(this.subtitle));
    }

    public SoundTypeBuilder subtitle(@Nullable String string) {
        this.subtitle = string;
        return this;
    }

    public SoundTypeBuilder sound(SoundTypeBuilder.EntryBuilder entryBuilder) {
        Objects.requireNonNull(entryBuilder, "Sound must not be null.");
        this.sounds.add(((SoundTypeBuilderImpl$EntryBuilderImpl)entryBuilder).build(""));
        return this;
    }

    public SoundTypeBuilder sound(SoundTypeBuilder.EntryBuilder entryBuilder, int n) {
        Objects.requireNonNull(entryBuilder, "Sound must not be null.");
        Preconditions.checkArgument((n > 0 ? 1 : 0) != 0, (Object)"Count must be greater than zero.");
        for (int i = 1; i <= n; ++i) {
            this.sounds.add(((SoundTypeBuilderImpl$EntryBuilderImpl)entryBuilder).build(Integer.toString(i)));
        }
        return this;
    }
}

