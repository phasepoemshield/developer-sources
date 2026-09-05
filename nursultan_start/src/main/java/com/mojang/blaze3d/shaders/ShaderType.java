/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03069
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.shaders;

import minecraft.class01894;
import minecraft.class03069;
import org.jspecify.annotations.Nullable;

public enum ShaderType {
    VERTEX("vertex", ".vsh"),
    FRAGMENT("fragment", ".fsh");

    private static final ShaderType[] TYPES;
    private final String name;
    private final String extension;

    private ShaderType(String string2, String string3) {
        this.name = string2;
        this.extension = string3;
    }

    public String getName() {
        return this.name;
    }

    public class03069 idConverter() {
        return new class03069("shaders", this.extension);
    }

    public static @Nullable ShaderType byLocation(class01894 class018942) {
        for (ShaderType shaderType : TYPES) {
            if (!class018942.N().endsWith(shaderType.extension)) continue;
            return shaderType;
        }
        return null;
    }

    static {
        TYPES = ShaderType.values();
    }
}

