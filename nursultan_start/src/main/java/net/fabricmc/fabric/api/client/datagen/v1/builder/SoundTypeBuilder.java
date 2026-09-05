/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class07536
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.datagen.v1.builder;

import java.util.Objects;
import minecraft.class01894;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class07536;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder$EntryBuilder;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface SoundTypeBuilder {
    public SoundTypeBuilder replace(boolean var1);

    public static SoundTypeBuilder of(class04891 class048912) {
        Objects.requireNonNull(class048912, "Sound event cannot be null.");
        return SoundTypeBuilder.of().subtitle(class07536.N((String)"subtitles", (class01894)class048912.N()));
    }

    public static SoundTypeBuilder of() {
        return new SoundTypeBuilderImpl();
    }

    @Deprecated(forRemoval=true)
    default public SoundTypeBuilder category(class04911 class049112) {
        return this;
    }

    public SoundTypeBuilder subtitle(@Nullable String var1);

    public SoundTypeBuilder sound(SoundTypeBuilder$EntryBuilder var1);

    public SoundTypeBuilder sound(SoundTypeBuilder$EntryBuilder var1, int var2);
}

