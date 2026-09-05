/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class05946
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$EntryBuilder
 *  net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$RegistrationType
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.include.com.google.common.base.Preconditions
 */
package net.fabricmc.fabric.impl.datagen.client;

import java.util.Objects;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class05946;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl$Entry;
import org.jspecify.annotations.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;

@Environment(value=EnvType.CLIENT)
public final class SoundTypeBuilderImpl$EntryBuilderImpl
implements SoundTypeBuilder.EntryBuilder {
    private final class01894 id;
    private final SoundTypeBuilder.RegistrationType type;
    private float volume = 1.0f;
    private float pitch = 1.0f;
    private int attenuationDistance = 16;
    private int weight = 1;
    private boolean stream = false;
    private boolean preload = false;

    public static SoundTypeBuilder.EntryBuilder create(SoundTypeBuilder.RegistrationType registrationType, class01894 class018942) {
        return new SoundTypeBuilderImpl$EntryBuilderImpl(registrationType, class018942);
    }

    public SoundTypeBuilder.EntryBuilder weight(int n) {
        Preconditions.checkArgument((n >= 1 ? 1 : 0) != 0, (Object)"Sound must have a weight of at least 1.");
        this.weight = n;
        return this;
    }

    private SoundTypeBuilderImpl$EntryBuilderImpl(SoundTypeBuilder.RegistrationType registrationType, class01894 class018942) {
        this.type = registrationType;
        this.id = class018942;
    }

    public SoundTypeBuilder.EntryBuilder stream(boolean bl) {
        this.stream = bl;
        return this;
    }

    public SoundTypeBuilderImpl$Entry build(@Nullable String string) {
        return new SoundTypeBuilderImpl$Entry(this.id.M(string == null ? "" : string), this.type, this.volume, this.pitch, this.weight, this.attenuationDistance, this.stream, this.preload);
    }

    public static SoundTypeBuilder.EntryBuilder ofFile(class01894 class018942) {
        Objects.requireNonNull(class018942, "Sound file/event id must not be null.");
        if (class018942.N().indexOf(46) != -1) {
            SoundTypeBuilderImpl.LOGGER.warn("Sound file \"" + String.valueOf(class018942) + "\" should not have a file extension and may result in the sound event not playing.");
        }
        return SoundTypeBuilderImpl$EntryBuilderImpl.create(SoundTypeBuilder.RegistrationType.FILE, class018942);
    }

    public SoundTypeBuilder.EntryBuilder volume(float f) {
        Preconditions.checkArgument((f > 0.0f && f <= 1.0f ? 1 : 0) != 0, (Object)"Sound volume must be greater than 0 and less than or equal to 1.");
        this.volume = f;
        return this;
    }

    public SoundTypeBuilder.EntryBuilder pitch(float f) {
        Preconditions.checkArgument((f >= 0.5f && f <= 2.0f ? 1 : 0) != 0, (Object)"Sound pitch must be between 0.5 and 2 (inclusive)");
        this.pitch = f;
        return this;
    }

    public SoundTypeBuilder.EntryBuilder attenuationDistance(int n) {
        this.attenuationDistance = n;
        return this;
    }

    public static SoundTypeBuilder.EntryBuilder ofEvent(class03556<class04891> class035562) {
        Objects.requireNonNull(class035562, "Sound event key must not be null.");
        return SoundTypeBuilderImpl$EntryBuilderImpl.create(SoundTypeBuilder.RegistrationType.SOUND_EVENT, ((class05946)class035562.i().orElseThrow(() -> new IllegalArgumentException("Direct (non-registered) sound event cannot be added"))).N());
    }

    public static SoundTypeBuilder.EntryBuilder ofEvent(class04891 class048912) {
        Objects.requireNonNull(class048912, "Sound event must not be null.");
        return SoundTypeBuilderImpl$EntryBuilderImpl.create(SoundTypeBuilder.RegistrationType.SOUND_EVENT, class048912.N());
    }

    public SoundTypeBuilder.EntryBuilder preload(boolean bl) {
        this.preload = bl;
        return this;
    }
}

