/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04891
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl$EntryBuilderImpl
 */
package net.fabricmc.fabric.api.client.datagen.v1.builder;

import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04891;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$RegistrationType;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl;

@Environment(value=EnvType.CLIENT)
public interface SoundTypeBuilder$EntryBuilder {
    public static final float DEFAULT_VOLUME = 1.0f;
    public static final float DEFAULT_PITCH = 1.0f;
    public static final int DEFAULT_WEIGHT = 1;
    public static final int DEFAULT_ATTENUATION_DISTANCE = 16;

    public static SoundTypeBuilder$EntryBuilder create(SoundTypeBuilder.RegistrationType registrationType, class01894 class018942) {
        return SoundTypeBuilderImpl.EntryBuilderImpl.create((SoundTypeBuilder.RegistrationType)registrationType, (class01894)class018942);
    }

    public SoundTypeBuilder$EntryBuilder weight(int var1);

    public SoundTypeBuilder$EntryBuilder stream(boolean var1);

    public static SoundTypeBuilder$EntryBuilder ofFile(class01894 class018942) {
        return SoundTypeBuilderImpl.EntryBuilderImpl.ofFile((class01894)class018942);
    }

    public SoundTypeBuilder$EntryBuilder volume(float var1);

    public SoundTypeBuilder$EntryBuilder pitch(float var1);

    public SoundTypeBuilder$EntryBuilder attenuationDistance(int var1);

    public static SoundTypeBuilder$EntryBuilder ofEvent(class04891 class048912) {
        return SoundTypeBuilderImpl.EntryBuilderImpl.ofEvent((class04891)class048912);
    }

    public static SoundTypeBuilder$EntryBuilder ofEvent(class03556<class04891> class035562) {
        return SoundTypeBuilderImpl.EntryBuilderImpl.ofEvent(class035562);
    }

    public SoundTypeBuilder$EntryBuilder preload(boolean var1);
}

