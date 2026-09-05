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
 */
package net.fabricmc.fabric.api.client.datagen.v1.provider;

import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class05946;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface FabricSoundsProvider$SoundExporter {
    public void add(class01894 var1, SoundTypeBuilder var2);

    default public void add(class03556<class04891> class035562, SoundTypeBuilder soundTypeBuilder) {
        this.add(((class05946)class035562.i().orElseThrow(() -> new IllegalArgumentException("Direct (non-registered) sound event cannot be added"))).N(), soundTypeBuilder);
    }

    default public void add(class04891 class048912, SoundTypeBuilder soundTypeBuilder) {
        this.add(class048912.N(), soundTypeBuilder);
    }
}

