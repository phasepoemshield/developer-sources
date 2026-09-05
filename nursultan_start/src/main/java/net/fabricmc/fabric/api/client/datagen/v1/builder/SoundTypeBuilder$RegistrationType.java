/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.datagen.v1.builder;

import com.mojang.serialization.Codec;
import minecraft.class05033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public enum SoundTypeBuilder$RegistrationType implements class05033
{
    FILE("file"),
    SOUND_EVENT("event");

    public static final Codec<SoundTypeBuilder$RegistrationType> CODEC;
    private final String name;

    private SoundTypeBuilder$RegistrationType(String string2) {
        this.name = string2;
    }

    static {
        CODEC = class05033.N(SoundTypeBuilder$RegistrationType::values);
    }

    public String method_15434() {
        return this.name;
    }
}

