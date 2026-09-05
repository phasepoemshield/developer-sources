/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class01543
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package net.fabricmc.fabric.mixin.command;

import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import minecraft.class01543;
import org.spongepowered.asm.mixin.gen.Accessor;

public interface HelpCommandAccessor {
    @Accessor(value="field_13665")
    public static SimpleCommandExceptionType getFailedException() {
        return class01543.N;
    }
}

